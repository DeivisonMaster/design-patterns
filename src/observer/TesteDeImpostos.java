package observer;

public class TesteDeImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		calculadora.realizaCalculo(orcamento, iss);
	}
}
