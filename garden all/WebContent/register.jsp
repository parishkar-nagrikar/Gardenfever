<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib  prefix="sf"  uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="registration-form">
	<div class="container">
	<div class="dreamcrub">
			   	 <ul class="breadcrumbs">
                    <li class="home">
                       <a href="default" title="Go to Home Page">Home</a>&nbsp;
                       <span>&gt;</span>
                    </li>
                    <li class="women">
                       Registration
                    </li>
                </ul>
                <ul class="previous">
                	<li><a href="default">Back to Previous Page</a></li>
                </ul>
                <div class="clearfix"></div>
			   </div>
		<h2>Registration</h2>
		<div class="registration-grids">
			<div class="reg-form">
				<div class="reg">
					 <p>Welcome, please enter the following details to continue.</p>
					 <p>If you have previously registered with us, <a href="#">click here</a></p>
					<sf:form modelAttribute="command" action="process">
						 <ul>
							 <li class="text-info">First Name: </li>
							 <li><sf:input path="first_name"/></li>
						 </ul>
 <ul>
							 <li class="text-info">Middle Name: </li>
							  <li><sf:input path="middle_name"/></li>
						 </ul>
						 <ul>
							 <li class="text-info">Last Name: </li>
							  <li><sf:input path="last_name"/></li>
						 </ul>
						 <ul>
							 <li class="text-info">Address: </li>
							 <li><sf:input path="address"/></li>
						 </ul> 
						<ul>
							 <li class="text-info">City: </li>
							 <li><sf:input path="city"/></li>
						 </ul>
						 <ul>
							 <li class="text-info">Pincode: </li>
							 <li><sf:input path="pincode"/></li>
						 </ul>

						 <ul>
							 <li class="text-info">Mobile Number:</li>
							 <li><sf:input path="phone_no"/></li>
						 </ul>						 
						<ul>
							 <li class="text-info">Email: </li>
							 <li><sf:input path="email_id"/></li>
						 </ul>
						 <ul>
							 <li class="text-info">Password: </li>
							 <li><sf:input path="password"/></li>
						 </ul>
						 <!-- <ul>
							 <li class="text-info">Re-enter Password:</li>
							 <li><input type="password" value=""></li>
						 </ul>  -->
						 
						
						 <ul>
							 <li class="text-info">Role:</li>
							 <li class=text-info"><input type="radio" name="role" value="Customer">  Customer   
<input type="radio" name="role" value="Vendor"> Vendor  
<input type="radio" name="role" value="Admin">  Admin</li>
						 </ul>	
											
						 <input type="submit" value="REGISTER NOW">
					</sf:form>
						 <p class="click">By clicking this button, you are agree to my  <a href="#">Policy Terms and Conditions.</a></p> 
										 
				 </div>
			</div>

