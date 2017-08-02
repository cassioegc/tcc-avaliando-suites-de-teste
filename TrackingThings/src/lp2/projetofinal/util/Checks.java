package lp2.projetofinal.util;

/**
 * Classe responsavel por encapsular os metodos relacionados a validacoes no
 * projeto.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

public class Checks {
	
	public static void verificaNomeVazioNulo(String nome){
		if(nome.trim().isEmpty()){
			throw new IllegalArgumentException("Nome usuario nao pode ser vazio ou nulo");
		}
	}

	public static void verificaTelefoneVazioNulo(String telefone){
		if(telefone.trim().isEmpty()){
			throw new IllegalArgumentException("Telefone nao pode ser vazio ou nulo");
		}
	}
	
	public static void verificaEmailVazioNulo(String email){
		if(email.trim().isEmpty()){
			throw new IllegalArgumentException("Email nao pode ser vazio ou nulo");
		}
	}
		
	public static void verificaAtributolVazioNulo(String atributo){
		if(atributo.trim().isEmpty()){
			throw new IllegalArgumentException("Atributo nao pode ser vazio ou nulo");
			// SE A STRING ATRIBUTO == "Email"????;
		}
	}
	
	public static void verificaValorVazioNulo(String valor){
		if (valor.trim().isEmpty()) {
			throw new IllegalArgumentException("Valor nao pode ser vazio ou nulo");
		}
	}
	
}
