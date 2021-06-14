package com.oops.java;

public class EncapsulationDemo {

	private String name;

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setName("Cyona");
		System.out.println(ed.getName());
		
	}


}
