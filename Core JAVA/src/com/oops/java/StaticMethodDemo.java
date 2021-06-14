package com.oops.java;

public class StaticMethodDemo {

	int eid;
	String ename;
	static String company="Dell EMC";
	
	static void check() {
		company="Dell Technologies";
		//System.out.println(company);
	}
	
	StaticMethodDemo(int id,String name){
		eid=id;
		ename=name;
	}
	void display() {
		System.out.println(eid+ " "+ename+ " " +company);
	}
	public static void main(String[] args) {
		StaticMethodDemo.check(); // static method can be invoked without instance of class
		StaticMethodDemo smd=new StaticMethodDemo(1092,"Cyona");
		smd.display();
		
	}

}
