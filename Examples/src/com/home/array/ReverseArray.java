package com.home.array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int size = array.length;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Reverse of Array is ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

}
