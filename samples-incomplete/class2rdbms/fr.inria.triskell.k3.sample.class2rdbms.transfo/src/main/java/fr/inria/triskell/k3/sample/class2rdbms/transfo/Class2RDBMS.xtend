package fr.inria.triskell.k3.sample.class2rdbms.transfo

import RDBMSMM.Table
import ClassMM.Class
import java.util.Collection
import RDBMSMM.FKey
import RDBMSMM.RDBMSModel
import ClassMM.ClassModel
import RDBMSMM.RDBMSMMFactory

class Class2RDBMS {
	

	/** The trace of the transformation */
	public Trace<Class, Table> class2table 
	/** Set of keys of the output model */
	public Collection<FKey> fkeys
	
	def RDBMSModel transform(ClassModel inputModel ) {
		// Initialize the trace
		class2table = new Trace<Class, Table>
		class2table.create
		fkeys = emptySet
		var RDBMSModel result 
		result = RDBMSMMFactory.eINSTANCE.createRDBMSModel//new RDBMSModel
		//stdio.errorln("testError \n /n \t/t \r /rmessage")
		//stdio.writeln("simplePrompt>")
		//stdio.read("myPrompt>\\n")
		// Create tables
		 getAllClasses(inputModel).select[ c | c.is_persistent ].forEach[ c | 
		 	println("Create Table " + c.name)//stdio.writeln("Create Table " + c.name)
		 	var Table table = RDBMSMMFactory.eINSTANCE.createTable //Table.new
		 	table.name = c.name
		 	class2table.storeTrace(c, table)
		 	result.table.add(table)
		 ]
		// Create columns
		getAllClasses(inputModel).select{ c | c.is_persistent }.each{ c | 
			println(println("Create Table " + c.name) + c.name)//stdio.writeln(println("Create Table " + c.name) + c.name)
			createColumns(class2table.getTargetElem(c), c, "")
		}
		// Create fkeys
		fkeys.forEach[ it.createFKeyColumns]
		//fkeys.each{ k | k.createFKeyColumns }
	
	}
	
	
	def createColumns(Table table , Class cls , String prefix ) {
    	// add all attributes
    	getAllAttributes(cls).forEach[ att | 
       		createColumnsForAttribute(table, att, prefix)
        ]
        // add all associations
        getAllAssociation(cls).forEach[ asso | 
        	createColumnsForAssociation(table, asso, prefix)
        ]
    }
	
	operation createColumnsForAttribute(table : Table, att : Attribute, prefix : String) is do
    	// The type is primitive : create a simple column
    	stdio.writeln("Create column for attribute " + att.name + ", prefix = " + prefix)
    	if att.type.isInstanceOf(PrimitiveDataType) then 
    		var c : Column init Column.new
    		c.name := prefix + att.name
    		c.type := att.type.name
    		table.cols.add(c)
    		if att.is_primary then table.pkey.add(c) end
    	else
    		var type : Class	type ?= att.type
    		// The type is persitant
    		if isPersistentClass(type) then
    			// Create a FKey
				var fk : FKey init FKey.new
				fk.prefix := prefix + att.name
				table.fkeys.add(fk)
				fk.references := class2table.getTargetElem(getPersistentClass(type))
				fkeys.add(fk)
    		else
    			// Recusively include all attributes and asso of the non persistent table
    			createColumns(table, type, prefix + att.name)
    		end
    		
    	end
    end
    
    operation createColumnsForAssociation(table : Table, asso : Association, prefix : String) is do
    	stdio.writeln("Create column for association " + asso.name + ", prefix = " + prefix)
    	if isPersistentClass(asso.dest) then
			// Create a FKey
			var fk : FKey init FKey.new
			fk.prefix := prefix + asso.name
			table.fkeys.add(fk)
			fk.references := class2table.getTargetElem(getPersistentClass(asso.dest))
			fkeys.add(fk)
		else
			// Recusively include all attributes and asso of the non persistent table
			createColumns(table, asso.dest, prefix + asso.name)
		end
    end
	
	/**
     * return true if the class or one of its super class is persistent
     */
    operation isPersistentClass(cls : Class) : Boolean is do
    	result := getPersistentClass(cls) != void
    end
    
    /**
     * Return the top persistent class for the class given as parameter
     * or void if no pesistent class found
     */
    operation getPersistentClass(cls : Class) : Class is do
    	if cls.is_persistent then
    		result := cls
    	else if cls.parent != void then
    		result := getPersistentClass(cls.parent)
    	else
    		result := void
    	end end
    end
    
    operation getAllClasses(cmodel : ClassModel) : Class[0..*] is do
   	result := OrderedSet<Class>.new
    	cmodel.classifier.each{ c | 
    		// select only classes (not primitive types)
    		if c.getMetaClass == Class then
    			var cls : Class cls ?= c	// cast the Classifier to Class
    			result.add(cls) 
    		end
    	}
   end
   
