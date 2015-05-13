/**
 * 
 */
package br.ufrn.ceres.projetojunitmaven.negocio;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufrn.ceres.projetoTestJunit.model.Venda;

/**
 * @author Administrador
 *
 */
public class CaixaTest {
	private ArrayList<Venda> vendas;
	private Double valorCaixa;

	@Before
	public void inicializar(){
		vendas = new ArrayList<Venda>();
		valorCaixa = 1000.0;
	}
	
	@After
	public void finalizar(){
		vendas = null;
	}

	@Test
	public void testarSaldoCaixa() {
		valorCaixa = valorCaixa + 500.0;
		assertTrue(valorCaixa == 1500.0);
	}

}
