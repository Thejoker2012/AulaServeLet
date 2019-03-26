package br.com.unisys.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.unisys.model.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		new ConnectionFactory();
		Connection cn = ConnectionFactory.getConnection();
		System.out.println("Conexão aberta!");
		
		cn.close();
	}

}
