package in.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Greetings extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");

		PrintWriter writer = response.getWriter();

		writer.write("<h1> My App </h1>");
		writer.write("<h2>" + number1 + " - " + number2 + "</h2>");

	}

}
