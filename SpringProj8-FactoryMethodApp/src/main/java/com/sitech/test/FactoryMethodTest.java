package com.sitech.test;

import java.sql.Connection;
import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sitech/cfg/applicationContext.xml");
		
		Class c = factory.getBean("c1",Class.class);
		System.out.println("c object data"+c.toString()+"\t"+c.getClass());
		
		Calendar cal = factory.getBean("cal",Calendar.class);
		System.out.println("cal object date:"+cal.toString()+"\t"+cal.getClass());
		
		Connection con = factory.getBean("dm",Connection.class);
		System.out.println("con obj data:"+con.toString()+"\t"+con.getClass());
		
		String str1 = factory.getBean("s2",String.class);
		System.out.println("srt1 obj data:"+str1.toString()+"\t"+str1.getClass());
		
		String str2 = factory.getBean("s3",String.class);
		System.out.println("srt2 obj data:"+str2.toString()+"\t"+str2.getClass());
	}

}
