package com.home;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {

		System.out.println("Enter a Number");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		try {
			num1 = input.nextInt();
		} catch (Exception e1) {
			System.out.println("Not a Number");
		}

		System.out.println("Enter another Number");
		int num2 = 0;
		try {
			num2 = input.nextInt();
		} catch (Exception e1) {
			System.out.println("Not a Number");
		}

		System.out.println("Enter Operation");
		String operation = input.next();

		try {
			switch (operation) {
			case "+":
				System.out.println("Addition of "+ num1+" " +"& "+ num2 +" "+ "is " + (num1 + num2));
				break;

			case "-":
				System.out.println("Substraction of " + num1+" " +"& "+ num2 +" "+ "is " + (num1 - num2));
				break;

			case "%":
				System.out.println("Percentage of Two Numbers is: " + (num1 % num2));
				break;

			case "/":
				System.out.println("Division of Two Numbers is: " + (num1 / num2));
				break;

			case "*":
				System.out.println("Multiplication of Two Numbers is: " + (num1 * num2));
				break;
				
			default:
				System.out.println("Not a valid operation");
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
