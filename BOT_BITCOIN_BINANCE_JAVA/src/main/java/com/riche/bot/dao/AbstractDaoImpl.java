package com.riche.bot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public abstract class AbstractDaoImpl {

	    private static String URL = "jdbc:mysql://localhost:3306/bot";
	    private static String LOGIN = "botUser";
	    private static String PASSWORD = "botPassword";


	    protected Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, LOGIN, PASSWORD);
	    }

	    protected Statement getStatement() throws SQLException {
	        return getConnection().createStatement();
	    }

	    protected void closeConnexion(Connection pConnection, Statement statement, ResultSet resultSet) throws SQLException {
	    	try {
	    		if (resultSet != null) {
                	resultSet.close();
	    		}
            } catch (Exception e) { e.printStackTrace();}
            try {
		    	if (statement != null) {
		    		statement.close();
		    	}
	    	} catch (Exception e) {e.printStackTrace();}
	    	try {
		    	if (pConnection != null) {
		    		pConnection.close();
		    	}
	    	} catch (Exception e) {e.printStackTrace();}
	    }

}
