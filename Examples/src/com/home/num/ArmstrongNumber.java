package com.home.num;

import java.util.Scanner;

public class ArmstrongNumber {
	static Boolean isArmstrong(int num) {
		int result = 0;
		int givenNum = num;
		while (num != 0) {
			int remainder = num % 10;
			result = result + (remainder * remainder * remainder);
			num = num / 10;
		}
		if (givenNum == result) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();

		if (isArmstrong(num)) {
			System.out.println("Given Number is an Armstrong Number ");

		} else {
			System.out.println("Given Number  is not an Armstrong Number");
		}

	}

}
