package com.project.models;

import org.springframework.stereotype.Component;



@Component
public class entUser
{
	
	private int user_id;
	private String first_name;
	
	private String middle_name;
	
	private String last_name;
	
	private String phone_no;
	
	private String address;
	
	private String city;

	private String pincode;

	private String email_id;

	private String password;

	private String role;
	public entUser()
	{
		this(0,"","","","","","","","","");
	}
	public entUser(int user_id,  String middle_name,
			String last_name, String phone_no, String address, String city,
			String pincode, String email_id, String password, String role) 
	{
		super();
		this.user_id = user_id;
		//this.first_name = first_name;
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
		return "User [user_id=" + user_id + /* first_name*/
				", middle_name=" + middle_name + ", last_name=" + last_name
				+ ", phone_no=" + phone_no + ", address=" + address + ", city="
				+ city + ", pincode=" + pincode + ", email_id=" + email_id
				+ ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
