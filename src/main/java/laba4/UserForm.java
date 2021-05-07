package laba4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="UserForm", urlPatterns="/UserForm")
public class UserForm extends HttpServlet {
	protected static String ves;
	protected static String v2;
	protected static String c0;
	protected static String p21;
	protected static String gorod;
	protected static String upak1;
	protected static String x;
	protected static String y;
	protected static int results;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		gorod = request.getParameter("city");
		v2 = request.getParameter("v2_c");
		ves = request.getParameter("ves_c");
		upak1 = request.getParameter("upak");
	}

}
