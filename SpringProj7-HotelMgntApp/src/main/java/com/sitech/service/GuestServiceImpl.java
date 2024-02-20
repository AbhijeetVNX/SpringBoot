package com.sitech.service;

import com.sitech.dao.IGuestDAO;
import com.sitech.dto.GuestInfoDTO;

public class GuestServiceImpl implements IGuestService {
	
	IGuestDAO dao;
	

	public GuestServiceImpl(IGuestDAO dao) {
		System.out.println("GuestServiceImpl.GuestServiceImpl()--1 param cons");
		this.dao = dao;
	}

	public String registerGuest(GuestInfoDTO dto) {
			
		return null;
	}

}
