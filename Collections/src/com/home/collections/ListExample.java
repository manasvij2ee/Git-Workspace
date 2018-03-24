package com.home.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListExample {

	public static void main(String[] args) {
		
		 List list1 = new ArrayList();
	        
	        list1.add(10);
	        list1.add(10);
	        
	        System.out.println(list1.size());
	        
	        list1.remove(new Integer(10));
	        
	        System.out.println(list1.size());
		
	List<String> list = new ArrayList<>();
		list.add("Manasvi");
		list.add("Manvi");
		list.add("Viman");		
		list.add("1");
		list.add("100");
		list.add("12");
		list.add("Viman");

		System.out.println(list);
		
	/*List<String> list = new LinkedList<>();
		list.add("Manasvi");
		list.add("Manvi");
		list.add("Viman");		
		list.add("1");
		list.add("100");		
		list.add("Viman");
		list.add("12");
		System.out.println(list);*/
		
	Set<String> set = new TreeSet<String>();
		set.add("12");
		set.add("Manasvi");
		set.add("Vivek");
		set.add("Vivek");
		set.add("1");		
		set.add("100");
		System.out.println(set);
		
		
	/*Set<String> set = new LinkedHashSet<String>();
		set.add("12");
		set.add("Manasvi");
		set.add("Vivek");
		set.add("100");
		set.add("Vivek");
		set.add("1");			
		System.out.println(set);*/
		
	Map<String,String> hm = new LinkedHashMap<String,String>();
		
		    hm.put("first", "FIRST INSERTED");
		    hm.put("", "Fourth INSERTED");
		    hm.put("", "Fth INSERTED");
		    hm.put("third","THIRD INSERTED");
	        hm.put("second", "SECOND INSERTED");	
	        hm.put("second", "SECOND INSERTED");
		    System.out.println(hm);
	}

}
