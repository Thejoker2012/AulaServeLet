package br.com.unisys.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Captura de dados do formulário

		String nome = request.getParameter("txtNome");
		String senha = request.getParameter("txtSenha");
		//super.service(request, response);

		// Teste de Acesso

		if (nome.equals("admin") && senha.equals("jaburu")) {
			response.getWriter().print("Acesso Liberado");
		} else {
			response.getWriter().print("Acesso Negado");

		}
	}

}
