package lp2.projetofinal.entidades;

import lp2.projetofinal.enums.ClassificacaoBluRay;

public abstract class BluRay extends Item {
	private int duracao;
	private ClassificacaoBluRay classificacao;

	public BluRay(String nome, double preco, int duracao, String classificacao) {
		super(nome, preco);
		this.duracao = duracao;
		this.classificacao = ClassificacaoBluRay.LIVRE;
	}

	public int getDuracao() {
		return duracao;
	}

	public String getClassificacao() {
		return classificacao.getClassificacao();
	}	
}
