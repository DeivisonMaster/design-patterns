package builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscal {
	public static void main(String[] args) {
//		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200.0), new ItemDaNota("item 2", 400.0));
//		
//		double valorTotal = 0;
//		for(ItemDaNota item : itens){
//			valorTotal += item.getValor();
//		}
//		
//		double impostos = valorTotal * 0.05;
//		
//		new NotaFiscal("razao social", "cnpj", Calendar.getInstance(), valorTotal, impostos, itens, "observacao qualquer");
		
		
		CriadorDeNotaFiscal	criador	= new CriadorDeNotaFiscal();
		criador.paraEmpresa("Caelum ensino e inovação");
		criador.comCnpj("12.345.678/0001-12");
		criador.comItem(new ItemDaNota("item 1", 200));
		criador.comItem(new ItemDaNota("item 1", 300));
		criador.comItem(new ItemDaNota("item 1", 400));
		criador.comObservacoes("observacao qualquer");
		criador.naDatAtual();
		
		NotaFiscal nf = criador.constroiNotaFiscal();
		System.out.println(nf.getValorBruto());
	}
}
