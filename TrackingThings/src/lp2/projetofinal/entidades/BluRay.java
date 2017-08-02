package lp2.projetofinal.entidades;

import lp2.projetofinal.enums.ClassificacaoBluRay;

public class BluRay extends Item { // decidir se pode ser abstrata;
	private int duracao;
	private ClassificacaoBluRay classificacao;

	public BluRay(String nome, double preco, int duracao, String classificacao) {
		super(nome, preco);
		this.duracao = duracao;
		this.classificacao = ClassificacaoBluRay.LIVRE;
	}

	// colecaoDeBluRays
	// duracaoDaTemporada
	// classificacaoEnum

}
