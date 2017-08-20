package lp2.projetofinal.orders;

import java.util.Comparator;

import lp2.projetofinal.entidades.Usuario;

public class OrdenaUsuarioReputacaoCrescente implements Comparator<Usuario> {

	@Override
	public int compare(Usuario usuarioUm, Usuario usuarioDois) {

		double result = usuarioUm.getReputacao() - usuarioDois.getReputacao();
		
		if(result < 0)
			return -1;
		else if(result > 0)
			return 1;
		else
			return 0;
	}

}
