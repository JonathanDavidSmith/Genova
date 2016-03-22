//This file is acting as my DAO. (Data access object)
//I'm dramatically refactoring the original program, but did not want to change the file name to avoid any GitHub drama ( I know a force push can be invoked, I'd just
//rather make this as smooth as possible for now since I'm on a time crunch!) :)

package nameAndAge;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class FileData {

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
	
	public List<Person> alphabetical()
	{	
		Collections.sort(people);
		return people;
	}
	
	

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
}
