package fr.inria.triskell.k3.sample.class2rdbms.transfo

import java.util.Hashtable

/**
 * This class represents the trace of a transfo
 */
class Trace<SRC, TGT>
{
	/**
	 * Mapping between source and target objects
	 */
	Hashtable<SRC, TGT> src2tgt 
	
	def void create() {
		src2tgt = new Hashtable<SRC, TGT>()
	}
	   
	/**
	 * get a target element
	 */
	 def TGT getTargetElem(SRC src)  {
		return src2tgt.get(src)
	}
	 
	/**
	 * Store a trace
	 */
	 def void storeTrace(SRC src, TGT tgt) {
	 	src2tgt.put(src, tgt)
	 }
}

class BidirectionalTrace<SRC, TGT> extends Trace<SRC, TGT>
{
	/**
	 * Mapping between source and target objects
	 */
	Hashtable<TGT, SRC> tgt2src 
	
	override void create() {
		super.create
		//var Hashtable< TGT2, SRC2> tgt2src2 
		tgt2src = new Hashtable<TGT, SRC>()
	}
	 
	/**
	 * Store a trace
	 */
 	override void storeTrace(SRC src, TGT tgt) {
		super.storeTrace(src, tgt)
		
		getTargetElem(src)   
		//var Hashtable< TGT, SRC> tgt2src3 
	 	tgt2src.put(tgt, src)
	}
	
	/**
	 * get a source element
	 */
 	def SRC getSourceElem(TGT tgt) {
		return tgt2src.get(tgt)
	}
}
