package in.happycoding.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.happycoding.bean.User;
import in.happycoding.dao.UserDAO;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String subject = request.getParameter("subject");

		String[] hobbies = request.getParameterValues("hobbies");
		
		User user = new User(username, password, gender, subject, hobbies);
		
		UserDAO dao = new UserDAO();
		
		dao.save(user);
		
	}

}
