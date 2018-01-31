package builder;

public class TesteImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto issComIcms = new ISS(new ICMS());
		Orcamento orcamento = new Orcamento(500);
		
		double valor = issComIcms.calcula(orcamento);
		System.out.println(valor);
	} 
}
