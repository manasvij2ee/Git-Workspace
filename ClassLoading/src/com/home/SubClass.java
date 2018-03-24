package com.home;

public class SubClass extends SuperClass {
	// Instance variables
	int aa;
	int cc;
	String nameSub;

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
	public SubClass() {
		System.out.println("Inside SuperClass Default constructor");
	}

	public SubClass(int a, String name) {
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
		System.out.println("a: " + a + " b: " + b + "name: " + name + " c: " + c);
	}

}