<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calculateBehind" method="post">
	<h2>Hello, ${firstName}</h2>
	<input type="hidden" name="firstName" value="${firstName}" /> 
	
	<label for="initialAmount">Initial Amount:</label>
	<input type="number" name="initialAmount" ><br>
	
	<label for="interest">Interest (Ex: 3 or 10) %: </label>
	<input type="number" name="interest"><br>
	
	<label for="years">Number of Years: </label>
	<input type="number" name="years"><br>
	
	<input type="submit"value="Submit"/>
	</form>
</body>
</html>