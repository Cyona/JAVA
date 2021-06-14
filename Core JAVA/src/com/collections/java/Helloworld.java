package com.collections.java;

import java.util.Scanner;

public class Helloworld {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first number");
		 int num1=sc.nextInt();
		 
		 System.out.println("Enter second number");
		 int num2=sc.nextInt();
		 Helloworld hw=new Helloworld();
		 int res=hw.add(num1, num2);
		 System.out.println(res);
		 
	}
	
	public int add(int a,int b) {
		int result=a+b;
		return result;
	}
}