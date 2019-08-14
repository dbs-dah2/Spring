<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Please Enter Details..</h1>
	<hr>
	<form action = "add">
		<h2>
			Roll No:<input type = "text" name = "rollNo"></input><br><br>
			Name<input type = "text" name = "name"></input><br><br>
			Age<input type = "text" name = "age"></input><br><br>
			<input type = "submit" name = "insert" value = "INSERT"></input><br><br>
			<a href="Delete.jsp">Delete</a>
			<input type = "reset" name = "reset" value = "RESET"></input><br><br>
		</h2>
	</form>
	
	<form action = "delete">
		<h2>
			Roll No:<input type = "text" name = "rollNo"></input><br><br>
			
			<input type = "submit" name = "delete" value = "DELETE"></input><br><br>
			<input type = "reset" name = "reset" value = "RESET"></input><br><br>
		</h2>
	</form>
	
</body>
</html>