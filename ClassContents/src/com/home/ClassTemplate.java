package com.home;

public class ClassTemplate {

	// 1.Instance Variables
	int a = 10;
	String name = "Manasvi";
	
	

	// 2.a.Default(No Args) Constructor
	ClassTemplate() {

	}

	// 2.b.Constructor with Args
	public ClassTemplate(int a, String name) {
		this.a = a;
		this.name = name;
	}

	// 3.a. Instance method
	public void info() {
		System.out.println("Inside Info");
	}

	// 3.b.Instance Method with return type
	public String info1() {
		return null;
	}

	// 4.Static Variable(Can also be referred as constant)
	final static int b = 5;

	// 5.Static Method
	static void info2() {
		System.out.println("Inside Info2");
	}

	// 6.Enum
	public enum UserStatus {
		PENDING, ACTIVE, INACTIVE, DELETED;
	}

	// 7.Instance Block
	{
		System.out.println("Inside Instance Block");
	}

	// 8.Static Block
	{
		System.out.println("Inside Static Block");
	}

	@Override
	public String toString() {
		return "Vivek [a=" + a + ", name=" + name + "]";
	}

}
