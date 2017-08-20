package lp2.projetofinal.entidades;

import lp2.projetofinal.interfaces.CartaoFidelidade;

public class CartaoNoob implements CartaoFidelidade{

	@Override
	public boolean permisaoPegarEmprestado() {
		
		return true;
	}

	@Override
	public int prazoEmprestimo() {

		return 7;
	}
	
	@Override
	public String getNomeCartao(){
		return "Noob";
	}

}
