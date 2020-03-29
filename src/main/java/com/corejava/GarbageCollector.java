package com.corejava;
 class A{
int i;
	public A(int i) {
		this.i=i;
	}
	protected void finalize()throws Throwable {
		System.out.println("value of i= " +i);
		super.finalize();
	}
}

public class GarbageCollector {
public static void main(String[] args) {
	A a1=new A(10);
	A a2=new A(20);
	try {
		a2.finalize();
	}
	catch(Throwable e) {
		e.printStackTrace();
	}
	a1=a2;
//ystem.gc();
	System.out.println("done");
}	

}
