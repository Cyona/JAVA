package com.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class ListDemo {

	public static void main(String[] args) {
		List<String>li =new ArrayList<String>();
		li.add("orange");
		li.add("apple");
		li.add("mango");
		
//		for(String ref:li) {
//			System.out.println(ref);
//
//		}
		
		List<String> empty =new ArrayList<String>();
		empty.add("Cyo");
		empty.add("Baretto");
		empty.addAll(li);
	//	empty.removeAll(li);
		System.out.println(empty);
//		for(String ref:li) {
//			empty.add(ref);
//		}
		System.out.println("Before sorting"+empty);
		Collections.sort(empty);
		System.out.println("After sorting"+empty);
		Collections.sort(empty,Collections.reverseOrder());
		System.out.println("elements in descending order:"+empty);
		Collections.shuffle(empty);
		System.out.println("Element after shuffling "+empty);
		
	}

}
