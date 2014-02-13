package org.k3.language.ui.tools;

import java.util.ArrayList;
import java.util.List;

public class ToolsString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String elt = "org.essai.test";
		List<String> test = new ToolsString().generateListPackage(elt, (byte)46);
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
		// TODO Auto-generated method stub
		
	}
	
	public List<String> generateListPackage(String elt, byte separator) {
		
		List<String> list = new ArrayList<String>();
		byte[] bytes = elt.getBytes();
		byte[] temp = new byte[bytes.length];
		int iGap = 0;
		
		for (int i = 0; i < bytes.length ; i++) {
			if (bytes[i] == separator) {
				
				list.add(BytesToString(temp));
				temp = new byte[bytes.length];
				iGap = i;
			} else {
				temp[i - iGap] = bytes[i];
			}
		}
		// Last element
		list.add(BytesToString(temp));
		
		return list;
	}
	
	public String BytesToString(byte[] tab) {
		String elt = "";
		int i =0;
		
		while (tab[i] == 0)
			i++;
		
		while (tab[i] != 0) {
			elt = elt + (char)tab[i];
			i++;
		}
		
		return elt;
	}

}
