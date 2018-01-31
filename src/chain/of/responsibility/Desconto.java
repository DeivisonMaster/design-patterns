package chain.of.responsibility;

public interface Desconto {
	
	 double desconto(Orcamento orcamento);
	 
	 void setProximo(Desconto proximo);
}
