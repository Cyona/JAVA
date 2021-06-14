package com.oops.java;

public class Example {
	ThisArguementInCOnstructor obj;
	Example(ThisArguementInCOnstructor obj){
		this.obj=obj;
	}
	void display() {
		System.out.println(obj.data);
	}


}
