package lp2.projetofinal.orders;

import java.util.Comparator;

import lp2.projetofinal.entidades.Emprestimo;

public class OrdenaItemEmprestadoAlfabetico implements Comparator<Emprestimo> {

	@Override
	public int compare(Emprestimo emprestimoUm, Emprestimo emprestimoDois) {
		return emprestimoUm.getItem().getNome().compareTo(emprestimoDois.getItem().getNome());
	}

}
