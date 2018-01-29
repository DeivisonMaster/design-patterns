package template.method;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto descontoPorCincoItens = new DescontoPorCincoItens();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto semDesconto = new SemDesconto(); // indica o fim dos descontos
		
		
		// informo o proximo desconto a ser invocado caso o primeiro desconto falhe
		descontoPorCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(semDesconto);
		
		// primeiro desconto
		return descontoPorCincoItens.desconto(orcamento);
	}
}
