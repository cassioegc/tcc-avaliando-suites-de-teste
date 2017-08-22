package lp2.projetofinal.entidades;

/**
 * Classe responsavel por representar um cartao para o sistema. Implementa CartaoFidelidade para o uso do strategy.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

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
