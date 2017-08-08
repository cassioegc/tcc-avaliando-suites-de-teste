package lp2.projetofinal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lp2.projetofinal.controllers.ControllerUsuario;
import lp2.projetofinal.entidades.Usuario;

public class ControllerUsuarioTeste {
	
	private ControllerUsuario controllerUsuario;

	@Before
	public void criaControllerUsuario(){
		controllerUsuario = new ControllerUsuario();
		controllerUsuario.cadastrarUsuario("Thiago", "(83) 9898-0000", "thiago@ccc.ufcg.edu.br");
	}
	
	//@Test
	//public void testConstrutorControllerUsuario() {
		//fail("Not yet implemented");
	///}

	@Test 
	public void testGetInfoUsuario() {
		assertEquals("thiago@ccc.ufcg.edu.br", controllerUsuario.getInfoUsuario("Thiago", "(83) 9898-0000", "Email"));
		assertEquals("(83) 9898-0000", controllerUsuario.getInfoUsuario("Thiago", "(83) 9898-0000", "Telefone"));
		assertEquals("Thiago", controllerUsuario.getInfoUsuario("Thiago", "(83) 9898-0000", "Nome"));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetInfoUsuarioATRIBUTOINVALIDO() {
		controllerUsuario.getInfoUsuario("Gabriel", "(83) 9999-0000", "email");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetInfoUsuarioUSUARIONAOEXISTENTE() {
		controllerUsuario.getInfoUsuario("Gabriel", "(83) 9999-0000", "Email");
	}
	
	@Test
	public void testCadastrarUsuario() {
		controllerUsuario.cadastrarUsuario("Gabriel", "(83) 9999-0000", "gabriel@ccc.ufcg.edu.br");
		assertEquals("gabriel@ccc.ufcg.edu.br", controllerUsuario.getInfoUsuario("Gabriel", "(83) 9999-0000", "Email"));
	}

	@Test (expected = IllegalArgumentException.class)
	public void testCadastrarUsuarioUSUARIOJAEXISTENTE() {
		controllerUsuario.cadastrarUsuario("Thiago", "(83) 9898-0000", "thiago@ccc.ufcg.edu.br");
	}
	
	@Test
	public void testAtualizarUsuario() {
		controllerUsuario.atualizarUsuario("Thiago", "(83) 9898-0000", "Email", "thiagoSantos@ccc.ufcg.edu.br");
		assertEquals("thiagoSantos@ccc.ufcg.edu.br", controllerUsuario.getInfoUsuario("Thiago", "(83) 9898-0000", "Email"));
		controllerUsuario.atualizarUsuario("Thiago", "(83) 9898-0000", "Telefone", "(84) 9898-0000");
		assertEquals("(84) 9898-0000", controllerUsuario.getInfoUsuario("Thiago", "(84) 9898-0000", "Telefone"));
		controllerUsuario.atualizarUsuario("Thiago", "(84) 9898-0000", "Nome", "Marcelo");
		assertEquals("Marcelo", controllerUsuario.getInfoUsuario("Marcelo", "(84) 9898-0000", "Nome"));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testAtualizarUsuarioUSUARIOINVALIDO() {
		controllerUsuario.atualizarUsuario("Joao", "(83) 9999-9999", "Telefone", "(83) 9999-8888");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testAtualizarUsuarioATRIBUTOINVALIDO() {
		controllerUsuario.atualizarUsuario("Thiago", "(83) 9898-0000", "email", "thiagoSantos@ccc.ufcg.edu.br");
	}

	@Test
	public void testIdentificaUsuario() {
		Usuario usuario = new Usuario("Thiago", "thiago@ccc.ufcg.edu.br", "(83) 9898-0000");
		assertEquals(usuario, controllerUsuario.identificaUsuario("Thiago", "(83) 9898-0000"));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testRemoverUsuarioEIdentificaUsuarioUSUARIOINVALIDO() {
		controllerUsuario.removerUsuario("Thiago", "(83) 9898-0000");
		controllerUsuario.identificaUsuario("Thiago", "(83) 9898-0000");
	}

}
