package fr.inria.diverse.k3.ui.tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;

public class ManifestChanger {
	protected Manifest manifest;

	
	public ManifestChanger(){
	}
	public ManifestChanger(InputStream inputStream) throws IOException, CoreException{
		loadManifest(inputStream);
	}
	public ManifestChanger(IFile loadedFile) throws IOException, CoreException{
		loadManifest(loadedFile.getContents());
	}
	
	public void addPluginDependency(String plugin, String version,
			boolean reexport, boolean overwrite) throws BundleException {
		final String requireBundleHeader = "Require-Bundle";
		final String bundleVersionAttr = "bundle-version";
		final String rexportDirective = "visibility";

		assert (manifest != null);
		assert (plugin != null);
		if (plugin == null)
			return;
		if (version == null) {
			version = "1.0.0";
		}

		boolean foundHeader = false;
		boolean hasValuesForPlugin = false;
		StringBuilder strBuilder = new StringBuilder();

		Attributes mainAttrs = manifest.getMainAttributes();
		for (Object entryName : mainAttrs.keySet()) {
			String values;
			String header;

			// Get the values safely
			if (entryName instanceof String) {
				header = (String) entryName;
				values = mainAttrs.getValue(header);
			} else if (entryName instanceof Attributes.Name) {
				header = (String) ((Attributes.Name) entryName).toString();
				values = mainAttrs.getValue((Attributes.Name) entryName);
			} else {
				throw new BundleException("Unknown Main Attribute Key type: "
						+ entryName.getClass() + " (" + entryName + ")");
			}

			// loop to the next header if we don't find ours
			if (!requireBundleHeader.equals(header))
				continue;

			// found it
			foundHeader = true;

			// process the components of the value for this element see
			// ManifestElement javadocs for spec
			if (values != null) {
				ManifestElement[] elements = ManifestElement.parseHeader(
						header, values);
				for (int i = 0; i < elements.length; i++) {
					ManifestElement manifestElement = elements[i];
					Enumeration<?> keys = manifestElement.getKeys();
					Enumeration<?> directiveKeys = manifestElement
							.getDirectiveKeys();
					StringBuilder valueComponents = new StringBuilder();
					boolean lastElement = i >= elements.length - 1;
					boolean firstElement = i == 0;
					boolean elementIsRequiredPlugin = false;

					for (int j = 0; j < manifestElement.getValueComponents().length; j++) {
						String pureValue = manifestElement.getValueComponents()[j];
						if (plugin.equalsIgnoreCase(pureValue)) {
							hasValuesForPlugin = true;
							elementIsRequiredPlugin = true;
							// if its already in the header element components
							// and we are not overwriting quit now
							if (!overwrite)
								return;
						}
						// ALWAYS WRITE THE LAST ; -> if we don't have any keys
						// or directives now - we will have
						// if this is not the required element we will just
						// write the line in one go using
						// manifestElement.getValue()
						valueComponents.append(pureValue + ";");
					}

					if (!elementIsRequiredPlugin) {
						// we haven't got a component THIS TIME which is equal
						// to the component we are looking to change
						// so just write out the whole of this component without
						// editing it, and carry on looking
						strBuilder.append((firstElement ? "" : " ")
								+ manifestElement
								+ (lastElement ? "" : ",\n"));
						continue;
					} else {
						// write out the value components found so far - we may
						// wish to edit bits of it
						strBuilder.append((firstElement ? "" : " ")
								+ valueComponents);
					}
					boolean foundVersionAttr = false;
					if (keys != null) {
						while (keys.hasMoreElements()) {
							String key = (String) keys.nextElement();
							String value = manifestElement.getAttribute(key);
							if (bundleVersionAttr.equalsIgnoreCase(key)) {
								// always write the last ; if we are editing the
								// values - we will be writing the export
								// directive
								strBuilder
										.append(key + "=\"" + version + "\";");
								foundVersionAttr = true;
							} else {
								// always write the last ; if we are editing the
								// values - we will be writing the export
								// directive
								strBuilder.append(key + "=\"" + value + "\";");
							}
						}
					}
					if (!foundVersionAttr) {
						// always write the last ; if we are editing the values
						// - we will be writing the export directive
						strBuilder.append(bundleVersionAttr + "=" + version
								+ ";");
					}
					boolean foundDirective = false;
					if (directiveKeys != null) {
						while (directiveKeys.hasMoreElements()) {
							String key = (String) directiveKeys.nextElement();
							boolean lastDirective = !directiveKeys
									.hasMoreElements();
							if (rexportDirective.equalsIgnoreCase(key)) {
								foundDirective = true;
								strBuilder.append(key + ":=");
								String dirValues[] = manifestElement
										.getDirectives(key);
								for (int j = 0; j < dirValues.length; j++) {
									String string = dirValues[j];
									boolean lastDirectiveValue = j >= dirValues.length - 1;
									if ("reexport".equalsIgnoreCase(string)
											&& !reexport) {
										string = "private";
									} else if ("private"
											.equalsIgnoreCase(string)
											&& reexport) {
										string = "reexport";
									}
									strBuilder.append(string
											+ (lastDirectiveValue ? "" : ","));
								}
							} else {
								strBuilder.append(key + ":="
										+ manifestElement.getDirective(key));
							}
							if (!lastDirective) {
								strBuilder.append(";");
							}
						}
					}
					if (!foundDirective) {
						strBuilder.append(rexportDirective + ":="
								+ (reexport ? "reexport" : "private"));
					}
					if (!lastElement) {
						strBuilder.append(",\n");
					}
				}
			}
			break;
		}
		if (!foundHeader) {
			// Add a new one
			manifest.getMainAttributes().putValue(
					requireBundleHeader,
					plugin + ";" + bundleVersionAttr + "=" + version + ";"
							+ rexportDirective + ":="
							+ (reexport ? "reexport" : "private"));
		} else if (overwrite) {
			// found it and wish to edit it...
			if (hasValuesForPlugin) {
				// we have already edited the values for the plugin we wish to
				// add
				manifest.getMainAttributes().putValue(requireBundleHeader,
						strBuilder.toString());
			} else {
				// There are no values for the plugin we wish to add.
				// ...create a fresh entry
				String existingValues = strBuilder.toString();
				boolean areExistingValues = existingValues.trim().length() != 0;
				String newValue = plugin + ";" + bundleVersionAttr + "="
						+ version + ";" + rexportDirective + ":="
						+ (reexport ? "reexport" : "private");
				newValue = (areExistingValues) ? (existingValues + ",\n " + newValue)
						: newValue;
				manifest.getMainAttributes().putValue(requireBundleHeader,
						newValue);
			}
		}
	}

