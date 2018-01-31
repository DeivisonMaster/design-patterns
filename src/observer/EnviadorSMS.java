package observer;

public class EnviadorSMS implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf) {
		System.out.println("enviei por SMS");
	}
}
