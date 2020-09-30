package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.entities.User;

@Service
public class VendorServices 
{
	
	@Autowired
	private UserDao userdao;
	
}
