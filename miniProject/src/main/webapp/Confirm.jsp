<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Service Response</title>
</head>
<body>
	<h2>Customer Service Request Received</h2>
	<hr>
	<h5>Thank you for your response. Your request has been received and will be responded within 2-3 
	business days.</h5>
	<hr>
	<h4>Current User : ${ customer.fname } ${customer.lname } </h4> 
	
	
</body>
</html>