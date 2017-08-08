package lp2.projetofinal.controllers;

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
import lp2.projetofinal.orders.OrdenaItemAlfabetico;
import lp2.projetofinal.orders.OrdenaItemPreco;
import lp2.projetofinal.util.Exceptions;

public class ControllerItens {

	private Map<Usuario, Map<String, Item>> itens;

	public ControllerItens() {
		this.itens = new HashMap<>();
	}

	private Map<String, Item> alocaItem(Usuario donoItem, Item item, String nomeItem) {

		Map<String, Item> subItens;
		if (!itens.containsKey(donoItem))
			subItens = new HashMap<>();
		else
			subItens = itens.get(donoItem);

		subItens.put(nomeItem, item);
		return subItens;
	}

	private void verificaExistenciaItem(String item, Usuario usuario) {

		if (!this.itens.containsKey(usuario))
			Exceptions.itemNaoEncontradoException();

		if (!this.itens.get(usuario).containsKey(item))
			Exceptions.itemNaoEncontradoException();
	}

	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, String plataforma) {

		JogoEletronico jogoEletronico = new JogoEletronico(nomeItem, preco, plataforma);
		Map<String, Item> subItens = alocaItem(donoItem, jogoEletronico, nomeItem);
		itens.put(donoItem, subItens);
	}

	public void adicionaItem(Usuario donoItem, String nomeItem, double preco) {

		JogoTabuleiro jogoTabuleiro = new JogoTabuleiro(nomeItem, preco);
		Map<String, Item> subItens = alocaItem(donoItem, jogoTabuleiro, nomeItem);
		itens.put(donoItem, subItens);

	}

	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, int duracao, String genero,
			String classificacao, int anoLancamento) {

		BluRayFilme bluRayFilme = new BluRayFilme(nomeItem, preco, duracao, genero, classificacao, anoLancamento);
		Map<String, Item> subItens = alocaItem(donoItem, bluRayFilme, nomeItem);
		itens.put(donoItem, subItens);
	}

	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, int duracao, int numeroFaixas,
			String artista, String classificacao) {

		BluRayShow bluRayShow = new BluRayShow(nomeItem, preco, duracao, classificacao, artista, numeroFaixas);
		Map<String, Item> subItens = alocaItem(donoItem, bluRayShow, nomeItem);
		itens.put(donoItem, subItens);

	}

	public void adicionaItem(Usuario donoItem, String nomeItem, double preco, String descricao, int duracao,
			String classificacao, String genero, int temporada) {

		BluRaySerie bluRaySerie = new BluRaySerie(nomeItem, preco, descricao, duracao, classificacao, genero,
				temporada);
		Map<String, Item> subItens = alocaItem(donoItem, bluRaySerie, nomeItem);
		itens.put(donoItem, subItens);
	}

	public void adicionarBluRayEpisodio(Usuario donoItem, String nomeItem, int duracao) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);
		BluRaySerie bluraySerie = (BluRaySerie) subItens.get(nomeItem);

		bluraySerie.adicionarBluRay(duracao);
	}

	public void cadastrarPecaPerdidaNoTabuleiro(Usuario donoItem, String nomeItem, String nomePeca) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);
		JogoTabuleiro jogoTabuleiro = (JogoTabuleiro) subItens.get(nomeItem);

		jogoTabuleiro.adicionarPecaPerdida(nomePeca);

	}

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

	public void removerItem(Usuario donoItem, String nomeItem) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);

		subItens.remove(nomeItem);
	}

	public String getInfoItem(Usuario donoItem, String nomeItem, String atributo) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);
		Item item = subItens.get(nomeItem);
		return item.getInfo(atributo);
	}

	public String getDetalhesItem(Usuario donoItem, String nomeItem) {

		verificaExistenciaItem(nomeItem, donoItem);

		Map<String, Item> subItens = itens.get(donoItem);

		return subItens.get(nomeItem).toString();

	}

	private List<Item> retornaUsuarioItens() {
		List<Item> listaItens = new ArrayList<Item>();

		for (Usuario chave : this.itens.keySet()) {
			listaItens.addAll(this.itens.get(chave).values());
		}

		return listaItens;
	}

	public String listarItensOrdenadosPorNome() {

		List<Item> listaItens = retornaUsuarioItens();
		Collections.sort(listaItens, new OrdenaItemAlfabetico());

		String itensString = "";
		for (Item item : listaItens) {
			itensString += item.toString() + "|";
		}
		return itensString;
	}

	public String listarItensOrdenadosPorValor() {

		List<Item> listaItens = retornaUsuarioItens();
		Collections.sort(listaItens, new OrdenaItemPreco());

		String itensString = "";
		for (Item item : listaItens) {
			itensString += item.toString() + "|";
		}
		return itensString;
	}
}
