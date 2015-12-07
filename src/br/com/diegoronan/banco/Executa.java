package br.com.diegoronan.banco;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.diegoronan.exceptions.BancoException;

public class Executa {
	public static void main(String[] args) throws BancoException {
		
		Conta conta = new Conta();
		
		Correntista correntista1 = new Correntista();
		correntista1.setNomeCorrentista("Diego");
		correntista1.setConta(conta);
		conta.setCorrentista(correntista1);
		
		ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();		
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Operação:\n1 - Debito\n2 - Credito\n\n");

		do {
			
			int tipo;
						
			System.out.print("Operação: ");
			tipo = scan.nextInt();
				
			if (tipo > 2 || tipo < 1) {
				throw new BancoException("Operação invalida!");	
			}
							
			System.out.print("Valor: ");
			double valor = scan.nextDouble();
			
			Lancamento lancamento = new Lancamento();
			lancamento.setTipoLancamento(tipo);
			lancamento.setValorLancamento(valor);
			lancamento.setConta(conta);
			
			lancamentos.add(lancamento);
			
			scan.nextLine();
			
			System.out.println("Adicionar novo? [s/n]");
			
		} while (scan.hasNext() && (scan.nextLine().equalsIgnoreCase("s")));
				
		for (Lancamento lancamento : lancamentos) {
			lancamento.getConta().setSaldo(lancamento.getValorLancamento(), lancamento.getTipoLancamento());
		}
		
		System.out.println("Correntista: " + conta.getCorrentista().getNomeCorrentista() + "\nSaldo:  R$ "+ conta.getSaldo());
		
		
		
		
	}
}

