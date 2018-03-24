package com.home.num;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		if (num % 2 != 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

}
