/**
 * 
 */
package br.com.amigosdesenv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author CAIO CARDOSO
 *
 */
public class ConnectionFactory {
	public Connection getConnection() throws ClassNotFoundException {
		try {
			 Class.forName("com.mysql.jdbc.Driver"); 
			return DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
