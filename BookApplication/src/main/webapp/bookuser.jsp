<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<title>book registration</title>
</head>
<body bgcolor="orange">

    <c:if test="${result==1}">
	<h1>Book details inserted successfully.....</h1>
	<button onclick="window.location.href='hone.html'">Home</button>
	</c:if>
	
	<c:if test="${result==0}">
	<h1>Book details insertion fail.....</h1>
	<button onclick="window.location.href='hone.html'">Home</button>
	</c:if>
	 
</body>
</html>