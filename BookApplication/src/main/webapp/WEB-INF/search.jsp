<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
	<h1>search result ....</h1>
	<c:if test="${not empty bookinfo}">
	
	</c:if>
	bookisbn....${bookinfo.bookisbn}<br>
	bookname....${bookinfo.bookname}<br>
	bookauthor....${bookinfo.bookauthor}<br>
	bookprice....${bookinfo.bookprice}<br>
	<a href="search.html">searchpage</a>
	
</body>
</html>