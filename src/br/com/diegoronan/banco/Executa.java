package br.com.diegoronan.banco;
import java.util.ArrayList;

public class Executa {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
				
		Correntista correntista1 = new Correntista();
		correntista1.setNomeCorrentista("Diego");
		correntista1.setConta(conta);
		conta.setCorrentista(correntista1);
				
		Lancamento lancamento1 = new Lancamento();
		lancamento1.setTipoLancamento(1);
		lancamento1.setValorLancamento(10.00);
		lancamento1.setConta(conta);

		Lancamento lancamento2 = new Lancamento();
		lancamento2.setTipoLancamento(1);
		lancamento2.setValorLancamento(20.00);
		lancamento2.setConta(conta);
		
		Lancamento lancamento3 = new Lancamento();
		lancamento3.setTipoLancamento(1);
		lancamento3.setValorLancamento(30.00);
		lancamento3.setConta(conta);
		
		Lancamento lancamento4 = new Lancamento();
		lancamento4.setTipoLancamento(2);
		lancamento4.setValorLancamento(130.00);
		lancamento4.setConta(conta);
		
		ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>(); 
		lancamentos.add(lancamento1);
		lancamentos.add(lancamento2);
		lancamentos.add(lancamento3);
		lancamentos.add(lancamento4);
		
		for (Lancamento lancamento : lancamentos) {
			lancamento.getConta().setSaldo(lancamento.getValorLancamento(), lancamento.getTipoLancamento());
		}
		
		System.out.println("Correntista: " + conta.getCorrentista().getNomeCorrentista() + "\nSaldo:  R$ "+ conta.getSaldo());
		
		
		
		
	}
}
