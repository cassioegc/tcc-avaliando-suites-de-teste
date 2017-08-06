package lp2.projetofinal.controllers;

import java.util.HashMap;
import java.util.Map;

import lp2.projetofinal.entidades.ChaveNomeTelefone;
import lp2.projetofinal.util.Exceptions;

public class ControllerUsuario {

	private Map<ChaveNomeTelefone, Usuario> usuarios;

	public ControllerUsuario() {
		usuarios = new HashMap<ChaveNomeTelefone, Usuario>();
	}

	public void cadastrarUsuario(String nome, String telefone, String email) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		if (usuarios.containsKey(chave)) 
			Exceptions.usuarioJaCadastradoException();

		Usuario usuario = new Usuario(nome, email, telefone);

		this.usuarios.put(chave, usuario);
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		verificaExistenciaChaveMapa(chave);

		Usuario usuario = this.usuarios.get(chave);

		if (atributo.equals("Email"))
			return usuario.getEmail();
		else if (atributo.equals("Nome"))
			return usuario.getNome();
		else if (atributo.equals("Telefone"))
			return usuario.getTelefone();
		else
			Exceptions.atributoInvalidoException();

		return null;

	}

	private void verificaExistenciaChaveMapa(ChaveNomeTelefone chave) {

		if (!this.usuarios.containsKey(chave))
			Exceptions.usuarioInvalidoException();
	}

	public void removerUsuario(String nome, String telefone) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		verificaExistenciaChaveMapa(chave);

		this.usuarios.remove(chave);

	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		verificaExistenciaChaveMapa(chave); 

		Usuario usuario = identificaUsuario(nome, telefone);

		if (atributo.equals("Email"))
			usuario.setEmail(valor);

		else if (atributo.equals("Telefone")) {
			usuario.setTelefone(valor);
			ChaveNomeTelefone newChave = new ChaveNomeTelefone(nome, valor);
			this.usuarios.put(newChave, usuario);
			this.usuarios.remove(chave);

		} else if (atributo.equals("Nome")) {
			usuario.setNome(valor);
			ChaveNomeTelefone newChave = new ChaveNomeTelefone(valor, telefone);
			this.usuarios.put(newChave, usuario);
			this.usuarios.remove(chave);

		} else
			Exceptions.atributoInvalidoException();

	}

	public Usuario identificaUsuario(String nome, String telefone) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		verificaExistenciaChaveMapa(chave);

		return usuarios.get(chave);
	}

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.adicionaItem(nomeItem, preco, plataforma);

	}

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.adicionaItem(nomeItem, preco);
	}

	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao,
			String genero, String classificacao, int anoLancamento) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.adicionaItem(nomeItem, preco, duracao, genero, classificacao, anoLancamento);
	}

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao,
			int numeroFaixas, String artista, String classificacao) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.adicionaItem(nomeItem, preco, duracao, classificacao, artista, numeroFaixas);
	}

	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao,
			int duracao, String classificacao, String genero, int temporada) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.adicionaItem(nomeItem, preco, descricao, duracao, classificacao, genero, temporada);
	}

	public void adicionarBluRayEpisodio(String nome, String telefone, String blurayTemporada, int duracao) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.adicionarBluRayEpisodio(blurayTemporada, duracao);

	}

	public void cadastrarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.cadastrarPecaPerdidaNoTabuleiro(nomeItem, nomePeca);

	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.atualizarItem(nomeItem, atributo, valor);

	}

	public void removerItem(String nome, String telefone, String nomeItem) {
		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.removerItem(nomeItem);

	}

}
