
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
                	<li class="women"><a href="cart">SEE CART</a></li>
                </ul>
                <div class="clearfix"></div>
			   </div>	
			   <div class="account_grid">
			   <div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s">
<div class="container">
	   <div class="products-page">
			<div class="products">
				<div class="product-listy">
					<h2>ACCOUT DETAILS</h2>
					<ul class="product-list"></li>
<li><a href="orderdetails">ORDER DEATILS</a></li>
<li><a href="paymentdetails">PAYMENT DETAILS</a></li>
						<li><a href="wishlist">WISH LIST</a></li>
						<li><a href="cchangepassword">CHANGE PASSWORD</a></li>
						<li><a href="cchangeaddress">CHANGE  ADDRESS</a></li>
						<li><a href="cchangemobile">CHANGE MOBILE NO</a></li>
						
					</ul>
				</div>
</div><img src="images/p10.jpg" alt="" />
</div>
</div></di></div>
</div></div></div>  
<!-- Products are started shows from here--->


		 
<!-- Products are started shows from here--->

				<header>
					<h3 class="head text-center">Latest Products</h3>
				</header>
		<div class="container">
		<div class="main-content">
		<div class="products-grid">
	
		<c:forEach var="product" items="${allcustomerproduct}">
		
	
		<div class="col-md-4 product simpleCart_shelfItem text-center">
				<img style="width: 200px;height:300" src="${product.image_path}" alt="Aj" /></a>
				<a class="product_name" name="items_name" >${product.items_name}</a>
				<a class="product_name" name="price" >Rs.${product.price}</a>

			<sf:form modelAttribute="command" action="addtocart">
		<input type="hidden" name="gardening_id" value="${product.gardening_id}"/>
				<input type="hidden" name="items_name" value="${product.items_name}"/>
		<input type="hidden" name="image_path" value="${product.image_path}"/>
		<input type="hidden" name="vendor_name" value="${product.vendor_name}"/>
		<input type="hidden" name="price" value="${product.price}"/>

		<a class="product_name">Quantity: <input type="text"  name="quantity" value=""/></a>
						 
		<input type="hidden" name="vendor_id" value="${product.vendor_id}"/>
		<input type="hidden" name="description" value="${product.description}"/>
		<input type="hidden" name="subscription_period" value="${product.subscription_period}"/>
		<input type="hidden" name="items_type" value="${product.items_type}"/>			
			
			<input type="submit" value="ADD TO CART PRODUCT"></a>
			
			
			
										
		</sf:form>
		</div>
</c:forEach>
</div>
		</div>
		</div>


</body>
</html>