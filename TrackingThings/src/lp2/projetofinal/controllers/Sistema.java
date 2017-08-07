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

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma) {
		controllerUsuario.identificaUsuario(nome, telefone).adicionaItem(nomeItem, preco, plataforma);
	}

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {
		controllerUsuario.identificaUsuario(nome, telefone).adicionaItem(nomeItem, preco);
	}

	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao,
			String genero, String classificacao, int anoLancamento) {
		controllerUsuario.identificaUsuario(nome, telefone).adicionaItem(nomeItem, preco, duracao, genero,
				classificacao, anoLancamento);
	}

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao,
			int numeroFaixas, String artista, String classificacao) {
		controllerUsuario.identificaUsuario(nome, telefone).adicionaItem(nomeItem, preco, duracao, numeroFaixas, artista,
				classificacao);
	}

	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao,
			int duracao, String classificacao, String genero, int temporada) {
		controllerUsuario.identificaUsuario(nome, telefone).adicionaItem(nomeItem, preco, descricao, duracao, classificacao,
				genero, temporada);
	}

	public void adicionarBluRay(String nome, String telefone, String BlurayTemporada, int duracao) {
		controllerUsuario.identificaUsuario(nome, telefone).adicionarBluRayEpisodio(BlurayTemporada, duracao);
	}

	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {
		controllerUsuario.identificaUsuario(nome, telefone).cadastrarPecaPerdidaNoTabuleiro(nomeItem, nomePeca);
	}

	public void removerItem(String nome, String telefone, String nomeItem) {
		controllerUsuario.identificaUsuario(nome, telefone).removerItem( nomeItem);
	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		controllerUsuario.identificaUsuario(nome, telefone).atualizarItem(nomeItem, atributo, valor);

	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {

		return controllerUsuario.identificaUsuario(nome, telefone).getInfoItem(nomeItem, atributo);
	}

	public void finalizar() {

	}
}