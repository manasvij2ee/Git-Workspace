package com.home.string;

public class StringToChar {

	public static void main(String[] args) {

		String str = "Manasvi";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}

		/*
		 * System.out.println("Characters at Odd positions "); for (int i = 0; i
		 * < str.length(); i++) { char ch = str.charAt(i); if (i % 2 != 0) {
		 * System.out.println(ch); } }
		 */

	}

}
