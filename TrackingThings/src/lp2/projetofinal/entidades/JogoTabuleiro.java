package lp2.projetofinal.entidades;

import java.util.HashSet;
import java.util.Set;

public class JogoTabuleiro extends Item {

	private Set<String> pecasPerdidas;
	
	public JogoTabuleiro(String nome, double preco) {
		super(nome, preco);
		
		this.pecasPerdidas = new HashSet<>(); // Mudar para list?
	}
	
	public void adicionarPecaPerdida(String peca){
		this.pecasPerdidas.add(peca);
	}
	
	//Gerar um equals com NOME e COLECAO DE pecasPerdidas.

}
