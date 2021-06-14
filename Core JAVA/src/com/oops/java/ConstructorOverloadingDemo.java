package com.oops.java;

public class ConstructorOverloadingDemo {
	
	String ename;
	int eid,esalary;
	
	ConstructorOverloadingDemo(int e,String n){
		eid=e;
		ename=n;
		esalary=80000;
		System.out.println("employee id:" +eid+ " Employee name: "+ename);
	//	System.out.println(eid+ " " +ename+ " " +esalary);

	}
	ConstructorOverloadingDemo(int e,String n,int s){
		eid=e;
		ename=n;
		esalary=s;
		System.out.println("employee id:" +eid+ " Employee salary: "+esalary+ " Employee name:" +ename);

	}
	void display() {
		
		System.out.println("employee id:" +eid+ " Employee salary: "+esalary+ " Employee name" +ename);
	}
	public static void main(String[] args) {
		ConstructorOverloadingDemo cod=new ConstructorOverloadingDemo(1096223,"Cyo");
		ConstructorOverloadingDemo cod1=new ConstructorOverloadingDemo(1092228,"Steve", 70000);

	}

}
