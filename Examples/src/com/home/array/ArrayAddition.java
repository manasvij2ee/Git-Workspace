package com.home.array;

public class ArrayAddition {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 1 } };
		int[][] c = new int[3][3];

		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < a.length;
		 * j++) { System.out.print(a[i][j]+" "); } System.out.println(); }
		 * 
		 * 
		 * for (int i = 0; i <b.length; i++) { for (int j = 0; j < b.length;
		 * j++) { System.out.print(b[i][j]+" "); } System.out.println(); }
		 */

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
