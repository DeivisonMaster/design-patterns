package observer;

public class Aprovado implements EstadoDeUmOrcamento{
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento){
		orcamento.valor -= orcamento.valor * 0.02;
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("or�amentos aprovados n�o podem ser aprovados novamente");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("or�amentos aprovados n�o podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual	= new Finalizado();
	}
}
