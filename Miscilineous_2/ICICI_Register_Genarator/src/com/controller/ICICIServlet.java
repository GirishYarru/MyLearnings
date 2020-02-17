package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ICICIBean;

/**
 * Servlet implementation class ICICIServlet
 */
public class ICICIServlet extends HttpServlet {

	/**
	 * 
	 */
	
	@Override
	public void init() throws ServletException {
		
	}
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		int balance = Integer.parseInt(req.getParameter("balance"));
		
		ICICIBean icici = new  ICICIBean(null, name, email, phone, balance);
		

	}
	
}
