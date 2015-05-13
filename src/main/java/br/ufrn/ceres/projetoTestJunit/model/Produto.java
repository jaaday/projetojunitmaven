package br.ufrn.ceres.projetoTestJunit.model;

public class Produto {
	private Integer codigo;
	private String nome;
	private Double valor;
	private Integer estoque;

	public Produto() {

	}
	
	public Produto(String nome, Double valor, Integer estoque) {
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

}
