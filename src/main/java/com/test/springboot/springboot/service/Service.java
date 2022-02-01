package com.test.springboot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.springboot.springboot.dao.Dao;



@Component
public class Service {
	
	@Autowired
	Dao dao;
	
	
	Service(Dao dao){
		System.out.println("Bean created successfully");
		this.dao = dao;
		
	}
	public void save() {
		dao.create();
	}
}
