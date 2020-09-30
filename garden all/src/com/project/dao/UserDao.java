package com.project.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.entities.AdminBusiness;
import com.project.entities.Cart;
import com.project.entities.CustomerProduct;
import com.project.entities.Orders;
import com.project.entities.Product;
import com.project.entities.User;
import com.project.entities.VendorBusiness;
import com.project.models.entUser;

@Repository
public class UserDao
{
	
	private Session session;
	
	@Autowired
	private SessionFactory factory;

	@Transactional(readOnly=true)
	public User findUser(int id)
	{
		User u = (User) session.get(User.class, id);
		return u;
	}
	
	
	@Transactional(readOnly=true)
	public Product findProduct(int id)
	{
		Session session = factory.getCurrentSession();
		
		Criteria cr = session.createCriteria(Product.class);
		cr.add(Restrictions.eq("gardening_id",id));
		return  (Product) cr.uniqueResult();

	}
	
	
	@Transactional(readOnly=true)
	public User findUser(User user)
	{
	
		Session session = factory.getCurrentSession();
	
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("email_id",user.getEmail_id()));
		return  (User) cr.uniqueResult();
	
	}
	@Transactional(readOnly=true)
	public Cart findCart(int id)
	{
	
		Session session = factory.getCurrentSession();
	
		Criteria cr = session.createCriteria(Cart.class);
		cr.add(Restrictions.eq("product_id",id));
		return  (Cart) cr.uniqueResult();
	
	}
	
	public Cart findCart(Cart cart)
	{
	
		Session session = factory.getCurrentSession();
	
		Criteria cr = session.createCriteria(Cart.class);
		cr.add(Restrictions.eq("product_id",cart.getProduct_id()));
		return  (Cart) cr.uniqueResult();
	
	}
	
	@Transactional(readOnly=true)
	public User findUser2(User user)
	{
		Session session=factory.getCurrentSession();
		User u = (User) session.get(User.class, user.getUser_id());
		return u;
	}
	
	@Transactional
	public boolean insertUser(User user)
	{
		System.out.println(user);
		//User user1= new User(user.getFirst_name(),user.getMiddle_name(),user.getLast_name(),user.getPhone_no(),user.getAddress(),user.getCity(),user.getPincode(),user.getEmail_id(),user.getPassword(),user.getRole());
		session=factory.getCurrentSession();
		session.save(user);
		return true;
	}

	
	

	@Transactional
	public boolean insertProduct(Product product)
	{
		System.out.println(product);
		//User user1= new User(user.getFirst_name(),user.getMiddle_name(),user.getLast_name(),user.getPhone_no(),user.getAddress(),user.getCity(),user.getPincode(),user.getEmail_id(),user.getPassword(),user.getRole());
		session=factory.getCurrentSession();
		session.save(product);
		return true;
	}
	

	/*@Transactionalin
	 * 
	public boolean insertadminBusiness(AdminBusiness ab)
	{
		session=factory.getCurrentSession();
		String str= "insert into garden.admin_business values("+ab.getId()+","+ab.getUser_id()+","+ab.getOrder_price()+",sysdate())";
		System.out.print("query="+str);
		Query query=session.createQuery(str);
		int res=query.executeUpdate();
		
		return true;
	}
	*/
	@Transactional
	public boolean insertadminBusiness(AdminBusiness ab)
	{
		System.out.println(ab);
		session=factory.getCurrentSession();
		session.save(ab);	
	
		
		return true;
	}
	
	
	@Transactional
	public boolean insertvendorBusiness(VendorBusiness vendorBusiness)
	{
		System.out.println(vendorBusiness);
		session=factory.getCurrentSession();
		session.save(vendorBusiness);	
		return true;
	}
	
	@Transactional
	public boolean insertOrders(Orders orders)
	{
		System.out.println(orders);
		//User user1= new User(user.getFirst_name(),user.getMiddle_name(),user.getLast_name(),user.getPhone_no(),user.getAddress(),user.getCity(),user.getPincode(),user.getEmail_id(),user.getPassword(),user.getRole());
		session=factory.getCurrentSession();
		session.save(orders);
		return true;
	}
	
	@Transactional
	public boolean insertCutomerProduct(CustomerProduct customerproduct)
	{
		System.out.println(customerproduct);
		//User user1= new User(user.getFirst_name(),user.getMiddle_name(),user.getLast_name(),user.getPhone_no(),user.getAddress(),user.getCity(),user.getPincode(),user.getEmail_id(),user.getPassword(),user.getRole());
		Session	session=factory.getCurrentSession();
		session.save(customerproduct);
		return true;
	}
	
	@Transactional
	public boolean insertCart(Cart cart)
	{
		System.out.println(cart);
		//User user1= new User(user.getFirst_name(),user.getMiddle_name(),user.getLast_name(),user.getPhone_no(),user.getAddress(),user.getCity(),user.getPincode(),user.getEmail_id(),user.getPassword(),user.getRole());
		Session	session=factory.getCurrentSession();
		session.save(cart);
		return true;
	}
	
	
	@Transactional
	public boolean deletecart(int id)
	{
		System.out.println(id);
		Session	session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(Cart.class);
		cr.add(Restrictions.eq("product_id",id));
		Cart cart= (Cart) cr.uniqueResult();

		//User user1= new User(user.getFirst_name(),user.getMiddle_name(),user.getLast_name(),user.getPhone_no(),user.getAddress(),user.getCity(),user.getPincode(),user.getEmail_id(),user.getPassword(),user.getRole());

		session.delete(cart);
		return true;
	}
	
	
	@Transactional(readOnly=true)
	public Product findProduct(Product product)
	{
	
		Session session = factory.getCurrentSession();
	
		Criteria cr = session.createCriteria(Product.class);
		cr.add(Restrictions.eq("getGardening_id",product.getItems_name()));
		cr.add(Restrictions.eq("getGardening_id",product.getVendor_name()));
		return  (Product) cr.uniqueResult();
	
	}
	
	
	@Transactional(readOnly=true)
	public Product findCustomerProduct(Product product)
	{
	
		System.out.println(product.getVendor_name()+" "+product.getItems_name());
		Session session = factory.getCurrentSession();
	
		Criteria cr = session.createCriteria(Product.class);
		cr.add(Restrictions.eq("items_name",product.getItems_name()));
		cr.add(Restrictions.eq("vendor_name",product.getVendor_name()));
		return  (Product) cr.uniqueResult();
	
	}
	
	
	
	@Transactional
	public boolean updatePassword_dao(User user)
	{
		/*User user1=new User(user.getEmail_id());
		user1.setPassword(user.getPassword());  */
		session=factory.getCurrentSession();
		//System.out.println(user.getEmail_id());
		//System.out.println(user.getFirst_name());
		session.update(user);
		return true;		
	}
	@Transactional
	public boolean updateMobileno_dao(User user)
	{
		/*User user1=new User(user.getEmail_id());
		user1.setPassword(user.getPassword());  */
		session=factory.getCurrentSession();
		//System.out.println(user.getEmail_id());
		//System.out.println(user.getFirst_name());
		session.update(user);
		return true;		
	}
	
	
	@Transactional
	public boolean updateAddress_dao(User user)
	{
		User user1=new User(user.getEmail_id());
		user1.setAddress(user.getAddress()); 
		user1.setCity(user.getCity());
		user1.setPincode(user.getPincode());
		session=factory.getCurrentSession();
		//System.out.println(user.getEmail_id());
		//System.out.println(user.getFirst_name());
		session.update(user);
		return true;		
	}
	@Transactional
	public boolean changeMobileno_dao(User user)
	{
		User user1=new User(user.getEmail_id());
		user1.setPhone_no(user.getPhone_no());
		session=factory.getCurrentSession();
		session.update(user);
		return true;
		
	}
