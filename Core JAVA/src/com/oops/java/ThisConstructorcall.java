package com.oops.java;

public class ThisConstructorcall {
	//invoke current class constructor

	ThisConstructorcall(){
		System.out.println("default constructor");
	}
	ThisConstructorcall(int x){
		this(); //calling default constructor from parameterized constructor
		System.out.println("Parameterized constructor");
	}
	public static void main(String[] args) {
		
		ThisConstructorcall tcc=new ThisConstructorcall(10);
		
	}

}
