package lp2.projetofinal.orders;

/**
 * Classe responsavel implementar a interface Comparator e criar um criterio de comparacao para itens. 
 * Criterio da ordenacao por ordem alfabetica.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import java.util.Comparator;

import lp2.projetofinal.entidades.Item;

public class OrdenaItemAlfabetico implements Comparator<Item> {

	@Override
	public int compare(Item itemUm, Item itemDois) {
		return itemUm.getNome().compareTo(itemDois.getNome());
	}
	

	

}
