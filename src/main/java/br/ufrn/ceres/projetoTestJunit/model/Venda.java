package br.ufrn.ceres.projetoTestJunit.model;

import java.util.Date;

public class Venda {
	private Produto produto;
	private Date dataVenda;
	private Integer quantidade;
	private Double valorTotal;

	public Venda() {
		produto = new Produto();
	}

	public Venda(Produto produtos, Date dataVenda, Integer quantidade, Double valorTotal) {
		this.produto = produtos;
		this.dataVenda = dataVenda;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
