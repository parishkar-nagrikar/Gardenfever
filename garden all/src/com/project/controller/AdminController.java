package com.project.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.entities.CustomerProduct;
import com.project.entities.Product;
import com.project.entities.User;
import com.project.models.Sample;
import com.project.models.entUser;
import com.project.service.AdminServices;
import com.project.service.CustomerServices;
import com.project.service.LoginServices;

@Controller
public class AdminController 
{
@Autowired
private LoginServices adminServices;
@RequestMapping("/settingadmin")
public ModelAndView showSettingPage()
{
	entUser entuser=new entUser();
	ModelAndView mav=new ModelAndView("t_settingadmin", "command", entuser);
	return mav;
}



@RequestMapping("/changeaddressadmin")
public String updateAddress( @Valid @ModelAttribute("command") entUser user2,BindingResult res,HttpSession session)
{
	
User user1=(User)session.getAttribute("user");
//System.out.println(user1);
System.out.println(user2.getCity());
System.out.println(user2.getAddress());
System.out.println(user2.getPincode());
user1.setAddress(user2.getAddress());
user1.setCity(user2.getCity());
user1.setPincode(user2.getPincode());
//System.out.println(user1.getPhone_no());

boolean b1=adminServices.updateAddress(user1);
//System.out.println(user1.getFirst_name());
	if(user1==null)
		return "t_changeaddress";
	
	if(b1)
		return "t_adminAccount";
	else
		return "redirect:t_adminAccount";

	/*entUser entuser=new entUser();
	ModelAndView mav=new ModelAndView("t_default", "command", entuser);
	return mav;
*/
}


@RequestMapping("/changemobileadmin")
public String changeMobilenoAdmin(@Valid @ModelAttribute User user2,BindingResult res,HttpSession session)
{

	User user1=(User)session.getAttribute("user");
	
	user1.setPhone_no(user2.getPhone_no());
	boolean b1=adminServices.updatemobile(user1);
	//System.out.println(user1.getFirst_name());
		if(user1==null)
			return "t_changemobile";
		
		if(b1)
			return "t_adminAccount";
		else
	 		return "redirect:t_adminAccount";
	
}

@RequestMapping("/changepasswordadmin")
public String changepasswordAdmin(@Valid @ModelAttribute User user2,BindingResult res,HttpSession session)
{
	User user1=(User)session.getAttribute("user");
	
	user1.setPassword(user2.getPassword());
	boolean b1=adminServices.updatemobile(user1);
	//System.out.println(user1.getFirst_name());
		if(user1==null)
			return "t_changepassword";
		
		if(b1)
			return "t_adminAccount";
		else
	 		return "redirect:t_adminAccount";
	
}

@RequestMapping("/addvendorproduct")
public String addvendorproduct(@Valid @ModelAttribute Product product,BindingResult res,HttpSession session)
{
System.out.println("ajinkya"+product.getItems_name());
double price=(product.getPrice()*90)/100;
	Product product1=adminServices.getCustomerProduct(product);
	CustomerProduct customerproduct=new CustomerProduct(product1.getGardening_id(),product1.getVendor_id(),product1.getSubscription_period(),product1.getItems_name(),product1.getItems_type(),product1.getDescription(),price,product1.getQuantity(),product1.getImage_path(),product1.getVendor_name());
	
	boolean b1=adminServices.insertCustomerProduct(customerproduct);
	
	return "t_adminAccount";
	
	
}

	
}
