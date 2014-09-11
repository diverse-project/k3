package fr.inria.diverse.k3.sle.lib

import java.util.List

import java.io.IOException
import org.eclipse.emf.ecore.resource.Resource

interface IFactory
{}

interface IModelType
{
	def List<Object> getContents()
	def IFactory getFactory()
	def void save(String uri) throws IOException
}

interface IMetamodel
{
	def Resource getResource()
	def void setResource(Resource res)
}

class ModelTypeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
