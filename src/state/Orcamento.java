package state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	protected double valor;
	private List<Item>	itens;
	protected EstadoDeUmOrcamento estadoAtual;
	

	public Orcamento(double valor) {
		this.valor = valor;
		itens	= new ArrayList<Item>();
		estadoAtual = new EmAprovacao(); // Inicializa��o do estado atual de um or�amento
	}
	
	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);	
	}
	
	// Alterando o estado atual do or�amento
	public void aprova(){
		estadoAtual.aprova(this);
	}
	
	public void reprova(){
		estadoAtual.reprova(this);
	}
	
	public void finaliza(){
		estadoAtual.finaliza(this);
	}
}
