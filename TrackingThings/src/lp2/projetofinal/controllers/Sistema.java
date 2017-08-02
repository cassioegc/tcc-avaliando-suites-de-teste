package lp2.projetofinal.controllers;

import lp2.projetofinal.util.Checks;

public class Sistema {

	private ControllerUsuario controllerUsuario;

	public Sistema() {
		controllerUsuario = new ControllerUsuario();
	}

	public void cadastrarUsuario(String nome, String telefone, String email) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaEmailVazioNulo(email);

		controllerUsuario.cadastrarUsuario(nome, telefone, email);

	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaAtributolVazioNulo(atributo);

		return controllerUsuario.getInfoUsuario(nome, telefone, atributo);
	}

	public void removerUsuario(String nome, String telefone) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);

		controllerUsuario.removerUsuario(nome, telefone);
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		Checks.verificaNomeVazioNulo(nome);
		Checks.verificaTelefoneVazioNulo(telefone);
		Checks.verificaAtributolVazioNulo(atributo);
		Checks.verificaValorVazioNulo(valor);

		controllerUsuario.atualizarUsuario(nome, telefone, atributo, valor);

	}

	public void finalizar() {

	}
}
