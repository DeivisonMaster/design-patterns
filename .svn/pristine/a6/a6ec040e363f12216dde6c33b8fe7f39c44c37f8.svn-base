package decorator;

public class TesteImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto	impostoIssIcms	= new ISS(new ICMS());
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = impostoIssIcms.calcula(orcamento);
		System.out.println(valor);
	}
}
