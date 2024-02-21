package com.sathya.bookex;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BookRegistration")
public class BookRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<Integer, String>data;
		
		String Username = request.getParameter("bookisbn");
		String Password = request.getParameter("bookname");
		String Email = request.getParameter("bookauthor");
		String Mobile = request.getParameter("bookprice");
		
		BookDao dao =new BookDao();
		int result = dao.saveUser(Username, Password, Email, Mobile);
		
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("bookuser.jsp");
		dispatcher.forward(request, response);
		
	}

}
