package com.home;

public class LeapYear {

	public static void main(String[] args) {
		int startYear = 2018;
		int count = 0;
		for (int i = startYear;; i++) {
			if ( i % 4 == 0) {
				System.out.println(count + ". " + i);
				count++;
				if (count == 20) {
					break;
				}

			}

		}

	}
}
