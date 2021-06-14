package com.oops.java;

public class ConstructorChainingDemo {
	int sid;
	String sname;
	
	ConstructorChainingDemo(){
		this(1096);
		
	}
	ConstructorChainingDemo(int id){
		this(id,"cyo");
		
	}
	ConstructorChainingDemo(int id,String name){
		//sid=id;
		//sname=name;
		this.sid=id;
		this.sname=name;
	}
	void display() {
		System.out.println(sid+" " +sname);

	}
	public static void main(String[] args) {

		ConstructorChainingDemo chd=new ConstructorChainingDemo();
		chd.display();
	}

}
