package br.ufrn.ceres.projetoTestJunit.negocio;

import java.util.ArrayList;

import br.ufrn.ceres.projetoTestJunit.model.Venda;

public class Caixa {
	private ArrayList<Venda> vendas;
	private Double valorCaixa;
	
	public Caixa(){
		valorCaixa = 0.0;
		vendas = new ArrayList<Venda>();
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

	public Double getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(Double valorCaixa) {
		this.valorCaixa = valorCaixa;
	}
	
	public Boolean realizarVenda(Venda venda){
		if(venda.getValorTotal() == venda.getQuantidade() * venda.getProduto().getValor()){
			vendas.add(venda);
			valorCaixa = valorCaixa + venda.getValorTotal();
			return true;
		}
		else
			return false;
	}
	
}
