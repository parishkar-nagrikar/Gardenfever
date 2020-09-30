package com.project.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CustomerProduct")
public class CustomerProduct implements Serializable
{
	@Id
	@Column(name="gardening_id")
	//@SequenceGenerator(name="gardeningid",sequenceName="seq_gardeningid",allocationSize=1,initialValue=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gardeningid")
	private int gardening_id;
	@Column(name="vendor_id")
	private int vendor_id;
	@Column(name="items_name")
	private String items_name;
	@Column(name="items_type")
	private String items_type;
	@Column(name="items_description")
	private String description;
	@Column(name="items_price")
	private double price;
	@Column(name="items_quantity")
	private int quantity;
	@Column(name="vendor_name")
	String vendor_name;
	@Column(name="subscription_period")
	private int subscription_period;
	
	@Column(name="image_path")
	private String image_path;
	
	public CustomerProduct()
	{
		this(0,0,0,"","","",0,0,"","");
	}
	public CustomerProduct(int gardening_id,int vendor_id,int subscription_period, String items_name,
			String items_type, String description, double price, int quantity,String image_path,String vendor_name) {
		super();
		this.gardening_id = gardening_id;
		this.vendor_id=vendor_id;
		this.subscription_period=subscription_period;
		this.items_name = items_name;
		this.items_type = items_type;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.image_path=image_path;
		this.vendor_name=vendor_name;
	}
	
	
	
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public int getGardening_id() {
		return gardening_id;
	}
	public void setGardening_id(int gardening_id) {
		this.gardening_id = gardening_id;
	}
	public int getSubscription_period() {
		return subscription_period;
	}
	public void setSubscription_period(int subscription_period) {
		this.subscription_period = subscription_period;
	}
	public String getItems_name() {
		return items_name;
	}
	public void setItems_name(String items_name) {
		this.items_name = items_name;
	}
	public String getItems_type() {
		return items_type;
	}
	public void setItems_type(String items_type) {
		this.items_type = items_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "GardeningItems [gardening_id=" + gardening_id + ", items_name="
				+ items_name + ", items_type=" + items_type + ", description="
				+ description + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
}
