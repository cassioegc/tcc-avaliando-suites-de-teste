package lp2.projetofinal.orders;

import java.util.Comparator;

import lp2.projetofinal.entidades.Item;

public class OrdenaItemNumeroEmprestimos implements Comparator<Item> {

	@Override
	public int compare(Item itemUm, Item itemDois) {

		double result = itemDois.getNumeroEmprestimos() - itemUm.getNumeroEmprestimos();
		
		if(result < 0)
			return -1;
		else if(result > 0)
			return 1;
		else
			return 0;
	}

}