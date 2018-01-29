package decorator;

public abstract class TemplateImpostoCondicional extends Imposto{
	// Semelhança entre impostos ou entre CLASSES!
	
	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}else{
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
}
