package com.home.num;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {

		System.out.println("Enter a Number");

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		System.out.println("Sum/Product");
		String operation = input.next();
		operation = operation.toLowerCase();
		switch (operation) {
		case "sum":
			int sum=0;
			for(int i=1; i<=num;i++) {
				sum=sum+i;			
			}
			System.out.println(sum);
		
			break;

		case "product":
			int prod=1;
			for(int i=1; i<=num;i++) {
				prod=prod*i;			
			}
			System.out.println(prod);
		
			
			break;

		}

	}
}