package nameAndAge;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;

public class FileData {
	

	public static void main(String[] args) throws Exception
	{
			File file_name1 = new File("../Genova/src/NameList1.txt");
			File file_name2 = new File("../Genova/src/NameList2.txt");
		
			Scanner readerL = new Scanner(file_name1);
			Scanner readerR = new Scanner(file_name2);

			String line1 = readerL.nextLine();
			String line2 = readerR.nextLine();
			
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
			  readerL.close();
			  readerR.close();
	}

	private static String readLine(Scanner reader) 
	{
		if(reader.hasNextLine())
			return reader.nextLine();
		else
			return null;
	}
	
}
			    
