package com.visa.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertProd")
public class InsertProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1 = request.getParameter("n1");
		String s2 = request.getParameter("n2");
		String s3 = request.getParameter("n3");
		float f1 = Float.parseFloat(s2);
		int qoh = Integer.parseInt(s3);
		ProductDAO dao = new ProductDAO();
		Product toBeSaved = new Product(s1, f1, qoh);
		int idi = dao.save(toBeSaved);
		PrintWriter out = response.getWriter();
		out.println(idi);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
