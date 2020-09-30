package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import java.util.*;
@Component
@Entity
@Table(name="vendor_business")
public class VendorBusiness {
	@Id
	@Column(name="ID")
//	@SequenceGenerator(name="vendor_id",sequenceName="seq_vendor_business",allocationSize=1,initialValue=1)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="vendor_id")
	private int id;
	@Column(name="order_price")
	private double order_price;
	@Column(name="order_date")
	private String order_date;
	
	public VendorBusiness()
	{
		this(0,0,null);
	}
	public VendorBusiness(int id, double order_price, String order_date) {
		super();
		this.id = id;
		this.order_price = order_price;
		this.order_date = order_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	@Override
	public String toString() {
		return "VendorBusiness [id=" + id + ", order_price=" + order_price
				+ ", order_date=" + order_date + "]";
	}
	

}
