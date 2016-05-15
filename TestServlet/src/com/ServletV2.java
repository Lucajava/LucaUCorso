package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletV2
 */
@WebServlet("/ServletV2")
public class ServletV2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletV2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String numero= request.getParameter("numero");
		int numero1= Integer.parseInt(numero);
		int quadratoNumero=numero1*numero1;
		double radiceQuadrata= Math.sqrt((double)numero1);
		
		PrintWriter writer =  response.getWriter();
	      response.setContentType("text/html");
	      writer.println("Il quadrato del numero "+numero1+" è "+quadratoNumero+ "e la radice quadrata è :"+radiceQuadrata);
	 
		doGet(request, response);
	}

}
