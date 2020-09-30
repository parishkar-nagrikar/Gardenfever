<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  prefix="sf"  uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</div><img src="images/p10.jpg" alt="" />
</div>
</div></di></div>

				<header>
					<h3 class="head text-center">Vendors Products</h3>
				</header>
		<div class="container">
		<div class="main-content">
		<div class="products-grid">
				
		<c:forEach var="product" items="${allproduct}">
		
	
		<div class="col-md-4 product simpleCart_shelfItem text-center">
				<img style="width: 200px;height:300" src="${product.image_path}" alt="Aj" /></a>
				<a class="product_name"  >${product.items_name}</a>
				<a class="product_name" >Vendor:${product.vendor_name}</a>
				<a class="product_name">Quantity:${product.quantity}</a>
				<a class="product_name" >${product.price}</a>
		
		<sf:form modelAttribute="command" action="addvendorproduct">
		<input type="hidden" name="items_name" value="${product.items_name}"/>
		<input type="hidden" name="image_path" value="${product.image_path}"/>
		<input type="hidden" name="vendor_name" value="${product.vendor_name}"/>
		<input type="hidden" name="price" value="${product.price}"/>
		<input type="hidden" name="quantity" value="${product.quantity}"/>
		<input type="hidden" name="vendor_id" value="${product.vendor_id}"/>
		<input type="hidden" name="description" value="${product.description}"/>
		<input type="hidden" name="subscription_period" value="${product.subscription_period}"/>
		<input type="hidden" name="items_type" value="${product.items_type}"/>
			<input type="submit" value="ADD PRODUCT">

			</div>
										
		</sf:form>
</c:forEach>
</div>
		</div>
		</div>

</body>
</html>