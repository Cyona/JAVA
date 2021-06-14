package com.collections.java;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Apple");
		ll.add('A');
		ll.add(100);
		ll.add(null);
		ll.add('A');
		ll.add("Apple");


		System.out.println(ll);
		System.out.println(ll.size());
		ll.remove(1);
		ll.add(2,"Cyona");

		System.out.println(ll);
		System.out.println(ll.get(2));
		ll.set(2, "Steve");
		System.out.println(ll);
		if(ll.contains("Steve")) {
			System.out.println("element found");
		}
		System.out.println(ll.isEmpty());
		for(Object ref:ll) {
			System.out.println(ref);
		
		}
	
		LinkedList<String> l=new LinkedList<String>();
		l.add("Orange");
		l.add("Apple");
		l.add("Mango");
		l.add("Banana");


	LinkedList<String> empty =new LinkedList<String>();
	empty.addAll(l);
	System.out.println("Empty list after adding elements :"+empty);
//	empty.removeAll(ll);
//	System.out.println("Empty list after removing elements :"+empty);
	
	System.out.println("Empty list before sorting :"+empty);
	Collections.sort(empty);
	System.out.println("Empty list after sorting elements :"+empty);
	Collections.sort(empty,Collections.reverseOrder());
	System.out.println("Empty list after sorting in descending order :"+empty);
	Collections.shuffle(empty);
	System.out.println("Empty list after shuffle :"+empty);




}
}
