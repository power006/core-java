package com.corejava;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesInString {

	static void allDuplicates(String inputString) {
		HashMap<Character,Integer>  charCountMap=new HashMap<Character, Integer>();
		char[] strArray=inputString.toCharArray();
		for(char c:strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c,charCountMap.get(c)+1);
			}
			else {
				charCountMap.put(c,1);
				
			}
		}
	
	Set<Character> s=charCountMap.keySet();
	for(char ch:s) {
		System.out.println(ch +  "  duplicates are  "+charCountMap.get(ch));
	}
	
	}
	public static void main(String args[]) {
		allDuplicates("java");
	}
}
