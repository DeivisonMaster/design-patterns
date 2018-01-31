package observer;

public class EnviadorEmail implements AcaoAposGerarNota  {

	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email");
	}
}
