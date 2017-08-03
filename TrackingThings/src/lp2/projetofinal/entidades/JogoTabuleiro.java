package lp2.projetofinal.entidades;

import java.util.HashSet;
import java.util.Set;

public class JogoTabuleiro extends Item {

	private Set<String> pecasPerdidas; // DECLARO COMO SET MESMO? Notar que o
										// getPecasPerdidas retorna um Set e nao
										// um HashSet.

	public JogoTabuleiro(String nome, double preco) {
		super(nome, preco);

		this.pecasPerdidas = new HashSet<>(); // Mudar para list?
	}

	public void adicionarPecaPerdida(String peca) {
		this.pecasPerdidas.add(peca);
	}

	public Set<String> getPecasPerdidas() {
		return this.pecasPerdidas;
	}

	// Esse equals ta correto? EH PARA Gerar um equals com NOME e COLECAO DE
	// pecasPerdidas.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = super.hashCode();
		result = prime * result + ((pecasPerdidas == null) ? 0 : pecasPerdidas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (!super.equals(obj))
			return false;

		JogoTabuleiro ref = (JogoTabuleiro) obj;
		if (!ref.getPecasPerdidas().equals(this.pecasPerdidas))
			return false;

		return true;
	}

}
