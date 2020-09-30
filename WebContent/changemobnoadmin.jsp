<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<sf:form modelAttribute="command" action="chmobnoadmin">

Enter New Mobile No	:<sf:input path="phone_no" />
<br/><br/>

<input type="submit" value="Change Mobile Number">
</sf:form>