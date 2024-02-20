package com.sitech.dao;

import javax.sql.DataSource;

import com.sitech.bo.GuestInfoBO;

public class GuestDAOImpl implements IGuestDAO {

	DataSource ds;
	
	public GuestDAOImpl(DataSource ds) {
		System.out.println("GuestDAOImpl.GuestDAOImpl()--1 param cons");
	}
	
	public int insert(GuestInfoBO bo) {
		
		
		return 0;
	}

}
