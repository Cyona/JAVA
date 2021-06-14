package com.collections.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();

		al.add("Cyona");
		al.add("Steve");
		al.add("Raksha");
		al.add("Raksha");
		al.add("Raksha");
		
		//for loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//for each loop
		for (String ref : al) {

			if (ref.contains("Steve")) { //search ele
				System.out.println("Match found");
				System.out.println("value is " + ref);
				break;
			} else {
				System.out.println("Match not found");
			}
			// System.out.println(ref);
		}
		
		//using iterator
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println("ele are: "+itr.next());
		}
		al.remove(2);// remove specific ele based on index
		al.add(4, "Cyo"); // add specific ele based on index
		System.out.println(al); // read all ele
		System.out.println(al.get(3)); // retrieve specific ele
		al.set(3, "Kripa"); // replace ele
		System.out.println(al);

	}

}
