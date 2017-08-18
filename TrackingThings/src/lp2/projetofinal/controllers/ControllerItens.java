package lp2.projetofinal.controllers;

/**
 * Classe responsavel por controlar todos os objetos Item cadastrados no sistema.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lp2.projetofinal.entidades.BluRayFilme;
import lp2.projetofinal.entidades.BluRaySerie;
import lp2.projetofinal.entidades.BluRayShow;
import lp2.projetofinal.entidades.Item;
import lp2.projetofinal.entidades.JogoEletronico;
import lp2.projetofinal.entidades.JogoTabuleiro;
import lp2.projetofinal.entidades.Usuario;
import lp2.projetofinal.enums.EstadoItem;
import lp2.projetofinal.orders.OrdenaItemAlfabetico;
import lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos;
import lp2.projetofinal.orders.OrdenaItemPreco;
import lp2.projetofinal.util.Exceptions;

public class ControllerItens {

	/**
	 * Mapa de itens do sistema. Cada chave nesse mapa corresponde a um usuario
	 * cadastrado. O valor dessa chave é por sua vez outro mapa, onde nele, as
	 * chaves são os nomes dos itens e os valores os proprios itens.
	 */
	private Map<Usuario, Map<String, Item>> itens;

	public ControllerItens() {
		this.itens = new HashMap<>();
	}

	/**
	 * Metodo responsavel por alocar um item ao mapa de itens de um usuario, para
	 * isso ele cria esse novo hashmap caso o usuario ainda nao tenha itens ou
	 * adiciona um novo item caso o mapa ja exista.
	 * 
	 * @param donoItem
	 *            Objeto usuario dono do item.
	 * @param item
	 *            Objeto item que será cadastrado.
	 * @param nomeItem
	 *            Nome do item, e também chave do mapa de itens de um usuario.
	 * 
	 * @return Retorna um mapa atualizado, que será alocada para o dono dele.
	 */
	private Map<String, Item> alocaItem(Usuario donoItem, Item item, String nomeItem) {

		Map<String, Item> subItens;
		if (!itens.containsKey(donoItem))
			subItens = new HashMap<>();
		else
			subItens = itens.get(donoItem);

		subItens.put(nomeItem, item);
		return subItens;
	}

	/**
	 * Metodo responsavel por verificar a existencia de um item no sistema.
	 * Verificando primeiro a existencia do proprio usuario dono do item e depois o
	 * item;
	 * 
	 * @param item
	 *            Nome do item que sera verificado.
	 * @param usuario
	 *            Objeto usuario que sera verificado.
	 */
	private void verificaExistenciaItem(String item, Usuario usuario) {

		if (!this.itens.containsKey(usuario))
			Exceptions.itemNaoEncontradoException();

		if (!this.itens.get(usuario).containsKey(item))
			Exceptions.itemNaoEncontradoException();
	}

	/**
	 * Metodo com polimorfismo parametrico. Ele tem responsabilidade de cadastrar um
	 * novo item no sistema. Mas especificamente um subtipo Jogo Eletronico.
	 * 
	 * @param donoItem
	 *            Usuario dono do item e chave no hashmap de itens.
	 * @param nomeItem
	 *            Nome do item que sera cadastrado.
	 * @param preco
	 *            Preco do item que sera cadastrado.
	 * @param plataforma
	 *            Plataforma do jogo que sera cadastrado.
	 */
	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, String plataforma) {

		JogoEletronico jogoEletronico = new JogoEletronico(nomeItem, preco, plataforma);
		Map<String, Item> subItens = alocaItem(donoItem, jogoEletronico, nomeItem);
		itens.put(donoItem, subItens);
	}

	/**
	 * Metodo com polimorfismo parametrico. Ele tem responsabilidade de cadastrar um
	 * novo item no sistema. Mas especificamente um subtipo Jogo Tabuleiro.
	 * 
	 * @param donoItem
	 *            Usuario dono do item e chave no hashmap de itens.
	 * @param nomeItem
	 *            Nome do item que sera cadastrado.
	 * @param preco
	 *            Preco do item que sera cadastrado.
	 */
	public void adicionaItem(Usuario donoItem, String nomeItem, double preco) {

		JogoTabuleiro jogoTabuleiro = new JogoTabuleiro(nomeItem, preco);
		Map<String, Item> subItens = alocaItem(donoItem, jogoTabuleiro, nomeItem);
		itens.put(donoItem, subItens);

	}

	/**
	 * Metodo com polimorfismo parametrico. Ele tem responsabilidade de cadastrar um
	 * novo item no sistema. Mas especificamente um subtipo BlurayFilme.
	 * 
	 * @param donoItem
	 *            Usuario dono do item e chave no hashmap de itens.
	 * @param nomeItem
	 *            Nome do item que sera cadastrado.
	 * @param preco
	 *            Preco do item que sera cadastrado.
	 * @param duracao
	 *            Duracao do Bluray que sera cadastrado.
	 * @param genero
	 *            Genero do bluray que sera cadastrado.
	 * @param classificacao
	 *            Classificacao do bluray que sera cadastrado.
	 * @param anoLancamento
	 *            Ano do lancamento do bluray que sera cadastrado.
	 */
	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, int duracao, String genero,
			String classificacao, int anoLancamento) {

		BluRayFilme bluRayFilme = new BluRayFilme(nomeItem, preco, duracao, genero, classificacao, anoLancamento);
		Map<String, Item> subItens = alocaItem(donoItem, bluRayFilme, nomeItem);
		itens.put(donoItem, subItens);
	}

	/**
	 * Metodo com polimorfismo parametrico. Ele tem responsabilidade de cadastrar um
	 * novo item no sistema. Mas especificamente um subtipo BlurayShow.
	 * 
	 * @param donoItem
	 *            Usuario dono do item e chave no hashmap de itens.
	 * @param nomeItem
	 *            Nome do item que sera cadastrado.
	 * @param preco
	 *            Preco do item que sera cadastrado.
	 * @param duracao
	 *            Duracao do Bluray que sera cadastrado.
	 * @param numeroFaixas
	 *            Numero de faixas do bluray show.
	 * @param artista
	 *            Artista do bluray show.
	 * @param classificacao
	 *            Classificacao do bluray que sera cadastrado.
	 */
	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, int duracao, int numeroFaixas,
			String artista, String classificacao) {

		BluRayShow bluRayShow = new BluRayShow(nomeItem, preco, duracao, classificacao, artista, numeroFaixas);
		Map<String, Item> subItens = alocaItem(donoItem, bluRayShow, nomeItem);
		itens.put(donoItem, subItens);

	}

	/**
	 * Metodo com polimorfismo parametrico. Ele tem responsabilidade de cadastrar um
	 * novo item no sistema. Mas especificamente um subtipo BluraySerie.
	 * 
	 * @param donoItem
	 *            Usuario dono do item e chave no hashmap de itens.
	 * @param nomeItem
	 *            Nome do item que sera cadastrado.
	 * @param preco
	 *            Preco do item que sera cadastrado.
	 * @param duracao
	 *            Duracao do Bluray que sera cadastrado.
	 * @param genero
	 *            Genero do bluray que sera cadastrado.
	 * @param classificacao
	 *            Classificacao do bluray que sera cadastrado.
	 * @param temporada
	 *            Numero da temporada do bluray serie.
	 * 
	 * @param descricao
	 *            Descricao do bluray serie.
	 */
	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, String descricao, int duracao,
			String classificacao, String genero, int temporada) {

		BluRaySerie bluRaySerie = new BluRaySerie(nomeItem, preco, descricao, duracao, classificacao, genero,
				temporada);
		Map<String, Item> subItens = alocaItem(donoItem, bluRaySerie, nomeItem);
		itens.put(donoItem, subItens);
	}

	/**
	 * Metodo responsavel por adicionar um bluray episodio ao bluray serie
	 * escolhido. Verificando antes sua existencia nos itens cadastrados desse
	 * usuario.
	 * 
	 * @param donoItem
	 *            Usuario dono do item.
	 * @param nomeItem
	 *            Nome do bluray serie.
	 * @param duracao
	 *            Duracao do episodio.
	 */
	public void adicionarBluRayEpisodio(Usuario donoItem, String nomeItem, int duracao) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);
		BluRaySerie bluraySerie = (BluRaySerie) subItens.get(nomeItem);

		bluraySerie.adicionarBluRay(duracao);
	}

	/**
	 * Metodo responsavel por cadastrar uma peca perdida no tabuleiro escolhido.
	 * Verificando antes a existencia desse item no mapa de itens desse usuario.
	 * 
	 * @param donoItem
	 *            Usuario dono do item.
	 * @param nomeItem
	 *            Nome do jogo de tabuleiro.
	 * @param nomePeca
	 *            Nome da peca perdida.
	 */
	public void cadastrarPecaPerdidaNoTabuleiro(Usuario donoItem, String nomeItem, String nomePeca) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);
		JogoTabuleiro jogoTabuleiro = (JogoTabuleiro) subItens.get(nomeItem);

		jogoTabuleiro.adicionarPecaPerdida(nomePeca);

	}

	/**
	 * Metodo responsavel por atualizar um item. Verificando antes sua existencia no
	 * mapa de itens do usuario escolhido.
	 * 
	 * @param donoItem
	 *            Usuario dono do item.
	 * @param nomeItem
	 *            Nome do item escolhido.
	 * @param atributo
	 *            Atributo que sera atualizado.
	 * @param valor
	 *            Novo valor desse atributo.
	 */
	public void atualizarItem(Usuario donoItem, String nomeItem, String atributo, String valor) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);
		Item item = subItens.get(nomeItem);
		item.atualizar(atributo, valor);

		if (atributo.equals("Nome")) {
			subItens.put(valor, item);
			subItens.remove(nomeItem);
		}

	}

	/**
	 * Metodo responsavel por remover um item do mapa de itens de um usuario.
	 * Verificando antes a existencia do mesmo.
	 * 
	 * @param donoItem
	 *            Usuario dono do item.
	 * @param nomeItem
	 *            Nome do item.
	 */
	public void removerItem(Usuario donoItem, String nomeItem) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);

		subItens.remove(nomeItem);
	}

	/**
	 * Metodo responsavel por retornar o valor do atributo escolhido, solicitando ao
	 * item que reconheca qual atributo eh ja que eles podem divergir de atributos.
	 * 
	 * @param donoItem
	 *            Usuario dono do item.
	 * @param nomeItem
	 *            Nome do item.
	 * @param atributo
	 *            Atributo escolhido para ser retornado.
	 * 
	 * @return Retorna uma string com o valor desse atributo.
	 */
	public String getInfoItem(Usuario donoItem, String nomeItem, String atributo) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);
		Item item = subItens.get(nomeItem);
		return item.getInfo(atributo);
	}

	/**
	 * Metodo responsavel todas as informacoes de um item a partir do toString dele.
	 * 
	 * @param donoItem
	 *            Usuario dono do item.
	 * @param nomeItem
	 *            Nome do item.
	 * 
	 * @return Retorna uma string do item.
	 */
	public String getDetalhesItem(Usuario donoItem, String nomeItem) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);

		return subItens.get(nomeItem).toString();

	}

	/**
	 * Metodo responsavel por retornar a lista dos itens cadastrados no sistema.
	 * 
	 * @return Retorna um List com esses itens.
	 */
	private List<Item> retornaUsuariosItens() {
		List<Item> listaItens = new ArrayList<Item>();

		for (Usuario chave : this.itens.keySet()) {
			listaItens.addAll(this.itens.get(chave).values());
		}

		return listaItens;
	}

	/**
	 * Metodo responsavel por listar todos os itens do sistema em ordem alfabetica.
	 * 
	 * @return Retorna uma string com essa listagem.
	 */
	public String listarItensOrdenadosPorNome() {

		List<Item> listaItens = retornaUsuariosItens();
		Collections.sort(listaItens, new OrdenaItemAlfabetico());

		String itensString = "";
		for (Item item : listaItens) {
			itensString += item.toString() + "|";
		}
		return itensString;
	}

	/**
	 * Metodo responsavel por listar todos os itens do sistema levando em
	 * consideração o seu preco.
	 * 
	 * @return Retorna uma string com essa listagem.
	 */
	public String listarItensOrdenadosPorValor() {

		List<Item> listaItens = retornaUsuariosItens();
		Collections.sort(listaItens, new OrdenaItemPreco());

		String itensString = "";
		for (Item item : listaItens) {
			itensString += item.toString() + "|";
		}
		return itensString;
	}

	/**
	 * Metodo responsavel por identificar e retornar um item no sistema.
	 * 
	 * @param donoItem
	 *            Usuario dono do item.
	 * @param nomeItem
	 *            Nome do item.
	 * 
	 * @return Retorna um objeto do tipo item.
	 */
	public Item identificaItemUsuario(Usuario donoItem, String nomeItem) {

		verificaExistenciaItem(nomeItem, donoItem);

		return itens.get(donoItem).get(nomeItem);

	}

	public String listarItensNaoEmprestados() {

		String stringItens = "";
		List<Item> listaItens = retornaUsuariosItens();
		Collections.sort(listaItens, new OrdenaItemAlfabetico());
		for (Item item : listaItens) {
			if (item.getEstado().equals(EstadoItem.NAO_EMPRESTADO.getEstado()))
				stringItens += item.toString() + "|";
		}

		return stringItens;
	}
	
	
	public String listarTop10Itens() {
		List<Item> listaItens = retornaUsuariosItens();
		Collections.sort(listaItens, new OrdenaItemNumeroEmprestimos());

		String top10ItensString = "";
		int numeroItens = 1;
		for (Item item : listaItens) {
			if (numeroItens == 11) {
				break;
			}
			if (item.getNumeroEmprestimos() != 0) {
				top10ItensString += numeroItens+") "+ item.getNumeroEmprestimos()+ " emprestimos - "+item.toString() + "|";
				numeroItens++;
			}
		}
		
		return top10ItensString;


		
	}
	


}
