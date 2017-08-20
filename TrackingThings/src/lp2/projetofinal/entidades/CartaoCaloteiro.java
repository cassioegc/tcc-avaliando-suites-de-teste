package lp2.projetofinal.entidades;

import lp2.projetofinal.interfaces.CartaoFidelidade;

public class CartaoCaloteiro implements CartaoFidelidade{

	@Override
	public boolean permisaoPegarEmprestado() {

		return false;
	}

	@Override
	public int prazoEmprestimo() {

		return 0;
	}
	
	@Override
	public String getNomeCartao(){
		return "Caloteiro";
	}

}
