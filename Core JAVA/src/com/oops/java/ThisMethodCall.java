package com.oops.java;

public class ThisMethodCall {

	//invoke current class method
	

	void display() {
		System.out.println("Hello world");
		
	}
	void print() {
		System.out.println("welcome to java");
		this.display(); //equivalent to display()
	}
	
	public static void main(String[] args) {
		ThisMethodCall tmc=new ThisMethodCall();
		tmc.print();
	}

}
