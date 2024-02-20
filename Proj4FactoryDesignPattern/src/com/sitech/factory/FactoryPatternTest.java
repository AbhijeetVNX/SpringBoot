package com.sitech.factory;

import com.sitech.component.Person;

public class FactoryPatternTest {

	public static void main(String[] args) {
		
		//use factory to get teacher class object
		Person teacher = PersonFactory.getPerson("teach");
		System.out.println(teacher);
		
		System.out.println("----------------------------------------");
		
		//use factory to get student class object
		Person student = PersonFactory.getPerson("stud");
		System.out.println(student);
	}
}
