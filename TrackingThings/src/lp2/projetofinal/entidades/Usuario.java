package lp2.projetofinal.entidades;

/**
 * Representacao de um usuario cadastrado no Sistema, todo
 * usuario no sistema tem o nome do usuario, telefone e email.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */
import java.util.HashSet;
import java.util.Set;

import lp2.projetofinal.interfaces.CartaoFidelidade;

public class Usuario {

	private String nome;
	private String email;
	private String telefone;
	private Set<Emprestimo> emprestimosRealizados;
	private double reputacao;
	private CartaoFidelidade cartao;

	/**
	 * Cria um usuario com nome, email e telefone
	 *
	 * @param nome
	 *            O nome do usuario.
	 * @param email
	 *            O email do usuario.
	 * 
	 * @param telefone
	 *            A telefone do usuario.
	 */
	public Usuario(String nome, String email, String telefone) {

		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.emprestimosRealizados = new HashSet<Emprestimo>();
		this.reputacao = 0;
		this.cartao = new CartaoNoob();
	}
	
	/**
	 * @return = o cartao do usuario.
	 */
	public CartaoFidelidade getCartao(){
		return cartao;
	}
	
	/**
	 * metodo que muda o tipo do cartao do usuario.
	 * @param cartao = CartaoFidelidade com o novo tipo.
	 */
	public void setCartao(CartaoFidelidade cartao){
		this.cartao = cartao;
	}

	/**
	 * Metodo responsavel por atualizar a reputacao do usuario a cada emprestimo ou item adicionado.
	 * @param valor = valor do tipo doule que representa o incremento para a reputacao.
	 */
	public void atualizaReputacao(double valor,boolean acresce) {
		if (acresce) {
			this.reputacao += valor; 
		} else {
			this.reputacao -= valor; 
		}
	}
	
	/**
	 * Metodo que retorna a reputacao do usuario.
	 * @return = double com o valor da reputacao desse usuario.
	 */
	public double getReputacao() {
		return reputacao;
	}
	
	/**
	 * Recupera o nome do usuario.
	 *
	 * @return O nome do usuario.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *      O nome do usuario.
	 *
	 *       Atualiza o nome do usuario.
	 *
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Recupera o email do usuario.
	 *
	 * @return O email do usuario.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            O email do usuario.
	 *
	 *            Atualiza o email do usuario.
	 *
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Recupera o telefone do usuario.
	 *
	 * @return O telefone do usuario.
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            O telefone do usuario.
	 *
	 *            Atualiza o telefone do usuario.
	 *
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Representacao em string do usuario.
	 *
	 * @return A representacao em string do usuario.
	 */
	@Override
	public String toString() {
		return this.nome + ", " + this.email + ", " + this.telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario ref = (Usuario) obj;

		if (!ref.getNome().equals(this.nome))
			return false;
		if (!ref.getTelefone().equals(this.telefone))
			return false;

		return true;
	}

	/**
	 * @param emprestimo
	 *            O emprestimo do usuario.
	 *
	 *            Adiciona um emprestimo para o usuario.
	 *
	 */
	public void registraEmprestimoRealizado(Emprestimo emprestimo) {
		this.emprestimosRealizados.add(emprestimo);
	}

}