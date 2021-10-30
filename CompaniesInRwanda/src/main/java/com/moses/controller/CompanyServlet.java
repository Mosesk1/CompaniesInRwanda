package com.moses.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.moses.Dao.CompanyDao;


import jdk.jshell.ErroneousSnippet;

/**
 * Servlet implementation class CompanyServlet
 */
@WebServlet("/CompanyServlet")
public class CompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, String> errors;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompanyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		errors = new HashMap<>();
		PrintWriter out = response.getWriter();
		
		
		
				int registartionNo=Integer.parseInt(request.getParameter("registartionNo"));
				String companyName=request.getParameter("companyName");
				String category=request.getParameter("category");
				String owner=request.getParameter("owner");
				LocalDate startingDate=LocalDate.parse(request.getParameter("startingDate"));
				LocalDate registrationDate= LocalDate.now();
				Double capital=Double.parseDouble(request.getParameter("capital"));
				
				if(!Integer.toString(registartionNo).matches("[0-9]{4}")) {
					errors.put("regError", "must be 4 digits");
					
				}
				if(!owner.matches("[A-Z]")){
					errors.put("ownerError", "owner name must be in capital letters");
				}
				if(!errors.isEmpty()) {
					

					request.getSession().setAttribute("errors", errors);
					response.sendRedirect("abc.jsp");
				}
				else {

					CompanyDao.saveCompany(registartionNo,  companyName,  category,  owner,  startingDate,registrationDate,  capital);
					//out.println("save "+ registartionNo);
					response.sendRedirect("xyz.jsp");
				}
				

				
				

	}
	
	
	

	

}
