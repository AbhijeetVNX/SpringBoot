package com.sitech.controller;

import com.sitech.service.IGuestService;

public class MainController {
	
	IGuestService service;

	public MainController(IGuestService service) {
		System.out.println("MainController.MainController()--1 param con");
		
		this.service = service;
	}
	
	

}
