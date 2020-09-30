<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="sf"  uri="http://www.springframework.org/tags/form" %>
<%@ taglib  prefix="sp"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div class="bs-docs-example">
            <table class="table">
              <thead>
              
             
                <tr>
                  <th>Product</th>
                  <th>Product Name</th>
                  <th>Price Per Unit</th>
                  <th>Quantity</th>
             	<th>Total Price</th>
             	<th></th>
                </tr>
              </thead>
              <tbody>
         <sf:form modelAttribute="command" action="Buy">       
         <c:forEach var="cart" items="${cart_list}" >
              
                <tr>
                  <td><img style="width: 100px;height:100" src=" ${cart.image_path}" alt="${cart.image_path}" /></a></td>
                  <td>${cart.product_name} </td>
                  <td>${cart.price_per_unit} </td>
                  <td> ${cart.quantity} </td>
                  <td>${cart.total_price}  </td>    
                  
                  
                  
                                   
       				<td>
       				
			<a href="deletefromcart?=1&prodid=${cart.product_id}">DELETE</a>  
       				
       				
       				</td>
       				
       				
       				
       				
       				
		<input type="hidden" name="product_id" value="${cart.product_id}"/>
		<input type="hidden" name="image_path" value="${cart.image_path}"/>
		<input type="hidden" name="product_name" value="${cart.product_name}"/>
		<input type="hidden" name="price_per_unit" value="${cart.price_per_unit}"/>
		<input type="hidden" name="quantity" value="${cart.quantity}"/>
		<input type="hidden" name="total_price" value="${cart.total_price}"/>
		<input type="hidden" name="product_name value="${cart.product_name}"/>

		 </c:forEach>		
						
                
                </tr>
        
        
         <tr>
          <th>Total</th>
                  <td></td>
                  <td></td>
                  <td> </td>
                  <th>${grand_total}</th>                     
         
         </tr>
         </div>
              </tbody>
            </table>
              <div class="registration-grids">
				<div class="reg-form">
				<div class="reg">
				<input type="submit" value="PURCHASE">
</sf:form>      
			</div>
			</div>
			</div>
            
          </div>	
</body>
</html>