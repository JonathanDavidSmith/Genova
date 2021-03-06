<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alphabetical Order</title>
</head>
<body>
<header>
	<p>Welcome! I'm glad you're here.<br>
	The following buttons will display information based on requirements for the java code test.</p>
	 </header>
	<p>This button will just show all the information given via text files.</p>
	<form action="names.do" method="GET">
		<input type="submit" value="Show All Names" />
	</form>
	
	<p>This button will simply display the average of all the ages given on the text files.</p>
	<form action="averageAge.do" method="GET">
		<input type="submit" value="Get average age" />
	</form>
	
	<p>This button will put the list of names in alphabetical order based on the last names.</p>
	<form action="alphabetical.do" method="GET">
		<input type="submit" value="Alphabetize Last Names" />
	</form>
	<p>This button shows the number of duplicate first names</p>
	<form action="duplicates.do" method="GET">
		<input type="submit" value="Duplicated First names" />
	</form>
<main>
	

	<c:forEach var = "people" items = "${alphabetical}">
		 <c:out value=" ${people.fname } ${people.lname} ${people.age }"/><p>
	</c:forEach>

</main>

</body>
</html>