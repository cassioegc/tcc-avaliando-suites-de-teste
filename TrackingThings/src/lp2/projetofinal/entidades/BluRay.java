package lp2.projetofinal.entidades;

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
	public abstract String toString();
	// "Todos os itens devem poder ser apresentados através de uma string"(mas n tem exemplos)
	

	
	
	// " Dois blu rays são iguais se tiverem o mesmo nome" o equals de item substitui a necessidade ou n?
}
