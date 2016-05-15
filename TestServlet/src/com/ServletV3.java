package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Servlet implementation class ServletV3
 */
@WebServlet("/ServletV3")
public class ServletV3 extends HttpServlet {

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletV3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection dbConnection = null;
		Statement statement = null;
		String selectTableSQL = "SELECT * FROM BA order by ESTRAZ desc limit 1";

		try {
			dbConnection = UtilityConnessione.getDBConnection();
			statement = dbConnection.prepareStatement(selectTableSQL);

			ResultSet rs = statement.executeQuery(selectTableSQL);

			while (rs.next()) {
				Date d = rs.getDate(1);
                int c=rs.getInt(2);
                int ba1=rs.getInt(3);
                int ba2=rs.getInt(4);
                int ba3=rs.getInt(5);
                int ba4=rs.getInt(6);
                int ba5=rs.getInt(7);
                
                
                PrintWriter writer =  response.getWriter();
       	     response.setContentType("text/html");
       	     writer.println("<h4>Ultima Estrazione ruota di Bari :</h4>");
       	  
       	     writer.println("Data: "+d+" Concorso: "+c+" Numeri estratti:"+ba1+" "+ba2+" "+ba3+" "+ba4+" "+ba5);
				

			}
			statement.close();

		} catch (SQLException e) {

			System.err.println(e.getMessage());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (dbConnection != null) {
				try {
					dbConnection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

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
