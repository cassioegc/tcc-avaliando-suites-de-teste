package lp2.projetofinal.entidades;

public class ChaveNomeTelefone {

	private String nome;
	private String telefone;

	public ChaveNomeTelefone(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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

		ChaveNomeTelefone ref = (ChaveNomeTelefone) obj;

		if (ref.getNome().equals(this.nome))
			return false;
		if (ref.getTelefone().equals(this.telefone))
			return false;

		return true;
	}

}
