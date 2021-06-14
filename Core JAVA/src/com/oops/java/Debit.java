package com.oops.java;

public class Debit implements InterfaceDemo,AdvancedInterfaceDemo{

	@Override
	public void run() {
		System.out.println("Debiting money from the account");		
	}
	public static void main(String args[]) {
		Debit d=new Debit();
		d.run();
		d.run1();
		d.check();
		AdvancedInterfaceDemo.display();
		

	
	
	}

	@Override
	public void run1() {
		System.out.println("Run 1 method");
	}


	

}
