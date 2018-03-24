package com.home.num;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum=0;
		for(int i=1; i<=num;i++) {
			sum=sum+i;			
		}
		System.out.println(sum);
		
		/*while(num!=0) {
			sum=sum+num;
			num--;
		}
		System.out.println(sum);*/
	}

}
