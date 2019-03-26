package br.com.unisys.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		/*
		 * try { return DriverManager.getConnection("jdbc:oracle:127.0.0.1:1521",
		 * "system", "jesus"); } catch (SQLException e) { throw new RuntimeException(e);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * public Connection getConnection() throws SQLException, ClassNotFoundException
		 * { /* Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 * 
		 * String urlConnection = "jdbc:sqlserver://DANIEL-PC\\SQLEXPRESS; " +
		 * "databasename=Unisys;username=sa;password=jesus"; return
		 * DriverManager.getConnection(urlConnection);
		 */
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Locale.setDefault(new Locale("en", "US"));
		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "system", "jesus");

	}

}
