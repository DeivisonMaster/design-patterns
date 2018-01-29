package decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.itens = new ArrayList<Item>();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
}
