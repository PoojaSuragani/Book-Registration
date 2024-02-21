package com.sathya.bookex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String price= request.getParameter("bookprice");
		
		BookDao dao =new BookDao();
		int result = dao.deleteBybookprice(price);
		
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("delete.jsp");
		dispatcher.forward(request, response);
		
	

	}

}
