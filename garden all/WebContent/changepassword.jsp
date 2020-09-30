<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib  prefix="sf"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="content">
	<div class="container">
		<div class="login-page">
			    <div class="dreamcrub">
			   	 <ul class="breadcrumbs">
                    <li class="home">
                       <a href="default" title="Go to Home Page">Home</a>&nbsp;
                       <span>&gt;</span>
                    </li>
                    <li class="women">
                       Login
                    </li>
                </ul>
                <ul class="previous">
                	<li><a href="default">Back to Previous Page</a></li>
                </ul>

<div class="container">
	   <div class="products-page">
			<div class="products">
				<div class="product-listy">
					<h2>our Products</h2>
					<ul class="product-list"></li>
						<li><a href="dailybusiness">DAILY BUISNESS</a></li>
<li><a href="weeklybusiness">WEEKLY BUISNESS</a></li>
<li><a href="monthlybusiness">MONTHLY BUISNESS</a></li>
<li><a href="yearlybusiness">YEARLY BUISNESS</a></li>

						<li><a href="changepassword">CHANGE PASSWORD</a></li>
						<li><a href="changeaddress">CHANGE ADDRESS</a></li>
						<li><a href="changemobile">CHANGE MOBILE NO</a></li>
						
					</ul>
				</div>
</div>




<div class="registration-grids">
			<div class="reg-form">
				<div class="reg">
					 
					 
		<sf:form modelAttribute="command" action="changepasswordadmin">
						 <ul>
							 <li class="text-info">New Password: </li>
							 <li><sf:input path="password"/></li>
						 </ul>

 <ul>
							 <li class="text-info">Confirm Password: </li>
							 <li><sf:input path="password"/></li>
						 </ul>   
  
<ul>

<input type="submit" value="CHANGE PASSWORD">
						 
					 </ul>
					 </sf:form>
				 </div>
			</div>  </div>
	

</div>
</div></di></div>
  

</body>
</html>