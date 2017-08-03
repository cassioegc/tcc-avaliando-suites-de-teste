package lp2.projetofinal.entidades;

import lp2.projetofinal.enums.GeneroBluRay;

import lp2.projetofinal.enums.GeneroBluRay;;


public class BluRayFilme extends BluRay {
	private int anoLancamento;
	
	private GeneroBluRay genero;
	
	public BluRayFilme(String nome, double preco,int duracao, GeneroBluRay genero, String classificacao,int novoAnoLancamento) {
		super(nome,preco,duracao,classificacao);
		
		this.anoLancamento = novoAnoLancamento;
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public GeneroBluRay getGenero() {
		return genero;
	}

	
	
}
