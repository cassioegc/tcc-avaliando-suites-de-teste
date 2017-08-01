package lp2.projetofinal.facade;

import lp2.projetofinal.controllers.ControllerUsuario;

public class Facade {
	private ControllerUsuario controllerUsuario;
	
	public Facade() {
		controllerUsuario = new ControllerUsuario();
	}
	
	//MENSAGEM ESCRITA A CADA ARQUIVO DO EASYACCEPT: Implemente a parte da classe de fachada e o(s) controlador(es) necess�rios para lidar com as classes/funcionalidades criadas neste caso de uso.
	// METODOS DO US1. 
	
	public void cadastrarUsuario(String nome, String telefone, String email){
		controllerUsuario.cadastrarUsuario(nome, telefone, email);
	}
	
	public String getInfoUsuario(String nome, String telefone, String atributo){
		
		return controllerUsuario.getInfoUsuario(nome, telefone, atributo);
	}
	
	public void removerUsuario(String nome, String telefone){
		controllerUsuario.removerUsuario(nome, telefone);
	}
	
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		controllerUsuario.atualizarUsuario(nome, telefone, atributo, valor);
	}
	
	// METODOS DO US2.
	
	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma){
		//CONTROLLERPRINCIPAL.cadastrarEletronico(nome, telefone, nomeItem, preco, plataforma);
	}
	
	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo){
		return "MUDAR"; //CONTROLEPRINCIPAL.getInfoItem(nome, telefone, nomeItem, atributo);
	}
	// OBS: Nesse metodo, pedindo o PRECO, se as casas decimais forem zero, retornar s� com uma casa, se nao for, retornar com duas. Pedindo o NOME, retorna o nome (estranho porq ele ja passa o nome como parametro);
	
	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco){
		//CONTROLLERPRINCIPAL.cadastrarJogoTabuleiro(nome, telefone, nomeItem, preco);
	}
	
	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca){
		//CONTROLLERPRINCIPAL.adicionarPecaPerdida(nome,  telefone, nomeItem, nomePeca);
	}
	
	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao, String genero, String classificacao, int anoLancamento){
		//CONTROLLERPRINCIPAL.cadastrarBluRayFilme(nome, telefone, nomeItem, preco, duracao, genero, classificacao, anoLancamento);
	}
	
	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao, int numeroFaixas, String artista, String classificacao){
		//CONTROLLERPRINCIPAL.cadastrarBluRayShow(nome, telefone, nomeItem, preco, duracao, numeroFaixas, artista, classificacao);
	}
	
	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao, int duracao, String classificacao, String genero, int temporada){
		//CONTROLLERPRINCIPAL.cadastrarBluRaySerie(nome, telefone, nomeItem, preco, descricao, duracao, classificacao,  genero, temporada);
	}
	
	public void adicionarBluRay(String nome, String telefone, String BlurayTemporada, int duracao){
		//CONTROLLERPRINCIPAL.adicionarBluRay(nome, telefone, BlurayTemporada, duracao);
	}
	
	public void removerItem(String nome, String telefone, String nomeItem){
		//CONTROLLERPRINCIPAL.removerItem(nome, telefone, nomeItem); 
	}
	
	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor){
		//CONTROLLERPRINCIPAL.atualizarItem(nome, telefone, nomeItem, atributo, valor); 
	}
	
	// METODOS DO US3.
	
	public String listarItensOrdenadosPorNome(){
		return "MUDAR";//CONTROLLERPRINCIPAL.listarItensOrdenadosPorNome();
	}
	
	public String listarItensOrdenadosPorValor(){
		return "";//CONTROLLERPRINCIPAL.listarItensOrdenadosPorValor();
	}
	
	public String pesquisarDetalhesItem(String nome, String telefone, String nomeItem){
		return "MUDAR --- toStringDOitem";//CONTROLLERPRINCIPAL.pesquisarDetalhesItem(nome, telefone, nomeItem);
	}
	

}
