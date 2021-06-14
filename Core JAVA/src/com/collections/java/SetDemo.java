package com.collections.java;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
      public static void main(String ags[] ) {
    	  
    	  Set<Object> s=new HashSet<Object>(); //default ele capacity is 16 and load factor is 0.74
    //	  Set<Object> s=new HashSet<Object>(100);
    //	  Set<Object> s=new HashSet<Object>(40,(float) 0.85);
       	  s.add("cyo");
    	  s.add(122);
    	  s.add('A');
    	  s.add(122);
    	  s.add(null);
    	  System.out.println(s);
    	  s.remove(122);
    	  System.out.println("After removing element:"+s);
    	  System.out.println(s.contains(122));  //returns boolean value
    	  System.out.println(s.isEmpty());
    	  
    	  Set<Object> hs=new HashSet<Object>();
    	  hs.add("Orange");
    	  hs.add("Mango");
    	  hs.add("Apple");
    	  hs.add("Grapes");
    	  System.out.println(hs);
    	  Set<Object> empty=new HashSet<Object>();
    	  empty.addAll(hs);
    	  empty.add("Guava");
    	  System.out.println(empty.containsAll(hs));
    	  System.out.println("--"+empty);
    	  
    	  empty.removeAll(hs);
    	  System.out.println(empty);
    	  
    	  //Union,Intersection and difference
    	  

    	  Set<Integer> hs1=new HashSet<Integer>();
    	  hs1.add(5);
    	  hs1.add(4);
    	  hs1.add(8);
    	  hs1.add(9);
    	  System.out.println("Set1:"+hs1);


    	  Set<Integer> hs2=new HashSet<Integer>();
    	  hs2.add(6);
    	  hs2.add(8);
    	  hs2.add(7);
    	  hs2.add(5);
    	  System.out.println("Set2:"+hs2);
//    	  hs1.addAll(hs2);
//    	  System.out.println("Union:"+hs1); //union
//    	  hs1.retainAll(hs2);
//    	  System.out.println(hs1); //intersection
    	  
    	  hs1.removeAll(hs2);
    	  System.out.println(hs1); //difference

    	  
      }
}
