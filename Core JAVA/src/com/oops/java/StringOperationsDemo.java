package com.oops.java;

public class StringOperationsDemo {

	public static void main(String[] args) {

		String s="Hello World";
		String s1="Welcome to \"Java\""; //escape equence
		String s2="111";
		int x=100;
		
		System.out.println(s.substring(6)); //substring
		System.out.println(s.substring(6,11));
		
		System.out.println(s.replace("World", "guys")); //replace char or string
		
		System.out.println(s.charAt(7)); //returns chat at specified position
		System.out.println(s.compareTo(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.isEmpty());
		System.out.println(s.concat(s1));
		System.out.println(s.contains("Hello"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.split(" ")[1]);
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("world"));
		System.out.println(s1);
		
		//typecasting
		int i=Integer.parseInt(s2);
		System.out.println(i);
		String name=String.valueOf(x);
		System.out.println(name);
		
		StringBuffer buff=new StringBuffer("Selenium java");
		
		System.out.println(buff.append("programming"));
		System.out.println(buff.replace(0, 4, "SELE"));
		System.out.println(buff.delete(0, 4));
		System.out.println(buff.insert(0, 's'));
		System.out.println(buff.reverse());
		System.out.println(buff.capacity());
		
		StringBuilder sb=new StringBuilder("Java world");
		System.out.println(sb.append("programming"));
		System.out.println(sb.replace(0, 4, "SELE"));
		System.out.println(sb.delete(0, 4));
		System.out.println(sb.insert(0, 's'));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	}

}
