package lp2.projetofinal.entidades;

import lp2.projetofinal.interfaces.CartaoFidelidade;

public class CartaoFreeRider implements CartaoFidelidade{

	@Override
	public boolean permisaoPegarEmprestao() {

		return true;
	}

	@Override
	public int prazoEmprestimo() {

		return 5;
	}
	
	@Override
	public String getNomeCartao(){
		return "FreeRider";
	}
}
