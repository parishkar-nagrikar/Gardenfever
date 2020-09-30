package com.project.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.entities.User;
import com.project.models.Login;
import com.project.models.entUser;
import com.project.service.LoginServices;/*
import com.sun.org.apache.xpath.internal.operations.Bool;*/

@Controller
public class RegisterController {

	@Autowired
	private LoginServices loginservices;

	/*@RequestMapping("register")
	public ModelAndView showLoginPage()
	{
		entUser entuser=new entUser();
		ModelAndView mav=new ModelAndView("t_register", "command", entuser);
		return mav;
	}*/
	@RequestMapping("/process")
	public String insertUser( @Valid @ModelAttribute("command") User user,BindingResult res,HttpSession session)
	{
		/*if(res.hasErrors()) {
			return "t_register";
		}*/
		
		boolean b1=loginservices.insert(user);

		//session.setAttribute("user", user);
		if(user==null)
			return "t_register";
		
		if(b1)
			return "t_account";
		else
			return "redirect:t_register";

}

	
}
