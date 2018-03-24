package com.home.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SolutionStreet {

	//Write a function that accepts a single string input and returns the first non-repeated character.
	//"AABBCDD"
	//"AABBCCDEEFF" 
	public static void main(String[] args) {
		//String inputString = "AABBCCDEEFF";
		System.out.println("Enter input String: ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		sc.close();
		
		String output = getFirstNonRepeatedCharacter(inputString);
		System.out.println(output);
	}

	private static String getFirstNonRepeatedCharacter(String inputString) {
		Map<String, Integer> charMap = new LinkedHashMap<>();		
		for(int i = 0; i < inputString.length(); i++) {			
			String key = String.valueOf(inputString.charAt(i));
			Integer count = charMap.get(key);
			if(count != null) {
				count = count + 1;
				charMap.put(key, count);
			} else {
				charMap.put(key, 1);				
			}			
		}
		for(Entry<String, Integer> entry : charMap.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}
}
