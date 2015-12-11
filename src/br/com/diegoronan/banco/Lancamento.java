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
	
	public String getTipoLancamentoStr() {
		
		String str = "";
		
		switch (tipoLancamento){
		case 1:
			str = "Debito";
			break;
		case 2:
			str = "Credito";
			break;
		default:
			return null;
		}
		
		return str;
	}

	
	public void setTipoLancamento(int i) throws TipoLancamentoException {
		switch (i) {
		case 1:
		case 2:
			this.tipoLancamento = i;
			break;
		default:
			throw new TipoLancamentoException("Operação invalida!");
		}
	}
	
}
