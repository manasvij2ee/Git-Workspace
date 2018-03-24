package com.test;

public class TwoDArray {

	public static void main(String[] args) {
	
		int c[][]= {{15,25,23,22},{11,24,32,21},{0,2,3,4}};
		
		//rows: 3 Columns :4
	/*	System.out.println(c[0][0]+" "+c[0][1]+" "+c[0][2]+" "+c[0][3]);
		System.out.println(c[1][0]+" "+c[1][1]+" "+c[1][2]+" "+c[1][3]);		
		System.out.println(c[2][0]+" "+c[2][1]+" "+c[2][2]+" "+c[2][3]);*/
		
	/*	//rows:4 columns: 3
		System.out.println(c[0][0]+" "+c[1][0]+" "+c[2][0]);
		System.out.println(c[0][1]+" "+c[1][1]+" "+c[2][1]);
		System.out.println(c[0][2]+" "+c[1][2]+" "+c[2][2]);
		System.out.println(c[0][3]+" "+c[1][3]+" "+c[2][3]);
		*/
		
	
		/*
		//c.length means no. of Rows. 
		for (int i = 0; i < c.length; i++) {
			// c[i].length means no.of elements in ith row of c
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");				
			}
			System.out.println();
			
		}
	*/
		
		/*for (int i = 0; i < c.length; i++) {
			// c[i].length means no.of elements in ith row of c
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}*/
		
		for (int i = 0; i <= c.length; i++) {
			// c[i].length means no.of elements in ith row of c
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[j][i] + " ");
			}
			System.out.println();

		}
	}
}
