package com.home;

public class Employee {

	// Non Reference Instance Variables
	private int id;
	private String name;
	private float salary;
	
	// Reference Instance Variable
	private Address a;
	
	
	public Employee() {
		
	}	
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public Employee(int id, String name, float salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.a = address;
	}


	public Address getAddress() {
		return a;
	}



	public void setAddress(Address address) {
		this.a = address;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
