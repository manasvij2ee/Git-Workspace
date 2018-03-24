package com.home.array;

public class ElementSearch {

	static boolean isExists(int x, int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (x == intArray[i]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 35, 48, 7 };
		System.out.println(isExists(7, intArray));

	}

}
