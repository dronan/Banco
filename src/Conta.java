import java.util.ArrayList;

public class Conta {

	double saldo;
	ArrayList<Lancamento> lancamento;

	public ArrayList<Lancamento> getLancamento() {
		return lancamento;
	}

	public void setLancamento(ArrayList<Lancamento> lancamento) {
		this.lancamento = lancamento;
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
