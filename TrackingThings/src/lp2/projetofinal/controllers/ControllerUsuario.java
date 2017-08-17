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
import java.util.Map;

import lp2.projetofinal.entidades.ChaveNomeTelefone;
import lp2.projetofinal.entidades.Emprestimo;
import lp2.projetofinal.entidades.Usuario;
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

	/**
	 * Metodo responsavel por adicionar um emprestimo realizado ao conjunto de
	 * emprestimos realizado de um usuario escolhido. Veficando antes a
	 * existencia do usuario no mapa de usuarios.
	 * 
	 * @param nomeDono
	 *            Nome do usuario dono do item.
	 * @param telefoneDono
	 *            Telefone do usuario dono do item.
	 * @param nomeRequerente
	 *            Nome do usuario requerente do item.
	 * @param telefoneRequerente
	 *            Telefone do usuario requerente do item.
	 * @param emprestimo
	 *            Objeto do tipo Emprestimo que será guardado no conjunto de
	 *            cada usuario relacionado.
	 */
	public void adicionarEmprestimoRealizado(String nomeDono, String telefoneDono, String nomeRequerente,
			String telefoneRequerente, Emprestimo emprestimo) {

		ChaveNomeTelefone chaveDono = new ChaveNomeTelefone(nomeDono, telefoneDono);
		ChaveNomeTelefone chaveRequerente = new ChaveNomeTelefone(nomeRequerente, telefoneRequerente);

		verificaExistenciaChaveMapa(chaveDono);
		verificaExistenciaChaveMapa(chaveRequerente);

		identificaUsuario(nomeDono, telefoneDono).registraEmprestimoRealizado(emprestimo);
		identificaUsuario(nomeRequerente, telefoneRequerente).registraEmprestimoRealizado(emprestimo);
	}
	
	public void atualizaReputacao(String nome, String telefone, double valor,boolean acresce) {
		

		ChaveNomeTelefone chave = new ChaveNomeTelefone(nome, telefone);

		verificaExistenciaChaveMapa(chave);

		Usuario usuario = identificaUsuario(nome, telefone);
		
		usuario.atualizaReputacao(valor,acresce);
		
	}

}