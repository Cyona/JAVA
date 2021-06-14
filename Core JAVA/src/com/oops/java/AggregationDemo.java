package com.oops.java;

public class AggregationDemo {

	int id;
	Name name;
	
	AggregationDemo(int id,Name name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("Employee id is:"+id);
		System.out.println("Employee first and last name is "+name.fname+" "+name.lname);
	}
	
	public static void main(String[] args) {
		Name name=new Name("Cyona","Baretto");
		AggregationDemo ad=new AggregationDemo(1096223,name);
		ad.display();
	}

}
