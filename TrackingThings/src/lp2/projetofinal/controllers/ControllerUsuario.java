package lp2.projetofinal.controllers;

import java.util.HashSet;
import java.util.Set;

import lp2.projetofinal.entidades.Usuario;
import lp2.projetofinal.util.Checks;
import lp2.projetofinal.util.Exceptions;

public class ControllerUsuario {

	private Set<Usuario> usuarios;

	public ControllerUsuario() {
		usuarios = new HashSet<Usuario>();
	}

	public void cadastrarUsuario(String nome, String telefone, String email) {
		
		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaEmailVazioNulo(email);
		
		Usuario usuario = new Usuario(nome, email, telefone);

		if (usuarios.contains(usuario))
			Exceptions.lancaIllegalArgumentException();

		usuarios.add(usuario);
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaAtributolVazioNulo(atributo);
		
		if(atributo.equals("Email")){
		
		String email = "";
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nome)) {
				if (usuario.getTelefone().equals(telefone)) {
					email = usuario.getEmail();
					break;
				}
			}
		}
		if (email.equals("")) {
			return "Usuario invalido";
		}
		return email;
	}
		
	return null;
	}

	public void removerUsuario(String nome, String telefone) {
		
		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		
		boolean temUsuario = false;
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nome) && usuario.getTelefone().equals(telefone)) {
				temUsuario = true;
				usuarios.remove(usuario);
				break;
			}
		}
		// nao tem usuario cadastrado
		if (!temUsuario) {
			throw new IllegalArgumentException("Usuario invalido");
		}
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaAtributolVazioNulo(atributo);
		Checks.verificaValorVazioNulo(valor);
		
		Usuario usuarioAtualizado = null;
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nome) && usuario.getTelefone().equals(telefone)) {

				usuarioAtualizado = usuario;
				break;
			}
		}

		switch (atributo) {
		case ("Email"):
			usuarioAtualizado.setEmail(valor);
			break;
		case ("Telefone"):
			usuarioAtualizado.setTelefone(valor);
			break;
		case ("Nome"):
			usuarioAtualizado.setNome(valor);
			break;
		}
	}

}
