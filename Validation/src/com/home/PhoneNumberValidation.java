package com.home;

public class PhoneNumberValidation {

	public static void main(String[] args) {

		System.out.println(validate("012*345-6789"));

	}

	private static boolean validate(String phoneNum) {

		/*
		 * if(phoneNum.matches("\\d{10}")) return true;
		 */
		if (phoneNum.matches("\\d{10}|\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
			return true;

		else
			return false;

	}

}
