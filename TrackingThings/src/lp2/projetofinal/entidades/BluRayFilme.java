package lp2.projetofinal.entidades;

/**
 * Classe responsavel por conter metodos e atributos de um objeto do tipo BluRayFilme (tipo especifico de BluRay).
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import lp2.projetofinal.enums.GeneroBluRay;;

public class BluRayFilme extends BluRay {

	private int anoLancamento;
	private GeneroBluRay genero;

	public BluRayFilme(String nome, double preco, int duracao, String genero, String classificacao, int novoAnoLancamento) {
		super(nome, preco, duracao, classificacao);

		this.anoLancamento = novoAnoLancamento;
		this.genero = GeneroBluRay.indentificaGenero(genero);
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public String getGenero() {
		return genero.getGenero();
	}

	@Override
	public String toString() {
		return "FILME: " + super.toString() + this.getGenero() + ", " + this.getAnoLancamento();
	}
	
	
}
