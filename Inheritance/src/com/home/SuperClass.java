package com.home;

public class SuperClass {

	// Instance variables
	int a;
	int c;
	String name;

	public SuperClass() {

	}

	public SuperClass(int a, int c, String name) {
		super();
		this.a = a;
		this.c = c;
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SuperClass [a=" + a + ", c=" + c + ", name=" + name + "]";
	}

	void a1() {
		System.out.println("Inside a1 method in superclass");
	}

	protected void a2() {
		System.out.println("Inside a2 method in subclass");
	}
	
	final static void a3() {
		System.out.println("Inside a3 method in superclass");
	}

}
