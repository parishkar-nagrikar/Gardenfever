package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import java.util.*;
@Component
@Entity
@Table(name="admin_business")
public class AdminBusiness 
{
	@Id
	@Column(name="ID")
	//@SequenceGenerator(name="admin_id",sequenceName="seq_admin_business",allocationSize=1,initialValue=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="admin_id")
	private int id;
	@Column(name="user_id")
	private int user_id;
	@Column(name="order_price")
	private double order_price;
	@Column(name="order_date")
	private String order_date;
	public AdminBusiness()
	{
		this(0,0,0,null);
	}
	public AdminBusiness(int id, int user_id, double order_price,
			String order_date) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.order_price = order_price;
		this.order_date = order_date;
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
		return "AdminBusiness [id=" + id + ", user_id=" + user_id
				+ ", order_price=" + order_price + ", order_date=" + order_date
				+ "]";
	}
	
	
	
}
