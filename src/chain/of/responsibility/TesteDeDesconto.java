package chain.of.responsibility;

public interface TesteDeDesconto {
	public static void main(String[] args) {
		// primeira regra
		Orcamento orcamento = new Orcamento(500.0); 
		
		// segunda regra
		orcamento.adicionaItem(new Item("lapis", 250.0)); 
		orcamento.adicionaItem(new Item("caneta", 250.0));
		
		
		CalculadorDeDesconto calculadora = new CalculadorDeDesconto();
		double descontoFinal = calculadora.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
