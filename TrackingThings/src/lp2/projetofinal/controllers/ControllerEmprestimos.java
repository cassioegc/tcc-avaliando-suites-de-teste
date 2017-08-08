package lp2.projetofinal.controllers;

import java.util.HashSet;
import java.util.Set;

import lp2.projetofinal.entidades.Emprestimo;
import lp2.projetofinal.entidades.Usuario;

public class ControllerEmprestimos {

	private Set<Emprestimo> emprestimos;

	public ControllerEmprestimos() {
		this.emprestimos = new HashSet<>();
	}

	public void registrarEmprestimo(Usuario donoItem, Usuario requerenteItem, String item, String dataEmprestimo,
			int periodo) {
		
		//Implementar Emprestimo emprestimo = new Emprestimo(donoItem, requerenteItem, item, dataEmprestimo);

	}

	public void devolverItem(String nomeDono, String telefoneDono, String nomeRequerente, String telefoneRequerente,
			String nomeItem, String dataEmprestimo, String datadevolucao) {

		// IMPLEMENTAR
	}

}
