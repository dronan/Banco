package br.com.diegoronan.banco;

import java.util.ArrayList;

public class Conta {

	private double saldo;
	private Correntista correntista;
	private ArrayList<Lancamento> lancamento;

	public String getLancamento() {
		String str = "Lancamentos:\n";
		for (int i = 0; i < lancamento.size(); i++) {
			str += lancamento.get(i).getTipoLancamentoStr() +" - "+ lancamento.get(i).getValorLancamento() +"\n";
		}
		return str;
	}

	public void setLancamento(ArrayList<Lancamento> lancamento) {
		this.lancamento = lancamento;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}


	void setSaldo(double saldo, int tipo) {

		switch (tipo) {
		case 1: // debito
			this.saldo -= saldo;
			break;
		case 2: // credito
			this.saldo += saldo;
			break;
		default:
			break;
		}

	}

	String getSaldo() {
		return "*************************" + 
			   "\nCorrentista: " + getCorrentista().getNomeCorrentista() +
			   "\n*************************" + 
			   "\n" + getLancamento() +
			   "*************************" +
			   "\nSaldo:  R$ "+ this.saldo;
	}

}
