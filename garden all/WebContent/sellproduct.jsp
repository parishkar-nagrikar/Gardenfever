<%@ page language="java" contentType="text/html; 

charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 

Transitional//EN" 

"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; 

charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="registration-form">
	<div class="container">
	<div class="dreamcrub">
			   	 <ul 

class="breadcrumbs">
                    <li class="home">
                       <a href="default" title="Go to 

Home Page">Home</a>&nbsp;
                       <span>&gt;</span>
                    </li>
                    <li class="women">
                       Registration
                    </li>
                </ul>
                <ul class="previous">
                	<li><a href="default">Back to 

Previous Page</a></li>
                </ul>
                <div class="clearfix"></div>
			   </div>
		<h2>SELL PRODUCT</h2> <h4><b>You will be charged for Rs.500 for a month per Product... </b></b></h4>
		<div class="registration-grids">
			<div class="reg-form">
				<div class="reg">
					 <p>Welcome, 

please enter the following details to continue.</p>
					 <p>If you have 

previously registered with us, <a href="#">click 

here</a></p>
					 
					 <sf:form 

modelAttribute="command" action="sell" 

enctype="multipart/form-data">
						  <ul>
							

 <li class="text-info">CATEGORY:</li>
							

 <li class=text-info"><input type="radio" 

name="items_type" value="Seeds"> Seeds   
<input type="radio" name="items_type" value="tools"> Tools And Machinery  
<input type="radio" name="items_type" 

value="Fertilizer"> Fertilizers</li>
						</ul>
						 <ul>	
					
							

 <li class="text-info">Product Name: </li>
							

 
							

 <li><sf:input path="items_name"/></li>
						 </ul>
						  <ul>	
					
							

 <li class="text-info">Product Description: </li>
							

 
							

 <li><sf:textarea path="description" rows="2" 

cols="44"/></li>
						 </ul>
						 <ul>
							

 <li class="text-info">Quantity(per unit): </li>
							

 <li><sf:input  path="quantity"/></li>
						 </ul>
						 <ul>
							

 <li class="text-info">Price: </li>
							

 <li><sf:input path="price"/></li>
						 </ul> 
						<ul>
							

 <li class="text-info">Subscription Period  (  in months): </li>
							

 <li><sf:input path="subscription_period"/></li>
						 </ul>
						 
						 
							

 <!--<ul> <li class="text-info">Image: </li>
							

 <li><sf:input type="file" path=""/></li>
						 </ul> 

-->
						 <ul>
 <li class="text-info">Image: </li>
							

 <li><input type="file" required="required" name="img" 

accept="imgage/*,.jpg" /></li>
						 </ul>
							
							

					
						 <input 

type="submit" value="SELL PRODUCT">
						 <p 

class="click">By clicking this button, you are agree to 

my  <a href="#">Policy Terms and Conditions.</a></p> 
					
					 </sf:form>
				 </div>
			</div>
			
<!-- registration-form -->

		<div class="news-letter">
			<div class="container">
</div>
</div>

		  </div>
		</div>
		</div>

</body>
</html>