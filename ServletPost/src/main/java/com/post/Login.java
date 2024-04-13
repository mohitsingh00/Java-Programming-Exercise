package com.post;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("name1");
		String email = req.getParameter("email");
		
		if(name.equals("Mohit") && email.equals("m@gmail.com"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Fail");
		}
	
	}
}
