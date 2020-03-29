package com.corejava;


class Shared{
	
	synchronized void sharedMethod() {
		Thread t=Thread.currentThread();
		for(int i=0;i<=1000;i++) {
			System.out.println(t.getName()+ " of i: " + i);
			
		}
	}
	
}






public class ThreadsinJava {

	public static void main(String[] args) {
		
		final Shared s1=new Shared();
		
		Thread t1=new Thread(" thread-1") {
			public void run() {
				s1.sharedMethod();
			}
		};
		Thread t2=new Thread(" thread-2") {
			public void run() {
				s1.sharedMethod();
			}
		};
		try {
		t1.start();
		t1.join();
		t2.start();
	}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
}}
