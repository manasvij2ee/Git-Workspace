package com.home;

public class Shadow {
	int count = 9; // Declare an instance variable named count

	public void logIn() {
		int count = 10; // Declare a local variable named count
		System.out.println("local variable count is " + count); // Shadowing
		System.out.println("instance variable count is " + this.count); // Instance variable can be accessed via "this." when instance variable 
																		// is shadowed by local variable.
		
	}

	public void count() {
		System.out.println("instance variable count is " + count);
	}

	public static void main(String[] args) {
		new Shadow().logIn();
		new Shadow().count();
	}
}
