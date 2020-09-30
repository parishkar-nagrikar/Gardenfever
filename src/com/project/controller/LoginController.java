package com.project.controller;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.session.HttpSessionCreatedEvent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.entities.CustomerProduct;
import com.project.entities.Product;
import com.project.entities.User;
import com.project.models.Login;
import com.project.models.entUser;
import com.project.service.LoginServices;


@Controller
public class LoginController
{
	@Autowired
	private LoginServices loginservices;
		
	
	@RequestMapping("/welcome")
	public String loginCheck( @Valid @ModelAttribute("command") User user,BindingResult res,HttpSession session)
	{		
		User user1 = loginservices.validate(user);
		
		if(user1.getEmail_id().equals(user.getEmail_id())&&user1.getPassword().equals(user.getPassword()) && (user1.getRole().equalsIgnoreCase("admin")))
		{
			List<Product> all_product=loginservices.showallProducts();
		//	model.addAttribute("all_product_list", all_product_list);
	//		session.setAttribute("all_product", all_product);
			
			
			session.setAttribute("user", user1);
			session.setAttribute("allproduct", all_product);
			//		System.out.println(user.getEmail_id());
			return "t_adminAccount";
		}		
			else if((user1.getPassword().equals(user.getPassword()) && (user1.getRole().equalsIgnoreCase("customer"))))
				{
				session.setAttribute("user", user1);
				List<CustomerProduct> all_customer_product=loginservices.showallCustomerProducts();
				session.setAttribute("allcustomerproduct",all_customer_product);
				return "t_customerAccount";
				}
			else if((user.getPassword().equals(user.getPassword()) && (user1.getRole().equalsIgnoreCase("vendor"))))
			{
				session.setAttribute("user", user1);
				return "t_vendorAccount";
			}
			else
				return "t_failed";
			
		}
	
	
	
}

