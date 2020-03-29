package com.corejava;

import java.util.Scanner;

public class Test2 {

	private static void run(String input) {
		System.out.println("all possible strings " +input+ " are ");
		/*
		 * for(int i=0;i<input.length();i++) { for(int j=i+1;j<=input.length();j++) {
		 * System.out.println(input.substring(i,j)); } }
		 */
		StringBuilder subString;
		for(int i=0;i<input.length();i++) {
			subString=new StringBuilder().append(input.charAt(i));
			System.out.println(subString);
		
		for(int j=i+1;j<input.length();j++) {
			subString.append(input.charAt(j));
			System.out.println(subString);
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String input=sc.next();
		run(input);
		sc.close();
	}
}
