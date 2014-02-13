package fr.inria.diverse.k3.sample.cellularautomata.simulator

import vm.Universe
import evol.CellularAutomata
import fr.inria.diverse.k3.sample.cellularautomata.visualize.asciiart.SimpleAsciiArt2DVisualizer
import fr.inria.diverse.k3.sample.cellularautomata.simulator.Context

import static extension fr.inria.diverse.k3.sample.cellularautomata.simulator.CellularAutomataAspect.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import vm.VmPackage
import evol.EvolPackage

class Simulator {
	

		// declares that operation as a possible entry point of the program 
		def public simulateWithAsciiArt2Dvisualizer(String ruleFile, String gridFile, String universeSize) { 
			var Universe grid = loadGrid(gridFile)
			var CellularAutomata automata = loadRule(ruleFile)
			var Integer universeLength = Integer.parseInt(universeSize)
			
			var SimpleAsciiArt2DVisualizer asciiArtVisualizer = new SimpleAsciiArt2DVisualizer
			asciiArtVisualizer.initialize(false)
			asciiArtVisualizer.visualizeRegular2DUniverse(universeLength, grid)
			
			for(int i :0..3) {
				var Context context = new Context
				context.initialize (grid)
				automata.applyRules(context)
				asciiArtVisualizer.visualizeRegular2DUniverse(universeLength, grid)
			}
		}
		
		
		public def CellularAutomata loadRule(String ruleFile) {
			var fact = new XMIResourceFactoryImpl
			if (!EPackage.Registry.INSTANCE.containsKey(EvolPackage.eNS_URI)) {
				EPackage.Registry.INSTANCE.put(EvolPackage.eNS_URI, EvolPackage.eINSTANCE);
			}
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
		
			var rs = new ResourceSetImpl()
			var uri = URI.createURI(ruleFile)
			var res = rs.getResource(uri, true)
			return res.getContents.get(0) as CellularAutomata
		}
		
		public def Universe loadGrid(String gridFile) {
			var fact = new XMIResourceFactoryImpl
			if (!EPackage.Registry.INSTANCE.containsKey(VmPackage.eNS_URI)) {
				EPackage.Registry.INSTANCE.put(VmPackage.eNS_URI, VmPackage.eINSTANCE);
			}
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
		
			var rs = new ResourceSetImpl()
			var uri = URI.createURI(gridFile)
			var res = rs.getResource(uri, true)
			return res.getContents.get(0) as Universe
		}
}