package com.oops.java;

public class ParameterizedConstructorDemo {
	int rollno;
	String name;
	
	ParameterizedConstructorDemo(int r,String n){
		rollno=r;
		name=n;
		
		
	}
	void display() {
		System.out.println("Roll number is :"+rollno+ "  Name is : " +name);
	}
	public static void main(String[] args) {
		ParameterizedConstructorDemo pc=new ParameterizedConstructorDemo(24,"cyo");
		pc.display();
		
	}

}
