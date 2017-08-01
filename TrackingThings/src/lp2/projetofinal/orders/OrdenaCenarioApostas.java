package lp2.projetofinal.orders;

/**
 * Classe responsável implementar a interface e criar um critério de comparação para itens. Critério pela quantidade de apostas.
 * 
 * Laboratório de Programação 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import java.util.Comparator;

import lp2.projetofinal.entidades.Item;

public class OrdenaCenarioApostas implements Comparator<Item> {

	@Override
	public int compare(Item itemUm, Item itemDois) {

		return (int) (itemUm.getPreco() - itemDois.getPreco());
	}

}
