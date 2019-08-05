<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1>Customer Registration</h1>
	<hr>
	<form action = "confirm" method = "post">
		<h2>
			First Name:<input type = "text" name = "fname" required></input><br><br>
			Last Name:<input type = "text" name = "lname" required></input><br><br>
			Email id:<input type = "email" name = "email" required></input><br><br>
			Mobile<input type = "tel" name = "mobile" required></input><br><br>
			<input type = "submit" name = "insert" value = "Register"></input><br><br>
			
		</h2>
	</form>
	
	
	
</body>
</html>