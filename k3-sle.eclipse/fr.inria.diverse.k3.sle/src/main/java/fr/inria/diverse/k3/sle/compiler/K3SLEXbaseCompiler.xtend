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

/**
 * // TODO: All casts, instanceof, etc.
 */
class K3SLEXbaseCompiler extends XbaseCompiler
{
	@Inject extension IQualifiedNameProvider
	@Inject K3SLETypesRegistry typesRegistry
	
	override appendArgument(XExpression argument, ITreeAppendable b, boolean doLineWrappingIfSourceWasWrapped) {
		val referenceName = getReferenceName(argument, b)
		val type = getLightweightType(argument)
		val expectedType = getLightweightExpectedType(argument)

		val needsNewLine = doLineWrappingIfSourceWasWrapped && referenceName === null && isDeclaredInNewLine(argument)
		if (needsNewLine) {
			b.increaseIndentation()
			b.newLine()
		}
		if (referenceName === null && isVariableDeclarationRequired(argument, b)) {
			compileAsJavaExpression(argument, b, getLightweightExpectedType(argument) ?: getLightweightType(argument))
		} else {
			internalToJavaExpression(argument, b)
		}
		
		if (expectedType.isSubtypeOf(IModelType)) {
			if (type.isSubtypeOf(IMetamodel)) { // implements
				val find = typesRegistry.getImplementations(type.identifier).findFirst[fullyQualifiedName.toString == expectedType.identifier]

				if (find !== null) {
					b.append('''.to«find.name»()''')
				}
			}
			else if (type.isSubtypeOf(IModelType)) { // subtypeOf
				val find = typesRegistry.getImplementations(type.identifier).findFirst[fullyQualifiedName.toString == expectedType.identifier]

				if (find !== null) {
					b.append('''.doSomeObscurStuffHere()''')
				}
			}
		}
		
		if (needsNewLine) {
			b.decreaseIndentation()
		}
	}
	
	override _toJavaExpression(XCastedExpression expr, ITreeAppendable b) {
		val type = getLightweightType(expr.target)
		val expectedType = getLightweightType(expr)

		if (expectedType.isSubtypeOf(IModelType)) {
			if (type.isSubtypeOf(IMetamodel)) { // implements
				val find = typesRegistry.getImplementations(type.identifier).findFirst[fullyQualifiedName == expectedType.identifier]
				
				if (find !== null) {
					internalToConvertedExpression(expr.target, b, expectedType)
					b.append('''.to«find.name»()''')
				}
			}
			else if (type.isSubtypeOf(IModelType)) { // subtypeOf
				val find = typesRegistry.getImplementations(type.identifier).findFirst[fullyQualifiedName == expectedType.identifier]
				
				if (find !== null) {
					internalToConvertedExpression(expr.target, b, expectedType)
					b.append('''.doSomeObscurStuffHere()''')
				}
			}
		} else {
			super._toJavaExpression(expr, b)
		}
	}
}
