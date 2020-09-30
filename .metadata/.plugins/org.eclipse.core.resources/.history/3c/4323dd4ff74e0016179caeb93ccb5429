package com.project.entities;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="orders_details")
public class Orders {

	@Id
	@Column(name="ID")
//	@SequenceGenerator(name="order_id",sequenceName="seq_order_details",allocationSize=1,initialValue=1)
//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="order_id")
	private int id;
	@Column(name="user_id")
	private int user_id;
	@Column(name="order_date")
	private String order_Date;
	@Column(name="qty")
	private int quantity;
	@Column(name="price")
	private double price;
	@Column(name="Product_name")
	private String product_name;
	public Orders()
	{
		this(0,0,null,0,0.0,"");
	}
	public Orders(int id,int user_id, String order_Date, int quantity, double price,String product_name) {
		super();
		this.product_name=product_name;
		this.id=id;
		this.user_id = user_id;
		this.order_Date = order_Date;
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", user_id=" + user_id + ", order_Date="
				+ order_Date + ", quantity=" + quantity + ", price=" + price
				+ ", product_name=" + product_name + "]";
	}
	public String getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(String order_Date) {
		this.order_Date = order_Date;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	
}
