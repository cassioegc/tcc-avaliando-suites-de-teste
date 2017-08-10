

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.controllers.ControllerEmprestimos;
import lp2.projetofinal.controllers.ControllerItens;
import lp2.projetofinal.controllers.ControllerUsuario;
import lp2.projetofinal.controllers.Sistema;
import lp2.projetofinal.entidades.BluRayFilme;
import lp2.projetofinal.entidades.BluRaySerie;
import lp2.projetofinal.entidades.BluRayShow;
import lp2.projetofinal.entidades.JogoEletronico;
import lp2.projetofinal.entidades.JogoTabuleiro;
import lp2.projetofinal.entidades.Usuario;

public class SistemaTeste {

	private ControllerUsuario controllerUsuario;
	private ControllerItens controllerItens;
	private ControllerEmprestimos controllerEmprestimos;

	private Sistema sistema;
	
	private Usuario usuario1;
	private Usuario usuario2;
	
	private JogoEletronico jogo1;
	private JogoTabuleiro jogo2;
	
	private BluRayFilme bluray1;
	private BluRayShow bluray2;
	private BluRaySerie bluray3;

	@Before
	public void criaSistema() {
		sistema = new Sistema();
	}

	@Before
	public void criaUsuario() {
		//usuario1 = new Usuario("Raquel Vigolvino Lopes", "raquel@computacao.ufcg.edu.br", "(83) 9999-0000");
		usuario2 = new Usuario("Gabriel","gabriel.azevedo@ccc.ufcg.edu.br","(83) 9999-00001");
	}
	
	@Before
	public void criaItens() {
		jogo1 = new JogoEletronico("GTA V", 150.00, "PS4");
		jogo2 = new JogoTabuleiro("Xadrez", 70.00);
		
		bluray1 = new BluRayFilme("Frozen", 45.99, 120, "ANIMACAO", "LIVRE", 2013);
		bluray2 = new BluRayShow("Natiruts Ao Vivo em Remigio", 50.00, 140, "LIVRE", "Natiruts", 11);
		bluray3 = new BluRaySerie("Big Time Rush", 30.00,"BTR in Paris", 60,"DEZESSEIS_ANOS","SUSPENSE", 1);
	}

	@Before
	public void criaControladores() {
		controllerUsuario = new ControllerUsuario();
		controllerItens = new ControllerItens();
		controllerEmprestimos = new ControllerEmprestimos();
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
	public void testRemoverUsuario() {
		sistema.cadastrarUsuario("Raquel Vigolvino Lopes", "(83) 9999-0000", "raquel@computacao.ufcg.edu.br");
		assertEquals("raquel@computacao.ufcg.edu.br", sistema.getInfoUsuario("Raquel Vigolvino Lopes", "(83) 9999-0000", "Email"));
		
		sistema.removerUsuario("Raquel Vigolvino Lopes", "(83) 9999-0000");

		// nao contem usuario
	}

	@Test
	public void testAtualizarUsuario() {
		sistema.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");

		assertEquals("Gabriel",
			controllerUsuario.identificaUsuario("Gabriel", "(83) 9999-0000").getNome());
		
	}

	@Test
	public void testCadastrarEletronico() {
		sistema.cadastrarEletronico("Gabriel", "(83) 9999-00001", "GTA V", 150.00, "PS4");
		
		JogoEletronico jogoEletronico = (JogoEletronico) controllerItens.identificaItemUsuario(usuario2,"GTA V");
		
		assertEquals(jogo1,jogoEletronico);
	}

	@Test
	public void testCadastrarJogoTabuleiro() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-00001","Xadrez", 70.00);
		
		JogoTabuleiro jogoTabuleiro = (JogoTabuleiro) controllerItens.identificaItemUsuario(usuario2,"Xadrez");
		
		assertEquals(jogo2,jogoTabuleiro);
	}

	@Test
	public void testCadastrarBluRayFilme() {
		sistema.cadastrarBluRayFilme("Gabriel", "(83) 9999-00001","Frozen", 45.99, 120, "ANIMACAO", "LIVRE", 2013);
		BluRayFilme bluRayFilme = (BluRayFilme) controllerItens.identificaItemUsuario(usuario2,"Frozen");
		
		assertEquals(bluray1,bluRayFilme);
	}

	@Test
	public void testCadastrarBluRayShow() {
		sistema.cadastrarBluRayShow("Gabriel", "(83) 9999-00001","Natiruts Ao Vivo em Remigio", 50.00, 140,11, "LIVRE", "Natiruts");
		
		BluRayShow bluRayShow = (BluRayShow) controllerItens.identificaItemUsuario(usuario2,"Natiruts Ao Vivo em Remigio");
		
		assertEquals(bluray2,bluRayShow);
		
	}

