package fr.inria.diverse.k3.sle.compiler

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.lib.IMetamodel
import fr.inria.diverse.k3.sle.lib.IModelType

import fr.inria.diverse.k3.sle.typesystem.K3SLETypesRegistry

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.xbase.XCastedExpression
import org.eclipse.xtext.xbase.XExpression

import org.eclipse.xtext.xbase.compiler.XbaseCompiler

import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

class ModelOrientedXbaseCompiler extends XbaseCompiler
{
	@Inject extension IQualifiedNameProvider
	@Inject K3SLETypesRegistry typesRegistry

	/**
	 * Whenever we can't find a match between expected and returned modeltypes,
	 * let's see if we have an adapter for that purpose
	 */
	override internalToConvertedExpression(XExpression expr, ITreeAppendable appendable) {
		super.internalToConvertedExpression(expr, appendable)
		val expected = getLightweightExpectedType(expr)
		val returned = getLightweightReturnType(expr)

		if (
			   expected !== null && returned !== null
			&& expected.identifier != returned.identifier
			&& expected.isSubtypeOf(IModelType)
		) {
			if (returned.isSubtypeOf(IMetamodel)) { // implements
				val match =
					typesRegistry.getImplementations(returned.identifier)
					.findFirst[fullyQualifiedName.toString == expected.identifier]

				if (match !== null) {
					appendable.append('''.to«match.name»()''')
				}
			}
			else if (returned.isSubtypeOf(IModelType)) { // subtypeOf
				val match =
					typesRegistry.getSubtypings(returned.identifier)
					.findFirst[fullyQualifiedName.toString == expected.identifier]

				if (match !== null) {
					appendable.append('''.toWhateverWeNeed()''')
				}
			}
		}
	}

	/**
	 * If the cast operation involves metamodels and modeltypes,
	 * let's use the appropriate adapters
	 */
	override _toJavaExpression(XCastedExpression expr, ITreeAppendable b) {
		val type = getLightweightType(expr.target)
		val expectedType = getLightweightType(expr)

		if (
			   expectedType.isSubtypeOf(IModelType)
			&& type.isSubtypeOf(IMetamodel)
			&& typesRegistry.getImplementations(type.identifier).exists[fullyQualifiedName.toString == expectedType.identifier]
		) { // implements
			val match = typesRegistry.getImplementations(type.identifier).findFirst[fullyQualifiedName.toString == expectedType.identifier]
			internalToConvertedExpression(expr.target, b, expectedType)
			b.append('''.to«match.name»()''')
		}
		else if (
			   expectedType.isSubtypeOf(IModelType)
			&& type.isSubtypeOf(IModelType)
			&& typesRegistry.getSubtypings(type.identifier).exists[fullyQualifiedName.toString == expectedType.identifier]
		) { // subtypeOf
				val match = typesRegistry.getSubtypings(type.identifier).exists[fullyQualifiedName.toString == expectedType.identifier]

				internalToConvertedExpression(expr.target, b, expectedType)
				b.append('''.doSomeObscurStuffHere()''')
		}
		else {
			super._toJavaExpression(expr, b)
		}
	}
}
