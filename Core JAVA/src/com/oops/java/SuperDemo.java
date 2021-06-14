package com.oops.java;

class SuperDemo extends DefaultConstructorDemo {
	int x=10;
	SuperDemo(){
		System.out.println("Super class demo value  ");
		
	}
	//final void getValue() {
	//	System.out.println("hello");
	//}
	public static void main(String[] args) {
		SuperDemo sd=new SuperDemo(); //super class defualt constructor gets invoked implicitly
		//sd.getValue();
		}

}
