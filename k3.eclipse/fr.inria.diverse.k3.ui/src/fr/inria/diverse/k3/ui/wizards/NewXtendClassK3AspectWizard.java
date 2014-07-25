package fr.inria.diverse.k3.ui.wizards;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.xtend.ide.wizards.AbstractNewXtendElementWizard;
import org.eclipse.xtext.ui.IImageHelper.IImageDescriptorHelper;

import com.google.inject.Inject;

import fr.inria.diverse.k3.ui.Activator;

/**
 * @author Robert von Massow - Initial contribution and API
 * @author Holger Schill
 */
public class NewXtendClassK3AspectWizard extends AbstractNewXtendElementWizard {

	public static final String TITLE = "K3 Aspect - Xtend Class"; //$NON-NLS-1$

	@Inject
	public NewXtendClassK3AspectWizard(IImageDescriptorHelper imgHelper, NewXtendClassK3AspectWizardPage page) {
		super(imgHelper, page, TITLE);
		ImageDescriptor image = Activator.getImageDescriptor("icons/xtend_k3_aspect_wizard_big.png");
		setDefaultPageImageDescriptor(image);
	}
	
	
}
