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

		if (tipo == 1) {
			this.saldo -= saldo;
		} else {
			this.saldo += saldo;
		}

	}

	double getSaldo() {
		return saldo;
	}

}
