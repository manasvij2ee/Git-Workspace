package com.home.linkedlist;

import java.util.LinkedList;

public class Remove {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Manasvi");
		ll.add("Manvi");
		ll.add("Viman");
		ll.add("Vivek");
		System.out.println(ll);
		/*System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println(ll.remove());
		System.out.println(ll);*/
		
		System.out.println(ll.getLast());
		
		System.out.println(ll.peekLast());
		
		System.out.println(ll.getFirst());
		ll.addLast("I am last");
		
		System.out.println(ll);
		
		System.out.println(ll);
		
		
	}

}
