package com.oops.java;

public class SampleInterface implements InterfaceVehicleDemo {
	
	//multiple inheritance
	public static void main(String args[]) {
		SampleInterface ivd=new SampleInterface();
		ivd.run();
		ivd.operate();
		ivd.check();
	}
	public void check() {
		System.out.println("welcome to class");
	}

	@Override
	public void run() {
		System.out.println("Hello Interface");
		
	}

	@Override
	public void operate() {
		System.out.println("Hello vehicle");
	}
	
	
	

}
