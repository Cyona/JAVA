package com.collections.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("Browser", "Chrome");
		mp.put("url", "https://www.amazon.in/");
		mp.put("search", "watch");
		mp.put(null, "sample");

		System.out.println(mp.get(null));
		mp.remove("search"); // remove pair from hashmap
		System.out.println(mp);
		System.out.println(mp.containsKey("url")); //checks if key is present or not
		System.out.println(mp.containsValue("sample"));//checks if value is present or not
		System.out.println(mp.isEmpty());
		System.out.println(mp.keySet()); //returns all keys
		System.out.println(mp.values()); //returns all values
		System.out.println(mp.entrySet()); //returns all entries i.e key-value pair
		
		for(String ref:mp.keySet()) {  //prints all keys as individual object
			System.out.println(ref);
			
		}
		for(String val:mp.values()) {
			System.out.println(val);
		}
		
		for(String i:mp.keySet()) {  //returns entry as individual object
			System.out.println(mp.get(i));
		}
		for(Map.Entry<String, String> pair:mp.entrySet()) {
			System.out.println(pair);
			System.out.println(pair.getKey()+"  "+pair.getValue());
		}

	}

}
