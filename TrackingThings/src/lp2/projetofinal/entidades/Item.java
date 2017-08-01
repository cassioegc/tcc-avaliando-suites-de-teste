package lp2.projetofinal.entidades;

public class Item {

	private String nome;
	
	private double preco;
	
	private String estado;
	
	public Item(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		this.estado = "Nao emprestado";
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEstado(){
		return estado;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	
}