	@Test
	public void testCadastrarBluRaySerie() {
		sistema.cadastrarBluRaySerie("Gabriel", "(83) 9999-00001","Big Time Rush", 30.00,"BTR in Paris", 60,"DEZESSEIS_ANOS","SUSPENSE", 1);
		
		BluRaySerie bluRaySerie = (BluRaySerie) controllerItens.identificaItemUsuario(usuario2,"Big Time Rush");
		
		assertEquals(bluray3,bluRaySerie);
		
		
	}

	@Test
	public void testAdicionarBluRay() {
		sistema.cadastrarBluRaySerie("Gabriel", "(83) 9999-00001","Big Time Rush", 30.00,"BTR in Paris", 60,"DEZESSEIS_ANOS","SUSPENSE", 1);
		
		BluRaySerie bluRaySerie = (BluRaySerie) controllerItens.identificaItemUsuario(usuario2,"Big Time Rush");
		
		assertEquals(0,bluRaySerie.duracaoTotal());
		
		sistema.adicionarBluRay("Gabriel", "(83) 9999-00001","Big Time Rush",30);
		
		assertEquals(30,bluRaySerie.duracaoTotal());
		
		sistema.adicionarBluRay("Gabriel", "(83) 9999-00001","Big Time Rush",30);
		
		assertEquals(60,bluRaySerie.duracaoTotal());
	
	}

	@Test
	public void testAdicionarPecaPerdida() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-00001","Xadrez", 70.00);
		
		JogoTabuleiro jogoTabuleiro = (JogoTabuleiro) controllerItens.identificaItemUsuario(usuario2,"Xadrez");
		
		assertEquals("COMPLETO", jogoTabuleiro.contemPecasPerdidas());
		
		sistema.adicionarPecaPerdida("Gabriel", "(83) 9999-00001", "Xadrez", "Cavalo");
		
		assertEquals("COM PECAS PERDIDAS", jogoTabuleiro.contemPecasPerdidas());
		
		
	}

	@Test
	public void testRemoverItem() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-00001","Xadrez", 70.00);
		
		JogoTabuleiro jogoTabuleiro = (JogoTabuleiro) controllerItens.identificaItemUsuario(usuario2,"Xadrez");
		
		assertEquals(jogo2,jogoTabuleiro);
		
		sistema.removerItem("Gabriel", "(83) 9999-00001","Xadrez");
		
		
		assertEquals(null,controllerItens.identificaItemUsuario(usuario2,"Xadrez"));
		
	}

	@Test
	public void testAtualizarItem() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-00001","Xadrez", 70.00);
		
		JogoTabuleiro jogoTabuleiro = (JogoTabuleiro) controllerItens.identificaItemUsuario(usuario2,"Xadrez");
		
		assertEquals("Xadrez",jogoTabuleiro.getNome());
		
		sistema.atualizarItem("Gabriel", "(83) 9999-00001","Xadrez", "Nome", "Xadrez Azul");
	
		JogoTabuleiro jogoTabuleiroAtualizadoNome = (JogoTabuleiro) controllerItens.identificaItemUsuario(usuario2,"Xadrez Azul");
		
		assertEquals("Xadrez Azul",jogoTabuleiroAtualizadoNome.getNome());
		
		sistema.atualizarItem("Gabriel", "(83) 9999-00001","Xadrez", "Preco", "80.00");
	
		JogoTabuleiro jogoTabuleiroAtualizadoPreco = (JogoTabuleiro) controllerItens.identificaItemUsuario(usuario2,"Xadrez Azul");
		
		assertEquals(80.00,jogoTabuleiroAtualizadoPreco.getPreco(),0.01);
	
	}

	@Test
	public void testGetInfoItem() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-00001","Xadrez", 70.00);
	
		assertEquals("Xadrez",sistema.getInfoItem("Gabriel", "(83) 9999-00001","Xadrez","Nome"));
		
		assertEquals("70.00",sistema.getInfoItem("Gabriel", "(83) 9999-00001","Xadrez","Preco"));
		
	}

	@Test
	public void testPesquisarDetalhesItem() {
		sistema.cadastrarJogoTabuleiro("Gabriel", "(83) 9999-00001","Xadrez", 70.00);
		
		assertEquals("JOGO DE TABULEIRO: Xadrez, R$ 70.0, Nao emprestado, COMPLETO|",sistema.pesquisarDetalhesItem("Gabriel", "(83) 9999-00001","Xadrez"));
	}

	@Test
	public void testListarItensOrdenadosPorNome() {
			
	}

	@Test
	public void testListarItensOrdenadosPorValor() {

	}

	@Test
	public void testRegistrarEmprestimo() {

	}

	@Test
	public void testDevolverItem() {

	}

	@Test
	public void testFinalizar() {

	}

}
