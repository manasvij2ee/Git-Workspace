package com.home.array;

public class OddPositionInArray {

	public static void main(String[] args) {
		int[] array = { 1, 26, 32, 4, 55, 6, 7, 8,34,6,8 };
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				System.out.println(array[i]);

			}

		}

	}
}