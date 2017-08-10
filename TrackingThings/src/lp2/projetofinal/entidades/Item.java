package lp2.projetofinal.entidades;

/**
 * Classe abstrata responsavel por conter metodos e atributos de um objeto do tipo Item.
 * Classe pai de BluRay, JogoEletronico e JogoTabuleiro.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import lp2.projetofinal.enums.EstadoItem;

public abstract class Item {

	private String nome;

	private double preco;

	private EstadoItem estado;

	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.estado = EstadoItem.NAO_EMPRESTADO;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return this.estado.getEstado();
	}

	public void itemEmprestado() {
		this.estado = EstadoItem.EMPRESTADO;
	}

	public void itemDevolvido() {
		this.estado = EstadoItem.NAO_EMPRESTADO;
	}
	
	@Override
	public String toString() {

		return this.nome + ", R$ " + this.preco + ", " + this.estado.getEstado() + ", ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Item ref = (Item) obj;

		if (!ref.getNome().equals(this.nome))
			return false;

		return true;
	}

	public void atualizar(String atributo, String valor) {

		switch (atributo) {
			case "Nome":
				this.nome = valor;
				break;
			case "Preco":
				this.preco = Double.parseDouble(valor);
				break;
			}
	}

	public String getInfo(String atributo){
			
		switch (atributo) {
			case "Nome":
				return this.nome;
			case "Preco":
				return "" + this.preco;	
			default:
				return "";
			}
	}

}
