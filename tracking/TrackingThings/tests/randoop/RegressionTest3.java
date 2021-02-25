import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str2 = controllerEmprestimos0.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = ordenaUsuarioReputacaoCrescente4.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente5);
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico12 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean13 = usuario10.equals((java.lang.Object) plataformaJogoEletronico12);
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str18 = usuario17.getTelefone();
        int int19 = ordenaUsuarioReputacaoCrescente4.compare(usuario10, usuario17);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente20 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str25 = usuario24.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario29 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int30 = ordenaUsuarioReputacaoCrescente20.compare(usuario24, usuario29);
        lp2.projetofinal.entidades.Usuario usuario34 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str35 = usuario34.getTelefone();
        java.lang.String str36 = usuario34.getNome();
        lp2.projetofinal.entidades.Item item37 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo40 = new lp2.projetofinal.entidades.Emprestimo(usuario29, usuario34, item37, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario44 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str45 = usuario44.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo47 = new lp2.projetofinal.entidades.Emprestimo(usuario34, usuario44, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos48 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico52 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str53 = jogoEletronico52.getPlataforma();
        java.lang.String str54 = jogoEletronico52.getPlataforma();
        jogoEletronico52.itemDevolvido();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro58 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        jogoTabuleiro58.adicionarPecaPerdida("Caloteiro, Nao emprestado, ");
        int int61 = ordenaItemNumeroEmprestimos48.compare((lp2.projetofinal.entidades.Item) jogoEletronico52, (lp2.projetofinal.entidades.Item) jogoTabuleiro58);
        lp2.projetofinal.entidades.Emprestimo emprestimo64 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario44, (lp2.projetofinal.entidades.Item) jogoEletronico52, "Caloteiro, OUTRO, ", (int) (short) 10);
        java.lang.String str65 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario10);
        controllerEmprestimos0.carregaListaEmprestimos();
        lp2.projetofinal.entidades.Usuario usuario67 = null;
        java.lang.String str68 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico12 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico12.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro" + "'", str36, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "OUTRO" + "'", str53, "OUTRO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "OUTRO" + "'", str54, "OUTRO");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Nenhum item pego emprestado" + "'", str65, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Nenhum item pego emprestado" + "'", str68, "Nenhum item pego emprestado");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = ordenaUsuarioReputacaoCrescente0.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = ordenaUsuarioReputacaoCrescente4.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente5);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator7 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator8 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator9 = ordenaUsuarioReputacaoCrescente0.thenComparing(usuarioComparator8);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente10 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator12 = ordenaUsuarioReputacaoCrescente10.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente11);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator13 = usuarioComparator12.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator14 = usuarioComparator9.thenComparing(usuarioComparator12);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator15 = usuarioComparator14.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente16 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente17 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator18 = ordenaUsuarioReputacaoCrescente16.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente17);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator19 = ordenaUsuarioReputacaoCrescente16.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente20 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente21 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator22 = ordenaUsuarioReputacaoCrescente20.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente21);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator23 = ordenaUsuarioReputacaoCrescente20.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator24 = ordenaUsuarioReputacaoCrescente20.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator25 = ordenaUsuarioReputacaoCrescente16.thenComparing(usuarioComparator24);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente26 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente27 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator28 = ordenaUsuarioReputacaoCrescente26.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente27);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator29 = usuarioComparator28.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator30 = usuarioComparator25.thenComparing(usuarioComparator28);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator31 = usuarioComparator30.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator32 = usuarioComparator31.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator33 = usuarioComparator14.thenComparing(usuarioComparator32);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente34 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente35 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator36 = ordenaUsuarioReputacaoCrescente34.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente35);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator37 = ordenaUsuarioReputacaoCrescente34.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente38 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente39 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator40 = ordenaUsuarioReputacaoCrescente38.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente39);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator41 = ordenaUsuarioReputacaoCrescente38.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator42 = ordenaUsuarioReputacaoCrescente38.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator43 = ordenaUsuarioReputacaoCrescente34.thenComparing(usuarioComparator42);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente44 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente45 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator46 = ordenaUsuarioReputacaoCrescente44.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente45);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator47 = usuarioComparator46.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator48 = usuarioComparator43.thenComparing(usuarioComparator46);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator49 = usuarioComparator48.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator50 = usuarioComparator49.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator51 = usuarioComparator33.thenComparing(usuarioComparator50);
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertNotNull(usuarioComparator7);
        org.junit.Assert.assertNotNull(usuarioComparator8);
        org.junit.Assert.assertNotNull(usuarioComparator9);
        org.junit.Assert.assertNotNull(usuarioComparator12);
        org.junit.Assert.assertNotNull(usuarioComparator13);
        org.junit.Assert.assertNotNull(usuarioComparator14);
        org.junit.Assert.assertNotNull(usuarioComparator15);
        org.junit.Assert.assertNotNull(usuarioComparator18);
        org.junit.Assert.assertNotNull(usuarioComparator19);
        org.junit.Assert.assertNotNull(usuarioComparator22);
        org.junit.Assert.assertNotNull(usuarioComparator23);
        org.junit.Assert.assertNotNull(usuarioComparator24);
        org.junit.Assert.assertNotNull(usuarioComparator25);
        org.junit.Assert.assertNotNull(usuarioComparator28);
        org.junit.Assert.assertNotNull(usuarioComparator29);
        org.junit.Assert.assertNotNull(usuarioComparator30);
        org.junit.Assert.assertNotNull(usuarioComparator31);
        org.junit.Assert.assertNotNull(usuarioComparator32);
        org.junit.Assert.assertNotNull(usuarioComparator33);
        org.junit.Assert.assertNotNull(usuarioComparator36);
        org.junit.Assert.assertNotNull(usuarioComparator37);
        org.junit.Assert.assertNotNull(usuarioComparator40);
        org.junit.Assert.assertNotNull(usuarioComparator41);
        org.junit.Assert.assertNotNull(usuarioComparator42);
        org.junit.Assert.assertNotNull(usuarioComparator43);
        org.junit.Assert.assertNotNull(usuarioComparator46);
        org.junit.Assert.assertNotNull(usuarioComparator47);
        org.junit.Assert.assertNotNull(usuarioComparator48);
        org.junit.Assert.assertNotNull(usuarioComparator49);
        org.junit.Assert.assertNotNull(usuarioComparator50);
        org.junit.Assert.assertNotNull(usuarioComparator51);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("QUATORZE_ANOS", "hi!");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente3 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator5 = ordenaUsuarioReputacaoCrescente3.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente4);
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico11 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean12 = usuario9.equals((java.lang.Object) plataformaJogoEletronico11);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        int int18 = ordenaUsuarioReputacaoCrescente3.compare(usuario9, usuario16);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente19 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario23 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str24 = usuario23.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int29 = ordenaUsuarioReputacaoCrescente19.compare(usuario23, usuario28);
        lp2.projetofinal.entidades.Usuario usuario33 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str34 = usuario33.getTelefone();
        java.lang.String str35 = usuario33.getNome();
        lp2.projetofinal.entidades.Item item36 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo39 = new lp2.projetofinal.entidades.Emprestimo(usuario28, usuario33, item36, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario40 = emprestimo39.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro41 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario40.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro41);
        java.lang.String str43 = cartaoCaloteiro41.getNomeCartao();
        boolean boolean44 = cartaoCaloteiro41.permisaoPegarEmprestado();
        usuario16.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro41);
        lp2.projetofinal.entidades.Usuario usuario49 = new lp2.projetofinal.entidades.Usuario("MUSICAL", "Lista de usuarios com reputacao negativa: ", "OUTRO");
        lp2.projetofinal.entidades.Emprestimo emprestimo51 = new lp2.projetofinal.entidades.Emprestimo(usuario16, usuario49, "Caloteiro");
        usuario16.atualizaReputacao((double) ' ', false);
        boolean boolean55 = chaveNomeTelefone2.equals((java.lang.Object) usuario16);
        org.junit.Assert.assertNotNull(usuarioComparator5);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico11 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico11.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Caloteiro" + "'", str43, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("DEZOITO_ANOS", 52.0d, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.inicializar();
        java.lang.String str14 = sistema3.listarItensNaoEmprestados();
        java.lang.String str15 = sistema3.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.atualizarItem("DOZE_ANOS", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "1: COMPLETO - Reputacao: 0,00|", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "PS3", "OUTRO", "DEZOITO_ANOS", "Caloteiro, Nao emprestado, ", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        java.lang.String str9 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.listarEmprestimosUsuarioEmprestando("XBOX360", "COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        boolean boolean1 = cartaoCaloteiro0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Nenhum item pego emprestado", "Caloteiro, Nao emprestado, ", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str3 = chaveNomeTelefone2.getNome();
        java.lang.String str4 = chaveNomeTelefone2.getTelefone();
        java.lang.String str5 = chaveNomeTelefone2.getNome();
        java.lang.String str6 = chaveNomeTelefone2.getTelefone();
        lp2.projetofinal.controllers.Sistema sistema7 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str8 = sistema7.listarItensEmprestados();
        java.lang.String str9 = sistema7.listarTop10MelhoresUsuarios();
        java.lang.String str10 = sistema7.listarTop10PioresUsuarios();
        boolean boolean11 = chaveNomeTelefone2.equals((java.lang.Object) sistema7);
        // The following exception was thrown during execution in test generation
        try {
            sistema7.cadastrarBluRayShow("hi!", "", "COM PECAS PERDIDAS", 52.0d, (-4), 5, "ROMANCE", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str3, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str5, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str6, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        facade0.fecharSistema();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.listarEmprestimosUsuarioEmprestando("Nenhum emprestimos associados ao item", "1:  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str16 = usuario15.getTelefone();
        java.lang.String str17 = usuario15.getNome();
        lp2.projetofinal.entidades.Item item18 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo21 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario15, item18, "OUTRO", 100);
        usuario15.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente25 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario29 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str30 = usuario29.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario34 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int35 = ordenaUsuarioReputacaoCrescente25.compare(usuario29, usuario34);
        lp2.projetofinal.entidades.Usuario usuario39 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str40 = usuario39.getTelefone();
        java.lang.String str41 = usuario39.getNome();
        lp2.projetofinal.entidades.Item item42 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo45 = new lp2.projetofinal.entidades.Emprestimo(usuario34, usuario39, item42, "OUTRO", 100);
        usuario39.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.entidades.BluRayShow bluRayShow55 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str56 = bluRayShow55.getNomeArtista();
        controllerEmprestimos0.registrarEmprestimo(usuario15, usuario39, (lp2.projetofinal.entidades.Item) bluRayShow55, "Caloteiro", (int) (byte) 100);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario60 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario60.salvarMapaUsuarios();
        java.lang.String str62 = controllerUsuario60.listarTop10MelhoresUsuarios();
        controllerUsuario60.carregaMapaUsuarios();
        java.lang.String str64 = controllerUsuario60.listarTop10PioresUsuarios();
        boolean boolean65 = usuario39.equals((java.lang.Object) controllerUsuario60);
        java.lang.String str66 = controllerUsuario60.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario60.atualizaReputacao("XBOX360", "Caloteiro, Nenhum emprestimos associados ao item, ", (double) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str56, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario7 = controllerUsuario0.identificaUsuario("MUSICAL", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("DEZOITO_ANOS");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("Caloteiro", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "1:  - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "BomAmigo", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Caloteiro, MUSICAL, ", "OUTRO");
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico8 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean9 = usuario6.equals((java.lang.Object) plataformaJogoEletronico8);
        usuario6.setEmail("Nenhum emprestimos associados ao item");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente12 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario21 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int22 = ordenaUsuarioReputacaoCrescente12.compare(usuario16, usuario21);
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        java.lang.String str28 = usuario26.getNome();
        lp2.projetofinal.entidades.Item item29 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo32 = new lp2.projetofinal.entidades.Emprestimo(usuario21, usuario26, item29, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario33 = emprestimo32.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro34 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario33.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro34);
        java.lang.String str36 = cartaoCaloteiro34.getNomeCartao();
        int int37 = cartaoCaloteiro34.prazoEmprestimo();
        usuario6.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro34);
        boolean boolean39 = cartaoCaloteiro34.permisaoPegarEmprestado();
        boolean boolean40 = chaveNomeTelefone2.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Caloteiro" + "'", str28, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro" + "'", str36, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Item item21 = emprestimo20.getItem();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(5);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "NINTENDO 3DS", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean1 = cartaoBomAmigo0.permisaoPegarEmprestado();
        boolean boolean2 = cartaoBomAmigo0.permisaoPegarEmprestado();
        boolean boolean3 = cartaoBomAmigo0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, MUSICAL, ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("Caloteiro", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "1: ROMANCE - Reputacao: 0,00|", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("Nao emprestado", "AVENTURA", (double) 4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "LIVRE", "FreeRyder", (double) 1.0f, "1: OUTRO - Reputacao: 0,00|", (-4), "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "AVENTURA", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente2 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str7 = usuario6.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int12 = ordenaUsuarioReputacaoCrescente2.compare(usuario6, usuario11);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        java.lang.String str18 = usuario16.getNome();
        lp2.projetofinal.entidades.Item item19 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo22 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario16, item19, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente23 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int33 = ordenaUsuarioReputacaoCrescente23.compare(usuario27, usuario32);
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        java.lang.String str39 = usuario37.getNome();
        lp2.projetofinal.entidades.Item item40 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario32, usuario37, item40, "OUTRO", 100);
        usuario37.atualizaReputacao((double) (short) -1, false);
        int int47 = ordenaUsuarioReputacaoCrescente1.compare(usuario11, usuario37);
        java.lang.String str48 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        java.lang.String str49 = usuario11.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Nenhum item pego emprestado" + "'", str48, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Caloteiro, OUTRO, " + "'", str49, "Caloteiro, OUTRO, ");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.atualizar("Lista de usuarios com reputacao negativa: ", "Caloteiro");
        java.lang.String str17 = bluRayShow6.getInfo("Noob");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Caloteiro" + "'", str12, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) (-1));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Nenhum item pego emprestado");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "QUATORZE_ANOS", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.getInfoItem("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Caloteiro", "MUSICAL", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        int int10 = bluRaySerie7.duracaoTotal();
        java.lang.String str11 = bluRaySerie7.getGenero();
        int int12 = bluRaySerie7.getDuracao();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-11) + "'", int10 == (-11));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OUTRO" + "'", str11, "OUTRO");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoItem("Caloteiro, Nenhum emprestimos associados ao item, ", "ROMANCE", "Nao emprestado", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        usuario9.setEmail("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente23 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int33 = ordenaUsuarioReputacaoCrescente23.compare(usuario27, usuario32);
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        java.lang.String str39 = usuario37.getNome();
        lp2.projetofinal.entidades.Item item40 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario32, usuario37, item40, "OUTRO", 100);
        java.lang.String str44 = usuario37.getNome();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie52 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str53 = bluRaySerie52.getEstado();
        java.lang.String str54 = bluRaySerie52.getGenero();
        java.lang.String str55 = bluRaySerie52.getEstado();
        lp2.projetofinal.entidades.Emprestimo emprestimo58 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario37, (lp2.projetofinal.entidades.Item) bluRaySerie52, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (-1));
        usuario9.atualizaReputacao((double) (short) 10, false);
        lp2.projetofinal.entidades.Usuario usuario65 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico67 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean68 = usuario65.equals((java.lang.Object) plataformaJogoEletronico67);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente69 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario73 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str74 = usuario73.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario78 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int79 = ordenaUsuarioReputacaoCrescente69.compare(usuario73, usuario78);
        lp2.projetofinal.entidades.Usuario usuario83 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str84 = usuario83.getTelefone();
        java.lang.String str85 = usuario83.getNome();
        lp2.projetofinal.entidades.Item item86 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo89 = new lp2.projetofinal.entidades.Emprestimo(usuario78, usuario83, item86, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario90 = emprestimo89.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario91 = emprestimo89.getUsuarioRequerente();
        usuario91.setEmail("Nao emprestado");
        int int94 = usuario65.compareTo(usuario91);
        lp2.projetofinal.entidades.Emprestimo emprestimo96 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario91, "Caloteiro, MUSICAL, ");
        lp2.projetofinal.entidades.Item item97 = emprestimo96.getItem();
        lp2.projetofinal.entidades.Item item98 = emprestimo96.getItem();
        lp2.projetofinal.entidades.Usuario usuario99 = emprestimo96.getUsuarioRequerente();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Nao emprestado" + "'", str53, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ROMANCE" + "'", str54, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Nao emprestado" + "'", str55, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico67 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico67.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Caloteiro" + "'", str85, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario90);
        org.junit.Assert.assertNotNull(usuario91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNull(item97);
        org.junit.Assert.assertNull(item98);
        org.junit.Assert.assertNotNull(usuario99);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("Noob", 1.0d, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "OUTRO", (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str4 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("POLICIAL", "AVENTURA", "DEZ_ANOS", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("AVENTURA");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        sistema0.cadastrarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "MUSICAL", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("1: OUTRO - Reputacao: 0,00|", "", "FreeRyder", "DEZESSEIS_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        int int22 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie24 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean25 = emprestimo20.equals((java.lang.Object) episodioSerie24);
        int int26 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario27 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente28 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str33 = usuario32.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int38 = ordenaUsuarioReputacaoCrescente28.compare(usuario32, usuario37);
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str43 = usuario42.getTelefone();
        java.lang.String str44 = usuario42.getNome();
        lp2.projetofinal.entidades.Item item45 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo48 = new lp2.projetofinal.entidades.Emprestimo(usuario37, usuario42, item45, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario49 = emprestimo48.getDonoDoItem();
        int int50 = emprestimo48.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie52 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean53 = emprestimo48.equals((java.lang.Object) episodioSerie52);
        int int54 = emprestimo48.getNumeroDias();
        boolean boolean55 = emprestimo20.equals((java.lang.Object) emprestimo48);
        lp2.projetofinal.entidades.Item item56 = emprestimo48.getItem();
        int int57 = emprestimo48.getNumeroDias();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(usuario27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNomeArtista();
        bluRayShow6.atualizar("AVENTURA", "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        java.lang.String str12 = bluRaySerie7.getGenero();
        java.lang.String str14 = bluRaySerie7.getInfo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OUTRO" + "'", str12, "OUTRO");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario17 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str18 = controllerUsuario17.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet19 = controllerUsuario17.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet19, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.controllers.ControllerItens controllerItens24 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray25 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet26 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet26, itemArray25);
        controllerItens24.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet26, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario31 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str32 = controllerUsuario31.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet33 = controllerUsuario31.todosUsuariosItens();
        controllerItens24.adicionaItem(itemSet33, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens41 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray42 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet43 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet43, itemArray42);
        controllerItens41.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet43, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario48 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str49 = controllerUsuario48.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet50 = controllerUsuario48.todosUsuariosItens();
        controllerItens41.adicionaItem(itemSet50, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario58 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str59 = controllerUsuario58.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet60 = controllerUsuario58.todosUsuariosItens();
        controllerItens41.adicionaItem(itemSet60, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str65 = controllerItens24.listarItensNaoEmprestados(itemSet60);
        controllerItens0.adicionaItem(itemSet60, "DOZE_ANOS", (double) (byte) 100);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = controllerItens0.getInfoItem(itemSet69, "QUATORZE_ANOS", "1: COMPLETO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(itemSet19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(itemSet33);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(itemSet60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str65, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        facade0.fecharSistema();
        facade0.fecharSistema();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.inicializar();
        java.lang.String str14 = sistema3.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.adicionarPecaPerdida("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Noob", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str14, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarEmprestimosItem("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("DOZE_ANOS", "Caloteiro", "hi!", "1: COMPLETO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        int int12 = bluRaySerie7.getDuracao();
        java.lang.String str13 = bluRaySerie7.getEstado();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie21 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        java.lang.String str23 = bluRaySerie21.getInfo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        java.lang.String str25 = bluRaySerie21.getInfo("1: OUTRO - Reputacao: 0,00|");
        boolean boolean26 = bluRaySerie7.equals((java.lang.Object) bluRaySerie21);
        java.lang.String str27 = bluRaySerie21.getDescricao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Nao emprestado" + "'", str13, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Noob" + "'", str27, "Noob");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("DOZE_ANOS", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "MUSICAL", (double) 'a', (int) '4', "PC", "Nenhum emprestimos associados ao item", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.finalizar();
        java.lang.String str15 = sistema3.listarEmprestimosItem("Nao emprestado");
        java.lang.String str16 = sistema3.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.cadastrarBluRaySerie("", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "Caloteiro, OUTRO, ", (double) 100L, "Nenhum emprestimos associados ao item", (-4), "Caloteiro, MUSICAL, ", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str16, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "BomAmigo", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("", "", "OUTRO");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet5 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("COM PECAS PERDIDAS", "DOZE_ANOS", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemSet5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("QUATORZE_ANOS", "hi!", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "1: ROMANCE - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie(35);
        java.lang.Class<?> wildcardClass2 = episodioSerie1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str9 = bluRaySerie7.getInfo("Nao emprestado");
        java.lang.String str10 = bluRaySerie7.getGenero();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ROMANCE" + "'", str10, "ROMANCE");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facade0.getInfoItem("Caloteiro, OUTRO, ", "Lista de usuarios com reputacao negativa: ", "1:  - Reputacao: 0,00|", "DEZ_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str16 = usuario15.getTelefone();
        java.lang.String str17 = usuario15.getNome();
        lp2.projetofinal.entidades.Item item18 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo21 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario15, item18, "OUTRO", 100);
        usuario15.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente25 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario29 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str30 = usuario29.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario34 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int35 = ordenaUsuarioReputacaoCrescente25.compare(usuario29, usuario34);
        lp2.projetofinal.entidades.Usuario usuario39 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str40 = usuario39.getTelefone();
        java.lang.String str41 = usuario39.getNome();
        lp2.projetofinal.entidades.Item item42 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo45 = new lp2.projetofinal.entidades.Emprestimo(usuario34, usuario39, item42, "OUTRO", 100);
        usuario39.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.entidades.BluRayShow bluRayShow55 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str56 = bluRayShow55.getNomeArtista();
        controllerEmprestimos0.registrarEmprestimo(usuario15, usuario39, (lp2.projetofinal.entidades.Item) bluRayShow55, "Caloteiro", (int) (byte) 100);
        usuario39.atualizaReputacao((double) 10L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str56, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("1: ROMANCE - Reputacao: 0,00|", "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str16 = usuario15.getTelefone();
        java.lang.String str17 = usuario15.getNome();
        lp2.projetofinal.entidades.Item item18 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo21 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario15, item18, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente22 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int32 = ordenaUsuarioReputacaoCrescente22.compare(usuario26, usuario31);
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        java.lang.String str38 = usuario36.getNome();
        lp2.projetofinal.entidades.Item item39 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo42 = new lp2.projetofinal.entidades.Emprestimo(usuario31, usuario36, item39, "OUTRO", 100);
        usuario36.atualizaReputacao((double) (short) -1, false);
        int int46 = ordenaUsuarioReputacaoCrescente0.compare(usuario10, usuario36);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente47 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario51 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str52 = usuario51.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario56 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int57 = ordenaUsuarioReputacaoCrescente47.compare(usuario51, usuario56);
        usuario56.setTelefone("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente60 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str65 = usuario64.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int70 = ordenaUsuarioReputacaoCrescente60.compare(usuario64, usuario69);
        lp2.projetofinal.entidades.Usuario usuario74 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str75 = usuario74.getTelefone();
        java.lang.String str76 = usuario74.getNome();
        lp2.projetofinal.entidades.Item item77 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario69, usuario74, item77, "OUTRO", 100);
        usuario74.atualizaReputacao((double) (-1), true);
        int int84 = ordenaUsuarioReputacaoCrescente0.compare(usuario56, usuario74);
        java.lang.String str85 = usuario56.getEmail();
        java.lang.String str86 = usuario56.getEmail();
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade87 = usuario56.getCartao();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Caloteiro" + "'", str76, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "OUTRO" + "'", str85, "OUTRO");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "OUTRO" + "'", str86, "OUTRO");
        org.junit.Assert.assertNotNull(cartaoFidelidade87);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("Emprestado");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.finalizar();
        java.lang.String str15 = sistema3.listarEmprestimosItem("Nao emprestado");
        sistema3.inicializar();
        java.lang.String str17 = sistema3.listarItensNaoEmprestados();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        java.lang.String str3 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("DEZ_ANOS", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        bluRaySerie7.itemEmprestado();
        int int11 = bluRaySerie7.getNumeroTemporada();
        int int12 = bluRaySerie7.duracaoTotal();
        java.lang.String str14 = bluRaySerie7.getInfo("OUTRO");
        int int15 = bluRaySerie7.getNumeroTemporada();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("Caloteiro, MUSICAL, ", "Caloteiro, Nao emprestado, ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "DEZOITO_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.getInfoItem("1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "", "LIVRE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        java.lang.String str21 = usuario14.getNome();
        java.lang.String str22 = usuario14.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet23 = usuario14.retornaSeusItens();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        usuario27.setTelefone("FreeRyder");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico33 = new lp2.projetofinal.entidades.JogoEletronico("DOZE_ANOS", (double) (short) 10, "OUTRO");
        java.lang.String str34 = jogoEletronico33.getPlataforma();
        lp2.projetofinal.entidades.Emprestimo emprestimo37 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario27, (lp2.projetofinal.entidades.Item) jogoEletronico33, "COMPLETO", (int) (short) 10);
        java.lang.String str38 = usuario27.getEmail();
        usuario27.atualizaReputacao((-1.0d), true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Caloteiro" + "'", str21, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Caloteiro, OUTRO, " + "'", str22, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet23);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "OUTRO" + "'", str34, "OUTRO");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "MUSICAL" + "'", str38, "MUSICAL");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarUsuario("", "Caloteiro", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        java.lang.String str12 = facade0.listarTop10Itens();
        facade0.fecharSistema();
        java.lang.String str14 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarUsuario("Caloteiro", "1: OUTRO - Reputacao: 0,00|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str14, "1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Descricao nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarCaloteiros();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "1: Caloteiro - Reputacao: 0,00|", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("XBOX360", "1: COMPLETO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarCaloteiros();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "hi!", "DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        bluRaySerie7.itemDevolvido();
        java.lang.String str12 = bluRaySerie7.getDescricao();
        int int13 = bluRaySerie7.getNumeroEmprestimos();
        int int14 = bluRaySerie7.duracaoTotal();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str12, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("DOZE_ANOS", "DEZ_ANOS", "DOCUMENTARIO", (double) 0.0f, (int) (short) 10, (int) (byte) 10, "XBOX360", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "Lista de usuarios com reputacao negativa: ", "1: ROMANCE - Reputacao: 0,00|", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("MUSICAL", "Lista de usuarios com reputacao negativa: ", "OUTRO");
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade4 = null;
        usuario3.setCartao(cartaoFidelidade4);
        usuario3.setNome("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        java.lang.String str9 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sistema0.getInfoItem("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "LIVRE", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        sistema0.cadastrarUsuario("PS3", "Caloteiro, OUTRO, ", "1: ROMANCE - Reputacao: 0,00|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("XBOX360");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "AVENTURA", "LIVRE", (double) (byte) 100, "1: ROMANCE - Reputacao: 0,00|", 7, "", "DEZESSEIS_ANOS", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Classificacao nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        java.lang.String str9 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str10 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("Caloteiro, Nenhum emprestimos associados ao item, ", "PC", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str9, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico8 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean9 = usuario6.equals((java.lang.Object) plataformaJogoEletronico8);
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str14 = usuario13.getTelefone();
        int int15 = ordenaUsuarioReputacaoCrescente0.compare(usuario6, usuario13);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente16 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario20 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str21 = usuario20.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario25 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int26 = ordenaUsuarioReputacaoCrescente16.compare(usuario20, usuario25);
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str31 = usuario30.getTelefone();
        java.lang.String str32 = usuario30.getNome();
        lp2.projetofinal.entidades.Item item33 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo36 = new lp2.projetofinal.entidades.Emprestimo(usuario25, usuario30, item33, "OUTRO", 100);
        usuario25.setNome("Caloteiro, Nao emprestado, ");
        double double39 = usuario25.getReputacao();
        int int40 = usuario13.compareTo(usuario25);
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-18) + "'", int40 == (-18));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "DEZESSEIS_ANOS", "Caloteiro", (double) 100.0f, 5, "Nao emprestado", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", (-15));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        usuario9.setEmail("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente23 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int33 = ordenaUsuarioReputacaoCrescente23.compare(usuario27, usuario32);
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        java.lang.String str39 = usuario37.getNome();
        lp2.projetofinal.entidades.Item item40 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario32, usuario37, item40, "OUTRO", 100);
        java.lang.String str44 = usuario37.getNome();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie52 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str53 = bluRaySerie52.getEstado();
        java.lang.String str54 = bluRaySerie52.getGenero();
        java.lang.String str55 = bluRaySerie52.getEstado();
        lp2.projetofinal.entidades.Emprestimo emprestimo58 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario37, (lp2.projetofinal.entidades.Item) bluRaySerie52, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (-1));
        usuario9.atualizaReputacao((double) (short) 10, false);
        lp2.projetofinal.entidades.Usuario usuario65 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico67 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean68 = usuario65.equals((java.lang.Object) plataformaJogoEletronico67);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente69 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario73 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str74 = usuario73.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario78 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int79 = ordenaUsuarioReputacaoCrescente69.compare(usuario73, usuario78);
        lp2.projetofinal.entidades.Usuario usuario83 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str84 = usuario83.getTelefone();
        java.lang.String str85 = usuario83.getNome();
        lp2.projetofinal.entidades.Item item86 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo89 = new lp2.projetofinal.entidades.Emprestimo(usuario78, usuario83, item86, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario90 = emprestimo89.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario91 = emprestimo89.getUsuarioRequerente();
        usuario91.setEmail("Nao emprestado");
        int int94 = usuario65.compareTo(usuario91);
        lp2.projetofinal.entidades.Emprestimo emprestimo96 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario91, "Caloteiro, MUSICAL, ");
        emprestimo96.setDataDevolucao("1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Nao emprestado" + "'", str53, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ROMANCE" + "'", str54, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Nao emprestado" + "'", str55, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico67 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico67.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Caloteiro" + "'", str85, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario90);
        org.junit.Assert.assertNotNull(usuario91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("MUSICAL");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.lang.String str6 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("1: ROMANCE - Reputacao: 0,00|", "Caloteiro", "LIVRE", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("DEZESSEIS_ANOS", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "DEZESSEIS_ANOS", "XBOX360", "QUATORZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = usuarioComparator2.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = ordenaUsuarioReputacaoCrescente4.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente5);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator7 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator8 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator9 = usuarioComparator2.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente4);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente10 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator12 = ordenaUsuarioReputacaoCrescente10.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente11);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente13 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente14 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator15 = ordenaUsuarioReputacaoCrescente13.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente14);
        lp2.projetofinal.entidades.Usuario usuario19 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico21 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean22 = usuario19.equals((java.lang.Object) plataformaJogoEletronico21);
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        int int28 = ordenaUsuarioReputacaoCrescente13.compare(usuario19, usuario26);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator29 = ordenaUsuarioReputacaoCrescente10.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente13);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator30 = usuarioComparator9.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente10);
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertNotNull(usuarioComparator7);
        org.junit.Assert.assertNotNull(usuarioComparator8);
        org.junit.Assert.assertNotNull(usuarioComparator9);
        org.junit.Assert.assertNotNull(usuarioComparator12);
        org.junit.Assert.assertNotNull(usuarioComparator15);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico21 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico21.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator29);
        org.junit.Assert.assertNotNull(usuarioComparator30);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente9 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente10 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator11 = ordenaUsuarioReputacaoCrescente9.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente10);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator12 = ordenaUsuarioReputacaoCrescente7.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente9);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "Caloteiro");
        usuario16.setTelefone("Noob");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente19 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario23 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str24 = usuario23.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int29 = ordenaUsuarioReputacaoCrescente19.compare(usuario23, usuario28);
        lp2.projetofinal.entidades.Usuario usuario33 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str34 = usuario33.getTelefone();
        java.lang.String str35 = usuario33.getNome();
        lp2.projetofinal.entidades.Item item36 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo39 = new lp2.projetofinal.entidades.Emprestimo(usuario28, usuario33, item36, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario43 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str44 = usuario43.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo46 = new lp2.projetofinal.entidades.Emprestimo(usuario33, usuario43, "1: OUTRO - Reputacao: 0,00|");
        int int47 = ordenaUsuarioReputacaoCrescente9.compare(usuario16, usuario33);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente48 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente49 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator50 = ordenaUsuarioReputacaoCrescente48.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente49);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator51 = ordenaUsuarioReputacaoCrescente48.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator52 = ordenaUsuarioReputacaoCrescente48.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator53 = ordenaUsuarioReputacaoCrescente9.thenComparing(usuarioComparator52);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator54 = usuarioComparator52.reversed();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(usuarioComparator11);
        org.junit.Assert.assertNotNull(usuarioComparator12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator50);
        org.junit.Assert.assertNotNull(usuarioComparator51);
        org.junit.Assert.assertNotNull(usuarioComparator52);
        org.junit.Assert.assertNotNull(usuarioComparator53);
        org.junit.Assert.assertNotNull(usuarioComparator54);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "MUSICAL");
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade4 = usuario3.getCartao();
        java.lang.String str5 = cartaoFidelidade4.getNomeCartao();
        org.junit.Assert.assertNotNull(cartaoFidelidade4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FreeRyder" + "'", str5, "FreeRyder");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        sistema0.cadastrarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DOZE_ANOS", "Caloteiro, Nao emprestado, ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.facade.Facade facade5 = new lp2.projetofinal.facade.Facade();
        facade5.fecharSistema();
        java.lang.String str8 = facade5.listarEmprestimosItem("OUTRO");
        facade5.resetarPersistencia();
        java.lang.String str10 = facade5.listarTop10Itens();
        boolean boolean11 = jogoEletronico3.equals((java.lang.Object) facade5);
        java.lang.String str12 = jogoEletronico3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO" + "'", str12, "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente3 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario7 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str8 = usuario7.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int13 = ordenaUsuarioReputacaoCrescente3.compare(usuario7, usuario12);
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str18 = usuario17.getTelefone();
        java.lang.String str19 = usuario17.getNome();
        lp2.projetofinal.entidades.Item item20 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario12, usuario17, item20, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo23.getDonoDoItem();
        int int25 = emprestimo23.getNumeroDias();
        lp2.projetofinal.entidades.Item item26 = emprestimo23.getItem();
        java.lang.Object obj27 = null;
        boolean boolean28 = emprestimo23.equals(obj27);
        boolean boolean29 = chaveNomeTelefone2.equals((java.lang.Object) emprestimo23);
        emprestimo23.setDataDevolucao("Caloteiro, Nenhum emprestimos associados ao item, ");
        emprestimo23.setDataDevolucao("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente34 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario38 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str39 = usuario38.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario43 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int44 = ordenaUsuarioReputacaoCrescente34.compare(usuario38, usuario43);
        lp2.projetofinal.entidades.Usuario usuario48 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str49 = usuario48.getTelefone();
        java.lang.String str50 = usuario48.getNome();
        lp2.projetofinal.entidades.Item item51 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo54 = new lp2.projetofinal.entidades.Emprestimo(usuario43, usuario48, item51, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str59 = usuario58.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo61 = new lp2.projetofinal.entidades.Emprestimo(usuario48, usuario58, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente62 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario66 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str67 = usuario66.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario71 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int72 = ordenaUsuarioReputacaoCrescente62.compare(usuario66, usuario71);
        lp2.projetofinal.entidades.Usuario usuario76 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str77 = usuario76.getTelefone();
        java.lang.String str78 = usuario76.getNome();
        lp2.projetofinal.entidades.Item item79 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo82 = new lp2.projetofinal.entidades.Emprestimo(usuario71, usuario76, item79, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario83 = emprestimo82.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario84 = emprestimo82.getUsuarioRequerente();
        int int85 = usuario48.compareTo(usuario84);
        boolean boolean86 = emprestimo23.equals((java.lang.Object) usuario48);
        double double87 = usuario48.getReputacao();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro88 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str89 = cartaoCaloteiro88.getNomeCartao();
        java.lang.String str90 = cartaoCaloteiro88.getNomeCartao();
        usuario48.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro88);
        int int92 = cartaoCaloteiro88.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Caloteiro" + "'", str50, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Caloteiro" + "'", str78, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario83);
        org.junit.Assert.assertNotNull(usuario84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Caloteiro" + "'", str89, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Caloteiro" + "'", str90, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet5 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "OUTRO", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(itemSet5);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        java.lang.String str3 = cartaoCaloteiro0.getNomeCartao();
        java.lang.String str4 = cartaoCaloteiro0.getNomeCartao();
        java.lang.String str5 = cartaoCaloteiro0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Caloteiro" + "'", str3, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Caloteiro" + "'", str4, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Caloteiro" + "'", str5, "Caloteiro");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("DOCUMENTARIO", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", (double) 5, 5, "COMPLETO", "DEZOITO_ANOS", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("OUTRO", "1: COMPLETO - Reputacao: 0,00|", "LIVRE", (double) 14, "DOCUMENTARIO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario0.todosUsuariosItens();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(itemSet9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(14);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "ROMANCE", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
        facade0.cadastrarUsuario("1: Caloteiro - Reputacao: 0,00|", "QUATORZE_ANOS", "Caloteiro, MUSICAL, ");
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("NINTENDO 3DS", "1: Caloteiro - Reputacao: 0,00|", "PC", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "1: COMPLETO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("BomAmigo");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("AVENTURA");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str5 = facade0.listarEmprestimosItem("DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str5, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("Nenhum item pego emprestado", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "OUTRO", "POLICIAL", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "DEZOITO_ANOS", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens7 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray8 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet9 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet9, itemArray8);
        controllerItens7.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet9, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario14 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str15 = controllerUsuario14.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet16 = controllerUsuario14.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet16, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens0.adicionaItem(itemSet16, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerItens controllerItens32 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray33 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet34 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet34, itemArray33);
        controllerItens32.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet34, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario39 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str40 = controllerUsuario39.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet41 = controllerUsuario39.todosUsuariosItens();
        java.lang.String str42 = controllerItens32.listarTop10Itens(itemSet41);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario43 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str44 = controllerUsuario43.listarTop10PioresUsuarios();
        java.lang.String str45 = controllerUsuario43.listarTop10PioresUsuarios();
        java.lang.String str46 = controllerUsuario43.listarCaloteiros();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet47 = controllerUsuario43.todosUsuariosItens();
        controllerItens32.adicionaItem(itemSet47, "ROMANCE", (double) (-37), "");
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet47, "ROMANCE", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: lp2.projetofinal.entidades.JogoEletronico cannot be cast to lp2.projetofinal.entidades.JogoTabuleiro");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str46, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertNotNull(itemSet47);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        bluRaySerie8.itemDevolvido();
        bluRaySerie8.itemEmprestado();
        java.lang.String str36 = bluRaySerie8.getDescricao();
        bluRaySerie8.adicionarBluRay((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str36, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("1: OUTRO - Reputacao: 0,00|", "DOZE_ANOS", "Noob", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente2 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str7 = usuario6.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int12 = ordenaUsuarioReputacaoCrescente2.compare(usuario6, usuario11);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        java.lang.String str18 = usuario16.getNome();
        lp2.projetofinal.entidades.Item item19 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo22 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario16, item19, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente23 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int33 = ordenaUsuarioReputacaoCrescente23.compare(usuario27, usuario32);
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        java.lang.String str39 = usuario37.getNome();
        lp2.projetofinal.entidades.Item item40 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario32, usuario37, item40, "OUTRO", 100);
        usuario37.atualizaReputacao((double) (short) -1, false);
        int int47 = ordenaUsuarioReputacaoCrescente1.compare(usuario11, usuario37);
        java.lang.String str48 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        controllerEmprestimos0.salvarListaEmprestimos();
        java.lang.String str50 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str52 = controllerEmprestimos0.listarEmprestimosItens("PC");
        controllerEmprestimos0.carregaListaEmprestimos();
        java.lang.String str54 = controllerEmprestimos0.listarItensEmprestados();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Nenhum item pego emprestado" + "'", str48, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str52, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str9 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str10 = facade0.listarCaloteiros();
        facade0.iniciarSistema();
        java.lang.String str12 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("Emprestado", "Caloteiro, OUTRO, ", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str10, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str12, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens17 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray18 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet19 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet19, itemArray18);
        controllerItens17.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "Caloteiro", (-1.0d));
        java.lang.String str24 = controllerItens0.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet25 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet25, "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str24, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        java.lang.String str3 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.getInfoUsuario("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        jogoTabuleiro2.adicionarPecaPerdida("Caloteiro, Nao emprestado, ");
        jogoTabuleiro2.setPreco(0.0d);
        java.lang.String str7 = jogoTabuleiro2.contemPecasPerdidas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COM PECAS PERDIDAS" + "'", str7, "COM PECAS PERDIDAS");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        java.lang.String str6 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: Caloteiro - Reputacao: 0,00|" + "'", str6, "1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facade0.listarEmprestimosUsuarioEmprestando("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente3 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario7 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str8 = usuario7.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int13 = ordenaUsuarioReputacaoCrescente3.compare(usuario7, usuario12);
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str18 = usuario17.getTelefone();
        java.lang.String str19 = usuario17.getNome();
        lp2.projetofinal.entidades.Item item20 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario12, usuario17, item20, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo23.getDonoDoItem();
        int int25 = emprestimo23.getNumeroDias();
        lp2.projetofinal.entidades.Item item26 = emprestimo23.getItem();
        java.lang.Object obj27 = null;
        boolean boolean28 = emprestimo23.equals(obj27);
        boolean boolean29 = chaveNomeTelefone2.equals((java.lang.Object) emprestimo23);
        emprestimo23.setDataDevolucao("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        lp2.projetofinal.entidades.Item item32 = emprestimo23.getItem();
        lp2.projetofinal.entidades.Usuario usuario33 = emprestimo23.getDonoDoItem();
        lp2.projetofinal.entidades.Item item34 = emprestimo23.getItem();
        lp2.projetofinal.entidades.Item item35 = emprestimo23.getItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(usuario33);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str5 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        java.lang.String str10 = controllerItens0.listarTop10Itens(itemSet9);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario11 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str12 = controllerUsuario11.listarTop10PioresUsuarios();
        java.lang.String str13 = controllerUsuario11.listarTop10PioresUsuarios();
        java.lang.String str14 = controllerUsuario11.listarCaloteiros();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet15 = controllerUsuario11.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet15, "ROMANCE", (double) (-37), "");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario20 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str21 = controllerUsuario20.listarTop10PioresUsuarios();
        java.lang.String str22 = controllerUsuario20.listarTop10PioresUsuarios();
        controllerUsuario20.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet24 = controllerUsuario20.todosUsuariosItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet25 = controllerUsuario20.todosUsuariosItens();
        java.lang.String str26 = controllerItens0.listarItensOrdenadosPorValor(itemSet25);
        lp2.projetofinal.controllers.ControllerItens controllerItens27 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario28 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str29 = controllerUsuario28.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet30 = controllerUsuario28.todosUsuariosItens();
        controllerItens27.adicionaItem(itemSet30, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens34 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray35 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet36 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet36, itemArray35);
        controllerItens34.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet36, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario41 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str42 = controllerUsuario41.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet43 = controllerUsuario41.todosUsuariosItens();
        controllerItens34.adicionaItem(itemSet43, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario51 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str52 = controllerUsuario51.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet53 = controllerUsuario51.todosUsuariosItens();
        controllerItens34.adicionaItem(itemSet53, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.controllers.ControllerItens controllerItens58 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray59 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet60 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet60, itemArray59);
        controllerItens58.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet60, "Caloteiro", (-1.0d));
        java.lang.String str65 = controllerItens34.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet60);
        java.lang.String str66 = controllerItens27.listarTop10Itens((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet60);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet60, "PS3", "POLICIAL", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str14, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertNotNull(itemSet15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(itemSet24);
        org.junit.Assert.assertNotNull(itemSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(itemSet30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(itemSet43);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(itemSet53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str65, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario8 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str9 = usuario8.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int14 = ordenaUsuarioReputacaoCrescente4.compare(usuario8, usuario13);
        lp2.projetofinal.entidades.Usuario usuario18 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str19 = usuario18.getTelefone();
        java.lang.String str20 = usuario18.getNome();
        lp2.projetofinal.entidades.Item item21 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo24 = new lp2.projetofinal.entidades.Emprestimo(usuario13, usuario18, item21, "OUTRO", 100);
        lp2.projetofinal.entidades.Emprestimo emprestimo26 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario13, "Nenhum item pego emprestado");
        usuario13.setEmail("Caloteiro");
        java.lang.Class<?> wildcardClass29 = usuario13.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "QUATORZE_ANOS", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Valor nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int12 = bluRaySerie7.getNumeroTemporada();
        int int13 = bluRaySerie7.getNumeroTemporada();
        bluRaySerie7.itemDevolvido();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ROMANCE" + "'", str8, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.getInfoItem("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "NINTENDO 3DS", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10Itens();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("FreeRyder", "1: COMPLETO - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str3 = chaveNomeTelefone2.getNome();
        java.lang.String str4 = chaveNomeTelefone2.getTelefone();
        java.lang.String str5 = chaveNomeTelefone2.getNome();
        java.lang.String str6 = chaveNomeTelefone2.getTelefone();
        lp2.projetofinal.controllers.Sistema sistema7 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str8 = sistema7.listarItensEmprestados();
        java.lang.String str9 = sistema7.listarTop10MelhoresUsuarios();
        java.lang.String str10 = sistema7.listarTop10PioresUsuarios();
        boolean boolean11 = chaveNomeTelefone2.equals((java.lang.Object) sistema7);
        // The following exception was thrown during execution in test generation
        try {
            sistema7.removerUsuario("Caloteiro, MUSICAL, ", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str3, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str5, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str6, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        java.lang.String str12 = bluRaySerie7.getGenero();
        lp2.projetofinal.controllers.ControllerItens controllerItens13 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens14 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario15 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str16 = controllerUsuario15.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario15.todosUsuariosItens();
        controllerItens14.adicionaItem(itemSet17, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens21 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray22 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet23 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet23, itemArray22);
        controllerItens21.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet23, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario28 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str29 = controllerUsuario28.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet30 = controllerUsuario28.todosUsuariosItens();
        controllerItens21.adicionaItem(itemSet30, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario38 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str39 = controllerUsuario38.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet40 = controllerUsuario38.todosUsuariosItens();
        controllerItens21.adicionaItem(itemSet40, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str47 = controllerItens14.getInfoItem(itemSet40, "Nao emprestado", "POLICIAL");
        java.lang.String str48 = controllerItens13.listarItensNaoEmprestados(itemSet40);
        lp2.projetofinal.controllers.ControllerItens controllerItens49 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray50 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet51 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet51, itemArray50);
        controllerItens49.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet51, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens56 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray57 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet58 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet58, itemArray57);
        controllerItens56.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet58, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario63 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str64 = controllerUsuario63.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet65 = controllerUsuario63.todosUsuariosItens();
        controllerItens56.adicionaItem(itemSet65, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens49.adicionaItem(itemSet65, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario81 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str82 = controllerUsuario81.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet83 = controllerUsuario81.todosUsuariosItens();
        java.lang.String str84 = controllerItens49.listarItensOrdenadosPorValor(itemSet83);
        java.lang.String str85 = controllerItens13.listarItensOrdenadosPorValor(itemSet83);
        boolean boolean86 = bluRaySerie7.equals((java.lang.Object) str85);
        bluRaySerie7.itemEmprestado();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OUTRO" + "'", str12, "OUTRO");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(itemSet17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(itemSet30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(itemSet40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str48, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(itemSet65);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(itemSet83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "MUSICAL");
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade4 = usuario3.getCartao();
        usuario3.setTelefone("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertNotNull(cartaoFidelidade4);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        java.lang.String str12 = facade0.listarTop10Itens();
        facade0.fecharSistema();
        java.lang.String str14 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str14, "1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("DEZ_ANOS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Caloteiro", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.adicionarBluRay((int) (byte) 0);
        int int12 = bluRaySerie7.getNumeroTemporada();
        java.lang.String str13 = bluRaySerie7.getGenero();
        java.lang.String str14 = bluRaySerie7.getGenero();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ROMANCE" + "'", str13, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ROMANCE" + "'", str14, "ROMANCE");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos22 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie30 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str32 = bluRaySerie30.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos33 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow40 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay41 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean42 = bluRayShow40.equals((java.lang.Object) classificacaoBluRay41);
        bluRayShow40.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow52 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str53 = bluRayShow52.getNome();
        int int54 = ordenaItemNumeroEmprestimos33.compare((lp2.projetofinal.entidades.Item) bluRayShow40, (lp2.projetofinal.entidades.Item) bluRayShow52);
        int int55 = ordenaItemNumeroEmprestimos22.compare((lp2.projetofinal.entidades.Item) bluRaySerie30, (lp2.projetofinal.entidades.Item) bluRayShow52);
        bluRaySerie30.itemDevolvido();
        bluRaySerie30.itemEmprestado();
        lp2.projetofinal.entidades.BluRayShow bluRayShow64 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente65 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean66 = bluRayShow64.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente65);
        int int67 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie30, (lp2.projetofinal.entidades.Item) bluRayShow64);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator68 = ordenaItemNumeroEmprestimos0.reversed();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro71 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str72 = jogoTabuleiro71.contemPecasPerdidas();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente73 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente74 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator75 = ordenaUsuarioReputacaoCrescente73.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente74);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator76 = ordenaUsuarioReputacaoCrescente73.reversed();
        boolean boolean77 = jogoTabuleiro71.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente73);
        lp2.projetofinal.entidades.BluRayShow bluRayShow84 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay85 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean86 = bluRayShow84.equals((java.lang.Object) classificacaoBluRay85);
        int int87 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro71, (lp2.projetofinal.entidades.Item) bluRayShow84);
        int int88 = bluRayShow84.getNumFaixas();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay8 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay8.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay41 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay41.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemComparator68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "COMPLETO" + "'", str72, "COMPLETO");
        org.junit.Assert.assertNotNull(usuarioComparator75);
        org.junit.Assert.assertNotNull(usuarioComparator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + classificacaoBluRay85 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay85.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str25 = usuario24.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo27 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario24, "1: OUTRO - Reputacao: 0,00|");
        double double28 = usuario14.getReputacao();
        usuario14.setEmail("MUSICAL");
        java.lang.String str31 = usuario14.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro, MUSICAL, " + "'", str31, "Caloteiro, MUSICAL, ");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "Caloteiro");
        usuario3.setTelefone("Noob");
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico11 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean12 = usuario9.equals((java.lang.Object) plataformaJogoEletronico11);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente13 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str18 = usuario17.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario22 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int23 = ordenaUsuarioReputacaoCrescente13.compare(usuario17, usuario22);
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        java.lang.String str29 = usuario27.getNome();
        lp2.projetofinal.entidades.Item item30 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo33 = new lp2.projetofinal.entidades.Emprestimo(usuario22, usuario27, item30, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario34 = emprestimo33.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario35 = emprestimo33.getUsuarioRequerente();
        usuario35.setEmail("Nao emprestado");
        int int38 = usuario9.compareTo(usuario35);
        java.lang.String str39 = usuario9.getNome();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos40 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie48 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str50 = bluRaySerie48.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos51 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow58 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay59 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean60 = bluRayShow58.equals((java.lang.Object) classificacaoBluRay59);
        bluRayShow58.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow70 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str71 = bluRayShow70.getNome();
        int int72 = ordenaItemNumeroEmprestimos51.compare((lp2.projetofinal.entidades.Item) bluRayShow58, (lp2.projetofinal.entidades.Item) bluRayShow70);
        int int73 = ordenaItemNumeroEmprestimos40.compare((lp2.projetofinal.entidades.Item) bluRaySerie48, (lp2.projetofinal.entidades.Item) bluRayShow70);
        java.lang.String str74 = bluRaySerie48.getNome();
        bluRaySerie48.setNome("COMPLETO");
        java.lang.String str77 = bluRaySerie48.getNome();
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario9, (lp2.projetofinal.entidades.Item) bluRaySerie48, "Caloteiro, OUTRO, ", (-11));
        lp2.projetofinal.entidades.Usuario usuario81 = emprestimo80.getDonoDoItem();
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade82 = usuario81.getCartao();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico11 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico11.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Caloteiro" + "'", str29, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario34);
        org.junit.Assert.assertNotNull(usuario35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay59 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay59.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro" + "'", str71, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Noob" + "'", str74, "Noob");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "COMPLETO" + "'", str77, "COMPLETO");
        org.junit.Assert.assertNotNull(usuario81);
        org.junit.Assert.assertNotNull(cartaoFidelidade82);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("Noob");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "DEZ_ANOS", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str9 = sistema0.listarEmprestimosItem("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario1 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str2 = controllerUsuario1.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet3 = controllerUsuario1.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet3, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens7 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray8 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet9 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet9, itemArray8);
        controllerItens7.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet9, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario14 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str15 = controllerUsuario14.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet16 = controllerUsuario14.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet16, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet26 = controllerUsuario24.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet26, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.controllers.ControllerItens controllerItens31 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray32 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet33 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet33, itemArray32);
        controllerItens31.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet33, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens38 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray39 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet40 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet40, itemArray39);
        controllerItens38.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet40, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario45 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str46 = controllerUsuario45.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet47 = controllerUsuario45.todosUsuariosItens();
        controllerItens38.adicionaItem(itemSet47, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario55 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str56 = controllerUsuario55.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet57 = controllerUsuario55.todosUsuariosItens();
        controllerItens38.adicionaItem(itemSet57, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        controllerItens31.adicionaItem(itemSet57, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        controllerItens7.adicionaItem(itemSet57, "1: OUTRO - Reputacao: 0,00|", 0.0d, "OUTRO");
        lp2.projetofinal.controllers.ControllerItens controllerItens73 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray74 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet75 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet75, itemArray74);
        controllerItens73.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet75, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario80 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str81 = controllerUsuario80.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet82 = controllerUsuario80.todosUsuariosItens();
        controllerItens73.adicionaItem(itemSet82, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens7.adicionaItem(itemSet82, "Caloteiro", (double) 1.0f, (int) (byte) 0, (int) (byte) -1, "COMPLETO", "Nenhum item emprestado");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item98 = controllerItens0.identificaItem(itemSet82, "DEZOITO_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(itemSet47);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(itemSet57);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(itemSet82);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("COMPLETO", "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        java.lang.String str5 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("Caloteiro, OUTRO, ", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "POLICIAL", (double) 100, "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario6 = controllerUsuario0.identificaUsuario("1: ROMANCE - Reputacao: 0,00|", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("PC", "POLICIAL", "POLICIAL", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("DEZ_ANOS", "Caloteiro, OUTRO, ");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens1 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario2 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str3 = controllerUsuario2.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet4 = controllerUsuario2.todosUsuariosItens();
        controllerItens1.adicionaItem(itemSet4, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens8 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray9 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet10 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet10, itemArray9);
        controllerItens8.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet10, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario15 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str16 = controllerUsuario15.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario15.todosUsuariosItens();
        controllerItens8.adicionaItem(itemSet17, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario25 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str26 = controllerUsuario25.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet27 = controllerUsuario25.todosUsuariosItens();
        controllerItens8.adicionaItem(itemSet27, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str34 = controllerItens1.getInfoItem(itemSet27, "Nao emprestado", "POLICIAL");
        controllerItens0.adicionaItem(itemSet27, "", (double) (short) 0, "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", (-18), "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", (int) (byte) 1);
        lp2.projetofinal.controllers.ControllerItens controllerItens43 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray44 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet45 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet45, itemArray44);
        controllerItens43.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet45, "Caloteiro", (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet45, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "LIVRE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(itemSet4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(itemSet17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("DOZE_ANOS", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "hi!", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        java.lang.String str6 = sistema0.listarEmprestimosItem("POLICIAL");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "DOCUMENTARIO", "Caloteiro, Nenhum emprestimos associados ao item, ", (double) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Plataforma nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens17 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario18 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str19 = controllerUsuario18.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet20 = controllerUsuario18.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet20, "Nenhum emprestimos associados ao item", (double) 100);
        java.lang.String str24 = controllerItens0.listarItensOrdenadosPorNome(itemSet20);
        lp2.projetofinal.controllers.ControllerItens controllerItens25 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens26 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray27 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet28 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet28, itemArray27);
        controllerItens26.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet28, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens33 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray34 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet35 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet35, itemArray34);
        controllerItens33.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet35, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario40 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str41 = controllerUsuario40.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet42 = controllerUsuario40.todosUsuariosItens();
        controllerItens33.adicionaItem(itemSet42, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens26.adicionaItem(itemSet42, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario58 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str59 = controllerUsuario58.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet60 = controllerUsuario58.todosUsuariosItens();
        java.lang.String str61 = controllerItens26.listarItensOrdenadosPorValor(itemSet60);
        controllerItens25.adicionaItem(itemSet60, "", (double) (byte) 10, "1: ROMANCE - Reputacao: 0,00|", 100, "NINTENDO 3DS", "Nao emprestado", (int) (byte) 100);
        controllerItens0.adicionaItem(itemSet60, "Caloteiro", (double) 14, "1: ROMANCE - Reputacao: 0,00|");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario74 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str75 = controllerUsuario74.listarCaloteiros();
        java.lang.String str76 = controllerUsuario74.listarTop10MelhoresUsuarios();
        controllerUsuario74.carregaMapaUsuarios();
        java.lang.String str78 = controllerUsuario74.listarCaloteiros();
        java.lang.String str79 = controllerUsuario74.listarCaloteiros();
        java.lang.String str80 = controllerUsuario74.listarTop10MelhoresUsuarios();
        controllerUsuario74.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet82 = controllerUsuario74.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = controllerItens0.getInfoItem(itemSet82, "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(itemSet20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|" + "'", str24, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(itemSet42);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(itemSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str75, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str78, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str79, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(itemSet82);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico8 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean9 = usuario6.equals((java.lang.Object) plataformaJogoEletronico8);
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str14 = usuario13.getTelefone();
        int int15 = ordenaUsuarioReputacaoCrescente0.compare(usuario6, usuario13);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente16 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario20 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str21 = usuario20.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario25 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int26 = ordenaUsuarioReputacaoCrescente16.compare(usuario20, usuario25);
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str31 = usuario30.getTelefone();
        java.lang.String str32 = usuario30.getNome();
        lp2.projetofinal.entidades.Item item33 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo36 = new lp2.projetofinal.entidades.Emprestimo(usuario25, usuario30, item33, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario37 = emprestimo36.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro38 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario37.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro38);
        java.lang.String str40 = cartaoCaloteiro38.getNomeCartao();
        boolean boolean41 = cartaoCaloteiro38.permisaoPegarEmprestado();
        usuario13.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro38);
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("MUSICAL", "Lista de usuarios com reputacao negativa: ", "OUTRO");
        lp2.projetofinal.entidades.Emprestimo emprestimo48 = new lp2.projetofinal.entidades.Emprestimo(usuario13, usuario46, "Caloteiro");
        emprestimo48.setDataDevolucao("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        lp2.projetofinal.entidades.Item item51 = emprestimo48.getItem();
        lp2.projetofinal.entidades.Item item52 = emprestimo48.getItem();
        emprestimo48.setDataDevolucao("1: Caloteiro - Reputacao: 0,00|");
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Caloteiro" + "'", str40, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("LIVRE", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "PC", "DEZESSEIS_ANOS", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        java.lang.String str1 = cartaoBomAmigo0.getNomeCartao();
        int int2 = cartaoBomAmigo0.prazoEmprestimo();
        java.lang.String str3 = cartaoBomAmigo0.getNomeCartao();
        java.lang.Class<?> wildcardClass4 = cartaoBomAmigo0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BomAmigo" + "'", str1, "BomAmigo");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BomAmigo" + "'", str3, "BomAmigo");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme20 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str21 = bluRayFilme20.getGenero();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos22 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie30 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str32 = bluRaySerie30.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos33 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow40 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay41 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean42 = bluRayShow40.equals((java.lang.Object) classificacaoBluRay41);
        bluRayShow40.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow52 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str53 = bluRayShow52.getNome();
        int int54 = ordenaItemNumeroEmprestimos33.compare((lp2.projetofinal.entidades.Item) bluRayShow40, (lp2.projetofinal.entidades.Item) bluRayShow52);
        int int55 = ordenaItemNumeroEmprestimos22.compare((lp2.projetofinal.entidades.Item) bluRaySerie30, (lp2.projetofinal.entidades.Item) bluRayShow52);
        java.lang.String str56 = bluRaySerie30.getNome();
        bluRaySerie30.setNome("COMPLETO");
        bluRaySerie30.adicionarBluRay((-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow67 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str68 = bluRayShow67.getNome();
        int int69 = bluRaySerie30.compareTo((lp2.projetofinal.entidades.Item) bluRayShow67);
        int int70 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayFilme20, (lp2.projetofinal.entidades.Item) bluRayShow67);
        bluRayFilme20.setNome("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
        bluRayFilme20.atualizar("Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OUTRO" + "'", str21, "OUTRO");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay41 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay41.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Noob" + "'", str56, "Noob");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Caloteiro" + "'", str68, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-18) + "'", int69 == (-18));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente14 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario18 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str19 = usuario18.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario23 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int24 = ordenaUsuarioReputacaoCrescente14.compare(usuario18, usuario23);
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str29 = usuario28.getTelefone();
        java.lang.String str30 = usuario28.getNome();
        lp2.projetofinal.entidades.Item item31 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo34 = new lp2.projetofinal.entidades.Emprestimo(usuario23, usuario28, item31, "OUTRO", 100);
        java.lang.String str35 = usuario28.getNome();
        java.lang.String str36 = usuario28.toString();
        boolean boolean37 = jogoTabuleiro3.equals((java.lang.Object) str36);
        jogoTabuleiro3.adicionarPecaPerdida("POLICIAL");
        java.lang.String str41 = jogoTabuleiro3.getInfo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        jogoTabuleiro3.adicionarPecaPerdida("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie51 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str52 = bluRaySerie51.getEstado();
        java.lang.String str53 = bluRaySerie51.getGenero();
        java.lang.String str54 = bluRaySerie51.getEstado();
        bluRaySerie51.adicionarBluRay((int) 'a');
        int int57 = jogoTabuleiro3.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie51);
        jogoTabuleiro3.adicionarPecaPerdida("1:  - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Caloteiro" + "'", str30, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro, OUTRO, " + "'", str36, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Nao emprestado" + "'", str52, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ROMANCE" + "'", str53, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Nao emprestado" + "'", str54, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "POLICIAL", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "DEZOITO_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str7 = bluRayShow6.getNome();
        int int8 = bluRayShow6.getNumFaixas();
        bluRayShow6.itemEmprestado();
        bluRayShow6.itemEmprestado();
        bluRayShow6.itemEmprestado();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Caloteiro" + "'", str7, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean1 = cartaoBomAmigo0.permisaoPegarEmprestado();
        boolean boolean2 = cartaoBomAmigo0.permisaoPegarEmprestado();
        java.lang.String str3 = cartaoBomAmigo0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BomAmigo" + "'", str3, "BomAmigo");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "POLICIAL", "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str16 = usuario15.getTelefone();
        java.lang.String str17 = usuario15.getNome();
        lp2.projetofinal.entidades.Item item18 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo21 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario15, item18, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente22 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int32 = ordenaUsuarioReputacaoCrescente22.compare(usuario26, usuario31);
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        java.lang.String str38 = usuario36.getNome();
        lp2.projetofinal.entidades.Item item39 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo42 = new lp2.projetofinal.entidades.Emprestimo(usuario31, usuario36, item39, "OUTRO", 100);
        usuario36.atualizaReputacao((double) (short) -1, false);
        int int46 = ordenaUsuarioReputacaoCrescente0.compare(usuario10, usuario36);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente47 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario51 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str52 = usuario51.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario56 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int57 = ordenaUsuarioReputacaoCrescente47.compare(usuario51, usuario56);
        usuario56.setTelefone("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente60 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str65 = usuario64.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int70 = ordenaUsuarioReputacaoCrescente60.compare(usuario64, usuario69);
        lp2.projetofinal.entidades.Usuario usuario74 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str75 = usuario74.getTelefone();
        java.lang.String str76 = usuario74.getNome();
        lp2.projetofinal.entidades.Item item77 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario69, usuario74, item77, "OUTRO", 100);
        usuario74.atualizaReputacao((double) (-1), true);
        int int84 = ordenaUsuarioReputacaoCrescente0.compare(usuario56, usuario74);
        usuario56.setNome("Caloteiro");
        usuario56.atualizaReputacao((double) (short) 0, false);
        usuario56.setNome("Emprestado");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Caloteiro" + "'", str76, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator34 = ordenaItemNumeroEmprestimos0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator35 = ordenaItemNumeroEmprestimos0.reversed();
        lp2.projetofinal.entidades.BluRayShow bluRayShow42 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str44 = bluRayShow42.getInfo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        bluRayShow42.atualizar("OUTRO", "FreeRyder");
        lp2.projetofinal.entidades.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow42, item48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemComparator34);
        org.junit.Assert.assertNotNull(itemComparator35);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((int) (byte) 100);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        java.lang.String str12 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "Caloteiro, OUTRO, ", "Nenhum item pego emprestado", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet6 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario9 = controllerUsuario0.identificaUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemSet6);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente22 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int32 = ordenaUsuarioReputacaoCrescente22.compare(usuario26, usuario31);
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        java.lang.String str38 = usuario36.getNome();
        lp2.projetofinal.entidades.Item item39 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo42 = new lp2.projetofinal.entidades.Emprestimo(usuario31, usuario36, item39, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str47 = usuario46.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo49 = new lp2.projetofinal.entidades.Emprestimo(usuario36, usuario46, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet50 = usuario36.retornaSeusItens();
        lp2.projetofinal.entidades.Emprestimo emprestimo52 = new lp2.projetofinal.entidades.Emprestimo(usuario21, usuario36, "COMPLETO");
        java.lang.String str53 = usuario21.toString();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente54 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente55 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario59 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str60 = usuario59.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int65 = ordenaUsuarioReputacaoCrescente55.compare(usuario59, usuario64);
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str70 = usuario69.getTelefone();
        java.lang.String str71 = usuario69.getNome();
        lp2.projetofinal.entidades.Item item72 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo75 = new lp2.projetofinal.entidades.Emprestimo(usuario64, usuario69, item72, "OUTRO", 100);
        boolean boolean77 = emprestimo75.equals((java.lang.Object) (-1.0f));
        int int78 = emprestimo75.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario79 = emprestimo75.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario83 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico85 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean86 = usuario83.equals((java.lang.Object) plataformaJogoEletronico85);
        usuario83.setEmail("Nenhum emprestimos associados ao item");
        int int89 = ordenaUsuarioReputacaoCrescente54.compare(usuario79, usuario83);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet90 = usuario83.retornaSeusItens();
        int int91 = usuario21.compareTo(usuario83);
        java.lang.String str92 = usuario83.getEmail();
        usuario83.setEmail("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro, OUTRO, " + "'", str53, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro" + "'", str71, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(usuario79);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico85 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico85.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(itemSet90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str92, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str13 = sistema3.listarEmprestimosItem("Caloteiro, Nao emprestado, ");
        java.lang.String str14 = sistema3.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.cadastrarBluRaySerie("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "POLICIAL", "Noob", (double) 100L, "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", 7, "PC", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str13, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "1: OUTRO - Reputacao: 0,00|", "hi!");
        java.lang.String str5 = usuario4.getTelefone();
        java.lang.String str6 = usuario4.getTelefone();
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos7 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str8 = controllerEmprestimos7.listarItensEmprestados();
        java.lang.String str9 = controllerEmprestimos7.listarItensEmprestados();
        controllerEmprestimos7.salvarListaEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente12 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator13 = ordenaUsuarioReputacaoCrescente11.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente12);
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico19 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean20 = usuario17.equals((java.lang.Object) plataformaJogoEletronico19);
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str25 = usuario24.getTelefone();
        int int26 = ordenaUsuarioReputacaoCrescente11.compare(usuario17, usuario24);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente27 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str32 = usuario31.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int37 = ordenaUsuarioReputacaoCrescente27.compare(usuario31, usuario36);
        lp2.projetofinal.entidades.Usuario usuario41 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str42 = usuario41.getTelefone();
        java.lang.String str43 = usuario41.getNome();
        lp2.projetofinal.entidades.Item item44 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo47 = new lp2.projetofinal.entidades.Emprestimo(usuario36, usuario41, item44, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario48 = emprestimo47.getDonoDoItem();
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade49 = usuario48.getCartao();
        lp2.projetofinal.entidades.BluRayShow bluRayShow56 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow56.setNome("Caloteiro");
        bluRayShow56.atualizaNumeroEmprestimos();
        bluRayShow56.atualizar("BomAmigo", "FreeRyder");
        bluRayShow56.atualizar("Caloteiro, OUTRO, ", "");
        int int66 = bluRayShow56.getDuracao();
        controllerEmprestimos7.registrarEmprestimo(usuario17, usuario48, (lp2.projetofinal.entidades.Item) bluRayShow56, "DOZE_ANOS", 52);
        int int70 = ordenaUsuarioReputacaoDecrescente0.compare(usuario4, usuario48);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(usuarioComparator13);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico19 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico19.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Caloteiro" + "'", str43, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario48);
        org.junit.Assert.assertNotNull(cartaoFidelidade49);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 52 + "'", int66 == 52);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.fecharSistema();
        java.lang.String str8 = facade0.listarEmprestimosItem("Caloteiro, Nao emprestado, ");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("", "Nenhum emprestimos associados ao item", "ROMANCE", 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (double) 14, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 14, "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "POLICIAL", (int) (byte) 10);
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Nenhum item emprestado", "Noob", "Caloteiro, MUSICAL, ");
        boolean boolean12 = bluRaySerie7.equals((java.lang.Object) "Noob");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.fecharSistema();
        java.lang.String str8 = facade0.listarEmprestimosItem("COMPLETO");
        java.lang.String str9 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("ROMANCE", "Caloteiro, MUSICAL, ", "Noob", (double) 35, "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str3 = jogoTabuleiro2.toString();
        java.lang.String str4 = jogoTabuleiro2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO" + "'", str3, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO" + "'", str4, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facade0.pesquisarDetalhesItem("Lista de usuarios com reputacao negativa: ", "Lista de usuarios com reputacao negativa: ", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10Itens();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str6 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("Lista de usuarios com reputacao negativa: ", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str4 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        boolean boolean3 = cartaoCaloteiro0.permisaoPegarEmprestado();
        boolean boolean4 = cartaoCaloteiro0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str2 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("Caloteiro", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "DEZOITO_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionaItem(itemSet7, "COMPLETO", (double) (-15));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.fecharSistema();
        java.lang.String str8 = facade0.listarEmprestimosItem("COMPLETO");
        java.lang.String str9 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("Caloteiro, MUSICAL, ", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "DEZ_ANOS", "COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente2 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str7 = usuario6.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int12 = ordenaUsuarioReputacaoCrescente2.compare(usuario6, usuario11);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        java.lang.String str18 = usuario16.getNome();
        lp2.projetofinal.entidades.Item item19 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo22 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario16, item19, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente23 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int33 = ordenaUsuarioReputacaoCrescente23.compare(usuario27, usuario32);
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        java.lang.String str39 = usuario37.getNome();
        lp2.projetofinal.entidades.Item item40 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario32, usuario37, item40, "OUTRO", 100);
        usuario37.atualizaReputacao((double) (short) -1, false);
        int int47 = ordenaUsuarioReputacaoCrescente1.compare(usuario11, usuario37);
        java.lang.String str48 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        java.lang.String str49 = controllerEmprestimos0.listarItensEmprestados();
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow57 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente58 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean59 = bluRayShow57.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente58);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente60 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente61 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator62 = ordenaUsuarioReputacaoCrescente60.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente61);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator63 = ordenaUsuarioReputacaoCrescente58.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente60);
        lp2.projetofinal.entidades.Usuario usuario67 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "Caloteiro");
        usuario67.setTelefone("Noob");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente70 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario74 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str75 = usuario74.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario79 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int80 = ordenaUsuarioReputacaoCrescente70.compare(usuario74, usuario79);
        lp2.projetofinal.entidades.Usuario usuario84 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str85 = usuario84.getTelefone();
        java.lang.String str86 = usuario84.getNome();
        lp2.projetofinal.entidades.Item item87 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo90 = new lp2.projetofinal.entidades.Emprestimo(usuario79, usuario84, item87, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario94 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str95 = usuario94.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo97 = new lp2.projetofinal.entidades.Emprestimo(usuario84, usuario94, "1: OUTRO - Reputacao: 0,00|");
        int int98 = ordenaUsuarioReputacaoCrescente60.compare(usuario67, usuario84);
        java.lang.String str99 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario84);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Nenhum item pego emprestado" + "'", str48, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(usuarioComparator62);
        org.junit.Assert.assertNotNull(usuarioComparator63);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Caloteiro" + "'", str86, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "Nenhum item pego emprestado" + "'", str99, "Nenhum item pego emprestado");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "Nenhum item pego emprestado", 10.0d, "Nao emprestado", (int) (byte) 10, "Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", (-15));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.pesquisarDetalhesItem("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "Nenhum item pego emprestado", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "");
        java.lang.String str3 = chaveNomeTelefone2.getNome();
        java.lang.Class<?> wildcardClass4 = chaveNomeTelefone2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        bluRaySerie8.setPreco((-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str2 = controllerEmprestimos0.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario8 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str9 = usuario8.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int14 = ordenaUsuarioReputacaoCrescente4.compare(usuario8, usuario13);
        lp2.projetofinal.entidades.Usuario usuario18 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str19 = usuario18.getTelefone();
        java.lang.String str20 = usuario18.getNome();
        lp2.projetofinal.entidades.Item item21 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo24 = new lp2.projetofinal.entidades.Emprestimo(usuario13, usuario18, item21, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str29 = usuario28.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo31 = new lp2.projetofinal.entidades.Emprestimo(usuario18, usuario28, "1: OUTRO - Reputacao: 0,00|");
        java.lang.String str32 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario18);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente33 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente34 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator35 = ordenaUsuarioReputacaoCrescente33.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente34);
        lp2.projetofinal.entidades.Usuario usuario39 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico41 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean42 = usuario39.equals((java.lang.Object) plataformaJogoEletronico41);
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str47 = usuario46.getTelefone();
        int int48 = ordenaUsuarioReputacaoCrescente33.compare(usuario39, usuario46);
        java.lang.String str49 = usuario39.getTelefone();
        double double50 = usuario39.getReputacao();
        java.lang.String str51 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario39);
        java.lang.String str52 = usuario39.getEmail();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Nenhum item pego emprestado" + "'", str32, "Nenhum item pego emprestado");
        org.junit.Assert.assertNotNull(usuarioComparator35);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico41 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico41.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Nenhum item emprestado" + "'", str51, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "OUTRO" + "'", str52, "OUTRO");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str16 = usuario15.getTelefone();
        java.lang.String str17 = usuario15.getNome();
        lp2.projetofinal.entidades.Item item18 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo21 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario15, item18, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente22 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int32 = ordenaUsuarioReputacaoCrescente22.compare(usuario26, usuario31);
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        java.lang.String str38 = usuario36.getNome();
        lp2.projetofinal.entidades.Item item39 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo42 = new lp2.projetofinal.entidades.Emprestimo(usuario31, usuario36, item39, "OUTRO", 100);
        usuario36.atualizaReputacao((double) (short) -1, false);
        int int46 = ordenaUsuarioReputacaoCrescente0.compare(usuario10, usuario36);
        java.lang.String str47 = usuario10.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "OUTRO" + "'", str47, "OUTRO");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("QUATORZE_ANOS", "Nenhum item emprestado, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("hi!", "Emprestado", "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("BomAmigo");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facade0.listarEmprestimosUsuarioEmprestando("1: OUTRO - Reputacao: 0,00|", "DOCUMENTARIO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str10, "1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        sistema0.cadastrarUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("1: Caloteiro - Reputacao: 0,00|", "OUTRO", "DEZESSEIS_ANOS", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Peca nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str11, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoUsuario("1:  - Reputacao: 0,00|", "Nao emprestado", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facade0.listarEmprestimosUsuarioEmprestando("", "DEZ_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("QUATORZE_ANOS", (double) (-1.0f), "BomAmigo", 1, "AVENTURA", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens17 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray18 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet19 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet19, itemArray18);
        controllerItens17.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet26 = controllerUsuario24.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet26, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario34 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str35 = controllerUsuario34.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = controllerUsuario34.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet36, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str41 = controllerItens0.listarItensNaoEmprestados(itemSet36);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario42 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str43 = controllerUsuario42.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet44 = controllerUsuario42.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet44, "Lista de usuarios com reputacao negativa: ", (double) (-1.0f), "Nao emprestado", 1, "Nenhum item pego emprestado", "Nao emprestado", 5);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente53 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str58 = usuario57.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int63 = ordenaUsuarioReputacaoCrescente53.compare(usuario57, usuario62);
        lp2.projetofinal.entidades.Usuario usuario67 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str68 = usuario67.getTelefone();
        java.lang.String str69 = usuario67.getNome();
        lp2.projetofinal.entidades.Item item70 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo73 = new lp2.projetofinal.entidades.Emprestimo(usuario62, usuario67, item70, "OUTRO", 100);
        usuario62.setEmail("OUTRO");
        java.lang.String str76 = usuario62.getEmail();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet77 = usuario62.retornaSeusItens();
        controllerItens0.adicionaItem(itemSet77, "Nenhum item emprestado", (double) ' ', "Lista de usuarios com reputacao negativa: ", (int) (short) 10, "", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", 64);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet86 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str87 = controllerItens0.listarItensOrdenadosPorNome(itemSet86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(itemSet36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str41, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(itemSet44);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Caloteiro" + "'", str69, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "OUTRO" + "'", str76, "OUTRO");
        org.junit.Assert.assertNotNull(itemSet77);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos1 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie9 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str11 = bluRaySerie9.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos12 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay20 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean21 = bluRayShow19.equals((java.lang.Object) classificacaoBluRay20);
        bluRayShow19.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow31 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str32 = bluRayShow31.getNome();
        int int33 = ordenaItemNumeroEmprestimos12.compare((lp2.projetofinal.entidades.Item) bluRayShow19, (lp2.projetofinal.entidades.Item) bluRayShow31);
        int int34 = ordenaItemNumeroEmprestimos1.compare((lp2.projetofinal.entidades.Item) bluRaySerie9, (lp2.projetofinal.entidades.Item) bluRayShow31);
        java.lang.String str35 = bluRayShow31.getNomeArtista();
        java.lang.String str37 = bluRayShow31.getInfo("Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow44.atualizaNumeroEmprestimos();
        int int46 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow31, (lp2.projetofinal.entidades.Item) bluRayShow44);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator47 = ordenaItemPeloPreco0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator48 = ordenaItemPeloPreco0.reversed();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico52 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str53 = jogoEletronico52.getPlataforma();
        java.lang.String str54 = jogoEletronico52.getPlataforma();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie62 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int63 = bluRaySerie62.getNumeroEmprestimos();
        int int64 = bluRaySerie62.duracaoTotal();
        int int65 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoEletronico52, (lp2.projetofinal.entidades.Item) bluRaySerie62);
        java.lang.String str66 = jogoEletronico52.toString();
        jogoEletronico52.setNome("COM PECAS PERDIDAS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay20 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay20.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemComparator47);
        org.junit.Assert.assertNotNull(itemComparator48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "OUTRO" + "'", str53, "OUTRO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "OUTRO" + "'", str54, "OUTRO");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str66, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str4 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("Caloteiro", "POLICIAL", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("", "", "OUTRO");
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str6 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = controllerUsuario0.getInfoUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.inicializar();
        sistema3.cadastrarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "PS3", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            sistema3.adicionarPecaPerdida("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "POLICIAL", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) 100L, "Lista de usuarios com reputacao negativa: ", (int) (short) 1, "BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (-11));
        java.lang.String str8 = bluRaySerie7.getDescricao();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "PC", (double) 10, (-37), "", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("Nenhum item emprestado, OUTRO, ");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        int int22 = emprestimo20.getNumeroDias();
        emprestimo20.setDataDevolucao("Nenhum emprestimos associados ao item");
        lp2.projetofinal.entidades.Usuario usuario25 = emprestimo20.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario26 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico32 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean33 = usuario30.equals((java.lang.Object) plataformaJogoEletronico32);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos34 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro37 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente45 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean46 = bluRayShow44.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente45);
        int int47 = ordenaItemNumeroEmprestimos34.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro37, (lp2.projetofinal.entidades.Item) bluRayShow44);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente48 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario52 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str53 = usuario52.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int58 = ordenaUsuarioReputacaoCrescente48.compare(usuario52, usuario57);
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str63 = usuario62.getTelefone();
        java.lang.String str64 = usuario62.getNome();
        lp2.projetofinal.entidades.Item item65 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo68 = new lp2.projetofinal.entidades.Emprestimo(usuario57, usuario62, item65, "OUTRO", 100);
        java.lang.String str69 = usuario62.getNome();
        java.lang.String str70 = usuario62.toString();
        boolean boolean71 = jogoTabuleiro37.equals((java.lang.Object) str70);
        jogoTabuleiro37.adicionarPecaPerdida("POLICIAL");
        java.lang.String str75 = jogoTabuleiro37.getInfo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        java.lang.String str76 = jogoTabuleiro37.toString();
        lp2.projetofinal.entidades.Emprestimo emprestimo79 = new lp2.projetofinal.entidades.Emprestimo(usuario26, usuario30, (lp2.projetofinal.entidades.Item) jogoTabuleiro37, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", (int) (short) 1);
        lp2.projetofinal.entidades.Usuario usuario80 = emprestimo79.getUsuarioRequerente();
        java.lang.String str81 = usuario80.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertNotNull(usuario26);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico32 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico32.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Caloteiro" + "'", str64, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Caloteiro" + "'", str69, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Caloteiro, OUTRO, " + "'", str70, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS" + "'", str76, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
        org.junit.Assert.assertNotNull(usuario80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Caloteiro, OUTRO, " + "'", str81, "Caloteiro, OUTRO, ");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro, OUTRO, ", "Nenhum item pego emprestado", "Caloteiro");
        usuario3.atualizaReputacao((double) 7, false);
        usuario3.setEmail("FreeRyder");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        java.lang.String str5 = jogoEletronico3.toString();
        java.lang.String str6 = jogoEletronico3.toString();
        java.lang.String str7 = jogoEletronico3.toString();
        lp2.projetofinal.controllers.Sistema sistema8 = new lp2.projetofinal.controllers.Sistema();
        sistema8.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str13 = sistema8.listarItensOrdenadosPorValor();
        sistema8.resetarPersistencia();
        java.lang.String str15 = sistema8.listarCaloteiros();
        sistema8.finalizar();
        java.lang.String str17 = sistema8.listarItensNaoEmprestados();
        sistema8.finalizar();
        boolean boolean19 = jogoEletronico3.equals((java.lang.Object) sistema8);
        // The following exception was thrown during execution in test generation
        try {
            sistema8.atualizarUsuario("Caloteiro, MUSICAL, ", "LIVRE", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str5, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str6, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str7, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str15, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("OUTRO", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (double) (-1), 0, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos1 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie9 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str11 = bluRaySerie9.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos12 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay20 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean21 = bluRayShow19.equals((java.lang.Object) classificacaoBluRay20);
        bluRayShow19.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow31 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str32 = bluRayShow31.getNome();
        int int33 = ordenaItemNumeroEmprestimos12.compare((lp2.projetofinal.entidades.Item) bluRayShow19, (lp2.projetofinal.entidades.Item) bluRayShow31);
        int int34 = ordenaItemNumeroEmprestimos1.compare((lp2.projetofinal.entidades.Item) bluRaySerie9, (lp2.projetofinal.entidades.Item) bluRayShow31);
        java.lang.String str35 = bluRayShow31.getNomeArtista();
        java.lang.String str37 = bluRayShow31.getInfo("Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow44.atualizaNumeroEmprestimos();
        int int46 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow31, (lp2.projetofinal.entidades.Item) bluRayShow44);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator47 = ordenaItemPeloPreco0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator48 = itemComparator47.reversed();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay20 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay20.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemComparator47);
        org.junit.Assert.assertNotNull(itemComparator48);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "MUSICAL");
        usuario3.setEmail("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str6 = facade0.listarEmprestimosItem("Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.listarEmprestimosUsuarioEmprestando("", "DEZ_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        sistema0.cadastrarUsuario("COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "LIVRE");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Emprestado", "QUATORZE_ANOS", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (double) 14, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 14, "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "POLICIAL", (int) (byte) 10);
        java.lang.String str9 = bluRaySerie7.getInfo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa(14);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.cadastrarUsuario("Caloteiro, MUSICAL, ", "Caloteiro, MUSICAL, ", "Lista de usuarios com reputacao negativa: ");
        java.lang.String str8 = facade0.listarTop10MelhoresUsuarios();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|" + "'", str8, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.cadastrarUsuario("Caloteiro, OUTRO, ", "1: ROMANCE - Reputacao: 0,00|", "1: ROMANCE - Reputacao: 0,00|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = sistema0.pesquisarDetalhesItem("Nenhum item pego emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        java.lang.String str10 = sistema0.listarEmprestimosItem("Emprestado");
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "", "COMPLETO", (double) (byte) 100, "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str10, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo(64);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str4 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        java.lang.String str6 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "", "POLICIAL", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("QUATORZE_ANOS", "PC", "", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("1: COMPLETO - Reputacao: 0,00|");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((int) (byte) 10);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = ordenaUsuarioReputacaoCrescente0.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = ordenaUsuarioReputacaoCrescente4.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente5);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator7 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator8 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator9 = ordenaUsuarioReputacaoCrescente0.thenComparing(usuarioComparator8);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente10 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator12 = ordenaUsuarioReputacaoCrescente10.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente11);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator13 = usuarioComparator12.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator14 = usuarioComparator9.thenComparing(usuarioComparator12);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator15 = usuarioComparator14.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator16 = usuarioComparator15.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente17 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente18 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator19 = ordenaUsuarioReputacaoCrescente17.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente18);
        lp2.projetofinal.entidades.Usuario usuario23 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico25 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean26 = usuario23.equals((java.lang.Object) plataformaJogoEletronico25);
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str31 = usuario30.getTelefone();
        int int32 = ordenaUsuarioReputacaoCrescente17.compare(usuario23, usuario30);
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos33 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str35 = controllerEmprestimos33.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos33.salvarListaEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente37 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario41 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str42 = usuario41.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int47 = ordenaUsuarioReputacaoCrescente37.compare(usuario41, usuario46);
        lp2.projetofinal.entidades.Usuario usuario51 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str52 = usuario51.getTelefone();
        java.lang.String str53 = usuario51.getNome();
        lp2.projetofinal.entidades.Item item54 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo57 = new lp2.projetofinal.entidades.Emprestimo(usuario46, usuario51, item54, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario58 = emprestimo57.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario59 = emprestimo57.getUsuarioRequerente();
        usuario59.setEmail("Nao emprestado");
        java.lang.String str62 = usuario59.toString();
        java.lang.String str63 = controllerEmprestimos33.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario59);
        lp2.projetofinal.entidades.Usuario usuario67 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        int int68 = ordenaUsuarioReputacaoCrescente17.compare(usuario59, usuario67);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator69 = usuarioComparator16.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente17);
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertNotNull(usuarioComparator7);
        org.junit.Assert.assertNotNull(usuarioComparator8);
        org.junit.Assert.assertNotNull(usuarioComparator9);
        org.junit.Assert.assertNotNull(usuarioComparator12);
        org.junit.Assert.assertNotNull(usuarioComparator13);
        org.junit.Assert.assertNotNull(usuarioComparator14);
        org.junit.Assert.assertNotNull(usuarioComparator15);
        org.junit.Assert.assertNotNull(usuarioComparator16);
        org.junit.Assert.assertNotNull(usuarioComparator19);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico25 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico25.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str35, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario58);
        org.junit.Assert.assertNotNull(usuario59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Caloteiro, Nao emprestado, " + "'", str62, "Caloteiro, Nao emprestado, ");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Nenhum item pego emprestado" + "'", str63, "Nenhum item pego emprestado");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator69);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("LIVRE");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        boolean boolean3 = cartaoNoob0.permisaoPegarEmprestado();
        int int4 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str5 = cartaoNoob0.getNomeCartao();
        int int6 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Noob" + "'", str5, "Noob");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = emprestimo23.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(100);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Nenhum emprestimos associados ao item", "NINTENDO 3DS", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", (-32.0d), "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("Caloteiro", "1: COMPLETO - Reputacao: 0,00|", "COMPLETO", "DOZE_ANOS", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente14 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario18 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str19 = usuario18.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario23 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int24 = ordenaUsuarioReputacaoCrescente14.compare(usuario18, usuario23);
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str29 = usuario28.getTelefone();
        java.lang.String str30 = usuario28.getNome();
        lp2.projetofinal.entidades.Item item31 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo34 = new lp2.projetofinal.entidades.Emprestimo(usuario23, usuario28, item31, "OUTRO", 100);
        java.lang.String str35 = usuario28.getNome();
        java.lang.String str36 = usuario28.toString();
        boolean boolean37 = jogoTabuleiro3.equals((java.lang.Object) str36);
        java.lang.String str38 = jogoTabuleiro3.toString();
        java.lang.String str39 = jogoTabuleiro3.toString();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Caloteiro" + "'", str30, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro, OUTRO, " + "'", str36, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO" + "'", str38, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO" + "'", str39, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        sistema0.cadastrarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DOZE_ANOS", "Caloteiro, Nao emprestado, ");
        java.lang.String str6 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.listarEmprestimosUsuarioEmprestando("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("1:  - Reputacao: 0,00|", (double) 100.0f, "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str10 = sistema0.listarItensEmprestados();
        java.lang.String str11 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("", "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sistema0.getInfoItem("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", "Noob", "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.finalizar();
        java.lang.String str15 = sistema3.listarEmprestimosItem("ROMANCE");
        java.lang.String str16 = sistema3.listarItensNaoEmprestados();
        java.lang.String str18 = sistema3.listarEmprestimosItem("COM PECAS PERDIDAS");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str18, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str6 = facade0.listarEmprestimosItem("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (double) 100, (int) (byte) -1, (int) (byte) -1, "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("1: Caloteiro - Reputacao: 0,00|", "Caloteiro", "MUSICAL", (double) 64, "Nenhum item emprestado, OUTRO, ", 14, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoItem("Caloteiro, Nenhum emprestimos associados ao item, ", "1:  - Reputacao: 0,00|", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "DOCUMENTARIO", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "Lista de usuarios com reputacao negativa: ", "1: Caloteiro - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str9 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Caloteiro, MUSICAL, ", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.listarEmprestimosUsuarioPegandoEmprestado("1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        java.lang.String str3 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("hi!", "", "Nenhum emprestimos associados ao item", "BomAmigo", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico6 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean7 = usuario4.equals((java.lang.Object) plataformaJogoEletronico6);
        usuario4.setEmail("Nenhum emprestimos associados ao item");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente10 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario19 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int20 = ordenaUsuarioReputacaoCrescente10.compare(usuario14, usuario19);
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str25 = usuario24.getTelefone();
        java.lang.String str26 = usuario24.getNome();
        lp2.projetofinal.entidades.Item item27 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo30 = new lp2.projetofinal.entidades.Emprestimo(usuario19, usuario24, item27, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario31 = emprestimo30.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro32 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario31.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro32);
        java.lang.String str34 = cartaoCaloteiro32.getNomeCartao();
        int int35 = cartaoCaloteiro32.prazoEmprestimo();
        usuario4.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro32);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente37 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario41 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str42 = usuario41.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int47 = ordenaUsuarioReputacaoCrescente37.compare(usuario41, usuario46);
        lp2.projetofinal.entidades.Usuario usuario51 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str52 = usuario51.getTelefone();
        java.lang.String str53 = usuario51.getNome();
        lp2.projetofinal.entidades.Item item54 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo57 = new lp2.projetofinal.entidades.Emprestimo(usuario46, usuario51, item54, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario61 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str62 = usuario61.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo64 = new lp2.projetofinal.entidades.Emprestimo(usuario51, usuario61, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente65 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str70 = usuario69.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario74 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int75 = ordenaUsuarioReputacaoCrescente65.compare(usuario69, usuario74);
        lp2.projetofinal.entidades.Usuario usuario79 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str80 = usuario79.getTelefone();
        java.lang.String str81 = usuario79.getNome();
        lp2.projetofinal.entidades.Item item82 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo85 = new lp2.projetofinal.entidades.Emprestimo(usuario74, usuario79, item82, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario86 = emprestimo85.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario87 = emprestimo85.getUsuarioRequerente();
        int int88 = usuario51.compareTo(usuario87);
        int int89 = ordenaUsuarioReputacaoDecrescente0.compare(usuario4, usuario87);
        usuario4.setTelefone("ROMANCE");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico6 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico6.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Caloteiro" + "'", str26, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Caloteiro" + "'", str34, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Caloteiro" + "'", str81, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario86);
        org.junit.Assert.assertNotNull(usuario87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens17 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray18 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet19 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet19, itemArray18);
        controllerItens17.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet26 = controllerUsuario24.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet26, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario34 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str35 = controllerUsuario34.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = controllerUsuario34.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet36, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str41 = controllerItens0.listarItensNaoEmprestados(itemSet36);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario42 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str43 = controllerUsuario42.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet44 = controllerUsuario42.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet44, "Lista de usuarios com reputacao negativa: ", (double) (-1.0f), "Nao emprestado", 1, "Nenhum item pego emprestado", "Nao emprestado", 5);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente53 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str58 = usuario57.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int63 = ordenaUsuarioReputacaoCrescente53.compare(usuario57, usuario62);
        lp2.projetofinal.entidades.Usuario usuario67 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str68 = usuario67.getTelefone();
        java.lang.String str69 = usuario67.getNome();
        lp2.projetofinal.entidades.Item item70 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo73 = new lp2.projetofinal.entidades.Emprestimo(usuario62, usuario67, item70, "OUTRO", 100);
        usuario62.setEmail("OUTRO");
        java.lang.String str76 = usuario62.getEmail();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet77 = usuario62.retornaSeusItens();
        controllerItens0.adicionaItem(itemSet77, "Nenhum item emprestado", (double) ' ', "Lista de usuarios com reputacao negativa: ", (int) (short) 10, "", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", 64);
        lp2.projetofinal.controllers.ControllerItens controllerItens86 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray87 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet88 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet88, itemArray87);
        controllerItens86.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet88, "Caloteiro", (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str95 = controllerItens0.getInfoItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet88, "", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(itemSet36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str41, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(itemSet44);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Caloteiro" + "'", str69, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "OUTRO" + "'", str76, "OUTRO");
        org.junit.Assert.assertNotNull(itemSet77);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos1 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie9 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str11 = bluRaySerie9.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos12 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay20 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean21 = bluRayShow19.equals((java.lang.Object) classificacaoBluRay20);
        bluRayShow19.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow31 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str32 = bluRayShow31.getNome();
        int int33 = ordenaItemNumeroEmprestimos12.compare((lp2.projetofinal.entidades.Item) bluRayShow19, (lp2.projetofinal.entidades.Item) bluRayShow31);
        int int34 = ordenaItemNumeroEmprestimos1.compare((lp2.projetofinal.entidades.Item) bluRaySerie9, (lp2.projetofinal.entidades.Item) bluRayShow31);
        java.lang.String str35 = bluRayShow31.getNomeArtista();
        java.lang.String str37 = bluRayShow31.getInfo("Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow44.atualizaNumeroEmprestimos();
        int int46 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow31, (lp2.projetofinal.entidades.Item) bluRayShow44);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator47 = ordenaItemPeloPreco0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator48 = ordenaItemPeloPreco0.reversed();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico52 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str53 = jogoEletronico52.getPlataforma();
        java.lang.String str54 = jogoEletronico52.getPlataforma();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie62 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int63 = bluRaySerie62.getNumeroEmprestimos();
        int int64 = bluRaySerie62.duracaoTotal();
        int int65 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoEletronico52, (lp2.projetofinal.entidades.Item) bluRaySerie62);
        java.lang.String str66 = jogoEletronico52.getEstado();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay20 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay20.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemComparator47);
        org.junit.Assert.assertNotNull(itemComparator48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "OUTRO" + "'", str53, "OUTRO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "OUTRO" + "'", str54, "OUTRO");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Nao emprestado" + "'", str66, "Nao emprestado");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("", "", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario7 = controllerUsuario0.identificaUsuario("Nao emprestado", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("POLICIAL", (double) (short) 10);
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico3 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator4 = ordenaItemEmprestadoAlfabetico3.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator5 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator6 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator7 = emprestimoComparator6.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator8 = emprestimoComparator6.reversed();
        boolean boolean9 = jogoTabuleiro2.equals((java.lang.Object) emprestimoComparator6);
        java.lang.String str10 = jogoTabuleiro2.getEstado();
        org.junit.Assert.assertNotNull(emprestimoComparator4);
        org.junit.Assert.assertNotNull(emprestimoComparator5);
        org.junit.Assert.assertNotNull(emprestimoComparator6);
        org.junit.Assert.assertNotNull(emprestimoComparator7);
        org.junit.Assert.assertNotNull(emprestimoComparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nao emprestado" + "'", str10, "Nao emprestado");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getDescricao();
        int int9 = bluRaySerie7.getNumeroTemporada();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.finalizar();
        java.lang.String str7 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarUsuario("", "", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.facade.Facade facade5 = new lp2.projetofinal.facade.Facade();
        facade5.fecharSistema();
        java.lang.String str8 = facade5.listarEmprestimosItem("OUTRO");
        facade5.resetarPersistencia();
        java.lang.String str10 = facade5.listarTop10Itens();
        boolean boolean11 = jogoEletronico3.equals((java.lang.Object) facade5);
        java.lang.String str12 = facade5.listarItensNaoEmprestados();
        facade5.iniciarSistema();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        double double12 = bluRaySerie7.getPreco();
        int int13 = bluRaySerie7.getNumeroTemporada();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        boolean boolean22 = emprestimo20.equals((java.lang.Object) (-1.0f));
        int int23 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo20.getUsuarioRequerente();
        lp2.projetofinal.controllers.Sistema sistema25 = new lp2.projetofinal.controllers.Sistema();
        sistema25.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str30 = sistema25.listarItensOrdenadosPorValor();
        java.lang.String str31 = sistema25.listarTop10PioresUsuarios();
        java.lang.String str32 = sistema25.listarTop10MelhoresUsuarios();
        sistema25.inicializar();
        boolean boolean34 = emprestimo20.equals((java.lang.Object) sistema25);
        java.lang.String str35 = sistema25.listarItensOrdenadosPorNome();
        java.lang.String str36 = sistema25.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema25.cadastrarBluRayShow("Emprestado", "DOCUMENTARIO", "BomAmigo", (double) (-37), (int) (short) 100, 35, "FreeRyder", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str31, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str32, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.atualizaNumeroEmprestimos();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Caloteiro, OUTRO, ");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("Nao emprestado");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("DOZE_ANOS");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        java.lang.String str14 = jogoTabuleiro3.getEstado();
        jogoTabuleiro3.adicionarPecaPerdida("");
        java.lang.Object obj17 = null;
        boolean boolean18 = jogoTabuleiro3.equals(obj17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Nao emprestado" + "'", str14, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Numero faixas invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str3 = jogoTabuleiro2.contemPecasPerdidas();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = ordenaUsuarioReputacaoCrescente4.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente5);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator7 = ordenaUsuarioReputacaoCrescente4.reversed();
        boolean boolean8 = jogoTabuleiro2.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente4);
        jogoTabuleiro2.adicionarPecaPerdida("Nenhum emprestimos associados ao item");
        java.lang.String str11 = jogoTabuleiro2.getEstado();
        java.lang.String str13 = jogoTabuleiro2.getInfo("COM PECAS PERDIDAS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COMPLETO" + "'", str3, "COMPLETO");
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertNotNull(usuarioComparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nao emprestado" + "'", str11, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade21 = usuario9.getCartao();
        int int22 = cartaoFidelidade21.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(cartaoFidelidade21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("DOZE_ANOS", "LIVRE");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        int int9 = bluRayShow6.getNumeroEmprestimos();
        java.lang.String str11 = bluRayShow6.getInfo("EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        sistema0.cadastrarUsuario("1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", "QUATORZE_ANOS", "DEZESSEIS_ANOS", (double) 52, "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", (int) (short) 1, "hi!", "XBOX360", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str6 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("NINTENDO 3DS", "ROMANCE", "Lista de usuarios com reputacao negativa: ", 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico0 = lp2.projetofinal.enums.PlataformaJogoEletronico.XBOX360;
        java.lang.String str1 = plataformaJogoEletronico0.getPlataforma();
        java.lang.String str2 = plataformaJogoEletronico0.getPlataforma();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico0 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.XBOX360 + "'", plataformaJogoEletronico0.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.XBOX360));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XBOX360" + "'", str1, "XBOX360");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XBOX360" + "'", str2, "XBOX360");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        facade0.resetarPersistencia();
        facade0.iniciarSistema();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str4 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoItem("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str25 = usuario24.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo27 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario24, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.entidades.BluRayShow bluRayShow34 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        bluRayShow34.atualizaNumeroEmprestimos();
        int int36 = bluRayShow34.getNumFaixas();
        boolean boolean37 = emprestimo27.equals((java.lang.Object) bluRayShow34);
        lp2.projetofinal.entidades.Usuario usuario38 = emprestimo27.getUsuarioRequerente();
        emprestimo27.setDataDevolucao("DOZE_ANOS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(usuario38);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo(100.0d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("hi!", "XBOX360", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        facade0.resetarPersistencia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "Caloteiro, OUTRO, ", 10.0d, "COMPLETO", 10, "Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(4);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarCaloteiros();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("DOZE_ANOS", "QUATORZE_ANOS", "hi!", 0.0d, (-1), "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "DEZOITO_ANOS", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str6 = facade0.listarCaloteiros();
        facade0.cadastrarUsuario("Nenhum emprestimos associados ao item", "ROMANCE", "1:  - Reputacao: 0,00|");
        java.lang.String str11 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "Nenhum item emprestado, OUTRO, ", "1: ROMANCE - Reputacao: 0,00|", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str14 = bluRayShow6.getNome();
        int int15 = bluRayShow6.getNumFaixas();
        bluRayShow6.setNome("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OUTRO" + "'", str14, "OUTRO");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        java.lang.String str10 = controllerItens0.listarTop10Itens(itemSet9);
        lp2.projetofinal.controllers.ControllerItens controllerItens11 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray12 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet13 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet13, itemArray12);
        controllerItens11.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet13, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario18 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str19 = controllerUsuario18.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet20 = controllerUsuario18.todosUsuariosItens();
        controllerItens11.adicionaItem(itemSet20, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens28 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray29 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet30 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet30, itemArray29);
        controllerItens28.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet30, "Caloteiro", (-1.0d));
        java.lang.String str35 = controllerItens11.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet30);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet30, "hi!", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(itemSet20);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str35, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Nenhum item pego emprestado", (double) (-11));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        sistema0.cadastrarUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = sistema0.listarCaloteiros();
        java.lang.String str12 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("LIVRE", "1: Caloteiro - Reputacao: 0,00|", "Nenhum item pego emprestado", 0.0d, "DOCUMENTARIO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str11, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        java.lang.String str9 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str10 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) 0L, "NINTENDO 3DS", 14, "Noob", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str9, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        java.lang.String str10 = sistema0.listarEmprestimosItem("Emprestado");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "Noob", "Nenhum item emprestado", (-32.0d), "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str10, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) (-4), (int) (short) -1, "Nenhum item pego emprestado", "COMPLETO", 14);
        java.lang.Class<?> wildcardClass7 = bluRayFilme6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("PS3", (double) 4);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str6 = facade0.listarCaloteiros();
        java.lang.String str7 = facade0.listarTop10PioresUsuarios();
        java.lang.String str8 = facade0.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        java.lang.String str9 = sistema0.listarCaloteiros();
        java.lang.String str10 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "QUATORZE_ANOS", (double) 1.0f, (-18), (int) (short) 100, "1: COMPLETO - Reputacao: 0,00|", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str10, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        java.lang.String str5 = jogoEletronico3.getPlataforma();
        java.lang.String str6 = jogoEletronico3.getPlataforma();
        java.lang.String str7 = jogoEletronico3.getPlataforma();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUTRO" + "'", str6, "OUTRO");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos20 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie28 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str30 = bluRaySerie28.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos31 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow38 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay39 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean40 = bluRayShow38.equals((java.lang.Object) classificacaoBluRay39);
        bluRayShow38.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow50 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str51 = bluRayShow50.getNome();
        int int52 = ordenaItemNumeroEmprestimos31.compare((lp2.projetofinal.entidades.Item) bluRayShow38, (lp2.projetofinal.entidades.Item) bluRayShow50);
        int int53 = ordenaItemNumeroEmprestimos20.compare((lp2.projetofinal.entidades.Item) bluRaySerie28, (lp2.projetofinal.entidades.Item) bluRayShow50);
        bluRaySerie28.itemDevolvido();
        bluRaySerie28.itemEmprestado();
        int int56 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie28);
        bluRaySerie28.atualizaNumeroEmprestimos();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario58 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str59 = controllerUsuario58.listarCaloteiros();
        java.lang.String str60 = controllerUsuario58.listarTop10MelhoresUsuarios();
        controllerUsuario58.carregaMapaUsuarios();
        java.lang.String str62 = controllerUsuario58.listarTop10PioresUsuarios();
        controllerUsuario58.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str67 = controllerUsuario58.listarCaloteiros();
        controllerUsuario58.carregaMapaUsuarios();
        boolean boolean69 = bluRaySerie28.equals((java.lang.Object) controllerUsuario58);
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario58.removerUsuario("DEZ_ANOS", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-11) + "'", int19 == (-11));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay39 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay39.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Caloteiro" + "'", str51, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-11) + "'", int56 == (-11));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str59, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str67, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico5 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean6 = usuario3.equals((java.lang.Object) plataformaJogoEletronico5);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str12 = usuario11.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int17 = ordenaUsuarioReputacaoCrescente7.compare(usuario11, usuario16);
        lp2.projetofinal.entidades.Usuario usuario21 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str22 = usuario21.getTelefone();
        java.lang.String str23 = usuario21.getNome();
        lp2.projetofinal.entidades.Item item24 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo27 = new lp2.projetofinal.entidades.Emprestimo(usuario16, usuario21, item24, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario28 = emprestimo27.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario29 = emprestimo27.getUsuarioRequerente();
        usuario29.setEmail("Nao emprestado");
        int int32 = usuario3.compareTo(usuario29);
        java.lang.String str33 = usuario29.toString();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Caloteiro" + "'", str23, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertNotNull(usuario29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Caloteiro, Nao emprestado, " + "'", str33, "Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str6 = facade0.listarEmprestimosItem("Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.pesquisarDetalhesItem("1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie41 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str42 = bluRaySerie41.getEstado();
        java.lang.String str43 = bluRaySerie41.getGenero();
        java.lang.String str44 = bluRaySerie41.getEstado();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos45 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow52 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay53 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean54 = bluRayShow52.equals((java.lang.Object) classificacaoBluRay53);
        bluRayShow52.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow64 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str65 = bluRayShow64.getNome();
        int int66 = ordenaItemNumeroEmprestimos45.compare((lp2.projetofinal.entidades.Item) bluRayShow52, (lp2.projetofinal.entidades.Item) bluRayShow64);
        int int67 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie41, (lp2.projetofinal.entidades.Item) bluRayShow64);
        bluRaySerie41.atualizar("Caloteiro, OUTRO, ", "PC");
        int int71 = bluRaySerie41.duracaoTotal();
        bluRaySerie41.adicionarBluRay((-4));
        int int74 = bluRaySerie41.getNumeroTemporada();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Nao emprestado" + "'", str42, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ROMANCE" + "'", str43, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Nao emprestado" + "'", str44, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay53 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay53.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Caloteiro" + "'", str65, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarTop10Itens();
        facade0.resetarPersistencia();
        java.lang.Class<?> wildcardClass7 = facade0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = ordenaUsuarioReputacaoCrescente1.reversed();
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = controllerUsuario0.getInfoUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Caloteiro", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "XBOX360", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("POLICIAL", 0.0d, (-15), "Nenhum item emprestado", "", (int) '#');
        java.lang.String str7 = bluRayFilme6.getEstado();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nao emprestado" + "'", str7, "Nao emprestado");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator1 = ordenaItemEmprestadoAlfabetico0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator2 = emprestimoComparator1.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator3 = emprestimoComparator2.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator4 = emprestimoComparator2.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator5 = emprestimoComparator2.reversed();
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertNotNull(emprestimoComparator2);
        org.junit.Assert.assertNotNull(emprestimoComparator3);
        org.junit.Assert.assertNotNull(emprestimoComparator4);
        org.junit.Assert.assertNotNull(emprestimoComparator5);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean1 = cartaoBomAmigo0.permisaoPegarEmprestado();
        java.lang.String str2 = cartaoBomAmigo0.getNomeCartao();
        java.lang.String str3 = cartaoBomAmigo0.getNomeCartao();
        java.lang.String str4 = cartaoBomAmigo0.getNomeCartao();
        boolean boolean5 = cartaoBomAmigo0.permisaoPegarEmprestado();
        java.lang.String str6 = cartaoBomAmigo0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BomAmigo" + "'", str2, "BomAmigo");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BomAmigo" + "'", str3, "BomAmigo");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BomAmigo" + "'", str4, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "BomAmigo" + "'", str6, "BomAmigo");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario17 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str18 = controllerUsuario17.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet19 = controllerUsuario17.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet19, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente24 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str29 = usuario28.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario33 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int34 = ordenaUsuarioReputacaoCrescente24.compare(usuario28, usuario33);
        lp2.projetofinal.entidades.Usuario usuario38 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str39 = usuario38.getTelefone();
        java.lang.String str40 = usuario38.getNome();
        lp2.projetofinal.entidades.Item item41 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo44 = new lp2.projetofinal.entidades.Emprestimo(usuario33, usuario38, item41, "OUTRO", 100);
        java.lang.String str45 = usuario38.getNome();
        java.lang.String str46 = usuario38.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet47 = usuario38.retornaSeusItens();
        java.lang.String str48 = controllerItens0.listarTop10Itens(itemSet47);
        lp2.projetofinal.controllers.ControllerItens controllerItens49 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray50 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet51 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet51, itemArray50);
        controllerItens49.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet51, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario56 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str57 = controllerUsuario56.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet58 = controllerUsuario56.todosUsuariosItens();
        controllerItens49.adicionaItem(itemSet58, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens66 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario67 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str68 = controllerUsuario67.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet69 = controllerUsuario67.todosUsuariosItens();
        controllerItens66.adicionaItem(itemSet69, "Nenhum emprestimos associados ao item", (double) 100);
        java.lang.String str73 = controllerItens49.listarItensOrdenadosPorNome(itemSet69);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario74 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario74.salvarMapaUsuarios();
        controllerUsuario74.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario74.cadastrarUsuario("NINTENDO 3DS", "POLICIAL", "Nao emprestado");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet84 = controllerUsuario74.todosUsuariosItens();
        controllerItens49.adicionaItem(itemSet84, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
        controllerItens0.adicionaItem(itemSet84, "1: OUTRO - Reputacao: 0,00|", (double) (-1), (-15), (int) '#', "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "PC");
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(itemSet19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Caloteiro" + "'", str40, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Caloteiro" + "'", str45, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro, OUTRO, " + "'", str46, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(itemSet58);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(itemSet69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|" + "'", str73, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemSet84);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoUsuario("DOCUMENTARIO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "LIVRE", "DEZ_ANOS", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str6 = facade0.listarEmprestimosItem("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", (double) (byte) 10, 0, 10, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.pesquisarDetalhesItem("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "DOCUMENTARIO", "1:  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente21 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario25 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str26 = usuario25.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int31 = ordenaUsuarioReputacaoCrescente21.compare(usuario25, usuario30);
        int int32 = usuario14.compareTo(usuario30);
        double double33 = usuario14.getReputacao();
        lp2.projetofinal.entidades.BluRayShow bluRayShow40 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay41 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean42 = bluRayShow40.equals((java.lang.Object) classificacaoBluRay41);
        bluRayShow40.atualizar("hi!", "OUTRO");
        java.lang.String str46 = bluRayShow40.getNome();
        bluRayShow40.atualizar("Lista de usuarios com reputacao negativa: ", "Caloteiro");
        boolean boolean50 = usuario14.equals((java.lang.Object) bluRayShow40);
        bluRayShow40.atualizar("1: COMPLETO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = bluRayShow40.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + classificacaoBluRay41 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay41.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro" + "'", str46, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str11 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("Caloteiro, MUSICAL, ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "LIVRE", "FreeRyder", "PC", "1:  - Reputacao: 0,00|", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str10, "1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator34 = ordenaItemNumeroEmprestimos0.reversed();
        lp2.projetofinal.entidades.BluRayShow bluRayShow41 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente42 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean43 = bluRayShow41.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente42);
        double double44 = bluRayShow41.getPreco();
        int int45 = bluRayShow41.getNumFaixas();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico49 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str50 = jogoEletronico49.getPlataforma();
        java.lang.String str51 = jogoEletronico49.toString();
        java.lang.String str52 = jogoEletronico49.toString();
        int int53 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow41, (lp2.projetofinal.entidades.Item) jogoEletronico49);
        lp2.projetofinal.entidades.BluRayShow bluRayShow60 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay61 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean62 = bluRayShow60.equals((java.lang.Object) classificacaoBluRay61);
        bluRayShow60.atualizar("hi!", "OUTRO");
        double double66 = bluRayShow60.getPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro69 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str70 = jogoTabuleiro69.contemPecasPerdidas();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente71 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente72 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator73 = ordenaUsuarioReputacaoCrescente71.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente72);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator74 = ordenaUsuarioReputacaoCrescente71.reversed();
        boolean boolean75 = jogoTabuleiro69.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente71);
        jogoTabuleiro69.adicionarPecaPerdida("Nenhum emprestimos associados ao item");
        java.lang.Object obj78 = null;
        boolean boolean79 = jogoTabuleiro69.equals(obj78);
        int int80 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow60, (lp2.projetofinal.entidades.Item) jogoTabuleiro69);
        jogoTabuleiro69.adicionarPecaPerdida("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        java.lang.String str83 = jogoTabuleiro69.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemComparator34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "OUTRO" + "'", str50, "OUTRO");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str51, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str52, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + classificacaoBluRay61 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay61.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "COMPLETO" + "'", str70, "COMPLETO");
        org.junit.Assert.assertNotNull(usuarioComparator73);
        org.junit.Assert.assertNotNull(usuarioComparator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS" + "'", str83, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = usuarioComparator2.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = ordenaUsuarioReputacaoCrescente4.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente5);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator7 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator8 = ordenaUsuarioReputacaoCrescente4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator9 = usuarioComparator2.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente4);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator10 = usuarioComparator9.reversed();
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertNotNull(usuarioComparator7);
        org.junit.Assert.assertNotNull(usuarioComparator8);
        org.junit.Assert.assertNotNull(usuarioComparator9);
        org.junit.Assert.assertNotNull(usuarioComparator10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str9 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.getInfoUsuario("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("DEZESSEIS_ANOS", "hi!", "COMPLETO", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        java.lang.String str34 = bluRaySerie8.getNome();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente35 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente36 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator37 = ordenaUsuarioReputacaoCrescente35.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente36);
        lp2.projetofinal.entidades.Usuario usuario41 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico43 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean44 = usuario41.equals((java.lang.Object) plataformaJogoEletronico43);
        lp2.projetofinal.entidades.Usuario usuario48 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str49 = usuario48.getTelefone();
        int int50 = ordenaUsuarioReputacaoCrescente35.compare(usuario41, usuario48);
        boolean boolean51 = bluRaySerie8.equals((java.lang.Object) int50);
        java.lang.String str52 = bluRaySerie8.getGenero();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertNotNull(usuarioComparator37);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico43 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico43.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ROMANCE" + "'", str52, "ROMANCE");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("Nenhum item emprestado, OUTRO, ");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        boolean boolean3 = cartaoNoob0.permisaoPegarEmprestado();
        boolean boolean4 = cartaoNoob0.permisaoPegarEmprestado();
        java.lang.String str5 = cartaoNoob0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Noob" + "'", str5, "Noob");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.cadastrarUsuario("Caloteiro, MUSICAL, ", "Caloteiro, MUSICAL, ", "Lista de usuarios com reputacao negativa: ");
        java.lang.String str8 = facade0.listarTop10PioresUsuarios();
        java.lang.String str9 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facade0.getInfoItem("Noob", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|" + "'", str8, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", (double) ' ', (int) (short) -1, "PS3", "COMPLETO", 14);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos22 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie30 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str32 = bluRaySerie30.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos33 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow40 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay41 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean42 = bluRayShow40.equals((java.lang.Object) classificacaoBluRay41);
        bluRayShow40.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow52 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str53 = bluRayShow52.getNome();
        int int54 = ordenaItemNumeroEmprestimos33.compare((lp2.projetofinal.entidades.Item) bluRayShow40, (lp2.projetofinal.entidades.Item) bluRayShow52);
        int int55 = ordenaItemNumeroEmprestimos22.compare((lp2.projetofinal.entidades.Item) bluRaySerie30, (lp2.projetofinal.entidades.Item) bluRayShow52);
        bluRaySerie30.itemDevolvido();
        bluRaySerie30.itemEmprestado();
        lp2.projetofinal.entidades.BluRayShow bluRayShow64 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente65 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean66 = bluRayShow64.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente65);
        int int67 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie30, (lp2.projetofinal.entidades.Item) bluRayShow64);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator68 = ordenaItemNumeroEmprestimos0.reversed();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie76 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str77 = bluRaySerie76.getEstado();
        java.lang.String str78 = bluRaySerie76.getGenero();
        bluRaySerie76.adicionarBluRay((int) (byte) 0);
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme87 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str88 = bluRayFilme87.getGenero();
        int int89 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie76, (lp2.projetofinal.entidades.Item) bluRayFilme87);
        bluRaySerie76.atualizar("Lista de usuarios com reputacao negativa: ", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay8 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay8.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay41 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay41.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemComparator68);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Nao emprestado" + "'", str77, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ROMANCE" + "'", str78, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "OUTRO" + "'", str88, "OUTRO");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str6 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("DEZOITO_ANOS", "DEZ_ANOS", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", (double) (-4), "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", (int) (short) 10, "OUTRO", "DEZ_ANOS", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "COMPLETO", "ROMANCE", "Nao emprestado", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        facade0.resetarPersistencia();
        java.lang.String str11 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("Nenhum item emprestado", "1: Caloteiro - Reputacao: 0,00|", "NINTENDO 3DS");
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "LIVRE", "", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        java.lang.String str7 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "ROMANCE", "Noob", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((-37));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (double) (-11), (int) (short) 0, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (int) '#');
        java.lang.String str7 = bluRayShow6.getEstado();
        java.lang.String str9 = bluRayShow6.getInfo("1:  - Reputacao: 0,00|");
        java.lang.String str10 = bluRayShow6.getNomeArtista();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nao emprestado" + "'", str7, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro" + "'", str10, "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens1 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario2 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str3 = controllerUsuario2.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet4 = controllerUsuario2.todosUsuariosItens();
        controllerItens1.adicionaItem(itemSet4, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens8 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray9 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet10 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet10, itemArray9);
        controllerItens8.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet10, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario15 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str16 = controllerUsuario15.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario15.todosUsuariosItens();
        controllerItens8.adicionaItem(itemSet17, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario25 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str26 = controllerUsuario25.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet27 = controllerUsuario25.todosUsuariosItens();
        controllerItens8.adicionaItem(itemSet27, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str34 = controllerItens1.getInfoItem(itemSet27, "Nao emprestado", "POLICIAL");
        java.lang.String str35 = controllerItens0.listarItensNaoEmprestados(itemSet27);
        lp2.projetofinal.controllers.ControllerItens controllerItens36 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray37 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet38 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet38, itemArray37);
        controllerItens36.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet38, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario43 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str44 = controllerUsuario43.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet45 = controllerUsuario43.todosUsuariosItens();
        controllerItens36.adicionaItem(itemSet45, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens53 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario54 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str55 = controllerUsuario54.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet56 = controllerUsuario54.todosUsuariosItens();
        controllerItens53.adicionaItem(itemSet56, "Nenhum emprestimos associados ao item", (double) 100);
        java.lang.String str60 = controllerItens36.listarItensOrdenadosPorNome(itemSet56);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item62 = controllerItens0.identificaItem(itemSet56, "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(itemSet4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(itemSet17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str35, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(itemSet45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(itemSet56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|" + "'", str60, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente2 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str7 = usuario6.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int12 = ordenaUsuarioReputacaoCrescente2.compare(usuario6, usuario11);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        java.lang.String str18 = usuario16.getNome();
        lp2.projetofinal.entidades.Item item19 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo22 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario16, item19, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente23 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int33 = ordenaUsuarioReputacaoCrescente23.compare(usuario27, usuario32);
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        java.lang.String str39 = usuario37.getNome();
        lp2.projetofinal.entidades.Item item40 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario32, usuario37, item40, "OUTRO", 100);
        usuario37.atualizaReputacao((double) (short) -1, false);
        int int47 = ordenaUsuarioReputacaoCrescente1.compare(usuario11, usuario37);
        java.lang.String str48 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        java.lang.String str50 = controllerEmprestimos0.listarEmprestimosItens("QUATORZE_ANOS");
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente52 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente53 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str58 = usuario57.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int63 = ordenaUsuarioReputacaoCrescente53.compare(usuario57, usuario62);
        lp2.projetofinal.entidades.Usuario usuario67 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str68 = usuario67.getTelefone();
        java.lang.String str69 = usuario67.getNome();
        lp2.projetofinal.entidades.Item item70 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo73 = new lp2.projetofinal.entidades.Emprestimo(usuario62, usuario67, item70, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente74 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario78 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str79 = usuario78.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario83 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int84 = ordenaUsuarioReputacaoCrescente74.compare(usuario78, usuario83);
        lp2.projetofinal.entidades.Usuario usuario88 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str89 = usuario88.getTelefone();
        java.lang.String str90 = usuario88.getNome();
        lp2.projetofinal.entidades.Item item91 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo94 = new lp2.projetofinal.entidades.Emprestimo(usuario83, usuario88, item91, "OUTRO", 100);
        usuario88.atualizaReputacao((double) (short) -1, false);
        int int98 = ordenaUsuarioReputacaoCrescente52.compare(usuario62, usuario88);
        java.lang.String str99 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario88);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Nenhum item pego emprestado" + "'", str48, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str50, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Caloteiro" + "'", str69, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Caloteiro" + "'", str90, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "Nenhum item pego emprestado" + "'", str99, "Nenhum item pego emprestado");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        sistema0.resetarPersistencia();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.listarEmprestimosUsuarioEmprestando("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("DOZE_ANOS", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO");
        java.lang.String str3 = chaveNomeTelefone2.getTelefone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO" + "'", str3, "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("", "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "Nenhum item emprestado, OUTRO, ", (double) (-1), (int) (short) 10, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "1: OUTRO - Reputacao: 0,00|", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        java.lang.String str10 = sistema0.listarEmprestimosItem("Emprestado");
        sistema0.resetarPersistencia();
        java.lang.String str12 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Nenhum item emprestado, OUTRO, ", "AVENTURA", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str10, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        facade0.resetarPersistencia();
        java.lang.String str11 = facade0.listarItensEmprestados();
        java.lang.String str12 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facade0.getInfoUsuario("COM PECAS PERDIDAS", "", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        sistema0.cadastrarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DOZE_ANOS", "Caloteiro, Nao emprestado, ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("Nenhum item pego emprestado", "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", "PS3", (double) 0L, 0, "", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos1 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie9 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str11 = bluRaySerie9.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos12 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay20 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean21 = bluRayShow19.equals((java.lang.Object) classificacaoBluRay20);
        bluRayShow19.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow31 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str32 = bluRayShow31.getNome();
        int int33 = ordenaItemNumeroEmprestimos12.compare((lp2.projetofinal.entidades.Item) bluRayShow19, (lp2.projetofinal.entidades.Item) bluRayShow31);
        int int34 = ordenaItemNumeroEmprestimos1.compare((lp2.projetofinal.entidades.Item) bluRaySerie9, (lp2.projetofinal.entidades.Item) bluRayShow31);
        java.lang.String str35 = bluRayShow31.getNomeArtista();
        java.lang.String str37 = bluRayShow31.getInfo("Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow44.atualizaNumeroEmprestimos();
        int int46 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow31, (lp2.projetofinal.entidades.Item) bluRayShow44);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator47 = ordenaItemPeloPreco0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator48 = ordenaItemPeloPreco0.reversed();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico52 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str53 = jogoEletronico52.getPlataforma();
        java.lang.String str54 = jogoEletronico52.getPlataforma();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie62 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int63 = bluRaySerie62.getNumeroEmprestimos();
        int int64 = bluRaySerie62.duracaoTotal();
        int int65 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoEletronico52, (lp2.projetofinal.entidades.Item) bluRaySerie62);
        java.lang.String str66 = jogoEletronico52.getNome();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay20 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay20.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemComparator47);
        org.junit.Assert.assertNotNull(itemComparator48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "OUTRO" + "'", str53, "OUTRO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "OUTRO" + "'", str54, "OUTRO");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        facade0.fecharSistema();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str6 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("COMPLETO", "COMPLETO", "DOCUMENTARIO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("POLICIAL", (double) (-37), (int) (short) 100, "QUATORZE_ANOS", "Lista de usuarios com reputacao negativa: ", (int) '#');
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie14 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str16 = bluRaySerie14.getInfo("Nao emprestado");
        lp2.projetofinal.controllers.ControllerItens controllerItens17 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray18 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet19 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet19, itemArray18);
        controllerItens17.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet26 = controllerUsuario24.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet26, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario34 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str35 = controllerUsuario34.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = controllerUsuario34.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet36, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.controllers.ControllerItens controllerItens41 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray42 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet43 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet43, itemArray42);
        controllerItens41.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet43, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario48 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str49 = controllerUsuario48.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet50 = controllerUsuario48.todosUsuariosItens();
        controllerItens41.adicionaItem(itemSet50, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens58 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray59 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet60 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet60, itemArray59);
        controllerItens58.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet60, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario65 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str66 = controllerUsuario65.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet67 = controllerUsuario65.todosUsuariosItens();
        controllerItens58.adicionaItem(itemSet67, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario75 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str76 = controllerUsuario75.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet77 = controllerUsuario75.todosUsuariosItens();
        controllerItens58.adicionaItem(itemSet77, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str82 = controllerItens41.listarItensNaoEmprestados(itemSet77);
        controllerItens17.adicionaItem(itemSet77, "DOZE_ANOS", (double) (byte) 100);
        boolean boolean86 = bluRaySerie14.equals((java.lang.Object) "DOZE_ANOS");
        boolean boolean87 = bluRayFilme6.equals((java.lang.Object) "DOZE_ANOS");
        bluRayFilme6.itemDevolvido();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(itemSet36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(itemSet67);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(itemSet77);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str82, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.finalizar();
        java.lang.String str15 = sistema3.listarEmprestimosItem("Nao emprestado");
        // The following exception was thrown during execution in test generation
        try {
            sistema3.removerUsuario("LIVRE", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("DEZ_ANOS", "DOCUMENTARIO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.cadastrarUsuario("Caloteiro, MUSICAL, ", "Caloteiro, MUSICAL, ", "Lista de usuarios com reputacao negativa: ");
        java.lang.String str8 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facade0.listarEmprestimosUsuarioEmprestando("ROMANCE", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|" + "'", str8, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro36 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        jogoTabuleiro36.itemEmprestado();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos38 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie46 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str48 = bluRaySerie46.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos49 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow56 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay57 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean58 = bluRayShow56.equals((java.lang.Object) classificacaoBluRay57);
        bluRayShow56.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow68 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str69 = bluRayShow68.getNome();
        int int70 = ordenaItemNumeroEmprestimos49.compare((lp2.projetofinal.entidades.Item) bluRayShow56, (lp2.projetofinal.entidades.Item) bluRayShow68);
        int int71 = ordenaItemNumeroEmprestimos38.compare((lp2.projetofinal.entidades.Item) bluRaySerie46, (lp2.projetofinal.entidades.Item) bluRayShow68);
        bluRaySerie46.itemDevolvido();
        int int73 = bluRaySerie46.getNumeroEmprestimos();
        bluRaySerie46.adicionarBluRay(52);
        int int76 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro36, (lp2.projetofinal.entidades.Item) bluRaySerie46);
        lp2.projetofinal.entidades.BluRayShow bluRayShow83 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        bluRayShow83.atualizaNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie92 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie92.adicionarBluRay((-11));
        int int95 = bluRaySerie92.duracaoTotal();
        java.lang.String str96 = bluRaySerie92.getGenero();
        int int97 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow83, (lp2.projetofinal.entidades.Item) bluRaySerie92);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay57 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay57.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Caloteiro" + "'", str69, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-11) + "'", int95 == (-11));
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "OUTRO" + "'", str96, "OUTRO");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo(100);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        facade0.resetarPersistencia();
        java.lang.String str11 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("Nenhum item emprestado", "1: Caloteiro - Reputacao: 0,00|", "NINTENDO 3DS");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("PS3");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarTop10Itens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        facade0.fecharSistema();
        java.lang.String str13 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, Nao emprestado, ", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("", "MUSICAL", "Nenhum item emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: Caloteiro - Reputacao: 0,00|", "1: COMPLETO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.pesquisarDetalhesItem("hi!", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro22 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario21.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro22);
        java.lang.String str24 = cartaoCaloteiro22.getNomeCartao();
        int int25 = cartaoCaloteiro22.prazoEmprestimo();
        int int26 = cartaoCaloteiro22.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Caloteiro" + "'", str24, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico4 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str5 = jogoEletronico4.getPlataforma();
        java.lang.String str6 = jogoEletronico4.getPlataforma();
        jogoEletronico4.itemDevolvido();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro10 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        jogoTabuleiro10.adicionarPecaPerdida("Caloteiro, Nao emprestado, ");
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoEletronico4, (lp2.projetofinal.entidades.Item) jogoTabuleiro10);
        jogoTabuleiro10.adicionarPecaPerdida("Lista de usuarios com reputacao negativa: ");
        jogoTabuleiro10.itemDevolvido();
        jogoTabuleiro10.itemDevolvido();
        java.lang.String str18 = jogoTabuleiro10.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUTRO" + "'", str6, "OUTRO");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS" + "'", str18, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet4 = controllerUsuario0.todosUsuariosItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet5 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet4);
        org.junit.Assert.assertNotNull(itemSet5);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("DOCUMENTARIO", "Nenhum item emprestado", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str25 = usuario24.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo27 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario24, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.entidades.Usuario usuario28 = emprestimo27.getDonoDoItem();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario29 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str30 = controllerUsuario29.listarTop10PioresUsuarios();
        java.lang.String str31 = controllerUsuario29.listarCaloteiros();
        java.lang.String str32 = controllerUsuario29.listarTop10PioresUsuarios();
        boolean boolean33 = emprestimo27.equals((java.lang.Object) controllerUsuario29);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario36 = controllerUsuario29.identificaUsuario("Nao emprestado", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str31, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie41 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str42 = bluRaySerie41.getEstado();
        java.lang.String str43 = bluRaySerie41.getGenero();
        java.lang.String str44 = bluRaySerie41.getEstado();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos45 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow52 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay53 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean54 = bluRayShow52.equals((java.lang.Object) classificacaoBluRay53);
        bluRayShow52.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow64 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str65 = bluRayShow64.getNome();
        int int66 = ordenaItemNumeroEmprestimos45.compare((lp2.projetofinal.entidades.Item) bluRayShow52, (lp2.projetofinal.entidades.Item) bluRayShow64);
        int int67 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie41, (lp2.projetofinal.entidades.Item) bluRayShow64);
        bluRaySerie41.atualizar("Caloteiro, OUTRO, ", "PC");
        java.lang.String str71 = bluRaySerie41.getGenero();
        bluRaySerie41.adicionarBluRay((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Nao emprestado" + "'", str42, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ROMANCE" + "'", str43, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Nao emprestado" + "'", str44, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay53 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay53.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Caloteiro" + "'", str65, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ROMANCE" + "'", str71, "ROMANCE");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "Caloteiro");
        usuario3.setTelefone("Noob");
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico11 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean12 = usuario9.equals((java.lang.Object) plataformaJogoEletronico11);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente13 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str18 = usuario17.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario22 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int23 = ordenaUsuarioReputacaoCrescente13.compare(usuario17, usuario22);
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        java.lang.String str29 = usuario27.getNome();
        lp2.projetofinal.entidades.Item item30 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo33 = new lp2.projetofinal.entidades.Emprestimo(usuario22, usuario27, item30, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario34 = emprestimo33.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario35 = emprestimo33.getUsuarioRequerente();
        usuario35.setEmail("Nao emprestado");
        int int38 = usuario9.compareTo(usuario35);
        java.lang.String str39 = usuario9.getNome();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos40 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie48 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str50 = bluRaySerie48.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos51 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow58 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay59 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean60 = bluRayShow58.equals((java.lang.Object) classificacaoBluRay59);
        bluRayShow58.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow70 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str71 = bluRayShow70.getNome();
        int int72 = ordenaItemNumeroEmprestimos51.compare((lp2.projetofinal.entidades.Item) bluRayShow58, (lp2.projetofinal.entidades.Item) bluRayShow70);
        int int73 = ordenaItemNumeroEmprestimos40.compare((lp2.projetofinal.entidades.Item) bluRaySerie48, (lp2.projetofinal.entidades.Item) bluRayShow70);
        java.lang.String str74 = bluRaySerie48.getNome();
        bluRaySerie48.setNome("COMPLETO");
        java.lang.String str77 = bluRaySerie48.getNome();
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario9, (lp2.projetofinal.entidades.Item) bluRaySerie48, "Caloteiro, OUTRO, ", (-11));
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade81 = usuario9.getCartao();
        usuario9.setNome("Nenhum item emprestado");
        java.lang.String str84 = usuario9.getEmail();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico11 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico11.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Caloteiro" + "'", str29, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario34);
        org.junit.Assert.assertNotNull(usuario35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay59 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay59.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro" + "'", str71, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Noob" + "'", str74, "Noob");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "COMPLETO" + "'", str77, "COMPLETO");
        org.junit.Assert.assertNotNull(cartaoFidelidade81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "OUTRO" + "'", str84, "OUTRO");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.resetarPersistencia();
        sistema3.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = sistema3.listarEmprestimosUsuarioEmprestando("COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str6 = facade0.listarCaloteiros();
        facade0.cadastrarUsuario("Nenhum emprestimos associados ao item", "ROMANCE", "1:  - Reputacao: 0,00|");
        java.lang.String str11 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("", "ROMANCE", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = ordenaUsuarioReputacaoCrescente0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator4 = usuarioComparator3.reversed();
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertNotNull(usuarioComparator4);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico8 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean9 = usuario6.equals((java.lang.Object) plataformaJogoEletronico8);
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str14 = usuario13.getTelefone();
        int int15 = ordenaUsuarioReputacaoCrescente0.compare(usuario6, usuario13);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente16 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario20 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str21 = usuario20.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario25 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int26 = ordenaUsuarioReputacaoCrescente16.compare(usuario20, usuario25);
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str31 = usuario30.getTelefone();
        java.lang.String str32 = usuario30.getNome();
        lp2.projetofinal.entidades.Item item33 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo36 = new lp2.projetofinal.entidades.Emprestimo(usuario25, usuario30, item33, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario37 = emprestimo36.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro38 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario37.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro38);
        java.lang.String str40 = cartaoCaloteiro38.getNomeCartao();
        boolean boolean41 = cartaoCaloteiro38.permisaoPegarEmprestado();
        usuario13.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro38);
        boolean boolean43 = cartaoCaloteiro38.permisaoPegarEmprestado();
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Caloteiro" + "'", str40, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("AVENTURA");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str9 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "ROMANCE", "DOCUMENTARIO", (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.pesquisarDetalhesItem("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str5 = facade0.listarEmprestimosItem("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
        facade0.iniciarSistema();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str5, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens7 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray8 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet9 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet9, itemArray8);
        controllerItens7.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet9, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario14 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str15 = controllerUsuario14.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet16 = controllerUsuario14.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet16, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens0.adicionaItem(itemSet16, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario32 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario32.cadastrarUsuario("", "", "OUTRO");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet37 = controllerUsuario32.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item39 = controllerItens0.identificaItem(itemSet37, "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertNotNull(itemSet37);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(52);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", (double) 0, (-11), "DEZ_ANOS", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", (-37));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("LIVRE", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "DOZE_ANOS", (double) (byte) 1, "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("POLICIAL");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        facade0.resetarPersistencia();
        java.lang.String str11 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("Nenhum item emprestado", "1: Caloteiro - Reputacao: 0,00|", "NINTENDO 3DS");
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "1:  - Reputacao: 0,00|", "POLICIAL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Nenhum item pego emprestado", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Caloteiro, OUTRO, ", "DEZ_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str7 = bluRayShow6.getNomeArtista();
        int int8 = bluRayShow6.getNumFaixas();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos9 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie17 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str19 = bluRaySerie17.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos20 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow27 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay28 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean29 = bluRayShow27.equals((java.lang.Object) classificacaoBluRay28);
        bluRayShow27.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow39 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str40 = bluRayShow39.getNome();
        int int41 = ordenaItemNumeroEmprestimos20.compare((lp2.projetofinal.entidades.Item) bluRayShow27, (lp2.projetofinal.entidades.Item) bluRayShow39);
        int int42 = ordenaItemNumeroEmprestimos9.compare((lp2.projetofinal.entidades.Item) bluRaySerie17, (lp2.projetofinal.entidades.Item) bluRayShow39);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie50 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str51 = bluRaySerie50.getEstado();
        java.lang.String str52 = bluRaySerie50.getGenero();
        java.lang.String str53 = bluRaySerie50.getEstado();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos54 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow61 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay62 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean63 = bluRayShow61.equals((java.lang.Object) classificacaoBluRay62);
        bluRayShow61.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow73 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str74 = bluRayShow73.getNome();
        int int75 = ordenaItemNumeroEmprestimos54.compare((lp2.projetofinal.entidades.Item) bluRayShow61, (lp2.projetofinal.entidades.Item) bluRayShow73);
        int int76 = ordenaItemNumeroEmprestimos9.compare((lp2.projetofinal.entidades.Item) bluRaySerie50, (lp2.projetofinal.entidades.Item) bluRayShow73);
        int int77 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie50);
        java.lang.String str79 = bluRayShow6.getInfo("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay28 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay28.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Caloteiro" + "'", str40, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Nao emprestado" + "'", str51, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ROMANCE" + "'", str52, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Nao emprestado" + "'", str53, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay62 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay62.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Caloteiro" + "'", str74, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-4) + "'", int77 == (-4));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        java.lang.String str4 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioPegandoEmprestado("POLICIAL", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro, MUSICAL, ", 0.0d, (int) (short) 1, "MUSICAL", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (-11));
        bluRayShow6.atualizar("Caloteiro, OUTRO, ", "OUTRO");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.itemDevolvido();
        int int14 = bluRayShow6.getNumFaixas();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Caloteiro" + "'", str12, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("Noob");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.getInfoItem("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "Caloteiro");
        usuario3.setTelefone("Noob");
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico11 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean12 = usuario9.equals((java.lang.Object) plataformaJogoEletronico11);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente13 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str18 = usuario17.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario22 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int23 = ordenaUsuarioReputacaoCrescente13.compare(usuario17, usuario22);
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        java.lang.String str29 = usuario27.getNome();
        lp2.projetofinal.entidades.Item item30 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo33 = new lp2.projetofinal.entidades.Emprestimo(usuario22, usuario27, item30, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario34 = emprestimo33.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario35 = emprestimo33.getUsuarioRequerente();
        usuario35.setEmail("Nao emprestado");
        int int38 = usuario9.compareTo(usuario35);
        java.lang.String str39 = usuario9.getNome();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos40 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie48 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str50 = bluRaySerie48.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos51 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow58 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay59 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean60 = bluRayShow58.equals((java.lang.Object) classificacaoBluRay59);
        bluRayShow58.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow70 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str71 = bluRayShow70.getNome();
        int int72 = ordenaItemNumeroEmprestimos51.compare((lp2.projetofinal.entidades.Item) bluRayShow58, (lp2.projetofinal.entidades.Item) bluRayShow70);
        int int73 = ordenaItemNumeroEmprestimos40.compare((lp2.projetofinal.entidades.Item) bluRaySerie48, (lp2.projetofinal.entidades.Item) bluRayShow70);
        java.lang.String str74 = bluRaySerie48.getNome();
        bluRaySerie48.setNome("COMPLETO");
        java.lang.String str77 = bluRaySerie48.getNome();
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario9, (lp2.projetofinal.entidades.Item) bluRaySerie48, "Caloteiro, OUTRO, ", (-11));
        java.lang.String str82 = bluRaySerie48.getInfo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = bluRaySerie48.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico11 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico11.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Caloteiro" + "'", str29, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario34);
        org.junit.Assert.assertNotNull(usuario35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay59 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay59.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro" + "'", str71, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Noob" + "'", str74, "Noob");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "COMPLETO" + "'", str77, "COMPLETO");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        jogoTabuleiro2.atualizaNumeroEmprestimos();
        jogoTabuleiro2.adicionarPecaPerdida("Caloteiro");
        java.lang.String str6 = jogoTabuleiro2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS" + "'", str6, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "LIVRE", "", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("", "1: ROMANCE - Reputacao: 0,00|", (double) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("MUSICAL", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str9 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str10 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facade0.listarEmprestimosUsuarioPegandoEmprestado("PC", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|", (-32.0d), "", (-15), "1: COMPLETO - Reputacao: 0,00|", "DEZ_ANOS", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente2 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str7 = usuario6.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int12 = ordenaUsuarioReputacaoCrescente2.compare(usuario6, usuario11);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        java.lang.String str18 = usuario16.getNome();
        lp2.projetofinal.entidades.Item item19 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo22 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario16, item19, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente23 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int33 = ordenaUsuarioReputacaoCrescente23.compare(usuario27, usuario32);
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        java.lang.String str39 = usuario37.getNome();
        lp2.projetofinal.entidades.Item item40 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario32, usuario37, item40, "OUTRO", 100);
        usuario37.atualizaReputacao((double) (short) -1, false);
        int int47 = ordenaUsuarioReputacaoCrescente1.compare(usuario11, usuario37);
        java.lang.String str48 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        java.lang.String str49 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str51 = controllerEmprestimos0.listarEmprestimosItens("Emprestado");
        java.lang.String str53 = controllerEmprestimos0.listarEmprestimosItens("JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Nenhum item pego emprestado" + "'", str48, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str51, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str53, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", (double) (short) 1, "DOZE_ANOS", 14, "Caloteiro, Nao emprestado, ", "", 64);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.facade.Facade facade5 = new lp2.projetofinal.facade.Facade();
        facade5.fecharSistema();
        java.lang.String str8 = facade5.listarEmprestimosItem("OUTRO");
        facade5.resetarPersistencia();
        java.lang.String str10 = facade5.listarTop10Itens();
        boolean boolean11 = jogoEletronico3.equals((java.lang.Object) facade5);
        java.lang.String str12 = facade5.listarItensNaoEmprestados();
        java.lang.String str13 = facade5.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade5.atualizarUsuario("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "DEZ_ANOS", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("Caloteiro", "1: COMPLETO - Reputacao: 0,00|", "PS3", "Nenhum emprestimos associados ao item", "COMPLETO", "PS3", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder9 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int10 = cartaoFreeRyder9.prazoEmprestimo();
        java.lang.String str11 = cartaoFreeRyder9.getNomeCartao();
        boolean boolean12 = bluRaySerie7.equals((java.lang.Object) cartaoFreeRyder9);
        java.lang.String str13 = bluRaySerie7.getDescricao();
        bluRaySerie7.itemDevolvido();
        java.lang.String str16 = bluRaySerie7.getInfo("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
        int int17 = bluRaySerie7.duracaoTotal();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FreeRyder" + "'", str11, "FreeRyder");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str13, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.getInfoUsuario("DEZ_ANOS", "PS3", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens1 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray2 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet3 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet3, itemArray2);
        controllerItens1.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet3, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens8 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray9 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet10 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet10, itemArray9);
        controllerItens8.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet10, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario15 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str16 = controllerUsuario15.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario15.todosUsuariosItens();
        controllerItens8.adicionaItem(itemSet17, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens1.adicionaItem(itemSet17, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario33 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str34 = controllerUsuario33.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet35 = controllerUsuario33.todosUsuariosItens();
        java.lang.String str36 = controllerItens1.listarItensOrdenadosPorValor(itemSet35);
        controllerItens0.adicionaItem(itemSet35, "", (double) (byte) 10, "1: ROMANCE - Reputacao: 0,00|", 100, "NINTENDO 3DS", "Nao emprestado", (int) (byte) 100);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = controllerItens0.listarItensNaoEmprestados(itemSet45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(itemSet17);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(itemSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("MUSICAL", (double) (-15));
        jogoTabuleiro2.atualizaNumeroEmprestimos();
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "Emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str13 = sistema3.listarItensEmprestados();
        java.lang.String str14 = sistema3.listarTop10MelhoresUsuarios();
        java.lang.String str15 = sistema3.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.atualizarItem("DEZOITO_ANOS", "Nenhum emprestimos associados ao item", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "1: COMPLETO - Reputacao: 0,00|", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str14, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos1 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie9 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str11 = bluRaySerie9.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos12 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay20 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean21 = bluRayShow19.equals((java.lang.Object) classificacaoBluRay20);
        bluRayShow19.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow31 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str32 = bluRayShow31.getNome();
        int int33 = ordenaItemNumeroEmprestimos12.compare((lp2.projetofinal.entidades.Item) bluRayShow19, (lp2.projetofinal.entidades.Item) bluRayShow31);
        int int34 = ordenaItemNumeroEmprestimos1.compare((lp2.projetofinal.entidades.Item) bluRaySerie9, (lp2.projetofinal.entidades.Item) bluRayShow31);
        java.lang.String str35 = bluRayShow31.getNomeArtista();
        java.lang.String str37 = bluRayShow31.getInfo("Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow44.atualizaNumeroEmprestimos();
        int int46 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow31, (lp2.projetofinal.entidades.Item) bluRayShow44);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator47 = ordenaItemPeloPreco0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator48 = ordenaItemPeloPreco0.reversed();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico52 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str53 = jogoEletronico52.getPlataforma();
        java.lang.String str54 = jogoEletronico52.getPlataforma();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie62 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int63 = bluRaySerie62.getNumeroEmprestimos();
        int int64 = bluRaySerie62.duracaoTotal();
        int int65 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoEletronico52, (lp2.projetofinal.entidades.Item) bluRaySerie62);
        int int66 = bluRaySerie62.getNumeroEmprestimos();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay20 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay20.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemComparator47);
        org.junit.Assert.assertNotNull(itemComparator48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "OUTRO" + "'", str53, "OUTRO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "OUTRO" + "'", str54, "OUTRO");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("Nenhum item emprestado, OUTRO, ");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(64);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        sistema0.cadastrarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "MUSICAL", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
        sistema0.resetarPersistencia();
        java.lang.String str10 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("NINTENDO 3DS", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "DOCUMENTARIO", (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|" + "'", str10, "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Lista de usuarios com reputacao negativa: ");
        java.lang.String str10 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sistema0.pesquisarDetalhesItem("", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str10, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet5 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(itemSet5);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico5 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean6 = usuario3.equals((java.lang.Object) plataformaJogoEletronico5);
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro9 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema10 = new lp2.projetofinal.controllers.Sistema();
        sistema10.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema10.finalizar();
        java.lang.String str16 = sistema10.listarItensOrdenadosPorNome();
        java.lang.String str17 = sistema10.listarItensOrdenadosPorNome();
        boolean boolean18 = jogoTabuleiro9.equals((java.lang.Object) sistema10);
        java.lang.String str20 = sistema10.listarEmprestimosItem("Caloteiro, Nao emprestado, ");
        boolean boolean21 = usuario3.equals((java.lang.Object) "Caloteiro, Nao emprestado, ");
        usuario3.setEmail("AVENTURA");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str20, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "ROMANCE", "");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Nenhum item emprestado", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("PC");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str16 = usuario15.getTelefone();
        java.lang.String str17 = usuario15.getNome();
        lp2.projetofinal.entidades.Item item18 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo21 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario15, item18, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente22 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int32 = ordenaUsuarioReputacaoCrescente22.compare(usuario26, usuario31);
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        java.lang.String str38 = usuario36.getNome();
        lp2.projetofinal.entidades.Item item39 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo42 = new lp2.projetofinal.entidades.Emprestimo(usuario31, usuario36, item39, "OUTRO", 100);
        usuario36.atualizaReputacao((double) (short) -1, false);
        int int46 = ordenaUsuarioReputacaoCrescente0.compare(usuario10, usuario36);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente47 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario51 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str52 = usuario51.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario56 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int57 = ordenaUsuarioReputacaoCrescente47.compare(usuario51, usuario56);
        usuario56.setTelefone("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente60 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str65 = usuario64.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int70 = ordenaUsuarioReputacaoCrescente60.compare(usuario64, usuario69);
        lp2.projetofinal.entidades.Usuario usuario74 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str75 = usuario74.getTelefone();
        java.lang.String str76 = usuario74.getNome();
        lp2.projetofinal.entidades.Item item77 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario69, usuario74, item77, "OUTRO", 100);
        usuario74.atualizaReputacao((double) (-1), true);
        int int84 = ordenaUsuarioReputacaoCrescente0.compare(usuario56, usuario74);
        java.lang.String str85 = usuario56.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Caloteiro" + "'", str76, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Caloteiro" + "'", str85, "Caloteiro");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.listarEmprestimosUsuarioEmprestando("COMPLETO", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("Nao emprestado", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "Caloteiro, MUSICAL, ", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "1: COMPLETO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens17 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray18 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet19 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet19, itemArray18);
        controllerItens17.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet26 = controllerUsuario24.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet26, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario34 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str35 = controllerUsuario34.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = controllerUsuario34.todosUsuariosItens();
        controllerItens17.adicionaItem(itemSet36, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str41 = controllerItens0.listarItensNaoEmprestados(itemSet36);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = controllerItens0.listarTop10Itens(itemSet42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(itemSet36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str41, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("Caloteiro, Nao emprestado, ", "", "PS3", (double) (-18), (int) (short) 1, "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        java.lang.String str34 = bluRaySerie8.getNome();
        bluRaySerie8.setNome("COMPLETO");
        bluRaySerie8.adicionarBluRay((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = controllerUsuario0.getInfoUsuario("FreeRyder", "MUSICAL", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = usuarioComparator2.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator4 = usuarioComparator3.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = usuarioComparator3.thenComparing(usuarioComparator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertNotNull(usuarioComparator4);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        int int22 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie24 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean25 = emprestimo20.equals((java.lang.Object) episodioSerie24);
        int int26 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario27 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente28 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str33 = usuario32.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int38 = ordenaUsuarioReputacaoCrescente28.compare(usuario32, usuario37);
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str43 = usuario42.getTelefone();
        java.lang.String str44 = usuario42.getNome();
        lp2.projetofinal.entidades.Item item45 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo48 = new lp2.projetofinal.entidades.Emprestimo(usuario37, usuario42, item45, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario49 = emprestimo48.getDonoDoItem();
        int int50 = emprestimo48.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie52 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean53 = emprestimo48.equals((java.lang.Object) episodioSerie52);
        int int54 = emprestimo48.getNumeroDias();
        boolean boolean55 = emprestimo20.equals((java.lang.Object) emprestimo48);
        emprestimo48.setDataDevolucao("DEZ_ANOS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(usuario27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("1: OUTRO - Reputacao: 0,00|");
        java.lang.String str2 = generoBluRay1.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("", "Noob", "Caloteiro", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.inicializar();
        java.lang.String str14 = sistema3.listarItensNaoEmprestados();
        java.lang.String str16 = sistema3.listarEmprestimosItem("PC");
        // The following exception was thrown during execution in test generation
        try {
            sistema3.removerItem("DOZE_ANOS", "Caloteiro, OUTRO, ", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str16, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.inicializar();
        sistema3.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.cadastrarBluRayFilme("POLICIAL", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", (double) 10.0f, (int) (short) -1, "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("NINTENDO 3DS", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "DEZESSEIS_ANOS", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro22 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario21.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro22);
        java.lang.String str24 = cartaoCaloteiro22.getNomeCartao();
        int int25 = cartaoCaloteiro22.prazoEmprestimo();
        java.lang.String str26 = cartaoCaloteiro22.getNomeCartao();
        int int27 = cartaoCaloteiro22.prazoEmprestimo();
        boolean boolean28 = cartaoCaloteiro22.permisaoPegarEmprestado();
        int int29 = cartaoCaloteiro22.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Caloteiro" + "'", str24, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Caloteiro" + "'", str26, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.getInfoUsuario("1: OUTRO - Reputacao: 0,00|", "FreeRyder", "COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        boolean boolean22 = emprestimo20.equals((java.lang.Object) (-1.0f));
        int int23 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo20.getUsuarioRequerente();
        lp2.projetofinal.controllers.Sistema sistema25 = new lp2.projetofinal.controllers.Sistema();
        sistema25.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str30 = sistema25.listarItensOrdenadosPorValor();
        java.lang.String str31 = sistema25.listarTop10PioresUsuarios();
        java.lang.String str32 = sistema25.listarTop10MelhoresUsuarios();
        sistema25.inicializar();
        boolean boolean34 = emprestimo20.equals((java.lang.Object) sistema25);
        // The following exception was thrown during execution in test generation
        try {
            sistema25.adicionarPecaPerdida("", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "XBOX360", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str31, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str32, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("NINTENDO 3DS");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", (double) 0L, "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", 7, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) '4');
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, Nenhum emprestimos associados ao item, ", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str9 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str10 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str11 = facade0.listarTop10PioresUsuarios();
        facade0.fecharSistema();
        facade0.cadastrarUsuario("Nenhum item emprestado, OUTRO, ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "FreeRyder");
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Caloteiro, MUSICAL, ", "1: ROMANCE - Reputacao: 0,00|", (double) 0, "Nenhum item pego emprestado", (-4), "1: Caloteiro - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico0 = lp2.projetofinal.enums.PlataformaJogoEletronico.NINTENDO_3DS;
        java.lang.String str1 = plataformaJogoEletronico0.getPlataforma();
        java.lang.String str2 = plataformaJogoEletronico0.getPlataforma();
        java.lang.String str3 = plataformaJogoEletronico0.getPlataforma();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico0 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.NINTENDO_3DS + "'", plataformaJogoEletronico0.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.NINTENDO_3DS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NINTENDO 3DS" + "'", str1, "NINTENDO 3DS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NINTENDO 3DS" + "'", str2, "NINTENDO 3DS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NINTENDO 3DS" + "'", str3, "NINTENDO 3DS");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.facade.Facade facade5 = new lp2.projetofinal.facade.Facade();
        facade5.fecharSistema();
        java.lang.String str8 = facade5.listarEmprestimosItem("OUTRO");
        facade5.resetarPersistencia();
        java.lang.String str10 = facade5.listarTop10Itens();
        boolean boolean11 = jogoEletronico3.equals((java.lang.Object) facade5);
        java.lang.String str12 = facade5.listarItensNaoEmprestados();
        java.lang.String str13 = facade5.listarTop10Itens();
        java.lang.String str14 = facade5.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade5.adicionarBluRay("1: COMPLETO - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarEmprestimosItem("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "Caloteiro", (double) 14, "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str10 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("AVENTURA", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (double) '#', (int) (byte) 10, "DEZESSEIS_ANOS", "COM PECAS PERDIDAS", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((int) (short) 100);
        int int2 = episodioSerie1.getDuracao();
        int int3 = episodioSerie1.getDuracao();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str7 = bluRayFilme6.getGenero();
        int int8 = bluRayFilme6.getAnoLancamento();
        java.lang.String str9 = bluRayFilme6.getGenero();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OUTRO" + "'", str9, "OUTRO");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("COMPLETO", "Caloteiro, OUTRO, ", "Nenhum item emprestado, OUTRO, ", "Nenhum item pego emprestado", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = controllerUsuario0.listarCaloteiros();
        java.lang.String str7 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "PC, AVENTURA, Emprestado", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "ROMANCE", "");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet7 = controllerUsuario0.todosUsuariosItens();
        java.lang.String str8 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.cadastrarUsuario("NINTENDO 3DS", "POLICIAL", "Nao emprestado");
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.getNumeroTemporada();
        java.lang.Object obj10 = null;
        boolean boolean11 = bluRaySerie7.equals(obj10);
        bluRaySerie7.setNome("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie21 = new lp2.projetofinal.entidades.BluRaySerie("", (-1.0d), "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (int) (byte) 1, "Nenhum item pego emprestado", "Nao emprestado", 0);
        java.lang.String str22 = bluRaySerie21.getGenero();
        int int23 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = bluRaySerie7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OUTRO" + "'", str22, "OUTRO");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        int int3 = cartaoNoob0.prazoEmprestimo();
        boolean boolean4 = cartaoNoob0.permisaoPegarEmprestado();
        java.lang.String str5 = cartaoNoob0.getNomeCartao();
        java.lang.String str6 = cartaoNoob0.getNomeCartao();
        boolean boolean7 = cartaoNoob0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Noob" + "'", str5, "Noob");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Noob" + "'", str6, "Noob");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str6 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoUsuario("Caloteiro, MUSICAL, ", "COM PECAS PERDIDAS", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("OUTRO", "Caloteiro, Nao emprestado, ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente22 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int32 = ordenaUsuarioReputacaoCrescente22.compare(usuario26, usuario31);
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        java.lang.String str38 = usuario36.getNome();
        lp2.projetofinal.entidades.Item item39 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo42 = new lp2.projetofinal.entidades.Emprestimo(usuario31, usuario36, item39, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str47 = usuario46.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo49 = new lp2.projetofinal.entidades.Emprestimo(usuario36, usuario46, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet50 = usuario36.retornaSeusItens();
        lp2.projetofinal.entidades.Emprestimo emprestimo52 = new lp2.projetofinal.entidades.Emprestimo(usuario21, usuario36, "COMPLETO");
        java.lang.String str53 = usuario21.toString();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente54 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente55 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario59 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str60 = usuario59.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int65 = ordenaUsuarioReputacaoCrescente55.compare(usuario59, usuario64);
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str70 = usuario69.getTelefone();
        java.lang.String str71 = usuario69.getNome();
        lp2.projetofinal.entidades.Item item72 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo75 = new lp2.projetofinal.entidades.Emprestimo(usuario64, usuario69, item72, "OUTRO", 100);
        boolean boolean77 = emprestimo75.equals((java.lang.Object) (-1.0f));
        int int78 = emprestimo75.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario79 = emprestimo75.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario83 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico85 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean86 = usuario83.equals((java.lang.Object) plataformaJogoEletronico85);
        usuario83.setEmail("Nenhum emprestimos associados ao item");
        int int89 = ordenaUsuarioReputacaoCrescente54.compare(usuario79, usuario83);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet90 = usuario83.retornaSeusItens();
        int int91 = usuario21.compareTo(usuario83);
        double double92 = usuario83.getReputacao();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro, OUTRO, " + "'", str53, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro" + "'", str71, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(usuario79);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico85 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico85.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(itemSet90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie8 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str10 = bluRaySerie8.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos11 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow18 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay19 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean20 = bluRayShow18.equals((java.lang.Object) classificacaoBluRay19);
        bluRayShow18.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str31 = bluRayShow30.getNome();
        int int32 = ordenaItemNumeroEmprestimos11.compare((lp2.projetofinal.entidades.Item) bluRayShow18, (lp2.projetofinal.entidades.Item) bluRayShow30);
        int int33 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie8, (lp2.projetofinal.entidades.Item) bluRayShow30);
        java.lang.String str34 = bluRaySerie8.getNome();
        bluRaySerie8.setNome("COMPLETO");
        java.lang.String str37 = bluRaySerie8.getNome();
        bluRaySerie8.adicionarBluRay((int) (byte) 10);
        int int40 = bluRaySerie8.getNumeroTemporada();
        java.lang.String str41 = bluRaySerie8.getGenero();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "COMPLETO" + "'", str37, "COMPLETO");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ROMANCE" + "'", str41, "ROMANCE");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("POLICIAL", (double) (short) 10);
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico3 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator4 = ordenaItemEmprestadoAlfabetico3.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator5 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator6 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator7 = emprestimoComparator6.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator8 = emprestimoComparator6.reversed();
        boolean boolean9 = jogoTabuleiro2.equals((java.lang.Object) emprestimoComparator6);
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator10 = emprestimoComparator6.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator11 = emprestimoComparator6.reversed();
        org.junit.Assert.assertNotNull(emprestimoComparator4);
        org.junit.Assert.assertNotNull(emprestimoComparator5);
        org.junit.Assert.assertNotNull(emprestimoComparator6);
        org.junit.Assert.assertNotNull(emprestimoComparator7);
        org.junit.Assert.assertNotNull(emprestimoComparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(emprestimoComparator10);
        org.junit.Assert.assertNotNull(emprestimoComparator11);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        int int22 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie24 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean25 = emprestimo20.equals((java.lang.Object) episodioSerie24);
        int int26 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario27 = emprestimo20.getDonoDoItem();
        java.lang.String str28 = usuario27.getTelefone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(usuario27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "ROMANCE", "");
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.lang.String str6 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "Nenhum item pego emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str16 = usuario15.getTelefone();
        java.lang.String str17 = usuario15.getNome();
        lp2.projetofinal.entidades.Item item18 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo21 = new lp2.projetofinal.entidades.Emprestimo(usuario10, usuario15, item18, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario25 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str26 = usuario25.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo28 = new lp2.projetofinal.entidades.Emprestimo(usuario15, usuario25, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet29 = usuario15.retornaSeusItens();
        controllerItens0.adicionaItem(itemSet29, "", 100.0d);
        lp2.projetofinal.controllers.ControllerItens controllerItens33 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray34 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet35 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet35, itemArray34);
        controllerItens33.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet35, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario40 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str41 = controllerUsuario40.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet42 = controllerUsuario40.todosUsuariosItens();
        controllerItens33.adicionaItem(itemSet42, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario50 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str51 = controllerUsuario50.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet52 = controllerUsuario50.todosUsuariosItens();
        controllerItens33.adicionaItem(itemSet52, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente57 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario61 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str62 = usuario61.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario66 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int67 = ordenaUsuarioReputacaoCrescente57.compare(usuario61, usuario66);
        lp2.projetofinal.entidades.Usuario usuario71 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str72 = usuario71.getTelefone();
        java.lang.String str73 = usuario71.getNome();
        lp2.projetofinal.entidades.Item item74 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo77 = new lp2.projetofinal.entidades.Emprestimo(usuario66, usuario71, item74, "OUTRO", 100);
        java.lang.String str78 = usuario71.getNome();
        java.lang.String str79 = usuario71.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet80 = usuario71.retornaSeusItens();
        java.lang.String str81 = controllerItens33.listarTop10Itens(itemSet80);
        controllerItens0.adicionaItem(itemSet80, "1: OUTRO - Reputacao: 0,00|", (double) (-1.0f), (int) '#', "Lista de usuarios com reputacao negativa: ", "Caloteiro, Nao emprestado, ", 5);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario89 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario89.salvarMapaUsuarios();
        controllerUsuario89.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet95 = controllerUsuario89.todosUsuariosItens();
        java.lang.String str96 = controllerItens0.listarItensNaoEmprestados(itemSet95);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(itemSet42);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(itemSet52);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Caloteiro" + "'", str73, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Caloteiro" + "'", str78, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Caloteiro, OUTRO, " + "'", str79, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(itemSet95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Nenhum item pego emprestado");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sistema0.getInfoItem("COMPLETO", "POLICIAL", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        java.lang.String str9 = sistema0.listarItensNaoEmprestados();
        sistema0.finalizar();
        java.lang.String str11 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("Nenhum item pego emprestado", "OUTRO", "Caloteiro", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str11, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario1 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str2 = controllerUsuario1.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet3 = controllerUsuario1.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet3, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens7 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray8 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet9 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet9, itemArray8);
        controllerItens7.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet9, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario14 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str15 = controllerUsuario14.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet16 = controllerUsuario14.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet16, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet26 = controllerUsuario24.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet26, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente31 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario35 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str36 = usuario35.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario40 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int41 = ordenaUsuarioReputacaoCrescente31.compare(usuario35, usuario40);
        lp2.projetofinal.entidades.Usuario usuario45 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str46 = usuario45.getTelefone();
        java.lang.String str47 = usuario45.getNome();
        lp2.projetofinal.entidades.Item item48 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo51 = new lp2.projetofinal.entidades.Emprestimo(usuario40, usuario45, item48, "OUTRO", 100);
        java.lang.String str52 = usuario45.getNome();
        java.lang.String str53 = usuario45.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet54 = usuario45.retornaSeusItens();
        java.lang.String str55 = controllerItens7.listarTop10Itens(itemSet54);
        java.lang.String str56 = controllerItens0.listarTop10Itens(itemSet54);
        lp2.projetofinal.controllers.ControllerItens controllerItens57 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray58 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet59 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet59, itemArray58);
        controllerItens57.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet59, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario64 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str65 = controllerUsuario64.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet66 = controllerUsuario64.todosUsuariosItens();
        controllerItens57.adicionaItem(itemSet66, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens74 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray75 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet76 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet76, itemArray75);
        controllerItens74.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet76, "Caloteiro", (-1.0d));
        java.lang.String str81 = controllerItens57.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet76);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet76, "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Caloteiro" + "'", str47, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Caloteiro" + "'", str52, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro, OUTRO, " + "'", str53, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(itemSet66);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str81, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos1 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie9 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str11 = bluRaySerie9.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos12 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay20 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean21 = bluRayShow19.equals((java.lang.Object) classificacaoBluRay20);
        bluRayShow19.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow31 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str32 = bluRayShow31.getNome();
        int int33 = ordenaItemNumeroEmprestimos12.compare((lp2.projetofinal.entidades.Item) bluRayShow19, (lp2.projetofinal.entidades.Item) bluRayShow31);
        int int34 = ordenaItemNumeroEmprestimos1.compare((lp2.projetofinal.entidades.Item) bluRaySerie9, (lp2.projetofinal.entidades.Item) bluRayShow31);
        java.lang.String str35 = bluRayShow31.getNomeArtista();
        java.lang.String str37 = bluRayShow31.getInfo("Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow44.atualizaNumeroEmprestimos();
        int int46 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow31, (lp2.projetofinal.entidades.Item) bluRayShow44);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie54 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str55 = bluRaySerie54.getGenero();
        lp2.projetofinal.entidades.BluRayShow bluRayShow62 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str63 = bluRayShow62.getNome();
        double double64 = bluRayShow62.getPreco();
        int int65 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRaySerie54, (lp2.projetofinal.entidades.Item) bluRayShow62);
        int int66 = bluRaySerie54.getNumeroEmprestimos();
        java.lang.String str67 = bluRaySerie54.getEstado();
        bluRaySerie54.atualizar("DEZOITO_ANOS", "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay20 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay20.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ROMANCE" + "'", str55, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str63, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 52.0d + "'", double64 == 52.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Nao emprestado" + "'", str67, "Nao emprestado");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "ROMANCE", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
        facade0.cadastrarUsuario("1: Caloteiro - Reputacao: 0,00|", "QUATORZE_ANOS", "Caloteiro, MUSICAL, ");
        java.lang.String str15 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facade0.listarEmprestimosUsuarioEmprestando("1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
        java.lang.String str8 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("BomAmigo");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "XBOX360", "COMPLETO");
        java.lang.String str6 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("", "", "PS3", "DEZESSEIS_ANOS", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente3 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario7 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str8 = usuario7.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int13 = ordenaUsuarioReputacaoCrescente3.compare(usuario7, usuario12);
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str18 = usuario17.getTelefone();
        java.lang.String str19 = usuario17.getNome();
        lp2.projetofinal.entidades.Item item20 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario12, usuario17, item20, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo23.getDonoDoItem();
        int int25 = emprestimo23.getNumeroDias();
        lp2.projetofinal.entidades.Item item26 = emprestimo23.getItem();
        java.lang.Object obj27 = null;
        boolean boolean28 = emprestimo23.equals(obj27);
        boolean boolean29 = chaveNomeTelefone2.equals((java.lang.Object) emprestimo23);
        emprestimo23.setDataDevolucao("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        lp2.projetofinal.entidades.Item item32 = emprestimo23.getItem();
        lp2.projetofinal.entidades.Usuario usuario33 = emprestimo23.getDonoDoItem();
        lp2.projetofinal.entidades.Item item34 = emprestimo23.getItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente35 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente36 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator37 = ordenaUsuarioReputacaoCrescente35.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente36);
        boolean boolean38 = emprestimo23.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente36);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(usuario33);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(usuarioComparator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str10 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "Caloteiro, OUTRO, ", (-37));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str25 = usuario24.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo27 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario24, "1: OUTRO - Reputacao: 0,00|");
        usuario24.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        usuario24.setNome("Caloteiro");
        usuario24.setNome("LIVRE");
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade34 = usuario24.getCartao();
        java.lang.String str35 = usuario24.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(cartaoFidelidade34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LIVRE" + "'", str35, "LIVRE");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente14 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario18 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str19 = usuario18.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario23 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int24 = ordenaUsuarioReputacaoCrescente14.compare(usuario18, usuario23);
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str29 = usuario28.getTelefone();
        java.lang.String str30 = usuario28.getNome();
        lp2.projetofinal.entidades.Item item31 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo34 = new lp2.projetofinal.entidades.Emprestimo(usuario23, usuario28, item31, "OUTRO", 100);
        java.lang.String str35 = usuario28.getNome();
        java.lang.String str36 = usuario28.toString();
        boolean boolean37 = jogoTabuleiro3.equals((java.lang.Object) str36);
        jogoTabuleiro3.adicionarPecaPerdida("POLICIAL");
        java.lang.String str41 = jogoTabuleiro3.getInfo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        jogoTabuleiro3.itemEmprestado();
        jogoTabuleiro3.adicionarPecaPerdida("Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Caloteiro" + "'", str30, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro, OUTRO, " + "'", str36, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos22 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie30 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str32 = bluRaySerie30.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos33 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow40 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay41 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean42 = bluRayShow40.equals((java.lang.Object) classificacaoBluRay41);
        bluRayShow40.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow52 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str53 = bluRayShow52.getNome();
        int int54 = ordenaItemNumeroEmprestimos33.compare((lp2.projetofinal.entidades.Item) bluRayShow40, (lp2.projetofinal.entidades.Item) bluRayShow52);
        int int55 = ordenaItemNumeroEmprestimos22.compare((lp2.projetofinal.entidades.Item) bluRaySerie30, (lp2.projetofinal.entidades.Item) bluRayShow52);
        bluRaySerie30.itemDevolvido();
        bluRaySerie30.itemEmprestado();
        lp2.projetofinal.entidades.BluRayShow bluRayShow64 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente65 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean66 = bluRayShow64.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente65);
        int int67 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie30, (lp2.projetofinal.entidades.Item) bluRayShow64);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator68 = ordenaItemNumeroEmprestimos0.reversed();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie76 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str77 = bluRaySerie76.getEstado();
        java.lang.String str78 = bluRaySerie76.getGenero();
        bluRaySerie76.adicionarBluRay((int) (byte) 0);
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme87 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str88 = bluRayFilme87.getGenero();
        int int89 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie76, (lp2.projetofinal.entidades.Item) bluRayFilme87);
        java.lang.String str90 = bluRayFilme87.getGenero();
        java.lang.String str91 = bluRayFilme87.getGenero();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay8 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay8.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay41 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay41.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemComparator68);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Nao emprestado" + "'", str77, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ROMANCE" + "'", str78, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "OUTRO" + "'", str88, "OUTRO");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "OUTRO" + "'", str90, "OUTRO");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "OUTRO" + "'", str91, "OUTRO");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        java.lang.String str1 = cartaoBomAmigo0.getNomeCartao();
        int int2 = cartaoBomAmigo0.prazoEmprestimo();
        int int3 = cartaoBomAmigo0.prazoEmprestimo();
        java.lang.String str4 = cartaoBomAmigo0.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BomAmigo" + "'", str1, "BomAmigo");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BomAmigo" + "'", str4, "BomAmigo");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens17 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray18 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet19 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet19, itemArray18);
        controllerItens17.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "Caloteiro", (-1.0d));
        java.lang.String str24 = controllerItens0.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19);
        lp2.projetofinal.controllers.ControllerItens controllerItens25 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario26 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str27 = controllerUsuario26.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet28 = controllerUsuario26.todosUsuariosItens();
        controllerItens25.adicionaItem(itemSet28, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens32 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray33 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet34 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet34, itemArray33);
        controllerItens32.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet34, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario39 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str40 = controllerUsuario39.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet41 = controllerUsuario39.todosUsuariosItens();
        controllerItens32.adicionaItem(itemSet41, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario49 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str50 = controllerUsuario49.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet51 = controllerUsuario49.todosUsuariosItens();
        controllerItens32.adicionaItem(itemSet51, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str58 = controllerItens25.getInfoItem(itemSet51, "Nao emprestado", "POLICIAL");
        controllerItens0.adicionaItem(itemSet51, "Noob", (double) 0L, 5, "QUATORZE_ANOS", "", 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente66 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario70 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str71 = usuario70.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario75 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int76 = ordenaUsuarioReputacaoCrescente66.compare(usuario70, usuario75);
        lp2.projetofinal.entidades.Usuario usuario80 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str81 = usuario80.getTelefone();
        java.lang.String str82 = usuario80.getNome();
        lp2.projetofinal.entidades.Item item83 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo86 = new lp2.projetofinal.entidades.Emprestimo(usuario75, usuario80, item83, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario90 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str91 = usuario90.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo93 = new lp2.projetofinal.entidades.Emprestimo(usuario80, usuario90, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet94 = usuario80.retornaSeusItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet94, "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str24, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(itemSet28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(itemSet51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Caloteiro" + "'", str82, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(itemSet94);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("OUTRO");
        java.lang.String str2 = generoBluRay1.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay0 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZ_ANOS;
        java.lang.String str1 = classificacaoBluRay0.getClassificacao();
        java.lang.String str2 = classificacaoBluRay0.getClassificacao();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay0 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZ_ANOS + "'", classificacaoBluRay0.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZ_ANOS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DEZ_ANOS" + "'", str1, "DEZ_ANOS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DEZ_ANOS" + "'", str2, "DEZ_ANOS");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((int) (short) -1);
        int int2 = episodioSerie1.getDuracao();
        int int3 = episodioSerie1.getDuracao();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("COM PECAS PERDIDAS");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario21 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente22 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str27 = usuario26.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int32 = ordenaUsuarioReputacaoCrescente22.compare(usuario26, usuario31);
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        java.lang.String str38 = usuario36.getNome();
        lp2.projetofinal.entidades.Item item39 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo42 = new lp2.projetofinal.entidades.Emprestimo(usuario31, usuario36, item39, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str47 = usuario46.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo49 = new lp2.projetofinal.entidades.Emprestimo(usuario36, usuario46, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet50 = usuario36.retornaSeusItens();
        lp2.projetofinal.entidades.Emprestimo emprestimo52 = new lp2.projetofinal.entidades.Emprestimo(usuario21, usuario36, "COMPLETO");
        java.lang.String str53 = usuario21.toString();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente54 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str59 = usuario58.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario63 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int64 = ordenaUsuarioReputacaoCrescente54.compare(usuario58, usuario63);
        lp2.projetofinal.entidades.Usuario usuario68 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str69 = usuario68.getTelefone();
        java.lang.String str70 = usuario68.getNome();
        lp2.projetofinal.entidades.Item item71 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo74 = new lp2.projetofinal.entidades.Emprestimo(usuario63, usuario68, item71, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario75 = emprestimo74.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro76 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario75.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro76);
        java.lang.String str78 = usuario75.getTelefone();
        int int79 = usuario21.compareTo(usuario75);
        double double80 = usuario75.getReputacao();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro, OUTRO, " + "'", str53, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Caloteiro" + "'", str70, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sistema0.pesquisarDetalhesItem("DOZE_ANOS", "", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        java.lang.String str16 = usuario14.getNome();
        lp2.projetofinal.entidades.Item item17 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo20 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario14, item17, "OUTRO", 100);
        boolean boolean22 = emprestimo20.equals((java.lang.Object) (-1.0f));
        int int23 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo20.getUsuarioRequerente();
        lp2.projetofinal.controllers.Sistema sistema25 = new lp2.projetofinal.controllers.Sistema();
        sistema25.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str30 = sistema25.listarItensOrdenadosPorValor();
        java.lang.String str31 = sistema25.listarTop10PioresUsuarios();
        java.lang.String str32 = sistema25.listarTop10MelhoresUsuarios();
        sistema25.inicializar();
        boolean boolean34 = emprestimo20.equals((java.lang.Object) sistema25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = sistema25.listarEmprestimosUsuarioEmprestando("DEZ_ANOS", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str31, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str32, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }
}

