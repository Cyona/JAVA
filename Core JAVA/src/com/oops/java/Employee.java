package com.oops.java;

public class Employee extends Manager {
	int esalary=50000;
	static int eid=1096;
	
	void edisplay() {
		System.out.println("Employee with " +eid+ " gets " +esalary+" as a salary");

	}
	public static void main(String[] args) {

		Employee e=new Employee();
		e.edisplay();
		e.mdisplay();
		
	}

}
