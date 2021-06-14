package com.oops.java;

public class JuniorEmployee extends Employee {
	int jsalary=30000;
	void display() {
		System.out.println("Junior employee salary"+jsalary);
	}
	public static void main(String[] args) {
		JuniorEmployee je=new JuniorEmployee();
		je.display();
		je.edisplay();
		je.mdisplay();
		
	}

}
