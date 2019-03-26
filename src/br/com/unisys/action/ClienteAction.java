package br.com.unisys.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.unisys.model.Cliente;
import br.com.unisys.model.ClienteDAO;

public class ClienteAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Captura de dados do formulário

		Cliente cliente = new Cliente();
		cliente.setNomeCliente(request.getParameter("txtNomeCliente"));
		cliente.setCpf(request.getParameter("txtCpf"));
		cliente.setDataNasc(request.getParameter("txtDataNasc"));
		cliente.setSexo(request.getParameter("txtSexo"));
		cliente.setTelefone(request.getParameter("txtTelefone"));

		// Teste
		response.getWriter().println(cliente.getNomeCliente());
		response.getWriter().println(cliente.getCpf());
		response.getWriter().println(cliente.getDataNasc());
		response.getWriter().println(cliente.getSexo());
		response.getWriter().println(cliente.getTelefone());

		// DAO
		try {
			ClienteDAO dao = new ClienteDAO();
			dao.adiciona(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
