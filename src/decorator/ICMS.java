package decorator;

public class ICMS extends Imposto{
	
	public ICMS(Imposto imposto){
		super(imposto);
	}
	
	public ICMS(){}
	
	public double calcula(Orcamento orcamento){
		return orcamento.getValor() * 0.1 + calcula(orcamento);
	}
}
