package laba4;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="UserForm", urlPatterns="/UserForm")
public class UserForm extends HttpServlet {
	
	//объявление переменных
	protected static String ves;
	protected static String v2;
	protected static String c0;
	public static String p21;
	public static String gorod;
	protected static String upak1;
	protected static String x;
	protected static String y;
	public static int results;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		gorod = request.getParameter("city"); //получение значения выбранного города в окне калькулятора
		v2 = request.getParameter("v2_c"); //получение значения введеного в поле объем в окне калькулятора
		ves = request.getParameter("ves_c"); //получение значения введеного в поле вес в окне калькулятора
		upak1 = request.getParameter("upak"); //получение значения выбранной упаковки в окне калькулятора
		
		c0 = request.getParameter("c0"); //получение значения введеного в поле объявленная стоимость в окне калькулятора
		p21 = request.getParameter("promo"); //получение значения введеного в поле промокод в окне калькулятора
		x = request.getParameter("gruz"); //получение значения выбранной кнопки(radio) в окне калькулятора
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
		
		
		results=Rasschet.calcul();
		//возврат значения в поле, нужно для того, чтобы при перезагрузке сайте, значения не пропадали
		request.setAttribute("stoim", results); 
		request.setAttribute("v2_c", v2);
		request.setAttribute("ves_c", ves);
		request.setAttribute("c0", c0);
		request.setAttribute("promo", p21);
		request.setAttribute("gruz", x);
		request.setAttribute("document", y);
		
		System.out.println(results);
		request.getRequestDispatcher("/userForm.jsp").forward(request, response); //перезагрузка страницы
	}
}

