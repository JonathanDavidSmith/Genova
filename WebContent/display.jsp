<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Super awesome name list</title>
</head>
<body>
<header>
	<h1>Welcome!</h1>
	<form action="names.do" method="GET">
		<input type="submit" value="Show Names" />
	</form>
	<!-- <form action="averageAge.do" method="GET">
		<input type="submit" value="Get average age" />
	</form> -->

</header>

	<c:forEach var = "people" items = "${Names}">
		 <c:out value="${people}"/><p>
	</c:forEach>
	




<footer></footer>
</body>
</html>