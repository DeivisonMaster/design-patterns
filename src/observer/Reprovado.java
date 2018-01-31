package observer;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovado n�o recebe desconto extra");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("or�amentos esta reprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("or�amentos ja esta reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual	= new Finalizado();
	}
}
