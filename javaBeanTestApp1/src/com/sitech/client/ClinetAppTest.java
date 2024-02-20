package com.sitech.client;

import com.sitech.bean.EmployeeInfo;
import com.sitech.service.EmployeeService;

public class ClinetAppTest {
	
	public static void main(String[] args) {
		
		System.out.println("in clinet app...");
		
		EmployeeInfo infobean = new EmployeeInfo();
		
		infobean.setEid(101);
		infobean.setEname("Abhiii");
		infobean.setEcontact(9988665522);
		infobean.setNewSkill("Testing");
		infobean.setProjectsCompleted(3);
		infobean.setWorkHours(10);
		
		EmployeeService service = new EmployeeeService();
		
		String msg = service.promoteEmployee(infobean);
		
		System.out.println(msg);
	}

}
