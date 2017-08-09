package lp2.projetofinal.util;

/**
 * Classe que contem metodos estaticos responsaveis por lancar excessoes chacadas dentro do metodo.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

public class Exceptions {

	public static void usuarioJaCadastradoException(){
		throw new IllegalArgumentException("Usuario ja cadastrado");
	}
	
	public static void itemNaoEncontradoException(){
		throw new IllegalArgumentException("Item nao encontrado");
	}
	
	public static void usuarioInvalidoException(){
		throw new IllegalArgumentException("Usuario invalido");
	}
	
	public static void atributoInvalidoException(){
		throw new IllegalArgumentException("Atributo invalido");
	}

	public static void itemEmprestadoNoMomento() {
		throw new IllegalArgumentException("Item emprestado no momento");
	}

	public static void emprestimoNaoEncontrado() {
		throw new IllegalArgumentException("Emprestimo nao encontrado");
	}

}
