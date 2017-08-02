package lp2.projetofinal.controllers;

import java.util.HashMap;
import java.util.Map;

import lp2.projetofinal.entidades.ChaveNomeTelefone;
import lp2.projetofinal.entidades.Usuario;
import lp2.projetofinal.util.Checks;
import lp2.projetofinal.util.Exceptions;

public class ControllerUsuario {

	private Map<ChaveNomeTelefone, Usuario> usuarios;

	public ControllerUsuario() {
		usuarios = new HashMap<ChaveNomeTelefone, Usuario>();
	}

	public void cadastrarUsuario(String nome, String telefone, String email) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaEmailVazioNulo(email);

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		if (usuarios.containsKey(chave))
			Exceptions.usuarioJaCadastradoException();

		Usuario usuario = new Usuario(nome, email, telefone);

		usuarios.put(chave, usuario);
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaAtributolVazioNulo(atributo);

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		if (!usuarios.containsKey(chave))
			Exceptions.usuarioInvalidoException();

		Usuario usuario = usuarios.get(chave);

		if (atributo.equals("Email"))
			return usuario.getEmail();
		else if (atributo.equals("Nome"))
			return usuario.getNome();
		else if (atributo.equals("Telefone"))
			return usuario.getTelefone();
		else
			Exceptions.atributoInvalidoException();
		;
		return atributo;

	}

	public void removerUsuario(String nome, String telefone) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		if (!usuarios.containsKey(chave))
			Exceptions.usuarioInvalidoException();

		usuarios.remove(chave);

	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaAtributolVazioNulo(atributo);
		Checks.verificaValorVazioNulo(valor);

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		if (!usuarios.containsKey(chave))
			Exceptions.usuarioInvalidoException();

		Usuario usuario = usuarios.get(chave);

		switch (atributo) {
		case ("Email"):
			usuario.setEmail(valor);
			break;
		case ("Telefone"):
			usuario.setTelefone(valor);
			break;
		case ("Nome"):
			usuario.setNome(valor);
			break;
		}
	}

}
