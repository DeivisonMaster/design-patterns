package template.method;

public class TesteDescontos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		
		orcamento.adicionaItem(new Item("lapis", 250.0));
		orcamento.adicionaItem(new Item("caneta", 250.0));
		
		CalculadorDeDescontos calc = new CalculadorDeDescontos();
		double imposto = calc.calcula(orcamento);
		
		System.out.println(imposto);
	}
}
