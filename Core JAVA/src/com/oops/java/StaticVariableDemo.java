package com.oops.java;

public class StaticVariableDemo {
	int eid;
	String ename;
	static String company="Dell EMC";
	
	StaticVariableDemo(int id,String name){
		eid=id;
		ename=name;
	}
	void display() {
		System.out.println(eid+ " "+ename+ " " +company);
	}
	
	public static void main(String[] args) {
		StaticVariableDemo svd=new StaticVariableDemo(123, "cyona");
		svd.display();
		//System.out.println(company);
		
	}

}
