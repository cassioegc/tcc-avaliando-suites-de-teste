/**
* Representacao da classificacao para um BluRay
* 
* @author ................
*/

package lp2.projetofinal.enums;

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

	public static ClassificacaoBluRay indentificaClassificacao(String classificacao) {
			
			switch(classificacao){
				
				case "LIVRE":
					return ClassificacaoBluRay.LIVRE;
					// NAO PRECISA DO BREAK NE?
				case "DEZ_ANOS":
					return ClassificacaoBluRay.DEZ_ANOS;	
				case "DOZE_ANOS":
					return ClassificacaoBluRay.DOZE_ANOS;
				case "QUATORZE_ANOS":
					return ClassificacaoBluRay.QUATORZE_ANOS;
				case "DEZESSEIS_ANOS":
					return ClassificacaoBluRay.DEZESSEIS_ANOS;
				case "DEZOITO_ANOS":
					return ClassificacaoBluRay.DEZOITO_ANOS;
	
				}
			/// RETORNA OQ SE TUDO DER ERRADO?
			return null;
		}
	
}
