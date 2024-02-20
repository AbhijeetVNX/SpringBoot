package com.sitech.component;

public class Student extends Person{
	
	private int rollNo;
	private String field;
	
	public Student(String name,String address, AdharInfo info, int rollNo, String field) {
		super(name, address, info);
		System.out.println("Student.Student()--5 param cons");
		this.rollNo = rollNo;
	}

	
	public String toString() {
		return "Student [rollNo=" + rollNo + ", field=" + field + "]";
	}
	
	

}
