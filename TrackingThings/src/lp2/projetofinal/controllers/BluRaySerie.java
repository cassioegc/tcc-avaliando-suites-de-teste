package lp2.projetofinal.controllers;


import java.util.HashSet;
import java.util.Set;

import lp2.projetofinal.entidades.BluRay;
import lp2.projetofinal.entidades.EpisodioSerie;
import lp2.projetofinal.enums.GeneroBluRay;


public class BluRaySerie extends BluRay {
	private GeneroBluRay generoBluRay;
	private int numeroTemporada;
	private Set<EpisodioSerie> episodios;
	
	
	public BluRaySerie(String nomeItem, double preco,String descricao,int duracao,String classificacao,String genero, int temporada) {
		super(nomeItem,preco, duracao, classificacao);
		
		this.numeroTemporada = temporada;
		this.generoBluRay = GeneroBluRay.OUTRO; // mudar
		this.episodios = new HashSet<>();
	}
	
	public void adicionarBluRay(String BlurayTemporada, int duracao){ // fazer no controller dessa classe
		
		EpisodioSerie episodioSerie = new EpisodioSerie(duracao);
		
		episodios.add(episodioSerie);
	}
	
	public int duracaoTotal() {
		int duracaoTotal = 0;
		
		for (EpisodioSerie episodioSerie: episodios) {
			duracaoTotal += episodioSerie.getDuracao();
		}
		
		return duracaoTotal;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = super.hashCode();
		result = prime * result + numeroTemporada;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (!super.equals(obj))
			return false;
		BluRaySerie ref = (BluRaySerie) obj;
		if (ref.numeroTemporada != this.numeroTemporada) {
			return false;
		}
		return true;
	}

	
	

}
