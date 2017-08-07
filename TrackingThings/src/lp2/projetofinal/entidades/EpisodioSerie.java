package lp2.projetofinal.entidades;

/**
 * Classe responsavel por representar um objeto EpisodioSerie, que compoe a classe BluRaySerie.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

public class EpisodioSerie {

	private int duracao;

	public EpisodioSerie(int duracao) {
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

}
