package lp2.projetofinal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.entidades.JogoTabuleiro;

public class JogoTabuleiroTeste {
	
	private JogoTabuleiro jogo1;
	private JogoTabuleiro jogo2;
	private JogoTabuleiro jogo3;

	@Before
	public void criaJogo(){
		jogo1 = new JogoTabuleiro("Xadrez", 89.90);
		jogo2 = new JogoTabuleiro("Dama", 50.00);
		jogo3 = new JogoTabuleiro("Xadrez", 15.49);
	}
	
	@Test
	public void testConstrutorJogoTabuleiro() {
		assertEquals("Xadrez", jogo1.getNome());
		assertEquals(89.90, jogo1.getPreco(), 0.01);
		assertEquals("Nao emprestado", jogo1.getEstado());
		assertEquals("COMPLETO", jogo1.contemPecasPerdidas());
	}
	
	@Test
	public void testAdicionarPecaPerdidaEcontemPecasPerdidas() {
		assertEquals("COMPLETO", jogo1.contemPecasPerdidas());
		jogo1.adicionarPecaPerdida("Bispo");
		assertEquals("COM PECAS PERDIDAS", jogo1.contemPecasPerdidas());
	}

	@Test
	public void testEqualsObject() {
		jogo1.adicionarPecaPerdida("Torre");
		jogo3.adicionarPecaPerdida("Torre");
		
		assertEquals(true, jogo1.equals(jogo3));
		assertEquals(false, jogo1.equals(jogo2));
		jogo3.adicionarPecaPerdida("Peao");
		assertEquals(false, jogo1.equals(jogo3));
	}

	@Test
	public void testToString() {
		jogo1.adicionarPecaPerdida("Peao");
		assertEquals("JOGO DE TABULEIRO: Xadrez, R$ 89.9, Nao emprestado, COM PECAS PERDIDAS|", jogo1.toString());
		assertEquals("JOGO DE TABULEIRO: Dama, R$ 50.0, Nao emprestado, COMPLETO|", jogo2.toString());
	}	

}
