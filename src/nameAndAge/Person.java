//Since we are dealing with "people" incoming from the text files for this test, I've created a Person object.
//I'm using all the things the "people" have in common.  First name, last name, and age.  
//I've made the fields private so they cannot be changed if someone else were to work on the code (Encapsulation), however I have included
//getters and setters so the fields can be access and utilized. 

package nameAndAge;

import java.util.Comparator;

public class Person implements Comparable<Person> 
{	//private fields cannot be accessed from outside methods intentionally so they cannot be altered and cause future programs to "blow up".
	private String fname;
	private String lname;
	private int age;
	
	
//Since i've provided a constructor on line 19, I'm including this no-arg constructor because the complier will complain if there isn't one present.
//If I had not created the line 19 constructor, the complier would have instantiated a no-arg constructor on its own.
	public Person(){}
	
//Here I've created a 3 arg constructor utilizing the 3 field variables.
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
//Below are the getters and setters which allow the fields to be accessed without changing the fields themselves.

	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

//Here is a default toString() method which allows me to return the values of an object and I'd like to represent this object as a String.
	
	@Override
	public String toString() 
	{
		return "First Name: " + fname + ",   Last Name: " + lname + ",   age:  " + age + "";
	}

@Override
public int compareTo(Person p) {
	// TODO Auto-generated method stub
	return (this.lname).compareTo(p.lname);
}


	
	
	
	
}
