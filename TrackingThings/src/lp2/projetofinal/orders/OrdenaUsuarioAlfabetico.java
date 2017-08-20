package lp2.projetofinal.orders;

import java.util.Comparator;

import lp2.projetofinal.entidades.Usuario;

public class OrdenaUsuarioAlfabetico implements Comparator<Usuario> {

	@Override
	public int compare(Usuario usuarioUm, Usuario usuarioDois) {
		return usuarioUm.getNome().compareTo(usuarioDois.getNome());
	}

}
