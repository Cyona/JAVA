package com.collections.java;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MultimapDemo {

	public static void main(String[] args) {
		Multimap<Character,String> mm=  ArrayListMultimap.create();
		mm.put('A', "apple");
		mm.put('A', "Aus");
		mm.put('A', "Ansible");

		mm.put('B', "Badminton");
		mm.put('B', "Britain");
		System.out.println(mm.get('A'));
		
	}

}
