package com.home;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 7, 4, 3 };
		bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}
	}

	private static void bubbleSort(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < (a.length - i); j++) {

				if (a[j - 1] > a[j]) {
					
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}

			}
		}

	}

}
