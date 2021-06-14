package com.oops.java;

public interface AdvancedInterfaceDemo {
	 public void run1();
	
	default void check() {
		System.out.println("check the method");
		print();
		//execute();
		//display();
	}
	private void print() {
		System.out.println("Hello! this is private method");
	}
	private static void execute() {
		System.out.println("private static method");
	}
	public static void display() {
		System.out.println("static method ");
		execute();
	}
}
