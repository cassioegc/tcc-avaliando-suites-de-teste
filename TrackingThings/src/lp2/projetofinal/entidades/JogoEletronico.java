package lp2.projetofinal.entidades;

import lp2.projetofinal.enums.PlataformaJogoEletronico;

public class JogoEletronico extends Item{

	private PlataformaJogoEletronico plataforma;
	
	public JogoEletronico(String nome, double preco, String plataforma) {
		super(nome, preco);
		
		this.plataforma = PlataformaJogoEletronico.indentificaPlataforma(plataforma);
	}

	public String getPlataforma(){
		return plataforma.getPlataforma();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = super.hashCode();
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(!super.equals(obj))
			return false;

		JogoEletronico ref = (JogoEletronico) obj;
		if (!ref.getPlataforma().equals(this.plataforma.getPlataforma()))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "JOGO ELETRONICO: " + super.toString() + this.getPlataforma() + "|";
	}
	
	
	
}
