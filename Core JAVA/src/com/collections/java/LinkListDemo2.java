package com.collections.java;

import java.util.LinkedList;

public class LinkListDemo2 {
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Orange");
		l.add("Apple");
		l.add("Mango");
		l.add("Banana");
		l.add("Apple");
		System.out.println("Linked list elements "+l);
		l.addFirst("Grapes");
		l.addLast("Jackfruit");
		System.out.println(l);
		System.out.println("First element "+l.getFirst());
		System.out.println("Last element "+l.getLast());

		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	}

}
