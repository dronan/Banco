public class Executa {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		Correntista correntista1 = new Correntista();
		correntista1.setNomeCorrentista("Diego");
				
		Lancamento lancamento1 = new Lancamento();
		lancamento1.setTipoLancamento(1);
		lancamento1.setValorLancamento(10.00);

		Lancamento lancamento2 = new Lancamento();
		lancamento2.setTipoLancamento(1);
		lancamento2.setValorLancamento(10.00);
		
		Lancamento lancamento3 = new Lancamento();
		lancamento3.setTipoLancamento(1);
		lancamento3.setValorLancamento(10.00);
		
		conta.lancamento.add(lancamento1);
		conta.lancamento.add(lancamento2);
		conta.lancamento.add(lancamento3);
		
		correntista1.setConta(conta);
		
		System.out.println("aqui: "+ conta.getLancamento().size());
		
		for (int i = 0; i < conta.getLancamento().size(); i++) {
			
		}
		
	}
}
