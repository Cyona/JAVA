package com.oops.java;

public class ThisArguementinMethod {
	
	//to pass an arguement in the method

	void check(ThisArguementinMethod ob) {
		System.out.println("Method is invoked");
	}
	void display() {
		check(this);
	}
	public static void main(String[] args) {
		ThisArguementinMethod obj=new ThisArguementinMethod();
		obj.display();
		
	}

}
