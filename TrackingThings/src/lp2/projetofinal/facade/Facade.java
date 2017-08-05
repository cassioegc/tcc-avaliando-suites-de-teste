package lp2.projetofinal.facade;

import lp2.projetofinal.controllers.Sistema;

public class Facade {
	
	private Sistema sistema;
	
	public void iniciarSistema(){
		sistema = new Sistema();
	}
	
	public void cadastrarUsuario(String nome, String telefone, String email){
		sistema.cadastrarUsuario(nome, telefone, email);
	}
	
	public String getInfoUsuario(String nome, String telefone, String atributo){
		
		return sistema.getInfoUsuario(nome, telefone, atributo);
	}
	
	public void removerUsuario(String nome, String telefone){
		sistema.removerUsuario(nome, telefone);
	}
	
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		sistema.atualizarUsuario(nome, telefone, atributo, valor);
	}
	
	public void fecharSistema(){
		sistema.finalizar();
	}
	
	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma){
		sistema.cadastrarEletronico(nome, telefone, nomeItem, preco, plataforma);
	}
	
	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo){
		return sistema.getInfoItem(nome, telefone, nomeItem, atributo);
	}
	// OBS: Nesse metodo, pedindo o PRECO, se as casas decimais forem zero, retornar s� com uma casa, se nao for, retornar com duas. Pedindo o NOME, retorna o nome (estranho porq ele ja passa o nome como parametro);
	
	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco){
		sistema.cadastrarJogoTabuleiro(nome, telefone, nomeItem, preco);
	}
	// FALTA ESSA
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
	// FALTA ESSA
	public void adicionarBluRay(String nome, String telefone, String BlurayTemporada, int duracao){
		//CONTROLLERPRINCIPAL.adicionarBluRay(nome, telefone, BlurayTemporada, duracao);
	}
	// FALTA ESSA
	public void removerItem(String nome, String telefone, String nomeItem){
		//CONTROLLERPRINCIPAL.removerItem(nome, telefone, nomeItem); 
	}
	// FALTA ESSA
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
