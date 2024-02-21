<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
	<h1>deletion process....</h1>
	<c:if test="${result == 1}">
	<h1>data deleted successfully...<%=request.getParameter("bookprice")%></h1>
	</c:if>
	
	<c:if test="${result == 0}">
	<h1>data not available with the given mobile number...<%=request.getParameter("bookprice")%></h1>
	</c:if>
	
	<jsp:include page="delete.html"></jsp:include>
	
</body>
</html>