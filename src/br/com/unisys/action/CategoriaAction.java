package br.com.unisys.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.unisys.model.Categoria;
import br.com.unisys.model.CategoriaDAO;

public class CategoriaAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Captura de dados do formulário
		Categoria categoria = new Categoria();
		categoria.setNomeCategoria(request.getParameter("txtNomeCategoria"));
		categoria.setDescricao(request.getParameter("txtDescricao"));
		
		//Teste
		response.getWriter().println(categoria.getNomeCategoria());
		response.getWriter().println(categoria.getDescricao());
		
		//DAO
		CategoriaDAO dao;
		try {
			dao = new CategoriaDAO();
			dao.Adiciona(categoria);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
