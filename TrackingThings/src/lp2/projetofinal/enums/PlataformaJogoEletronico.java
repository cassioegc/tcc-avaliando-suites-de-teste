package lp2.projetofinal.enums;

public enum PlataformaJogoEletronico {

	PC("PC"), MAC("MAC"), PS3("PS3"), PS4("PS4"), XBOX360("XBOX360"), XBOX_ONE("XBOX ONE"), NINTENDO_3DS(
			"NINTENDO 3DS"), OUTRO("OUTRO");

	private String plataforma;

	public String getPlataforma() {
		return this.plataforma;
	}

	private PlataformaJogoEletronico(String plataforma) {
		this.plataforma = plataforma;
	}

	public static PlataformaJogoEletronico indentificaPlataforma(String plataforma2) {
		return null;
	}

}
