package com.oops.java;

public class SuperVarDemos extends SuperDemo {

	int x=20;
	void displayval() {
		System.out.println(x);
		System.out.println(super.x);
	}
	public static void main(String[] args) {

		SuperVarDemos svd=new SuperVarDemos();
		svd.displayval();
		
	}

}
