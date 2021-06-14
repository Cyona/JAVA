package com.oops.java;

public class DefaultConstructorDemo {
	int rollno;
	String name;
	
	DefaultConstructorDemo(){
		rollno=123;
		name="cyona";
		System.out.println(+rollno+ " " +name);

	}
	public static void main(String[] args) {

		DefaultConstructorDemo dcd=new DefaultConstructorDemo();
		//dcd.display();
	}
	
	/*void display() {
		System.out.println(+rollno+ " " +name);
	}*/

}
