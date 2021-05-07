package laba4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet(name="createPdf", urlPatterns="/CreatePdf")
public class CreatePdf extends HttpServlet {
	
	
	private static String label="Reception point: Ufa, st.Tramvainaya, 2";
	private static String label1="Delivery city: ";
	private static String label2="Delivery address: ";
	private static String label3="Volume of cargo: ";
	private static String label4="Cargo weight: ";
	private static String label5="Packing method: ";
	private static String label6="Declared value:";
	private static String label7="Promo code: ";
	private static String label8="Security cargo: ";
	private static String label9="Return of a package of documents: ";
	private static String label10="The cost: ";
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			File file = new File("Blank.pdf");
			Document document = new Document(PageSize.A4);
			
				try {
				PdfWriter writer =PdfWriter.getInstance(document, new FileOutputStream(file));
				document.open();
				PdfContentByte cb = writer.getDirectContent();
				} catch (FileNotFoundException | DocumentException e1) {
				// TODO Auto-generated catch block
					e1.printStackTrace();
				}

String del_city=UserForm.gorod;
String vol_carg=UserForm.v2;
String carg_wei=UserForm.ves;
String pac_met=UserForm.upak1;
String dec_val=UserForm.c0;
String promo_code=UserForm.p21;
String sec_carg=UserForm.x;
String ret_doc=UserForm.y;
String the_cost=String.valueOf(UserForm.results);
String box = null;

if(del_city.equals("1")) {
	del_city=label1+"Oktyabrskii";
	box=label2+"st.Kuvikina,49";
}
if(del_city.equals("2")) {
	del_city=label1+"Salavat";
	box=label2+"st.Malogvardeicev,30";
}
if(del_city.equals("3")) {
	del_city=label1+"Ishimbai";
	box=label2+"st.Gukina,26";
}
if(del_city.equals("4")) {
	del_city=label1+"Birsk";
	box=label2+"st.Kommunisticheskaya,25";
}
if(del_city.equals("5")) {
	del_city=label1+"Sterlitamak";
	box=label2+"st.Karla-Marksa,118";
}

if(sec_carg.equals("500")) {
	sec_carg="Yes";
}else {
	sec_carg="No";
}

if(ret_doc.equals("300")) {
	ret_doc="Yes";
}else {
	ret_doc="No";
}

if(pac_met.equals("1")) {
	pac_met="Not required";
}
if(pac_met.equals("2")){
	pac_met="Tough";
}
if(pac_met.equals("3")){
	pac_met="Soft";
}
if(pac_met.equals("4")){
	pac_met="Pallet board";
}


document.open();
Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, BaseColor.BLACK);

	try {
		document.addTitle("Отчет стоимости");
		document.add(new Paragraph(del_city +"\n",font));
		document.add(new Paragraph(box +"\n",font));
		document.add(new Paragraph(label3+vol_carg+"\n",font));
		document.add(new Paragraph(label4+carg_wei+"\n",font));
		document.add(new Paragraph(label5+pac_met+"\n",font));
		document.add(new Paragraph(label6+dec_val+"\n",font));
		document.add(new Paragraph(label7+promo_code+"\n",font));
		document.add(new Paragraph(label8+sec_carg+"\n",font));
		document.add(new Paragraph(label9+ret_doc+"\n",font));
		document.add(new Paragraph(label10+the_cost+"\n",font));
	} catch (DocumentException e1) {
	// TODO Auto-generated catch block
		e1.printStackTrace();
	}

document.close();

ServletOutputStream outputStream = null;
BufferedInputStream inputStream = null;

	try {
		outputStream = response.getOutputStream();
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + file + "\"");
		response.setContentLength((int) file.length());
		FileInputStream fileInputStream = new FileInputStream(file);
		inputStream = new BufferedInputStream(fileInputStream);
		int readBytes = 0;
		while ((readBytes = inputStream.read()) != -1)
			outputStream.write(readBytes);
	}catch (NullPointerException e){
		e.printStackTrace();
	}finally {
		outputStream.flush();
		outputStream.close();
		inputStream.close();
	}
	}
}