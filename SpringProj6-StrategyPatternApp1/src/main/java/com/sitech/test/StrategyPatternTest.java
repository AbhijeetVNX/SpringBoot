package com.sitech.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sitech.beans.Amazon;

public class StrategyPatternTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader();
		reader.loadBeanDefinitions("com/sitech/cfg/applicationContext.xml");
		
		Amazon amz = factory.getBean("amz",Amazon.class);
		
		String msg = amz.shopping(new String[] {"hedphone","speaker","Shoes"},new double[] {900.0,2000.0,3700.0});
		double[] {900.0,2000.0,3700.0});
		
		System.out.println(msg);
		
	}

}
