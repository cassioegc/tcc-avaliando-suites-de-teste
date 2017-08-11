package lp2.projetofinal.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.controllers.Sistema;

public class SistemaTeste {

	private Sistema sistema;

	@Before
	public void criaSistema() {
		sistema = new Sistema();

	}

	@Test
	public void testCadastrarUsuario() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");
		assertEquals("gabriel@ccc.ufcg.edu.br", sistema.getInfoUsuario("Gabriel", "(83) 9999-0000", "Email"));

	}

	@Test
	public void testGetInfoUsuario() {
		sistema.cadastrarUsuario("Thiago", "(83) 9898-0000", "thiago@ccc.ufcg.edu.br");

		assertEquals("thiago@ccc.ufcg.edu.br", sistema.getInfoUsuario("Thiago", "(83) 9898-0000", "Email"));
		assertEquals("(83) 9898-0000", sistema.getInfoUsuario("Thiago", "(83) 9898-0000", "Telefone"));
		assertEquals("Thiago", sistema.getInfoUsuario("Thiago", "(83) 9898-0000", "Nome"));
	}

	@Test
	public void testAtualizarUsuario() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		assertEquals("gabriel@ccc.ufcg.edu.br", sistema.getInfoUsuario("Gabriel", "(83) 9999-0000", "Email"));

		sistema.atualizarUsuario("Gabriel", "(83) 9999-0000", "Email", "gabriel@gmail.com");

		assertEquals("gabriel@gmail.com", sistema.getInfoUsuario("Gabriel", "(83) 9999-0000", "Email"));

		sistema.atualizarUsuario("Gabriel", "(83) 9999-0000", "Nome", "Gabriel Almeida");

		assertEquals("Gabriel Almeida", sistema.getInfoUsuario("Gabriel Almeida", "(83) 9999-0000", "Nome"));

		sistema.atualizarUsuario("Gabriel Almeida", "(83) 9999-0000", "Telefone", "(83) 9 9999-0000");

		assertEquals("(83) 9 9999-0000", sistema.getInfoUsuario("Gabriel Almeida", "(83) 9 9999-0000", "Telefone"));
	}

	@Test
	public void testCadastrarEletronico() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarEletronico("Gabriel", "(83) 9999-0000", "GTA V", 150.00, "PS4");

		assertEquals("GTA V", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "GTA V", "Nome"));
		assertEquals("150.0", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "GTA V", "Preco"));
	}

	@Test
	public void testCadastrarJogoTabuleiro() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", "Xadrez", 70.00);

		assertEquals("Xadrez", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Xadrez", "Nome"));
		assertEquals("70.0", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Xadrez", "Preco"));
	}

	@Test
	public void testCadastrarBluRayFilme() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-0000", "Frozen", 45.99, 120, "ANIMACAO", "LIVRE", 2013);

		assertEquals("Frozen", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Frozen", "Nome"));
		assertEquals("45.99", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Frozen", "Preco"));
	}

	@Test
	public void testCadastrarBluRayShow() {

		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarBluRayShow("Gabriel", "(83) 9999-0000", "Natiruts Ao Vivo em Remigio", 50.00, 140, 11, "LIVRE",
				"Natiruts");

		assertEquals("Natiruts Ao Vivo em Remigio",
				sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Natiruts Ao Vivo em Remigio", "Nome"));
		assertEquals("50.0", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Natiruts Ao Vivo em Remigio", "Preco"));

	}

	@Test
	public void testCadastrarBluRaySerie() {

		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarBluRaySerie("Gabriel", "(83) 9999-0000", "Big Time Rush", 30.00, "BTR in Paris", 60,
				"DEZESSEIS_ANOS", "SUSPENSE", 1);

		assertEquals("Big Time Rush", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Big Time Rush", "Nome"));

		assertEquals("30.0", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Big Time Rush", "Preco"));

	}

	@Test
	public void testAtualizarItem() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", "Xadrez", 70.00);

		assertEquals("Xadrez", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Xadrez", "Nome"));

		sistema.atualizarItem("Gabriel", "(83) 9999-0000", "Xadrez", "Nome", "Xadrez Azul");

		assertEquals("Xadrez Azul", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Xadrez Azul", "Nome"));

		sistema.atualizarItem("Gabriel", "(83) 9999-0000", "Xadrez Azul", "Preco", "80.00");

		assertEquals("80.0", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Xadrez Azul", "Preco"));

	}

	@Test
	public void testGetInfoItem() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", "Xadrez", 70.00);

		assertEquals("Xadrez", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Xadrez", "Nome"));

		assertEquals("70.0", sistema.getInfoItem("Gabriel", "(83) 9999-0000", "Xadrez", "Preco"));

	}

	@Test
	public void testPesquisarDetalhesItem() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", "Xadrez", 70.00);

		assertEquals("JOGO DE TABULEIRO: Xadrez, R$ 70.0, Nao emprestado, COMPLETO",
				sistema.pesquisarDetalhesItem("Gabriel", "(83) 9999-0000", "Xadrez"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNomeVazio() {
		sistema.cadastrarUsuario("", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTelefoneVazio() {
		sistema.cadastrarUsuario("Gabriel", "", "gabriel@ccc.ufcg.edu.br");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmailVazio() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmailNulo() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", " ");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAtributoVazio() {
		sistema.getInfoUsuario("Gabriel", "(83) 9999-0000", "");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAtributoNulo() {
		sistema.getInfoUsuario("Gabriel", "(83) 9999-0000", " ");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAtributoInvalido() {
		sistema.atualizarUsuario("Gabriel", "(83) 9999-0000", "", "mgs.gmail.com");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValorVazio() {
		sistema.atualizarUsuario("Gabriel", "(83) 9999-0000", "Email", "");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaNomeItemVazio() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", "", 70.00);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaNomeItemNulo() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", " ", 70.00);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaValorItemZero() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", "Xadrez ", 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaValorItemMenorQueZero() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-0000", "Xadrez ", -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaPlataformaNula() {
		sistema.cadastrarEletronico("Gabriel", "(83) 9999-0000", "GTA V", 150.00, " ");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaPlataformaVazia() {
		sistema.cadastrarEletronico("Gabriel", "(83) 9999-0000", "GTA V", 150.00, "");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDuracaoZero() {
		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-0000", "Frozen", 45.99, 0, "ANIMACAO", "LIVRE", 2013);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDuracaoNegativa() {
		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-0000", "Frozen", 45.99, -1, "ANIMACAO", "LIVRE", 2013);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGeneroVazio() {
		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-0000", "Frozen", 45.99, 120, " ", "LIVRE", 2013);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testClassificacaoVazia() {
		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-0000", "Frozen", 45.99, 120, "ANIMACAO", "", 2013);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAnoLancamentoZero() {
		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-0000", "Frozen", 45.99, 120, "ANIMACAO", "LIVRE", 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAnoLancamentoZeroNulo() {
		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-0000", "Frozen", 45.99, 120, "ANIMACAO", "LIVRE", -2013);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNumeroFaixasZero() {
		sistema.cadastrarBluRayShow("Gabriel", "(83) 9999-0000", "Natiruts Ao Vivo em Remigio", 50.00, 140, 0, "LIVRE",
				"Natiruts");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNumeroFaixasNegativo() {
		sistema.cadastrarBluRayShow("Gabriel", "(83) 9999-0000", "Natiruts Ao Vivo em Remigio", 50.00, 140, -11,
				"LIVRE", "Natiruts");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDescricaoVazia() {
		sistema.cadastrarBluRaySerie("Gabriel", "(83) 9999-0000", "Big Time Rush", 30.00, "", 60, "DEZESSEIS_ANOS",
				"SUSPENSE", 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDescricaoNula() {
		sistema.cadastrarBluRaySerie("Gabriel", "(83) 9999-0000", "Big Time Rush", 30.00, "  ", 60, "DEZESSEIS_ANOS",
				"SUSPENSE", 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTemporadaZero() {
		sistema.cadastrarBluRaySerie("Gabriel", "(83) 9999-0000", "Big Time Rush", 30.00, " btr in paris ", 60,
				"DEZESSEIS_ANOS", "SUSPENSE", 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTemporadaNegativa() {
		sistema.cadastrarBluRaySerie("Gabriel", "(83) 9999-0000", "Big Time Rush", 30.00, " btr in paris ", 60,
				"DEZESSEIS_ANOS", "SUSPENSE", -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaPecaVazia() {
		sistema.adicionarPecaPerdida("Gabriel", "(83) 9999-0000", "Jogo da Vida", "");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVerificaPecaNula() {
		sistema.adicionarPecaPerdida("Gabriel", "(83) 9999-0000", "Jogo da Vida", "  ");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDataEmprestimoVazia() {
		sistema.registrarEmprestimo("Gabriel", "(83) 9999-0000", "Thiago", "(83) 8899-0000", "Natiruts em Remigio", "",
				1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDataEmprestimoNula() {
		sistema.registrarEmprestimo("Gabriel", "(83) 9999-0000", "Thiago", "(83) 8899-0000", "Natiruts em Remigio",
				"  ", 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPeriodoZero() {
		sistema.registrarEmprestimo("Gabriel", "(83) 9999-0000", "Thiago", "(83) 8899-0000", "Natiruts em Remigio",
				"10/08/2017", 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPeriodoNegativo() {
		sistema.registrarEmprestimo("Gabriel", "(83) 9999-0000", "Thiago", "(83) 8899-0000", "Natiruts em Remigio",
				"10/08/2017", -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDataDevolucaoVazia() {
		sistema.devolverItem("Gabriel", "(83) 9999-0000", "Thiago", "(83) 8899-0000", "Natiruts em Remigio",
				"10/08/2017", "");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDataDevolucaoNula() {
		sistema.devolverItem("Gabriel", "(83) 9999-0000", "Thiago", "(83) 8899-0000", "Natiruts em Remigio",
				"10/08/2017", "  ");
	}
}
