package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
				String scelta1="scelta1";
				String scelta2="scelta2";
				String scelta3="scelta3";
				String scelta_selezionata = request.getParameter("scelta");
			
				
				if (scelta_selezionata.equals(scelta1)) {
					
				  	response.sendRedirect("risultato1.jsp");
				}
				else if (scelta_selezionata.equals(scelta2)) {
					
					response.sendRedirect("InsNumero.jsp");
					
				}
				else
					if (scelta_selezionata.equals(scelta3)) {
						response.sendRedirect("risultato3.jsp");
					}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
	    
			
		}
		
	      
	      
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);	
		 
	}
}
