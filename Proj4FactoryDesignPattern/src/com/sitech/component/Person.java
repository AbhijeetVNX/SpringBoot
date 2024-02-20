package com.sitech.component;

public class Person {
	
	private String name;
	private String address;
	private AdharInfo info;
	
	public Person(String name, String address, AdharInfo info) {
		 
		System.out.println("Person.Person()--3 param cons");
		this.name = name;
		this.address = address;
		this.info = info;
	}


	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", info=" + info + "]";
	}
	
	
	
	
}
