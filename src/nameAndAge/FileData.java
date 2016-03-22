//This file is acting as my DAO. (Data access object)
//Here I import and manipulate data in order to display to the user. 

package nameAndAge;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


public class FileData {
	//here we are creating private final variables that cannot be changed from outside classes. 
	//we will be using these variables for importing the two text files and instantiating a new arraylist for the data to be stored.
	private static final String names1 = "/WEB-INF/NameList1.txt";
	private static final String names2 = "/WEB-INF/NameList2.txt";
	private List<Person> people = new ArrayList<>();
	
	@Autowired
	private ApplicationContext ac;

	@PostConstruct
	public void init() {
		// Retrieve an input stream from the application context rather than
		// directly from the file system.
		// ..... This try/catch imports "Namelist1.txt"
		try (InputStream is = ac.getResource(names1).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {

			String line;
			int counter = 0;
			while ((line = buf.readLine()) != null) {
				if (!(counter == 0)) {
					System.out.println(line);
					String[] tokens = line.split("\\t");
					String fName = tokens[0].trim();
					String lName = tokens[1].trim();
					Integer age = Integer.parseInt(tokens[2].trim());
					people.add(new Person(fName, lName, age));
				}

				counter++;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		// ..... The following try/catch imports "Namelist2.txt"

		try (InputStream is = ac.getResource(names2).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {

			String line;
			int counter = 0;
			while ((line = buf.readLine()) != null) {

				if (!(counter == 0)) {
					System.out.println(line);
					String[] tokens = line.split("\\t");
					String fName = tokens[0].trim();
					String lName = tokens[1].trim();
					Integer age = Integer.parseInt(tokens[2].trim());

					people.add(new Person(fName, lName, age));
				}
				counter++;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println(people);

	}
	//this method calculates the average age utilizing a foreach loop through the array of people.
	public double calculateAverageAge() 
	{
		double sum = 0d;
		double average = 0d;
		for (Person person : people) 
		{
			sum+= person.getAge();
		}
		average = sum/(people.size());
		System.out.println(average);
		return average;
		}
	//this method puts the last names in alphabetical order
	public List<Person> alphabetical()
	{	
		Collections.sort(people);
		return people;
	}
//	This (when completed) method counts the number of first names that are duplicated.
		public int duplicates()
		{	int counter = 0;
			for (int i = 0; i < people.size(); i++) 
			{
				System.out.println("inside first loop. The first name is: " + people.get(i).getFname() + i);
			
				for (Person person : people) 
				{	//System.out.println("Persons name to be compared is: " + person.getFname() + " second name is: " + people.get(i).getFname());
					if ((person.getFname())==(people.get(i).getFname()));
					{
//						System.out.println("inside counter. Found Duplicate. The first name is: " + person.getFname() + i);

						counter++;
					}
				
			} 
			}
			System.out.println(counter);
			return counter;
		}
	
	//	this method returns the entire arraylist of "people".
	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
}
