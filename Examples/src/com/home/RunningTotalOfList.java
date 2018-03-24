package com.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunningTotalOfList {

	public static void main(String[] args) {
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (;;) { // While(true) {
			System.out.println("Enter any Number or character");
			Scanner input = new Scanner(System.in);
			try {
				int num = input.nextInt();			
				System.out.println("Entered Number is " + num);
				list.add(num);
				System.out.println(list);				
				sum = sum + num;
				System.out.println("Total is " + sum);				
			} catch (Exception e) {
				break;
			}

		}

	}
}
