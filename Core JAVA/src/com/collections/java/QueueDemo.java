package com.collections.java;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.offer("Germany");
		pq.add("India");
		pq.add("US");
		pq.add("India");
		pq.add("UK");
	//	pq.add(12);

	//	pq.add(100);  //heterogeneous data is not allowed

		System.out.println(pq);
		
		// get head element using element() peek()
		System.out.println(pq.peek());  //returns null if queue is empty
		System.out.println(pq.element()); //throws exception if queue is empty
	
		//return and remove element from queue using remove and poll
		

		System.out.println(pq.poll());//returns null if queue is empty
		System.out.println(pq);
		System.out.println(pq.remove());//throws exception if queue is empty
		System.out.println(pq);
	
		Iterator itr=pq.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
