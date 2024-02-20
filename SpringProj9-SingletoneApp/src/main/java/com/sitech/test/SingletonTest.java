package com.sitech.test;

import com.sitech.singleton.Calculation;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Calculation c1 = Calculation.getInstance();
		Calculation c2 = Calculation.getInstance();
		
		System.out.println(c1.hashCode()+"\t"+c2.hashCode());
		
		System.out.println(c1.add(40.0f,30.0f));
		System.out.println(c2.add(25.0f,75.0f));
		
		System.out.println(c1.hashCode()+"\t"+c2.hashCode());
		
		
	}

}
