package com.home;

// compare one element with next element and swap
public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 2, 5, 8, 3, 9 };
		System.out.println("Before Insertion Sort");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		insertionSort(a);
		System.out.println("After Insertion Sort");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			int j;
			int key = a[i];
			for (j = i - 1; j >= 0 && a[j] > key; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = key;

		}

	}

}
