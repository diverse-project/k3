package lego

import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import robot.RobotPackage
import robot.robot.ProgramUnit

import static extension lego.ProgramUnitAspect.*

public class Main {
	def static void main(String... args) {
		val program = load("src/resources/Program1.xmi")
		val ctx = new ContextNCX
		val code = program.generateCode(ctx)
		var Path newFile = Paths.get("./Program1.nxc")
		Files.deleteIfExists(newFile)
		newFile = Files.createFile(newFile)
		val buffer = Files.newBufferedWriter(newFile, Charset.defaultCharset)
		buffer.append(ctx.header).append('\n').append(code)
		buffer.flush
		try { buffer.close }catch(IOException ex) { ex.printStackTrace }
	}
	
	def static ProgramUnit load(String path) {
		val rs = new ResourceSetImpl
		// init the required package
		RobotPackage.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val res = rs.getResource(URI.createURI(path), true)
		res.load(Collections.emptyMap)
		res.contents.filter(ProgramUnit).head
	}
}