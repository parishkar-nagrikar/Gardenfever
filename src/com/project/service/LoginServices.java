package com.project.service;

import java.util.List;

import oracle.net.aso.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.*;
import com.project.entities.AdminBusiness;
import com.project.entities.Cart;
import com.project.entities.CustomerProduct;
import com.project.entities.Orders;
import com.project.entities.Product;
import com.project.entities.User;
import com.project.entities.VendorBusiness;
import com.project.models.*;

@Service
public class LoginServices {
	@Autowired
	private LoginDao loginDao;
	@Autowired
	private UserDao userdao;
	public User update(User user2)
	{
		User user=userdao.findUser(user2);
		return user;
	}
	public boolean updateAddress(User user)
	{
		boolean result=userdao.updateAddress_dao(user);
	
		return result;
	}
	
	public boolean updatemobile(User user)
	{
		boolean result=userdao.updateMobileno_dao(user);
	
		return result;
	}
	public boolean updatepassword(User user)
	{
		boolean result=userdao.updatePassword_dao(user);
	
		return result;
	}
	public User validate(User user)
	{
		User user1=loginDao.findUser(user);
		return user1;
	
	}
	
	public Product validateProduct(int id)
	{
		Product product=userdao.findProduct(id);
		return product;
	
	}
	
	public boolean insert(User user)
	{
		boolean result=userdao.insertUser(user);
	if(result)
		return true;
	
		return false;
	}
	
	public boolean insertProduct(Product product)
	{
		boolean result=userdao.insertProduct(product);
	if(result)
		return true;
	
		return false;
	}
	public boolean insertCart(Cart cart)
	{
		boolean result=userdao.insertCart(cart);
	if(result)
		return true;
	
		return false;
	}
	public boolean insertCustomerProduct(CustomerProduct customerproduct)
	{
		boolean result=userdao.insertCutomerProduct(customerproduct);
	if(result)
		return true;
	
		return false;
	}
	
	
	public List<Orders> showOrderDetails(int user_id)
	{
		List<Orders> list=userdao.getAllOrders(user_id);
	
		
		return list;
	}
	public void deletecart()
	{
		userdao.clearCart();
	}
	
	public void deletefromcart(int id)
	{
		userdao.deletecart(id);
	}
	
	
	public String showdailybusiness()
	{
		System.out.println(userdao.getDailyBusiness());
		return userdao.getDailyBusiness();
	}
	public String showweeklybusiness()
	{
		System.out.println(userdao.getWeeklyBusiness());
		return userdao.getWeeklyBusiness();
	}
	public String showmonthlybusiness()
	{
		System.out.println(userdao.getMonthlyBusiness());
		return userdao.getMonthlyBusiness();
	}
	public String showyearlybusiness()
	{
		System.out.println(userdao.getYearlyBusiness());
		return userdao.getYearlyBusiness();
	}
	
	public List<Product> showProductByType(String type)
	{
		return userdao.getAllProductsByType(type);
	}
	
	public List<Product> showallProducts()
	{
		return userdao.getAllProducts();
	}
	
	public List<Cart> showCart()
	{
		
		return userdao.showCart();
	}
	
	public List<CustomerProduct> showallCustomerProducts()
	{
		return userdao.getAllCustomerProducts();
	}
	
	public Product getProduct(Product product)
	{
		return userdao.findProduct(product);
	}
	
	public Product getCustomerProduct(Product product)
	{
		product.getPrice();
		return userdao.findCustomerProduct(product);
	}
	
	public boolean insertadminBusiness(AdminBusiness adminbusiness)
	{

		System.out.println(adminbusiness.toString());
		return userdao.insertadminBusiness(adminbusiness);
	}
	
	public boolean insertVendorBusiness(VendorBusiness vendorbusiness)
	{

		return userdao.insertvendorBusiness(vendorbusiness);
	}
	
	public boolean insertOrders(Orders orders)
	{

		return userdao.insertOrders(orders);
	}
	}
	

