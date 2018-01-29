package decorator;

public class TesteDeImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		Imposto icms = new ICMS();
		Imposto iss = new ISS();

		calculadora.realizaCalculo(orcamento, iss);
		calculadora.realizaCalculo(orcamento, icms);
	}
}
