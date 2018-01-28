package chain.of.responsibility;

public class CalculadoraDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto descontoPorCincoItens = new DescontoPorCincoItens();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto semDesconto = new SemDesconto();

		descontoPorCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(semDesconto);
		
		return descontoPorCincoItens.desconto(orcamento);
	}
}
