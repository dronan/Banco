package br.com.diegoronan.banco;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.diegoronan.exceptions.TipoLancamentoException;
import br.com.diegoronan.exceptions.ValorException;

public class Executa {
	public static void main(String[] args) throws TipoLancamentoException {
		
		Conta conta = new Conta();
		
		Correntista correntista1 = new Correntista();
		correntista1.setNomeCorrentista("Diego");
		correntista1.setConta(conta);
		conta.setCorrentista(correntista1);
		
		ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();		
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Operação:\n1 - Debito\n2 - Credito\n\n");

		do {
			
			Lancamento lancamento = new Lancamento();
			
			int tipo;
			
			try {
				
				System.out.print("Operação: ");
				tipo = scan.nextInt();
				
				lancamento.setTipoLancamento(tipo);
				
				System.out.print("Valor: ");
				double valor = scan.nextDouble();
						
				lancamento.setValorLancamento(valor);
				

				lancamento.setConta(conta);
				
				
				lancamentos.add(lancamento);
				
				scan.nextLine();
				
				System.out.println("\nAdicionar novo? [s/n]");
				
			} catch(TipoLancamentoException e) {
				System.out.println("\nOperação Inválida.\n");
				scan.nextLine();
				System.out.println("Continuar? [s/n]\n");
			} catch(ValorException e) {
				System.out.println("\nValor Inválido.\n");
				scan.nextLine();
				System.out.println("Continuar? [s/n]\n");
			} catch (InputMismatchException e){
				System.out.println("\nValor deve números.\n");
				scan.nextLine();
				System.out.println("Continuar? [s/n]\n");
			}	

			
		} while (scan.hasNext() && (scan.nextLine().equalsIgnoreCase("s")));
			
		conta.setLancamento(lancamentos);
		
		for (Lancamento lancamento : lancamentos) {
			conta.setSaldo(lancamento.getValorLancamento(), lancamento.getTipoLancamento());
		}
		
		System.out.println(conta.getSaldo());
		
	}
}

