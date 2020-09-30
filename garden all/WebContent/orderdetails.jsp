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

 <div class="bs-docs-example">
            <table class="table">
              <thead>
              
             
                <tr>
                  <th>Oredr Id</th>
                  <th>Product Name</th>
                  <th>Price Per Unit</th>
                  <th>Quantity</th>
                  <th>Date</th>
                </tr>
              </thead>
              <tbody>
              
         <c:forEach var="order" items="${order_list}" >
              
                <tr>
                  <td>${order.id} </td>
                  <td>${order.product_name} </td>
                  <td>${order.price} </td>
                  <td> ${order.quantity} </td>
                  <td>${order.order_Date}  </td>
                </tr>
                
         </c:forEach>
              </tbody>
            </table>
          </div>	
</body>
</html>