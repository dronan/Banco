package br.com.diegoronan.banco;

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
	
	public void setValorLancamento(double valorLancamento) {
		this.valorLancamento = valorLancamento;
	}
	
	public int getTipoLancamento() {
		return tipoLancamento;
	}
	
	public void setTipoLancamento(int i) {
		this.tipoLancamento = i;
	}
	
	
}
