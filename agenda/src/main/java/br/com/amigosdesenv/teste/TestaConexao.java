/**
 * 
 */
package br.com.amigosdesenv.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.amigosdesenv.jdbc.ConnectionFactory;

/**
 * @author CAIO CARDOSO
 *
 */
public class TestaConexao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection	connection	=	new	ConnectionFactory().getConnection();
		System.out.println("Conexão	aberta!");
		connection.close();

	}

}
