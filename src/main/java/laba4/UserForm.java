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
		
		c0 = request.getParameter("c0");
		p21 = request.getParameter("promo");
		x = request.getParameter("gruz");
		if (x != null){
            x="500";
        }else {
        	x="0";
        }
		y = request.getParameter("document");
		if (y != null){
            y="300";
        }else {
        	y="0";
        }
		
		request.setAttribute("stoim", results);
		request.setAttribute("v2_c", v2);
		request.setAttribute("ves_c", ves);
		request.setAttribute("c0", c0);
		request.setAttribute("promo", p21);
		request.setAttribute("gruz", x);
		request.setAttribute("document", y);
		
		System.out.println(results);
		request.getRequestDispatcher("/userForm.jsp").forward(request, response);
	}

}
