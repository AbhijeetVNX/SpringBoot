package com.sitech.singleton;

public class Calculation {

	private static Calculation INSTANCE;
	
	private Calculation() {
		// TODO Auto-generated constructor stub
		System.out.println("Calculation.Calculation()--0 param cons...");
		
	}
	
	public static Calculation getInstance() {
		
		if(INSTANCE == null) {
			INSTANCE = new Calculation();		
			}
		return INSTANCE;
	}	
		
 	public double add(float num1,float num2) {
 		double result = num1 + num2;
 		
 		return result;
 	}
}

 	
	

     