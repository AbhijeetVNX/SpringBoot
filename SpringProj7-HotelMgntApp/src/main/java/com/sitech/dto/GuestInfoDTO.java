package com.sitech.dto;

import java.io.Serializable;

public class GuestInfoDTO implements Serializable {
	
	private String gname;
	private String gaddress;
	private Long gcontact;
	private Integer daysToStay;
	private Float chargePerDay;
	private Float billAmount;
	

	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}

	public GuestInfoDTO() {
		System.out.println("GuestInfoDTO.GuestInfoDTO()--0 param cons");
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

	public Long getGcontact() {
		return gcontact;
	}

	public void setGcontact(Long gcontact) {
		this.gcontact = gcontact;
	}

	public Integer getDaysToStay() {
		return daysToStay;
	}

	public void setDaysToStay(Integer daysToStay) {
		this.daysToStay = daysToStay;
	}

	public Float getChargePerDay() {
		return chargePerDay;
	}

	public void setChargePerDay(Float chargePerDay) {
		this.chargePerDay = chargePerDay;
	}
	public Float getBillAmount() {
		return billAmount;
	}
	
	
}
