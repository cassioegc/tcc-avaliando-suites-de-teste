import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        lp2.projetofinal.entidades.Item item34 = emprestimo27.getItem();
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
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet2 = controllerUsuario0.todosUsuariosItens();
        controllerUsuario0.cadastrarUsuario("", "Caloteiro, OUTRO, ", "Caloteiro, OUTRO, ");
        java.lang.String str7 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(itemSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1:  - Reputacao: 0,00|" + "'", str7, "1:  - Reputacao: 0,00|");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str1 = controllerEmprestimos0.listarItensEmprestados();
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
        usuario11.setEmail("OUTRO");
        java.lang.String str25 = usuario11.getEmail();
        java.lang.String str26 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario11);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente27 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str32 = usuario31.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int37 = ordenaUsuarioReputacaoCrescente27.compare(usuario31, usuario36);
        usuario36.setTelefone("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente40 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente41 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator42 = ordenaUsuarioReputacaoCrescente40.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente41);
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico48 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean49 = usuario46.equals((java.lang.Object) plataformaJogoEletronico48);
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        int int55 = ordenaUsuarioReputacaoCrescente40.compare(usuario46, usuario53);
        java.lang.String str56 = usuario46.getTelefone();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo58 = controllerEmprestimos0.identificaEmprestimo(usuario36, usuario46, "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OUTRO" + "'", str25, "OUTRO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Nenhum item emprestado" + "'", str26, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator42);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico48 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico48.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        java.lang.String str9 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("Caloteiro, OUTRO, ", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "OUTRO", "QUATORZE_ANOS", "1: ROMANCE - Reputacao: 0,00|", "MUSICAL", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str9, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("MUSICAL");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) '#');
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("COMPLETO");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay0 = lp2.projetofinal.enums.ClassificacaoBluRay.LIVRE;
        java.lang.String str1 = classificacaoBluRay0.getClassificacao();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay0 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.LIVRE + "'", classificacaoBluRay0.equals(lp2.projetofinal.enums.ClassificacaoBluRay.LIVRE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LIVRE" + "'", str1, "LIVRE");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("", "OUTRO", "QUATORZE_ANOS", (double) (-1.0f), (int) ' ', "COM PECAS PERDIDAS", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoUsuario("Caloteiro, MUSICAL, ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("hi!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "Nao emprestado");
        lp2.projetofinal.facade.Facade facade3 = new lp2.projetofinal.facade.Facade();
        java.lang.String str4 = facade3.listarTop10PioresUsuarios();
        facade3.iniciarSistema();
        java.lang.String str6 = facade3.listarTop10Itens();
        boolean boolean7 = chaveNomeTelefone2.equals((java.lang.Object) str6);
        java.lang.String str8 = chaveNomeTelefone2.getNome();
        java.lang.String str9 = chaveNomeTelefone2.getTelefone();
        boolean boolean11 = chaveNomeTelefone2.equals((java.lang.Object) (-15));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nao emprestado" + "'", str9, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("PS3", "Caloteiro, MUSICAL, ", "COMPLETO", "Emprestado", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "POLICIAL", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str9 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("Emprestado", "COMPLETO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        java.lang.String str6 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario0.retornaUsuarioItens("DOCUMENTARIO", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: Caloteiro - Reputacao: 0,00|" + "'", str6, "1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Caloteiro, Nao emprestado, ", "1:  - Reputacao: 0,00|", "PS3", (double) (-4), "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.lang.String str33 = usuario18.toString();
        java.lang.String str34 = usuario18.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Nenhum item pego emprestado" + "'", str32, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Caloteiro, OUTRO, " + "'", str33, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Caloteiro, OUTRO, " + "'", str34, "Caloteiro, OUTRO, ");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("Emprestado");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("Lista de usuarios com reputacao negativa: ", "LIVRE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        bluRayShow6.atualizar("Caloteiro, OUTRO, ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        lp2.projetofinal.entidades.Usuario usuario25 = emprestimo20.getUsuarioRequerente();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = emprestimo20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertNotNull(usuario25);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        lp2.projetofinal.entidades.Usuario usuario54 = new lp2.projetofinal.entidades.Usuario("PC", "AVENTURA", "Emprestado");
        java.lang.String str55 = usuario54.getNome();
        lp2.projetofinal.entidades.Usuario usuario59 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico61 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean62 = usuario59.equals((java.lang.Object) plataformaJogoEletronico61);
        usuario59.setEmail("Nenhum emprestimos associados ao item");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme71 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        int int72 = bluRayFilme71.getAnoLancamento();
        // The following exception was thrown during execution in test generation
        try {
            int int75 = controllerEmprestimos0.devolverItem(usuario54, usuario59, (lp2.projetofinal.entidades.Item) bluRayFilme71, "FreeRyder", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PC" + "'", str55, "PC");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico61 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico61.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("PC");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        java.lang.String str20 = bluRaySerie16.getEstado();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-11) + "'", int19 == (-11));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Nao emprestado" + "'", str20, "Nao emprestado");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str6 = facade0.listarEmprestimosItem("Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("DEZESSEIS_ANOS");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
            sistema7.cadastrarUsuario("Caloteiro, Nenhum emprestimos associados ao item, ", "COM PECAS PERDIDAS", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email nao pode ser vazio ou nulo");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("", "Caloteiro", "", "1: Caloteiro - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "DOCUMENTARIO", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        java.lang.String str10 = bluRaySerie7.getEstado();
        bluRaySerie7.adicionarBluRay((int) 'a');
        java.lang.String str13 = bluRaySerie7.getDescricao();
        java.lang.String str15 = bluRaySerie7.getInfo("Caloteiro");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nao emprestado" + "'", str10, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str13, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = controllerUsuario0.getInfoUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        controllerEmprestimos0.salvarListaEmprestimos();
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
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("Nenhum item emprestado", "AVENTURA", "FreeRyder", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int1 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str2 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str3 = cartaoFreeRyder0.getNomeCartao();
        boolean boolean4 = cartaoFreeRyder0.permisaoPegarEmprestado();
        java.lang.String str5 = cartaoFreeRyder0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FreeRyder" + "'", str2, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FreeRyder" + "'", str3, "FreeRyder");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FreeRyder" + "'", str5, "FreeRyder");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        lp2.projetofinal.entidades.Usuario usuario50 = emprestimo48.getUsuarioRequerente();
        int int51 = usuario14.compareTo(usuario50);
        usuario14.setEmail("Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario49);
        org.junit.Assert.assertNotNull(usuario50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.lang.String str20 = controllerItens0.listarTop10Itens(itemSet19);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario21 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str22 = controllerUsuario21.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet23 = controllerUsuario21.todosUsuariosItens();
        java.lang.String str24 = controllerItens0.listarTop10Itens(itemSet23);
        lp2.projetofinal.controllers.ControllerItens controllerItens25 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray26 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet27 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet27, itemArray26);
        controllerItens25.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet27, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario32 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str33 = controllerUsuario32.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet34 = controllerUsuario32.todosUsuariosItens();
        controllerItens25.adicionaItem(itemSet34, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario42 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str43 = controllerUsuario42.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet44 = controllerUsuario42.todosUsuariosItens();
        controllerItens25.adicionaItem(itemSet44, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente49 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int59 = ordenaUsuarioReputacaoCrescente49.compare(usuario53, usuario58);
        lp2.projetofinal.entidades.Usuario usuario63 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str64 = usuario63.getTelefone();
        java.lang.String str65 = usuario63.getNome();
        lp2.projetofinal.entidades.Item item66 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo69 = new lp2.projetofinal.entidades.Emprestimo(usuario58, usuario63, item66, "OUTRO", 100);
        java.lang.String str70 = usuario63.getNome();
        java.lang.String str71 = usuario63.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet72 = usuario63.retornaSeusItens();
        java.lang.String str73 = controllerItens25.listarTop10Itens(itemSet72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = controllerItens0.getInfoItem(itemSet72, "COMPLETO", "FreeRyder");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(itemSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(itemSet44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Caloteiro" + "'", str65, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Caloteiro" + "'", str70, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro, OUTRO, " + "'", str71, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoItem("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", "LIVRE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet7 = controllerUsuario0.retornaUsuarioItens("", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("Caloteiro, OUTRO, ");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("DEZESSEIS_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "", "", "Caloteiro, OUTRO, ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("OUTRO");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = controllerUsuario0.getInfoUsuario("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Caloteiro, MUSICAL, ", "DEZOITO_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarEmprestimosItem("Caloteiro, Nenhum emprestimos associados ao item, ");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Emprestado", (double) (byte) -1, 0, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "BomAmigo", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str5, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "XBOX360", "COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.pesquisarDetalhesItem("COM PECAS PERDIDAS", "POLICIAL", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        sistema0.cadastrarUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Nenhum item emprestado", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((int) ' ');
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sistema0.getInfoItem("PC", "Caloteiro", "Caloteiro, OUTRO, ", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.adicionarBluRay((int) (byte) 0);
        java.lang.String str12 = bluRaySerie7.getGenero();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ROMANCE" + "'", str12, "ROMANCE");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "XBOX360", "COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("COM PECAS PERDIDAS", "Noob", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("Noob");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.pesquisarDetalhesItem("COM PECAS PERDIDAS", "XBOX360", "LIVRE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "COMPLETO", "Caloteiro, OUTRO, ", "PC", "Nenhum item pego emprestado", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.OUTRO;
        java.lang.String str1 = generoBluRay0.getGenero();
        java.lang.String str2 = generoBluRay0.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OUTRO" + "'", str1, "OUTRO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.lang.String str61 = controllerEmprestimos0.listarEmprestimosItens("BomAmigo");
        java.lang.String str62 = controllerEmprestimos0.listarItensEmprestados();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str56, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str61, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||" + "'", str62, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("AVENTURA");
        java.lang.Class<?> wildcardClass2 = plataformaJogoEletronico1.getClass();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.registrarEmprestimo("Emprestado", "", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "MUSICAL", "PC", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie(7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente17 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario21 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str22 = usuario21.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario26 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int27 = ordenaUsuarioReputacaoCrescente17.compare(usuario21, usuario26);
        lp2.projetofinal.entidades.Usuario usuario31 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str32 = usuario31.getTelefone();
        java.lang.String str33 = usuario31.getNome();
        lp2.projetofinal.entidades.Item item34 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo37 = new lp2.projetofinal.entidades.Emprestimo(usuario26, usuario31, item34, "OUTRO", 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente38 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str43 = usuario42.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario47 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int48 = ordenaUsuarioReputacaoCrescente38.compare(usuario42, usuario47);
        lp2.projetofinal.entidades.Usuario usuario52 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str53 = usuario52.getTelefone();
        java.lang.String str54 = usuario52.getNome();
        lp2.projetofinal.entidades.Item item55 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo58 = new lp2.projetofinal.entidades.Emprestimo(usuario47, usuario52, item55, "OUTRO", 100);
        usuario52.atualizaReputacao((double) (short) -1, false);
        int int62 = ordenaUsuarioReputacaoCrescente16.compare(usuario26, usuario52);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente63 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente64 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator65 = ordenaUsuarioReputacaoCrescente63.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente64);
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico71 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean72 = usuario69.equals((java.lang.Object) plataformaJogoEletronico71);
        lp2.projetofinal.entidades.Usuario usuario76 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str77 = usuario76.getTelefone();
        int int78 = ordenaUsuarioReputacaoCrescente63.compare(usuario69, usuario76);
        java.lang.String str79 = usuario69.getTelefone();
        int int80 = ordenaUsuarioReputacaoCrescente0.compare(usuario26, usuario69);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator81 = ordenaUsuarioReputacaoCrescente0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator82 = ordenaUsuarioReputacaoCrescente0.reversed();
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Caloteiro" + "'", str33, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Caloteiro" + "'", str54, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(usuarioComparator65);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico71 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico71.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator81);
        org.junit.Assert.assertNotNull(usuarioComparator82);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: Caloteiro - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (double) 0L, (-11), (-37), "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        int int23 = emprestimo20.getNumeroDias();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = emprestimo20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        int int10 = bluRaySerie7.getNumeroTemporada();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "PC", "Nao emprestado", (double) (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        int int35 = bluRaySerie8.getNumeroEmprestimos();
        bluRaySerie8.adicionarBluRay(52);
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico38 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator39 = ordenaItemEmprestadoAlfabetico38.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator40 = emprestimoComparator39.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator41 = emprestimoComparator40.reversed();
        boolean boolean42 = bluRaySerie8.equals((java.lang.Object) emprestimoComparator41);
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator43 = emprestimoComparator41.reversed();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(emprestimoComparator39);
        org.junit.Assert.assertNotNull(emprestimoComparator40);
        org.junit.Assert.assertNotNull(emprestimoComparator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(emprestimoComparator43);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "DOZE_ANOS", "MUSICAL", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "Lista de usuarios com reputacao negativa: ");
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "NINTENDO 3DS", "FreeRyder", (-1.0d), 52, (int) ' ', "", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str11, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("DEZOITO_ANOS");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente17 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente18 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario22 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str23 = usuario22.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int28 = ordenaUsuarioReputacaoCrescente18.compare(usuario22, usuario27);
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str33 = usuario32.getTelefone();
        java.lang.String str34 = usuario32.getNome();
        lp2.projetofinal.entidades.Item item35 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo38 = new lp2.projetofinal.entidades.Emprestimo(usuario27, usuario32, item35, "OUTRO", 100);
        boolean boolean40 = emprestimo38.equals((java.lang.Object) (-1.0f));
        int int41 = emprestimo38.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario42 = emprestimo38.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico48 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean49 = usuario46.equals((java.lang.Object) plataformaJogoEletronico48);
        usuario46.setEmail("Nenhum emprestimos associados ao item");
        int int52 = ordenaUsuarioReputacaoCrescente17.compare(usuario42, usuario46);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet53 = usuario46.retornaSeusItens();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item55 = controllerItens0.identificaItem(itemSet53, "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Caloteiro" + "'", str34, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(usuario42);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico48 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico48.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(itemSet53);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        java.lang.String str14 = jogoTabuleiro3.toString();
        boolean boolean16 = jogoTabuleiro3.equals((java.lang.Object) 10.0f);
        java.lang.String str17 = jogoTabuleiro3.toString();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO" + "'", str14, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO" + "'", str17, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) 100, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo((int) (byte) 100);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        controllerEmprestimos0.salvarListaEmprestimos();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Nenhum item pego emprestado" + "'", str32, "Nenhum item pego emprestado");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(7);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int1 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str2 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str3 = cartaoFreeRyder0.getNomeCartao();
        int int4 = cartaoFreeRyder0.prazoEmprestimo();
        int int5 = cartaoFreeRyder0.prazoEmprestimo();
        int int6 = cartaoFreeRyder0.prazoEmprestimo();
        boolean boolean7 = cartaoFreeRyder0.permisaoPegarEmprestado();
        java.lang.String str8 = cartaoFreeRyder0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FreeRyder" + "'", str2, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FreeRyder" + "'", str3, "FreeRyder");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FreeRyder" + "'", str8, "FreeRyder");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("1: ROMANCE - Reputacao: 0,00|", "AVENTURA", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (double) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("POLICIAL", "", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (double) (byte) 100, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("", "Lista de usuarios com reputacao negativa: ", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.pesquisarDetalhesItem("Nao emprestado", "Caloteiro, MUSICAL, ", "LIVRE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("XBOX360");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        int int36 = cartaoCaloteiro31.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Caloteiro" + "'", str25, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Caloteiro" + "'", str33, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
            facade0.atualizarItem("", "BomAmigo", "DEZESSEIS_ANOS", "Noob", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarCaloteiros();
        java.lang.String str6 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("PS3", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.adicionarPecaPerdida("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "Caloteiro, Nao emprestado, ", "Caloteiro, Nenhum emprestimos associados ao item, ", "COMPLETO");
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        java.lang.String str90 = controllerUsuario89.listarTop10PioresUsuarios();
        java.lang.String str91 = controllerUsuario89.listarTop10PioresUsuarios();
        controllerUsuario89.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet93 = controllerUsuario89.todosUsuariosItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet94 = controllerUsuario89.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet94, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(itemSet93);
        org.junit.Assert.assertNotNull(itemSet94);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        sistema0.resetarPersistencia();
        java.lang.String str6 = sistema0.listarEmprestimosItem("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Nenhum item pego emprestado", "Nenhum item pego emprestado", "COMPLETO", (double) 35, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str11 = facade0.listarEmprestimosItem("ROMANCE");
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Nenhum item pego emprestado", "1: ROMANCE - Reputacao: 0,00|");
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("POLICIAL");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("Caloteiro, OUTRO, ", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        java.lang.String str9 = bluRayFilme6.getGenero();
        java.lang.String str10 = bluRayFilme6.getGenero();
        java.lang.String str11 = bluRayFilme6.getGenero();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OUTRO" + "'", str8, "OUTRO");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OUTRO" + "'", str9, "OUTRO");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OUTRO" + "'", str10, "OUTRO");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OUTRO" + "'", str11, "OUTRO");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("DOZE_ANOS", "AVENTURA", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        java.lang.String str8 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("Caloteiro, MUSICAL, ", "Nenhum item emprestado", "ROMANCE", (double) (short) 10);
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("Lista de usuarios com reputacao negativa: ", "DEZOITO_ANOS", "OUTRO", 0.0d, "DEZOITO_ANOS", (int) (short) -1, "Caloteiro, MUSICAL, ", "Nenhum item pego emprestado", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        java.lang.String str6 = sistema0.listarEmprestimosItem("POLICIAL");
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("QUATORZE_ANOS", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.Class<?> wildcardClass92 = usuario21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarCaloteiros();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("Caloteiro, Nenhum emprestimos associados ao item, ", "OUTRO", "Noob");
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente9 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente10 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator11 = ordenaUsuarioReputacaoCrescente9.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente10);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator12 = ordenaUsuarioReputacaoCrescente7.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente9);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator13 = ordenaUsuarioReputacaoCrescente7.reversed();
        java.lang.Class<?> wildcardClass14 = usuarioComparator13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(usuarioComparator11);
        org.junit.Assert.assertNotNull(usuarioComparator12);
        org.junit.Assert.assertNotNull(usuarioComparator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        usuario21.setNome("Lista de usuarios com reputacao negativa: ");
        double double55 = usuario21.getReputacao();
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        lp2.projetofinal.entidades.BluRayShow bluRayShow17 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 7, "Nenhum item pego emprestado", "Nenhum item pego emprestado", (int) (short) -1);
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) (short) -1);
        bluRaySerie7.adicionarBluRay((-4));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("DEZESSEIS_ANOS", "COMPLETO", "", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "DOCUMENTARIO", "Emprestado", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        jogoTabuleiro2.itemEmprestado();
        java.lang.String str4 = jogoTabuleiro2.toString();
        java.lang.String str5 = jogoTabuleiro2.toString();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico9 = new lp2.projetofinal.entidades.JogoEletronico("PC", (double) '#', "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str10 = jogoEletronico9.getPlataforma();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) jogoEletronico9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO" + "'", str4, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO" + "'", str5, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OUTRO" + "'", str10, "OUTRO");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("Caloteiro, Nao emprestado, ", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: Caloteiro - Reputacao: 0,00|", 0.0d, (int) (byte) 100, "BomAmigo", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        lp2.projetofinal.entidades.Usuario usuario26 = emprestimo20.getDonoDoItem();
        emprestimo20.setDataDevolucao("FreeRyder");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(usuario26);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens1 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens2 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario3 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str4 = controllerUsuario3.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet5 = controllerUsuario3.todosUsuariosItens();
        controllerItens2.adicionaItem(itemSet5, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens9 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray10 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet11 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet11, itemArray10);
        controllerItens9.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet11, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario16 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str17 = controllerUsuario16.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet18 = controllerUsuario16.todosUsuariosItens();
        controllerItens9.adicionaItem(itemSet18, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario26 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str27 = controllerUsuario26.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet28 = controllerUsuario26.todosUsuariosItens();
        controllerItens9.adicionaItem(itemSet28, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str35 = controllerItens2.getInfoItem(itemSet28, "Nao emprestado", "POLICIAL");
        java.lang.String str36 = controllerItens1.listarItensNaoEmprestados(itemSet28);
        lp2.projetofinal.controllers.ControllerItens controllerItens37 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray38 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet39 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet39, itemArray38);
        controllerItens37.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet39, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens44 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray45 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet46 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet46, itemArray45);
        controllerItens44.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet46, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario51 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str52 = controllerUsuario51.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet53 = controllerUsuario51.todosUsuariosItens();
        controllerItens44.adicionaItem(itemSet53, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens37.adicionaItem(itemSet53, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario69 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str70 = controllerUsuario69.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet71 = controllerUsuario69.todosUsuariosItens();
        java.lang.String str72 = controllerItens37.listarItensOrdenadosPorValor(itemSet71);
        java.lang.String str73 = controllerItens1.listarItensOrdenadosPorValor(itemSet71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = controllerItens0.getDetalhesItem(itemSet71, "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(itemSet5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(itemSet18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(itemSet28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str36, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(itemSet53);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(itemSet71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        sistema0.resetarPersistencia();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("DEZOITO_ANOS", "Nenhum emprestimos associados ao item", "AVENTURA", (double) (-1.0f), "1: ROMANCE - Reputacao: 0,00|", 64, "hi!", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        lp2.projetofinal.entidades.BluRayShow bluRayShow45 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str46 = bluRayShow45.getNome();
        boolean boolean47 = jogoTabuleiro3.equals((java.lang.Object) bluRayShow45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = bluRayShow45.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str46, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Caloteiro, Nenhum emprestimos associados ao item, ", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        java.lang.String str17 = controllerItens7.listarTop10Itens(itemSet16);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio(itemSet16, "Nao emprestado", 35);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str10 = sistema0.listarTop10Itens();
        java.lang.String str11 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("1: OUTRO - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item", (double) 52, "", (-37), "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str11, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.lang.String str22 = facade12.listarTop10MelhoresUsuarios();
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator1 = ordenaItemEmprestadoAlfabetico0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator2 = emprestimoComparator1.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator3 = emprestimoComparator1.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator4 = emprestimoComparator1.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator5 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator6 = emprestimoComparator5.reversed();
        java.lang.Class<?> wildcardClass7 = emprestimoComparator6.getClass();
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertNotNull(emprestimoComparator2);
        org.junit.Assert.assertNotNull(emprestimoComparator3);
        org.junit.Assert.assertNotNull(emprestimoComparator4);
        org.junit.Assert.assertNotNull(emprestimoComparator5);
        org.junit.Assert.assertNotNull(emprestimoComparator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
            sistema3.cadastrarBluRayShow("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "QUATORZE_ANOS", "Nenhum emprestimos associados ao item", 0.0d, (int) (short) -1, (-15), "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = ordenaUsuarioReputacaoCrescente0.reversed();
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente13 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente14 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator15 = ordenaUsuarioReputacaoCrescente13.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente14);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator16 = ordenaUsuarioReputacaoCrescente11.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente13);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator17 = ordenaUsuarioReputacaoCrescente11.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator18 = usuarioComparator3.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente11);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator20 = usuarioComparator3.thenComparing(usuarioComparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(usuarioComparator15);
        org.junit.Assert.assertNotNull(usuarioComparator16);
        org.junit.Assert.assertNotNull(usuarioComparator17);
        org.junit.Assert.assertNotNull(usuarioComparator18);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarCaloteiros();
        java.lang.String str6 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) (byte) 1);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        bluRayShow62.atualizaNumeroEmprestimos();
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
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        java.lang.String str4 = facade0.listarEmprestimosItem("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("Caloteiro, MUSICAL, ", "Caloteiro, Nenhum emprestimos associados ao item, ", "PC", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str4 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("POLICIAL", "DEZOITO_ANOS", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        java.lang.String str10 = bluRaySerie7.getEstado();
        bluRaySerie7.adicionarBluRay((int) 'a');
        java.lang.String str13 = bluRaySerie7.getDescricao();
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco14 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos15 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie23 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str25 = bluRaySerie23.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos26 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow33 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay34 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean35 = bluRayShow33.equals((java.lang.Object) classificacaoBluRay34);
        bluRayShow33.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow45 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str46 = bluRayShow45.getNome();
        int int47 = ordenaItemNumeroEmprestimos26.compare((lp2.projetofinal.entidades.Item) bluRayShow33, (lp2.projetofinal.entidades.Item) bluRayShow45);
        int int48 = ordenaItemNumeroEmprestimos15.compare((lp2.projetofinal.entidades.Item) bluRaySerie23, (lp2.projetofinal.entidades.Item) bluRayShow45);
        java.lang.String str49 = bluRayShow45.getNomeArtista();
        java.lang.String str51 = bluRayShow45.getInfo("Caloteiro, OUTRO, ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow58 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow58.atualizaNumeroEmprestimos();
        int int60 = ordenaItemPeloPreco14.compare((lp2.projetofinal.entidades.Item) bluRayShow45, (lp2.projetofinal.entidades.Item) bluRayShow58);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie68 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str70 = bluRaySerie68.getInfo("Nao emprestado");
        lp2.projetofinal.entidades.BluRayShow bluRayShow77 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow77.setNome("Caloteiro");
        int int80 = ordenaItemPeloPreco14.compare((lp2.projetofinal.entidades.Item) bluRaySerie68, (lp2.projetofinal.entidades.Item) bluRayShow77);
        bluRaySerie68.adicionarBluRay((int) ' ');
        int int83 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie68);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nao emprestado" + "'", str10, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str13, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay34 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay34.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro" + "'", str46, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        java.lang.String str31 = controllerItens0.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet26);
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
        java.lang.String str52 = controllerItens32.listarTop10Itens(itemSet51);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario53 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str54 = controllerUsuario53.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet55 = controllerUsuario53.todosUsuariosItens();
        java.lang.String str56 = controllerItens32.listarTop10Itens(itemSet55);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem(itemSet55, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Nenhum emprestimos associados ao item");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str31, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(itemSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(itemSet55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("LIVRE", "Caloteiro, MUSICAL, ", "PC", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens20 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens21 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario22 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str23 = controllerUsuario22.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet24 = controllerUsuario22.todosUsuariosItens();
        controllerItens21.adicionaItem(itemSet24, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens28 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray29 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet30 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet30, itemArray29);
        controllerItens28.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet30, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario35 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str36 = controllerUsuario35.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet37 = controllerUsuario35.todosUsuariosItens();
        controllerItens28.adicionaItem(itemSet37, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario45 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str46 = controllerUsuario45.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet47 = controllerUsuario45.todosUsuariosItens();
        controllerItens28.adicionaItem(itemSet47, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str54 = controllerItens21.getInfoItem(itemSet47, "Nao emprestado", "POLICIAL");
        java.lang.String str55 = controllerItens20.listarItensNaoEmprestados(itemSet47);
        lp2.projetofinal.controllers.ControllerItens controllerItens56 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray57 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet58 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet58, itemArray57);
        controllerItens56.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet58, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens63 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray64 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet65 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet65, itemArray64);
        controllerItens63.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet65, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario70 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str71 = controllerUsuario70.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet72 = controllerUsuario70.todosUsuariosItens();
        controllerItens63.adicionaItem(itemSet72, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens56.adicionaItem(itemSet72, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario88 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str89 = controllerUsuario88.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet90 = controllerUsuario88.todosUsuariosItens();
        java.lang.String str91 = controllerItens56.listarItensOrdenadosPorValor(itemSet90);
        java.lang.String str92 = controllerItens20.listarItensOrdenadosPorValor(itemSet90);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet90, "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(itemSet24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(itemSet37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(itemSet47);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str55, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(itemSet72);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(itemSet90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario5 = controllerUsuario0.identificaUsuario("1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens39 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray40 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet41 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet41, itemArray40);
        controllerItens39.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet41, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario46 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str47 = controllerUsuario46.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet48 = controllerUsuario46.todosUsuariosItens();
        controllerItens39.adicionaItem(itemSet48, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens32.adicionaItem(itemSet48, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerItens controllerItens64 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray65 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet66 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet66, itemArray65);
        controllerItens64.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet66, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario71 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str72 = controllerUsuario71.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet73 = controllerUsuario71.todosUsuariosItens();
        controllerItens64.adicionaItem(itemSet73, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario81 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str82 = controllerUsuario81.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet83 = controllerUsuario81.todosUsuariosItens();
        controllerItens64.adicionaItem(itemSet83, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str88 = controllerItens32.listarItensNaoEmprestados(itemSet83);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio(itemSet83, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(itemSet48);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(itemSet73);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(itemSet83);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str88, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("Emprestado");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        // The following exception was thrown during execution in test generation
        try {
            sistema3.cadastrarBluRaySerie("Caloteiro, Nenhum emprestimos associados ao item, ", "BomAmigo", "DEZOITO_ANOS", (double) (short) 10, "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", (int) (short) 0, "PS3", "POLICIAL", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
            facade0.adicionarBluRay("BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "1: ROMANCE - Reputacao: 0,00|", 100);
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("1: OUTRO - Reputacao: 0,00|", "BomAmigo", "Nao emprestado", "Caloteiro, Nao emprestado, ", "Noob");
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "Nao emprestado");
        lp2.projetofinal.facade.Facade facade3 = new lp2.projetofinal.facade.Facade();
        java.lang.String str4 = facade3.listarTop10PioresUsuarios();
        facade3.iniciarSistema();
        java.lang.String str6 = facade3.listarTop10Itens();
        boolean boolean7 = chaveNomeTelefone2.equals((java.lang.Object) str6);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario8 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario8.salvarMapaUsuarios();
        java.lang.String str10 = controllerUsuario8.listarTop10MelhoresUsuarios();
        boolean boolean11 = chaveNomeTelefone2.equals((java.lang.Object) controllerUsuario8);
        java.lang.String str12 = controllerUsuario8.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario8.removerUsuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        int int13 = bluRaySerie7.getDuracao();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("BomAmigo", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "QUATORZE_ANOS", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("COMPLETO", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "Lista de usuarios com reputacao negativa: ", (double) (-15), (-37), (int) (byte) 0, "", "1:  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        bluRaySerie7.atualizar("", "");
        int int15 = bluRaySerie7.getNumeroTemporada();
        java.lang.String str16 = bluRaySerie7.getEstado();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Nao emprestado" + "'", str16, "Nao emprestado");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("1: OUTRO - Reputacao: 0,00|", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente48 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator49 = ordenaUsuarioReputacaoCrescente47.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente48);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator50 = ordenaUsuarioReputacaoCrescente47.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente51 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente52 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator53 = ordenaUsuarioReputacaoCrescente51.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente52);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator54 = ordenaUsuarioReputacaoCrescente51.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator55 = ordenaUsuarioReputacaoCrescente51.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator56 = ordenaUsuarioReputacaoCrescente47.thenComparing(usuarioComparator55);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente57 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente58 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator59 = ordenaUsuarioReputacaoCrescente57.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente58);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator60 = usuarioComparator59.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator61 = usuarioComparator56.thenComparing(usuarioComparator59);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator62 = usuarioComparator61.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente63 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente64 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator65 = ordenaUsuarioReputacaoCrescente63.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente64);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator66 = ordenaUsuarioReputacaoCrescente63.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente67 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente68 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator69 = ordenaUsuarioReputacaoCrescente67.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente68);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator70 = ordenaUsuarioReputacaoCrescente67.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator71 = ordenaUsuarioReputacaoCrescente67.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator72 = ordenaUsuarioReputacaoCrescente63.thenComparing(usuarioComparator71);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente73 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente74 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator75 = ordenaUsuarioReputacaoCrescente73.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente74);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator76 = usuarioComparator75.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator77 = usuarioComparator72.thenComparing(usuarioComparator75);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator78 = usuarioComparator77.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator79 = usuarioComparator78.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator80 = usuarioComparator61.thenComparing(usuarioComparator79);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator81 = ordenaUsuarioReputacaoCrescente0.thenComparing(usuarioComparator79);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Caloteiro" + "'", str38, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(usuarioComparator49);
        org.junit.Assert.assertNotNull(usuarioComparator50);
        org.junit.Assert.assertNotNull(usuarioComparator53);
        org.junit.Assert.assertNotNull(usuarioComparator54);
        org.junit.Assert.assertNotNull(usuarioComparator55);
        org.junit.Assert.assertNotNull(usuarioComparator56);
        org.junit.Assert.assertNotNull(usuarioComparator59);
        org.junit.Assert.assertNotNull(usuarioComparator60);
        org.junit.Assert.assertNotNull(usuarioComparator61);
        org.junit.Assert.assertNotNull(usuarioComparator62);
        org.junit.Assert.assertNotNull(usuarioComparator65);
        org.junit.Assert.assertNotNull(usuarioComparator66);
        org.junit.Assert.assertNotNull(usuarioComparator69);
        org.junit.Assert.assertNotNull(usuarioComparator70);
        org.junit.Assert.assertNotNull(usuarioComparator71);
        org.junit.Assert.assertNotNull(usuarioComparator72);
        org.junit.Assert.assertNotNull(usuarioComparator75);
        org.junit.Assert.assertNotNull(usuarioComparator76);
        org.junit.Assert.assertNotNull(usuarioComparator77);
        org.junit.Assert.assertNotNull(usuarioComparator78);
        org.junit.Assert.assertNotNull(usuarioComparator79);
        org.junit.Assert.assertNotNull(usuarioComparator80);
        org.junit.Assert.assertNotNull(usuarioComparator81);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        // The following exception was thrown during execution in test generation
        try {
            sistema3.atualizarItem("Caloteiro, Nenhum emprestimos associados ao item, ", "Nenhum emprestimos associados ao item", "AVENTURA", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("DOCUMENTARIO", "1: ROMANCE - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        lp2.projetofinal.entidades.Item item26 = emprestimo20.getItem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = emprestimo20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        jogoTabuleiro3.adicionarPecaPerdida("Caloteiro");
        jogoTabuleiro3.adicionarPecaPerdida("1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Caloteiro" + "'", str30, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Caloteiro" + "'", str35, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro, OUTRO, " + "'", str36, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facade12.pesquisarDetalhesItem("Emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
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
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("Caloteiro, MUSICAL, ");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        controllerItens32.adicionaItem(itemSet41, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens49 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray50 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet51 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet51, itemArray50);
        controllerItens49.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet51, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario56 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str57 = controllerUsuario56.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet58 = controllerUsuario56.todosUsuariosItens();
        controllerItens49.adicionaItem(itemSet58, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario66 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str67 = controllerUsuario66.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet68 = controllerUsuario66.todosUsuariosItens();
        controllerItens49.adicionaItem(itemSet68, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str73 = controllerItens32.listarItensNaoEmprestados(itemSet68);
        java.lang.String str74 = controllerItens0.listarItensOrdenadosPorValor(itemSet68);
        lp2.projetofinal.controllers.ControllerItens controllerItens75 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray76 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet77 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet77, itemArray76);
        controllerItens75.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet77, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario82 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str83 = controllerUsuario82.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet84 = controllerUsuario82.todosUsuariosItens();
        controllerItens75.adicionaItem(itemSet84, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario92 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str93 = controllerUsuario92.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet94 = controllerUsuario92.todosUsuariosItens();
        java.lang.String str95 = controllerItens75.listarTop10Itens(itemSet94);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet94, "COMPLETO");
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
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(itemSet58);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(itemSet68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str73, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str74, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(itemSet84);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(itemSet94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 7);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "DOZE_ANOS", (double) (short) 1, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", 7, "1: Caloteiro - Reputacao: 0,00|", "PC", 5);
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((-15));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("DEZESSEIS_ANOS");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
            sistema25.registrarEmprestimo("Nao emprestado", "1: ROMANCE - Reputacao: 0,00|", "Nenhum item pego emprestado", "Caloteiro", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data nao pode ser vazia ou nula");
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        java.lang.String str21 = bluRaySerie16.getInfo("FreeRyder");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-11) + "'", int19 == (-11));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente50 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario54 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str55 = usuario54.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario59 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int60 = ordenaUsuarioReputacaoCrescente50.compare(usuario54, usuario59);
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str65 = usuario64.getTelefone();
        java.lang.String str66 = usuario64.getNome();
        lp2.projetofinal.entidades.Item item67 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo70 = new lp2.projetofinal.entidades.Emprestimo(usuario59, usuario64, item67, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario71 = emprestimo70.getDonoDoItem();
        int int72 = emprestimo70.getNumeroDias();
        lp2.projetofinal.entidades.Item item73 = emprestimo70.getItem();
        java.lang.Object obj74 = null;
        boolean boolean75 = emprestimo70.equals(obj74);
        lp2.projetofinal.entidades.Usuario usuario76 = emprestimo70.getDonoDoItem();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente77 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario81 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str82 = usuario81.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario86 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int87 = ordenaUsuarioReputacaoCrescente77.compare(usuario81, usuario86);
        lp2.projetofinal.entidades.BluRayShow bluRayShow94 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 7, "Nenhum item pego emprestado", "Nenhum item pego emprestado", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = controllerEmprestimos0.devolverItem(usuario76, usuario86, (lp2.projetofinal.entidades.Item) bluRayShow94, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Caloteiro" + "'", str66, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNull(item73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(usuario76);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        double double12 = bluRaySerie7.getPreco();
        int int13 = bluRaySerie7.getDuracao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        java.lang.String str10 = bluRaySerie7.getEstado();
        bluRaySerie7.adicionarBluRay((int) 'a');
        java.lang.String str13 = bluRaySerie7.getDescricao();
        java.lang.String str14 = bluRaySerie7.getGenero();
        bluRaySerie7.setPreco((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nao emprestado" + "'", str10, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str13, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ROMANCE" + "'", str14, "ROMANCE");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.cadastrarUsuario("DEZESSEIS_ANOS", "1: Caloteiro - Reputacao: 0,00|", "Noob");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("DEZOITO_ANOS", "Caloteiro, Nenhum emprestimos associados ao item, ", "1:  - Reputacao: 0,00|", (double) (byte) 0, 7, "1: OUTRO - Reputacao: 0,00|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str4 = usuario3.getTelefone();
        java.lang.String str5 = usuario3.getNome();
        double double6 = usuario3.getReputacao();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro7 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int8 = cartaoCaloteiro7.prazoEmprestimo();
        usuario3.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro7);
        usuario3.setNome("QUATORZE_ANOS");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Caloteiro" + "'", str5, "Caloteiro");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
            facade0.cadastrarBluRaySerie("Caloteiro, Nao emprestado, ", "COM PECAS PERDIDAS", "", (double) (-15), "Caloteiro, Nao emprestado, ", 10, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
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
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.String str60 = usuario15.toString();
        java.lang.String str61 = usuario15.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str56, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Caloteiro, OUTRO, " + "'", str60, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Caloteiro" + "'", str61, "Caloteiro");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("DEZOITO_ANOS", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.pesquisarDetalhesItem("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "PC", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Noob");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("1:  - Reputacao: 0,00|", "", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "XBOX360", "COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("DEZOITO_ANOS", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "DOZE_ANOS", (double) 7, "COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("Nenhum item pego emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Noob", "OUTRO", "1: Caloteiro - Reputacao: 0,00|", "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = controllerUsuario29.retornaUsuarioItens("1:  - Reputacao: 0,00|", "DOCUMENTARIO");
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "OUTRO", "1:  - Reputacao: 0,00|");
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str14 = bluRayShow6.getNome();
        bluRayShow6.atualizar("1: OUTRO - Reputacao: 0,00|", "Caloteiro, MUSICAL, ");
        int int18 = bluRayShow6.getNumFaixas();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OUTRO" + "'", str14, "OUTRO");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.listarEmprestimosUsuarioPegandoEmprestado("1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facade12.pesquisarDetalhesItem("Nenhum emprestimos associados ao item", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Noob");
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
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoItem("", "Lista de usuarios com reputacao negativa: ", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet26 = controllerUsuario24.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet26, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        controllerItens0.adicionaItem(itemSet26, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente38 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str43 = usuario42.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario47 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int48 = ordenaUsuarioReputacaoCrescente38.compare(usuario42, usuario47);
        lp2.projetofinal.entidades.Usuario usuario52 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str53 = usuario52.getTelefone();
        java.lang.String str54 = usuario52.getNome();
        lp2.projetofinal.entidades.Item item55 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo58 = new lp2.projetofinal.entidades.Emprestimo(usuario47, usuario52, item55, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str63 = usuario62.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo65 = new lp2.projetofinal.entidades.Emprestimo(usuario52, usuario62, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet66 = usuario52.retornaSeusItens();
        controllerItens0.adicionaItem(itemSet66, "OUTRO", (double) 1, "Nao emprestado", (int) 'a', "Nenhum item pego emprestado", "", (int) (byte) 10);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet75 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionaItem(itemSet75, "COMPLETO", (double) 100L, "", (int) 'a', "Lista de usuarios com reputacao negativa: ", "Emprestado", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Caloteiro" + "'", str54, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(itemSet66);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str4 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("Caloteiro", "", "XBOX360", "Caloteiro, Nao emprestado, ", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DEZOITO_ANOS", "1: ROMANCE - Reputacao: 0,00|");
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("Lista de usuarios com reputacao negativa: ", "AVENTURA", "", (double) 10, "Emprestado", 0, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "PS3", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", (double) 10.0f, "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        sistema0.resetarPersistencia();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Nao emprestado", "PS3", (double) 100L, "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        controllerItens32.adicionaItem(itemSet41, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
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
        lp2.projetofinal.entidades.Item[] itemArray67 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet68 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet68, itemArray67);
        controllerItens66.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet68, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario73 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str74 = controllerUsuario73.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet75 = controllerUsuario73.todosUsuariosItens();
        controllerItens66.adicionaItem(itemSet75, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario83 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str84 = controllerUsuario83.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet85 = controllerUsuario83.todosUsuariosItens();
        controllerItens66.adicionaItem(itemSet85, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str90 = controllerItens49.listarItensNaoEmprestados(itemSet85);
        controllerItens32.adicionaItem(itemSet85, "", (double) (short) -1, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = controllerItens0.getInfoItem(itemSet85, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "LIVRE");
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
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(itemSet58);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(itemSet75);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(itemSet85);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str90, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        boolean boolean2 = cartaoCaloteiro0.permisaoPegarEmprestado();
        java.lang.String str3 = cartaoCaloteiro0.getNomeCartao();
        java.lang.String str4 = cartaoCaloteiro0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Caloteiro" + "'", str3, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Caloteiro" + "'", str4, "Caloteiro");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaEmailVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro50 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario49.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro50);
        int int52 = cartaoCaloteiro50.prazoEmprestimo();
        usuario24.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro50);
        boolean boolean54 = cartaoCaloteiro50.permisaoPegarEmprestado();
        java.lang.String str55 = cartaoCaloteiro50.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Caloteiro" + "'", str55, "Caloteiro");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoUsuario("Emprestado", "Caloteiro, Nao emprestado, ", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        int int8 = bluRayFilme6.getAnoLancamento();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro, Nao emprestado, ", "QUATORZE_ANOS", "1: ROMANCE - Reputacao: 0,00|", (double) (byte) 1, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", (int) (short) 1, "", "Caloteiro, MUSICAL, ", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Classificacao nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.getInfoUsuario("Lista de usuarios com reputacao negativa: ", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario53 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str54 = controllerUsuario53.listarCaloteiros();
        java.lang.String str55 = controllerUsuario53.listarTop10MelhoresUsuarios();
        controllerUsuario53.carregaMapaUsuarios();
        java.lang.String str57 = controllerUsuario53.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet58 = controllerUsuario53.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = controllerItens0.getInfoItem(itemSet58, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "Caloteiro, Nenhum emprestimos associados ao item, ");
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str54, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(itemSet58);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        lp2.projetofinal.entidades.Item[] itemArray26 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet27 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet27, itemArray26);
        controllerItens25.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet27, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario32 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str33 = controllerUsuario32.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet34 = controllerUsuario32.todosUsuariosItens();
        controllerItens25.adicionaItem(itemSet34, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario42 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str43 = controllerUsuario42.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet44 = controllerUsuario42.todosUsuariosItens();
        java.lang.String str45 = controllerItens25.listarTop10Itens(itemSet44);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario46 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str47 = controllerUsuario46.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet48 = controllerUsuario46.todosUsuariosItens();
        java.lang.String str49 = controllerItens25.listarTop10Itens(itemSet48);
        controllerItens0.adicionaItem(itemSet48, "Nenhum emprestimos associados ao item", (double) 0L, "Caloteiro, OUTRO, ");
        lp2.projetofinal.controllers.ControllerItens controllerItens54 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray55 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet56 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet56, itemArray55);
        controllerItens54.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet56, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario61 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str62 = controllerUsuario61.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet63 = controllerUsuario61.todosUsuariosItens();
        controllerItens54.adicionaItem(itemSet63, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario71 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str72 = controllerUsuario71.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet73 = controllerUsuario71.todosUsuariosItens();
        java.lang.String str74 = controllerItens54.listarTop10Itens(itemSet73);
        java.lang.String str75 = controllerItens0.listarItensOrdenadosPorValor(itemSet73);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario76 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str77 = controllerUsuario76.listarTop10PioresUsuarios();
        java.lang.String str78 = controllerUsuario76.listarTop10PioresUsuarios();
        java.lang.String str79 = controllerUsuario76.listarCaloteiros();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet80 = controllerUsuario76.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet80, "Caloteiro, Nao emprestado, ", (double) (-1), 0, "", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 14);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str24, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(itemSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(itemSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(itemSet63);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(itemSet73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str79, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertNotNull(itemSet80);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "ROMANCE", "");
        java.lang.String str7 = controllerUsuario0.listarTop10PioresUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: COMPLETO - Reputacao: 0,00|" + "'", str7, "1: COMPLETO - Reputacao: 0,00|");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str2 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("MUSICAL", "1: Caloteiro - Reputacao: 0,00|", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.cadastrarUsuario("Caloteiro, OUTRO, ", "1: ROMANCE - Reputacao: 0,00|", "1: ROMANCE - Reputacao: 0,00|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sistema0.listarEmprestimosUsuarioEmprestando("COM PECAS PERDIDAS", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str1 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str2 = controllerEmprestimos0.listarItensEmprestados();
        lp2.projetofinal.entidades.Usuario usuario6 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico8 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean9 = usuario6.equals((java.lang.Object) plataformaJogoEletronico8);
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
        lp2.projetofinal.entidades.Usuario usuario32 = emprestimo30.getUsuarioRequerente();
        usuario32.setEmail("Nao emprestado");
        int int35 = usuario6.compareTo(usuario32);
        java.lang.String str36 = usuario6.getNome();
        double double37 = usuario6.getReputacao();
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos38 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str39 = controllerEmprestimos38.listarItensEmprestados();
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
        usuario49.setEmail("OUTRO");
        java.lang.String str63 = usuario49.getEmail();
        java.lang.String str64 = controllerEmprestimos38.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario49);
        lp2.projetofinal.entidades.BluRayShow bluRayShow71 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay72 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean73 = bluRayShow71.equals((java.lang.Object) classificacaoBluRay72);
        bluRayShow71.atualizar("hi!", "OUTRO");
        bluRayShow71.setNome("OUTRO");
        java.lang.String str79 = bluRayShow71.getNome();
        // The following exception was thrown during execution in test generation
        try {
            int int82 = controllerEmprestimos0.devolverItem(usuario6, usuario49, (lp2.projetofinal.entidades.Item) bluRayShow71, "Nenhum emprestimos associados ao item", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Caloteiro" + "'", str26, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario31);
        org.junit.Assert.assertNotNull(usuario32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Caloteiro" + "'", str36, "Caloteiro");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Caloteiro" + "'", str56, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "OUTRO" + "'", str63, "OUTRO");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Nenhum item emprestado" + "'", str64, "Nenhum item emprestado");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay72 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay72.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "OUTRO" + "'", str79, "OUTRO");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        emprestimo27.setDataDevolucao("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
        lp2.projetofinal.entidades.Item item41 = emprestimo27.getItem();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(usuario38);
        org.junit.Assert.assertNull(item41);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Caloteiro", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", (-1.0d), 5, (int) '#', "", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
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
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("1:  - Reputacao: 0,00|");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Caloteiro");
        java.lang.String str9 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("MUSICAL", "ROMANCE", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.getInfoItem("hi!", "Nenhum emprestimos associados ao item", "Caloteiro, MUSICAL, ", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getDescricao();
        int int9 = bluRaySerie7.duracaoTotal();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario7 = controllerUsuario0.identificaUsuario("Emprestado", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("1: COMPLETO - Reputacao: 0,00|");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        usuario72.setNome("ROMANCE");
        java.lang.String str77 = usuario72.getTelefone();
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("QUATORZE_ANOS", "1:  - Reputacao: 0,00|", "DEZOITO_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
        java.lang.String str8 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str9 = controllerUsuario0.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("Nenhum item pego emprestado", "1: OUTRO - Reputacao: 0,00|", "Nenhum item pego emprestado", (double) 100L, (-15), "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        java.lang.String str12 = chaveNomeTelefone2.getNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str3, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str5, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str6, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str12, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie(0);
        int int2 = episodioSerie1.getDuracao();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.lang.String str34 = usuario14.getTelefone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("DOZE_ANOS", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Nenhum item pego emprestado", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        lp2.projetofinal.entidades.Usuario usuario40 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str41 = usuario40.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo43 = new lp2.projetofinal.entidades.Emprestimo(usuario30, usuario40, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos44 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico48 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str49 = jogoEletronico48.getPlataforma();
        java.lang.String str50 = jogoEletronico48.getPlataforma();
        jogoEletronico48.itemDevolvido();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro54 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        jogoTabuleiro54.adicionarPecaPerdida("Caloteiro, Nao emprestado, ");
        int int57 = ordenaItemNumeroEmprestimos44.compare((lp2.projetofinal.entidades.Item) jogoEletronico48, (lp2.projetofinal.entidades.Item) jogoTabuleiro54);
        lp2.projetofinal.entidades.Emprestimo emprestimo60 = new lp2.projetofinal.entidades.Emprestimo(usuario6, usuario40, (lp2.projetofinal.entidades.Item) jogoEletronico48, "Caloteiro, OUTRO, ", (int) (short) 10);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente61 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente62 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator63 = ordenaUsuarioReputacaoCrescente61.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente62);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator64 = ordenaUsuarioReputacaoCrescente61.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente65 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente66 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator67 = ordenaUsuarioReputacaoCrescente65.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente66);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator68 = ordenaUsuarioReputacaoCrescente65.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator69 = ordenaUsuarioReputacaoCrescente65.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator70 = ordenaUsuarioReputacaoCrescente61.thenComparing(usuarioComparator69);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente71 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente72 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator73 = ordenaUsuarioReputacaoCrescente71.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente72);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator74 = usuarioComparator73.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator75 = usuarioComparator70.thenComparing(usuarioComparator73);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator76 = usuarioComparator75.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator77 = usuarioComparator76.reversed();
        boolean boolean78 = usuario40.equals((java.lang.Object) usuarioComparator77);
        org.junit.Assert.assertNotNull(usuarioComparator2);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico8 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico8.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "OUTRO" + "'", str49, "OUTRO");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "OUTRO" + "'", str50, "OUTRO");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator63);
        org.junit.Assert.assertNotNull(usuarioComparator64);
        org.junit.Assert.assertNotNull(usuarioComparator67);
        org.junit.Assert.assertNotNull(usuarioComparator68);
        org.junit.Assert.assertNotNull(usuarioComparator69);
        org.junit.Assert.assertNotNull(usuarioComparator70);
        org.junit.Assert.assertNotNull(usuarioComparator73);
        org.junit.Assert.assertNotNull(usuarioComparator74);
        org.junit.Assert.assertNotNull(usuarioComparator75);
        org.junit.Assert.assertNotNull(usuarioComparator76);
        org.junit.Assert.assertNotNull(usuarioComparator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo((int) (short) 100);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        sistema3.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.cadastrarBluRayFilme("Nenhum item emprestado", "", "", 0.0d, (int) (short) 0, "PC", "COMPLETO", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "POLICIAL", "Caloteiro, Nenhum emprestimos associados ao item, ", (double) 0L, (int) (byte) 100, (-11), "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Lista de usuarios com reputacao negativa: ", (double) (short) 1, (int) (byte) 10, "PC", "DEZESSEIS_ANOS", 0);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario34 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str35 = controllerUsuario34.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = controllerUsuario34.todosUsuariosItens();
        controllerItens33.adicionaItem(itemSet36, "Nenhum emprestimos associados ao item", (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet36, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(itemSet36);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.lang.String str33 = controllerItens0.getInfoItem(itemSet26, "Nao emprestado", "POLICIAL");
        java.lang.Class<?> wildcardClass34 = controllerItens0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
            controllerUsuario0.verificadisponibilidadeUsuario("1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "Emprestado", 7);
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        bluRayShow6.setPreco((double) '#');
        int int22 = bluRayShow6.getDuracao();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-11) + "'", int19 == (-11));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("FreeRyder");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = controllerUsuario0.getInfoUsuario("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Caloteiro", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Caloteiro", "Caloteiro, Nenhum emprestimos associados ao item, ", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("", 1.0d, 0, "1:  - Reputacao: 0,00|", "FreeRyder", (-1));
        int int7 = bluRayFilme6.getAnoLancamento();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("QUATORZE_ANOS");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Lista de usuarios com reputacao negativa: ", "ROMANCE", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("Nenhum item pego emprestado", "DEZESSEIS_ANOS", (double) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        lp2.projetofinal.entidades.Item[] itemArray26 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet27 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet27, itemArray26);
        controllerItens25.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet27, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario32 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str33 = controllerUsuario32.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet34 = controllerUsuario32.todosUsuariosItens();
        controllerItens25.adicionaItem(itemSet34, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario42 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str43 = controllerUsuario42.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet44 = controllerUsuario42.todosUsuariosItens();
        controllerItens25.adicionaItem(itemSet44, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente49 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int59 = ordenaUsuarioReputacaoCrescente49.compare(usuario53, usuario58);
        lp2.projetofinal.entidades.Usuario usuario63 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str64 = usuario63.getTelefone();
        java.lang.String str65 = usuario63.getNome();
        lp2.projetofinal.entidades.Item item66 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo69 = new lp2.projetofinal.entidades.Emprestimo(usuario58, usuario63, item66, "OUTRO", 100);
        java.lang.String str70 = usuario63.getNome();
        java.lang.String str71 = usuario63.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet72 = usuario63.retornaSeusItens();
        java.lang.String str73 = controllerItens25.listarTop10Itens(itemSet72);
        controllerItens0.adicionaItem(itemSet72, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", (double) 0);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(itemSet20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|" + "'", str24, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(itemSet44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Caloteiro" + "'", str65, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Caloteiro" + "'", str70, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro, OUTRO, " + "'", str71, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) ' ');
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = emprestimo20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        usuario24.setEmail("Caloteiro, Nenhum emprestimos associados ao item, ");
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "Caloteiro");
        java.lang.String str38 = usuario37.toString();
        lp2.projetofinal.entidades.Emprestimo emprestimo40 = new lp2.projetofinal.entidades.Emprestimo(usuario24, usuario37, "DEZOITO_ANOS");
        usuario24.setNome("AVENTURA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro" + "'", str38, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "Nao emprestado");
        lp2.projetofinal.facade.Facade facade3 = new lp2.projetofinal.facade.Facade();
        java.lang.String str4 = facade3.listarTop10PioresUsuarios();
        facade3.iniciarSistema();
        java.lang.String str6 = facade3.listarTop10Itens();
        boolean boolean7 = chaveNomeTelefone2.equals((java.lang.Object) str6);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario8 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario8.salvarMapaUsuarios();
        java.lang.String str10 = controllerUsuario8.listarTop10MelhoresUsuarios();
        boolean boolean11 = chaveNomeTelefone2.equals((java.lang.Object) controllerUsuario8);
        java.lang.String str12 = chaveNomeTelefone2.getTelefone();
        java.lang.String str13 = chaveNomeTelefone2.getNome();
        java.lang.String str14 = chaveNomeTelefone2.getTelefone();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente15 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario19 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str20 = usuario19.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int25 = ordenaUsuarioReputacaoCrescente15.compare(usuario19, usuario24);
        lp2.projetofinal.entidades.Usuario usuario29 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str30 = usuario29.getTelefone();
        java.lang.String str31 = usuario29.getNome();
        lp2.projetofinal.entidades.Item item32 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo35 = new lp2.projetofinal.entidades.Emprestimo(usuario24, usuario29, item32, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario36 = emprestimo35.getDonoDoItem();
        int int37 = emprestimo35.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie39 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean40 = emprestimo35.equals((java.lang.Object) episodioSerie39);
        int int41 = emprestimo35.getNumeroDias();
        boolean boolean42 = chaveNomeTelefone2.equals((java.lang.Object) emprestimo35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = emprestimo35.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Nao emprestado" + "'", str12, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str13, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Nao emprestado" + "'", str14, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("Caloteiro, Nao emprestado, ", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        lp2.projetofinal.entidades.Usuario usuario37 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico39 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean40 = usuario37.equals((java.lang.Object) plataformaJogoEletronico39);
        usuario37.setEmail("Nenhum emprestimos associados ao item");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente43 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario47 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str48 = usuario47.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario52 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int53 = ordenaUsuarioReputacaoCrescente43.compare(usuario47, usuario52);
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str58 = usuario57.getTelefone();
        java.lang.String str59 = usuario57.getNome();
        lp2.projetofinal.entidades.Item item60 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo63 = new lp2.projetofinal.entidades.Emprestimo(usuario52, usuario57, item60, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario64 = emprestimo63.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro65 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario64.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro65);
        java.lang.String str67 = cartaoCaloteiro65.getNomeCartao();
        int int68 = cartaoCaloteiro65.prazoEmprestimo();
        usuario37.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro65);
        boolean boolean70 = bluRaySerie8.equals((java.lang.Object) usuario37);
        java.lang.String str71 = usuario37.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico39 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico39.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Caloteiro" + "'", str59, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Caloteiro" + "'", str67, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro, Nenhum emprestimos associados ao item, " + "'", str71, "Caloteiro, Nenhum emprestimos associados ao item, ");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.pesquisarDetalhesItem("1: Caloteiro - Reputacao: 0,00|", "DOCUMENTARIO", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.pesquisarDetalhesItem("NINTENDO 3DS", "1: ROMANCE - Reputacao: 0,00|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Emprestado", (-1.0d), "Nenhum item pego emprestado", (int) (byte) 100, "QUATORZE_ANOS", "Nenhum item emprestado", (int) '#');
        bluRaySerie7.setPreco((double) 100L);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
            facade0.cadastrarBluRaySerie("Nenhum emprestimos associados ao item", "OUTRO", "BomAmigo", (double) (-1L), "PS3", 100, "Caloteiro, Nenhum emprestimos associados ao item, ", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoItem("XBOX360", "ROMANCE", "NINTENDO 3DS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        bluRaySerie30.atualizaNumeroEmprestimos();
        lp2.projetofinal.facade.Facade facade69 = new lp2.projetofinal.facade.Facade();
        facade69.fecharSistema();
        java.lang.String str72 = facade69.listarEmprestimosItem("OUTRO");
        java.lang.String str73 = facade69.listarItensOrdenadosPorValor();
        java.lang.String str74 = facade69.listarItensOrdenadosPorValor();
        java.lang.String str76 = facade69.listarEmprestimosItem("PS3");
        boolean boolean77 = bluRaySerie30.equals((java.lang.Object) "PS3");
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str72, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str76, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "1: COMPLETO - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str5 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "FreeRyder", (double) (byte) 100, 7, "1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.toString();
        java.lang.String str5 = jogoEletronico3.getPlataforma();
        int int6 = jogoEletronico3.getNumeroEmprestimos();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Nao emprestado", "XBOX360", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str9 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("", "DEZOITO_ANOS");
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Emprestado", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
            sistema3.removerUsuario("1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
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
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.cadastrarUsuario("BomAmigo", "Caloteiro, OUTRO, ", "Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarUsuario("DEZOITO_ANOS", "Caloteiro, MUSICAL, ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        bluRayShow6.setNome("QUATORZE_ANOS");
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
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str10 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("COMPLETO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoUsuario("MUSICAL", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("Caloteiro");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int12 = bluRaySerie7.getNumeroTemporada();
        int int13 = bluRaySerie7.getNumeroTemporada();
        java.lang.String str14 = bluRaySerie7.getDescricao();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ROMANCE" + "'", str8, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str14, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        java.lang.String str1 = cartaoNoob0.getNomeCartao();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Noob" + "'", str1, "Noob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("DOCUMENTARIO", "1: COMPLETO - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Emprestado", "DEZOITO_ANOS", "COM PECAS PERDIDAS", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
            facade0.atualizarUsuario("COMPLETO", "", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.lang.String str18 = sistema3.listarItensOrdenadosPorNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str15, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.String str38 = jogoEletronico33.getPlataforma();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Caloteiro" + "'", str21, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Caloteiro, OUTRO, " + "'", str22, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet23);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "OUTRO" + "'", str34, "OUTRO");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "OUTRO" + "'", str38, "OUTRO");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarEmprestimosItem("Caloteiro, Nenhum emprestimos associados ao item, ");
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("hi!", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "DEZESSEIS_ANOS", "PC", "OUTRO", "1: COMPLETO - Reputacao: 0,00|", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str5, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = jogoTabuleiro2.equals(obj3);
        jogoTabuleiro2.setNome("Nenhum emprestimos associados ao item");
        jogoTabuleiro2.atualizar("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "QUATORZE_ANOS");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("XBOX360", "QUATORZE_ANOS", "QUATORZE_ANOS", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str3 = chaveNomeTelefone2.getNome();
        java.lang.String str4 = chaveNomeTelefone2.getTelefone();
        java.lang.String str5 = chaveNomeTelefone2.getNome();
        lp2.projetofinal.enums.GeneroBluRay generoBluRay6 = lp2.projetofinal.enums.GeneroBluRay.ROMANCE;
        java.lang.String str7 = generoBluRay6.getGenero();
        java.lang.String str8 = generoBluRay6.getGenero();
        java.lang.String str9 = generoBluRay6.getGenero();
        boolean boolean10 = chaveNomeTelefone2.equals((java.lang.Object) generoBluRay6);
        java.lang.String str11 = chaveNomeTelefone2.getTelefone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str3, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str5, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("'" + generoBluRay6 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.ROMANCE + "'", generoBluRay6.equals(lp2.projetofinal.enums.GeneroBluRay.ROMANCE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ROMANCE" + "'", str7, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ROMANCE" + "'", str8, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str11, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("", "1: ROMANCE - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "XBOX360", "Caloteiro", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int1 = cartaoFreeRyder0.prazoEmprestimo();
        int int2 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str3 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str4 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str5 = cartaoFreeRyder0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FreeRyder" + "'", str3, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FreeRyder" + "'", str4, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FreeRyder" + "'", str5, "FreeRyder");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "QUATORZE_ANOS", "1:  - Reputacao: 0,00|", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente49 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int59 = ordenaUsuarioReputacaoCrescente49.compare(usuario53, usuario58);
        lp2.projetofinal.entidades.Usuario usuario63 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str64 = usuario63.getTelefone();
        java.lang.String str65 = usuario63.getNome();
        lp2.projetofinal.entidades.Item item66 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo69 = new lp2.projetofinal.entidades.Emprestimo(usuario58, usuario63, item66, "OUTRO", 100);
        usuario63.atualizaReputacao((double) (short) -1, false);
        java.lang.String str73 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario63);
        controllerEmprestimos0.salvarListaEmprestimos();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Caloteiro" + "'", str65, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Nenhum item emprestado" + "'", str73, "Nenhum item emprestado");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro11 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str12 = cartaoCaloteiro11.getNomeCartao();
        java.lang.String str13 = cartaoCaloteiro11.getNomeCartao();
        usuario4.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro11);
        java.lang.String str15 = cartaoCaloteiro11.getNomeCartao();
        boolean boolean16 = cartaoCaloteiro11.permisaoPegarEmprestado();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Caloteiro" + "'", str12, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Caloteiro" + "'", str13, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Caloteiro" + "'", str15, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        int int72 = bluRaySerie41.getNumeroTemporada();
        java.lang.String str73 = bluRaySerie41.getDescricao();
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str73, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("POLICIAL", (double) (short) 10);
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico3 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator4 = ordenaItemEmprestadoAlfabetico3.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator5 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator6 = emprestimoComparator4.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator7 = emprestimoComparator6.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator8 = emprestimoComparator6.reversed();
        boolean boolean9 = jogoTabuleiro2.equals((java.lang.Object) emprestimoComparator6);
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator10 = emprestimoComparator6.reversed();
        java.lang.Class<?> wildcardClass11 = emprestimoComparator6.getClass();
        org.junit.Assert.assertNotNull(emprestimoComparator4);
        org.junit.Assert.assertNotNull(emprestimoComparator5);
        org.junit.Assert.assertNotNull(emprestimoComparator6);
        org.junit.Assert.assertNotNull(emprestimoComparator7);
        org.junit.Assert.assertNotNull(emprestimoComparator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(emprestimoComparator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro11 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str12 = cartaoCaloteiro11.getNomeCartao();
        java.lang.String str13 = cartaoCaloteiro11.getNomeCartao();
        usuario4.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro11);
        boolean boolean15 = cartaoCaloteiro11.permisaoPegarEmprestado();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Caloteiro" + "'", str12, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Caloteiro" + "'", str13, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str6 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = sistema3.pesquisarDetalhesItem("XBOX360", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
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
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str7 = facade0.listarEmprestimosItem("PS3");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "", (double) 1L, (int) (short) 1, (int) (byte) 100, "XBOX360", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.listarEmprestimosUsuarioEmprestando("Caloteiro, OUTRO, ", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        java.lang.String str6 = sistema0.listarEmprestimosItem("POLICIAL");
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "DEZOITO_ANOS", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay0 = lp2.projetofinal.enums.ClassificacaoBluRay.DOZE_ANOS;
        java.lang.String str1 = classificacaoBluRay0.getClassificacao();
        java.lang.String str2 = classificacaoBluRay0.getClassificacao();
        java.lang.String str3 = classificacaoBluRay0.getClassificacao();
        java.lang.String str4 = classificacaoBluRay0.getClassificacao();
        java.lang.String str5 = classificacaoBluRay0.getClassificacao();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay0 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DOZE_ANOS + "'", classificacaoBluRay0.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DOZE_ANOS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DOZE_ANOS" + "'", str1, "DOZE_ANOS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DOZE_ANOS" + "'", str2, "DOZE_ANOS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DOZE_ANOS" + "'", str3, "DOZE_ANOS");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DOZE_ANOS" + "'", str4, "DOZE_ANOS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DOZE_ANOS" + "'", str5, "DOZE_ANOS");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoItem("OUTRO", "Noob", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.String str58 = controllerItens17.listarItensNaoEmprestados(itemSet53);
        controllerItens0.adicionaItem(itemSet53, "", (double) (short) -1, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario63 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str64 = controllerUsuario63.listarCaloteiros();
        java.lang.String str65 = controllerUsuario63.listarTop10MelhoresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet66 = controllerUsuario63.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = controllerItens0.getDetalhesItem(itemSet66, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
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
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(itemSet43);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(itemSet53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str58, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str64, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(itemSet66);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("1:  - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        java.lang.String str9 = bluRaySerie7.getInfo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        java.lang.String str11 = bluRaySerie7.getInfo("POLICIAL");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo0 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        java.lang.String str1 = cartaoBomAmigo0.getNomeCartao();
        int int2 = cartaoBomAmigo0.prazoEmprestimo();
        java.lang.String str3 = cartaoBomAmigo0.getNomeCartao();
        java.lang.String str4 = cartaoBomAmigo0.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BomAmigo" + "'", str1, "BomAmigo");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BomAmigo" + "'", str3, "BomAmigo");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BomAmigo" + "'", str4, "BomAmigo");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("PC", "AVENTURA", "Emprestado");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder4 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int5 = cartaoFreeRyder4.prazoEmprestimo();
        java.lang.String str6 = cartaoFreeRyder4.getNomeCartao();
        java.lang.String str7 = cartaoFreeRyder4.getNomeCartao();
        boolean boolean8 = cartaoFreeRyder4.permisaoPegarEmprestado();
        usuario3.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoFreeRyder4);
        usuario3.setTelefone("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FreeRyder" + "'", str6, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FreeRyder" + "'", str7, "FreeRyder");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("XBOX360");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        lp2.projetofinal.entidades.Usuario usuario23 = emprestimo20.getDonoDoItem();
        emprestimo20.setDataDevolucao("Emprestado");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = emprestimo20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(usuario23);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoItem("Nenhum item pego emprestado", "Lista de usuarios com reputacao negativa: ", "POLICIAL", "LIVRE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        emprestimo96.setDataDevolucao("Emprestado");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = emprestimo96.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str6 = facade0.listarCaloteiros();
        java.lang.String str7 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("1:  - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|", "hi!", "DEZESSEIS_ANOS", "BomAmigo", "Nenhum emprestimos associados ao item", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        java.lang.String str9 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("OUTRO", "ROMANCE", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.fecharSistema();
        java.lang.String str8 = facade0.listarEmprestimosItem("COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("Emprestado", "", "Caloteiro, MUSICAL, ", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioPegandoEmprestado("COM PECAS PERDIDAS", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
        java.lang.String str8 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario11 = controllerUsuario0.identificaUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) '#');
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario25 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario25.salvarMapaUsuarios();
        controllerUsuario25.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet31 = controllerUsuario25.todosUsuariosItens();
        java.lang.String str32 = controllerItens0.listarTop10Itens(itemSet31);
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
        java.lang.String str53 = controllerItens33.listarTop10Itens(itemSet52);
        java.lang.String str54 = controllerItens0.listarItensOrdenadosPorNome(itemSet52);
        lp2.projetofinal.controllers.ControllerItens controllerItens55 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens56 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario57 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str58 = controllerUsuario57.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet59 = controllerUsuario57.todosUsuariosItens();
        controllerItens56.adicionaItem(itemSet59, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens63 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray64 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet65 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet65, itemArray64);
        controllerItens63.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet65, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario70 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str71 = controllerUsuario70.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet72 = controllerUsuario70.todosUsuariosItens();
        controllerItens63.adicionaItem(itemSet72, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario80 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str81 = controllerUsuario80.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet82 = controllerUsuario80.todosUsuariosItens();
        controllerItens63.adicionaItem(itemSet82, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str89 = controllerItens56.getInfoItem(itemSet82, "Nao emprestado", "POLICIAL");
        java.lang.String str90 = controllerItens55.listarItensNaoEmprestados(itemSet82);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet82, "POLICIAL");
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
        org.junit.Assert.assertNotNull(itemSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(itemSet42);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(itemSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(itemSet59);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(itemSet72);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(itemSet82);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str90, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        java.lang.String str6 = facade0.listarItensOrdenadosPorNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.getNumeroTemporada();
        java.lang.Object obj10 = null;
        boolean boolean11 = bluRaySerie7.equals(obj10);
        java.lang.String str12 = bluRaySerie7.getNome();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Noob" + "'", str12, "Noob");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", 10.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("POLICIAL");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("1: COMPLETO - Reputacao: 0,00|");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario0.retornaUsuarioItens("FreeRyder", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("MUSICAL", "", "PC", "Caloteiro, OUTRO, ", "DEZESSEIS_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("Nenhum item emprestado");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("Nenhum item pego emprestado");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Caloteiro", "Nenhum item emprestado", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "PC", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        sistema3.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.cadastrarJogoTabuleiro("DEZESSEIS_ANOS", "1: Caloteiro - Reputacao: 0,00|", "Nenhum emprestimos associados ao item", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.String str72 = bluRaySerie41.getGenero();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ROMANCE" + "'", str72, "ROMANCE");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        java.lang.String str5 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        int int43 = cartaoCaloteiro38.prazoEmprestimo();
        java.lang.String str44 = cartaoCaloteiro38.getNomeCartao();
        java.lang.String str45 = cartaoCaloteiro38.getNomeCartao();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Caloteiro" + "'", str45, "Caloteiro");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet6 = controllerUsuario0.retornaUsuarioItens("Lista de usuarios com reputacao negativa: ", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        boolean boolean3 = cartaoNoob0.permisaoPegarEmprestado();
        java.lang.String str4 = cartaoNoob0.getNomeCartao();
        boolean boolean5 = cartaoNoob0.permisaoPegarEmprestado();
        int int6 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Noob" + "'", str4, "Noob");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("Emprestado");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("MUSICAL");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        // The following exception was thrown during execution in test generation
        try {
            sistema3.devolverItem("1:  - Reputacao: 0,00|", "hi!", "COM PECAS PERDIDAS", "1: ROMANCE - Reputacao: 0,00|", "DOCUMENTARIO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: COMPLETO - Reputacao: 0,00|");
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
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.String str15 = sistema3.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.atualizarUsuario("Nenhum item emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Caloteiro, MUSICAL, ", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        java.lang.String str4 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = controllerUsuario0.getInfoUsuario("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro, MUSICAL, ", "AVENTURA");
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
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
            java.lang.String str17 = facade5.pesquisarDetalhesItem("Nenhum emprestimos associados ao item", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Nao emprestado");
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        java.lang.String str15 = sistema3.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str15, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet36, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "Nao emprestado");
        java.lang.String str3 = chaveNomeTelefone2.getTelefone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nao emprestado" + "'", str3, "Nao emprestado");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.listarEmprestimosUsuarioEmprestando("", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        bluRaySerie7.itemDevolvido();
        java.lang.String str12 = bluRaySerie7.getDescricao();
        bluRaySerie7.atualizaNumeroEmprestimos();
        java.lang.String str14 = bluRaySerie7.getEstado();
        bluRaySerie7.itemDevolvido();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str12, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Nao emprestado" + "'", str14, "Nao emprestado");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("DOCUMENTARIO", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "", (double) (-18), "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        java.lang.String str4 = facade0.listarEmprestimosItem("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (double) (short) -1, 5, "", "LIVRE", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("MUSICAL");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        bluRaySerie8.adicionarBluRay((-1));
        int int39 = bluRaySerie8.getDuracao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sistema0.listarEmprestimosUsuarioEmprestando("BomAmigo", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "XBOX360", "OUTRO", (double) 0L, (int) 'a', 35, "FreeRyder", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("NINTENDO 3DS");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("PS3", "MUSICAL", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", "Emprestado", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "1:  - Reputacao: 0,00|", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
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
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str9 = controllerUsuario0.listarCaloteiros();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str11 = controllerUsuario0.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str11, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        int int14 = bluRayShow6.getNumeroEmprestimos();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensEmprestados();
        java.lang.String str6 = facade0.listarItensEmprestados();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("PC", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("1: Caloteiro - Reputacao: 0,00|", "Caloteiro", "1:  - Reputacao: 0,00|", "", "Nenhum item emprestado", "XBOX360", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        java.lang.String str34 = usuario14.getEmail();
        usuario14.setNome("1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "OUTRO" + "'", str34, "OUTRO");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        sistema0.cadastrarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "MUSICAL", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("1: COMPLETO - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|");
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
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.String str33 = controllerItens0.getInfoItem(itemSet26, "Nao emprestado", "POLICIAL");
        lp2.projetofinal.controllers.ControllerItens controllerItens34 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray35 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet36 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet36, itemArray35);
        controllerItens34.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet36, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario41 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str42 = controllerUsuario41.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet43 = controllerUsuario41.todosUsuariosItens();
        controllerItens34.adicionaItem(itemSet43, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens51 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray52 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet53 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet53, itemArray52);
        controllerItens51.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet53, "Caloteiro", (-1.0d));
        java.lang.String str58 = controllerItens34.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet53);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet53, "BomAmigo", (double) (byte) 10, (int) (short) 100, (int) (short) 1, "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "MUSICAL");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str67 = controllerItens0.listarTop10Itens(itemSet66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(itemSet43);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str58, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str4 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("LIVRE", "Caloteiro, OUTRO, ", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", (double) (byte) 10, "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
            facade0.removerItem("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
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
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str3 = jogoTabuleiro2.contemPecasPerdidas();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator6 = ordenaUsuarioReputacaoCrescente4.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente5);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator7 = ordenaUsuarioReputacaoCrescente4.reversed();
        boolean boolean8 = jogoTabuleiro2.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente4);
        jogoTabuleiro2.adicionarPecaPerdida("Nenhum emprestimos associados ao item");
        java.lang.Object obj11 = null;
        boolean boolean12 = jogoTabuleiro2.equals(obj11);
        java.lang.String str13 = jogoTabuleiro2.contemPecasPerdidas();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COMPLETO" + "'", str3, "COMPLETO");
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertNotNull(usuarioComparator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COM PECAS PERDIDAS" + "'", str13, "COM PECAS PERDIDAS");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        int int26 = emprestimo20.getNumeroDias();
        emprestimo20.setDataDevolucao("1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.lang.String str61 = controllerEmprestimos0.listarEmprestimosItens("BomAmigo");
        java.lang.String str63 = controllerEmprestimos0.listarEmprestimosItens("Caloteiro");
        controllerEmprestimos0.salvarListaEmprestimos();
        java.lang.String str65 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str67 = controllerEmprestimos0.listarEmprestimosItens("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str56, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str61, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str63, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||" + "'", str65, "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str67, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("POLICIAL", (double) (short) -1, (-18), "Caloteiro, MUSICAL, ", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", (int) (short) -1);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("DEZESSEIS_ANOS", (double) 'a', "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str2 = controllerEmprestimos0.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente3 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator5 = ordenaUsuarioReputacaoCrescente3.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente4);
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico11 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean12 = usuario9.equals((java.lang.Object) plataformaJogoEletronico11);
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str17 = usuario16.getTelefone();
        int int18 = ordenaUsuarioReputacaoCrescente3.compare(usuario9, usuario16);
        java.lang.String str19 = usuario9.getTelefone();
        java.lang.String str20 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario9);
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
        usuario30.setEmail("OUTRO");
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
        java.lang.String str65 = usuario58.getNome();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie73 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str74 = bluRaySerie73.getEstado();
        java.lang.String str75 = bluRaySerie73.getGenero();
        java.lang.String str76 = bluRaySerie73.getEstado();
        lp2.projetofinal.entidades.Emprestimo emprestimo79 = new lp2.projetofinal.entidades.Emprestimo(usuario30, usuario58, (lp2.projetofinal.entidades.Item) bluRaySerie73, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (-1));
        java.lang.String str80 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertNotNull(usuarioComparator5);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico11 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico11.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Nenhum item emprestado" + "'", str20, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Caloteiro" + "'", str37, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Caloteiro" + "'", str60, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Caloteiro" + "'", str65, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Nao emprestado" + "'", str74, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "ROMANCE" + "'", str75, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Nao emprestado" + "'", str76, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Nenhum item emprestado" + "'", str80, "Nenhum item emprestado");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        lp2.projetofinal.entidades.Usuario usuario22 = emprestimo20.getUsuarioRequerente();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie30 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str32 = bluRaySerie30.getInfo("Nao emprestado");
        boolean boolean33 = emprestimo20.equals((java.lang.Object) "Nao emprestado");
        lp2.projetofinal.entidades.Item item34 = emprestimo20.getItem();
        int int35 = emprestimo20.getNumeroDias();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertNotNull(usuario22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("NINTENDO 3DS", "Emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", 100.0d, "1: OUTRO - Reputacao: 0,00|", (int) (short) 100, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "1:  - Reputacao: 0,00|", (-37));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = controllerItens0.getDetalhesItem(itemSet36, "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.pesquisarDetalhesItem("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "Nao emprestado", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator17 = usuarioComparator16.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente18 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente19 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator20 = ordenaUsuarioReputacaoCrescente18.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente19);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator21 = usuarioComparator20.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator22 = usuarioComparator21.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator23 = usuarioComparator17.thenComparing(usuarioComparator22);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator24 = usuarioComparator23.reversed();
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
        org.junit.Assert.assertNotNull(usuarioComparator17);
        org.junit.Assert.assertNotNull(usuarioComparator20);
        org.junit.Assert.assertNotNull(usuarioComparator21);
        org.junit.Assert.assertNotNull(usuarioComparator22);
        org.junit.Assert.assertNotNull(usuarioComparator23);
        org.junit.Assert.assertNotNull(usuarioComparator24);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
            sistema0.removerUsuario("COMPLETO", "DEZESSEIS_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        java.lang.String str9 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("Nenhum item emprestado", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DOCUMENTARIO", "ROMANCE", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int12 = bluRaySerie7.getNumeroTemporada();
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme19 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        int int20 = bluRayFilme19.getAnoLancamento();
        int int21 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) bluRayFilme19);
        java.lang.String str22 = bluRayFilme19.getGenero();
        bluRayFilme19.setNome("");
        java.lang.String str26 = bluRayFilme19.getInfo("Caloteiro, Nao emprestado, ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ROMANCE" + "'", str8, "ROMANCE");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OUTRO" + "'", str22, "OUTRO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
            controllerUsuario29.atualizarUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Emprestado", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Nenhum item emprestado");
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
            sistema3.devolverItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "hi!", "Caloteiro, MUSICAL, ", "DOZE_ANOS", "Lista de usuarios com reputacao negativa: ", "hi!");
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.adicionarPecaPerdida("1: Caloteiro - Reputacao: 0,00|", "DEZOITO_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "OUTRO");
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
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "QUATORZE_ANOS", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str7 = facade0.listarEmprestimosItem("PS3");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("1: COMPLETO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) 10L, "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", 0, "Lista de usuarios com reputacao negativa: ", "Nenhum item pego emprestado", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.listarEmprestimosUsuarioEmprestando("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("XBOX360", "NINTENDO 3DS", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((int) (byte) 100);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoUsuario("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "XBOX360", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) 100L, 5, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "OUTRO", 52);
        int int7 = bluRayShow6.getNumFaixas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("Caloteiro");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("OUTRO", (double) (byte) 0, (-15), "Nao emprestado", "Caloteiro, OUTRO, ", 5);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("", "1: COMPLETO - Reputacao: 0,00|", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        int int24 = cartaoCaloteiro22.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoUsuario("1: OUTRO - Reputacao: 0,00|", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "DEZESSEIS_ANOS");
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
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "OUTRO", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        usuario14.setEmail("MUSICAL");
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade24 = usuario14.getCartao();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Caloteiro" + "'", str21, "Caloteiro");
        org.junit.Assert.assertNotNull(cartaoFidelidade24);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 1);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro50 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario49.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro50);
        int int52 = cartaoCaloteiro50.prazoEmprestimo();
        usuario24.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro50);
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade54 = usuario24.getCartao();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(cartaoFidelidade54);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        int int35 = bluRayShow30.getDuracao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("Caloteiro, MUSICAL, ", "1:  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("COM PECAS PERDIDAS", "COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, Nao emprestado, ", 0.0d);
        jogoTabuleiro2.itemEmprestado();
        java.lang.String str4 = jogoTabuleiro2.contemPecasPerdidas();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COMPLETO" + "'", str4, "COMPLETO");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro11 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str12 = cartaoCaloteiro11.getNomeCartao();
        java.lang.String str13 = cartaoCaloteiro11.getNomeCartao();
        usuario4.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro11);
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob15 = new lp2.projetofinal.entidades.CartaoNoob();
        int int16 = cartaoNoob15.prazoEmprestimo();
        java.lang.String str17 = cartaoNoob15.getNomeCartao();
        boolean boolean18 = cartaoNoob15.permisaoPegarEmprestado();
        int int19 = cartaoNoob15.prazoEmprestimo();
        usuario4.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoNoob15);
        boolean boolean21 = cartaoNoob15.permisaoPegarEmprestado();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Caloteiro" + "'", str12, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Caloteiro" + "'", str13, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Noob" + "'", str17, "Noob");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "Nao emprestado");
        lp2.projetofinal.facade.Facade facade3 = new lp2.projetofinal.facade.Facade();
        java.lang.String str4 = facade3.listarTop10PioresUsuarios();
        facade3.iniciarSistema();
        java.lang.String str6 = facade3.listarTop10Itens();
        boolean boolean7 = chaveNomeTelefone2.equals((java.lang.Object) str6);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario8 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario8.salvarMapaUsuarios();
        java.lang.String str10 = controllerUsuario8.listarTop10MelhoresUsuarios();
        boolean boolean11 = chaveNomeTelefone2.equals((java.lang.Object) controllerUsuario8);
        lp2.projetofinal.controllers.Sistema sistema12 = new lp2.projetofinal.controllers.Sistema();
        sistema12.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str17 = sistema12.listarItensOrdenadosPorValor();
        java.lang.String str18 = sistema12.listarCaloteiros();
        boolean boolean19 = chaveNomeTelefone2.equals((java.lang.Object) str18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str18, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.String str81 = bluRaySerie48.getDescricao();
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
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str81, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("Nenhum item pego emprestado", "Nenhum item pego emprestado", "Caloteiro", "DEZESSEIS_ANOS", "BomAmigo", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("Caloteiro, Nenhum emprestimos associados ao item, ", "PS3", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro, MUSICAL, ", 0.0d, (int) (short) 1, "MUSICAL", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (-11));
        bluRayShow6.setNome("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator1 = ordenaItemEmprestadoAlfabetico0.reversed();
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
        lp2.projetofinal.entidades.Usuario usuario23 = emprestimo22.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo22.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario25 = emprestimo22.getUsuarioRequerente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente26 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente27 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator28 = ordenaUsuarioReputacaoCrescente26.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente27);
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico34 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean35 = usuario32.equals((java.lang.Object) plataformaJogoEletronico34);
        lp2.projetofinal.entidades.Usuario usuario39 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str40 = usuario39.getTelefone();
        int int41 = ordenaUsuarioReputacaoCrescente26.compare(usuario32, usuario39);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente42 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str47 = usuario46.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario51 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int52 = ordenaUsuarioReputacaoCrescente42.compare(usuario46, usuario51);
        lp2.projetofinal.entidades.Usuario usuario56 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str57 = usuario56.getTelefone();
        java.lang.String str58 = usuario56.getNome();
        lp2.projetofinal.entidades.Item item59 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo62 = new lp2.projetofinal.entidades.Emprestimo(usuario51, usuario56, item59, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario63 = emprestimo62.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro64 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario63.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro64);
        java.lang.String str66 = cartaoCaloteiro64.getNomeCartao();
        boolean boolean67 = cartaoCaloteiro64.permisaoPegarEmprestado();
        usuario39.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro64);
        lp2.projetofinal.entidades.Usuario usuario72 = new lp2.projetofinal.entidades.Usuario("MUSICAL", "Lista de usuarios com reputacao negativa: ", "OUTRO");
        lp2.projetofinal.entidades.Emprestimo emprestimo74 = new lp2.projetofinal.entidades.Emprestimo(usuario39, usuario72, "Caloteiro");
        emprestimo74.setDataDevolucao("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        lp2.projetofinal.entidades.Item item77 = emprestimo74.getItem();
        lp2.projetofinal.entidades.Item item78 = emprestimo74.getItem();
        // The following exception was thrown during execution in test generation
        try {
            int int79 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo22, emprestimo74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario23);
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertNotNull(usuarioComparator28);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico34 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico34.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Caloteiro" + "'", str58, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Caloteiro" + "'", str66, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(item77);
        org.junit.Assert.assertNull(item78);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        java.lang.String str9 = sistema0.listarCaloteiros();
        java.lang.String str10 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("BomAmigo", "Caloteiro, Nao emprestado, ", "Caloteiro, MUSICAL, ", "AVENTURA", "1: OUTRO - Reputacao: 0,00|", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str10, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sistema0.listarEmprestimosUsuarioEmprestando("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        java.lang.String str10 = sistema0.listarEmprestimosItem("Emprestado");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sistema0.pesquisarDetalhesItem("", "Caloteiro, MUSICAL, ", "DEZESSEIS_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str10, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
            java.lang.String str19 = facade0.pesquisarDetalhesItem("1: OUTRO - Reputacao: 0,00|", "AVENTURA", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|");
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.Class<?> wildcardClass34 = usuario33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        lp2.projetofinal.entidades.Item item32 = emprestimo27.getItem();
        lp2.projetofinal.entidades.Item item33 = emprestimo27.getItem();
        emprestimo27.setDataDevolucao("QUATORZE_ANOS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertNotNull(usuario31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("1: Caloteiro, OUTRO,  - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        sistema0.resetarPersistencia();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("hi!", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "PC", (-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str5 = facade0.listarCaloteiros();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        lp2.projetofinal.controllers.Sistema sistema86 = new lp2.projetofinal.controllers.Sistema();
        sistema86.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str91 = sistema86.listarItensOrdenadosPorValor();
        java.lang.String str92 = sistema86.listarCaloteiros();
        boolean boolean93 = usuario56.equals((java.lang.Object) sistema86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str96 = sistema86.listarEmprestimosUsuarioPegandoEmprestado("Caloteiro", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str92, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) ' ');
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("Nenhum item pego emprestado", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Lista de usuarios com reputacao negativa: ", "ROMANCE", "Caloteiro");
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("1: Caloteiro - Reputacao: 0,00|", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        usuario3.setTelefone("FreeRyder");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob6 = new lp2.projetofinal.entidades.CartaoNoob();
        int int7 = cartaoNoob6.prazoEmprestimo();
        java.lang.String str8 = cartaoNoob6.getNomeCartao();
        boolean boolean9 = cartaoNoob6.permisaoPegarEmprestado();
        usuario3.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoNoob6);
        java.lang.String str11 = cartaoNoob6.getNomeCartao();
        int int12 = cartaoNoob6.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Noob" + "'", str8, "Noob");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("Lista de usuarios com reputacao negativa: ", "Caloteiro, Nao emprestado, ", "1: COMPLETO - Reputacao: 0,00|", (-1.0d), 7, "POLICIAL", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str4 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("1: OUTRO - Reputacao: 0,00|", "1:  - Reputacao: 0,00|", "Caloteiro", "Caloteiro, Nao emprestado, ", "", "PS3", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        java.lang.String str97 = usuario91.getNome();
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
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Caloteiro" + "'", str97, "Caloteiro");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.lang.String str58 = controllerItens17.listarItensNaoEmprestados(itemSet53);
        controllerItens0.adicionaItem(itemSet53, "", (double) (short) -1, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario63 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario63.salvarMapaUsuarios();
        controllerUsuario63.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario63.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet70 = controllerUsuario63.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item72 = controllerItens0.identificaItem(itemSet70, "Nenhum item emprestado");
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
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(itemSet43);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(itemSet53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str58, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemSet70);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.listarEmprestimosUsuarioPegandoEmprestado("ROMANCE", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "COMPLETO", "QUATORZE_ANOS", "COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "", "Caloteiro, OUTRO, ", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("1:  - Reputacao: 0,00|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("QUATORZE_ANOS");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        boolean boolean3 = cartaoCaloteiro0.permisaoPegarEmprestado();
        boolean boolean4 = cartaoCaloteiro0.permisaoPegarEmprestado();
        java.lang.String str5 = cartaoCaloteiro0.getNomeCartao();
        java.lang.String str6 = cartaoCaloteiro0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Caloteiro" + "'", str5, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Caloteiro" + "'", str6, "Caloteiro");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("NINTENDO 3DS", "FreeRyder", "DEZOITO_ANOS");
        usuario3.setEmail("Caloteiro, MUSICAL, ");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        lp2.projetofinal.entidades.Usuario usuario49 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente50 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario54 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str55 = usuario54.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario59 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int60 = ordenaUsuarioReputacaoCrescente50.compare(usuario54, usuario59);
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str65 = usuario64.getTelefone();
        java.lang.String str66 = usuario64.getNome();
        lp2.projetofinal.entidades.Item item67 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo70 = new lp2.projetofinal.entidades.Emprestimo(usuario59, usuario64, item67, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario71 = emprestimo70.getDonoDoItem();
        int int72 = emprestimo70.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie74 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean75 = emprestimo70.equals((java.lang.Object) episodioSerie74);
        lp2.projetofinal.entidades.Usuario usuario76 = emprestimo70.getDonoDoItem();
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme83 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str84 = bluRayFilme83.getGenero();
        int int85 = bluRayFilme83.getAnoLancamento();
        // The following exception was thrown during execution in test generation
        try {
            int int88 = controllerEmprestimos0.devolverItem(usuario49, usuario76, (lp2.projetofinal.entidades.Item) bluRayFilme83, "COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Caloteiro" + "'", str66, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(usuario76);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "OUTRO" + "'", str84, "OUTRO");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str4 = jogoEletronico3.getPlataforma();
        lp2.projetofinal.facade.Facade facade5 = new lp2.projetofinal.facade.Facade();
        facade5.fecharSistema();
        java.lang.String str8 = facade5.listarEmprestimosItem("OUTRO");
        facade5.resetarPersistencia();
        java.lang.String str10 = facade5.listarTop10Itens();
        boolean boolean11 = jogoEletronico3.equals((java.lang.Object) facade5);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos12 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie20 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str22 = bluRaySerie20.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos23 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow30 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay31 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean32 = bluRayShow30.equals((java.lang.Object) classificacaoBluRay31);
        bluRayShow30.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow42 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str43 = bluRayShow42.getNome();
        int int44 = ordenaItemNumeroEmprestimos23.compare((lp2.projetofinal.entidades.Item) bluRayShow30, (lp2.projetofinal.entidades.Item) bluRayShow42);
        int int45 = ordenaItemNumeroEmprestimos12.compare((lp2.projetofinal.entidades.Item) bluRaySerie20, (lp2.projetofinal.entidades.Item) bluRayShow42);
        boolean boolean46 = jogoEletronico3.equals((java.lang.Object) int45);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OUTRO" + "'", str4, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay31 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay31.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Caloteiro" + "'", str43, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Caloteiro, Nenhum emprestimos associados ao item, ");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", (double) ' ', (-18), "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet28 = usuario14.retornaSeusItens();
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos29 = new lp2.projetofinal.controllers.ControllerEmprestimos();
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
        usuario44.atualizaReputacao((double) (-1), true);
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
        usuario68.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.entidades.BluRayShow bluRayShow84 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str85 = bluRayShow84.getNomeArtista();
        controllerEmprestimos29.registrarEmprestimo(usuario44, usuario68, (lp2.projetofinal.entidades.Item) bluRayShow84, "Caloteiro", (int) (byte) 100);
        int int89 = usuario14.compareTo(usuario68);
        usuario14.setTelefone("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro" + "'", str46, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Caloteiro" + "'", str70, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str85, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.lang.String str33 = controllerItens0.getInfoItem(itemSet26, "Nao emprestado", "POLICIAL");
        lp2.projetofinal.controllers.ControllerItens controllerItens34 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray35 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet36 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet36, itemArray35);
        controllerItens34.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet36, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario41 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str42 = controllerUsuario41.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet43 = controllerUsuario41.todosUsuariosItens();
        controllerItens34.adicionaItem(itemSet43, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens51 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray52 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet53 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet53, itemArray52);
        controllerItens51.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet53, "Caloteiro", (-1.0d));
        java.lang.String str58 = controllerItens34.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet53);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet53, "BomAmigo", (double) (byte) 10, (int) (short) 100, (int) (short) 1, "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "MUSICAL");
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
        lp2.projetofinal.entidades.Usuario usuario87 = emprestimo86.getDonoDoItem();
        int int88 = emprestimo86.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie90 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean91 = emprestimo86.equals((java.lang.Object) episodioSerie90);
        int int92 = emprestimo86.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario93 = emprestimo86.getDonoDoItem();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet94 = usuario93.retornaSeusItens();
        java.lang.String str95 = controllerItens0.listarItensOrdenadosPorNome(itemSet94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(itemSet16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(itemSet43);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str58, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Caloteiro" + "'", str82, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 100 + "'", int92 == 100);
        org.junit.Assert.assertNotNull(usuario93);
        org.junit.Assert.assertNotNull(itemSet94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("POLICIAL", (double) 5, 14, "XBOX360", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", (int) (short) 10);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Lista de usuarios com reputacao negativa: ", "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens43 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray44 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet45 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet45, itemArray44);
        controllerItens43.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet45, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario50 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str51 = controllerUsuario50.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet52 = controllerUsuario50.todosUsuariosItens();
        controllerItens43.adicionaItem(itemSet52, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens36.adicionaItem(itemSet52, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario68 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str69 = controllerUsuario68.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet70 = controllerUsuario68.todosUsuariosItens();
        java.lang.String str71 = controllerItens36.listarItensOrdenadosPorValor(itemSet70);
        java.lang.String str72 = controllerItens0.listarItensOrdenadosPorValor(itemSet70);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario73 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str74 = controllerUsuario73.listarCaloteiros();
        java.lang.String str75 = controllerUsuario73.listarTop10MelhoresUsuarios();
        controllerUsuario73.carregaMapaUsuarios();
        java.lang.String str77 = controllerUsuario73.listarCaloteiros();
        java.lang.String str78 = controllerUsuario73.listarCaloteiros();
        java.lang.String str79 = controllerUsuario73.listarTop10MelhoresUsuarios();
        controllerUsuario73.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet81 = controllerUsuario73.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item83 = controllerItens0.identificaItem(itemSet81, "1: COMPLETO - Reputacao: 0,00|");
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
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(itemSet52);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(itemSet70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str74, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str77, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str78, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(itemSet81);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Nao emprestado", (double) (byte) 10, "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("DOZE_ANOS");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay1 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DOZE_ANOS + "'", classificacaoBluRay1.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DOZE_ANOS));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        int int68 = bluRaySerie41.getDuracao();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("OUTRO");
        java.lang.String str2 = plataformaJogoEletronico1.getPlataforma();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet2 = controllerUsuario0.todosUsuariosItens();
        controllerUsuario0.cadastrarUsuario("", "Caloteiro, OUTRO, ", "Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario9 = controllerUsuario0.identificaUsuario("FreeRyder", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(itemSet2);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        double double97 = usuario91.getReputacao();
        java.lang.String str98 = usuario91.getNome();
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
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Caloteiro" + "'", str98, "Caloteiro");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.fecharSistema();
        java.lang.String str8 = facade0.listarEmprestimosItem("COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("MUSICAL", "", "", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        java.lang.String str9 = sistema0.listarTop10Itens();
        java.lang.String str10 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario1 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str2 = controllerUsuario1.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet3 = controllerUsuario1.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet3, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = controllerItens0.getInfoItem(itemSet9, "1: Caloteiro, MUSICAL,  - Reputacao: 0,00|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Caloteiro, OUTRO, ", "OUTRO", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
            facade0.adicionarBluRay("Nao emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", 14);
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Caloteiro, MUSICAL, ", "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "Caloteiro, Nao emprestado, ", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("COMPLETO", "Caloteiro, Nenhum emprestimos associados ao item, ", "ROMANCE", "PC", "DEZESSEIS_ANOS", "", "1: ROMANCE - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("Nenhum item pego emprestado", (double) (short) 0, "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario1 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str2 = controllerUsuario1.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet3 = controllerUsuario1.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet3, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens7 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario8 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str9 = controllerUsuario8.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet10 = controllerUsuario8.todosUsuariosItens();
        controllerItens7.adicionaItem(itemSet10, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens14 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray15 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet16 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet16, itemArray15);
        controllerItens14.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet16, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario21 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str22 = controllerUsuario21.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet23 = controllerUsuario21.todosUsuariosItens();
        controllerItens14.adicionaItem(itemSet23, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario31 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str32 = controllerUsuario31.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet33 = controllerUsuario31.todosUsuariosItens();
        controllerItens14.adicionaItem(itemSet33, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente38 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario42 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str43 = usuario42.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario47 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int48 = ordenaUsuarioReputacaoCrescente38.compare(usuario42, usuario47);
        lp2.projetofinal.entidades.Usuario usuario52 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str53 = usuario52.getTelefone();
        java.lang.String str54 = usuario52.getNome();
        lp2.projetofinal.entidades.Item item55 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo58 = new lp2.projetofinal.entidades.Emprestimo(usuario47, usuario52, item55, "OUTRO", 100);
        java.lang.String str59 = usuario52.getNome();
        java.lang.String str60 = usuario52.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet61 = usuario52.retornaSeusItens();
        java.lang.String str62 = controllerItens14.listarTop10Itens(itemSet61);
        java.lang.String str63 = controllerItens7.listarTop10Itens(itemSet61);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario64 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario64.salvarMapaUsuarios();
        controllerUsuario64.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet70 = controllerUsuario64.todosUsuariosItens();
        java.lang.String str71 = controllerItens7.listarItensNaoEmprestados(itemSet70);
        java.lang.String str72 = controllerItens0.listarTop10Itens(itemSet70);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente73 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente74 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator75 = ordenaUsuarioReputacaoCrescente73.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente74);
        lp2.projetofinal.entidades.Usuario usuario79 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico81 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean82 = usuario79.equals((java.lang.Object) plataformaJogoEletronico81);
        lp2.projetofinal.entidades.Usuario usuario86 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str87 = usuario86.getTelefone();
        int int88 = ordenaUsuarioReputacaoCrescente73.compare(usuario79, usuario86);
        java.lang.String str89 = usuario86.getTelefone();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet90 = usuario86.retornaSeusItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio(itemSet90, "LIVRE", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(itemSet10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(itemSet23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(itemSet33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Caloteiro" + "'", str54, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Caloteiro" + "'", str59, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Caloteiro, OUTRO, " + "'", str60, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(itemSet70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(usuarioComparator75);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico81 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico81.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(itemSet90);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, MUSICAL, ", (double) 35);
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie4 = new lp2.projetofinal.entidades.EpisodioSerie((int) (short) 100);
        int int5 = episodioSerie4.getDuracao();
        boolean boolean6 = jogoTabuleiro2.equals((java.lang.Object) int5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        emprestimo23.setDataDevolucao("Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario25 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario25.salvarMapaUsuarios();
        controllerUsuario25.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario25.cadastrarUsuario("NINTENDO 3DS", "POLICIAL", "Nao emprestado");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet35 = controllerUsuario25.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet35, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = controllerItens0.listarItensOrdenadosPorValor(itemSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(itemSet20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|" + "'", str24, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemSet35);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("DOCUMENTARIO", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("", "XBOX360");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.pesquisarDetalhesItem("COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = sistema3.pesquisarDetalhesItem("DOCUMENTARIO", "Caloteiro, Nao emprestado, ", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("COMPLETO", 100.0d, "COMPLETO", (-11), "", "", 1);
        java.lang.String str8 = bluRaySerie7.getDescricao();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COMPLETO" + "'", str8, "COMPLETO");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str4 = facade0.listarItensEmprestados();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("1: Caloteiro - Reputacao: 0,00|", "Caloteiro", "1: Caloteiro - Reputacao: 0,00|", "DOCUMENTARIO", "Nenhum item pego emprestado", "DEZOITO_ANOS", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("Nenhum item emprestado");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("FreeRyder", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (double) 35, (int) (short) 10, "FreeRyder", "BomAmigo", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet3 = controllerUsuario0.todosUsuariosItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet4 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("BomAmigo", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
        org.junit.Assert.assertNotNull(itemSet4);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sistema0.getInfoItem("BomAmigo", "FreeRyder", "DOZE_ANOS", "1: ROMANCE - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        sistema0.cadastrarUsuario("Caloteiro, Nao emprestado, ", "1: Caloteiro - Reputacao: 0,00|", "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str13 = sistema3.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = sistema3.listarEmprestimosUsuarioEmprestando("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.cadastrarUsuario("COMPLETO", "ROMANCE", "");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet7 = controllerUsuario0.todosUsuariosItens();
        java.lang.String str8 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("DOZE_ANOS", "Caloteiro, MUSICAL, ", (double) 7, false);
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        int int12 = bluRaySerie7.getDuracao();
        int int13 = bluRaySerie7.getDuracao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("Nenhum item pego emprestado", "AVENTURA", "Nenhum item pego emprestado", (double) 100L, "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("Nenhum item pego emprestado", "DOCUMENTARIO", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente50 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente51 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator52 = ordenaUsuarioReputacaoCrescente50.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente51);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator53 = ordenaUsuarioReputacaoCrescente50.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente54 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente55 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator56 = ordenaUsuarioReputacaoCrescente54.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente55);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator57 = ordenaUsuarioReputacaoCrescente54.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator58 = ordenaUsuarioReputacaoCrescente54.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator59 = ordenaUsuarioReputacaoCrescente50.thenComparing(usuarioComparator58);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente60 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente61 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator62 = ordenaUsuarioReputacaoCrescente60.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente61);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator63 = usuarioComparator62.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator64 = usuarioComparator59.thenComparing(usuarioComparator62);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator65 = usuarioComparator64.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator66 = usuarioComparator65.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator67 = usuarioComparator48.thenComparing(usuarioComparator65);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator68 = usuarioComparator14.thenComparing(usuarioComparator65);
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
        org.junit.Assert.assertNotNull(usuarioComparator52);
        org.junit.Assert.assertNotNull(usuarioComparator53);
        org.junit.Assert.assertNotNull(usuarioComparator56);
        org.junit.Assert.assertNotNull(usuarioComparator57);
        org.junit.Assert.assertNotNull(usuarioComparator58);
        org.junit.Assert.assertNotNull(usuarioComparator59);
        org.junit.Assert.assertNotNull(usuarioComparator62);
        org.junit.Assert.assertNotNull(usuarioComparator63);
        org.junit.Assert.assertNotNull(usuarioComparator64);
        org.junit.Assert.assertNotNull(usuarioComparator65);
        org.junit.Assert.assertNotNull(usuarioComparator66);
        org.junit.Assert.assertNotNull(usuarioComparator67);
        org.junit.Assert.assertNotNull(usuarioComparator68);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
            sistema0.cadastrarBluRaySerie("DOZE_ANOS", "DOZE_ANOS", "hi!", 0.0d, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (int) (short) 1, "NINTENDO 3DS", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("MUSICAL", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum item pego emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("COMPLETO", 0.0d, (-1), "1: OUTRO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (int) (short) 10);
        double double7 = bluRayShow6.getPreco();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario60.verificaFidelidadeUsuario("NINTENDO 3DS", "COMPLETO");
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
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        boolean boolean1 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean2 = cartaoFreeRyder0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        java.lang.String str9 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("JOGO DE TABULEIRO: Noob, R$ 0.0, Nao emprestado, COM PECAS PERDIDAS", "OUTRO", "LIVRE", (double) 64, 35, "COM PECAS PERDIDAS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        double double59 = usuario9.getReputacao();
        java.lang.String str60 = usuario9.getNome();
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
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Caloteiro" + "'", str60, "Caloteiro");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        java.lang.String str2 = plataformaJogoEletronico1.getPlataforma();
        java.lang.String str3 = plataformaJogoEletronico1.getPlataforma();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUTRO" + "'", str2, "OUTRO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OUTRO" + "'", str3, "OUTRO");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("Caloteiro, OUTRO, ", "Noob");
        bluRaySerie7.itemDevolvido();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("BomAmigo");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "PS3");
        java.lang.String str3 = chaveNomeTelefone2.getTelefone();
        java.lang.String str4 = chaveNomeTelefone2.getTelefone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PS3" + "'", str3, "PS3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PS3" + "'", str4, "PS3");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario7 = controllerUsuario0.identificaUsuario("Nao emprestado", "DEZESSEIS_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        java.lang.String str17 = sistema3.listarEmprestimosItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            sistema3.cadastrarBluRayFilme("MUSICAL", "BomAmigo", "1: Nenhum emprestimos associados ao item - Reputacao: 0,00|", 10.0d, (-15), "DEZOITO_ANOS", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str17, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.String str26 = usuario25.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Caloteiro" + "'", str26, "Caloteiro");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        int int20 = bluRaySerie16.getNumeroTemporada();
        bluRaySerie16.atualizar("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "DOCUMENTARIO");
        java.lang.Object obj24 = null;
        boolean boolean25 = bluRaySerie16.equals(obj24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-11) + "'", int19 == (-11));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        // The following exception was thrown during execution in test generation
        try {
            facade12.adicionarPecaPerdida("QUATORZE_ANOS", "COM PECAS PERDIDAS", "OUTRO", "PC");
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
    }
}

