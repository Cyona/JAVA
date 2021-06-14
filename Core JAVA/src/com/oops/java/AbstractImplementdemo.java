package com.oops.java;

public class AbstractImplementdemo extends AbstractDemo {

	public static void main(String[] args) {

		AbstractImplementdemo ad=new AbstractImplementdemo();
		ad.run();
		ad.display();

		
	}

	@Override
	void run() {
		System.out.println("abstract method");
	}

}
