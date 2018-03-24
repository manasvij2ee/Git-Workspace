package com.home.num;

import java.util.Scanner;

public class NumOrNot {

	public static void main(String[] args) {

		System.out.println("Enter a Number");

		Scanner input = new Scanner(System.in);
		try {
			int num = input.nextInt();
		} catch (Exception e) {
			System.out.println("Not a Number");
		}

	}

}
