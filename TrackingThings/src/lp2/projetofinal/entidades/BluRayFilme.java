package lp2.projetofinal.entidades;

public class BluRayFilme extends BluRay {
	private int anoLancamento;
	
	public BluRayFilme(String nome, double preco,int duracao,String classificacao,int novoAnoLancamento) {
		super(nome,preco,duracao,classificacao);
		
		this.anoLancamento = novoAnoLancamento;
	}
}
