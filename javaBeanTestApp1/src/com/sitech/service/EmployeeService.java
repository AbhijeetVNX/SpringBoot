package com.sitech.service;
import com.sitech.bean.EmployeeInfo;
public class EmployeeService {
	
	public String promoteEmployee(EmployeeInfo infobean) {
		
		System.out.println("inservice...");
		
		System.out.println(infobean.getEid());
		System.out.println(infobean.getEname());
		System.out.println(infobean.getEcontact());
		System.out.println(infobean.getNewSkill());
		System.out.println(infobean.getProjectsCompleted());
		System.out.println(infobean.getWorkHours());
		
		return "employee is promoted!!!";
	}

}
