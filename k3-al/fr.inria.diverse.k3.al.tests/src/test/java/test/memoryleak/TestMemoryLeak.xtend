package test.memoryleak


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.junit.Test

import static org.junit.Assert.*

import static extension test.memoryleak.AspectMemLeakB.*
import java.util.ArrayList

class TestMemoryLeak {
	
	@Test
	def void testNoAspectMemoryLeak() {
		// simply test that the way we count the memory is ok if we don't have  
		val memTester = new TestMemoryLeak		
		System.gc()	
		// do a first call, for reference, actually the weakHahsMap will get its definitive size, after this
		memTester.testBaseMemoryLeakIntenal()
		memTester.printUsedMemory("[B BEGIN]")
		
		memTester.testBaseMemoryLeakIntenal()
		val long referenceUsedMemory = toMB(memTester.printUsedMemory("[B REFERENCE]")) 
		var long usedMemory = referenceUsedMemory
		for(i : 1.. 10){ 
			memTester.testBaseMemoryLeakIntenal()
			usedMemory=toMB(memTester.printUsedMemory("[B INTERMEDIATE]"))
			assertEquals("Used memory isn't the same as reference memory (in MB)", referenceUsedMemory, usedMemory)
		}
		memTester.testBaseMemoryLeakIntenal()
		usedMemory=toMB(memTester.printUsedMemory("[B END]"))
		assertEquals("Used memory isn't the same as reference memory (in MB)", referenceUsedMemory, usedMemory)
	} 
	
	def void testBaseMemoryLeakIntenal() {			
		// build a bunch of objects
		val listObjects = newArrayList()
		for( i : 1..1000000){
			listObjects.add(new MemLeakB)
		}
		// compute used memory for based objects
    	printUsedMemory("[B BASE populated]")
		
		// remove hard references		
		listObjects.clear
		
		
		// compute remaining used memory
    	printUsedMemory("[B list cleared]")
		assertTrue(true)
	}
	
	@Test
	def void testAspectPropertiesMemoryLeak() {
		val memTester = new TestMemoryLeak
		// ask garbage collect, this isn't garanteed but this helps
		System.gc()
		Thread.sleep(500)
		// do a first call, for reference, actually the weakHahsMap will get its definitive size, after this
		memTester.testBaseMemoryLeakIntenal()
		memTester.printUsedMemory("[BEGIN]")
		
		memTester.testAspectPropertiesMemoryLeakIntenal()
		val long referenceUsedMemory = toMB(memTester.printUsedMemory("[REFERENCE]")) 
		var long usedMemory = referenceUsedMemory
		for(i : 1.. 10){ 
			memTester.testAspectPropertiesMemoryLeakIntenal()
			usedMemory=toMB(memTester.printUsedMemory("[INTERMEDIATE]"))
			assertEquals("Used memory isn't the same as reference memory (in MB)", referenceUsedMemory, usedMemory)
		}
		memTester.testAspectPropertiesMemoryLeakIntenal()
		usedMemory=toMB(memTester.printUsedMemory("[END]"))
		assertEquals("Used memory isn't the same as reference memory (in MB)", referenceUsedMemory, usedMemory)
	} 
	
	def void testAspectPropertiesMemoryLeakIntenal() {			
		// build a bunch of objects
		val listObjects = new ArrayList()
		for( i : 1..1000000){
			listObjects.add(new MemLeakB)
		}
		// compute used memory for based objects
    	printUsedMemory("[BASE populated]")
		
		// aspectized the objects
		for(obj : listObjects){
			val String fooVal = obj.foo
			assertEquals(fooVal, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")
		} 
		// compute used memory for based objects + aspect properties
    	printUsedMemory("[ASPECT populated]")
		// remove hard references		
		listObjects.clear
		
		
		// compute remaining used memory
    	printUsedMemory("[list cleared]")
    	
    	// calling someting on the map will help decrease it size by calling the GC on it.
    	// but not completly, because the internal array will not shrink back to the initial size
    	println("map size ="+AspectMemLeakBMemLeakBAspectContext.INSTANCE.map.size)
    	// compute remaining used memory
    	printUsedMemory("[list cleared + accessed]")
	}
	
	private static final long MEGABYTE = 1024L * 1024L
	
	def static long toMB(long bytes){
		return bytes / MEGABYTE;
	}
	
	public def long printUsedMemory(String msg){
		// ask garbage collect, this isn't garanteed but this helps
		System.gc()
		Thread.sleep(150)
		
		val Runtime rt = Runtime.getRuntime();
		val long memory = rt.totalMemory() - rt.freeMemory();
		println("memory usage : " + toMB(memory)+" MB ("+memory+" bytes) \t\t"+msg)
		return memory
	}
}
 
class MemLeakB  {
	public String someDataAssociatedToB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	
	public long id
	
	new (){
		id = System.currentTimeMillis
	}
}  
  
 

@Aspect(className=typeof(MemLeakB))
class AspectMemLeakB  {
	
	String someDataAssociatedToAspectB = "abcdefghijklmnopqrstuvwxyz"
 
 
 
	public def String foo() {
		return _self.someDataAssociatedToAspectB + _self.someDataAssociatedToB
	}


}





