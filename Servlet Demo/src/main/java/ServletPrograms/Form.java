package ServletPrograms;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")
public class Form extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		
		PrintWriter out = resp.getWriter();
		out.println("Name: "+name);
		out.println("Email: "+email);
	}
}

