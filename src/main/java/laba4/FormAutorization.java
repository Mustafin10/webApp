package laba4;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="FormAutorization", urlPatterns="/FormAutorization")
public class FormAutorization extends HttpServlet {

	public static String login_c;
	public static  String password_c;
	public static double result;
	public static int check;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		RequestAccount Account = RequestAccount.fromRequestParameters(request);
		
		if(login_c.equals("admin")&(password_c.equals("555"))) {
			RequestDispatcher rs = request.getRequestDispatcher("/adminForm.jsp");
			rs.forward(request, response);
		check=1;
		}
		if(login_c.equals("user")&(password_c.equals("123"))) {
			RequestDispatcher rs = request.getRequestDispatcher("/userForm.jsp");
			rs.forward(request, response);
			check=2;
			}else {
			request.setAttribute("answer", "Не удаётся войти. Пожалуйста, проверьте правильность написания логина и пароля.");
			request.getRequestDispatcher("/formAutorization.jsp").forward(request, response);
		}
		
	}
	
	private static class RequestCalc {
		private final String first_calc;
		private final String second_calc;
		private int result;
						
		private RequestCalc (String first, String second) {
			this.first_calc = first;
			this.second_calc = second;
			}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
			request.getParameter("first"),
			request.getParameter("second"));
			}
				
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			request.setAttribute("first_result", first_calc);
			request.setAttribute("second_result", second_calc);
			int first_try;
			int second_try;
			try { 
			first_try=Integer.parseInt(first_calc);
			second_try=Integer.parseInt(second_calc);
			}
			catch (NumberFormatException e) {
				first_try=0;
				second_try=0;	
			}
			
			result=first_try+second_try;
			request.setAttribute("result", result);
		}
		
	}
	
	
}
