package com.oops.java;

public abstract class AbstractDemo {

	AbstractDemo(){
		System.out.println("welcome to constructor ");
	}
	abstract void run();
	void display() {
		System.out.println("non abstract method");
	}
}
