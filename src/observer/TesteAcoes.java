package observer;

public class TesteAcoes {
	public static void main(String[] args) {
		CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal();
		criador.adicionaAcao(new EnviadorEmail());
		criador.adicionaAcao(new EnviadorSMS());
		criador.adicionaAcao(new NotaFiscalDao());
		criador.adicionaAcao(new Impressora());

		criador.paraEmpresa("caelum");
		criador.comCnpj("00.111.222/0001-2");
		criador.comItem(new ItemDaNota("item 1", 200.0));
		criador.naDatAtual();
		criador.comObservacoes("teste");

		NotaFiscal nf = criador.constroiNotaFiscal();
		System.out.println(nf.getValorBruto());
	}
}
