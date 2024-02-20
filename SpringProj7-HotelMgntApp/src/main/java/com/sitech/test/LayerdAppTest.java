package com.sitech.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sitech.controller.MainController;
import com.sitech.vo.GuestInfoVO;

public class LayerdAppTest {
	public static void main(String[] args) {
		
		String gname=null,gaddress=null,gcontact=null,daysToStay=null,chargePerDay=null;
	
		Scanner sc = new Scanner(System.in);
		
		if(sc!=null) {
			System.out.println("Enter Guest Name");
			gname=sc.next();
			
			System.out.println("Enter Address");
			gaddress=sc.next();
			
			System.out.println("Enter Contact No");
			gcontact=sc.next();
			
			System.out.println("Enter no.of days to stay");
			daysToStay=sc.next();
			
			System.out.println("Enter per day charge");
			chargePerDay=sc.next();
			
	}
	GuestInfoVO vo = new GuestInfoVO();
	
		vo.setGname(gname);
		vo.setGaddress(gaddress);
		vo.setGcontact(gcontact);
		vo.setDaysToStay(daysToStay);
		vo.setChargePerDay(chargePerDay);
	
	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/sitech/cfg/applicationContext.xml");
	
	MainController cotroller = factory.getBean("gcontroller",MainController.class);
	
	
	}
	
}

