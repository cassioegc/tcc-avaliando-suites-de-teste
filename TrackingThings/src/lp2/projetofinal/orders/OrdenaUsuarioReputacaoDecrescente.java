package lp2.projetofinal.orders;

import java.util.Comparator;

import lp2.projetofinal.entidades.Usuario;

public class OrdenaUsuarioReputacaoDecrescente implements Comparator<Usuario> {

	@Override
	public int compare(Usuario usuarioUm, Usuario usuarioDois) {

		double result = usuarioDois.getReputacao() - usuarioUm.getReputacao();
		
		if(result < 0)
			return -1;
		else if(result > 0)
			return 1;
		else
			return 0;
	}

}
