# Genova
Java files requested by Genova

This particular application is an answer to the Genova Java code test.

I've utilized Spring MVC to complete the project.  
I'm currently utilizing java 1.8.0_74.


1: A "Person" object class was created because the text files contains people and their first name, last name, and age.

	Private Field variables were created for first name, last name, and age.   Getters/Setters were added along with a constructor and a toString().

2: A DAO was implemented to access all data from the supplied text files.
Utilizing an arraylist, grabbing line by line, splitting on tab and utilizing []tokens.

3: A controller(Spring) to return information to the front end.

4: Multiple JSP files were used to display the requested information onto  browsers pages. 

5: The program can display average age of people, and alphabetize the list based on last 	names.  The program is currently lacking a method to count the number of duplicated 	   first names within the arraylist.  (this will, hopefully, be added shortly.)

6: There is no CSS utilized at this time.

7: The application is hosted on my personal AWS server.  The working URL is currently
     http://jonathandsmith.com:8080/Genova/ 