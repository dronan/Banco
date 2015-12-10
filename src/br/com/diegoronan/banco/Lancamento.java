package br.com.diegoronan.banco;

import br.com.diegoronan.exceptions.TipoLancamentoException;
import br.com.diegoronan.exceptions.ValorException;

public class Lancamento {

	private double valorLancamento;
	private int tipoLancamento;
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public double getValorLancamento() {
		return valorLancamento;
	}
	
	public void setValorLancamento(double valorLancamento) throws ValorException {
		if (valorLancamento < 0) {
			throw new ValorException("Valor invalido!");
		} else {
			this.valorLancamento = valorLancamento;
		}
	}
	
	public int getTipoLancamento() {
		return tipoLancamento;
	}
	
	public void setTipoLancamento(int i) throws TipoLancamentoException {
		if (i > 2 || i < 1) {
			throw new TipoLancamentoException("Operação invalida!");	
		} else {
			this.tipoLancamento = i;
		}
	}
	
	
}
