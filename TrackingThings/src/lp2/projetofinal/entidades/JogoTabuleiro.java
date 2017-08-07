package lp2.projetofinal.entidades;

import java.util.ArrayList;
import java.util.List;

public class JogoTabuleiro extends Item {

	private List<String> pecasPerdidas;

	public JogoTabuleiro(String nome, double preco) {
		super(nome, preco);

		this.pecasPerdidas = new ArrayList<>();
	}

	public void adicionarPecaPerdida(String peca) {
		this.pecasPerdidas.add(peca);
	}

	public String contemPecasPerdidas() {
		if (pecasPerdidas.isEmpty())
			return "COMPLETO";
		else
			return "COM PECAS PERDIDAS";
	}

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
		if (!ref.pecasPerdidas.equals(this.pecasPerdidas))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "JOGO DE TABULEIRO: " + super.toString() + this.contemPecasPerdidas() + "|";
	}

}
