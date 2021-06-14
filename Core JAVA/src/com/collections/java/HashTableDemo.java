package com.collections.java;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();//default capacity is 11 and load factor is 0.75
		ht.put("Browser", "Chrome");
		ht.put("url", "https://www.amazon.in/");
		ht.put("search", "watch");
	//	ht.put("OS", null); //null key or value is not allowed
		System.out.println(ht);
		System.out.println(ht.get("search"));
		ht.remove("search");
		System.out.println(ht);
		System.out.println(ht.containsKey("search"));
		System.out.println(ht.containsValue("Chrome"));
		System.out.println(ht.isEmpty());
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.entrySet());
		
		for(String k:ht.keySet()) {
			System.out.println(k+" "+ht.get(k));
		}
		
		for(Entry<String, String> entry:ht.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		Set s=ht.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Entry entries=(Entry) itr.next();
			System.out.println(entries.getKey()+" "+entries.getValue());
		}

	}

}
