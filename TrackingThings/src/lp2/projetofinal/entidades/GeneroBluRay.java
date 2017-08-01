/**
* Representacao do genero para um BluRay
* 
* @author ................
*/

package lp2.projetofinal.entidades;

public enum GeneroBluRay {
	 ACAO("ACAO"), ANIMACAO("ANIMACAO"), AVENTURA("AVENTURA"), COMEDIA("COMEDIA"), DOCUMENTARIO("DOCUMENTARIO"), DRAMA("DRAMA"),
	 EROTICO("EROTICO"), FAROESTE("FAROESTE"), FICCAO("FICCAO"), MUSICAL("MUSICAL"), POLICIAL("POLICIAL"), ROMANCE("ROMANCE"), 
	 SUSPENSE("ACAO"), TERROR("ACAO"), OUTRO("ACAO");
	
	
	private String genero;

	/**
	 *
	 * @param novoGenero
	 *            O genero do BluRay.
	 * 
	 */
	private GeneroBluRay(String novoGenero) {
		this.genero = novoGenero;
	}

	/**
	 * Recupera o genero do BluRay.
	 *
	 * @return O genero do BluRay.
	 */
	public String getGenero() {
		return this.genero;
	}

}
