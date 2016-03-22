<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Average Age</title>
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
	<main>
	<p>The average age of all the people within the text files is:  ${Average}</p>		
	
	</main>

</body>
</html>