<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Technical Support System</h1>
	<hr>
	<form action = "validate">
		<h2>
			Email id:<input type = "email" name = "email" required></input><br><br>
			
			Software:<select name="s/w">
			    <option value="msftWord">Microsoft Word</option>
			    <option value="msftExcel">Microsoft Excel</option>
			    <option value="msftPpt">Microsoft Power Point</option>
			    <option value="msftPublisher">Microsoft Publisher</option>
			    <option value="skype">Skype for Business</option>
			    <option value="msftOutlook">Microsoft Outlook</option>
			    <option value="sharePoint">Share Point</option>
			    <option value="msftOneNote">Microsoft OneNote</option>
			    <option value="msftVisio">Microsoft Visio</option>
			    <option value="msftProject">Microsoft Project</option>
		  	</select>
  			<br><br>
  			
  			Operating System:<select name="os">
			    <option value="windows">Windows</option>
			    <option value="mac">Mac</option>
			    <option value="linux">Linux</option>
			    <option value="android">Android</option>
			</select>
  			<br><br>
  			
  			Problem Description:<textarea name="problemDescription" rows="10" cols="30"></textarea><br><br>
  
			<input type = "submit" name = "delete" value = "Submit Request"></input><br><br>
			<!-- <input type = "reset" name = "reset" value = "RESET"></input><br><br> -->
		</h2>
	</form>
</body>
</html>