<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Investment Results</title>
</head>
<body>
<p>Hello ${investment.getName()}<br>
	Your initial amount of ${investment.getInitialAmount()}<br>
	after ${investment.getYears()} years<br>
	with a rate of ${investment.getInterest()}<br>
	will earn ${investment.calculateInterestEarned()} of interest
	</p>
	<input type="button" value="Another One" onclick="window.location='index.jsp'">
</body>
</html>