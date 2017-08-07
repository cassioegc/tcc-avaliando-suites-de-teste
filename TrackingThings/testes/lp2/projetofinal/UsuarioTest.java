package lp2.projetofinal;

/**
 * Classe responsavel por conter testes para metodos de um objeto do tipo Usuario.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.controllers.Usuario;

public class UsuarioTest {
	private Usuario usuarioUm;

	final String mensagemErroUm = "Valor invalido";
	final String mensagemErroDois = "Exibicao invalida";
	final String mensagemErroTres = "Adicionamento invalido";

	@Before
	public void criaUsuario() {
		usuarioUm = new Usuario("Raquel Vigolvino Lopes", "raquel@computacao.ufcg.edu.br", "(83) 9999-0000");
	}

	@Test
	public void testGetNome() {
		assertEquals(mensagemErroDois,"Raquel Vigolvino Lopes", usuarioUm.getNome());
	}

	@Test
	public void testSetNome() {
		assertEquals(mensagemErroDois,"Raquel Vigolvino Lopes", usuarioUm.getNome());
		usuarioUm.setNome("Livia Maria Pereira");
		assertEquals(mensagemErroDois,"Livia Maria Pereira", usuarioUm.getNome());
	}

	@Test
	public void testGetEmail() {
		assertEquals(mensagemErroDois,"raquel@computacao.ufcg.edu.br", usuarioUm.getEmail());
	}

	@Test
	public void testSetEmail() {
		assertEquals(mensagemErroDois,"raquel@computacao.ufcg.edu.br", usuarioUm.getEmail());
		usuarioUm.setEmail("raquel@gmail.com");
		assertEquals(mensagemErroDois,"raquel@gmail.com", usuarioUm.getEmail());
	}

	@Test
	public void testGetTelefone() {
		assertEquals(mensagemErroDois,"(83) 9999-0000", usuarioUm.getTelefone());
	}

	@Test
	public void testSetTelefone() {
		assertEquals(mensagemErroDois,"(83) 9999-0000", usuarioUm.getTelefone());
		usuarioUm.setTelefone("(83) 9 9999-0000");
		assertEquals(mensagemErroDois,"(83) 9 9999-0000", usuarioUm.getTelefone());
	}

	@Test
	public void testAdicionaItem() {
		///////////////////////////// falta ajeitar o adicionamento
	}

	@Test
	public void testAdicionarBluRay() {
		///////////////////////////// falta ajeitar o adicionamento
	}

	@Test
	public void testToString() {
		assertEquals(mensagemErroDois,"Raquel Vigolvino Lopes, raquel@computacao.ufcg.edu.br, (83) 9999-0000", usuarioUm.toString());
	}

	@Test
	public void testEqualsObject() {
		
	}

}
