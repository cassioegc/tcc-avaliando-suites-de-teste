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
	
	//Esse equals ta certo? Eh para gerar com NOME e PLATAFORMA.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getNome() == null) ? 0 : this.getNome().hashCode());
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
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
		JogoEletronico ref = (JogoEletronico) obj;

		if (!ref.getNome().equals(this.getNome()))
			return false;
		if (!ref.getPlataforma().equals(this.plataforma))
			return false;

		return true;
	}
	
}
