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
                       <a href="default.jsp" title="Go to Home Page">Home</a>&nbsp;
                       <span>&gt;</span>
                    </li>
                    <li class="women">
                       Login
                    </li>
                </ul>
                <ul class="previous">
                	<li><a href="default.jsp">Back to Previous Page</a></li>
                </ul>

<div class="container">
	   <div class="products-page">
			<div class="products">
				<div class="product-listy">
					<h2>our Products</h2>
					<ul class="product-list"></li>
						<li><a href="orderdetails">ORDER DETAILS</a></li>
<li><a href="paymentdetails">PAYMENT DETAILS</a></li>
<li><a href="wishlist">WISH LIST</a></li>

						<li><a href="cchangepassword">CHANGE PASSWORD</a></li>
						<li><a href="cchangeaddress">CHANGE ADDRESS</a></li>
						<li><a href="cchangemobile">CHANGE MOBILE NO</a></li>
						
					</ul>
				</div>
</div>




<div class="registration-grids">
			<div class="reg-form">
				<div class="reg">
					 
					 
					 <sf:form modelAttribute="command" action="changeaddresscustomer">
						 <ul>
							 <li class="text-info">New Address: </li>
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
  
  
  


<input type="submit" value="CHANGE ADDRESS">
						 
					 </sf:form>
				 </div>
			</div>  </div>
	

</div>
</div></di></div>


</body>
</html>