	public void addSingleton() throws BundleException{
		final String bundleSymbolicNameHeader = "Bundle-SymbolicName";
		Attributes mainAttrs = manifest.getMainAttributes();
		String value = null;
		for (Object entryName : mainAttrs.keySet()) {
			String header;

			// Get the values safely
			if (entryName instanceof String) {
				header = (String) entryName;
				value = mainAttrs.getValue(header);
			} else if (entryName instanceof Attributes.Name) {
				header = (String) ((Attributes.Name) entryName).toString();
				value = mainAttrs.getValue((Attributes.Name) entryName);
			} else {
				throw new BundleException("Unknown Main Attribute Key type: "
						+ entryName.getClass() + " (" + entryName + ")");
			}

			// loop to the next header if we don't find ours
			if (bundleSymbolicNameHeader.equals(header)){
				break;
			}
		}
		if(value != null && !value.endsWith( ";singleton:=true")){
			// doesn't exist or already have it, so do not try to add the singleton ...
			manifest.getMainAttributes().putValue(bundleSymbolicNameHeader,
					value + ";singleton:=true");
		}
	}
	
	public void addAttributes(String attributeName, String value){
		manifest.getMainAttributes().putValue(attributeName, value);
	}
	public static void main(String[] args) throws Exception {
		try {
			String fileName = "C:\\Documents and Settings\\Administrator.ARDEN\\branchWorkspace\\org.jvnet.jaxbw.eclipse\\testData\\Manifest.mf";
			ManifestChanger manifestChanger = new ManifestChanger();
			FileInputStream in = new FileInputStream(fileName);
			manifestChanger.loadManifest(in);
			in.close();
			manifestChanger.addPluginDependency("MyPlugin", "1.5.0", false,
					true);
			FileOutputStream out = new FileOutputStream(fileName);
			manifestChanger.writeManifest(out);
			out.close();
		} catch (Throwable t) {
			System.err.println("Unexpected Exception: " + t);
			t.printStackTrace();
		}
	}

	public void writeManifest(OutputStream out) throws IOException {
		manifest.write(out);
	}
	public void writeManifest(IFile outputFile) throws IOException, CoreException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		writeManifest(out);
		outputFile.setContents(new ByteArrayInputStream(out.toByteArray()), 1, new NullProgressMonitor());
	}

	public void loadManifest(InputStream in) throws IOException {
		 manifest =  new Manifest(in);
	}

	public Manifest getManifest() {
		return manifest;
	}

	public void setManifest(Manifest manifest) {
		this.manifest = manifest;
	}
	
}
