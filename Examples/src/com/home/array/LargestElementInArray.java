package com.home.array;

public class LargestElementInArray {
	int largestElement() {
		return 0;

	}

	public static void main(String[] args) {

		int[] a = { 9, 4, 16, 2, 10, 48, 100 };
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];

			}

		}
		System.out.println("Largest Element in Array is " + large);
	}

}
