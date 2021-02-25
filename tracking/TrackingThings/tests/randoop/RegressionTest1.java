import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        double double14 = jogoTabuleiro3.getPreco();
        jogoTabuleiro3.itemDevolvido();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("QUATORZE_ANOS", "hi!", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: OUTRO - Reputacao: 0,00|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("hi!", "QUATORZE_ANOS", "COMPLETO", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("MUSICAL", "Lista de usuarios com reputacao negativa: ", "OUTRO");
        usuario3.setEmail("Nao emprestado");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("PC", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa(35);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioEmprestando("COMPLETO", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sistema0.getInfoItem("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Emprestado", "Caloteiro", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo(7);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("DOZE_ANOS", "PC", "Lista de usuarios com reputacao negativa: ", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.listarEmprestimosUsuarioPegandoEmprestado("Caloteiro", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "DOZE_ANOS", "Nenhum item emprestado", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sistema0.pesquisarDetalhesItem("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("Emprestado", "", "Emprestado", "Caloteiro", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Nenhum emprestimos associados ao item", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        facade0.fecharSistema();
        java.lang.String str7 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("Emprestado", "Caloteiro, MUSICAL, ", "Nenhum item pego emprestado", "Emprestado", "MUSICAL", "OUTRO", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "1: ROMANCE - Reputacao: 0,00|", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str6 = facade0.listarEmprestimosItem("Noob");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("", "Caloteiro", "ROMANCE", (double) 100, "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("DOZE_ANOS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "QUATORZE_ANOS", "ROMANCE", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Lista de usuarios com reputacao negativa: ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("FreeRyder", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        int int9 = bluRayFilme6.getNumeroEmprestimos();
        bluRayFilme6.setNome("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OUTRO" + "'", str8, "OUTRO");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = facade0.listarEmprestimosUsuarioEmprestando("Noob", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str7 = bluRayShow6.getNome();
        bluRayShow6.setPreco((double) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Caloteiro" + "'", str7, "Caloteiro");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        lp2.projetofinal.entidades.Usuario usuario55 = emprestimo54.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario56 = emprestimo54.getUsuarioRequerente();
        usuario56.setEmail("Nao emprestado");
        int int59 = usuario30.compareTo(usuario56);
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
        lp2.projetofinal.entidades.Usuario usuario81 = emprestimo80.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro82 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario81.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro82);
        java.lang.String str84 = cartaoCaloteiro82.getNomeCartao();
        int int85 = cartaoCaloteiro82.prazoEmprestimo();
        java.lang.String str86 = cartaoCaloteiro82.getNomeCartao();
        usuario30.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro82);
        java.lang.String str88 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario30);
        java.lang.String str89 = usuario30.getEmail();
        usuario30.atualizaReputacao((double) (-1L), true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OUTRO" + "'", str25, "OUTRO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Nenhum item emprestado" + "'", str26, "Nenhum item emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico32 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico32.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Caloteiro" + "'", str50, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario55);
        org.junit.Assert.assertNotNull(usuario56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Caloteiro" + "'", str76, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Caloteiro" + "'", str84, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Caloteiro" + "'", str86, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Nenhum item emprestado" + "'", str88, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "OUTRO" + "'", str89, "OUTRO");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = controllerUsuario0.getInfoUsuario("PC", "Emprestado", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo((int) (byte) 10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("PC", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        java.lang.String str9 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.getInfoUsuario("Caloteiro, OUTRO, ", "PC", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("Nenhum item emprestado");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet4 = controllerUsuario0.retornaUsuarioItens("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro38 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int39 = cartaoCaloteiro38.prazoEmprestimo();
        boolean boolean40 = cartaoCaloteiro38.permisaoPegarEmprestado();
        boolean boolean41 = bluRaySerie8.equals((java.lang.Object) boolean40);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "COMPLETO" + "'", str37, "COMPLETO");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente2 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = ordenaUsuarioReputacaoCrescente1.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente2);
        lp2.projetofinal.entidades.Usuario usuario7 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico9 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean10 = usuario7.equals((java.lang.Object) plataformaJogoEletronico9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        int int16 = ordenaUsuarioReputacaoCrescente1.compare(usuario7, usuario14);
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
        lp2.projetofinal.entidades.Usuario usuario38 = emprestimo37.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro39 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario38.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro39);
        java.lang.String str41 = cartaoCaloteiro39.getNomeCartao();
        boolean boolean42 = cartaoCaloteiro39.permisaoPegarEmprestado();
        usuario14.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro39);
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
        lp2.projetofinal.entidades.Usuario usuario65 = emprestimo64.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro66 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario65.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro66);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo69 = controllerEmprestimos0.identificaEmprestimo(usuario14, usuario65, "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico9 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico9.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Caloteiro" + "'", str33, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Caloteiro" + "'", str60, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario65);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario6 = controllerUsuario0.identificaUsuario("POLICIAL", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("Noob", "Lista de usuarios com reputacao negativa: ", "1:  - Reputacao: 0,00|", (double) (byte) 100, "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("1: OUTRO - Reputacao: 0,00|", "Caloteiro, OUTRO, ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("Nenhum item pego emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Noob", (double) (byte) -1, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (int) (short) 1, "FreeRyder", "Nenhum emprestimos associados ao item", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, Nao emprestado, ", "ROMANCE", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente();
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
        lp2.projetofinal.entidades.Usuario usuario50 = emprestimo49.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario51 = emprestimo49.getUsuarioRequerente();
        int int52 = usuario15.compareTo(usuario51);
        lp2.projetofinal.entidades.Usuario usuario53 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int54 = ordenaUsuarioReputacaoDecrescente0.compare(usuario15, usuario53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Caloteiro" + "'", str45, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario50);
        org.junit.Assert.assertNotNull(usuario51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "hi!", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Emprestado", (double) 10, (-1), "NINTENDO 3DS", "Caloteiro, Nenhum emprestimos associados ao item, ", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.listarEmprestimosUsuarioEmprestando("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, Nenhum emprestimos associados ao item, ");
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("POLICIAL", "DOZE_ANOS", "NINTENDO 3DS", "Caloteiro, MUSICAL, ", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("PC");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet36 = controllerUsuario29.retornaUsuarioItens("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarUsuario("1: ROMANCE - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("DOZE_ANOS", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa(5);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        lp2.projetofinal.entidades.Usuario usuario55 = emprestimo54.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario56 = emprestimo54.getUsuarioRequerente();
        usuario56.setEmail("Nao emprestado");
        int int59 = usuario30.compareTo(usuario56);
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
        lp2.projetofinal.entidades.Usuario usuario81 = emprestimo80.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro82 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario81.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro82);
        java.lang.String str84 = cartaoCaloteiro82.getNomeCartao();
        int int85 = cartaoCaloteiro82.prazoEmprestimo();
        java.lang.String str86 = cartaoCaloteiro82.getNomeCartao();
        usuario30.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro82);
        java.lang.String str88 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario30);
        java.lang.String str89 = usuario30.getEmail();
        java.lang.String str90 = usuario30.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OUTRO" + "'", str25, "OUTRO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Nenhum item emprestado" + "'", str26, "Nenhum item emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico32 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico32.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Caloteiro" + "'", str50, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario55);
        org.junit.Assert.assertNotNull(usuario56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Caloteiro" + "'", str76, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Caloteiro" + "'", str84, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Caloteiro" + "'", str86, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Nenhum item emprestado" + "'", str88, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "OUTRO" + "'", str89, "OUTRO");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Caloteiro, OUTRO, " + "'", str90, "Caloteiro, OUTRO, ");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "", (double) (-1L), "1: OUTRO - Reputacao: 0,00|", (int) (short) -1, "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "ROMANCE", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        int int12 = bluRaySerie7.getNumeroEmprestimos();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Caloteiro" + "'", str10, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Noob" + "'", str11, "Noob");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("DOZE_ANOS");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.listarEmprestimosUsuarioEmprestando("Nenhum item emprestado", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "hi!", "Nao emprestado", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("Caloteiro, OUTRO, ", "DOZE_ANOS", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        java.lang.String str4 = usuario3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str4, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.pesquisarDetalhesItem("Lista de usuarios com reputacao negativa: ", "AVENTURA", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 7, "Nenhum item pego emprestado", "Nenhum item pego emprestado", (int) (short) -1);
        bluRayShow6.setNome("BomAmigo");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarCaloteiros();
        java.lang.String str6 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.pesquisarDetalhesItem("hi!", "DOZE_ANOS", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("NINTENDO 3DS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "PC", "hi!", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        java.lang.String str55 = usuario53.getNome();
        double double56 = usuario53.getReputacao();
        lp2.projetofinal.entidades.Usuario usuario60 = new lp2.projetofinal.entidades.Usuario("Caloteiro, OUTRO, ", "Nenhum item pego emprestado", "Caloteiro");
        java.lang.String str61 = usuario60.toString();
        lp2.projetofinal.entidades.BluRayShow bluRayShow68 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        bluRayShow68.atualizaNumeroEmprestimos();
        // The following exception was thrown during execution in test generation
        try {
            int int72 = controllerEmprestimos0.devolverItem(usuario53, usuario60, (lp2.projetofinal.entidades.Item) bluRayShow68, "Caloteiro", "Caloteiro");
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Caloteiro" + "'", str55, "Caloteiro");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro" + "'", str61, "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Nao emprestado", "Nenhum item pego emprestado", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str2 = controllerEmprestimos0.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos3 = new lp2.projetofinal.controllers.ControllerEmprestimos();
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
        usuario18.atualizaReputacao((double) (-1), true);
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
        usuario42.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.entidades.BluRayShow bluRayShow58 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str59 = bluRayShow58.getNomeArtista();
        controllerEmprestimos3.registrarEmprestimo(usuario18, usuario42, (lp2.projetofinal.entidades.Item) bluRayShow58, "Caloteiro", (int) (byte) 100);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente63 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario67 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str68 = usuario67.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario72 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int73 = ordenaUsuarioReputacaoCrescente63.compare(usuario67, usuario72);
        lp2.projetofinal.entidades.Usuario usuario77 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str78 = usuario77.getTelefone();
        java.lang.String str79 = usuario77.getNome();
        lp2.projetofinal.entidades.Item item80 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo83 = new lp2.projetofinal.entidades.Emprestimo(usuario72, usuario77, item80, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario84 = emprestimo83.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario85 = emprestimo83.getUsuarioRequerente();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo87 = controllerEmprestimos0.identificaEmprestimo(usuario18, usuario85, "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str59, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Caloteiro" + "'", str79, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario84);
        org.junit.Assert.assertNotNull(usuario85);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("AVENTURA", "PC", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("ROMANCE", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Nenhum emprestimos associados ao item", 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro, MUSICAL, ", "Lista de usuarios com reputacao negativa: ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) 100, "DOZE_ANOS", (int) '4', "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "1: OUTRO - Reputacao: 0,00|", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = emprestimo52.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet6 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario0.retornaUsuarioItens("Caloteiro, Nenhum emprestimos associados ao item, ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemSet6);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
            java.lang.String str13 = facade0.getInfoUsuario("Emprestado", "", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("hi!", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("NINTENDO 3DS", "", "Caloteiro", 1.0d, (int) (short) -1, (int) (short) -1, "Nenhum item emprestado", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.String str90 = controllerUsuario89.listarCaloteiros();
        java.lang.String str91 = controllerUsuario89.listarTop10MelhoresUsuarios();
        controllerUsuario89.carregaMapaUsuarios();
        java.lang.String str93 = controllerUsuario89.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet94 = controllerUsuario89.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet94, "DOZE_ANOS", (double) 100.0f);
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str90, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(itemSet94);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("NINTENDO 3DS", "BomAmigo", "FreeRyder", (double) (byte) -1, 0, "", "Caloteiro", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator48 = ordenaUsuarioReputacaoCrescente0.thenComparing(usuarioComparator47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("BomAmigo", "QUATORZE_ANOS", "Caloteiro, Nenhum emprestimos associados ao item, ", (double) 100.0f, "COMPLETO", (int) (short) 100, "Caloteiro", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens53 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray54 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet55 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet55, itemArray54);
        controllerItens53.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet55, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario60 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str61 = controllerUsuario60.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet62 = controllerUsuario60.todosUsuariosItens();
        controllerItens53.adicionaItem(itemSet62, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens70 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray71 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet72 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet72, itemArray71);
        controllerItens70.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet72, "Caloteiro", (-1.0d));
        java.lang.String str77 = controllerItens53.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet72);
        lp2.projetofinal.entidades.Item item79 = controllerItens32.identificaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet72, "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet72, "DOZE_ANOS", (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(itemSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(itemSet62);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str77, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(item79);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        sistema0.cadastrarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DOZE_ANOS", "Caloteiro, Nao emprestado, ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("Nenhum item pego emprestado", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Noob", (double) 35, (int) (short) 0, 100, "Caloteiro, MUSICAL, ", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.getInfoUsuario("Nenhum item pego emprestado", "NINTENDO 3DS", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo(5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "POLICIAL", "Nenhum item emprestado", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
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
        lp2.projetofinal.entidades.Usuario usuario22 = emprestimo21.getDonoDoItem();
        int int23 = emprestimo21.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie25 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean26 = emprestimo21.equals((java.lang.Object) episodioSerie25);
        int int27 = emprestimo21.getNumeroDias();
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie58 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str60 = bluRaySerie58.getInfo("Nao emprestado");
        boolean boolean61 = emprestimo48.equals((java.lang.Object) "Nao emprestado");
        // The following exception was thrown during execution in test generation
        try {
            int int62 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo21, emprestimo48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario49);
        org.junit.Assert.assertNotNull(usuario50);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str63 = usuario62.getTelefone();
        java.lang.String str64 = usuario62.getNome();
        java.lang.String str65 = usuario62.toString();
        lp2.projetofinal.entidades.Emprestimo emprestimo67 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario62, "QUATORZE_ANOS");
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Caloteiro" + "'", str64, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Caloteiro, OUTRO, " + "'", str65, "Caloteiro, OUTRO, ");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((int) '#');
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        boolean boolean3 = cartaoNoob0.permisaoPegarEmprestado();
        int int4 = cartaoNoob0.prazoEmprestimo();
        boolean boolean5 = cartaoNoob0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("FreeRyder", "POLICIAL", "POLICIAL", "Nenhum item emprestado", "Caloteiro", "1: ROMANCE - Reputacao: 0,00|", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.getInfoUsuario("Caloteiro, MUSICAL, ", "Nenhum emprestimos associados ao item", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico0 = lp2.projetofinal.enums.PlataformaJogoEletronico.PS3;
        java.lang.String str1 = plataformaJogoEletronico0.getPlataforma();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico0 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.PS3 + "'", plataformaJogoEletronico0.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.PS3));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PS3" + "'", str1, "PS3");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario4 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str5 = usuario4.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int10 = ordenaUsuarioReputacaoCrescente0.compare(usuario4, usuario9);
        java.lang.String str11 = usuario4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Caloteiro, OUTRO, " + "'", str11, "Caloteiro, OUTRO, ");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("Noob", "COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Caloteiro, Nenhum emprestimos associados ao item, ", "Caloteiro, Nenhum emprestimos associados ao item, ", "", 0.0d, "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("QUATORZE_ANOS");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        sistema3.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.removerItem("Lista de usuarios com reputacao negativa: ", "DOZE_ANOS", "Caloteiro, OUTRO, ");
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario8.atualizarUsuario("Nenhum item emprestado", "Caloteiro", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.List<lp2.projetofinal.entidades.Emprestimo> emprestimoList0 = null;
        lp2.projetofinal.persistencia.Persistencia.salvarEmprestimos(emprestimoList0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("DOZE_ANOS");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("1:  - Reputacao: 0,00|");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        java.lang.String str4 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.pesquisarDetalhesItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Nenhum emprestimos associados ao item", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        int int3 = cartaoNoob0.prazoEmprestimo();
        int int4 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(1);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarCaloteiros();
        java.lang.String str26 = controllerUsuario24.listarTop10MelhoresUsuarios();
        controllerUsuario24.carregaMapaUsuarios();
        java.lang.String str28 = controllerUsuario24.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet29 = controllerUsuario24.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet29, "BomAmigo", "POLICIAL");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str25, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(itemSet29);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("Caloteiro, Nenhum emprestimos associados ao item, ");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.getInfoUsuario("", "XBOX360", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoItem("Caloteiro, Nao emprestado, ", "DOZE_ANOS", "", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario14 = controllerUsuario8.identificaUsuario("1:  - Reputacao: 0,00|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario33 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario33.salvarMapaUsuarios();
        controllerUsuario33.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario33.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet40 = controllerUsuario33.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet40, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
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
        org.junit.Assert.assertNotNull(itemSet40);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        sistema0.cadastrarUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("Caloteiro", "1: ROMANCE - Reputacao: 0,00|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '#', 35, (int) 'a', "XBOX360", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("FreeRyder", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: ROMANCE - Reputacao: 0,00|", (double) (-11), (int) '#', (int) (byte) -1, "Noob", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        int int10 = bluRaySerie7.getDuracao();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        java.lang.String str13 = bluRaySerie7.getInfo("DOZE_ANOS");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str11, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        controllerUsuario32.salvarMapaUsuarios();
        controllerUsuario32.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet38 = controllerUsuario32.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet38, "ROMANCE");
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
        org.junit.Assert.assertNotNull(itemSet38);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("", "Nenhum item pego emprestado");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens42 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray43 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet44 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet44, itemArray43);
        controllerItens42.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet44, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario49 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str50 = controllerUsuario49.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet51 = controllerUsuario49.todosUsuariosItens();
        controllerItens42.adicionaItem(itemSet51, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario59 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str60 = controllerUsuario59.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet61 = controllerUsuario59.todosUsuariosItens();
        controllerItens42.adicionaItem(itemSet61, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str66 = controllerItens25.listarItensNaoEmprestados(itemSet61);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet61, "Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
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
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(itemSet51);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(itemSet61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str66, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens69 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray70 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet71 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet71, itemArray70);
        controllerItens69.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet71, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario76 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str77 = controllerUsuario76.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet78 = controllerUsuario76.todosUsuariosItens();
        controllerItens69.adicionaItem(itemSet78, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario86 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str87 = controllerUsuario86.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet88 = controllerUsuario86.todosUsuariosItens();
        controllerItens69.adicionaItem(itemSet88, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str95 = controllerItens0.getInfoItem(itemSet88, "Nenhum emprestimos associados ao item", "Caloteiro, Nenhum emprestimos associados ao item, ");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(itemSet33);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(itemSet60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str65, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(itemSet78);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(itemSet88);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Nenhum item emprestado", "BomAmigo", (double) (byte) 0, "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet38 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionaItem(itemSet38, "BomAmigo", (double) (short) 1, "");
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
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = emprestimo20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str14 = bluRayShow6.getNome();
        bluRayShow6.itemEmprestado();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OUTRO" + "'", str14, "OUTRO");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("1: ROMANCE - Reputacao: 0,00|", "QUATORZE_ANOS", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facade0.pesquisarDetalhesItem("FreeRyder", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("Nao emprestado");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str58 = usuario57.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo60 = new lp2.projetofinal.entidades.Emprestimo(usuario47, usuario57, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet61 = usuario47.retornaSeusItens();
        controllerItens32.adicionaItem(itemSet61, "", 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet61, "Caloteiro");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Caloteiro" + "'", str49, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(itemSet61);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPecaVaziaNula("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Peca nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        java.lang.String str1 = cartaoNoob0.getNomeCartao();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Noob" + "'", str1, "Noob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioPegandoEmprestado("ROMANCE", "DOZE_ANOS");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioPegandoEmprestado("Nenhum emprestimos associados ao item", "1: Caloteiro - Reputacao: 0,00|");
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("", "Lista de usuarios com reputacao negativa: ", "Lista de usuarios com reputacao negativa: ", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.itemDevolvido();
        bluRayShow6.setPreco((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Caloteiro" + "'", str12, "Caloteiro");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(14);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoUsuario("Nenhum item emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        emprestimo80.setDataDevolucao("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
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
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("Lista de usuarios com reputacao negativa: ", "Lista de usuarios com reputacao negativa: ", "1:  - Reputacao: 0,00|", "MUSICAL", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("OUTRO", "1:  - Reputacao: 0,00|", "FreeRyder", (double) (short) 100, "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("MUSICAL");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet7 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario10 = controllerUsuario0.identificaUsuario("1: OUTRO - Reputacao: 0,00|", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemSet7);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("Emprestado", "", "PS3", "Nao emprestado", "Lista de usuarios com reputacao negativa: ", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet6 = controllerUsuario0.retornaUsuarioItens("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        facade0.fecharSistema();
        java.lang.String str7 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facade0.getInfoItem("XBOX360", "", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Lista de usuarios com reputacao negativa: ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) (-11), "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario7 = controllerUsuario0.identificaUsuario("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet32 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionaItem(itemSet32, "Nenhum item pego emprestado", (double) (-1L), "ROMANCE");
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
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
            controllerItens0.adicionaItem(itemSet36, "FreeRyder", (double) (-18), (int) (byte) 0, 0, "hi!", "");
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa(10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facade0.pesquisarDetalhesItem("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "PC", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = controllerItens0.getInfoItem(itemSet1, "MUSICAL", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) (byte) 0, 10, 5, "Caloteiro, Nao emprestado, ", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade22 = usuario21.getCartao();
        int int23 = cartaoFidelidade22.prazoEmprestimo();
        java.lang.String str24 = cartaoFidelidade22.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertNotNull(cartaoFidelidade22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "FreeRyder" + "'", str24, "FreeRyder");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
            facade0.registrarEmprestimo("", "", "COMPLETO", "POLICIAL", "", "Emprestado", (-1));
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "PS3", "NINTENDO 3DS", "1: ROMANCE - Reputacao: 0,00|", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = facade0.listarEmprestimosUsuarioPegandoEmprestado("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarUsuario("", "Caloteiro, Nao emprestado, ", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("POLICIAL", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("QUATORZE_ANOS", "Caloteiro, Nao emprestado, ", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioEmprestando("1:  - Reputacao: 0,00|", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("Noob", "", "hi!", "COMPLETO", "Caloteiro, Nenhum emprestimos associados ao item, ", "XBOX360", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        bluRayShow19.atualizar("BomAmigo", "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay8 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay8.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet7 = controllerUsuario0.retornaUsuarioItens("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: ROMANCE - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) '4');
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("COMPLETO", "FreeRyder", "PS3", (double) (short) -1, "Emprestado", 0, "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "NINTENDO 3DS", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa(7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("Nenhum item pego emprestado", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("XBOX360", "DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("COMPLETO", "Nao emprestado", "Nenhum emprestimos associados ao item", (double) 100.0f, "Caloteiro", (int) (short) 1, "Lista de usuarios com reputacao negativa: ", "ROMANCE", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = controllerUsuario0.getInfoUsuario("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        usuario48.setEmail("Caloteiro");
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
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("hi!", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "", (double) 1.0f, "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str6 = facade0.listarEmprestimosItem("Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro", (double) (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
            java.lang.String str19 = sistema3.pesquisarDetalhesItem("XBOX360", "Caloteiro", "Nenhum emprestimos associados ao item");
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
            java.lang.String str15 = sistema0.getInfoItem("XBOX360", "1: ROMANCE - Reputacao: 0,00|", "Caloteiro", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("1: Caloteiro - Reputacao: 0,00|", "Noob", "", (double) (byte) -1, (-37), 1, "Caloteiro, OUTRO, ", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("OUTRO", "BomAmigo", "Lista de usuarios com reputacao negativa: ", (double) (-18), (int) (short) 1, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Nenhum item emprestado", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        jogoTabuleiro2.setPreco((double) (short) 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = emprestimo20.toString();
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
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.AVENTURA;
        java.lang.String str1 = generoBluRay0.getGenero();
        java.lang.String str2 = generoBluRay0.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.AVENTURA + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.AVENTURA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVENTURA" + "'", str1, "AVENTURA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVENTURA" + "'", str2, "AVENTURA");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Caloteiro, OUTRO, ");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("AVENTURA", "1: ROMANCE - Reputacao: 0,00|", "Caloteiro, MUSICAL, ");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str6 = facade0.listarEmprestimosItem("Noob");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoUsuario("MUSICAL", "Caloteiro, OUTRO, ", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str6, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "1: Caloteiro - Reputacao: 0,00|", "Nenhum item emprestado", (double) '#', 5, (-15), "Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Numero faixas invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.getInfoItem("Caloteiro, Nao emprestado, ", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "XBOX360", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        java.lang.String str9 = bluRaySerie7.getGenero();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ROMANCE" + "'", str8, "ROMANCE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro, Nenhum emprestimos associados ao item, ", "hi!", "PS3", (double) 1L, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (int) (byte) 100, "Emprestado", "OUTRO", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.cadastrarUsuario("Caloteiro, OUTRO, ", "1: ROMANCE - Reputacao: 0,00|", "1: ROMANCE - Reputacao: 0,00|");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("Nenhum emprestimos associados ao item", "Caloteiro, Nenhum emprestimos associados ao item, ", "", "1:  - Reputacao: 0,00|", "QUATORZE_ANOS", "BomAmigo", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("AVENTURA", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", (double) (byte) 0, "hi!", 7, "1: Caloteiro - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("Caloteiro, MUSICAL, ");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) (short) 100);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario5 = controllerUsuario0.identificaUsuario("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str2 = controllerEmprestimos0.listarEmprestimosItens("Nenhum emprestimos associados ao item");
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
        java.lang.String str24 = usuario17.getNome();
        usuario17.setEmail("MUSICAL");
        java.lang.String str27 = usuario17.toString();
        usuario17.setNome("Nenhum item pego emprestado");
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
        java.lang.String str51 = usuario44.getNome();
        java.lang.String str52 = usuario44.toString();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet53 = usuario44.retornaSeusItens();
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        usuario57.setTelefone("FreeRyder");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico63 = new lp2.projetofinal.entidades.JogoEletronico("DOZE_ANOS", (double) (short) 10, "OUTRO");
        java.lang.String str64 = jogoEletronico63.getPlataforma();
        lp2.projetofinal.entidades.Emprestimo emprestimo67 = new lp2.projetofinal.entidades.Emprestimo(usuario44, usuario57, (lp2.projetofinal.entidades.Item) jogoEletronico63, "COMPLETO", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo69 = controllerEmprestimos0.identificaEmprestimo(usuario17, usuario44, "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Caloteiro" + "'", str24, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Caloteiro, MUSICAL, " + "'", str27, "Caloteiro, MUSICAL, ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro" + "'", str46, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Caloteiro" + "'", str51, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Caloteiro, OUTRO, " + "'", str52, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet53);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "OUTRO" + "'", str64, "OUTRO");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("1:  - Reputacao: 0,00|", "Nao emprestado", "FreeRyder", (double) (byte) 1, "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens63 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario64 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str65 = controllerUsuario64.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet66 = controllerUsuario64.todosUsuariosItens();
        controllerItens63.adicionaItem(itemSet66, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens70 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray71 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet72 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet72, itemArray71);
        controllerItens70.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet72, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario77 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str78 = controllerUsuario77.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet79 = controllerUsuario77.todosUsuariosItens();
        controllerItens70.adicionaItem(itemSet79, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario87 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str88 = controllerUsuario87.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet89 = controllerUsuario87.todosUsuariosItens();
        controllerItens70.adicionaItem(itemSet89, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str96 = controllerItens63.getInfoItem(itemSet89, "Nao emprestado", "POLICIAL");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item98 = controllerItens0.identificaItem(itemSet89, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(itemSet66);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(itemSet79);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(itemSet89);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.lang.Class<?> wildcardClass25 = emprestimo20.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        usuario56.setTelefone("1: Caloteiro - Reputacao: 0,00|");
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (double) (-15), 52, "1:  - Reputacao: 0,00|", "QUATORZE_ANOS", 1);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str7 = bluRayShow6.getNomeArtista();
        java.lang.String str9 = bluRayShow6.getInfo("Nao emprestado");
        bluRayShow6.atualizar("BomAmigo", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        boolean boolean24 = emprestimo22.equals((java.lang.Object) (-1.0f));
        int int25 = emprestimo22.getNumeroDias();
        lp2.projetofinal.entidades.Item item26 = emprestimo22.getItem();
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
        boolean boolean49 = emprestimo47.equals((java.lang.Object) (-1.0f));
        int int50 = emprestimo47.getNumeroDias();
        lp2.projetofinal.entidades.Item item51 = emprestimo47.getItem();
        emprestimo47.setDataDevolucao("Nenhum emprestimos associados ao item");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo22, emprestimo47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Caloteiro" + "'", str43, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNull(item51);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        java.lang.String str35 = bluRaySerie8.getDescricao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str35, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("", "1:  - Reputacao: 0,00|", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((int) (short) 100);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
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
        lp2.projetofinal.entidades.Emprestimo emprestimo59 = new lp2.projetofinal.entidades.Emprestimo(usuario36, usuario46, "Nenhum item pego emprestado");
        java.lang.String str60 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario46);
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "1: OUTRO - Reputacao: 0,00|", "hi!");
        java.lang.String str65 = usuario64.getTelefone();
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie94 = new lp2.projetofinal.entidades.BluRaySerie("COMPLETO", 100.0d, "COMPLETO", (-11), "", "", 1);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = controllerEmprestimos0.devolverItem(usuario64, usuario75, (lp2.projetofinal.entidades.Item) bluRaySerie94, "Nenhum emprestimos associados ao item", "1: ROMANCE - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Nenhum item pego emprestado" + "'", str32, "Nenhum item pego emprestado");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Nenhum item emprestado" + "'", str60, "Nenhum item emprestado");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Caloteiro" + "'", str82, "Caloteiro");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", 0.0d, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("QUATORZE_ANOS");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = emprestimo20.toString();
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
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        java.lang.String str75 = controllerUsuario74.listarTop10PioresUsuarios();
        java.lang.String str76 = controllerUsuario74.listarTop10PioresUsuarios();
        controllerUsuario74.salvarMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet78 = controllerUsuario74.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet78, "Caloteiro, MUSICAL, ", (double) (short) 0, 5, 5, "MUSICAL", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(itemSet78);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("DOZE_ANOS", "AVENTURA", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "DOZE_ANOS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Noob", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Nenhum item pego emprestado", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        java.lang.String str66 = bluRayShow62.getNomeArtista();
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str66, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("", "", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("Lista de usuarios com reputacao negativa: ", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.pesquisarDetalhesItem("Nao emprestado", "hi!", "1: Caloteiro - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        java.lang.String str76 = controllerEmprestimos0.listarEmprestimosItens("Emprestado");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("QUATORZE_ANOS");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Numero faixas invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("DOZE_ANOS", "Caloteiro", "hi!", (double) 'a', 0, "Caloteiro, OUTRO, ", "Nenhum emprestimos associados ao item", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.getInfoUsuario("PS3", "QUATORZE_ANOS", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("QUATORZE_ANOS", (double) 0.0f, "Noob");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sistema0.pesquisarDetalhesItem("", "Nenhum item emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("POLICIAL", "POLICIAL", "XBOX360", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Valor nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet14 = controllerUsuario8.retornaUsuarioItens("XBOX360", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("PS3");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("OUTRO", "1: ROMANCE - Reputacao: 0,00|", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("Caloteiro, Nenhum emprestimos associados ao item, ");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie27 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int28 = bluRaySerie27.getNumeroEmprestimos();
        int int29 = bluRaySerie27.duracaoTotal();
        int int30 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie27);
        java.lang.String str31 = bluRaySerie27.getNome();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OUTRO" + "'", str11, "OUTRO");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-11) + "'", int30 == (-11));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Noob" + "'", str31, "Noob");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        boolean boolean2 = cartaoNoob0.permisaoPegarEmprestado();
        int int3 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str4 = cartaoNoob0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Noob" + "'", str4, "Noob");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        usuario56.setNome("");
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("BomAmigo", "Caloteiro, MUSICAL, ", "Nenhum item emprestado", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("ROMANCE", "POLICIAL", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (double) (byte) -1, "Emprestado", (int) (short) -1, "MUSICAL", "1: Caloteiro - Reputacao: 0,00|", (-18));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        java.lang.String str5 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("Caloteiro", "Nao emprestado", "NINTENDO 3DS");
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = controllerUsuario0.getInfoUsuario("FreeRyder", "FreeRyder", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens1 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray2 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet3 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet3, itemArray2);
        controllerItens1.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet3, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario8 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str9 = controllerUsuario8.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet10 = controllerUsuario8.todosUsuariosItens();
        controllerItens1.adicionaItem(itemSet10, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens18 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray19 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet20 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet20, itemArray19);
        controllerItens18.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet20, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario25 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str26 = controllerUsuario25.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet27 = controllerUsuario25.todosUsuariosItens();
        controllerItens18.adicionaItem(itemSet27, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario35 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str36 = controllerUsuario35.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet37 = controllerUsuario35.todosUsuariosItens();
        controllerItens18.adicionaItem(itemSet37, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str42 = controllerItens1.listarItensNaoEmprestados(itemSet37);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet37, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(itemSet10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(itemSet37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str42, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, MUSICAL, ", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        controllerItens0.adicionaItem(itemSet50, "1: OUTRO - Reputacao: 0,00|", 0.0d, "OUTRO");
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
        usuario90.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet96 = usuario90.retornaSeusItens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str98 = controllerItens0.getDetalhesItem(itemSet96, "Lista de usuarios com reputacao negativa: ");
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Caloteiro" + "'", str82, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(itemSet96);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("Caloteiro");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
            java.lang.String str12 = facade0.pesquisarDetalhesItem("COMPLETO", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("1:  - Reputacao: 0,00|");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Nenhum item pego emprestado", "AVENTURA", (double) (short) -1, (int) '4', "FreeRyder", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("", "AVENTURA", "BomAmigo", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sistema0.listarEmprestimosUsuarioEmprestando("", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("Nao emprestado");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        facade0.cadastrarUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "XBOX360", "COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("Nenhum item pego emprestado", "", "Nenhum item pego emprestado", (-37));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "PC", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str2 = controllerEmprestimos0.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.entidades.Usuario usuario7 = new lp2.projetofinal.entidades.Usuario("Caloteiro, OUTRO, ", "Nenhum item pego emprestado", "Caloteiro");
        java.lang.String str8 = usuario7.toString();
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
        lp2.projetofinal.entidades.Usuario usuario33 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str34 = usuario33.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo36 = new lp2.projetofinal.entidades.Emprestimo(usuario23, usuario33, "1: OUTRO - Reputacao: 0,00|");
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
        int int60 = usuario23.compareTo(usuario59);
        lp2.projetofinal.entidades.BluRayShow bluRayShow67 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow67.setNome("Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            int int72 = controllerEmprestimos0.devolverItem(usuario7, usuario59, (lp2.projetofinal.entidades.Item) bluRayShow67, "OUTRO", "1: Caloteiro - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro" + "'", str8, "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Caloteiro" + "'", str25, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Caloteiro" + "'", str53, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario58);
        org.junit.Assert.assertNotNull(usuario59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("DOZE_ANOS", "", "POLICIAL", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        java.lang.String str9 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.pesquisarDetalhesItem("ROMANCE", "DOZE_ANOS", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("Caloteiro, MUSICAL, ", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet4 = controllerUsuario0.retornaUsuarioItens("", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente26 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente27 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator28 = ordenaUsuarioReputacaoCrescente26.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente27);
        lp2.projetofinal.entidades.Usuario usuario32 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico34 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean35 = usuario32.equals((java.lang.Object) plataformaJogoEletronico34);
        lp2.projetofinal.entidades.Usuario usuario39 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str40 = usuario39.getTelefone();
        int int41 = ordenaUsuarioReputacaoCrescente26.compare(usuario32, usuario39);
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos42 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str44 = controllerEmprestimos42.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos42.salvarListaEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente46 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario50 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str51 = usuario50.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario55 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int56 = ordenaUsuarioReputacaoCrescente46.compare(usuario50, usuario55);
        lp2.projetofinal.entidades.Usuario usuario60 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str61 = usuario60.getTelefone();
        java.lang.String str62 = usuario60.getNome();
        lp2.projetofinal.entidades.Item item63 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo66 = new lp2.projetofinal.entidades.Emprestimo(usuario55, usuario60, item63, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario67 = emprestimo66.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario68 = emprestimo66.getUsuarioRequerente();
        usuario68.setEmail("Nao emprestado");
        java.lang.String str71 = usuario68.toString();
        java.lang.String str72 = controllerEmprestimos42.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario68);
        lp2.projetofinal.entidades.Usuario usuario76 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        int int77 = ordenaUsuarioReputacaoCrescente26.compare(usuario68, usuario76);
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro78 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str79 = cartaoCaloteiro78.getNomeCartao();
        usuario68.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro78);
        boolean boolean81 = usuario25.equals((java.lang.Object) cartaoCaloteiro78);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertNotNull(usuarioComparator28);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico34 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico34.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str44, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Caloteiro" + "'", str62, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario67);
        org.junit.Assert.assertNotNull(usuario68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Caloteiro, Nao emprestado, " + "'", str71, "Caloteiro, Nao emprestado, ");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Nenhum item pego emprestado" + "'", str72, "Nenhum item pego emprestado");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Caloteiro" + "'", str79, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("Noob");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        usuario3.setTelefone("COMPLETO");
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
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico4 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str5 = jogoEletronico4.getPlataforma();
        java.lang.String str6 = jogoEletronico4.getPlataforma();
        jogoEletronico4.itemDevolvido();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro10 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        jogoTabuleiro10.adicionarPecaPerdida("Caloteiro, Nao emprestado, ");
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoEletronico4, (lp2.projetofinal.entidades.Item) jogoTabuleiro10);
        jogoTabuleiro10.adicionarPecaPerdida("Lista de usuarios com reputacao negativa: ");
        java.lang.String str16 = jogoTabuleiro10.contemPecasPerdidas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUTRO" + "'", str6, "OUTRO");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "COM PECAS PERDIDAS" + "'", str16, "COM PECAS PERDIDAS");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("Caloteiro, OUTRO, ");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "1:  - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("QUATORZE_ANOS");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade24 = usuario10.getCartao();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cartaoFidelidade24);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
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
        lp2.projetofinal.entidades.Usuario usuario22 = emprestimo21.getDonoDoItem();
        int int23 = emprestimo21.getNumeroDias();
        emprestimo21.setDataDevolucao("Nenhum emprestimos associados ao item");
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
        lp2.projetofinal.entidades.Usuario usuario47 = emprestimo46.getDonoDoItem();
        int int48 = emprestimo46.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie50 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean51 = emprestimo46.equals((java.lang.Object) episodioSerie50);
        int int52 = emprestimo46.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario53 = emprestimo46.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario54 = emprestimo46.getUsuarioRequerente();
        // The following exception was thrown during execution in test generation
        try {
            int int55 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo21, emprestimo46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Caloteiro" + "'", str42, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(usuario53);
        org.junit.Assert.assertNotNull(usuario54);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        facade0.cadastrarUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
        java.lang.String str9 = facade0.listarItensOrdenadosPorValor();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("", "1:  - Reputacao: 0,00|", "POLICIAL", (double) (byte) 0, 1, "NINTENDO 3DS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("FreeRyder");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario8 = controllerUsuario0.identificaUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("NINTENDO 3DS", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "", "ROMANCE", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        sistema0.finalizar();
        java.lang.String str9 = sistema0.listarTop10Itens();
        sistema0.inicializar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("COMPLETO", "POLICIAL", (double) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarCaloteiros();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        controllerUsuario0.salvarMapaUsuarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) (short) 1);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("ROMANCE");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        sistema0.cadastrarUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("1: Caloteiro - Reputacao: 0,00|", "BomAmigo", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        java.lang.String str9 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("OUTRO", "Caloteiro, Nenhum emprestimos associados ao item, ", "", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "Nenhum item emprestado", "Noob", (double) (-18), "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoUsuario("1: Caloteiro - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|", "Nenhum item emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((int) '#');
        int int2 = episodioSerie1.getDuracao();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        java.lang.String str6 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("Nao emprestado", "1:  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) 0L, (-4), (-37), "PS3", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        boolean boolean76 = emprestimo74.equals((java.lang.Object) (-1.0f));
        int int77 = emprestimo74.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario78 = emprestimo74.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario82 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico84 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean85 = usuario82.equals((java.lang.Object) plataformaJogoEletronico84);
        usuario82.setEmail("Nenhum emprestimos associados ao item");
        int int88 = ordenaUsuarioReputacaoCrescente53.compare(usuario78, usuario82);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet89 = usuario82.retornaSeusItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet89, "OUTRO", "1:  - Reputacao: 0,00|");
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Caloteiro" + "'", str70, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertNotNull(usuario78);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico84 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico84.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(itemSet89);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        java.lang.String str8 = sistema0.listarTop10Itens();
        java.lang.String str9 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Caloteiro, MUSICAL, ", "Lista de usuarios com reputacao negativa: ", "Emprestado", (double) (byte) 0, "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.toString();
        java.lang.String str5 = jogoEletronico3.getPlataforma();
        java.lang.String str6 = jogoEletronico3.getPlataforma();
        jogoEletronico3.atualizaNumeroEmprestimos();
        java.lang.Object obj8 = null;
        boolean boolean9 = jogoEletronico3.equals(obj8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUTRO" + "'", str6, "OUTRO");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "PS3");
        java.lang.String str3 = chaveNomeTelefone2.getNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro" + "'", str3, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.lang.String str69 = bluRaySerie41.getGenero();
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ROMANCE" + "'", str69, "ROMANCE");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
            java.lang.String str13 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "1: Caloteiro - Reputacao: 0,00|");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("Noob", "XBOX360", "POLICIAL", "Caloteiro, OUTRO, ", "Nenhum item pego emprestado", "Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens69 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray70 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet71 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet71, itemArray70);
        controllerItens69.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet71, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario76 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str77 = controllerUsuario76.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet78 = controllerUsuario76.todosUsuariosItens();
        controllerItens69.adicionaItem(itemSet78, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario86 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str87 = controllerUsuario86.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet88 = controllerUsuario86.todosUsuariosItens();
        java.lang.String str89 = controllerItens69.listarTop10Itens(itemSet88);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet88, "");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(itemSet33);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(itemSet50);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(itemSet60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str65, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(itemSet78);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(itemSet88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        boolean boolean1 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean2 = cartaoFreeRyder0.permisaoPegarEmprestado();
        boolean boolean3 = cartaoFreeRyder0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("ROMANCE", "Caloteiro, MUSICAL, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        lp2.projetofinal.enums.GeneroBluRay generoBluRay8 = lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO;
        boolean boolean9 = bluRaySerie7.equals((java.lang.Object) generoBluRay8);
        java.lang.String str10 = bluRaySerie7.getNome();
        org.junit.Assert.assertTrue("'" + generoBluRay8 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO + "'", generoBluRay8.equals(lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Noob" + "'", str10, "Noob");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
            sistema3.adicionarBluRay("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = facade0.listarEmprestimosUsuarioEmprestando("BomAmigo", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "QUATORZE_ANOS", "PC", (double) 1, "Nao emprestado", 52, "NINTENDO 3DS", "FreeRyder", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.lang.String str24 = usuario21.getTelefone();
        java.lang.String str25 = usuario21.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Caloteiro, OUTRO, " + "'", str25, "Caloteiro, OUTRO, ");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("Nao emprestado", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("Nenhum item emprestado", "XBOX360", "Caloteiro, OUTRO, ", 0.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro, Nao emprestado, ", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "", (double) (short) 1, "AVENTURA", (int) (short) 10, "OUTRO", "Nao emprestado", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico5 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean6 = usuario3.equals((java.lang.Object) plataformaJogoEletronico5);
        java.lang.String str7 = plataformaJogoEletronico5.getPlataforma();
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        java.lang.String str3 = cartaoCaloteiro0.getNomeCartao();
        boolean boolean4 = cartaoCaloteiro0.permisaoPegarEmprestado();
        boolean boolean5 = cartaoCaloteiro0.permisaoPegarEmprestado();
        java.lang.String str6 = cartaoCaloteiro0.getNomeCartao();
        java.lang.String str7 = cartaoCaloteiro0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Caloteiro" + "'", str3, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Caloteiro" + "'", str6, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Caloteiro" + "'", str7, "Caloteiro");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarCaloteiros();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("", "1: Caloteiro - Reputacao: 0,00|", "AVENTURA", (double) 0L, (int) (short) 100, "Nenhum item emprestado", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("Caloteiro, OUTRO, ", "Caloteiro", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("FreeRyder", "POLICIAL", "FreeRyder", "FreeRyder", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "ROMANCE", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        usuario13.atualizaReputacao((double) (-1L), true);
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
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "POLICIAL", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "ROMANCE", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.listarEmprestimosUsuarioEmprestando("1: Caloteiro - Reputacao: 0,00|", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("NINTENDO 3DS", "ROMANCE", "Emprestado", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        emprestimo20.setDataDevolucao("Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = emprestimo20.toString();
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
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario7 = controllerUsuario0.identificaUsuario("", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("DOZE_ANOS", "OUTRO", "Nao emprestado", (double) '#', "COMPLETO", 10, "PS3", "Caloteiro, Nenhum emprestimos associados ao item, ", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("1: ROMANCE - Reputacao: 0,00|", "OUTRO", "OUTRO", 10.0d, (int) (short) -1, (int) (short) 0, "", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        int int7 = bluRayShow6.getNumFaixas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet8 = controllerUsuario0.retornaUsuarioItens("1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str5, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str6 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("PS3", "Noob", "BomAmigo", "OUTRO");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.listarEmprestimosUsuarioPegandoEmprestado("Caloteiro, Nao emprestado, ", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("Lista de usuarios com reputacao negativa: ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) (-4), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.String str30 = usuario24.getTelefone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str30, "1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("Caloteiro, OUTRO, ", "COM PECAS PERDIDAS", "NINTENDO 3DS", 52.0d, 5, "Caloteiro, Nenhum emprestimos associados ao item, ", "POLICIAL", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet2 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("Nao emprestado", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (double) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(itemSet2);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Nenhum item pego emprestado", "QUATORZE_ANOS", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "1:  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente2 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = ordenaUsuarioReputacaoCrescente1.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente2);
        lp2.projetofinal.entidades.Usuario usuario7 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico9 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean10 = usuario7.equals((java.lang.Object) plataformaJogoEletronico9);
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str15 = usuario14.getTelefone();
        int int16 = ordenaUsuarioReputacaoCrescente1.compare(usuario7, usuario14);
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos17 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str19 = controllerEmprestimos17.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos17.salvarListaEmprestimos();
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
        lp2.projetofinal.entidades.Usuario usuario42 = emprestimo41.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario43 = emprestimo41.getUsuarioRequerente();
        usuario43.setEmail("Nao emprestado");
        java.lang.String str46 = usuario43.toString();
        java.lang.String str47 = controllerEmprestimos17.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario43);
        lp2.projetofinal.entidades.Usuario usuario51 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "MUSICAL", "hi!");
        int int52 = ordenaUsuarioReputacaoCrescente1.compare(usuario43, usuario51);
        usuario51.atualizaReputacao((double) (short) 0, true);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente56 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente57 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator58 = ordenaUsuarioReputacaoCrescente56.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente57);
        lp2.projetofinal.entidades.Usuario usuario62 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico64 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean65 = usuario62.equals((java.lang.Object) plataformaJogoEletronico64);
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str70 = usuario69.getTelefone();
        int int71 = ordenaUsuarioReputacaoCrescente56.compare(usuario62, usuario69);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente72 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario76 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str77 = usuario76.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario81 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int82 = ordenaUsuarioReputacaoCrescente72.compare(usuario76, usuario81);
        lp2.projetofinal.entidades.Usuario usuario86 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str87 = usuario86.getTelefone();
        java.lang.String str88 = usuario86.getNome();
        lp2.projetofinal.entidades.Item item89 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo92 = new lp2.projetofinal.entidades.Emprestimo(usuario81, usuario86, item89, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario93 = emprestimo92.getDonoDoItem();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro94 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        usuario93.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro94);
        java.lang.String str96 = cartaoCaloteiro94.getNomeCartao();
        boolean boolean97 = cartaoCaloteiro94.permisaoPegarEmprestado();
        usuario69.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro94);
        int int99 = ordenaUsuarioReputacaoDecrescente0.compare(usuario51, usuario69);
        org.junit.Assert.assertNotNull(usuarioComparator3);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico9 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico9.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str19, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Caloteiro" + "'", str37, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario42);
        org.junit.Assert.assertNotNull(usuario43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Caloteiro, Nao emprestado, " + "'", str46, "Caloteiro, Nao emprestado, ");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Nenhum item pego emprestado" + "'", str47, "Nenhum item pego emprestado");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator58);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico64 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico64.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Caloteiro" + "'", str88, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario93);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Caloteiro" + "'", str96, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        int int7 = bluRayShow6.getDuracao();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.iniciarSistema();
        java.lang.String str7 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("1: ROMANCE - Reputacao: 0,00|", "XBOX360", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "DOZE_ANOS", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.getInfoUsuario("NINTENDO 3DS", "1: ROMANCE - Reputacao: 0,00|", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("1: OUTRO - Reputacao: 0,00|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Nao emprestado", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Nenhum item pego emprestado", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        sistema0.cadastrarUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Caloteiro, OUTRO, ", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.pesquisarDetalhesItem("FreeRyder", "Noob", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        lp2.projetofinal.controllers.Sistema sistema3 = new lp2.projetofinal.controllers.Sistema();
        sistema3.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema3.finalizar();
        java.lang.String str9 = sistema3.listarItensOrdenadosPorNome();
        java.lang.String str10 = sistema3.listarItensOrdenadosPorNome();
        boolean boolean11 = jogoTabuleiro2.equals((java.lang.Object) sistema3);
        java.lang.String str12 = sistema3.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema3.adicionarPecaPerdida("", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str4 = jogoTabuleiro3.contemPecasPerdidas();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico8 = new lp2.projetofinal.entidades.JogoEletronico("Caloteiro", (double) (-1), "");
        int int9 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) jogoEletronico8);
        java.lang.Class<?> wildcardClass10 = jogoEletronico8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COMPLETO" + "'", str4, "COMPLETO");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario49 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str50 = controllerUsuario49.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet51 = controllerUsuario49.todosUsuariosItens();
        controllerItens32.adicionaItem(itemSet51, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str56 = controllerItens0.listarItensNaoEmprestados(itemSet51);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente57 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
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
        boolean boolean80 = emprestimo78.equals((java.lang.Object) (-1.0f));
        int int81 = emprestimo78.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario82 = emprestimo78.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario86 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico88 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean89 = usuario86.equals((java.lang.Object) plataformaJogoEletronico88);
        usuario86.setEmail("Nenhum emprestimos associados ao item");
        int int92 = ordenaUsuarioReputacaoCrescente57.compare(usuario82, usuario86);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet93 = usuario86.retornaSeusItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet93, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "COM PECAS PERDIDAS");
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(itemSet51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str56, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Caloteiro" + "'", str74, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(usuario82);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico88 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico88.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(itemSet93);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Nenhum item pego emprestado");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("Lista de usuarios com reputacao negativa: ", "Caloteiro, Nenhum emprestimos associados ao item, ");
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        sistema0.cadastrarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DOZE_ANOS", "Caloteiro, Nao emprestado, ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("PC", "Lista de usuarios com reputacao negativa: ", "Caloteiro, Nenhum emprestimos associados ao item, ", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Nenhum item pego emprestado");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.getInfoUsuario("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Nao emprestado", "XBOX360");
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("PC", "COM PECAS PERDIDAS");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "1: Caloteiro - Reputacao: 0,00|", "Caloteiro, Nenhum emprestimos associados ao item, ", (double) 14);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        sistema0.resetarPersistencia();
        java.lang.String str8 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str9 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("AVENTURA", "", "MUSICAL", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarTop10Itens();
        java.lang.String str6 = facade0.listarTop10MelhoresUsuarios();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("Emprestado", "", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("Nenhum item emprestado");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario57 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario57.salvarMapaUsuarios();
        controllerUsuario57.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet63 = controllerUsuario57.todosUsuariosItens();
        java.lang.String str64 = controllerItens0.listarItensNaoEmprestados(itemSet63);
        lp2.projetofinal.controllers.ControllerItens controllerItens65 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray66 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet67 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet67, itemArray66);
        controllerItens65.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet67, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario72 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str73 = controllerUsuario72.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet74 = controllerUsuario72.todosUsuariosItens();
        controllerItens65.adicionaItem(itemSet74, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens82 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario83 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str84 = controllerUsuario83.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet85 = controllerUsuario83.todosUsuariosItens();
        controllerItens82.adicionaItem(itemSet85, "Nenhum emprestimos associados ao item", (double) 100);
        java.lang.String str89 = controllerItens65.listarItensOrdenadosPorNome(itemSet85);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item91 = controllerItens0.identificaItem(itemSet85, "Caloteiro, MUSICAL, ");
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
        org.junit.Assert.assertNotNull(itemSet63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(itemSet74);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(itemSet85);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|" + "'", str89, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
            java.lang.String str12 = facade0.getInfoUsuario("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "Lista de usuarios com reputacao negativa: ", "Caloteiro, Nenhum emprestimos associados ao item, ");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("NINTENDO 3DS");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        facade0.resetarPersistencia();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioPegandoEmprestado("ROMANCE", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.SUSPENSE;
        java.lang.Class<?> wildcardClass1 = generoBluRay0.getClass();
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.SUSPENSE + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.SUSPENSE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("PS3", "NINTENDO 3DS", "COMPLETO", "Caloteiro, OUTRO, ", "Caloteiro, OUTRO, ", "Nenhum emprestimos associados ao item", "ROMANCE");
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        sistema0.cadastrarUsuario("1: ROMANCE - Reputacao: 0,00|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "PS3");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("Nenhum item pego emprestado", "Lista de usuarios com reputacao negativa: ", "1: Caloteiro - Reputacao: 0,00|", "COMPLETO");
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("AVENTURA");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        java.lang.String str6 = sistema0.listarEmprestimosItem("POLICIAL");
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.pesquisarDetalhesItem("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "Nenhum item pego emprestado", "NINTENDO 3DS");
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("POLICIAL", (double) 52, (int) (short) 10, "ROMANCE", "Nenhum item emprestado", 35);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.listarEmprestimosUsuarioEmprestando("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((int) (short) 10);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
            sistema0.atualizarUsuario("Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "PS3", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Valor nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        double double14 = jogoTabuleiro3.getPreco();
        jogoTabuleiro3.adicionarPecaPerdida("PS3");
        java.lang.String str17 = jogoTabuleiro3.toString();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS" + "'", str17, "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = controllerUsuario0.getInfoUsuario("Caloteiro, Nao emprestado, ", "PS3", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        java.lang.String str35 = bluRaySerie8.getDescricao();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str35, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("MUSICAL", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", "1: Caloteiro - Reputacao: 0,00|");
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        jogoTabuleiro3.adicionarPecaPerdida("MUSICAL");
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Noob", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (double) (-1L), "Emprestado", (int) (byte) -1, "", "QUATORZE_ANOS", (-4));
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
            sistema7.removerItem("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "BomAmigo", "DOZE_ANOS");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        lp2.projetofinal.enums.GeneroBluRay generoBluRay8 = lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO;
        boolean boolean9 = bluRaySerie7.equals((java.lang.Object) generoBluRay8);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario10 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario10.salvarMapaUsuarios();
        controllerUsuario10.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario10.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario10.todosUsuariosItens();
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) controllerUsuario10);
        java.lang.String str19 = controllerUsuario10.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario10.verificaFidelidadeUsuario("", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + generoBluRay8 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO + "'", generoBluRay8.equals(lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(itemSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str19, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "DOZE_ANOS", "OUTRO", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        lp2.projetofinal.entidades.Item item24 = emprestimo20.getItem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = emprestimo20.toString();
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
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.listarEmprestimosUsuarioPegandoEmprestado("Caloteiro", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("Caloteiro, Nenhum emprestimos associados ao item, ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        int int27 = emprestimo20.getNumeroDias();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertNotNull(usuario26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone3 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
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
        int int26 = emprestimo24.getNumeroDias();
        lp2.projetofinal.entidades.Item item27 = emprestimo24.getItem();
        java.lang.Object obj28 = null;
        boolean boolean29 = emprestimo24.equals(obj28);
        boolean boolean30 = chaveNomeTelefone3.equals((java.lang.Object) emprestimo24);
        emprestimo24.setDataDevolucao("Caloteiro, Nenhum emprestimos associados ao item, ");
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
        // The following exception was thrown during execution in test generation
        try {
            int int58 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo24, emprestimo53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Caloteiro" + "'", str20, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Caloteiro" + "'", str49, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "Caloteiro, Nao emprestado, ", "POLICIAL", "1: Caloteiro - Reputacao: 0,00|", "Caloteiro, Nao emprestado, ");
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("DEZESSEIS_ANOS", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "COMPLETO", (double) (-1L), "XBOX360", (-15), "", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str5 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.pesquisarDetalhesItem("COMPLETO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOCUMENTARIO");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        java.lang.String str4 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("DEZESSEIS_ANOS", "Noob", 0.0d, true);
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        java.lang.String str95 = controllerItens0.listarTop10Itens(itemSet85);
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
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens53 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray54 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet55 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet55, itemArray54);
        controllerItens53.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet55, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario60 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str61 = controllerUsuario60.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet62 = controllerUsuario60.todosUsuariosItens();
        controllerItens53.adicionaItem(itemSet62, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario70 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str71 = controllerUsuario70.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet72 = controllerUsuario70.todosUsuariosItens();
        java.lang.String str73 = controllerItens53.listarTop10Itens(itemSet72);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario74 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str75 = controllerUsuario74.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet76 = controllerUsuario74.todosUsuariosItens();
        java.lang.String str77 = controllerItens53.listarTop10Itens(itemSet76);
        controllerItens0.adicionaItem(itemSet76, "COMPLETO", (double) 'a');
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str82 = controllerItens0.listarTop10Itens(itemSet81);
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
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(itemSet62);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(itemSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(itemSet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "XBOX360", "AVENTURA", (double) (short) 100, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 0, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Caloteiro, Nenhum emprestimos associados ao item, ", 35);
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
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario6 = controllerUsuario0.identificaUsuario("DOZE_ANOS", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str3 = jogoTabuleiro2.toString();
        java.lang.String str5 = jogoTabuleiro2.getInfo("1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO" + "'", str3, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Nenhum item pego emprestado");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.getInfoUsuario("POLICIAL", "1: ROMANCE - Reputacao: 0,00|", "1: ROMANCE - Reputacao: 0,00|");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
            java.lang.String str11 = facade0.listarEmprestimosUsuarioPegandoEmprestado("1: ROMANCE - Reputacao: 0,00|", "AVENTURA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        java.lang.String str9 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("1: ROMANCE - Reputacao: 0,00|", "DEZESSEIS_ANOS", "FreeRyder", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str14 = bluRayShow6.getNome();
        int int15 = bluRayShow6.getNumFaixas();
        bluRayShow6.setNome("Nenhum item emprestado");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OUTRO" + "'", str14, "OUTRO");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        lp2.projetofinal.entidades.CartaoBomAmigo cartaoBomAmigo12 = new lp2.projetofinal.entidades.CartaoBomAmigo();
        java.lang.String str13 = cartaoBomAmigo12.getNomeCartao();
        java.lang.String str14 = cartaoBomAmigo12.getNomeCartao();
        boolean boolean15 = chaveNomeTelefone2.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str3, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str5, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str6, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "BomAmigo" + "'", str13, "BomAmigo");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "BomAmigo" + "'", str14, "BomAmigo");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("1: Caloteiro - Reputacao: 0,00|");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("Emprestado");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario73 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str74 = controllerUsuario73.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet75 = controllerUsuario73.todosUsuariosItens();
        controllerItens56.adicionaItem(itemSet75, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        controllerItens49.adicionaItem(itemSet75, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        controllerItens25.adicionaItem(itemSet75, "1: OUTRO - Reputacao: 0,00|", 0.0d, "OUTRO");
        controllerItens0.adicionaItem(itemSet75, "FreeRyder", (-1.0d));
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet94 = null;
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item96 = controllerItens0.identificaItem(itemSet94, "Caloteiro, Nao emprestado, ");
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
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(itemSet44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(itemSet65);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(itemSet75);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", (double) 0L, (int) (byte) 1, "XBOX360", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sistema0.pesquisarDetalhesItem("Noob", "Caloteiro, Nao emprestado, ", "NINTENDO 3DS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
            sistema3.cadastrarJogoTabuleiro("Emprestado", "", "1: ROMANCE - Reputacao: 0,00|", (double) 10L);
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        boolean boolean24 = emprestimo22.equals((java.lang.Object) (-1.0f));
        int int25 = emprestimo22.getNumeroDias();
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
        lp2.projetofinal.entidades.Usuario usuario47 = emprestimo46.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario48 = emprestimo46.getUsuarioRequerente();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie56 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str58 = bluRaySerie56.getInfo("Nao emprestado");
        boolean boolean59 = emprestimo46.equals((java.lang.Object) "Nao emprestado");
        // The following exception was thrown during execution in test generation
        try {
            int int60 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo22, emprestimo46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Caloteiro" + "'", str42, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario47);
        org.junit.Assert.assertNotNull(usuario48);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens42 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray43 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet44 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet44, itemArray43);
        controllerItens42.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet44, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario49 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str50 = controllerUsuario49.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet51 = controllerUsuario49.todosUsuariosItens();
        controllerItens42.adicionaItem(itemSet51, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario59 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str60 = controllerUsuario59.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet61 = controllerUsuario59.todosUsuariosItens();
        java.lang.String str62 = controllerItens42.listarTop10Itens(itemSet61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = controllerItens0.getInfoItem(itemSet61, "hi!", "");
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
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(itemSet51);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(itemSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoItem("QUATORZE_ANOS", "Emprestado", "", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("XBOX360");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo((-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Numero faixas invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario54 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario54.salvarMapaUsuarios();
        controllerUsuario54.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario54.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet61 = controllerUsuario54.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item63 = controllerItens0.identificaItem(itemSet61, "DOCUMENTARIO");
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
        org.junit.Assert.assertNotNull(itemSet61);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        java.lang.String str4 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sistema0.getInfoUsuario("ROMANCE", "XBOX360", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.getInfoUsuario("Caloteiro, MUSICAL, ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COM PECAS PERDIDAS", "DEZESSEIS_ANOS");
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("", "POLICIAL", "Noob", (double) (-15), 5, "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("PC", "FreeRyder", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Nao emprestado", "PS3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoItem("1: ROMANCE - Reputacao: 0,00|", "BomAmigo", "ROMANCE", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
            controllerUsuario60.atualizaReputacao("PC", "QUATORZE_ANOS", (double) (-15), false);
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico3 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str4 = jogoEletronico3.toString();
        java.lang.String str5 = jogoEletronico3.getPlataforma();
        java.lang.String str6 = jogoEletronico3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str4, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OUTRO" + "'", str5, "OUTRO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO" + "'", str6, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        jogoTabuleiro2.adicionarPecaPerdida("Caloteiro, Nao emprestado, ");
        jogoTabuleiro2.setPreco(0.0d);
        lp2.projetofinal.facade.Facade facade7 = new lp2.projetofinal.facade.Facade();
        java.lang.String str8 = facade7.listarTop10PioresUsuarios();
        java.lang.String str9 = facade7.listarTop10Itens();
        java.lang.String str10 = facade7.listarItensOrdenadosPorNome();
        java.lang.String str11 = facade7.listarItensOrdenadosPorValor();
        boolean boolean12 = jogoTabuleiro2.equals((java.lang.Object) str11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("Nenhum item pego emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Nenhum item emprestado");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet38 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionaItem(itemSet38, "Caloteiro, OUTRO, ", (double) 1.0f, "Emprestado");
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
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens53 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens54 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario55 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str56 = controllerUsuario55.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet57 = controllerUsuario55.todosUsuariosItens();
        controllerItens54.adicionaItem(itemSet57, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens61 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray62 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet63 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet63, itemArray62);
        controllerItens61.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet63, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario68 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str69 = controllerUsuario68.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet70 = controllerUsuario68.todosUsuariosItens();
        controllerItens61.adicionaItem(itemSet70, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario78 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str79 = controllerUsuario78.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet80 = controllerUsuario78.todosUsuariosItens();
        controllerItens61.adicionaItem(itemSet80, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str87 = controllerItens54.getInfoItem(itemSet80, "Nao emprestado", "POLICIAL");
        java.lang.String str88 = controllerItens53.listarItensNaoEmprestados(itemSet80);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet80, "COMPLETO");
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(itemSet57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(itemSet70);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(itemSet80);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str88, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("XBOX360");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        int int37 = bluRaySerie8.getNumeroTemporada();
        int int38 = bluRaySerie8.getNumeroTemporada();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay19 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay19.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Caloteiro" + "'", str31, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Noob" + "'", str34, "Noob");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int1 = cartaoCaloteiro0.prazoEmprestimo();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        java.lang.String str3 = cartaoCaloteiro0.getNomeCartao();
        int int4 = cartaoCaloteiro0.prazoEmprestimo();
        int int5 = cartaoCaloteiro0.prazoEmprestimo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Caloteiro" + "'", str3, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        java.lang.String str24 = usuario14.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Caloteiro" + "'", str21, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Caloteiro, OUTRO, " + "'", str22, "Caloteiro, OUTRO, ");
        org.junit.Assert.assertNotNull(itemSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OUTRO" + "'", str24, "OUTRO");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((-15));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        controllerUsuario29.carregaMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario29.verificadisponibilidadeUsuario("1:  - Reputacao: 0,00|", "", 52);
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        bluRaySerie7.itemEmprestado();
        int int11 = bluRaySerie7.getNumeroTemporada();
        int int12 = bluRaySerie7.duracaoTotal();
        lp2.projetofinal.controllers.Sistema sistema13 = new lp2.projetofinal.controllers.Sistema();
        sistema13.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema13.finalizar();
        java.lang.String str19 = sistema13.listarItensOrdenadosPorNome();
        java.lang.String str20 = sistema13.listarItensOrdenadosPorNome();
        java.lang.String str21 = sistema13.listarItensEmprestados();
        java.lang.String str22 = sistema13.listarTop10MelhoresUsuarios();
        java.lang.String str23 = sistema13.listarItensOrdenadosPorValor();
        boolean boolean24 = bluRaySerie7.equals((java.lang.Object) str23);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str22, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoItem("1: OUTRO - Reputacao: 0,00|", "", "Noob", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        double double81 = usuario26.getReputacao();
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
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("Noob", "1: OUTRO - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|", "DOCUMENTARIO", "NINTENDO 3DS", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        java.lang.String str9 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("COM PECAS PERDIDAS", "FreeRyder", "JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("Caloteiro, MUSICAL, ");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.String str75 = controllerEmprestimos0.listarEmprestimosItens("1: Caloteiro - Reputacao: 0,00|");
        java.lang.String str77 = controllerEmprestimos0.listarEmprestimosItens("Nenhum item pego emprestado");
        java.lang.String str78 = controllerEmprestimos0.listarItensEmprestados();
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str75, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str77, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("COM PECAS PERDIDAS", "POLICIAL", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "NINTENDO 3DS", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, Nenhum emprestimos associados ao item, ", "Nao emprestado", (double) 100.0f, 10, "MUSICAL", "Noob", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("DOCUMENTARIO", "Nenhum emprestimos associados ao item", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("COM PECAS PERDIDAS", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet6 = controllerUsuario0.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Nao emprestado", "AVENTURA", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemSet6);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie1 = new lp2.projetofinal.entidades.EpisodioSerie((-1));
        int int2 = episodioSerie1.getDuracao();
        int int3 = episodioSerie1.getDuracao();
        int int4 = episodioSerie1.getDuracao();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("1: OUTRO - Reputacao: 0,00|", "QUATORZE_ANOS", "Nenhum item pego emprestado", (double) (byte) 1, "Caloteiro, Nenhum emprestimos associados ao item, ", 52, "Nenhum item emprestado", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioEmprestando("JOGO DE TABULEIRO: , R$ 100.0, Nao emprestado, COMPLETO|", "COM PECAS PERDIDAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sistema0.getInfoItem("Noob", "", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: ROMANCE - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||", "", "XBOX360", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        java.lang.String str8 = sistema0.listarEmprestimosItem("Emprestado");
        java.lang.String str9 = sistema0.listarCaloteiros();
        java.lang.String str10 = sistema0.listarItensNaoEmprestados();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str8, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str9, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("Caloteiro, OUTRO, ", "NINTENDO 3DS", "FreeRyder", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Valor nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("DEZESSEIS_ANOS", (double) 1L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("Nenhum item emprestado", "MUSICAL", "1: OUTRO - Reputacao: 0,00|", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) (byte) 1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay0 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZOITO_ANOS;
        java.lang.String str1 = classificacaoBluRay0.getClassificacao();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay0 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZOITO_ANOS + "'", classificacaoBluRay0.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZOITO_ANOS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DEZOITO_ANOS" + "'", str1, "DEZOITO_ANOS");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("MUSICAL", "MUSICAL", "FreeRyder", "BomAmigo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        lp2.projetofinal.entidades.BluRayShow bluRayShow74 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay75 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean76 = bluRayShow74.equals((java.lang.Object) classificacaoBluRay75);
        bluRayShow74.atualizar("hi!", "OUTRO");
        bluRayShow74.setNome("OUTRO");
        java.lang.String str83 = bluRayShow74.getInfo("Lista de usuarios com reputacao negativa: ");
        lp2.projetofinal.entidades.BluRayShow bluRayShow90 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay91 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean92 = bluRayShow90.equals((java.lang.Object) classificacaoBluRay91);
        bluRayShow90.atualizar("hi!", "OUTRO");
        bluRayShow90.setNome("OUTRO");
        java.lang.String str98 = bluRayShow90.getNome();
        int int99 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow74, (lp2.projetofinal.entidades.Item) bluRayShow90);
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
        org.junit.Assert.assertTrue("'" + classificacaoBluRay75 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay75.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay91 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay91.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "OUTRO" + "'", str98, "OUTRO");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "1:  - Reputacao: 0,00|", "MUSICAL", "MUSICAL", "MUSICAL", "DOZE_ANOS", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        lp2.projetofinal.entidades.Usuario usuario23 = emprestimo22.getDonoDoItem();
        int int24 = emprestimo22.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie26 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean27 = emprestimo22.equals((java.lang.Object) episodioSerie26);
        int int28 = emprestimo22.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario29 = emprestimo22.getDonoDoItem();
        lp2.projetofinal.entidades.Usuario usuario30 = emprestimo22.getUsuarioRequerente();
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade31 = usuario30.getCartao();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente32 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
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
        usuario68.atualizaReputacao((double) (short) -1, false);
        int int78 = ordenaUsuarioReputacaoCrescente32.compare(usuario42, usuario68);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo80 = controllerEmprestimos0.identificaEmprestimo(usuario30, usuario42, "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(usuario29);
        org.junit.Assert.assertNotNull(usuario30);
        org.junit.Assert.assertNotNull(cartaoFidelidade31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Caloteiro" + "'", str49, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Caloteiro" + "'", str70, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.resetarPersistencia();
        java.lang.String str4 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("MUSICAL", "Nenhum emprestimos associados ao item", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Noob");
        controllerUsuario0.cadastrarUsuario("BomAmigo", "1: ROMANCE - Reputacao: 0,00|", "Caloteiro, Nao emprestado, ");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        lp2.projetofinal.enums.GeneroBluRay generoBluRay8 = lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO;
        boolean boolean9 = bluRaySerie7.equals((java.lang.Object) generoBluRay8);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario10 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario10.salvarMapaUsuarios();
        controllerUsuario10.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario10.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario10.todosUsuariosItens();
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) controllerUsuario10);
        java.lang.String str19 = controllerUsuario10.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario10.removerUsuario("COMPLETO", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + generoBluRay8 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO + "'", generoBluRay8.equals(lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(itemSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str19, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "1: Caloteiro - Reputacao: 0,00|", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("NINTENDO 3DS");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "COMPLETO", (double) (-11));
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens49 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray50 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet51 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet51, itemArray50);
        controllerItens49.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet51, "Caloteiro", (-1.0d));
        java.lang.String str56 = controllerItens32.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet51);
        lp2.projetofinal.controllers.ControllerItens controllerItens57 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray58 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet59 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet59, itemArray58);
        controllerItens57.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet59, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario64 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str65 = controllerUsuario64.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet66 = controllerUsuario64.todosUsuariosItens();
        controllerItens57.adicionaItem(itemSet66, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario74 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str75 = controllerUsuario74.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet76 = controllerUsuario74.todosUsuariosItens();
        java.lang.String str77 = controllerItens57.listarTop10Itens(itemSet76);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario78 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str79 = controllerUsuario78.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet80 = controllerUsuario78.todosUsuariosItens();
        java.lang.String str81 = controllerItens57.listarTop10Itens(itemSet80);
        controllerItens32.adicionaItem(itemSet80, "Nenhum emprestimos associados ao item", (double) 0L, "Caloteiro, OUTRO, ");
        java.lang.String str86 = controllerItens0.listarItensOrdenadosPorValor(itemSet80);
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
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str56, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(itemSet66);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(itemSet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(itemSet80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|" + "'", str86, "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoItem("1: Caloteiro - Reputacao: 0,00|", "DOZE_ANOS", "Nenhum item emprestado", "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("DOZE_ANOS");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.lang.String str60 = bluRayShow55.getNomeArtista();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = bluRayShow55.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str60, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("PC");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(64);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("FreeRyder");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str4 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str5 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("1:  - Reputacao: 0,00|", "1: Caloteiro - Reputacao: 0,00|", "XBOX360", "FreeRyder");
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente52 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente53 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator54 = ordenaUsuarioReputacaoCrescente52.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente53);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente55 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente56 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator57 = ordenaUsuarioReputacaoCrescente55.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente56);
        lp2.projetofinal.entidades.Usuario usuario61 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico63 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean64 = usuario61.equals((java.lang.Object) plataformaJogoEletronico63);
        lp2.projetofinal.entidades.Usuario usuario68 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str69 = usuario68.getTelefone();
        int int70 = ordenaUsuarioReputacaoCrescente55.compare(usuario61, usuario68);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator71 = ordenaUsuarioReputacaoCrescente52.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente55);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente72 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente73 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator74 = ordenaUsuarioReputacaoCrescente72.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente73);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator75 = ordenaUsuarioReputacaoCrescente72.reversed();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente76 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente77 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator78 = ordenaUsuarioReputacaoCrescente76.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente77);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator79 = ordenaUsuarioReputacaoCrescente76.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator80 = ordenaUsuarioReputacaoCrescente76.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator81 = ordenaUsuarioReputacaoCrescente72.thenComparing(usuarioComparator80);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente82 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente83 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator84 = ordenaUsuarioReputacaoCrescente82.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente83);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator85 = usuarioComparator84.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator86 = usuarioComparator81.thenComparing(usuarioComparator84);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator87 = usuarioComparator86.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator88 = usuarioComparator71.thenComparing(usuarioComparator86);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator89 = ordenaUsuarioReputacaoCrescente0.thenComparing(usuarioComparator86);
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
        org.junit.Assert.assertNotNull(usuarioComparator54);
        org.junit.Assert.assertNotNull(usuarioComparator57);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico63 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico63.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(usuarioComparator71);
        org.junit.Assert.assertNotNull(usuarioComparator74);
        org.junit.Assert.assertNotNull(usuarioComparator75);
        org.junit.Assert.assertNotNull(usuarioComparator78);
        org.junit.Assert.assertNotNull(usuarioComparator79);
        org.junit.Assert.assertNotNull(usuarioComparator80);
        org.junit.Assert.assertNotNull(usuarioComparator81);
        org.junit.Assert.assertNotNull(usuarioComparator84);
        org.junit.Assert.assertNotNull(usuarioComparator85);
        org.junit.Assert.assertNotNull(usuarioComparator86);
        org.junit.Assert.assertNotNull(usuarioComparator87);
        org.junit.Assert.assertNotNull(usuarioComparator88);
        org.junit.Assert.assertNotNull(usuarioComparator89);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.getInfoUsuario("ROMANCE", "DOCUMENTARIO", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens66 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray67 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet68 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet68, itemArray67);
        controllerItens66.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet68, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario73 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str74 = controllerUsuario73.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet75 = controllerUsuario73.todosUsuariosItens();
        controllerItens66.adicionaItem(itemSet75, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet75, "Caloteiro, OUTRO, ");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(itemSet43);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str58, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(itemSet75);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "OUTRO");
        java.lang.String str8 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("POLICIAL", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str8, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, MUSICAL, ", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Caloteiro", "DOZE_ANOS", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) (short) 1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        double double52 = usuario50.getReputacao();
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        lp2.projetofinal.entidades.Item item34 = null;
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme41 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str42 = bluRayFilme41.getGenero();
        java.lang.String str43 = bluRayFilme41.getGenero();
        // The following exception was thrown during execution in test generation
        try {
            int int44 = ordenaItemNumeroEmprestimos0.compare(item34, (lp2.projetofinal.entidades.Item) bluRayFilme41);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "OUTRO" + "'", str42, "OUTRO");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "OUTRO" + "'", str43, "OUTRO");
    }
}

