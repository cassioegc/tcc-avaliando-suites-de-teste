package lp2.projetofinal.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.entidades.FakeBluRay;

public class FakeBluRayTeste {

	private FakeBluRay fakeBluRay;
	private FakeBluRay fakeBluRay2;
	
	@Before
	public void criaFakeBluRay() {
		fakeBluRay = new FakeBluRay("Big time Rush", 39.99, 60, "LIVRE");
		fakeBluRay2 = new FakeBluRay("TEKKEN", 29.00, 122, "DEZESSEIS_ANOS");
	}
	
	@Test
	public void testConstrutorFakeBluRay() {
		assertEquals("Big Time Rush", fakeBluRay.getNome());
		assertEquals(39.99, fakeBluRay.getPreco(), 0.01);
		assertEquals(60, fakeBluRay.getDuracao());
		assertEquals("LIVRE", fakeBluRay.getClassificacao());
	}

	@Test
	public void testToString() {
		assertEquals("Big time Rush, R$ 39.99, Nao emprestado, 60 min, LIVRE, ", fakeBluRay.toString());
		assertEquals("TEKKEN, R$ 29.0, Nao emprestado, 122 min, DEZESSEIS_ANOS, ", fakeBluRay2.toString());
	}

	@Test
	public void testAtualizar() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDuracao() {
		assertEquals(60, fakeBluRay.getDuracao());
	}

	@Test
	public void testGetClassificacao() {
		assertEquals("LIVRE", fakeBluRay.getClassificacao());
	}

}
