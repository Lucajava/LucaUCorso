package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class UtilityConnessione {
	public static Connection getDBConnection() throws Exception {
		//metodo che ritorna connessione al db
				Connection dbConnection = null;
				PropertiesManagement propertiesManagement = new PropertiesManagement();
				try {

					Class.forName(propertiesManagement.getDBDriver());//passo un valore preso dalla classe variabili

				} catch (ClassNotFoundException e) {
					throw new Exception(e.getMessage());
				}

				try {

					dbConnection = DriverManager.getConnection(
							propertiesManagement.getDBConnection(), 
							propertiesManagement.getDBUsername(), 
							propertiesManagement.getDBPassword());
					return dbConnection;

				} catch (SQLException e) {
					throw new Exception(e.getMessage());
				}
	}
}