import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str9 = controllerUsuario0.listarCaloteiros();
        java.lang.String str10 = controllerUsuario0.listarCaloteiros();
        java.lang.String str11 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("BomAmigo", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str10, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|" + "'", str11, "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        java.lang.String str6 = sistema0.listarEmprestimosItem("POLICIAL");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "Emprestado, , Caloteiro, Nao emprestado, ", "MUSICAL", 100.0d, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", (-8), "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "1: Caloteiro - Reputacao: 0,00|2: Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|| - Reputacao: 0,00|", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
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
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        facade0.cadastrarUsuario("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
        java.lang.String str19 = facade0.listarTop10Itens();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("NINTENDO 3DS", "1: COMPLETO - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO, R$ 10.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str14, "1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str2 = generoBluRay1.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "Nenhum item emprestado, OUTRO, ", "PC, AVENTURA, Emprestado", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(3);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO DE TABULEIRO: POLICIAL, R$ 100.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: POLICIAL, R$ 100.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("", (double) (short) 1, "", (int) (short) 0, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "COMPLETO", 64);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) (-11), "");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie11 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str12 = bluRaySerie11.getEstado();
        java.lang.String str13 = bluRaySerie11.getGenero();
        bluRaySerie11.adicionarBluRay((int) (byte) 0);
        int int16 = bluRaySerie11.getNumeroTemporada();
        java.lang.String str17 = bluRaySerie11.getGenero();
        bluRaySerie11.atualizar("DEZESSEIS_ANOS", "OUTRO");
        bluRaySerie11.itemEmprestado();
        bluRaySerie11.adicionarBluRay(0);
        int int24 = jogoEletronico3.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie11);
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos25 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str26 = controllerEmprestimos25.listarItensEmprestados();
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
        usuario36.setEmail("OUTRO");
        java.lang.String str50 = usuario36.getEmail();
        java.lang.String str51 = controllerEmprestimos25.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario36);
        java.lang.String str52 = usuario36.getTelefone();
        boolean boolean53 = jogoEletronico3.equals((java.lang.Object) str52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Nao emprestado" + "'", str12, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ROMANCE" + "'", str13, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ROMANCE" + "'", str17, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Caloteiro" + "'", str43, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "OUTRO" + "'", str50, "OUTRO");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Nenhum item emprestado" + "'", str51, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        lp2.projetofinal.entidades.Usuario usuario93 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "LIVRE", "POLICIAL");
        lp2.projetofinal.entidades.Usuario usuario97 = new lp2.projetofinal.entidades.Usuario("DOZE_ANOS", "NINTENDO 3DS", "DOZE_ANOS");
        int int98 = ordenaUsuarioReputacaoDecrescente0.compare(usuario93, usuario97);
        java.lang.String str99 = usuario93.toString();
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
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, LIVRE, POLICIAL" + "'", str99, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, LIVRE, POLICIAL");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem(itemSet16, "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|2: 1: Caloteiro - Reputacao: 0,00| - Reputacao: 0,00|", "EMPRESTIMO - De: Caloteiro, Para: ROMANCE, DOZE_ANOS, COMPLETO, 10 dias, ENTREGA: Emprestimo em andamento", "JOGO DE TABULEIRO: Emprestado, R$ -18.0, Nao emprestado, COMPLETO");
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
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro, MUSICAL, ", 0.0d, (int) (short) 1, "MUSICAL", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (-11));
        int int7 = bluRayShow6.getNumFaixas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-11) + "'", int7 == (-11));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, Nao emprestado, ", 0.0d);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie10 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str11 = bluRaySerie10.getEstado();
        lp2.projetofinal.entidades.Usuario usuario15 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico17 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean18 = usuario15.equals((java.lang.Object) plataformaJogoEletronico17);
        usuario15.setEmail("Nenhum emprestimos associados ao item");
        boolean boolean21 = bluRaySerie10.equals((java.lang.Object) usuario15);
        java.lang.String str22 = usuario15.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico28 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean29 = usuario26.equals((java.lang.Object) plataformaJogoEletronico28);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente30 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario34 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str35 = usuario34.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario39 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int40 = ordenaUsuarioReputacaoCrescente30.compare(usuario34, usuario39);
        lp2.projetofinal.entidades.Usuario usuario44 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str45 = usuario44.getTelefone();
        java.lang.String str46 = usuario44.getNome();
        lp2.projetofinal.entidades.Item item47 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo50 = new lp2.projetofinal.entidades.Emprestimo(usuario39, usuario44, item47, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario51 = emprestimo50.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario52 = emprestimo50.getUsuarioRequerente();
        usuario52.setEmail("Nao emprestado");
        int int55 = usuario26.compareTo(usuario52);
        java.lang.String str56 = usuario26.getNome();
        double double57 = usuario26.getReputacao();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie65 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie65.adicionarBluRay((-11));
        int int68 = bluRaySerie65.getNumeroTemporada();
        java.lang.String str69 = bluRaySerie65.getGenero();
        lp2.projetofinal.facade.Facade facade70 = new lp2.projetofinal.facade.Facade();
        java.lang.String str71 = facade70.listarTop10PioresUsuarios();
        facade70.iniciarSistema();
        java.lang.String str73 = facade70.listarTop10Itens();
        facade70.iniciarSistema();
        java.lang.String str75 = facade70.listarItensOrdenadosPorNome();
        facade70.fecharSistema();
        boolean boolean77 = bluRaySerie65.equals((java.lang.Object) facade70);
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario15, usuario26, (lp2.projetofinal.entidades.Item) bluRaySerie65, "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", 1);
        boolean boolean81 = jogoTabuleiro2.equals((java.lang.Object) 1);
        java.lang.String str82 = jogoTabuleiro2.contemPecasPerdidas();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nao emprestado" + "'", str11, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico17 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico17.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico28 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico28.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro" + "'", str46, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario51);
        org.junit.Assert.assertNotNull(usuario52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Caloteiro" + "'", str56, "Caloteiro");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "OUTRO" + "'", str69, "OUTRO");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "COMPLETO" + "'", str82, "COMPLETO");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("Caloteiro, OUTRO, ");
        java.lang.String str2 = generoBluRay1.getGenero();
        java.lang.String str3 = generoBluRay1.getGenero();
        java.lang.String str4 = generoBluRay1.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OUTRO" + "'", str3, "OUTRO");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, OUTRO, Nenhum emprestimos associados ao item", (-7.0d));
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
        java.lang.String str2 = generoBluRay1.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str9 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.resetarPersistencia();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str9, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        jogoTabuleiro3.setNome("JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("1:  - Reputacao: 0,00|", (double) 3, "Nenhum item pego emprestado", 5, "XBOX360", "Nenhum emprestimos associados ao item", (int) 'a');
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro, MUSICAL, ", (double) 'a', "1: ROMANCE - Reputacao: 0,00|", (-15), "FreeRyder", "Caloteiro", 52);
        java.lang.String str8 = bluRaySerie7.getDescricao();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str8, "1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str1 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str2 = controllerEmprestimos0.listarItensEmprestados();
        controllerEmprestimos0.carregaListaEmprestimos();
        java.lang.String str5 = controllerEmprestimos0.listarEmprestimosItens("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str5, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int43 = ordenaUsuarioReputacaoCrescente33.compare(usuario37, usuario42);
        lp2.projetofinal.entidades.Usuario usuario47 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str48 = usuario47.getTelefone();
        java.lang.String str49 = usuario47.getNome();
        lp2.projetofinal.entidades.Item item50 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo53 = new lp2.projetofinal.entidades.Emprestimo(usuario42, usuario47, item50, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario54 = emprestimo53.getDonoDoItem();
        int int55 = emprestimo53.getNumeroDias();
        emprestimo53.setDataDevolucao("Nenhum emprestimos associados ao item");
        lp2.projetofinal.entidades.Usuario usuario58 = emprestimo53.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario59 = emprestimo53.getUsuarioRequerente();
        lp2.projetofinal.entidades.Emprestimo emprestimo61 = new lp2.projetofinal.entidades.Emprestimo(usuario18, usuario59, "BomAmigo");
        java.lang.Object obj62 = null;
        boolean boolean63 = emprestimo61.equals(obj62);
        lp2.projetofinal.entidades.Item item64 = emprestimo61.getItem();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Nenhum item pego emprestado" + "'", str32, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Caloteiro" + "'", str49, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(usuario58);
        org.junit.Assert.assertNotNull(usuario59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(item64);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str10 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ -4.0, Nao emprestado, OUTRO", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", (-1.0d), 64, "DEZESSEIS_ANOS", "DOCUMENTARIO", 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        boolean boolean3 = cartaoNoob0.permisaoPegarEmprestado();
        int int4 = cartaoNoob0.prazoEmprestimo();
        int int5 = cartaoNoob0.prazoEmprestimo();
        int int6 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("PC, AVENTURA, Emprestado", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro, OUTRO, ", "Nenhum item pego emprestado", "Caloteiro");
        usuario3.setTelefone("");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str2 = facade0.listarCaloteiros();
        facade0.cadastrarUsuario("Noob", "JOGO DE TABULEIRO: Noob, R$ 1.0, Emprestado, COMPLETO", "AVENTURA");
        java.lang.String str7 = facade0.listarItensNaoEmprestados();
        java.lang.String str9 = facade0.listarEmprestimosItem("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("JOGO ELETRONICO: hi!, R$ -11.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: POLICIAL, R$ 10.0, Nao emprestado, COM PECAS PERDIDAS", "AVENTURA", "1: hi! - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        usuario14.atualizaReputacao(0.0d, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Caloteiro" + "'", str21, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Caloteiro, OUTRO, " + "'", str22, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet23);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str13 = sistema3.listarItensEmprestados();
        sistema3.resetarPersistencia();
        java.lang.String str15 = sistema3.listarTop10Itens();
        java.lang.String str16 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str17 = sistema3.listarItensOrdenadosPorNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        controllerEmprestimos0.salvarListaEmprestimos();
        java.lang.String str35 = controllerEmprestimos0.listarEmprestimosItens("1: ROMANCE - Reputacao: 0,00|");
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie44 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str45 = bluRaySerie44.getEstado();
        lp2.projetofinal.entidades.Usuario usuario49 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico51 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean52 = usuario49.equals((java.lang.Object) plataformaJogoEletronico51);
        usuario49.setEmail("Nenhum emprestimos associados ao item");
        boolean boolean55 = bluRaySerie44.equals((java.lang.Object) usuario49);
        java.lang.String str56 = usuario49.getTelefone();
        java.lang.String str57 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Nenhum item pego emprestado" + "'", str32, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str35, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Nao emprestado" + "'", str45, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico51 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico51.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Nenhum item emprestado" + "'", str57, "Nenhum item emprestado");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, Nao emprestado, ", 0.0d);
        jogoTabuleiro2.itemEmprestado();
        jogoTabuleiro2.itemEmprestado();
        java.lang.String str5 = jogoTabuleiro2.toString();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos6 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow13 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay14 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean15 = bluRayShow13.equals((java.lang.Object) classificacaoBluRay14);
        bluRayShow13.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow25 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str26 = bluRayShow25.getNome();
        int int27 = ordenaItemNumeroEmprestimos6.compare((lp2.projetofinal.entidades.Item) bluRayShow13, (lp2.projetofinal.entidades.Item) bluRayShow25);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos28 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie36 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str38 = bluRaySerie36.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos39 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow46 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay47 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean48 = bluRayShow46.equals((java.lang.Object) classificacaoBluRay47);
        bluRayShow46.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow58 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str59 = bluRayShow58.getNome();
        int int60 = ordenaItemNumeroEmprestimos39.compare((lp2.projetofinal.entidades.Item) bluRayShow46, (lp2.projetofinal.entidades.Item) bluRayShow58);
        int int61 = ordenaItemNumeroEmprestimos28.compare((lp2.projetofinal.entidades.Item) bluRaySerie36, (lp2.projetofinal.entidades.Item) bluRayShow58);
        bluRaySerie36.itemDevolvido();
        bluRaySerie36.itemEmprestado();
        lp2.projetofinal.entidades.BluRayShow bluRayShow70 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente71 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean72 = bluRayShow70.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente71);
        int int73 = ordenaItemNumeroEmprestimos6.compare((lp2.projetofinal.entidades.Item) bluRaySerie36, (lp2.projetofinal.entidades.Item) bluRayShow70);
        double double74 = bluRaySerie36.getPreco();
        int int75 = jogoTabuleiro2.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO" + "'", str5, "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay14 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay14.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Caloteiro" + "'", str26, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay47 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay47.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Caloteiro" + "'", str59, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-11) + "'", int75 == (-11));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarCaloteiros();
        java.lang.String str6 = facade0.listarTop10MelhoresUsuarios();
        facade0.cadastrarUsuario("JOGO ELETRONICO: 1: Nenhum emprestimos associados ao item - Reputacao: 0,00|, R$ 5.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "JOGO DE TABULEIRO: POLICIAL, R$ 10.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|2: BomAmigo - Reputacao: 0,00|");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("Nao emprestado", (double) 1L, "Caloteiro, MUSICAL, ");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        java.lang.String str5 = jogoEletronico3.getNome();
        jogoEletronico3.setPreco((double) 0);
        java.lang.String str8 = jogoEletronico3.getPlataforma();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Nao emprestado" + "'", str5, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OUTRO" + "'", str8, "OUTRO");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("DEZESSEIS_ANOS");
        facade0.fecharSistema();
        java.lang.String str9 = facade0.listarTop10Itens();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        java.lang.String str6 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        lp2.projetofinal.entidades.Usuario usuario43 = emprestimo42.getDonoDoItem();
        int int44 = emprestimo42.getNumeroDias();
        emprestimo42.setDataDevolucao("Nenhum emprestimos associados ao item");
        lp2.projetofinal.entidades.Usuario usuario47 = emprestimo42.getUsuarioRequerente();
        lp2.projetofinal.entidades.Emprestimo emprestimo49 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario47, "Caloteiro");
        java.lang.String str50 = usuario3.getNome();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str20, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(usuario47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Caloteiro" + "'", str50, "Caloteiro");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("1: hi! - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        jogoTabuleiro2.atualizaNumeroEmprestimos();
        int int4 = jogoTabuleiro2.getNumeroEmprestimos();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario5 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str6 = controllerUsuario5.listarCaloteiros();
        java.lang.String str7 = controllerUsuario5.listarTop10MelhoresUsuarios();
        controllerUsuario5.carregaMapaUsuarios();
        java.lang.String str9 = controllerUsuario5.listarTop10PioresUsuarios();
        java.lang.String str10 = controllerUsuario5.listarCaloteiros();
        java.lang.String str11 = controllerUsuario5.listarTop10MelhoresUsuarios();
        boolean boolean12 = jogoTabuleiro2.equals((java.lang.Object) controllerUsuario5);
        jogoTabuleiro2.adicionarPecaPerdida("JOGO DE TABULEIRO: DEZOITO_ANOS, R$ 1.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str10, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: POLICIAL, R$ 100.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("PS3", "", "Nao emprestado", "Nenhum item emprestado", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "Nenhum emprestimos associados ao item", (-15));
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
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        int int68 = bluRaySerie54.getDuracao();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        boolean boolean3 = cartaoNoob0.permisaoPegarEmprestado();
        java.lang.String str4 = cartaoNoob0.getNomeCartao();
        int int5 = cartaoNoob0.prazoEmprestimo();
        boolean boolean6 = cartaoNoob0.permisaoPegarEmprestado();
        int int7 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Noob" + "'", str4, "Noob");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        controllerUsuario29.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario29.verificaFidelidadeUsuario("DEZESSEIS_ANOS", "Emprestado");
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
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str11 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str12 = facade0.listarItensEmprestados();
        java.lang.String str13 = facade0.listarItensNaoEmprestados();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str10, "1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, Emprestado, 1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str1 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str2 = controllerEmprestimos0.listarItensEmprestados();
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
        lp2.projetofinal.entidades.Usuario usuario43 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str44 = usuario43.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo46 = new lp2.projetofinal.entidades.Emprestimo(usuario33, usuario43, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos47 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico51 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str52 = jogoEletronico51.getPlataforma();
        java.lang.String str53 = jogoEletronico51.getPlataforma();
        jogoEletronico51.itemDevolvido();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro57 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        jogoTabuleiro57.adicionarPecaPerdida("Caloteiro, Nao emprestado, ");
        int int60 = ordenaItemNumeroEmprestimos47.compare((lp2.projetofinal.entidades.Item) jogoEletronico51, (lp2.projetofinal.entidades.Item) jogoTabuleiro57);
        lp2.projetofinal.entidades.Emprestimo emprestimo63 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario43, (lp2.projetofinal.entidades.Item) jogoEletronico51, "Caloteiro, OUTRO, ", (int) (short) 10);
        java.lang.String str64 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario9);
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob65 = new lp2.projetofinal.entidades.CartaoNoob();
        int int66 = cartaoNoob65.prazoEmprestimo();
        boolean boolean67 = cartaoNoob65.permisaoPegarEmprestado();
        int int68 = cartaoNoob65.prazoEmprestimo();
        int int69 = cartaoNoob65.prazoEmprestimo();
        boolean boolean70 = cartaoNoob65.permisaoPegarEmprestado();
        java.lang.String str71 = cartaoNoob65.getNomeCartao();
        int int72 = cartaoNoob65.prazoEmprestimo();
        boolean boolean73 = cartaoNoob65.permisaoPegarEmprestado();
        boolean boolean74 = usuario9.equals((java.lang.Object) cartaoNoob65);
        int int75 = cartaoNoob65.prazoEmprestimo();
        java.lang.String str76 = cartaoNoob65.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(usuarioComparator5);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico11 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico11.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "OUTRO" + "'", str52, "OUTRO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "OUTRO" + "'", str53, "OUTRO");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Nenhum item pego emprestado" + "'", str64, "Nenhum item pego emprestado");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 7 + "'", int66 == 7);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 7 + "'", int68 == 7);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 7 + "'", int69 == 7);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Noob" + "'", str71, "Noob");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 7 + "'", int72 == 7);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 7 + "'", int75 == 7);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Noob" + "'", str76, "Noob");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", (double) 10, (-1), "1: ROMANCE - Reputacao: 0,00|", "EMPRESTIMO - De: Caloteiro, Para: ROMANCE, DOZE_ANOS, COMPLETO, 10 dias, ENTREGA: Emprestimo em andamento", (int) (short) -1);
        java.lang.String str7 = bluRayFilme6.getGenero();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico8 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean9 = usuario6.equals((java.lang.Object) plataformaJogoEletronico8);
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str14 = usuario13.getTelefone();
        int int15 = ordenaUsuarioReputacaoCrescente0.compare(usuario6, usuario13);
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos16 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str18 = controllerEmprestimos16.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos16.salvarListaEmprestimos();
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
        lp2.projetofinal.entidades.Usuario usuario41 = emprestimo40.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario42 = emprestimo40.getUsuarioRequerente();
        usuario42.setEmail("Nao emprestado");
        java.lang.String str45 = usuario42.toString();
        java.lang.String str46 = controllerEmprestimos16.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario42);
        lp2.projetofinal.entidades.Usuario usuario50 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        int int51 = ordenaUsuarioReputacaoCrescente0.compare(usuario42, usuario50);
        java.lang.String str52 = usuario42.getEmail();
        java.lang.String str53 = usuario42.toString();
        usuario42.atualizaReputacao(100.0d, false);
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str18, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro" + "'", str36, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario41);
        org.junit.Assert.assertNotNull(usuario42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Caloteiro, Nao emprestado, " + "'", str45, "Caloteiro, Nao emprestado, ");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Nenhum item pego emprestado" + "'", str46, "Nenhum item pego emprestado");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Nao emprestado" + "'", str52, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro, Nao emprestado, " + "'", str53, "Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", 0.0d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO DE TABULEIRO: Noob, R$ 1.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        java.lang.String str16 = sistema3.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = sistema3.getInfoUsuario("Emprestado", "1: Caloteiro - Reputacao: 0,00|2: Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|| - Reputacao: 0,00|", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int1 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str2 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str3 = cartaoFreeRyder0.getNomeCartao();
        int int4 = cartaoFreeRyder0.prazoEmprestimo();
        int int5 = cartaoFreeRyder0.prazoEmprestimo();
        int int6 = cartaoFreeRyder0.prazoEmprestimo();
        boolean boolean7 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean8 = cartaoFreeRyder0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FreeRyder" + "'", str2, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FreeRyder" + "'", str3, "FreeRyder");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
        lp2.projetofinal.entidades.Usuario usuario28 = emprestimo20.getDonoDoItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente29 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario33 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str34 = usuario33.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario38 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int39 = ordenaUsuarioReputacaoCrescente29.compare(usuario33, usuario38);
        lp2.projetofinal.entidades.Usuario usuario43 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str44 = usuario43.getTelefone();
        java.lang.String str45 = usuario43.getNome();
        lp2.projetofinal.entidades.Item item46 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo49 = new lp2.projetofinal.entidades.Emprestimo(usuario38, usuario43, item46, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo56 = new lp2.projetofinal.entidades.Emprestimo(usuario43, usuario53, "1: OUTRO - Reputacao: 0,00|");
        double double57 = usuario43.getReputacao();
        usuario43.setEmail("MUSICAL");
        lp2.projetofinal.entidades.Emprestimo emprestimo61 = new lp2.projetofinal.entidades.Emprestimo(usuario28, usuario43, "JOGO DE TABULEIRO: Caloteiro, OUTRO, Nenhum emprestimos associados ao item, R$ 1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(usuario27);
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Caloteiro" + "'", str45, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.controllers.ControllerItens controllerItens1 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray2 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet3 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet3, itemArray2);
        controllerItens1.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet3, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario8 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str9 = controllerUsuario8.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet10 = controllerUsuario8.todosUsuariosItens();
        controllerItens1.adicionaItem(itemSet10, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario18 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str19 = controllerUsuario18.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet20 = controllerUsuario18.todosUsuariosItens();
        java.lang.String str21 = controllerItens1.listarTop10Itens(itemSet20);
        lp2.projetofinal.controllers.ControllerItens controllerItens22 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray23 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet24 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet24, itemArray23);
        controllerItens22.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet24, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario29 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str30 = controllerUsuario29.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet31 = controllerUsuario29.todosUsuariosItens();
        controllerItens22.adicionaItem(itemSet31, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens39 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray40 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet41 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet41, itemArray40);
        controllerItens39.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet41, "Caloteiro", (-1.0d));
        java.lang.String str46 = controllerItens22.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet41);
        lp2.projetofinal.entidades.Item item48 = controllerItens1.identificaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet41, "Caloteiro");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme55 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str56 = bluRayFilme55.getGenero();
        java.lang.String str57 = bluRayFilme55.getGenero();
        int int58 = ordenaItemPeloPreco0.compare(item48, (lp2.projetofinal.entidades.Item) bluRayFilme55);
        bluRayFilme55.atualizar("1: OUTRO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
        int int62 = bluRayFilme55.getAnoLancamento();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(itemSet10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(itemSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(itemSet31);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str46, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "OUTRO" + "'", str56, "OUTRO");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "OUTRO" + "'", str57, "OUTRO");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", (double) 35, (-49), "JOGO DE TABULEIRO: Caloteiro, OUTRO, Nenhum emprestimos associados ao item, R$ 1.0, Nao emprestado, COMPLETO|", "Caloteiro, MUSICAL, ", (int) (byte) 100);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Nenhum item emprestado, OUTRO, ", (double) 14, 10, "Caloteiro, Nenhum emprestimos associados ao item, ", "COMPLETO", (int) (byte) -1);
        bluRayFilme6.setNome("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, Emprestado, 1: ROMANCE - Reputacao: 0,00|");
        double double9 = bluRayFilme6.getPreco();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.0d + "'", double9 == 14.0d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.fecharSistema();
        facade0.fecharSistema();
        java.lang.String str7 = facade0.listarTop10PioresUsuarios();
        java.lang.String str8 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("1: OUTRO - Reputacao: 0,00|", "Nao emprestado", "", 97.0d, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.facade.Facade facade5 = new lp2.projetofinal.facade.Facade();
        facade5.fecharSistema();
        java.lang.String str8 = facade5.listarEmprestimosItem("OUTRO");
        facade5.resetarPersistencia();
        java.lang.String str10 = facade5.listarTop10Itens();
        boolean boolean11 = jogoEletronico3.equals((java.lang.Object) facade5);
        java.lang.String str12 = facade5.listarItensNaoEmprestados();
        java.lang.String str13 = facade5.listarItensEmprestados();
        java.lang.String str14 = facade5.listarItensOrdenadosPorValor();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        lp2.projetofinal.entidades.Item item23 = emprestimo20.getItem();
        java.lang.Object obj24 = null;
        boolean boolean25 = emprestimo20.equals(obj24);
        int int26 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario27 = emprestimo20.getUsuarioRequerente();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(usuario27);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str7 = bluRayShow6.getNomeArtista();
        int int8 = bluRayShow6.getNumFaixas();
        int int9 = bluRayShow6.getNumFaixas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator1 = ordenaUsuarioReputacaoCrescente0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = usuarioComparator1.reversed();
        org.junit.Assert.assertNotNull(usuarioComparator1);
        org.junit.Assert.assertNotNull(usuarioComparator2);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("FreeRyder", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        java.lang.String str6 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        java.lang.String str23 = usuario9.getEmail();
        usuario9.setNome("Caloteiro, Nao emprestado, ");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente26 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str31 = usuario30.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario35 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int36 = ordenaUsuarioReputacaoCrescente26.compare(usuario30, usuario35);
        lp2.projetofinal.entidades.Usuario usuario40 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str41 = usuario40.getTelefone();
        java.lang.String str42 = usuario40.getNome();
        lp2.projetofinal.entidades.Item item43 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo46 = new lp2.projetofinal.entidades.Emprestimo(usuario35, usuario40, item43, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario50 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str51 = usuario50.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo53 = new lp2.projetofinal.entidades.Emprestimo(usuario40, usuario50, "1: OUTRO - Reputacao: 0,00|");
        usuario50.atualizaReputacao((double) 64, false);
        int int57 = usuario9.compareTo(usuario50);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente58 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str63 = usuario62.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario67 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int68 = ordenaUsuarioReputacaoCrescente58.compare(usuario62, usuario67);
        lp2.projetofinal.entidades.Usuario usuario72 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str73 = usuario72.getTelefone();
        java.lang.String str74 = usuario72.getNome();
        lp2.projetofinal.entidades.Item item75 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo78 = new lp2.projetofinal.entidades.Emprestimo(usuario67, usuario72, item75, "OUTRO", 100);
        java.lang.String str79 = usuario72.getNome();
        usuario72.setEmail("MUSICAL");
        usuario72.atualizaReputacao((double) (-1L), false);
        usuario72.atualizaReputacao((double) (-1), true);
        java.lang.String str88 = usuario72.getTelefone();
        lp2.projetofinal.entidades.BluRayShow bluRayShow95 = new lp2.projetofinal.entidades.BluRayShow("JOGO DE TABULEIRO: POLICIAL, R$ 10.0, Nao emprestado, COM PECAS PERDIDAS", (double) (-49), 4, "1: Caloteiro, OUTRO,  - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "Nao emprestado", 7);
        lp2.projetofinal.entidades.Emprestimo emprestimo98 = new lp2.projetofinal.entidades.Emprestimo(usuario50, usuario72, (lp2.projetofinal.entidades.Item) bluRayShow95, "Caloteiro, Nenhum emprestimos associados ao item, ", 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OUTRO" + "'", str23, "OUTRO");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Caloteiro" + "'", str42, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 18 + "'", int57 == 18);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Caloteiro" + "'", str74, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Caloteiro" + "'", str79, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("1: ROMANCE - Reputacao: 0,00|", "XBOX360");
        java.lang.String str3 = chaveNomeTelefone2.getTelefone();
        java.lang.String str4 = chaveNomeTelefone2.getTelefone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "XBOX360" + "'", str3, "XBOX360");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "XBOX360" + "'", str4, "XBOX360");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarItensEmprestados();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        sistema0.cadastrarUsuario("PC", "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|", "Caloteiro, OUTRO, ");
        java.lang.String str11 = sistema0.listarItensEmprestados();
        java.lang.String str12 = sistema0.listarItensEmprestados();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
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
            facade0.atualizarItem("PC, AVENTURA, Emprestado", "1: COMPLETO - Reputacao: 0,00|", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|");
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
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, MUSICAL, ", (double) 35);
        java.lang.String str3 = jogoTabuleiro2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, MUSICAL, , R$ 35.0, Nao emprestado, COMPLETO" + "'", str3, "JOGO DE TABULEIRO: Caloteiro, MUSICAL, , R$ 35.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str9 = sistema0.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) 7, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str4 = jogoEletronico3.toString();
        java.lang.String str5 = jogoEletronico3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO" + "'", str5, "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        controllerEmprestimos0.salvarListaEmprestimos();
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
        java.lang.String str23 = usuario16.getNome();
        usuario16.setEmail("MUSICAL");
        java.lang.String str26 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario16);
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico32 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean33 = usuario30.equals((java.lang.Object) plataformaJogoEletronico32);
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
        usuario48.atualizaReputacao((double) (-1), true);
        java.lang.String str58 = usuario48.toString();
        java.lang.String str59 = usuario48.getTelefone();
        usuario48.setTelefone("Nenhum item emprestado");
        int int62 = usuario30.compareTo(usuario48);
        int int63 = usuario16.compareTo(usuario48);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Caloteiro" + "'", str23, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Nenhum item pego emprestado" + "'", str26, "Nenhum item pego emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico32 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico32.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Caloteiro" + "'", str50, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Caloteiro, OUTRO, " + "'", str58, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        java.lang.String str1 = cartaoBomAmigo0.getNomeCartao();
        java.lang.String str2 = cartaoBomAmigo0.getNomeCartao();
        int int3 = cartaoBomAmigo0.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BomAmigo" + "'", str1, "BomAmigo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BomAmigo" + "'", str2, "BomAmigo");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str9 = bluRaySerie7.getInfo("Nao emprestado");
        java.lang.String str10 = bluRaySerie7.getNome();
        bluRaySerie7.atualizar("Emprestado, , Caloteiro, Nao emprestado, ", "DOCUMENTARIO");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Noob" + "'", str10, "Noob");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str5 = sistema0.listarTop10Itens();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("ROMANCE, MUSICAL, hi!");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int1 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str2 = cartaoFreeRyder0.getNomeCartao();
        boolean boolean3 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean4 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean5 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean6 = cartaoFreeRyder0.permisaoPegarEmprestado();
        java.lang.String str7 = cartaoFreeRyder0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FreeRyder" + "'", str2, "FreeRyder");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FreeRyder" + "'", str7, "FreeRyder");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        facade0.fecharSistema();
        facade0.iniciarSistema();
        java.lang.String str7 = facade0.listarTop10MelhoresUsuarios();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("DEZOITO_ANOS", "Nao emprestado", "DOZE_ANOS", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str10 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str11 = sistema0.listarItensNaoEmprestados();
        java.lang.String str13 = sistema0.listarEmprestimosItem("1: Noob - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str13, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str6 = controllerUsuario0.listarTop10PioresUsuarios();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        java.lang.String str3 = cartaoCaloteiro0.getNomeCartao();
        boolean boolean4 = cartaoCaloteiro0.permisaoPegarEmprestado();
        boolean boolean5 = cartaoCaloteiro0.permisaoPegarEmprestado();
        java.lang.String str6 = cartaoCaloteiro0.getNomeCartao();
        boolean boolean7 = cartaoCaloteiro0.permisaoPegarEmprestado();
        boolean boolean8 = cartaoCaloteiro0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Caloteiro" + "'", str3, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Caloteiro" + "'", str6, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Nenhum emprestimos associados ao item", (double) 7, (int) (short) 0, "Nao emprestado", "Nenhum emprestimos associados ao item", (int) (short) 0);
        java.lang.String str8 = bluRayShow6.getInfo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        bluRayShow6.atualizaNumeroEmprestimos();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str1 = cartaoCaloteiro0.getNomeCartao();
        java.lang.String str2 = cartaoCaloteiro0.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Caloteiro" + "'", str1, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Caloteiro" + "'", str2, "Caloteiro");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", (double) 10, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
            facade0.cadastrarBluRayFilme("Caloteiro", "Caloteiro, OUTRO, ", "NINTENDO 3DS", (double) (short) 100, 4, "DOZE_ANOS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.cadastrarUsuario("Caloteiro, OUTRO, ", "1: ROMANCE - Reputacao: 0,00|", "1: ROMANCE - Reputacao: 0,00|");
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("JOGO DE TABULEIRO: POLICIAL, R$ 100.0, Nao emprestado, COMPLETO", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        java.lang.String str17 = sistema3.listarTop10MelhoresUsuarios();
        java.lang.String str18 = sistema3.listarItensOrdenadosPorValor();
        sistema3.resetarPersistencia();
        sistema3.cadastrarUsuario("1: ROMANCE - Reputacao: 0,00|", "DEZ_ANOS", "BomAmigo");
        java.lang.String str24 = sistema3.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str16, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str17, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str24, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str6 = facade0.listarTop10MelhoresUsuarios();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("AVENTURA", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Nao emprestado");
        usuario3.setTelefone("1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente6 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator8 = ordenaUsuarioReputacaoCrescente6.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico14 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean15 = usuario12.equals((java.lang.Object) plataformaJogoEletronico14);
        lp2.projetofinal.entidades.Usuario usuario19 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str20 = usuario19.getTelefone();
        int int21 = ordenaUsuarioReputacaoCrescente6.compare(usuario12, usuario19);
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
        lp2.projetofinal.entidades.Usuario usuario43 = emprestimo42.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro44 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario43.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro44);
        java.lang.String str46 = cartaoCaloteiro44.getNomeCartao();
        boolean boolean47 = cartaoCaloteiro44.permisaoPegarEmprestado();
        usuario19.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro44);
        lp2.projetofinal.entidades.Usuario usuario52 = new lp2.projetofinal.entidades.Usuario("MUSICAL", "Lista de usuarios com reputacao negativa: ", "OUTRO");
        lp2.projetofinal.entidades.Emprestimo emprestimo54 = new lp2.projetofinal.entidades.Emprestimo(usuario19, usuario52, "Caloteiro");
        usuario19.atualizaReputacao((double) ' ', false);
        usuario19.setNome("DOCUMENTARIO");
        java.lang.String str60 = usuario19.getTelefone();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente61 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario65 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str66 = usuario65.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario70 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int71 = ordenaUsuarioReputacaoCrescente61.compare(usuario65, usuario70);
        lp2.projetofinal.entidades.Usuario usuario75 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str76 = usuario75.getTelefone();
        java.lang.String str77 = usuario75.getNome();
        lp2.projetofinal.entidades.Item item78 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo81 = new lp2.projetofinal.entidades.Emprestimo(usuario70, usuario75, item78, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario82 = emprestimo81.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario83 = emprestimo81.getUsuarioRequerente();
        usuario83.setEmail("Nao emprestado");
        lp2.projetofinal.entidades.Emprestimo emprestimo87 = new lp2.projetofinal.entidades.Emprestimo(usuario19, usuario83, "Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie95 = new lp2.projetofinal.entidades.BluRaySerie("Nenhum item emprestado", (double) 10, "BomAmigo", (-4), "PS3", "Nenhum item pego emprestado", (-11));
        java.lang.String str96 = bluRaySerie95.getDescricao();
        lp2.projetofinal.entidades.Emprestimo emprestimo99 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario83, (lp2.projetofinal.entidades.Item) bluRaySerie95, "1: Lista de usuarios com reputacao negativa:  - Reputacao: 0,00|", (int) (byte) 10);
        org.junit.Assert.assertNotNull(usuarioComparator8);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico14 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico14.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro" + "'", str46, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Caloteiro" + "'", str77, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario82);
        org.junit.Assert.assertNotNull(usuario83);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "BomAmigo" + "'", str96, "BomAmigo");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", "hi!", "JOGO DE TABULEIRO: MUSICAL, R$ 0.0, Nao emprestado, COMPLETO|", "ROMANCE, MUSICAL, hi!");
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
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        java.lang.String str6 = facade0.listarTop10PioresUsuarios();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        int int3 = cartaoNoob0.prazoEmprestimo();
        int int4 = cartaoNoob0.prazoEmprestimo();
        boolean boolean5 = cartaoNoob0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
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
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str32 = usuario31.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo34 = new lp2.projetofinal.entidades.Emprestimo(usuario21, usuario31, "1: OUTRO - Reputacao: 0,00|");
        usuario31.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet37 = usuario31.retornaSeusItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet37, "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Caloteiro" + "'", str23, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(itemSet37);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        java.lang.String str12 = facade0.listarEmprestimosItem("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str12, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        sistema0.resetarPersistencia();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str10 = sistema0.listarEmprestimosItem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str10, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        sistema0.cadastrarUsuario("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
        java.lang.String str11 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("JOGO ELETRONICO: 1: Caloteiro - Reputacao: 0,00|, R$ 1.0, Nao emprestado, OUTRO|", "Caloteiro, Nao emprestado, ", "Emprestado, , Caloteiro, Nao emprestado, ", (double) (byte) 1, 0, "DEZ_ANOS", "JOGO ELETRONICO: 1: Nenhum emprestimos associados ao item - Reputacao: 0,00|, R$ 5.0, Nao emprestado, OUTRO", (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str11, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str5 = jogoEletronico3.getInfo("");
        java.lang.String str6 = jogoEletronico3.getPlataforma();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUTRO" + "'", str6, "OUTRO");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        java.lang.String str17 = sistema3.listarItensEmprestados();
        java.lang.String str18 = sistema3.listarCaloteiros();
        java.lang.String str19 = sistema3.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = sistema3.listarEmprestimosUsuarioPegandoEmprestado("JOGO ELETRONICO: Nao emprestado, R$ -1.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str18, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet2 = controllerUsuario0.todosUsuariosItens();
        controllerUsuario0.cadastrarUsuario("", "Caloteiro, OUTRO, ", "Caloteiro, OUTRO, ");
        controllerUsuario0.salvarMapaUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(itemSet2);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarCaloteiros();
        java.lang.String str6 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("ACAO", "BomAmigo", "BomAmigo", 32.0d, "Nenhum item emprestado, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        usuario24.setNome("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro, OUTRO, ", "Nenhum item pego emprestado", "Caloteiro");
        usuario37.atualizaReputacao((double) 7, false);
        int int41 = usuario24.compareTo(usuario37);
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos42 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str43 = controllerEmprestimos42.listarItensEmprestados();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente44 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario48 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str49 = usuario48.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int54 = ordenaUsuarioReputacaoCrescente44.compare(usuario48, usuario53);
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str59 = usuario58.getTelefone();
        java.lang.String str60 = usuario58.getNome();
        lp2.projetofinal.entidades.Item item61 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo64 = new lp2.projetofinal.entidades.Emprestimo(usuario53, usuario58, item61, "OUTRO", 100);
        usuario53.setEmail("OUTRO");
        java.lang.String str67 = usuario53.getEmail();
        java.lang.String str68 = controllerEmprestimos42.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario53);
        lp2.projetofinal.entidades.Usuario usuario72 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str73 = usuario72.getTelefone();
        java.lang.String str74 = controllerEmprestimos42.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario72);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie82 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int83 = bluRaySerie82.getNumeroEmprestimos();
        int int84 = bluRaySerie82.duracaoTotal();
        int int85 = bluRaySerie82.getDuracao();
        bluRaySerie82.adicionarBluRay((int) ' ');
        lp2.projetofinal.entidades.Emprestimo emprestimo90 = new lp2.projetofinal.entidades.Emprestimo(usuario24, usuario72, (lp2.projetofinal.entidades.Item) bluRaySerie82, "Caloteiro, Nao emprestado, ", 37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Caloteiro" + "'", str60, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "OUTRO" + "'", str67, "OUTRO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Nenhum item emprestado" + "'", str68, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Nenhum item emprestado" + "'", str74, "Nenhum item emprestado");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("COM PECAS PERDIDAS");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        lp2.projetofinal.entidades.Usuario usuario25 = emprestimo24.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario26 = emprestimo24.getUsuarioRequerente();
        usuario26.setEmail("Nao emprestado");
        java.lang.String str29 = usuario26.toString();
        java.lang.String str30 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario26);
        controllerEmprestimos0.salvarListaEmprestimos();
        java.lang.String str33 = controllerEmprestimos0.listarEmprestimosItens("PC");
        controllerEmprestimos0.carregaListaEmprestimos();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertNotNull(usuario26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Caloteiro, Nao emprestado, " + "'", str29, "Caloteiro, Nao emprestado, ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Nenhum item pego emprestado" + "'", str30, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str33, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean1 = cartaoBomAmigo0.permisaoPegarEmprestado();
        int int2 = cartaoBomAmigo0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean1 = cartaoBomAmigo0.permisaoPegarEmprestado();
        java.lang.String str2 = cartaoBomAmigo0.getNomeCartao();
        java.lang.String str3 = cartaoBomAmigo0.getNomeCartao();
        boolean boolean4 = cartaoBomAmigo0.permisaoPegarEmprestado();
        boolean boolean5 = cartaoBomAmigo0.permisaoPegarEmprestado();
        boolean boolean6 = cartaoBomAmigo0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BomAmigo" + "'", str2, "BomAmigo");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BomAmigo" + "'", str3, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        java.lang.String str77 = jogoTabuleiro36.contemPecasPerdidas();
        java.lang.String str78 = jogoTabuleiro36.contemPecasPerdidas();
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "COMPLETO" + "'", str77, "COMPLETO");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "COMPLETO" + "'", str78, "COMPLETO");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        double double58 = jogoTabuleiro3.getPreco();
        int int59 = jogoTabuleiro3.getNumeroEmprestimos();
        java.lang.String str60 = jogoTabuleiro3.contemPecasPerdidas();
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "COM PECAS PERDIDAS" + "'", str60, "COM PECAS PERDIDAS");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str4 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str6 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", "NINTENDO 3DS", "JOGO DE TABULEIRO: Noob, R$ 1.0, Emprestado, COMPLETO", 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        java.lang.String str3 = cartaoCaloteiro0.getNomeCartao();
        boolean boolean4 = cartaoCaloteiro0.permisaoPegarEmprestado();
        boolean boolean5 = cartaoCaloteiro0.permisaoPegarEmprestado();
        java.lang.String str6 = cartaoCaloteiro0.getNomeCartao();
        int int7 = cartaoCaloteiro0.prazoEmprestimo();
        boolean boolean8 = cartaoCaloteiro0.permisaoPegarEmprestado();
        boolean boolean9 = cartaoCaloteiro0.permisaoPegarEmprestado();
        java.lang.String str10 = cartaoCaloteiro0.getNomeCartao();
        java.lang.String str11 = cartaoCaloteiro0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Caloteiro" + "'", str3, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Caloteiro" + "'", str6, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Caloteiro" + "'", str11, "Caloteiro");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, Emprestado, 1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        int int3 = cartaoNoob0.prazoEmprestimo();
        int int4 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str5 = cartaoNoob0.getNomeCartao();
        int int6 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Noob" + "'", str5, "Noob");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, Emprestado, 1: ROMANCE - Reputacao: 0,00|");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro5 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema6 = new lp2.projetofinal.controllers.Sistema();
        sistema6.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema6.finalizar();
        java.lang.String str12 = sistema6.listarItensOrdenadosPorNome();
        java.lang.String str13 = sistema6.listarItensOrdenadosPorNome();
        boolean boolean14 = jogoTabuleiro5.equals((java.lang.Object) sistema6);
        java.lang.String str15 = sistema6.listarItensOrdenadosPorNome();
        sistema6.finalizar();
        java.lang.String str18 = sistema6.listarEmprestimosItem("ROMANCE");
        java.lang.String str19 = sistema6.listarItensNaoEmprestados();
        boolean boolean20 = chaveNomeTelefone2.equals((java.lang.Object) sistema6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str18, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int1 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str2 = cartaoFreeRyder0.getNomeCartao();
        boolean boolean3 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean4 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean5 = cartaoFreeRyder0.permisaoPegarEmprestado();
        java.lang.String str6 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str7 = cartaoFreeRyder0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FreeRyder" + "'", str2, "FreeRyder");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FreeRyder" + "'", str6, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FreeRyder" + "'", str7, "FreeRyder");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: Emprestado, R$ -18.0, Nao emprestado, COMPLETO", 0.0d, "1: Caloteiro - Reputacao: 0,00|", (int) ' ', "JOGO ELETRONICO: DOZE_ANOS, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", (int) (byte) 1);
        int int8 = bluRaySerie7.duracaoTotal();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str7 = bluRayFilme6.getGenero();
        int int8 = bluRayFilme6.getNumeroEmprestimos();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        bluRaySerie8.atualizar("BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente40 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario44 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str45 = usuario44.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario49 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int50 = ordenaUsuarioReputacaoCrescente40.compare(usuario44, usuario49);
        lp2.projetofinal.entidades.Usuario usuario54 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str55 = usuario54.getTelefone();
        java.lang.String str56 = usuario54.getNome();
        lp2.projetofinal.entidades.Item item57 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo60 = new lp2.projetofinal.entidades.Emprestimo(usuario49, usuario54, item57, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str65 = usuario64.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo67 = new lp2.projetofinal.entidades.Emprestimo(usuario54, usuario64, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.entidades.Usuario usuario68 = emprestimo67.getDonoDoItem();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario69 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str70 = controllerUsuario69.listarTop10PioresUsuarios();
        java.lang.String str71 = controllerUsuario69.listarCaloteiros();
        java.lang.String str72 = controllerUsuario69.listarTop10PioresUsuarios();
        boolean boolean73 = emprestimo67.equals((java.lang.Object) controllerUsuario69);
        boolean boolean74 = bluRaySerie8.equals((java.lang.Object) boolean73);
        java.lang.String str75 = bluRaySerie8.getDescricao();
        java.lang.String str76 = bluRaySerie8.getDescricao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Caloteiro" + "'", str56, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(usuario68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str71, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str75, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str76, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        controllerItens0.adicionaItem(itemSet29, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (double) (-1L), 1, 0, "ROMANCE", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario37 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str38 = controllerUsuario37.listarCaloteiros();
        java.lang.String str39 = controllerUsuario37.listarTop10MelhoresUsuarios();
        controllerUsuario37.carregaMapaUsuarios();
        java.lang.String str41 = controllerUsuario37.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet42 = controllerUsuario37.todosUsuariosItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet43 = controllerUsuario37.todosUsuariosItens();
        java.lang.String str44 = controllerItens0.listarItensOrdenadosPorNome(itemSet43);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str38, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(itemSet42);
        org.junit.Assert.assertNotNull(itemSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Lista de usuarios com reputacao negativa: ");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("Noob", "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ 0.0, Nao emprestado, OUTRO", "1: POLICIAL - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("1: Noob - Reputacao: 0,00|", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "BomAmigo");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay0 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        java.lang.String str1 = classificacaoBluRay0.getClassificacao();
        java.lang.String str2 = classificacaoBluRay0.getClassificacao();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay0 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay0.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DEZESSEIS_ANOS" + "'", str1, "DEZESSEIS_ANOS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DEZESSEIS_ANOS" + "'", str2, "DEZESSEIS_ANOS");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "");
        java.lang.String str3 = chaveNomeTelefone2.getNome();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico7 = new lp2.projetofinal.entidades.JogoEletronico("Nao emprestado", (double) 1L, "Caloteiro, MUSICAL, ");
        java.lang.String str8 = jogoEletronico7.getPlataforma();
        jogoEletronico7.setNome("");
        boolean boolean11 = chaveNomeTelefone2.equals((java.lang.Object) jogoEletronico7);
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente33 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int43 = ordenaUsuarioReputacaoCrescente33.compare(usuario37, usuario42);
        int int44 = usuario26.compareTo(usuario42);
        double double45 = usuario26.getReputacao();
        lp2.projetofinal.entidades.BluRayShow bluRayShow52 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay53 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean54 = bluRayShow52.equals((java.lang.Object) classificacaoBluRay53);
        bluRayShow52.atualizar("hi!", "OUTRO");
        java.lang.String str58 = bluRayShow52.getNome();
        bluRayShow52.atualizar("Lista de usuarios com reputacao negativa: ", "Caloteiro");
        boolean boolean62 = usuario26.equals((java.lang.Object) bluRayShow52);
        bluRayShow52.atualizar("1: COMPLETO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
        int int66 = bluRayShow52.getNumFaixas();
        bluRayShow52.atualizaNumeroEmprestimos();
        boolean boolean68 = chaveNomeTelefone2.equals((java.lang.Object) bluRayShow52);
        java.lang.String str69 = bluRayShow52.getNomeArtista();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OUTRO" + "'", str8, "OUTRO");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Caloteiro" + "'", str28, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + classificacaoBluRay53 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay53.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Caloteiro" + "'", str58, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        sistema0.cadastrarUsuario("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
        sistema0.finalizar();
        java.lang.String str12 = sistema0.listarItensNaoEmprestados();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("", "NINTENDO 3DS", "Caloteiro, Nao emprestado, ", "PS3", "JOGO DE TABULEIRO: DEZOITO_ANOS, R$ 1.0, Nao emprestado, COMPLETO", "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ 0.0, Nao emprestado, OUTRO", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.finalizar();
        java.lang.String str14 = sistema3.listarTop10Itens();
        java.lang.String str15 = sistema3.listarItensOrdenadosPorValor();
        java.lang.String str16 = sistema3.listarItensEmprestados();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("Caloteiro, Nenhum emprestimos associados ao item, ");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.toString();
        java.lang.String str5 = jogoEletronico3.getPlataforma();
        java.lang.String str6 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo7 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean8 = cartaoBomAmigo7.permisaoPegarEmprestado();
        java.lang.String str9 = cartaoBomAmigo7.getNomeCartao();
        boolean boolean10 = cartaoBomAmigo7.permisaoPegarEmprestado();
        int int11 = cartaoBomAmigo7.prazoEmprestimo();
        java.lang.String str12 = cartaoBomAmigo7.getNomeCartao();
        boolean boolean13 = jogoEletronico3.equals((java.lang.Object) cartaoBomAmigo7);
        boolean boolean14 = cartaoBomAmigo7.permisaoPegarEmprestado();
        int int15 = cartaoBomAmigo7.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUTRO" + "'", str6, "OUTRO");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "BomAmigo" + "'", str9, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BomAmigo" + "'", str12, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str1 = cartaoCaloteiro0.getNomeCartao();
        boolean boolean2 = cartaoCaloteiro0.permisaoPegarEmprestado();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Caloteiro" + "'", str1, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo(32.0d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str6 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario9 = controllerUsuario0.identificaUsuario("POLICIAL", "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|");
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
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO ELETRONICO: DOZE_ANOS, R$ 10.0, Nao emprestado, OUTRO", (double) (-37), "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", 5, "JOGO DE TABULEIRO: DEZOITO_ANOS, R$ 1.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: MUSICAL, R$ 0.0, Nao emprestado, COMPLETO|", 14);
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro10 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str11 = jogoTabuleiro10.contemPecasPerdidas();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente12 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente13 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator14 = ordenaUsuarioReputacaoCrescente12.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente13);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator15 = ordenaUsuarioReputacaoCrescente12.reversed();
        boolean boolean16 = jogoTabuleiro10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente12);
        int int17 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) jogoTabuleiro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETO" + "'", str11, "COMPLETO");
        org.junit.Assert.assertNotNull(usuarioComparator14);
        org.junit.Assert.assertNotNull(usuarioComparator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-30) + "'", int17 == (-30));
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        java.lang.String str10 = sistema0.listarEmprestimosItem("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("JOGO ELETRONICO: DOZE_ANOS, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str10, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
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
        usuario21.atualizaReputacao((double) (-1), true);
        java.lang.String str31 = usuario21.toString();
        java.lang.String str32 = usuario21.getTelefone();
        usuario21.setTelefone("Nenhum item emprestado");
        int int35 = usuario3.compareTo(usuario21);
        double double36 = usuario21.getReputacao();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Caloteiro" + "'", str23, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro, OUTRO, " + "'", str31, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean1 = cartaoBomAmigo0.permisaoPegarEmprestado();
        java.lang.String str2 = cartaoBomAmigo0.getNomeCartao();
        boolean boolean3 = cartaoBomAmigo0.permisaoPegarEmprestado();
        int int4 = cartaoBomAmigo0.prazoEmprestimo();
        java.lang.String str5 = cartaoBomAmigo0.getNomeCartao();
        java.lang.String str6 = cartaoBomAmigo0.getNomeCartao();
        boolean boolean7 = cartaoBomAmigo0.permisaoPegarEmprestado();
        int int8 = cartaoBomAmigo0.prazoEmprestimo();
        int int9 = cartaoBomAmigo0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BomAmigo" + "'", str2, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BomAmigo" + "'", str5, "BomAmigo");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "BomAmigo" + "'", str6, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
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
        lp2.projetofinal.entidades.Usuario usuario28 = emprestimo20.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario29 = emprestimo20.getUsuarioRequerente();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(usuario27);
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertNotNull(usuario29);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        java.lang.String str6 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario0.retornaUsuarioItens("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ -4.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: Caloteiro - Reputacao: 0,00|" + "'", str6, "1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
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
        int int80 = jogoTabuleiro37.getNumeroEmprestimos();
        java.lang.String str81 = jogoTabuleiro37.contemPecasPerdidas();
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "COM PECAS PERDIDAS" + "'", str81, "COM PECAS PERDIDAS");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Caloteiro, Nao emprestado, ", "Nenhum item emprestado", "DEZOITO_ANOS");
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
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico8 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean9 = usuario6.equals((java.lang.Object) plataformaJogoEletronico8);
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str14 = usuario13.getTelefone();
        int int15 = ordenaUsuarioReputacaoCrescente0.compare(usuario6, usuario13);
        java.lang.String str16 = usuario6.getTelefone();
        double double17 = usuario6.getReputacao();
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade18 = usuario6.getCartao();
        usuario6.setNome("Emprestado");
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(cartaoFidelidade18);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("Noob", "PS3", "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: XBOX360, R$ 100.0, Nao emprestado, OUTRO", "1: Noob - Reputacao: 0,00|");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
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
        int int38 = bluRayShow34.getNumFaixas();
        bluRayShow34.atualizar("JOGO ELETRONICO: XBOX360, R$ 100.0, Nao emprestado, OUTRO", "1: POLICIAL - Reputacao: 0,00|");
        bluRayShow34.setPreco((double) (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
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
        bluRayFilme87.atualizaNumeroEmprestimos();
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
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("Nao emprestado", (double) 1L, "Caloteiro, MUSICAL, ");
        java.lang.String str4 = jogoEletronico3.toString();
        java.lang.String str5 = jogoEletronico3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO" + "'", str5, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str11 = sistema0.listarEmprestimosItem("Lista de usuarios com reputacao negativa: ");
        java.lang.String str12 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Lista de usuarios com reputacao negativa: ", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "EMPRESTIMO - De: Caloteiro, Para: ROMANCE, DOZE_ANOS, COMPLETO, 10 dias, ENTREGA: Emprestimo em andamento", "JOGO DE TABULEIRO: JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO, R$ 10.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str12, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Nao emprestado", (-7.0d), (-1), "JOGO DE TABULEIRO: Caloteiro, OUTRO, Nenhum emprestimos associados ao item, R$ 1.0, Nao emprestado, COMPLETO|", "Nenhum item pego emprestado", (-37));
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.controllers.ControllerItens controllerItens5 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray6 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet7 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet7, itemArray6);
        controllerItens5.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet7, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens12 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray13 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet14 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet14, itemArray13);
        controllerItens12.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet14, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario19 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str20 = controllerUsuario19.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet21 = controllerUsuario19.todosUsuariosItens();
        controllerItens12.adicionaItem(itemSet21, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens5.adicionaItem(itemSet21, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerItens controllerItens37 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray38 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet39 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet39, itemArray38);
        controllerItens37.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet39, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario44 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str45 = controllerUsuario44.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet46 = controllerUsuario44.todosUsuariosItens();
        controllerItens37.adicionaItem(itemSet46, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario54 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str55 = controllerUsuario54.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet56 = controllerUsuario54.todosUsuariosItens();
        controllerItens37.adicionaItem(itemSet56, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.controllers.ControllerItens controllerItens61 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray62 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet63 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet63, itemArray62);
        controllerItens61.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet63, "Caloteiro", (-1.0d));
        java.lang.String str68 = controllerItens37.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet63);
        java.lang.String str69 = controllerItens5.listarItensOrdenadosPorNome((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet63);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario70 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str71 = controllerUsuario70.listarTop10PioresUsuarios();
        java.lang.String str72 = controllerUsuario70.listarTop10PioresUsuarios();
        java.lang.String str73 = controllerUsuario70.listarCaloteiros();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet74 = controllerUsuario70.todosUsuariosItens();
        java.lang.String str75 = controllerItens5.listarItensOrdenadosPorNome(itemSet74);
        boolean boolean76 = jogoEletronico3.equals((java.lang.Object) str75);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(itemSet21);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(itemSet46);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(itemSet56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str68, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str69, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str73, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertNotNull(itemSet74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        int int41 = bluRaySerie8.getNumeroTemporada();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "COMPLETO" + "'", str37, "COMPLETO");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("Nao emprestado", "PS3", "QUATORZE_ANOS", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("DOZE_ANOS", (double) 100.0f, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme10 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", (double) (-18), 35, "1: COMPLETO - Reputacao: 0,00|", "ROMANCE", (-15));
        boolean boolean11 = jogoEletronico3.equals((java.lang.Object) "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
        jogoEletronico3.atualizar("", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        java.lang.String str6 = sistema0.listarEmprestimosItem("POLICIAL");
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", 1.0d, "1: OUTRO - Reputacao: 0,00|", 35, "Nenhum item pego emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (int) (short) 1);
        bluRaySerie7.atualizar("LIVRE", "1: Noob - Reputacao: 0,00|");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        int int3 = cartaoNoob0.prazoEmprestimo();
        int int4 = cartaoNoob0.prazoEmprestimo();
        boolean boolean5 = cartaoNoob0.permisaoPegarEmprestado();
        java.lang.String str6 = cartaoNoob0.getNomeCartao();
        int int7 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str8 = cartaoNoob0.getNomeCartao();
        int int9 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Noob" + "'", str6, "Noob");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Noob" + "'", str8, "Noob");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        java.lang.String str34 = bluRayShow30.getNomeArtista();
        int int35 = bluRayShow30.getNumFaixas();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str7 = bluRayFilme6.getGenero();
        int int8 = bluRayFilme6.getAnoLancamento();
        int int9 = bluRayFilme6.getAnoLancamento();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
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
        lp2.projetofinal.entidades.Usuario usuario34 = emprestimo27.getDonoDoItem();
        lp2.projetofinal.enums.GeneroBluRay generoBluRay36 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        java.lang.String str37 = generoBluRay36.getGenero();
        java.lang.String str38 = generoBluRay36.getGenero();
        boolean boolean39 = emprestimo27.equals((java.lang.Object) str38);
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
        org.junit.Assert.assertNotNull(usuario34);
        org.junit.Assert.assertTrue("'" + generoBluRay36 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay36.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "OUTRO" + "'", str37, "OUTRO");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "OUTRO" + "'", str38, "OUTRO");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        int int24 = emprestimo20.getNumeroDias();
        int int25 = emprestimo20.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario26 = emprestimo20.getUsuarioRequerente();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(usuario26);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str4 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        facade0.iniciarSistema();
        java.lang.String str7 = facade0.listarItensEmprestados();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        java.lang.String str35 = bluRaySerie8.getGenero();
        java.lang.String str36 = bluRaySerie8.getDescricao();
        bluRaySerie8.setNome("OUTRO");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ROMANCE" + "'", str35, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str36, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
        java.lang.String str8 = controllerUsuario0.listarCaloteiros();
        java.lang.String str9 = controllerUsuario0.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.cadastrarUsuario("DEZESSEIS_ANOS", "1: Caloteiro - Reputacao: 0,00|", "Noob");
        java.lang.String str10 = facade0.listarCaloteiros();
        java.lang.String str11 = facade0.listarItensOrdenadosPorNome();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str10, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        emprestimo27.setDataDevolucao("");
        lp2.projetofinal.entidades.Usuario usuario31 = emprestimo27.getDonoDoItem();
        lp2.projetofinal.facade.Facade facade32 = new lp2.projetofinal.facade.Facade();
        java.lang.String str33 = facade32.listarTop10PioresUsuarios();
        facade32.iniciarSistema();
        java.lang.String str35 = facade32.listarTop10Itens();
        facade32.iniciarSistema();
        java.lang.String str37 = facade32.listarItensOrdenadosPorNome();
        facade32.fecharSistema();
        java.lang.String str40 = facade32.listarEmprestimosItem("COMPLETO");
        java.lang.String str41 = facade32.listarItensEmprestados();
        facade32.resetarPersistencia();
        java.lang.String str43 = facade32.listarItensNaoEmprestados();
        boolean boolean44 = emprestimo27.equals((java.lang.Object) str43);
        emprestimo27.setDataDevolucao("1: hi! - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertNotNull(usuario31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str40, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str6 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "XBOX ONE");
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
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        int int68 = bluRaySerie41.getNumeroEmprestimos();
        int int69 = bluRaySerie41.duracaoTotal();
        bluRaySerie41.atualizar("", "XBOX360");
        java.lang.String str73 = bluRaySerie41.getGenero();
        bluRaySerie41.adicionarBluRay(0);
        java.lang.String str76 = bluRaySerie41.getDescricao();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ROMANCE" + "'", str73, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str76, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.fecharSistema();
        facade0.fecharSistema();
        facade0.fecharSistema();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str9 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "Dono do item: Caloteiro, Nome do item emprestado: Caloteiro|", (double) (-1.0f), 5, "JOGO ELETRONICO: XBOX360, R$ 100.0, Nao emprestado, OUTRO", "1: hi! - Reputacao: 0,00|", (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoUsuario("PC, AVENTURA, Emprestado", "", "ACAO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        double double14 = jogoTabuleiro3.getPreco();
        jogoTabuleiro3.adicionarPecaPerdida("");
        jogoTabuleiro3.adicionarPecaPerdida("ROMANCE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str9 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("DEZOITO_ANOS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "", (double) (-8), 7, "MUSICAL", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|2: BomAmigo - Reputacao: 0,00|", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str9, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        java.lang.String str47 = usuario10.getTelefone();
        usuario10.setEmail("JOGO ELETRONICO: hi!, R$ -11.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        java.lang.String str6 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.todosUsuariosItens();
        java.lang.String str9 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "1: OUTRO - Reputacao: 0,00|", "POLICIAL", "1: hi! - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(itemSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensNaoEmprestados();
        sistema0.cadastrarUsuario("JOGO ELETRONICO: hi!, R$ -11.0, Nao emprestado, OUTRO", "AVENTURA", "LIVRE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        int int10 = bluRaySerie7.getNumeroTemporada();
        java.lang.String str11 = bluRaySerie7.getGenero();
        lp2.projetofinal.facade.Facade facade12 = new lp2.projetofinal.facade.Facade();
        java.lang.String str13 = facade12.listarTop10PioresUsuarios();
        facade12.iniciarSistema();
        java.lang.String str15 = facade12.listarTop10Itens();
        facade12.iniciarSistema();
        java.lang.String str17 = facade12.listarItensOrdenadosPorNome();
        facade12.fecharSistema();
        boolean boolean19 = bluRaySerie7.equals((java.lang.Object) facade12);
        java.lang.String str21 = facade12.listarEmprestimosItem("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str22 = facade12.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = facade12.listarEmprestimosUsuarioPegandoEmprestado("JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OUTRO" + "'", str11, "OUTRO");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str21, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("Caloteiro, OUTRO, ", "Noob");
        int int13 = bluRaySerie7.getNumeroTemporada();
        java.lang.String str14 = bluRaySerie7.getEstado();
        java.lang.String str16 = bluRaySerie7.getInfo("JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO");
        bluRaySerie7.adicionarBluRay((int) (byte) 0);
        double double19 = bluRaySerie7.getPreco();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Nao emprestado" + "'", str14, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico5 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean6 = usuario3.equals((java.lang.Object) plataformaJogoEletronico5);
        usuario3.setEmail("Nenhum emprestimos associados ao item");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente9 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario13 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str14 = usuario13.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario18 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int19 = ordenaUsuarioReputacaoCrescente9.compare(usuario13, usuario18);
        lp2.projetofinal.entidades.Usuario usuario23 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str24 = usuario23.getTelefone();
        java.lang.String str25 = usuario23.getNome();
        lp2.projetofinal.entidades.Item item26 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo29 = new lp2.projetofinal.entidades.Emprestimo(usuario18, usuario23, item26, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario30 = emprestimo29.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro31 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario30.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro31);
        java.lang.String str33 = cartaoCaloteiro31.getNomeCartao();
        int int34 = cartaoCaloteiro31.prazoEmprestimo();
        usuario3.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro31);
        boolean boolean36 = cartaoCaloteiro31.permisaoPegarEmprestado();
        int int37 = cartaoCaloteiro31.prazoEmprestimo();
        boolean boolean38 = cartaoCaloteiro31.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Caloteiro" + "'", str25, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Caloteiro" + "'", str33, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("PC", "AVENTURA", "Emprestado");
        java.lang.String str4 = usuario3.getNome();
        java.lang.String str5 = usuario3.getEmail();
        java.lang.String str6 = usuario3.getTelefone();
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
        boolean boolean29 = emprestimo27.equals((java.lang.Object) (-1.0f));
        int int30 = emprestimo27.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario31 = emprestimo27.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario32 = emprestimo27.getUsuarioRequerente();
        lp2.projetofinal.entidades.Emprestimo emprestimo34 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario32, "JOGO ELETRONICO: ROMANCE, R$ 32.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PC" + "'", str4, "PC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AVENTURA" + "'", str5, "AVENTURA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Emprestado" + "'", str6, "Emprestado");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Caloteiro" + "'", str23, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(usuario31);
        org.junit.Assert.assertNotNull(usuario32);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        int int10 = bluRaySerie7.getDuracao();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        bluRaySerie7.setNome("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str15 = bluRaySerie7.getInfo("Nenhum item pego emprestado");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str11, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        double double14 = jogoTabuleiro3.getPreco();
        jogoTabuleiro3.adicionarPecaPerdida("");
        lp2.projetofinal.controllers.Sistema sistema17 = new lp2.projetofinal.controllers.Sistema();
        sistema17.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str22 = sistema17.listarItensOrdenadosPorValor();
        sistema17.resetarPersistencia();
        java.lang.String str24 = sistema17.listarCaloteiros();
        sistema17.finalizar();
        java.lang.String str26 = sistema17.listarItensNaoEmprestados();
        sistema17.finalizar();
        java.lang.String str28 = sistema17.listarTop10PioresUsuarios();
        java.lang.String str29 = sistema17.listarItensNaoEmprestados();
        boolean boolean30 = jogoTabuleiro3.equals((java.lang.Object) sistema17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str24, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str28, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        java.lang.String str33 = controllerUsuario32.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet34 = controllerUsuario32.todosUsuariosItens();
        java.lang.String str35 = controllerItens0.listarItensOrdenadosPorValor(itemSet34);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente36 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario40 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str41 = usuario40.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario45 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int46 = ordenaUsuarioReputacaoCrescente36.compare(usuario40, usuario45);
        lp2.projetofinal.entidades.Usuario usuario50 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str51 = usuario50.getTelefone();
        java.lang.String str52 = usuario50.getNome();
        lp2.projetofinal.entidades.Item item53 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo56 = new lp2.projetofinal.entidades.Emprestimo(usuario45, usuario50, item53, "OUTRO", 100);
        usuario45.setNome("Caloteiro, Nao emprestado, ");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet59 = usuario45.retornaSeusItens();
        controllerItens0.adicionaItem(itemSet59, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (double) '4', "JOGO ELETRONICO: XBOX360, R$ 100.0, Nao emprestado, OUTRO", (-37), "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|", "Caloteiro, OUTRO, Nenhum emprestimos associados ao item", (int) (short) 1);
        lp2.projetofinal.controllers.ControllerItens controllerItens68 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray69 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet70 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet70, itemArray69);
        controllerItens68.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet70, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario75 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str76 = controllerUsuario75.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet77 = controllerUsuario75.todosUsuariosItens();
        java.lang.String str78 = controllerItens68.listarTop10Itens(itemSet77);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario79 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str80 = controllerUsuario79.listarTop10PioresUsuarios();
        java.lang.String str81 = controllerUsuario79.listarTop10PioresUsuarios();
        java.lang.String str82 = controllerUsuario79.listarCaloteiros();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet83 = controllerUsuario79.todosUsuariosItens();
        controllerItens68.adicionaItem(itemSet83, "ROMANCE", (double) (-37), "");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario88 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str89 = controllerUsuario88.listarTop10PioresUsuarios();
        java.lang.String str90 = controllerUsuario88.listarTop10PioresUsuarios();
        controllerUsuario88.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet92 = controllerUsuario88.todosUsuariosItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet93 = controllerUsuario88.todosUsuariosItens();
        java.lang.String str94 = controllerItens68.listarItensOrdenadosPorValor(itemSet93);
        controllerItens0.adicionaItem(itemSet93, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 32.0d);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Caloteiro" + "'", str52, "Caloteiro");
        org.junit.Assert.assertNotNull(itemSet59);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(itemSet77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str82, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertNotNull(itemSet83);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(itemSet92);
        org.junit.Assert.assertNotNull(itemSet93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("QUATORZE_ANOS");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente51 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario55 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str56 = usuario55.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario60 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int61 = ordenaUsuarioReputacaoCrescente51.compare(usuario55, usuario60);
        lp2.projetofinal.entidades.Usuario usuario65 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str66 = usuario65.getTelefone();
        java.lang.String str67 = usuario65.getNome();
        lp2.projetofinal.entidades.Item item68 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo71 = new lp2.projetofinal.entidades.Emprestimo(usuario60, usuario65, item68, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario72 = emprestimo71.getDonoDoItem();
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade73 = usuario72.getCartao();
        java.lang.String str74 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario72);
        java.lang.String str76 = controllerEmprestimos0.listarEmprestimosItens("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Caloteiro" + "'", str67, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario72);
        org.junit.Assert.assertNotNull(cartaoFidelidade73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Nenhum item emprestado" + "'", str74, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str76, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        int int3 = cartaoNoob0.prazoEmprestimo();
        boolean boolean4 = cartaoNoob0.permisaoPegarEmprestado();
        boolean boolean5 = cartaoNoob0.permisaoPegarEmprestado();
        java.lang.String str6 = cartaoNoob0.getNomeCartao();
        java.lang.String str7 = cartaoNoob0.getNomeCartao();
        int int8 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Noob" + "'", str6, "Noob");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Noob" + "'", str7, "Noob");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str11 = sistema0.listarEmprestimosItem("Lista de usuarios com reputacao negativa: ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: DEZOITO_ANOS, R$ 1.0, Nao emprestado, COMPLETO", "1: Caloteiro - Reputacao: 0,00|", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
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
        int int34 = emprestimo23.getNumeroDias();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        java.lang.String str9 = bluRaySerie7.getInfo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        bluRaySerie7.atualizar("DEZ_ANOS", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
        int int13 = bluRaySerie7.duracaoTotal();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        facade0.fecharSistema();
        java.lang.String str7 = facade0.listarEmprestimosItem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("hi!", "JOGO ELETRONICO: JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO, R$ 0.0, Nao emprestado, OUTRO", "Nenhum item pego emprestado", "JOGO ELETRONICO: Nao emprestado, R$ -1.0, Nao emprestado, OUTRO", "ROMANCE, MUSICAL, hi!", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        sistema0.resetarPersistencia();
        java.lang.String str10 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO, R$ 10.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: POLICIAL, R$ 10.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 0.0, Emprestado, COMPLETO", "1: Noob - Reputacao: 0,00|", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        controllerItens0.adicionaItem(itemSet16, "Lista de usuarios com reputacao negativa: ", (double) 7, "Nao emprestado", (int) (short) -1, "Lista de usuarios com reputacao negativa: ", "Nao emprestado", (int) (short) 1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario32 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str33 = controllerUsuario32.listarCaloteiros();
        java.lang.String str34 = controllerUsuario32.listarTop10MelhoresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet35 = controllerUsuario32.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem(itemSet35, "JOGO ELETRONICO: 1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|, R$ -11.0, Nao emprestado, OUTRO", "Emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str33, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(itemSet35);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("DEZ_ANOS", "ACAO", "1: Lista de usuarios com reputacao negativa:  - Reputacao: 0,00|", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.toString();
        java.lang.String str5 = jogoEletronico3.getPlataforma();
        java.lang.String str6 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo7 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean8 = cartaoBomAmigo7.permisaoPegarEmprestado();
        java.lang.String str9 = cartaoBomAmigo7.getNomeCartao();
        boolean boolean10 = cartaoBomAmigo7.permisaoPegarEmprestado();
        int int11 = cartaoBomAmigo7.prazoEmprestimo();
        java.lang.String str12 = cartaoBomAmigo7.getNomeCartao();
        boolean boolean13 = jogoEletronico3.equals((java.lang.Object) cartaoBomAmigo7);
        java.lang.String str14 = jogoEletronico3.toString();
        jogoEletronico3.setPreco((double) (-11));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUTRO" + "'", str6, "OUTRO");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "BomAmigo" + "'", str9, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BomAmigo" + "'", str12, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str14, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
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
        int int81 = emprestimo79.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario82 = emprestimo79.getUsuarioRequerente();
        java.lang.String str83 = usuario82.getEmail();
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(usuario82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "OUTRO" + "'", str83, "OUTRO");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        java.lang.String str40 = jogoTabuleiro3.contemPecasPerdidas();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Caloteiro" + "'", str30, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro, OUTRO, " + "'", str36, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "COM PECAS PERDIDAS" + "'", str40, "COM PECAS PERDIDAS");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("FreeRyder");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, Nao emprestado, ", 0.0d);
        jogoTabuleiro2.itemEmprestado();
        jogoTabuleiro2.itemEmprestado();
        java.lang.String str5 = jogoTabuleiro2.toString();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico9 = new lp2.projetofinal.entidades.JogoEletronico("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", 0.0d, "1:  - Reputacao: 0,00|");
        java.lang.String str10 = jogoEletronico9.toString();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) str10);
        jogoTabuleiro2.adicionarPecaPerdida("Caloteiro, OUTRO, Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO" + "'", str5, "JOGO DE TABULEIRO: Caloteiro, Nao emprestado, , R$ 0.0, Emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JOGO ELETRONICO: JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO, R$ 0.0, Nao emprestado, OUTRO" + "'", str10, "JOGO ELETRONICO: JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO, R$ 0.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens31 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray32 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet33 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet33, itemArray32);
        controllerItens31.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet33, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario38 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str39 = controllerUsuario38.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet40 = controllerUsuario38.todosUsuariosItens();
        controllerItens31.adicionaItem(itemSet40, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario48 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str49 = controllerUsuario48.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet50 = controllerUsuario48.todosUsuariosItens();
        controllerItens31.adicionaItem(itemSet50, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        controllerItens24.adicionaItem(itemSet50, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario62 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario62.salvarMapaUsuarios();
        controllerUsuario62.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario62.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet69 = controllerUsuario62.todosUsuariosItens();
        controllerItens24.adicionaItem(itemSet69, "FreeRyder", (double) 14, 64, (-15), "DEZOITO_ANOS", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet69, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(itemSet40);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertNotNull(itemSet69);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarItensNaoEmprestados();
        java.lang.String str8 = sistema0.listarTop10MelhoresUsuarios();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        sistema0.cadastrarUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = sistema0.listarCaloteiros();
        java.lang.String str12 = sistema0.listarTop10PioresUsuarios();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str11, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|" + "'", str12, "1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("DEZOITO_ANOS", "1: COMPLETO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int12 = bluRaySerie7.getNumeroTemporada();
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme19 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        int int20 = bluRayFilme19.getAnoLancamento();
        int int21 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) bluRayFilme19);
        java.lang.String str22 = bluRayFilme19.getGenero();
        bluRayFilme19.setNome("");
        java.lang.String str26 = bluRayFilme19.getInfo("XBOX360");
        bluRayFilme19.atualizar("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        java.lang.String str31 = bluRayFilme19.getInfo("EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento");
        bluRayFilme19.atualizaNumeroEmprestimos();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ROMANCE" + "'", str8, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OUTRO" + "'", str22, "OUTRO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        java.lang.String str10 = bluRaySerie7.getDescricao();
        bluRaySerie7.adicionarBluRay(3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str10, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("1: Caloteiro, OUTRO,  - Reputacao: 0,00|");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("MUSICAL", "Caloteiro, MUSICAL, ");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro5 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, Nao emprestado, ", 0.0d);
        jogoTabuleiro5.itemEmprestado();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos7 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro10 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow17 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente18 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean19 = bluRayShow17.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente18);
        int int20 = ordenaItemNumeroEmprestimos7.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro10, (lp2.projetofinal.entidades.Item) bluRayShow17);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente21 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario25 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str26 = usuario25.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int31 = ordenaUsuarioReputacaoCrescente21.compare(usuario25, usuario30);
        lp2.projetofinal.entidades.Usuario usuario35 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str36 = usuario35.getTelefone();
        java.lang.String str37 = usuario35.getNome();
        lp2.projetofinal.entidades.Item item38 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo41 = new lp2.projetofinal.entidades.Emprestimo(usuario30, usuario35, item38, "OUTRO", 100);
        java.lang.String str42 = usuario35.getNome();
        java.lang.String str43 = usuario35.toString();
        boolean boolean44 = jogoTabuleiro10.equals((java.lang.Object) str43);
        jogoTabuleiro10.adicionarPecaPerdida("POLICIAL");
        java.lang.String str48 = jogoTabuleiro10.getInfo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        jogoTabuleiro10.itemEmprestado();
        boolean boolean50 = jogoTabuleiro5.equals((java.lang.Object) jogoTabuleiro10);
        boolean boolean51 = chaveNomeTelefone2.equals((java.lang.Object) jogoTabuleiro5);
        java.lang.String str52 = chaveNomeTelefone2.getNome();
        java.lang.String str53 = chaveNomeTelefone2.getNome();
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone56 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
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
        lp2.projetofinal.entidades.Usuario usuario78 = emprestimo77.getDonoDoItem();
        int int79 = emprestimo77.getNumeroDias();
        lp2.projetofinal.entidades.Item item80 = emprestimo77.getItem();
        java.lang.Object obj81 = null;
        boolean boolean82 = emprestimo77.equals(obj81);
        boolean boolean83 = chaveNomeTelefone56.equals((java.lang.Object) emprestimo77);
        emprestimo77.setDataDevolucao("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        lp2.projetofinal.entidades.Item item86 = emprestimo77.getItem();
        lp2.projetofinal.entidades.Usuario usuario87 = emprestimo77.getDonoDoItem();
        lp2.projetofinal.entidades.Item item88 = emprestimo77.getItem();
        boolean boolean89 = chaveNomeTelefone2.equals((java.lang.Object) item88);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Caloteiro" + "'", str37, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Caloteiro" + "'", str42, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Caloteiro, OUTRO, " + "'", str43, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MUSICAL" + "'", str52, "MUSICAL");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MUSICAL" + "'", str53, "MUSICAL");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Caloteiro" + "'", str73, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertNull(item80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(item86);
        org.junit.Assert.assertNotNull(usuario87);
        org.junit.Assert.assertNull(item88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
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
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade22 = null;
        usuario21.setCartao(cartaoFidelidade22);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.fecharSistema();
        java.lang.String str8 = facade0.listarEmprestimosItem("COMPLETO");
        java.lang.String str9 = facade0.listarTop10PioresUsuarios();
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("Emprestimos pegos: EMPRESTIMO - De: Caloteiro, Para: Caloteiro, JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|, Caloteiro, 100 dias, ENTREGA: Emprestimo em andamento|", "JOGO ELETRONICO: JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO, R$ 0.0, Nao emprestado, OUTRO", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|2: BomAmigo - Reputacao: 0,00|", 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente33 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str38 = usuario37.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int43 = ordenaUsuarioReputacaoCrescente33.compare(usuario37, usuario42);
        lp2.projetofinal.entidades.Usuario usuario47 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str48 = usuario47.getTelefone();
        java.lang.String str49 = usuario47.getNome();
        lp2.projetofinal.entidades.Item item50 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo53 = new lp2.projetofinal.entidades.Emprestimo(usuario42, usuario47, item50, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario54 = emprestimo53.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro55 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario54.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro55);
        java.lang.String str57 = cartaoCaloteiro55.getNomeCartao();
        int int58 = cartaoCaloteiro55.prazoEmprestimo();
        java.lang.String str59 = cartaoCaloteiro55.getNomeCartao();
        usuario3.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro55);
        java.lang.String str61 = usuario3.toString();
        usuario3.setNome("JOGO ELETRONICO: hi!, R$ -11.0, Nao emprestado, OUTRO");
        java.lang.String str64 = usuario3.getTelefone();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Caloteiro" + "'", str23, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertNotNull(usuario29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Caloteiro" + "'", str49, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Caloteiro" + "'", str57, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Caloteiro" + "'", str59, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Caloteiro, OUTRO, " + "'", str61, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        facade0.iniciarSistema();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        java.lang.String str16 = sistema3.listarEmprestimosItem("1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|");
        sistema3.finalizar();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str14, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str16, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("ACAO", "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaNomeVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet82 = usuario81.retornaSeusItens();
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
        org.junit.Assert.assertNotNull(itemSet82);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator1 = ordenaItemEmprestadoAlfabetico0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator2 = emprestimoComparator1.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator3 = emprestimoComparator1.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator4 = emprestimoComparator1.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator5 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator6 = emprestimoComparator5.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator7 = emprestimoComparator5.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator8 = emprestimoComparator7.reversed();
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertNotNull(emprestimoComparator2);
        org.junit.Assert.assertNotNull(emprestimoComparator3);
        org.junit.Assert.assertNotNull(emprestimoComparator4);
        org.junit.Assert.assertNotNull(emprestimoComparator5);
        org.junit.Assert.assertNotNull(emprestimoComparator6);
        org.junit.Assert.assertNotNull(emprestimoComparator7);
        org.junit.Assert.assertNotNull(emprestimoComparator8);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarItensEmprestados();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str14 = bluRayShow6.getNome();
        int int15 = bluRayShow6.getDuracao();
        bluRayShow6.atualizar("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ -4.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OUTRO" + "'", str14, "OUTRO");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
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
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("QUATORZE_ANOS", "Nenhum item emprestado, OUTRO, ", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) (short) 0, 4, "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ -4.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, Emprestado, 1: ROMANCE - Reputacao: 0,00|", 10);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("", 1.0d, 0, "1:  - Reputacao: 0,00|", "FreeRyder", (-1));
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        bluRayFilme6.setNome("Caloteiro");
        bluRayFilme6.setPreco((double) (-49));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OUTRO" + "'", str8, "OUTRO");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: Noob, R$ 1.0, Nao emprestado, COMPLETO", (double) (short) -1, "Caloteiro, OUTRO, 1: ROMANCE - Reputacao: 0,00|", 52, "POLICIAL", "JOGO ELETRONICO: 1: DOZE_ANOS - Reputacao: 0,00|2: OUTRO - Reputacao: 0,00|, R$ -11.0, Nao emprestado, OUTRO", (int) 'a');
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        lp2.projetofinal.entidades.BluRayShow bluRayShow17 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 7, "Nenhum item pego emprestado", "Nenhum item pego emprestado", (int) (short) -1);
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) (short) -1);
        double double19 = bluRaySerie7.getPreco();
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico20 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator21 = ordenaItemEmprestadoAlfabetico20.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator22 = emprestimoComparator21.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator23 = emprestimoComparator21.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator24 = emprestimoComparator23.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator25 = emprestimoComparator23.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator26 = emprestimoComparator25.reversed();
        boolean boolean27 = bluRaySerie7.equals((java.lang.Object) emprestimoComparator25);
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator28 = emprestimoComparator25.reversed();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(emprestimoComparator21);
        org.junit.Assert.assertNotNull(emprestimoComparator22);
        org.junit.Assert.assertNotNull(emprestimoComparator23);
        org.junit.Assert.assertNotNull(emprestimoComparator24);
        org.junit.Assert.assertNotNull(emprestimoComparator25);
        org.junit.Assert.assertNotNull(emprestimoComparator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(emprestimoComparator28);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) (byte) 10);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("Caloteiro, OUTRO, Nenhum emprestimos associados ao item", "XBOX ONE", "JOGO ELETRONICO: 1: Nenhum emprestimos associados ao item - Reputacao: 0,00|, R$ 5.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str4 = jogoTabuleiro3.contemPecasPerdidas();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico8 = new lp2.projetofinal.entidades.JogoEletronico("Caloteiro", (double) (-1), "");
        int int9 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) jogoEletronico8);
        lp2.projetofinal.entidades.BluRayShow bluRayShow16 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay17 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean18 = bluRayShow16.equals((java.lang.Object) classificacaoBluRay17);
        bluRayShow16.atualizar("hi!", "OUTRO");
        bluRayShow16.setNome("OUTRO");
        java.lang.String str25 = bluRayShow16.getInfo("Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro28 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str29 = jogoTabuleiro28.contemPecasPerdidas();
        java.lang.String str30 = jogoTabuleiro28.toString();
        int int31 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow16, (lp2.projetofinal.entidades.Item) jogoTabuleiro28);
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico35 = new lp2.projetofinal.entidades.JogoEletronico("XBOX360", (double) 100L, "Caloteiro, Nao emprestado, ");
        jogoEletronico35.atualizar("XBOX360", "LIVRE");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie46 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str47 = bluRaySerie46.getEstado();
        java.lang.String str48 = bluRaySerie46.getGenero();
        bluRaySerie46.atualizar("Caloteiro, OUTRO, ", "Noob");
        int int52 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoEletronico35, (lp2.projetofinal.entidades.Item) bluRaySerie46);
        java.lang.String str54 = jogoEletronico35.getInfo("1: Lista de usuarios com reputacao negativa:  - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COMPLETO" + "'", str4, "COMPLETO");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + classificacaoBluRay17 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay17.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "COMPLETO" + "'", str29, "COMPLETO");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO" + "'", str30, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Nao emprestado" + "'", str47, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ROMANCE" + "'", str48, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        int int35 = bluRaySerie8.duracaoTotal();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        java.lang.String str1 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str2 = cartaoFreeRyder0.getNomeCartao();
        boolean boolean3 = cartaoFreeRyder0.permisaoPegarEmprestado();
        int int4 = cartaoFreeRyder0.prazoEmprestimo();
        int int5 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str6 = cartaoFreeRyder0.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FreeRyder" + "'", str1, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FreeRyder" + "'", str2, "FreeRyder");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FreeRyder" + "'", str6, "FreeRyder");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str12 = facade0.listarEmprestimosItem("ROMANCE, MUSICAL, hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str10, "1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str12, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "ROMANCE", "");
        java.lang.String str7 = controllerUsuario0.listarCaloteiros();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("PC", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, LIVRE, POLICIAL", 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO DE TABULEIRO: Emprestado, R$ -18.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.cadastrarUsuario("NINTENDO 3DS", "POLICIAL", "Nao emprestado");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("JOGO DE TABULEIRO: Noob, R$ 1.0, Emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", (double) 52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        boolean boolean1 = cartaoBomAmigo0.permisaoPegarEmprestado();
        java.lang.String str2 = cartaoBomAmigo0.getNomeCartao();
        boolean boolean3 = cartaoBomAmigo0.permisaoPegarEmprestado();
        int int4 = cartaoBomAmigo0.prazoEmprestimo();
        java.lang.String str5 = cartaoBomAmigo0.getNomeCartao();
        int int6 = cartaoBomAmigo0.prazoEmprestimo();
        java.lang.String str7 = cartaoBomAmigo0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BomAmigo" + "'", str2, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BomAmigo" + "'", str5, "BomAmigo");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BomAmigo" + "'", str7, "BomAmigo");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.cadastrarUsuario("NINTENDO 3DS", "POLICIAL", "Nao emprestado");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet10 = controllerUsuario0.todosUsuariosItens();
        controllerUsuario0.salvarMapaUsuarios();
        org.junit.Assert.assertNotNull(itemSet10);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico10 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        int int11 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) jogoEletronico10);
        java.lang.String str12 = jogoEletronico10.getPlataforma();
        jogoEletronico10.setPreco((double) 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-15) + "'", int11 == (-15));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OUTRO" + "'", str12, "OUTRO");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        sistema0.resetarPersistencia();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str10 = sistema0.listarEmprestimosItem("hi!");
        java.lang.String str12 = sistema0.listarEmprestimosItem("JOGO ELETRONICO: DOZE_ANOS, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str10, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str12, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("EMPRESTIMO - De: Caloteiro, Para: ROMANCE, DOZE_ANOS, COMPLETO, 10 dias, ENTREGA: Emprestimo em andamento", (double) 32, (-49), "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ -4.0, Nao emprestado, OUTRO", "Nenhum emprestimos associados ao item", (-49));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        usuario3.setTelefone("FreeRyder");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob6 = new lp2.projetofinal.entidades.CartaoNoob();
        int int7 = cartaoNoob6.prazoEmprestimo();
        java.lang.String str8 = cartaoNoob6.getNomeCartao();
        boolean boolean9 = cartaoNoob6.permisaoPegarEmprestado();
        usuario3.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoNoob6);
        boolean boolean11 = cartaoNoob6.permisaoPegarEmprestado();
        int int12 = cartaoNoob6.prazoEmprestimo();
        java.lang.String str13 = cartaoNoob6.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Noob" + "'", str8, "Noob");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Noob" + "'", str13, "Noob");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("1: Caloteiro - Reputacao: 0,00|2: Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|| - Reputacao: 0,00|", (double) 5);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        controllerEmprestimos0.carregaListaEmprestimos();
        java.lang.String str61 = controllerEmprestimos0.listarItensEmprestados();
        controllerEmprestimos0.salvarListaEmprestimos();
        java.lang.String str64 = controllerEmprestimos0.listarEmprestimosItens("COMPLETO");
        java.lang.String str66 = controllerEmprestimos0.listarEmprestimosItens("OUTRO");
        controllerEmprestimos0.salvarListaEmprestimos();
        java.lang.String str68 = controllerEmprestimos0.listarItensEmprestados();
        controllerEmprestimos0.carregaListaEmprestimos();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str56, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||" + "'", str61, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str64, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str66, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||" + "'", str68, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
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
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade25 = usuario24.getCartao();
        usuario24.setEmail("Caloteiro");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertNotNull(cartaoFidelidade25);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "ROMANCE", "");
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str9 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str10 = controllerUsuario0.listarTop10MelhoresUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1: COMPLETO - Reputacao: 0,00|" + "'", str9, "1: COMPLETO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: COMPLETO - Reputacao: 0,00|" + "'", str10, "1: COMPLETO - Reputacao: 0,00|");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
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
        lp2.projetofinal.entidades.Item item53 = emprestimo52.getItem();
        lp2.projetofinal.controllers.Sistema sistema54 = new lp2.projetofinal.controllers.Sistema();
        sistema54.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str59 = sistema54.listarItensOrdenadosPorValor();
        java.lang.String str60 = sistema54.listarTop10PioresUsuarios();
        sistema54.resetarPersistencia();
        java.lang.String str62 = sistema54.listarTop10PioresUsuarios();
        java.lang.String str63 = sistema54.listarTop10PioresUsuarios();
        java.lang.String str64 = sistema54.listarItensEmprestados();
        boolean boolean65 = emprestimo52.equals((java.lang.Object) sistema54);
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
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str60, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str62, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str63, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet4 = controllerUsuario0.todosUsuariosItens();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("", "1: Caloteiro - Reputacao: 0,00|", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Emprestimos pegos: EMPRESTIMO - De: Caloteiro, Para: Caloteiro, JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|, Caloteiro, 100 dias, ENTREGA: Emprestimo em andamento|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        java.lang.String str10 = bluRayShow6.getInfo("Caloteiro, Nao emprestado, ");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
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
        int int74 = bluRaySerie41.duracaoTotal();
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder75 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        boolean boolean76 = cartaoFreeRyder75.permisaoPegarEmprestado();
        boolean boolean77 = bluRaySerie41.equals((java.lang.Object) cartaoFreeRyder75);
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-4) + "'", int74 == (-4));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ 0.0, Nao emprestado, OUTRO");
        java.lang.String str3 = chaveNomeTelefone2.getTelefone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ 0.0, Nao emprestado, OUTRO" + "'", str3, "JOGO ELETRONICO: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|, R$ 0.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "1: Noob - Reputacao: 0,00|", "JOGO DE TABULEIRO: DEZOITO_ANOS, R$ 1.0, Nao emprestado, COMPLETO", 1);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
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
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos33 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie41 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str43 = bluRaySerie41.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos44 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow51 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay52 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean53 = bluRayShow51.equals((java.lang.Object) classificacaoBluRay52);
        bluRayShow51.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow63 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str64 = bluRayShow63.getNome();
        int int65 = ordenaItemNumeroEmprestimos44.compare((lp2.projetofinal.entidades.Item) bluRayShow51, (lp2.projetofinal.entidades.Item) bluRayShow63);
        int int66 = ordenaItemNumeroEmprestimos33.compare((lp2.projetofinal.entidades.Item) bluRaySerie41, (lp2.projetofinal.entidades.Item) bluRayShow63);
        bluRaySerie41.atualizaNumeroEmprestimos();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario68 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str69 = controllerUsuario68.listarCaloteiros();
        java.lang.String str70 = controllerUsuario68.listarTop10MelhoresUsuarios();
        controllerUsuario68.carregaMapaUsuarios();
        java.lang.String str72 = controllerUsuario68.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet73 = controllerUsuario68.todosUsuariosItens();
        boolean boolean74 = bluRaySerie41.equals((java.lang.Object) itemSet73);
        java.lang.String str75 = controllerItens0.listarItensNaoEmprestados(itemSet73);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet29);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay52 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay52.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Caloteiro" + "'", str64, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str69, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(itemSet73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "POLICIAL");
        facade0.fecharSistema();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator14 = ordenaItemNumeroEmprestimos0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator15 = itemComparator14.reversed();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemComparator14);
        org.junit.Assert.assertNotNull(itemComparator15);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str1 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str2 = controllerEmprestimos0.listarItensEmprestados();
        controllerEmprestimos0.salvarListaEmprestimos();
        java.lang.String str5 = controllerEmprestimos0.listarEmprestimosItens("Lista de usuarios com reputacao negativa: ");
        controllerEmprestimos0.carregaListaEmprestimos();
        controllerEmprestimos0.carregaListaEmprestimos();
        controllerEmprestimos0.carregaListaEmprestimos();
        controllerEmprestimos0.carregaListaEmprestimos();
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "QUATORZE_ANOS");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos15 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str17 = controllerEmprestimos15.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos15.salvarListaEmprestimos();
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
        java.lang.String str47 = controllerEmprestimos15.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario33);
        lp2.projetofinal.entidades.Emprestimo emprestimo49 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario33, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob");
        java.lang.String str50 = usuario14.getNome();
        java.lang.String str51 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str5, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str17, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Nenhum item pego emprestado" + "'", str47, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ROMANCE" + "'", str50, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Nenhum item pego emprestado" + "'", str51, "Nenhum item pego emprestado");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
            java.lang.String str15 = facade0.listarEmprestimosUsuarioPegandoEmprestado("1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str10, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str12, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
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
        lp2.projetofinal.entidades.Usuario usuario38 = emprestimo37.getUsuarioRequerente();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Caloteiro" + "'", str21, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Caloteiro, OUTRO, " + "'", str22, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet23);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "OUTRO" + "'", str34, "OUTRO");
        org.junit.Assert.assertNotNull(usuario38);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("1: POLICIAL - Reputacao: 0,00|", 7.0d, (-18), "1: ROMANCE - Reputacao: 0,00|", "Caloteiro, Nenhum emprestimos associados ao item, ", (int) ' ');
    }
}

