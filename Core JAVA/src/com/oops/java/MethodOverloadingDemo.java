package com.oops.java;

public class MethodOverloadingDemo {
	

	void area(int r) {
		System.out.println("Area of circle:"+3.14*r*r);
	}
	void area(int l,int b) {
		System.out.println("Area of rectangle" +(l*b));
	}
	
	void area(float r) {
		System.out.println("Area of circle:"+3.14*r*r);

	}
	public static void main(String[] args) {

		MethodOverloadingDemo mod=new MethodOverloadingDemo();
		mod.area(10);
		mod.area(5, 6);
		mod.area(10.02f);
	}
	}
