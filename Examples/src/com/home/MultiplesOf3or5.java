package com.home;

import java.util.Scanner;

public class MultiplesOf3or5 {

	public static void main(String[] args) {
		System.out.println("Enter a Number");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
	}

}
