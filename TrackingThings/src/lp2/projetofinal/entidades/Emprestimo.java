package lp2.projetofinal.entidades;

public class Emprestimo {

	private Usuario donoDoItem;

	private Usuario usuarioRequerente;

	private Item item;

	private String dataEmprestimo;

	private int numeroDias;

	private String dataDevolucao;

	public Emprestimo(Usuario donoDoItem, Usuario usuarioRequerente, Item item, String dataEmprestimo, int numeroDias) {

		this.donoDoItem = donoDoItem;
		this.usuarioRequerente = usuarioRequerente;
		this.item = item;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = "Emprestimo em andamento";
		this.numeroDias = numeroDias;

	}

	public Emprestimo(Usuario donoDoItem, Usuario usuarioRequerente, String dataEmprestimo) {
		this.donoDoItem = donoDoItem;
		this.usuarioRequerente = usuarioRequerente;
		this.dataEmprestimo = dataEmprestimo;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Override
	public String toString() {

		return "EMPRESTIMO - De: " + this.donoDoItem.getNome() + ", Para: " + this.usuarioRequerente.getNome() + ", "
				+ this.item.getNome() + ", " + this.dataEmprestimo + ", " + this.numeroDias + " dias, ENTREGA: "
				+ this.dataDevolucao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmprestimo == null) ? 0 : dataEmprestimo.hashCode());
		result = prime * result + ((donoDoItem == null) ? 0 : donoDoItem.hashCode());
		result = prime * result + ((usuarioRequerente == null) ? 0 : usuarioRequerente.hashCode());
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

		Emprestimo ref = (Emprestimo) obj;

		if (!this.donoDoItem.equals(ref.donoDoItem))
			return false;
		if (!this.usuarioRequerente.equals(ref.usuarioRequerente))
			return false;
		if (!this.dataEmprestimo.equals(ref.dataEmprestimo))
			return false;

		return true;
	}

}
