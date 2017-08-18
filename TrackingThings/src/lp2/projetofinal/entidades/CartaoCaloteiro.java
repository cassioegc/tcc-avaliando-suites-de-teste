package lp2.projetofinal.entidades;

import lp2.projetofinal.interfaces.CartaoFidelidade;

public class CartaoCaloteiro implements CartaoFidelidade{

	@Override
	public boolean permisaoPegarEmprestao() {

		return false;
	}

	@Override
	public int prazoEmprestimo() {

		return 0;
	}

}
