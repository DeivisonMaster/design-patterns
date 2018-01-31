package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadorDeNotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens;
	private double valorBruto;
	private double impostos;
	private Calendar dataEmissao;
	private String observacoes;

	public CriadorDeNotaFiscal(){
		this.todosItens = new ArrayList<ItemDaNota>();
	}
	
	// Métodos especiais para receber informações que serão utilizadas para a
	// montagem da Nota Fiscal

	public void paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void comCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
	}
	
	public void comObservacoes(String observacoes){
		this.observacoes = observacoes;
	}
	
	public void naDatAtual(){
		dataEmissao	= Calendar.getInstance();
	}
	
	public NotaFiscal	constroiNotaFiscal(){
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, todosItens, observacoes);
	}
}
