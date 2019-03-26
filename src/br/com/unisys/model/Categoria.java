package br.com.unisys.model;

public class Categoria {

	// Atributos da classe
	private long idCategoria;
	private String nomeCategoria;
	private String descricao;

	// Construtor vazio
	public Categoria() {

	}

	// Métodos Geters en Setters
	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
