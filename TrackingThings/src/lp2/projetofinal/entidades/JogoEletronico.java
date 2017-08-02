package lp2.projetofinal.entidades;

public class JogoEletronico extends Item{

	private String plataforma;
	
	public JogoEletronico(String nome, double preco, String plataforma) {
		super(nome, preco);
		
		this.plataforma = plataforma;
	}

	public String getPlataforma(){
		return plataforma;
	}
	
	//GERAR EQUALS COM NOME E PLATAFORMA. mas como pegar o nome?
	
	
}
