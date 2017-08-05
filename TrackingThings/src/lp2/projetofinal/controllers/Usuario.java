package lp2.projetofinal.controllers;

import java.util.ArrayList;
import java.util.List;

import lp2.projetofinal.entidades.Item;

public class Usuario {

	private String nome;

	private String email;

	private String telefone;
	
	private List<Item> itens;

	public Usuario(String nome, String email, String telefone) {

		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		itens = new ArrayList<Item>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	/////////////////// fazer
	public void adicionarBluRay(String BlurayTemporada, int duracao){
		
		
		for (Item item : itens) {
			if (item.getNome().equals(BlurayTemporada)) {
			
			}
		}
	}
	

	
	
	@Override
	public String toString() {
		return this.nome + ", " + this.email + ", " + this.telefone;
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
		Usuario ref = (Usuario) obj;

		if (!ref.getNome().equals(this.nome))
			return false;
		if (!ref.getTelefone().equals(this.telefone))
			return false;

		return true;
	}

}
