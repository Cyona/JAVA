package com.oops.java;

public class Teamlead extends Manager {
	
	int tsalary=70000;
	int tid=111;
	void tdisplay() {
		System.out.println("TL with id: "+tid+ " has salary of:" +tsalary);

	}
	public static void main(String[] args) {

		Teamlead tl=new Teamlead();
		tl.tdisplay();
		tl.mdisplay();
	}

}
