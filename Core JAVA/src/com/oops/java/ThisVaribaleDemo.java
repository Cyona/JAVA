package com.oops.java;

public class ThisVaribaleDemo {

	String name;
	int id;
	
	ThisVaribaleDemo(int id,String name){
		this.name=name;
		this.id=id;
	
	}
	void display() {
		System.out.println(id+ " "+name);
	}
	
	public static void main(String[] args) {
		ThisVaribaleDemo tvd=new ThisVaribaleDemo(133,"Cyona");
		ThisVaribaleDemo tvd1=new ThisVaribaleDemo(111,"steve");

		tvd.display();
		tvd1.display();
		
	}

}
