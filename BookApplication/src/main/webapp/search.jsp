<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
	 <h1>search result ....</h1>
	<c:if test="${not empty result}">
	
	</c:if>
	bookisbn....${result.bookisbn}<br>
	bookname....${result.bookname}<br>
	bookauthor....${result.bookauthor}<br>
	bookprice....${result.bookprice}<br>
	<a href="search.html">searchpage</a>

</body>
</html>