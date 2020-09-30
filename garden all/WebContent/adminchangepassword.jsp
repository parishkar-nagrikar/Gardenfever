<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<sf:form modelAttribute="command" action="chpswadmin">

Enter New Password	:<sf:password path="password" />
<br/><br/>

<input type="submit" value="Change Password">
</sf:form>