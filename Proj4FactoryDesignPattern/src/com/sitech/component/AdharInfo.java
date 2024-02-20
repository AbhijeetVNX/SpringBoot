package com.sitech.component;

public class AdharInfo {
	private long adharNo;
	private int age;
	private long contactNo;
	
	public AdharInfo(long adharNo, int age, long contactNo) {
		System.out.println("AdharInfo.AdharInfo()--3 param cons");
		this.adharNo =adharNo;
		this.age = age;
		this.contactNo = contactNo;
	}
	public String toString() {
		return "AdharInfo [adharNo=" + adharNo + ", age=" + age + ",contactNo=" + contactNo + "]";
		
	}

}
