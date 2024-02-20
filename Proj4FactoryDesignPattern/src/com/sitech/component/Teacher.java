package com.sitech.component;

	public class Teacher extends Person{
		
	private String subject;
	private double salary;


    public Teacher (String name, String address, AdharInfo info, String subject, double salary) {
	    super (name, address, info);
		System.out.println("Teacher. Teacher()--5 param cons");
		this.subject=subject;
		this.salary=salary;
		}

    public String toString() {
        return "Teacher [subject=" + subject + ", salary=" + salary + "]";
  }
}