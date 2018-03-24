package com.home.num;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter a Number");

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int result = 1;

		for (int i = num; i > 0; i--) {
			result = result * i;
		}
		System.out.println(result);

	}

}
