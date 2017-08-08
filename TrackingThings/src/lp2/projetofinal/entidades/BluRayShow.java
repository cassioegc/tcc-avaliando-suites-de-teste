package lp2.projetofinal.entidades;

/**
 * Classe responsavel por conter metodos e atributos de um objeto do tipo BluRayShow (tipo especifico de BluRay).
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

public class BluRayShow extends BluRay {

	private String nomeArtista;
	private int numFaixas;

	public BluRayShow(String nome, double preco, int duracao, String classificacao, String nomeArtista, int numFaixas) {
		super(nome, preco, duracao, classificacao);

		this.nomeArtista = nomeArtista;
		this.numFaixas = numFaixas;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	@Override
	public String toString() {
		return "SHOW: " + super.toString() + this.getNomeArtista() + ", " + this.getNumFaixas() + " faixas";
	}

}
