package lp2.projetofinal.controllers;

import java.util.ArrayList;
import java.util.List;

import lp2.projetofinal.entidades.Emprestimo;
import lp2.projetofinal.entidades.Item;
import lp2.projetofinal.entidades.Usuario;
import lp2.projetofinal.enums.EstadoItem;
import lp2.projetofinal.util.Exceptions;

public class ControllerEmprestimos {

	private List<Emprestimo> emprestimos;

	public ControllerEmprestimos() {
		this.emprestimos = new ArrayList<Emprestimo>();
	}

	public void registrarEmprestimo(Usuario donoItem, Usuario requerenteItem, Item item, String dataEmprestimo,
			int periodo) {
		
		if(item.getEstado().equals(EstadoItem.EMPRESTADO.getEstado()))
			Exceptions.itemEmprestadoNoMomento();
		
		Emprestimo emprestimo = new Emprestimo(donoItem, requerenteItem, item, dataEmprestimo, periodo);
		
		this.emprestimos.add(emprestimo);
		item.itemEmprestado();
	}

	public void devolverItem(Usuario donoItem, Usuario requerenteItem, Item item, String dataEmprestimo,
			String dataDevolucao) {
		
		Emprestimo emprestimo = identificaEmprestimo(donoItem, requerenteItem, dataEmprestimo);
		
		emprestimo.setDataDevolucao(dataDevolucao);
		item.itemDevolvido();

	}

	public Emprestimo identificaEmprestimo(Usuario donoItem, Usuario requerenteItem, String dataEmprestimo) {
		
		Emprestimo emprestimo = new Emprestimo(donoItem, requerenteItem, dataEmprestimo);
		
		if(!this.emprestimos.contains(emprestimo))
			Exceptions.emprestimoNaoEncontrado();
		
		return this.emprestimos.get(this.emprestimos.indexOf(emprestimo));
	}

}
