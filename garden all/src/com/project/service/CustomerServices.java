package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.entities.CustomerProduct;
import com.project.entities.User;

@Service
public class CustomerServices
{
	
	@Autowired
	private UserDao userdao;
	

	
	public User update(User user2)
	{
	User user=userdao.findUser(user2);
		
		return user;
	}
	
	public boolean updatepassword(User user2)
	{
		boolean result=userdao.updatePassword_dao(user2);
		
		return false;
	}
	public boolean insertCustomerProduct(CustomerProduct customerproduct)
	{
		boolean result=userdao.insertCutomerProduct(customerproduct);
	if(result)
		return true;
	
		return false;
	}
	
	
	
	}
