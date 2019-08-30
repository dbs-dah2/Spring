<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome ${ user.uname }!!<br>
	Welcome City ${ address.city }!!
	<jsp:include page="Login.jsp"></jsp:include>
	<jsp:include page="Welcome.html"></jsp:include>
	<jsp:include page="Login.jsp"></jsp:include>
	<jsp:include page="Welcome.html"></jsp:include>
</body>
</html>