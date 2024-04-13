package ServletPrograms;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class MyServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//To Print in the browser page.
		PrintWriter out = resp.getWriter();
		out.print("Hello Java Program...");
		
		//we can enter the text in html code also...
		resp.setContentType("text/html");
		out.print("<h1> I'm in doGet() method...</h1>");
		
		//It will print on the console
		System.out.println("I'm in doGet() method.");
		
		//Printing date
		out.print(new Date().toString());
	}

}

