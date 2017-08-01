package lp2.projetofinal.controllers;

import java.util.HashSet;

import java.util.Set;

import lp2.projetofinal.entidades.Usuario;

public class ControllerUsuario {

	private Set<Usuario> usuarios;

	public ControllerUsuario() {
		usuarios = new HashSet<Usuario>();
	}

	public void cadastrarUsuario(String nome, String telefone, String email) {

		Usuario usuario = new Usuario(nome, email, telefone);

		if (usuarios.contains(usuario)) {
			throw new IllegalArgumentException("Usuario ja cadastrado");
		}

		usuarios.add(usuario);
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {
		
		String email = "";
		// foi o mecanismo de busca q consegui encaixar, sujeito a alteracao
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

	public void removerUsuario(String nome, String telefone) {
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
