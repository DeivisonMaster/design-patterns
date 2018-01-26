package chain.of.responsibility;

public class TesteDeDescontos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600.00);
		orcamento.adicionaItem(new Item("caneta", 250.0));
		orcamento.adicionaItem(new Item("lapis", 250.0));
		orcamento.adicionaItem(new Item("borracha", 250.0));
		CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
		
		double descontoFinal = calc.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
