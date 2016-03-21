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
//		String name1 = req.getParameter("lName");
		String outputText = "Greetings " + name + ".";
		String outputText2 = "Here is the list of Names and ages from the two text files.";
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Genova Code Test</title></head>");
		pw.println("  <header>" + outputText + "<br>" + "</header>");
		pw.println("<body>" + outputText2 + "</body>");
		pw.println("</html>");
		pw.close();
	}
}
