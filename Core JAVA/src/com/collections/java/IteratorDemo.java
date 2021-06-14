package com.collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Object>li=new ArrayList<Object>();
		li.add("cyo");
		li.add("123");
		li.add('C');
		li.add("Steve");
		li.add("6500");
		
		Iterator<Object> it=li.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		

		
	}

}
