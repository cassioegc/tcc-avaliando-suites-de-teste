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
	
	
	
	@Override
	public String toString() {

		return "EMPRESTIMO - De: " + this.donoDoItem.getNome() + ", Para: " + this.usuarioRequerente.getNome() + ", "
				+ this.item.getNome() + ", " + this.dataEmprestimo + ", " + this.numeroDias + " dias, ENTREGA: "
				+ this.dataDevolucao;
	}
	
	
}
