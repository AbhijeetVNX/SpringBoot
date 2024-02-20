package com.sitech.factory;

import com.sitech.component.AdharInfo;
import com.sitech.component.Person;
import com.sitech.component.Student;
import com.sitech.component.Teacher;

public class PersonFactory {
	public static Person getPerson(String type) {
		
		Person per = null;
		AdharInfo info=null;
		
		if(type.equalsIgnoreCase("teach")) {
			info = new AdharInfo(203348548L,31,98884651);
			per = new Teacher("Ravi","Pune",info,"Physics",10000.00);
		}
		else if(type.equalsIgnoreCase("stud")) {
			info = new AdharInfo(203345558L,19,52224651);
			per = new Student("Abhi","Banglor",info,101,"Physics");
	    }
		else {
			throw new IllegalArgumentException("Person type not valid !");
			}
	return per;
		}

}
