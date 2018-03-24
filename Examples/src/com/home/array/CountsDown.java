package com.home.array;

public class CountsDown {

	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8, 5, 3, 5, 8, 9, 6, 9, 6, 7, 1, 10,55 };
		count(array);
	}

	private static void count(int[] a) {

		for (int i = 15; i >= 0; i -= 5) {
			System.out.print(a[i]+" ");
		}
	}

}
