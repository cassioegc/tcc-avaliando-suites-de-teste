/**
* Representacao da classificacao para um BluRay
* 
* @author ................
*/

package lp2.projetofinal.entidades;

public enum ClassificacaoBluRay {
	 	LIVRE("LIVRE"), DEZ_ANOS("10 ANOS"), DOZE_ANOS("12 ANOS"), QUATORZE_ANOS("14 ANOS"), DEZESSEIS_ANOS("16 ANOS"), DEZOITO_ANOS("18 ANOS");

		private String classificacao;

		/**
		 *
		 * @param novaClassificacao
		 *            A descricao do estado.
		 * 
		 */
		private ClassificacaoBluRay(String novaClassificacao) {
			this.classificacao = novaClassificacao;
		}

		/**
		 * Recupera a classificacao do BluRay.
		 *
		 * @return A classificacao do BluRay.
		 */
		public String getClassificacao() {
			return this.classificacao;
		}

	
}
