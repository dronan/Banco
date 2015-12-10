package br.com.diegoronan.banco;

public class Conta {

	private double saldo;
	private Correntista correntista;

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
		return "Correntista: " + getCorrentista().getNomeCorrentista() + "\nSaldo:  R$ "+ this.saldo;
	}

}
