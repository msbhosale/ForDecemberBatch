package in.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		
		int number = 7;
		
		
		writer.write("<h1> My App </h1>");
		writer.write("<hr>");
		
		writer.write("<table border='1px solid'>");
		
		for(int i = 1;i<= 10;i++) {
		
			writer.write("<tr>");
			writer.write("<td> "+ number * i +" </td>");
			writer.write("</tr>");
		}		
		
		
		writer.write("</table>");
		
		
		writer.close();
	}
}
