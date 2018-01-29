package template.method;

public class CalculadorDeImposto {
	
	// calculo do imposto em cima do valor do or�amento
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double calculoImposto = imposto.calcula(orcamento);
		System.out.println(calculoImposto);
	}
}
