package com.collections.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneKeyMultipleValues {

	public static void main(String[] args) {
		
		Map<String,List<String>> mp= new HashMap<String,List<String>>();
		List<String> li=new ArrayList<String>();
		li.add("Cyo");
		li.add("Steve");
		li.add("raksha");
		
		
		List<String> li1=new ArrayList<String>();
		li1.add("Apple");
		li1.add("Orange");
		li1.add("Mango");
		
		mp.put("names", li);
		mp.put("Fruits", li1);
		
		System.out.println(mp.get("names"));
		System.out.println(mp.get("Fruits"));



		

	}

}
