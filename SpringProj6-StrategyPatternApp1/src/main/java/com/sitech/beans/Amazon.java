package com.sitech.beans;

import java.util.Random;

public class Amazon {
	
	Courier courier;

	public Amazon() {
		System.out.println("Amazon.Amazon()--0 param cons");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	public void shopping(String[] items,double[] prices) {
		
		double amount = 0.0;
		
		for(int i=0;i<prices.length;i++) {
			
			amount = amount + prices[i];
		}
		
		Random random = new Random();
		int orderId = random.nextInt();
		
		String courierMsg = courier.deliver(oid);
		String shoppingDetails = "Items-: Array.toString(items)+" Bill Amount-:"+amount;
		return shoppingDetails+"\t"+courierMsg;		
		
	}
	

}
