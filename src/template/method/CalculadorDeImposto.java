package template.method;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double desconto = imposto.calcula(orcamento);
		System.out.println(desconto);
	}
}
