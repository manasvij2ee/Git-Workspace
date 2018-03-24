package com.home.num;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TakeNumReturnList {

	public static void main(String[] args) {
		System.out.println("Enter any Number ");
		Scanner input = new Scanner(System.in);
	    String  str=input.next();
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			System.out.println(ch);
		}
		
		/*List<Integer> list = new LinkedList<Integer>();
		int temp=0;
		while (num>0) {
		    temp= num % 10;		   
		    list.add(temp);
		    num = num / 10;		    
		}
		Collections.reverse(list);
	    System.out.println(list);
	  */
	    
		
		
		
	}

}
