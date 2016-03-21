//The intention of this page (once its completed) is to greet the user on the browser end.  the User will enter their
//name and this servlet will greet them, using the name they've entered.  It will then display
//the names and ages of the coding test administered.


package nameAndAge;

import java.io.IOException;
import java.io.PrintWriter;

import nameAndAge.FileData;
import nameAndAge.ReadFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Greeting extends HttpServlet 
{	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("fName");
//		String name1 = req.getParameter("lName"); Giving room to further customize by receiving a more detailed name from the user. 
		String outputText = "Greetings " + name + ".";
		String outputText2 = "Here is the list of Names and ages from the two text files.";
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Genova Code Test</title></head>");
		//the below line takes "outputText" which Greets the user and uses their name input specifically.
		pw.println("  <header>" + outputText + "<br>" + "</header>");
		//outputText2 is simply a text line that lets the user know what he/she is (or will be) seeing
		pw.println("<body>" + outputText2 + "</body>");
		pw.println("</html>");
		pw.close();
	}
}
