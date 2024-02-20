package com.sitech.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sitech.beans.WeekendDayTester;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		
		//create connection with spring bean cfg file
		FileSystemResource resource = new FileSystemResource("src/main/java/com/sitech/cfg/applicationContext.xml");
		
		//Activate the spring container
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		Object obj = factory.getBean("wdt");
		
		//perform type casting
		WeekendDayTester wdtester = (WeekendDayTester)obj;
		
		//call b.method on the recieved target bean object
		String result = wdtester.testWeekendDay();
		
		//display the message recieved from b.method
		System.out.println(result);
		
	}

}