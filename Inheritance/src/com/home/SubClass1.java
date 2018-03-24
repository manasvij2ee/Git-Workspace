package com.home;

public class SubClass1 extends SuperClass {

	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SubClass1 [age=" + age + "]";
	}

	void a1() {
		System.out.println("Inside a1 method in subclass");

	}

	void b1() {

	}
	
	 protected void a2() {
		System.out.println("Inside a2 method in subclass");
	}
	
	// cannot override becuase a3 is final n static
	
/*	void a3() {
		
	}*/

}
