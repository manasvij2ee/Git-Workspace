package com.home.arraylist;

import java.util.ArrayList;
import java.util.List;

public class BasicArraylist {
	public static void main(String[] a) {

		ArrayList<String> al = new ArrayList<String>();
		// add elements to the ArrayList
		al.add("JAVA");
		al.add("C++");
		al.add("PERL");
		al.add("PHP");
		System.out.println(al);
		// get elements by index
		System.out.println("Element at index 1: " + al.get(1));
		System.out.println("Does list contains JAVA? " + al.contains("JAVA"));
		// add elements at a specific index
		al.add(2, "PLAY");
		System.out.println(al);
		System.out.println("Is arraylist empty? " + al.isEmpty());
		System.out.println("Index of PERL is " + al.indexOf("PERL"));
		System.out.println("Size of the arraylist is: " + al.size());

		ArrayList<String> copy = (ArrayList<String>) al.clone();
		System.out.println("Cloned ArrayList:" + copy);
		
		//Adding list elements to Arraylist
		List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        al.addAll(list);
        System.out.println("After Copy: "+al);
        
	
	}
}
