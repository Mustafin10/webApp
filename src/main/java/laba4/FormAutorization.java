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
		
		//Проверка введенных пользователем данных(авторизация)
		if(login_c.equals("admin")&(password_c.equals("555"))) {
			RequestDispatcher rs = request.getRequestDispatcher("/adminForm.jsp");
			rs.forward(request, response); //переход в окно администратора
		check=1;
		}
		if(login_c.equals("user")&(password_c.equals("123"))) {
			RequestDispatcher rs = request.getRequestDispatcher("/userForm.jsp"); 
			rs.forward(request, response); //переход в окно с калькулятором
			check=2;
			}else {
			request.setAttribute("answer", "Не удаётся войти. Пожалуйста, проверьте правильность написания логина и пароля.");
			request.getRequestDispatcher("/formAutorization.jsp").forward(request, response); //переход в окно авторизации
		}
		
	}
	
	private static class RequestAccount {
		
		private RequestAccount (String login, String password) {
			login_c = login; 
			password_c = password; 
			}
		
		public static RequestAccount fromRequestParameters(HttpServletRequest request) {
			return new RequestAccount(
			request.getParameter("login"), //получение значений из поля "логин" в окне авторизации
			request.getParameter("password")); //получение значений из поля "пароль" в окне авторизации
			}			
	}
	
	
}
