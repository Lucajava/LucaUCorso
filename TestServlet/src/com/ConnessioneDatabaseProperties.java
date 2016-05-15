/**
 * 
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;




/**
 * @author franksisca
 *
 */
public class ConnessioneDatabaseProperties {

	/**
	 * @param args
	 * @throws Exceptùion
	 */
	public static void main(String[] args) throws Exception {
		PropertiesManagement propertiesManagement = new PropertiesManagement();

		Connection dbConnection = null;

		try {

			Class.forName(propertiesManagement.getDBDriver());

		} catch (ClassNotFoundException e) {
			throw new Exception(e.getMessage());
		}

		try {

			dbConnection = DriverManager.getConnection(
					propertiesManagement.getDBConnection(), 
					propertiesManagement.getDBUsername(), 
					propertiesManagement.getDBPassword());

		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}

	}
	
	

}
