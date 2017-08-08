package lp2.projetofinal.entidades;

/**
 * Classe abstrata responsavel por servir de molde para Itens do tipo BluRay.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import lp2.projetofinal.enums.ClassificacaoBluRay;

public abstract class BluRay extends Item {
	private int duracao;
	private ClassificacaoBluRay classificacao;

	public BluRay(String nome, double preco, int duracao, String classificacao) {
		super(nome, preco);
		this.duracao = duracao;
		this.classificacao = ClassificacaoBluRay.indentificaClassificacao(classificacao);
	}

	public int getDuracao() {
		return duracao;
	}

	public String getClassificacao() {
		return classificacao.getClassificacao();
	}

	@Override
	public String toString(){
		return super.toString() + this.duracao + " min, " + this.getClassificacao() + ", ";
	}
	
	@Override
	public void atualizar(String atributo, String valor) {
		super.atualizar(atributo, valor);
		
		switch (atributo) {
		case "Duracao":
			this.duracao = Integer.parseInt(valor);
			break;
		case "Classificacao":
			this.classificacao = ClassificacaoBluRay.indentificaClassificacao(valor);
			break;
		}
	}
	
	
	@Override
	public String getInfo(String atributo) {
		
		if(!super.getInfo(atributo).isEmpty())
			return super.getInfo(atributo);
		else{
			switch (atributo) {
			case "Duracao":
				return String.format("%d", this.duracao);
			case "Classificacao":
				return this.getClassificacao();	
			default:
				return "";
			}
		}
			
	}
	
}
