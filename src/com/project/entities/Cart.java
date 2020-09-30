package com.project.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="cart")
public class Cart implements Serializable{

	@Id
	@Column(name="product_id")
	private int product_id;
	@Column(name="product_name")
	private String product_name;
	@Column(name="price_per_unit")
	private double price_per_unit;
	@Column(name="quantity")
	private int quantity;
	@Column(name="total_price")
	private double total_price;
	@Column(name="vendor_id")
	private int vendor_id;
	@Column(name="image_path")
	private String image_path;
	
	public Cart()
	{
		this(0,"",0.0,0,0.0,0,"");
	}
	public Cart(int product_id, String product_name, double price_per_unit,
			int quantity, double total_price, int vendor_id,String image_path) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price_per_unit = price_per_unit;
		this.quantity = quantity;
		this.total_price = total_price;
		this.vendor_id = vendor_id;
		this.image_path=image_path;
	}
	
	
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	
	
	
	
}
