package template.method;

public interface Desconto {
	
	double desconto(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
