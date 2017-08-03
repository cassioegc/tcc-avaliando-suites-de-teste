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
		if (!ref.getPlataforma().equals(this.plataforma))
			return false;

		return true;
	}
	
}