    /**
     * Get the set of attributes of a persistent class
     */
    operation getAllAttributes(cls : Class) : Attribute[0..*] is do
    	
    	// get inherited attributes
    	if cls.parent == void then 
    		result := OrderedSet<Attribute>.new
    	else
    		result := getAllAttributes(cls.parent)
    	end
    	// add class attributes (override existing attributes)
    	cls.attrs.each{ att | 
    		// check for overiding attributes
    		var other_att : Attribute init result.detect{ a | a.name == att.name }
    		if  other_att != void then
    			result.remove(other_att)
    		end
    		result.add(att)
    	}
    	// Add attributes from the subclasses
    	result.addAll(getSubClassesAttributes(cls))
    	
    end
    
    operation getSubClassesAttributes(cls : Class) : Attribute[0..*] is do
    	var model : ClassModel model ?= cls.container
    	result := OrderedSet<Attribute>.new
    	// get all the sub-classes
    	getAllClasses(model).select{ c | c.parent == cls }.each{ c | 
    		result.addAll(c.attrs) 
    		result.addAll(getSubClassesAttributes(c))
    	}
    end
    
    /**
     * Get the set of association of a persistent class
     */
    operation getAllAssociation(cls : Class) : Association[0..*] is do
    	var model : ClassModel model ?= cls.container
    	//stdio.writeln("Model = " + cls.container.toString)
    	// get inherited attributes
    	if cls.parent == void then 
    		result := OrderedSet<Association>.new
    	else
    		result := getAllAssociation(cls.parent)
    	end
    	// add class attributes
    	model.association.select{ asso | asso.src == cls }.each{ asso | 
    		// check for overiding attributes
    		var other_att : Association init result.detect{ a | a.name == asso.name }
    		if  other_att != void then
    			result.remove(other_att)
    		end
    		result.add(asso)	
    	}
    	// Add association defined in subclasses
    	result.addAll(getSubClassesAssociation(cls))
    end
    
    operation getSubClassesAssociation(cls : Class) : Association[0..*] is do
    	var model : ClassModel model ?= cls.container
    	result := OrderedSet<Association>.new
    	// get all the sub-classes
    	getAllClasses(model).select{ c | c.parent == cls }.each{ c | 
    		result.addAll(model.association.select{ asso | asso.src == c })
    		result.addAll(getSubClassesAssociation(c))
    	}
    end

}

class Main
{
	def main() { 
        var ClassModel inputModel = loadClassModel
        var Class2RDBMS tranfo = new Class2RDBMS
        var outputModel : RDBMSModel init tranfo.transform(inputModel)
        
        var resourceSet : ResourceSet init ResourceSet.new
        //repository.registerEcoreFile("platform:/resource/org.kermeta.language.sample.class2rdbms/src/main/ecore/RDBMSMM.ecore")
        var resource : Resource init 
        	resourceSet.createResource("platform:/resource/org.kermeta.language.sample.class2rdbms/target/results/out.xmi", 
        							 					 "platform:/resource/org.kermeta.language.sample.class2rdbms/src/main/ecore/RDBMSMM.ecore")
			//resourceSet.createResource("file:/C:/Users/dvojtise/workspaces/runtimeWorkbench/language.sample.class2rdbms/src/main/models/out.xmi", 
        	//						 					 "file:/C:/Users/dvojtise/workspaces/runtimeWorkbench/language.sample.class2rdbms/metamodels/RDBMSMM.ecore")       							 					
	 	// Define a Root ...
	 	resource.getContents.add(outputModel)
	 		 	
	 	resource.save(void)
       
       
    }
    
    def ClassModel loadClassModel()  {             
   		var ResourceSet repository = new ResourceSet
   		//repository.registerEcoreFile("platform:/resource/org.kermeta.language.sample.class2rdbms/src/main/ecore/ClassMM.ecore")             
   		var Resource resource = repository.createResource("platform:/resource/org.kermeta.language.sample.class2rdbms/src/main/models/ClassModel.xmi",
   																									"platform:/resource/org.kermeta.language.sample.class2rdbms/src/main/ecore/ClassMM.ecore")
   		//var resource : Resource init repository.createResource("file:/C:/Users/dvojtise/workspaces/runtimeWorkbench/language.sample.class2rdbms/src/main/models/ClassModel.xmi",
   		//																							"file:/C:/Users/dvojtise/workspaces/runtimeWorkbench/language.sample.class2rdbms/metamodels/ClassMM.ecore")
       	resource.load(null)      
       result = null // return void if nothing found
       from var it : Iterator<Object> init resource.getContents.iterator
       until it.isOff
       loop
           var next : Object init it.next
           if (next.isInstanceOf(ClassModel)) then                 
           		result ?= next
           end
       end
       stdio.writeln("loadClassModel returns "+result.toString)
   }
   
}
}

