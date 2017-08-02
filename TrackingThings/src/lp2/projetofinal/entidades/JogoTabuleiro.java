package lp2.projetofinal.entidades;

import java.util.HashSet;
import java.util.Set;

public class JogoTabuleiro extends Item {

	private Set<String> pecasPerdidas; //DECLARO COMO SET MESMO? Notar que o getPecasPerdidas retorna um Set e nao um HashSet.
	
	public JogoTabuleiro(String nome, double preco) {
		super(nome, preco);
		
		this.pecasPerdidas = new HashSet<>(); // Mudar para list?
	}
	
	public void adicionarPecaPerdida(String peca){
		this.pecasPerdidas.add(peca);
	}
	
	public Set getPecasPerdidas(){
		return this.pecasPerdidas;
	}
	
	//Esse equals ta correto? EH PARA Gerar um equals com NOME e COLECAO DE pecasPerdidas.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + ((pecasPerdidas == null) ? 0 : pecasPerdidas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JogoTabuleiro ref = (JogoTabuleiro) obj;

		if (!ref.getNome().equals(this.getNome()))
			return false;
		if (!ref.getPecasPerdidas().equals(this.pecasPerdidas))
			return false;

		return true;
	}

}
