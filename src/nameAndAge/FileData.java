// Application is, unfortunately, not complete.  It does retrieve data from two text files and combines them
//in a System.out.print and displays data in the console, however it does not yet accomplish the
//requirements of alphabetical order for last names, removing first name duplicates, or getting the
//average age of the given names.
package nameAndAge;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;

public class FileData {
	

	public static void main(String[] args) throws Exception
	{		//importing the two text files given by the recruiter/Genova.
			File file_name1 = new File("../Genova/src/NameList1.txt");
			File file_name2 = new File("../Genova/src/NameList2.txt");
			
			//taking the filename and creating variables that are easier for me to remember.
			Scanner readerL = new Scanner(file_name1);
			Scanner readerR = new Scanner(file_name2);
			
			//next line method goes through each line in the text file.
			String line1 = readerL.nextLine();
			String line2 = readerR.nextLine();
			
			// while the lines that are being read are not empty, they will have some type of output.
			//below here is where I would have entered logic to get the average age/alphabetical order requests
			while (line1 != null || line2 != null) 
			{
			    if (line1 == null) 
			    {
			      System.out.println("file2: " + line2);
			      line2 = readLine(readerR);
			    } 
			    else if (line2 == null)
			    {
			      System.out.println("file1:  " + line1);
			      line1 = readLine(readerL);
			    } 
			    //here is where I began to enter logic to explore comparison for alphabetical order.
			    else if (line1.compareToIgnoreCase(line2) <= 0)
			    {
			      System.out.println("file1:  " + line1);
			      line1 = readLine(readerL);
			    } 
			    else 
			    {
			      System.out.println("file2: " + line2);
			      line2 = readLine(readerR);
			    }
			  }
			//closing reader to reduce memory leak
			  readerL.close();
			  readerR.close();
	}
	//a method to return the next line, if there is one available.  
	private static String readLine(Scanner reader) 
	{
		if(reader.hasNextLine())
			return reader.nextLine();
		else
			return null;
	}
	
}
			    
