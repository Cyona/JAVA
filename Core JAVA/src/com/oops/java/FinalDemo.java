package com.oops.java;

public class FinalDemo extends SuperDemo  {
	
	final int z;
	void check() {
	//	z=5;
		System.out.println("welcome");
		System.out.println(z);
	}
//	final void getValue() {
//		System.out.println("java world");
//	}
	FinalDemo(){
		z=10;
	}
	public static void main(String[] args) {
		FinalDemo fd=new FinalDemo();
		fd.check();
	}

}
