package builder;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não recebe desconto extra");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("orçamentos esta reprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("orçamentos ja esta reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual	= new Finalizado();
	}
}
