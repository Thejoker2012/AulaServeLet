package br.com.unisys.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

	// Atributos de conexão
	private Connection cn;

	// Método Contrutor vazio
	public ClienteDAO() throws SQLException {

		try {
			this.cn = ConnectionFactory.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Método Adiciona
	public void adiciona(Cliente cliente) throws SQLException {

		String sql;
		sql = "insert into web2.Cliente(id_cliente, nome_cliente, cpf, data_nasc, sexo, telefone)";
		sql += "values(web2.seq_cliente.nextval,?,?,to_date(?,'dd/mm/yyyy'),?,?)";

		try {
			// Passa os parametros para o preparedStatemente
			PreparedStatement stmt = this.cn.prepareStatement(sql);

			// Seta os valores
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getDataNasc());
			stmt.setString(4, cliente.getSexo());
			stmt.setString(5, cliente.getTelefone());

			// Comando para executar
			stmt.execute();
			stmt.close();

			System.out.println("Gravado com Sucesso!");
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
