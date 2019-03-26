package br.com.unisys.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.unisys.model.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		new ConnectionFactory();
		Connection cn;
		try {
			cn = ConnectionFactory.getConnection();
			cn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conexão aberta!");
		
		
	}

}
