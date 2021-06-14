package com.oops.java;

public class ThisArguementInCOnstructor {
	int data=10;
	ThisArguementInCOnstructor(){
		Example ex=new Example(this);
		ex.display();
	}
	public static void main(String[] args) {
		ThisArguementInCOnstructor obj=new ThisArguementInCOnstructor();
		
	}

}
