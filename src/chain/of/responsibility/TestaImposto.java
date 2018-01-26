package chain.of.responsibility;

public class TestaImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImposto calc = new CalculadorDeImposto();
		Imposto icms = new ICMS();
		Imposto	iss	 = new ISS();
		
		calc.realizaCalculo(orcamento, iss);
		calc.realizaCalculo(orcamento, icms);
	}
}
