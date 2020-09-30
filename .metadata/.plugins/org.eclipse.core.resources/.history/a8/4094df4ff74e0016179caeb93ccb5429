package com.project.entities;

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
@Table(name="users")
public class User 
{
	@Id
	@Column(name="user_id")
	//@SequenceGenerator(name="same",sequenceName="seq_userid",allocationSize=1,initialValue=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="same")
	private int user_id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="middle_name")
	private String middle_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="phone_no")
	private String phone_no;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="pincode")
	private String pincode;
	@Column(name="email_id")
	private String email_id;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	
	public User()
	{
		this("","","","","","","","","","");
	}
	public User(String first_name, String middle_name,
			String last_name, String phone_no, String address, String city,
			String pincode, String email_id, String password, String role) 
	{
		
		
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.phone_no = phone_no;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.email_id = email_id;
		this.password = password;
		this.role = role;
	}
	
	public User(String email_id)
	{
		this.email_id=email_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name
				+ ", middle_name=" + middle_name + ", last_name=" + last_name
				+ ", phone_no=" + phone_no + ", address=" + address + ", city="
				+ city + ", pincode=" + pincode + ", email_id=" + email_id
				+ ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
