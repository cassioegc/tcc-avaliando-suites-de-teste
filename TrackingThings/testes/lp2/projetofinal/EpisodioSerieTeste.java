package lp2.projetofinal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.entidades.EpisodioSerie;

public class EpisodioSerieTeste {

	private EpisodioSerie episodio1;
	private EpisodioSerie episodio2;
	
	@Before
	public void criaEpisodioSerie(){
		episodio1 = new EpisodioSerie(45);
		episodio2 = new EpisodioSerie(43);
	}
	@Test
	public void testConstrutorEpisodioSerie() {
		assertEquals(45, episodio1.getDuracao());
		assertEquals(43, episodio2.getDuracao());
	}

}
