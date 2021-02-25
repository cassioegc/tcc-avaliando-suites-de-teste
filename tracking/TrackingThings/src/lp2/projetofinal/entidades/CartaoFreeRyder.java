package lp2.projetofinal.entidades;

import java.io.Serializable;

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

public class CartaoFreeRyder implements CartaoFidelidade, Serializable{

	private static final long serialVersionUID = -1384332756555273317L;

	@Override
	public boolean permisaoPegarEmprestado() {

		return true;
	}

	@Override
	public int prazoEmprestimo() {

		return 5;
	}
	
	@Override
	public String getNomeCartao(){
		return "FreeRyder";
	}
}
