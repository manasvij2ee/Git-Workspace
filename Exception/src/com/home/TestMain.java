package com.home;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestMain {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[][]= {{1,2,3},{3,4,5}};
		int c[][]= {{15,25,23,22},{11,24,32,21},{0,2,3,4}};
		int d[][][]= {{{1,2,3},{3,4,5}}, {{1,2,3},{3,4,5}}};
		
		System.out.println(" length of Array B "+b.length);
		System.out.println(" length of Array B "+b[0].length);
		
		System.out.println(c[0][0]+c[0][1]+c[0][2]+c[0][3]);
		
		/*for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {				
				System.out.println(c[i][j]);
			}
			
		}*/
		
		int size = a.length;
		
		System.out.println("Size of Array " + size);
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element : " + a[size-1]);
		
		printArray(a);
		
		printArrayInReverseOrder(a, size);
		
		method1(a, size);
		
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		method3();// Need not be handled so RuntimeException  is a UnChecked Exception
		//method4(); // It has to be handled so Exception  is a Checked Exception
		//method5();
	}

	private static void printArrayInReverseOrder(int[] a, int size) {
		////Print an Array in reverse order
		for (int i = size-1; i >= 0; i--) {
			System.out.println(a[i]);
			
		}
	}

	private static void printArray(int[] a) {
		//Print an Array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void method2() throws FileNotFoundException, IOException {
		FileReader file = new FileReader("C:\\test\\a.txt");
	        BufferedReader fileInput = new BufferedReader(file);
	         
	        // Print first 3 lines of file "C:\test\a.txt"
	        for (int counter = 0; counter < 3; counter++) 
	            System.out.println(fileInput.readLine());
	         
	        fileInput.close();
	}
	
	private static void method3() throws RuntimeException {
		System.out.println("Throws runtime Exception");
	}
	
	private static void method4() throws Exception {
		System.out.println("Throws Exception");
	}
	
	private static void method5() throws Throwable {
		System.out.println("Throws Throwable");
	}
	
	
	private static void method1(int[] a, int size) {		
		System.out.println("Last Element : " + a[size]);
		System.out.println("Last Element : " + a[100]);		
	}

}
