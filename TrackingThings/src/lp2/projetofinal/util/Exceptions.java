package lp2.projetofinal.util;

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

}
