package com.home;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Contents of obj ");
		SuperClass obj = new SuperClass();
		obj.getName();
		obj.a1();
		System.out.println(obj);
		
		System.out.println();
		
		
		SuperClass obj1 = new SubClass1();
		System.out.println("Contents of obj 1 ");
		obj1.getName();
		obj1.a1();
		obj1.a2();
		System.out.println(obj1);
		
		System.out.println();
		
		System.out.println("Contents of obj 3 ");
		SubClass1 obj3 = new SubClass1();
		obj3.getAge();
		System.out.println(obj3);

		// SubClass1 obj2 = new SuperClass(); // should be same level or
		// subtype.
	}

}
