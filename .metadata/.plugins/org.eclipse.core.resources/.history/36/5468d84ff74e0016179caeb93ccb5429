package com.project.controller;


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import oracle.sql.DATE;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.session.HttpSessionCreatedEvent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.UserDao;
import com.project.entities.AdminBusiness;
import com.project.entities.Cart;
import com.project.entities.Orders;
import com.project.entities.Product;
import com.project.entities.User;
import com.project.entities.VendorBusiness;
import com.project.models.Login;
import com.project.models.entUser;
import com.project.service.LoginServices;


@Controller
public class NoAcctionController {



	@Autowired
	private LoginServices loginservices;
	
	@RequestMapping("account")
	public ModelAndView showLoginPage()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_account", "command", user);
		return mav;
	}

	
	@RequestMapping("register")
	public ModelAndView showRegisterPage()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_register", "command", user);
		return mav;
	}
	@RequestMapping("aboutus")
	public ModelAndView showAboutUs()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_aboutus", "command", user);
		return mav;
	}
	
	@RequestMapping("cart")
	public String showCart(Model model,HttpSession session)
	{
		double grand_total=0.0;
		List<Cart> cart_list=loginservices.showCart();
		for (Cart cart_product : cart_list) 
		{
				
	grand_total=grand_total+cart_product.getTotal_price();
		}
		model.addAttribute("grand_total", grand_total);
		session.setAttribute("cart_list", cart_list);
		
	return "t_cart";	
	}
	@RequestMapping("contact")
	public ModelAndView showContactPage()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_contact", "command", user);
		return mav;
	}
	@RequestMapping("fertilizer")
	public String showFertilizer(Model model,HttpSession session)
	{
		List<Product> fer_product_list=loginservices.showProductByType("Fertilizer");
		for (Product product : fer_product_list) 
		{
			System.out.println(product.getImage_path());	
			
		}
		System.out.println();
		//model.addAttribute("fer_product_list", fer_product_list);
		session.setAttribute("fer_product_list", fer_product_list);
		return "t_fertilizer";
	}
	@RequestMapping("seeds")
	public String showSeeds(HttpSession session)
	{
		List<Product> seeds_product_list=loginservices.showProductByType("Seeds");
		for (Product product : seeds_product_list) {
			System.out.println(product.getImage_path());
			
			
		}
		session.setAttribute("seeds_product_list", seeds_product_list);
		return "t_seeds";
	}
	@RequestMapping("default")
	public String showHome(HttpSession session,Model model) 
	{
		
		Date date=new Date();
		String sysdate=date.toString();
		String arr[]=sysdate.split(" ");
		String actdate=arr[2]+" "+arr[1]+" "+arr[5];
		System.out.println(actdate);
		System.out.println(date.toString());
		List<Product> all_product_list=loginservices.showallProducts();
	for (Product product : all_product_list) {
		System.out.println(product);
	}
		model.addAttribute("all_product_list", all_product_list);
		session.setAttribute("all_product_list", all_product_list);	
		session.setAttribute("sysdate", sysdate);	

		return "t_default";

	}
	
	@RequestMapping("logout")
	public String showLogout(HttpSession session,Model model)
	{
	System.out.println("in logout");
		loginservices.deletecart();
		List<Product> all_product_list=loginservices.showallProducts();
		for (Product product : all_product_list) {
			System.out.println(product);
		}
			model.addAttribute("all_product_list", all_product_list);
			session.setAttribute("all_product_list", all_product_list);	
		session.invalidate();
		return "t_default";
	}
	
	@RequestMapping("toolsandmachine")
	public String showToolsAndMachine(HttpSession session)
	{
		List<Product> tools_product_list=loginservices.showProductByType("tools");
		for (Product product : tools_product_list) {
			System.out.println(product.getImage_path());
			
			
		}
		session.setAttribute("tools_product_list", tools_product_list);
	
		//session.setAttribute("tools_product_list", tools_product_list);
		return "t_toolsandmachine";
		
	}
	
	@RequestMapping("dailybusiness")
	public String showdailybusiness(Model model)
	{
		User user=new User();
		String db=loginservices.showdailybusiness();
		model.addAttribute("db", db);
		return "t_dailybusiness";
	}
	
	@RequestMapping("weeklybusiness")
	public String showweeklybusiness(Model model)
	{
		User user=new User();
		String wb=loginservices.showweeklybusiness();
		model.addAttribute("wb", wb);
		return "t_weeklybusiness";
	}
	
	@RequestMapping("monthlybusiness")
	public String showmonthlybusiness(Model model)
	{
		User user=new User();
		String mb=loginservices.showmonthlybusiness();
		model.addAttribute("mb", mb);
		return "t_monthlybusiness";
	}
	
	@RequestMapping("yearlybusiness")
	public String showyearlybusiness(Model model)
	{
		User user=new User();
	String yb=loginservices.showyearlybusiness();
	model.addAttribute("yb", yb);
	return "t_yearlybusiness";
	}
	
	@RequestMapping("cchangepassword")
	public ModelAndView showcchangepassword()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_cchangepassword", "command", user);
		return mav;
	}
	@RequestMapping("changepassword")
	public ModelAndView showchangepassword()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_changepassword", "command", user);
		return mav;
	}
	@RequestMapping("vchangepassword")
	public ModelAndView showvchangepassword()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_vchangepassword", "command", user);
		return mav;
	}
	
	@RequestMapping("cchangeaddress")
	public ModelAndView showcchangeaddress()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_cchangeaddress", "command", user);
		return mav;
	}
	@RequestMapping("changeaddress")
	public ModelAndView showchangeaddress()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_changeaddress", "command", user);
		return mav;
	}
	
	@RequestMapping("vchangeaddress")
	public ModelAndView showvchangeaddress()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_vchangeaddress", "command", user);
		return mav;
	}
	
	
	
	@RequestMapping("cchangemobile")
	public ModelAndView showcchangemobile()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_cchangemobile", "command", user);
		return mav;
	}
	
	@RequestMapping("changemobile")
	public ModelAndView showchangemobile()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_changemobile", "command", user);
		return mav;
	}
	
	@RequestMapping("vchangemobile")
	public ModelAndView showvchangemobile()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_vchangemobile", "command", user);
		return mav;
	}
	
	@RequestMapping("sellproduct")
	public ModelAndView showsellproduct()
	{
		Product product=new Product();
		ModelAndView mav=new ModelAndView("t_sellproduct", "command", product);
		return mav;
	}
	
	@RequestMapping("wishlist")
	public ModelAndView showWishlist()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_wishlist", "command", user);
		return mav;
	}
	
	@RequestMapping("paymentdetails")
	public ModelAndView showpaymentdetails()
	{
		User user=new User();
		ModelAndView mav=new ModelAndView("t_paymentdetails", "command", user);
		return mav;
	}
	
	@RequestMapping("orderdetails")
	public String orderdetails(Model model, HttpSession session)
	{
		User user=(User)session.getAttribute("user");
		List<Orders> order_list=loginservices.showOrderDetails(user.getUser_id());
		model.addAttribute("order_list",order_list);
		return "t_orderdetails";
	}
	
	@RequestMapping("/Buy")
	public String BuyProduct(@Valid @ModelAttribute Product product ,BindingResult res,HttpSession session,Model model)
	{
		
		//Product product=loginservices.validateProduct(32);
		//System.out.println(cart.getProduct_id());
		double grand_total=0.0;
		List<Cart> cart_list=loginservices.showCart();
		for (Cart cart_product : cart_list) 
		{
				
			grand_total=grand_total+cart_product.getTotal_price();
		}
		double tenper=0.1*grand_total;
		double twenty=0.9*grand_total;
		User user=(User)session.getAttribute("user");
		Date date=new Date();
		System.out.println(date);
		String sysdate=date.toString();
		System.out.println(product);
		String arr[]=sysdate.split(" ");
		String actdate=arr[2]+"-"+arr[1]+"-"+arr[5];

		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String dat=sd.format(date);
		Orders order_details=new Orders(0,user.getUser_id(),dat,product.getQuantity(),product.getPrice(),product.getItems_name());

		System.out.println(order_details);
		
		System.out.println(dat);
		VendorBusiness vendorbusiness=new VendorBusiness(product.getVendor_id(),twenty,dat);
		AdminBusiness adminbusiness=new AdminBusiness(0,user.getUser_id(),tenper,dat);
		//loginservices.insertOrders(order_details);
		loginservices.insertadminBusiness(adminbusiness);
		
		loginservices.insertVendorBusiness(vendorbusiness);
		loginservices.insertOrders(order_details);
		
		System.out.println("Ajinkya Product"+product.toString());
		return "t_buy";
	}
	
	@RequestMapping("deletefromcart")
	public String deleteCart(@RequestParam("prodid") Integer prodid)
			{
		loginservices.deletefromcart(prodid);
				
		return "redirect:cart";
			}
	
	
}