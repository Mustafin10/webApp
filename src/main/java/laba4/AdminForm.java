package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="adminForm", urlPatterns="/AdminForm")
public class AdminForm extends HttpServlet {

	protected static String subject;
	protected static String add_promo;
	protected static String services;
	public BufferedReader br;
	public static String gt;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		subject = request.getParameter("subject");
		add_promo = request.getParameter("add_promo");
		services = request.getParameter("services");

		FileWriter writer = new FileWriter("promo.txt", false);
		 
           // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
		
		System.out.println(add_promo);
		request.getRequestDispatcher("/adminForm.jsp").forward(request, response);
		
	}
}

