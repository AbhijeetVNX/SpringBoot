package com.sitech.bo;

public class GuestInfoBO  {
	
	private String gname;
	private String gaddress;
	private Long gcontact;
	private Float billAmount;
	
	public GuestInfoBO() {
		System.out.println("GuestInfoBO.GuestInfoBO()");
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

	public Float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}

	
}
