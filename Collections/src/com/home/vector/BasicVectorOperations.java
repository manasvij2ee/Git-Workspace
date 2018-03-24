package com.home.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class BasicVectorOperations {

	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		System.out.println(vct);
		// adding element at specified index
		vct.add(2, "Random");
		System.out.println(vct);
		// getting elements by index
		System.out.println("Element at index 3 is: " + vct.get(3));
		// getting first element
		System.out.println("The first element of this vector is: " + vct.firstElement());
		// getting last element
		System.out.println("The last element of this vector is: " + vct.lastElement());
		// how to check vector is empty or not
		System.out.println("Is this vector empty? " + vct.isEmpty());
		
		//clone 
		 Vector<String> copy = (Vector<String>) vct.clone();
	        System.out.println("Cloned vector:"+copy);

		// Using Iterator to read all elements.
		System.out.println("Using Iterator to read all elements");
		Iterator<String> itr = vct.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Using Enumeration to read all elements.
		System.out.println("Using Enumeration to read all elements");
		Enumeration<String> enm = vct.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		//Delete
		vct.clear();
        System.out.println("After clearing vector:"+vct);
	}
}