<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	  		<!--content-section-starts-here   --> 
		<div class="container">
		<div class="main-content">
		<div class="products-grid">
				
				<header>
					<h3 class="head text-center">Tools And Machinary Products</h3>
				</header>
				
<c:forEach var="product" items="${tools_product_list}">
		
	
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
			
				<input type="submit" value="ADD TO CART PRODUCT">
			
			
											
		</sf:form>
		</div>
</c:forEach>

</div>
		</div>
		</div>

</body>
</html>