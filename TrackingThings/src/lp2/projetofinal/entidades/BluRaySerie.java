package lp2.projetofinal.entidades;

/**
 * Classe responsavel por conter metodos e atributos de um objeto do tipo BluRaySerie (tipo especifico de BluRay).
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import java.util.HashSet;
import java.util.Set;

import lp2.projetofinal.enums.GeneroBluRay;


public class BluRaySerie extends BluRay {
	private GeneroBluRay genero;
	private int numeroTemporada;
	private Set<EpisodioSerie> episodios;
	private String descricao;
	
	
	public BluRaySerie(String nomeItem, double preco,String descricao,int duracao,String classificacao,String genero, int temporada) {
		super(nomeItem,preco, duracao, classificacao);
		
		this.numeroTemporada = temporada;
		this.genero = GeneroBluRay.indentificaGenero(genero); 
		this.episodios = new HashSet<>();
		this.descricao = descricao;
	}
	
	public void adicionarBluRay(int duracao) { 
		
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
	
	public String getGenero() {
		return genero.getGenero();
	}

	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public String getDescricao() {
		return descricao;
	}

	
	
	@Override
	public String toString() {
		return "SERIE: " + super.toString() + this.getGenero() + ", Temporada " + this.numeroTemporada;
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
