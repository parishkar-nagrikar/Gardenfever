<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<sf:form modelAttribute="command" action="chaddradmin">
Enter New Address :<sf:input path="address" />
<br/><br/>
Enter Name of City:		<sf:input path="city" />
<br/><br/>
Enter PinCode:<sf:input path="pincode" />
<br/><br/>
<input type="submit" value="Change Address">
</sf:form> 