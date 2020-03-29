 package com.corejava;

 
 class MyException extends Exception{
	  public MyException(String s) {
		// TODO Auto-generated constructor stub

			super(s);
			
		} 
 }
 
 
public class Test  {
public static void main(String[] args) {
	try {
		throw new MyException("janasena");
	}

catch(MyException ex) {
	System.out.println("leader");
	System.out.println(ex.getMessage());
}


}

}
