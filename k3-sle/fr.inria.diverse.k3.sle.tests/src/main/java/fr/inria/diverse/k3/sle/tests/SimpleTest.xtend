package fr.inria.diverse.k3.sle.tests

import fr.inria.diverse.k3.sle.K3SLEInjectorProvider

import fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import com.google.inject.Inject

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(K3SLEInjectorProvider)
class SimpleParsingTest {

	@Inject extension ParseHelper<MegamodelRoot>
	@Inject extension ValidationTestHelper
	@Inject IGenerator generator

	MegamodelRoot root

	@Before
	def void setUp() {
		root = '''
		package foo

		metamodel A {
			ecore "tests-inputs/FSM.ecore" with genmodel "tests-inputs/FSM.genmodel"
		}

		metamodel B {
			ecore "tests-inputs/TimedFSM.ecore" with genmodel "tests-inputs/TimedFSM.genmodel"
		}

		modeltype MTA extract A {}
		modeltype MTB extract B {}

		transformation bar(MTA o) {}
		'''.parse
	}

	@Test
	def testParsing() {
		root.assertNoErrors
	}

	@Test
	def testStructure() {
		assertEquals(root.name, "foo")
		assertNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Metamodel)
		assertTrue(root.elements.get(1) instanceof Metamodel)
		assertTrue(root.elements.get(2) instanceof ModelType)
		assertTrue(root.elements.get(3) instanceof ModelType)
		assertTrue(root.elements.get(4) instanceof Transformation)

		assertEquals(a.name, "A")
		assertEquals(b.name, "B")
		assertEquals(mta.name, "MTA")
		assertEquals(mtb.name, "MTB")
		assertEquals(bar.name, "bar")
	}

	@Test
	def testRelations() {
		// No exact type ATM
		assertEquals(mta.extracted, a)
		assertEquals(mtb.extracted, b)
	}

	@Test
	def testImplements() {
		assertEquals(a.^implements.size, 1)
		assertEquals(b.^implements.size, 2)

		assertTrue(a.^implements.contains(mta))
		assertTrue(b.^implements.contains(mta))
		assertTrue(b.^implements.contains(mtb))
	}

	@Test
	def testInheritance() {
		assertNull(a.inheritanceRelation)
		assertNull(b.inheritanceRelation)
	}

	@Test
	def testSubtyping() {
		assertEquals(mta.subtypingRelations.size, 0)
		assertEquals(mtb.subtypingRelations.size, 1)
		assertEquals(mtb.subtypingRelations.head.subType, mtb)
		assertEquals(mtb.subtypingRelations.head.superType, mta)
	}

	// Just to show how we can generate code
	@Test
	def void testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.allFiles.size, 20)
	}

	def getA() { root.elements.get(0) as Metamodel }
	def getB() { root.elements.get(1) as Metamodel }
	def getMta() { root.elements.get(2) as ModelType }
	def getMtb() { root.elements.get(3) as ModelType }
	def getBar() { root.elements.get(4) as Transformation }
}
