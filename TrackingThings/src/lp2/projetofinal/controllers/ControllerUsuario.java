package lp2.projetofinal.controllers;

/**
 * Classe responsavel por controlar todos os objetos Usuario cadastrados no sistema.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

import lp2.projetofinal.entidades.CartaoBomAmigo;
import lp2.projetofinal.entidades.CartaoCaloteiro;
import lp2.projetofinal.entidades.CartaoFreeRyder;
import lp2.projetofinal.entidades.CartaoNoob;
import lp2.projetofinal.entidades.ChaveNomeTelefone;
import lp2.projetofinal.entidades.Item;
import lp2.projetofinal.entidades.Usuario;
import lp2.projetofinal.interfaces.CartaoFidelidade;
import lp2.projetofinal.orders.OrdenaUsuarioAlfabetico;
import lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente;
import lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente;
import lp2.projetofinal.util.Exceptions;

public class ControllerUsuario {

	private Map<ChaveNomeTelefone, Usuario> usuarios;

	public ControllerUsuario() {
		usuarios = new HashMap<ChaveNomeTelefone, Usuario>();
	}

	/**
	 * Metodo responsavel por cadastrar um novo usuario no sistema. Criando
	 * antes uma chave para ele e verificando antes sua existencia no mapa.
	 * 
	 * @param nome
	 *            Nome do usuario.
	 * @param telefone
	 *            Telefone do usuario.
	 * @param email
	 *            E-mail do usuario.
	 */
	public void cadastrarUsuario(String nome, String telefone, String email) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		if (usuarios.containsKey(chave))
			Exceptions.usuarioJaCadastradoException();

		Usuario usuario = new Usuario(nome, email, telefone);

		this.usuarios.put(chave, usuario);

		usuario.setCartao(new CartaoFreeRyder());
	}

	/**
	 * Metodo responsavel por recuperar uma informacao do usuario escolhido.
	 * Verificando antes sua existencia no mapa.
	 *
	 * @param nome
	 *            Nome do usuario.
	 * @param telefone
	 *            Telefone do usuario.
	 * @param atributo
	 *            Atributo escolhido para ser retornado.
	 * 
	 * @return Retorna uma string com o atributo escolhido.
	 */
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
		else if (atributo.equals("Reputacao"))
			return "" + usuario.getReputacao();
		else if (atributo.equals("Cartao"))
			return usuario.getCartao().getNomeCartao();
		else
			Exceptions.atributoInvalidoException();

		return null;

	}

	/**
	 * Metodo responsavel por verificar a existencia de um usuario no mapa de
	 * usuarios. Amplamente utilizado nos metodos desse classe.
	 * 
	 * @param chave
	 *            Chave do usuario que sera verificado.
	 */
	private void verificaExistenciaChaveMapa(ChaveNomeTelefone chave) {

		if (!this.usuarios.containsKey(chave))
			Exceptions.usuarioInvalidoException();
	}

	/**
	 * Metodo responsavel remover um usuario da lista de usuarios, verificando
	 * antes sua existencia no mapa de usuarios.
	 * 
	 * @param nome
	 *            Nome do usuario.
	 * @param telefone
	 *            Telefone do usuario.
	 */
	public void removerUsuario(String nome, String telefone) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		verificaExistenciaChaveMapa(chave);

		this.usuarios.remove(chave);

	}

	/**
	 * Metodo responsavel por atualizar uma informacao em um usuario.
	 * Verificando antes sua existencia no mapa de usuarios e a existencia do
	 * atributo escolhido.
	 * 
	 * @param nome
	 *            Nome do usuario.
	 * @param telefone
	 *            Telefone do usuario.
	 * @param atributo
	 *            Atributo escolhido para ser retornado.
	 * @param valor
	 *            Novo valor do atributo escolhido.
	 */
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

	/**
	 * Metodo responsavel por identificar um usuario no mapa de usuarios e
	 * retornar o mesmo. Esse objeto eh amplamente utilizado pelo sistema,
	 * inclusive sendo chave do mapa de itens.
	 * 
	 * @param nome
	 *            Nome do usuario.
	 * @param telefone
	 *            Telefone do usuario.
	 * 
	 * @return Retorna um objeto do tipo usuario, que encontra-se no mapa de
	 *         usuarios.
	 */
	public Usuario identificaUsuario(String nome, String telefone) {

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		verificaExistenciaChaveMapa(chave);

		return usuarios.get(chave);
	}

	public Set<Item> retornaUsuarioItens(String nome, String telefone) {

		Usuario usuario = identificaUsuario(nome, telefone);

		return usuario.retornaSeusItens();

	}

	public void atualizaReputacao(String nome, String telefone, double valor, boolean acresce) {

		Usuario usuario = identificaUsuario(nome, telefone);

		usuario.atualizaReputacao(valor, acresce);

		atualizaCartaoFidelidade(nome, telefone);

	}

	public void atualizaCartaoFidelidade(String nome, String telefone) {

		Usuario usuario = identificaUsuario(nome, telefone);
		Double reputacao = usuario.getReputacao();

		CartaoFidelidade cartao = new CartaoNoob();

		if (reputacao < 0.0)
			cartao = new CartaoCaloteiro();

		else if (reputacao > 100.0)
			cartao = new CartaoBomAmigo();
		else if (reputacao >= 0) {
			if (usuario.retornaSeusItens().isEmpty())
				cartao = new CartaoFreeRyder();
		}
		usuario.setCartao(cartao);

	}

	public Set<Item> todosUsuariosItens() {

		Set<Item> listaTodosItens = new HashSet<Item>();

		for (Usuario usuario : this.usuarios.values()) {
			listaTodosItens.addAll(usuario.retornaSeusItens());
		}
		return listaTodosItens;
	}

	public void verificaFidelidadeUsuario(String nomeRequerente, String telefoneRequerente) {

		Usuario usuario = identificaUsuario(nomeRequerente, telefoneRequerente);

		if (!usuario.getCartao().permisaoPegarEmprestado())
			Exceptions.usuarioNaoPodePegarItemException();
	}

	public void verificadisponibilidadeUsuario(String nomeRequerente, String telefoneRequerente, int periodo) {

		Usuario usuario = identificaUsuario(nomeRequerente, telefoneRequerente);

		if (usuario.getCartao().prazoEmprestimo() < periodo)
			Exceptions.usuarioImpossibilitadoDePegarItemNessePeriodoException();

	}

	public String listarCaloteiros() {
		String stringCaloteiros = "Lista de usuarios com reputacao negativa: ";

		List<Usuario> caloteiros = new ArrayList<Usuario>();

		for (Usuario usuario : this.usuarios.values()) {
			if (usuario.getReputacao() < 0.0) {
				caloteiros.add(usuario);
			}
		}
		Collections.sort(caloteiros, new OrdenaUsuarioAlfabetico());

		for (Usuario usuario : caloteiros) {
			stringCaloteiros += usuario.toString() + "|";
		}

		return stringCaloteiros;
	}

	public String listarTop10MelhoresUsuarios() {
		String stringTop10MelhoresUsuarios = "";

		List<Usuario> top10MelhoresUsuarios = new ArrayList<Usuario>(this.usuarios.values());

		Collections.sort(top10MelhoresUsuarios, new OrdenaUsuarioReputacaoDecrescente());

		int posicaoTop10 = 1;

		for (Usuario usuario : top10MelhoresUsuarios) {
			if (posicaoTop10 == 11) {
				break;
			}
			stringTop10MelhoresUsuarios += posicaoTop10 + ": " + usuario.getNome() + " - Reputacao: "
					+ String.format("%.2f", usuario.getReputacao()) + "|";

			posicaoTop10++;
		}

		return stringTop10MelhoresUsuarios;

	}

	public String listarTop10PioresUsuarios() {
		String stringTop10PioresUsuarios = "";

		List<Usuario> top10PioresUsuarios = new ArrayList<Usuario>(this.usuarios.values());

		Collections.sort(top10PioresUsuarios, new OrdenaUsuarioReputacaoCrescente());

		int posicaoTop10 = 1;

		for (Usuario usuario : top10PioresUsuarios) {
			if (posicaoTop10 == 11) {
				break;
			}
			stringTop10PioresUsuarios += posicaoTop10 + ": " + usuario.getNome() + " - Reputacao: "
					+ String.format("%.2f", usuario.getReputacao()) + "|";

			posicaoTop10++;
		}

		return stringTop10PioresUsuarios;
	}
}