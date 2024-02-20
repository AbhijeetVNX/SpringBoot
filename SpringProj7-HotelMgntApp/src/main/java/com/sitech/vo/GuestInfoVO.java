package com.sitech.vo;

public class GuestInfoVO {
	
	private String gname;
	private String gaddress;
	private String gcontact;
	private String daysToStay;
	private String chargePerDay;
	
	public GuestInfoVO() {
		System.out.println("GuestInfoVO.GuestInfoVO()--0 param cons");
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGaddress() {
		return gaddress;
	}

	public void setGaddress(String gaddress) {
		this.gaddress = gaddress;
	}

	public String getGcontact() {
		return gcontact;
	}

	public void setGcontact(String gcontact) {
		this.gcontact = gcontact;
	}

	public String getDaysToStay() {
		return daysToStay;
	}

	public void setDaysToStay(String daysToStay) {
		this.daysToStay = daysToStay;
	}

	public String getChargePerDay() {
		return chargePerDay;
	}

	public void setChargePerDay(String chargePerDay) {
		this.chargePerDay = chargePerDay;
	}
	
}
