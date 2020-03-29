package com.corejava;

public class ReverseString {
  
	public static void main(String[] args) {
		String str="java is a programming language";
		/*
		 * StringBuffer sb=new StringBuffer(str); System.out.println(sb.reverse());
		 */
		/*
		 * String reverse=" "; for(int i=str.length()-1;i>=0;i--) {
		 * reverse=reverse+str.charAt(i) ; } System.out.println(reverse);
		 *//*// recursive method
			 * System.out.println(recursiveMethod(str)); } static String
			 * recursiveMethod(String str) { if((str==null)|| str.length()<=1) { return str;
			 * } return recursiveMethod(str.substring(1))+str.charAt(0);
			 */
		/// logic for remove spaces
		
		System.out.println("input string :" +str);
		String without=str.replaceAll("\\s","");
		System.out.println(" without spaces :"+without);
		
}
}
