package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entities.Cart;
import com.project.entities.CustomerProduct;
import com.project.entities.Product;
import com.project.entities.User;
import com.project.models.entUser;
import com.project.service.CustomerServices;
import com.project.service.LoginServices;
import com.project.service.VendorServices;
@Controller
public class CustomerController {
	@Autowired
	private LoginServices customerservices;

	@RequestMapping("/changepasswordcustomer")
	public String updatePassword( @Valid @ModelAttribute("command") User user2,BindingResult res,HttpSession session)
	{
		
	User user1 =(User)session.getAttribute("user");	
	user1.setPassword(user2.getPassword());
	

	boolean b1=customerservices.updatepassword(user1);
//		System.out.println(user1.getFirst_name());
		if(user1==null)
			return "t_cchangepassword";
		
		if(b1)
			return "t_customerAccount";
		else
			return "redirect:t_customerAccount";

	}

	@RequestMapping("/changeaddresscustomer")
	public String updateAddress( @Valid @ModelAttribute("command") User user2,BindingResult res,HttpSession session)
	{
		
		User user1=(User)session.getAttribute("user");
		System.out.println(user1);
		System.out.println(user2.getCity());
		System.out.println(user2.getAddress());
		System.out.println(user2.getPincode());
		
		//user1.setAddress(user2.getAddress());
		//user1.setCity(user2.getCity());
		//user1.setPincode(user2.getPincode());
		//System.out.println(user1.getPhone_no());


	boolean b1=customerservices.updateAddress(user1);
	//System.out.println(user1.getFirst_name());
		if(user1==null)
			return "t_cchangeaddress";
		
		if(b1)
			return "t_customerAccount";
		else
			return "redirect:t_customerAccount";

	}

	/////////////////////////////////////
	/////////////////////////Change mobile no Admin////////////////////////////////
	/////////////////////////

	@RequestMapping("/changemobilecustomer")
	public String changeMobilenoAdmin(@Valid @ModelAttribute User user,BindingResult res,HttpSession session)
	{
		User user1=(User)session.getAttribute("user");
		user1.setPhone_no(user.getPhone_no());
		boolean b1=customerservices.updatemobile(user1);
		//System.out.println(user1.getFirst_name());
			if(user1==null)
				return "t_cchangemobile";
			
			if(b1)
				return "t_customerAccount";
			else
		 		return "redirect:t_customerAccount";
		
	}
	
	
	@RequestMapping("/addtocart")
	public String addvendorproduct(@Valid @ModelAttribute Product product,BindingResult res,HttpSession session)
	{
		
		double price=product.getPrice();
		int quantity=product.getQuantity();
		double total_price=quantity*price;
		System.out.println(total_price);
		Cart cart=new Cart(product.getGardening_id(),product.getItems_name(),product.getPrice(),product.getQuantity(),total_price,product.getVendor_id(),product.getImage_path());
		boolean b1=customerservices.insertCart(cart);
		List<CustomerProduct> all_customer_product=customerservices.showallCustomerProducts();
		session.setAttribute("allcustomerproduct",all_customer_product);
		
		return "t_customerAccount";
		
		
	}

}
