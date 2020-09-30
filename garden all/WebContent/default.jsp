<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

	<div class="banner">
		<div class="container">
<div class="banner-bottom">
	<div class="banner-bottom-left">
		<!-- <h2>B<br>U<br>Y</h2>   -->
	</div>
	<!-- <div class="banner-bottom-right">
		<div  class="callbacks_container">
					<ul class="rslides" id="slider4">
					<li>
								<div class="banner-info">
									<h3>Smart But Casual</h3>
									<p>Start your shopping here...</p>
								</div>
							</li>
							<li>
								<div class="banner-info">
								   <h3>Shop Online</h3>
									<p>Start your shopping here...</p>
								</div>
							</li>
							<li>
								<div class="banner-info">
								  <h3>Pack your Bag</h3>
									<p>Start your shopping here...</p>
								</div>								
							</li>
						</ul>
					</div>
					<!--banner-->
	  			<script src="js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager:true,
			        nav:false,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script>
	</div>
	<div class="clearfix"> </div>
</div>  -->
	<div class="shop"><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
		
	</div>
	</div>
		</div>
		<!--content-section-starts-here   --> 
		<div class="container">
			<div class="main-content">
			
					<!--content-section-starts-here   --> 
				<br/>
				<br/>
				<header>
					<h3 class="head text-center">Latest Products</h3>
				</header>
		<div class="container">
		<div class="main-content">
		<div class="products-grid">
				
		<c:forEach var="product" items="${all_product_list}">
		
	
		<div class="col-md-4 product simpleCart_shelfItem text-center">
				<img style="width: 200px;height:300" src="${product.image_path}" alt="Aj" /></a>
				<a class="product_name" name="items_name" >${product.items_name}</a>
				<a class="product_name" name="price" >Rs.${product.price}</a>

			<sf:form modelAttribute="command" action="addtootehrcart">
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