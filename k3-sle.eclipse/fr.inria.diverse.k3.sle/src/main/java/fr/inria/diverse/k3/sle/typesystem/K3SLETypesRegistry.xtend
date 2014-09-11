package fr.inria.diverse.k3.sle.typesystem

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap

import com.google.inject.Singleton

import java.util.Collection
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

@Singleton
class K3SLETypesRegistry
{
	/**
	 * <MM, MT> <=> MM implements MT
	 */
	Multimap<String, ModelType> implementationRelations = ArrayListMultimap.create
	
	/**
	 * <MT, MT'> <=> MT subtypeOf MT'
	 */
	Multimap<String, ModelType> subtypingRelations = ArrayListMultimap.create

	def void registerImplementation(String mm, ModelType mt) {
		if (!implementationRelations.containsEntry(mm, mt))
			implementationRelations.put(mm, mt)
	}
	
	def void registerSubtyping(String subType, ModelType superType) {
		if (!subtypingRelations.containsEntry(subType, superType))
			subtypingRelations.put(subType, superType)
	}

	def Collection<ModelType> getImplementations(String mmFqn) {
		return implementationRelations.get(mmFqn)
	}

	def Collection<ModelType> getSubtypings(String mtFqn) {
		return subtypingRelations.get(mtFqn)
	}
}
