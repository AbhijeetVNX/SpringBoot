package com.sitech.beans;

public class BlueDart implements Courier{
	
	public BlueDart() {
		System.out.println("Blue.BlueDart()--0 param cons");
	}
	public String deliver(int oid) {
		String msg = "delivery by BlueDart for Order Id:"+oid;
		return msg;
	}

}