/*	public void deleteBook(User u) 
	{
		Transaction tx = session.beginTransaction();
		try {
			session.delete(u);
			tx.commit();
			System.out.println("BOOK DELETED : " + u);
		}catch(Exception ex){
			tx.rollback();
		}
	}
	*/
	@Transactional
	public List<User> getAllUsers() 
	{
		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(User.class);
		cr.addOrder(Order.asc("id"));
		List<User> list = cr.list();
		return list;
	}
	
	@Transactional
	public List<Cart> showCart() 
	{
		/*
		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(Cart.class);
		List<Cart> list = cr.list();
		return list;*/

		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(Cart.class);
		cr.addOrder(Order.asc("product_id"));
		
		List<Cart> list = cr.list();
		for (Cart cart : list) {
			System.out.println(cart.getImage_path());
		}
		return list; 
	}
	
	@Transactional
	public List<Orders> getAllOrders(int id) 
	{
		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(Orders.class);
		cr.add(Restrictions.eq("user_id",id));
		cr.addOrder(Order.asc("id"));
		List<Orders> list = cr.list();
		return list;
	}

	@Transactional
	public List<Product> getAllProductsByType(String type ) 
	{
		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(Product.class);
		cr.add(Restrictions.eq("items_type",type));
		cr.addOrder(Order.asc("id"));
		List<Product> list = cr.list();
		return list;
	}

	
	@Transactional
	public List<CustomerProduct> getAllCustomerProductsByType(String type ) 
	{
		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(CustomerProduct.class);
		cr.add(Restrictions.eq("items_type",type));
		cr.addOrder(Order.asc("id"));
		List<CustomerProduct> list = cr.list();
		return list;
	}

	@Transactional
	public List<Product> getAllProducts() 
	{
		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(Product.class);
		List<Product> list = cr.list();
		return list;
	}

	@Transactional
	public List<CustomerProduct> getAllCustomerProducts() 
	{
		Session session=factory.getCurrentSession();
		Criteria cr = session.createCriteria(CustomerProduct.class);
		List<CustomerProduct> list = cr.list();
		return list;
	}
	
	
	
	
	public List<User> subUser(String email)
	{
		Criteria cr = session.createCriteria(User.class);
		cr.add( Restrictions.eq("email_id", email));
		List<User> list = cr.list();
		return list;
	}
	
	public List<String> getUserName() 
	{
		String sql = "SELECT DISTINCT first_name FROM User1";
		SQLQuery q = session.createSQLQuery(sql);
		return q.list();
	}
	
	@Transactional
	public String getDailyBusiness()
	{
		Session session=factory.getCurrentSession();
		String sql = "select sum(order_price) from  garden.admin_business where order_date >=curdate()";
		SQLQuery q = session.createSQLQuery(sql);
		System.out.println(q.uniqueResult());
		return q.uniqueResult().toString();
	}
	
	

	@Transactional
	public void clearCart()
	{
		Session session=factory.getCurrentSession();
		String sql = "delete from cart";
		SQLQuery q = session.createSQLQuery(sql);
		q.executeUpdate();
		
	}

	
	
	@Transactional
	public String getWeeklyBusiness()
	{
		Session session=factory.getCurrentSession();
		String sql = "select sum(order_price) from  garden.admin_business where order_date >=now()-INTERVAL 7 DAY";
		SQLQuery q = session.createSQLQuery(sql);
		System.out.println(q.uniqueResult());
		return q.uniqueResult().toString();
	}
	@Transactional
	public String getMonthlyBusiness()
	{
		Session session=factory.getCurrentSession();
		String sql = "select sum(order_price) from  garden.admin_business where order_date >=now()-INTERVAL 31 DAY";
		SQLQuery q = session.createSQLQuery(sql);
		System.out.println(q.uniqueResult());
		return q.uniqueResult().toString();
	}
	@Transactional
	public String getYearlyBusiness()
	{
		Session session=factory.getCurrentSession();
		String sql = "select sum(order_price) from  garden.admin_business where order_date >=now()-INTERVAL 365 DAY";
		SQLQuery q = session.createSQLQuery(sql);
		System.out.println(q.uniqueResult());
		return q.uniqueResult().toString();
	}
	
}