package laba4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="adminForm", urlPatterns="/AdminForm")
public class AdminForm extends HttpServlet {
    //Объявление переменных
	protected static String subject;
	protected static String add_promo;
	protected static String services;
	public static String gt;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		subject = request.getParameter("subject"); //Получение значения из поля subject
		add_promo = request.getParameter("add_promo"); //Получение значения из поля add_promo
            
            try {
            	//Создание и запись значений в файл
				File file = new File("promo.txt");
				
				if(!file.exists())
				file.createNewFile();
				
				BufferedWriter pw = new BufferedWriter(new FileWriter(file, true));
				String lineSeparator = System.getProperty("line.separator");
				pw.write(add_promo+ lineSeparator);
				pw.flush();
				pw.close();
				
				//Чтение данных из файла
				
				FileReader fr = new FileReader(file);
	            //создаем BufferedReader с существующего FileReader для построчного считывания
	            BufferedReader br = new BufferedReader(fr);
	            // считаем сначала первую строку
	            String line;

					while((line = br.readLine())!=null) {
						gt = line;
					}
							
			}catch(IOException e1){
			     e1.printStackTrace();
			}
            
		request.getRequestDispatcher("/adminForm.jsp").forward(request, response);
		
	}
}



