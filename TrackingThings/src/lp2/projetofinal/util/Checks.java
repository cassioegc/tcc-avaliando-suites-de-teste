package lp2.projetofinal.util;

/**
 * Classe responsavel por encapsular os metodos relacionados a validacoes no
 * projeto.
 * 
 * Laboratorio de Programacao 2 - Projeto Final Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 * @author Gabriel Almeida Azevedo - 116210009
 * @author Marcelo Gabriel dos Santos Queiroz Vitorino - 116211290
 */

public class Checks {

	public static void verificaNomeVazioNulo(String nome) {
		if (nome.trim().isEmpty())
			throw new IllegalArgumentException("Nome usuario nao pode ser vazio ou nulo");
	}

	public static void verificaTelefoneVazioNulo(String telefone) {
		if (telefone.trim().isEmpty())
			throw new IllegalArgumentException("Telefone nao pode ser vazio ou nulo");
	}

	public static void verificaEmailVazioNulo(String email) {
		if (email.trim().isEmpty())
			throw new IllegalArgumentException("Email nao pode ser vazio ou nulo");
	}

	public static void verificaAtributolVazioNulo(String atributo) {
		if (atributo.trim().isEmpty())
			throw new IllegalArgumentException("Atributo nao pode ser vazio ou nulo");
	}

	public static void verificaValorVazioNulo(String valor) {
		if (valor.trim().isEmpty())
			throw new IllegalArgumentException("Valor nao pode ser vazio ou nulo");
	}

	public static void verificaPrecoZeroNegativo(double preco) {
		if (preco <= 0)
			throw new IllegalArgumentException("Preco invalido");
	}

	public static void verificaNomeItemVazioNulo(String nomeItem) {
		if (nomeItem.trim().isEmpty())
			throw new IllegalArgumentException("Nome item nao pode ser vazio ou nulo");
	}

	public static void verificaPlataformaVaziaNula(String plataforma) {
		if (plataforma.trim().isEmpty())
			throw new IllegalArgumentException("Plataforma nao pode ser vazia ou nula");
	}

	public static void verificaDuracaoZeroNegativa(int duracao) {
		if (duracao <= 0)
			throw new IllegalArgumentException("Duracao invalida");
	}

	public static void verificaGeneroVazioNulo(String genero) {
		if (genero.trim().isEmpty())
			throw new IllegalArgumentException("Genero nao pode ser vazio ou nulo");
	}

	public static void verificaClassificacaoVaziaNula(String classificacao) {
		if (classificacao.trim().isEmpty())
			throw new IllegalArgumentException("Classificacao nao pode ser vazia ou nula");
	}

	public static void verificaAnoLancamentoZeroNegativo(int anoLancamento) {
		if (anoLancamento <= 0)
			throw new IllegalArgumentException("Ano lancamento invalido");
	}

	public static void verificaNumeroFaixasZeroNegativo(int numFaixas) {
		if (numFaixas <= 0)
			throw new IllegalArgumentException("Numero faixas invalido");
	}

	public static void verificaArtistaVazioNulo(String artista) {
		if (artista.trim().isEmpty())
			throw new IllegalArgumentException("Artista nao pode ser vazio ou nulo");
	}

	public static void verificaTemporadaZeroNegativa(int temporada) {
		if (temporada <= 0)
			throw new IllegalArgumentException("Temporada invalida");
	}

	public static void verificaDescricaoVaziaNula(String descricao) {
		if (descricao.trim().isEmpty())
			throw new IllegalArgumentException("Descricao nao pode ser vazia ou nula");
	}

	public static void verificaPecaVaziaNula(String nomePeca) {
		if (nomePeca.trim().isEmpty())
			throw new IllegalArgumentException("Peca nao pode ser vazia ou nula");
	}

}
