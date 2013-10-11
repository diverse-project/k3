package fr.inria.diverse.k3.sample.cellularautomata.visualize.asciiart

import vm.Universe

public class SimpleAsciiArt2DVisualizer {

	public Boolean useEmptyCellForZero
	
	
	def public SimpleAsciiArt2DVisualizer initialize(Boolean useEmptyCellForZero) {
		this.useEmptyCellForZero = useEmptyCellForZero
		return this
	}

	def public visualizeRegular2DUniverse(Integer worldSize, Universe grid) {
		for (i : 0 ..< worldSize) {
			printRow(i, worldSize, grid)
		}
		printLine(worldSize)
	}
	
	def public printLine(Integer worldSize) {
		var StringBuffer buf = new StringBuffer
		for (i : 0 ..< worldSize) {
			buf.append("----")
		}
		buf.append("-")
		println(buf.toString)
	}
	
	def public printRow(Integer row,Integer worldSize, Universe grid) {
		printLine(worldSize)
		var StringBuffer buf = new StringBuffer
		
		buf.append("| ")
		for (i : 0 ..< worldSize) {
			var Integer cellVal = grid.cells.get(row*worldSize + i).^val
			if (!useEmptyCellForZero || cellVal != 0) {
				buf.append(cellVal.toString)
			} else {
				buf.append(" ")
			}
			buf.append(" | ")
		}
		println(buf.toString)
	}
}