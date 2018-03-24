package com.home;

public class SuperClass {

	// Instance variables
	 int a;
	int c;
	String name;
	

	// static variables
	final static int b = 5;

	// Static Block
	{
		System.out.println("Inside Static Block");
	}

	// Static Method
	static void info2() {
		System.out.println("Inside Static Method ");
	}

	{
		System.out.println("Inside Instance Intialization Block");
	}

	// constructor
	public SuperClass() {
		System.out.println("Inside SuperClass Default constructor");
	}

	public SuperClass(int a, String name) {
		super();
		System.out.println("Inside SuperClass 2-Args constructor");
		this.a = a;
		this.name = name;
	}

	@Override
	public String toString() {
		return "SuperClass [a=" + a + "]";
	}
	
	void info() {
		System.out.println("a: " + a + " b: " + b + "name: " + name + " c: " + c) ;
	}

}
