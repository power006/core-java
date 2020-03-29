package com.corejava;


 public class MySingleTon{
	private static MySingleTon myObj=null;
	 
	private MySingleTon() {
		
	}

public static MySingleTon getInstance() {
	

	if(myObj==null) {
		
	myObj=new MySingleTon();
	}
	return myObj;
}
	public void run() {
		System.out.println("we will with PK ");
	
	}
public static void main(String[] args) {
	MySingleTon s=MySingleTon.getInstance();
	s.run();
}
}
