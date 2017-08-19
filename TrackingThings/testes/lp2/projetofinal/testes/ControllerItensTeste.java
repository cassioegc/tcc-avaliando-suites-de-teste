package lp2.projetofinal.testes;

/**
 * Classe responsavel por conter testes para metodos de um objeto do tipo ControllerItens,
 * (controller que possui uma colecao de itens adicionados pelos usuarios do Traking Things).
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.controllers.ControllerItens;
import lp2.projetofinal.entidades.JogoEletronico;
import lp2.projetofinal.entidades.JogoTabuleiro;
import lp2.projetofinal.entidades.Usuario;

public class ControllerItensTeste {
/**
	private ControllerItens controllerItens;
	private Usuario usuario1;
	
	@Before
	public void criaControllerItensEUsuarios(){
		controllerItens = new ControllerItens();
		usuario1 = new Usuario("Gabriel", "Gabriel@ccc.ufcg.edu.br", "(83) 9999-9898");
	}
	
	@Test
	public void testConstrutorControllerItens() {
		assertEquals("", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testAdicionaItemUsuarioStringDoubleString() {
		controllerItens.adicionaItem(usuario1, "PES 2017", 145.00, "PS4");
		assertEquals("JOGO ELETRONICO: PES 2017, R$ 145.0, Nao emprestado, PS4|", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testAdicionaItemUsuarioStringDouble() {
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		assertEquals("JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COMPLETO|", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testAdicionaItemUsuarioStringDoubleIntStringStringInt() {
		controllerItens.adicionaItem(usuario1, "Velozes e Furiosos 7", 39.99, 123, "ACAO", "DEZESSEIS_ANOS", 2017);
		assertEquals("FILME: Velozes e Furiosos 7, R$ 39.99, Nao emprestado, 123 min, DEZESSEIS_ANOS, ACAO, 2017|", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testAdicionaItemUsuarioStringDoubleIntIntStringString() {
		controllerItens.adicionaItem(usuario1, "Os Anjos Cantam", 25.90, 110, 12, "Jorge e Matheus", "LIVRE");
		assertEquals("SHOW: Os Anjos Cantam, R$ 25.9, Nao emprestado, 110 min, LIVRE, Jorge e Matheus, 12 faixas|", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testAdicionaItemUsuarioStringDoubleStringIntStringStringInt() {
		controllerItens.adicionaItem(usuario1, "Big Time Rush", 30.00,"BTR in Paris", 60,"DEZESSEIS_ANOS","MUSICAL", 1);
		assertEquals("SERIE: Big Time Rush, R$ 30.0, Nao emprestado, 60 min, DEZESSEIS_ANOS, MUSICAL, Temporada 1|", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testCadastrarPecaPerdidaNoTabuleiro() {
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		assertEquals("JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COMPLETO|", controllerItens.listarItensOrdenadosPorNome());
		controllerItens.cadastrarPecaPerdidaNoTabuleiro(usuario1, "WAR", "Dado Amarelo");
		assertEquals("JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COM PECAS PERDIDAS|", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testAtualizarItem() {
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		assertEquals("JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COMPLETO|", controllerItens.listarItensOrdenadosPorNome());
		controllerItens.atualizarItem(usuario1, "WAR", "Nome", "WAR - IMPERIO ROMANO");
		assertEquals("JOGO DE TABULEIRO: WAR - IMPERIO ROMANO, R$ 200.0, Nao emprestado, COMPLETO|", controllerItens.listarItensOrdenadosPorNome());
		controllerItens.atualizarItem(usuario1, "WAR - IMPERIO ROMANO", "Preco", "220.00");
		assertEquals("JOGO DE TABULEIRO: WAR - IMPERIO ROMANO, R$ 220.0, Nao emprestado, COMPLETO|", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testRemoverItem() {
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		assertEquals("JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COMPLETO|", controllerItens.listarItensOrdenadosPorNome());
		controllerItens.removerItem(usuario1, "WAR");
		assertEquals("", controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testGetInfoItem() {
		controllerItens.adicionaItem(usuario1, "Big Time Rush", 30.00,"BTR in Paris", 60,"DEZESSEIS_ANOS","MUSICAL", 1);
		assertEquals("Big Time Rush", controllerItens.getInfoItem(usuario1, "Big Time Rush", "Nome"));
		assertEquals("30.0", controllerItens.getInfoItem(usuario1, "Big Time Rush", "Preco"));

	}

	@Test
	public void testGetDetalhesItem() {
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		controllerItens.adicionaItem(usuario1, "Os Anjos Cantam", 25.90, 110, 12, "Jorge e Matheus", "LIVRE");
		assertEquals("JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COMPLETO", controllerItens.getDetalhesItem(usuario1, "WAR"));
		assertEquals("SHOW: Os Anjos Cantam, R$ 25.9, Nao emprestado, 110 min, LIVRE, Jorge e Matheus, 12 faixas", controllerItens.getDetalhesItem(usuario1, "Os Anjos Cantam"));
	}

	@Test
	public void testListarItensOrdenadosPorNome() {
		controllerItens.adicionaItem(usuario1, "PES 2017", 145.00, "PS4");
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		controllerItens.adicionaItem(usuario1, "Velozes e Furiosos 7", 39.99, 123, "ACAO", "DEZESSEIS_ANOS", 2017);
		controllerItens.adicionaItem(usuario1, "Os Anjos Cantam", 25.90, 110, 12, "Jorge e Matheus", "LIVRE");
		controllerItens.adicionaItem(usuario1, "Big Time Rush", 30.00,"BTR in Paris", 60,"DEZESSEIS_ANOS","MUSICAL", 1);
		assertEquals("SERIE: Big Time Rush, R$ 30.0, Nao emprestado, 60 min, DEZESSEIS_ANOS, MUSICAL, Temporada 1|SHOW: Os Anjos Cantam, R$ 25.9, Nao emprestado, 110 min, LIVRE, Jorge e Matheus, 12 faixas|"
				+ "JOGO ELETRONICO: PES 2017, R$ 145.0, Nao emprestado, PS4|FILME: Velozes e Furiosos 7, R$ 39.99, Nao emprestado, 123 min, DEZESSEIS_ANOS, ACAO, 2017|"
				+ "JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COMPLETO|" ,controllerItens.listarItensOrdenadosPorNome());
	}

	@Test
	public void testListarItensOrdenadosPorValor() {
		controllerItens.adicionaItem(usuario1, "PES 2017", 145.00, "PS4");
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		controllerItens.adicionaItem(usuario1, "Velozes e Furiosos 7", 39.99, 123, "ACAO", "DEZESSEIS_ANOS", 2017);
		controllerItens.adicionaItem(usuario1, "Os Anjos Cantam", 25.90, 110, 12, "Jorge e Matheus", "LIVRE");
		controllerItens.adicionaItem(usuario1, "Big Time Rush", 30.00,"BTR in Paris", 60,"DEZESSEIS_ANOS","MUSICAL", 1);
		assertEquals("SHOW: Os Anjos Cantam, R$ 25.9, Nao emprestado, 110 min, LIVRE, Jorge e Matheus, 12 faixas|SERIE: Big Time Rush, R$ 30.0, Nao emprestado, 60 min, DEZESSEIS_ANOS, MUSICAL, Temporada 1|"
				+ "FILME: Velozes e Furiosos 7, R$ 39.99, Nao emprestado, 123 min, DEZESSEIS_ANOS, ACAO, 2017|JOGO ELETRONICO: PES 2017, R$ 145.0, Nao emprestado, PS4|"
				+ "JOGO DE TABULEIRO: WAR, R$ 200.0, Nao emprestado, COMPLETO|", controllerItens.listarItensOrdenadosPorValor());
	}

	@Test
	public void testIdentificaItemUsuario() {
		JogoEletronico Pes = new JogoEletronico("PES 2017", 145.00, "PS4");
		JogoTabuleiro WAR = new JogoTabuleiro("WAR", 200.00);
		controllerItens.adicionaItem(usuario1, "PES 2017", 145.00, "PS4");
		controllerItens.adicionaItem(usuario1, "WAR", 200.00);
		assertEquals(Pes, controllerItens.identificaItem(usuario1, "PES 2017"));
		assertEquals(WAR, controllerItens.identificaItem(usuario1, "WAR"));
	}

}
**/
}
