package lp2.projetofinal.entidades;

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
		return "SHOW: " + super.toString() + this.getNomeArtista() + ", " + this.getNumFaixas() + " faixas|";
	}

}
