package com.collections.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<Object>li=new ArrayList<Object>();
		li.add("cyo");
		li.add("123");
		li.add('C');
		li.add("Steve");
		li.add("6500");
		
		ListIterator<Object> lit=li.listIterator();
		
		System.out.println(lit.hasPrevious());
		System.out.println(lit.hasNext());
		System.out.println(lit.next());
		System.out.println(lit.previous());


	}

}
