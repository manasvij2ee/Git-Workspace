package com.home.string;

public class ReverseString {

	public static void main(String[] args) {
		String str ="Manasvi is a girl";
		 
		for (int j = str.length()-1; j >=0; j--) {
			char ch = str.charAt(j);
			 System.out.print(ch);
		}
		
	}

}
