import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((int) '4');
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 100.0f);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Map<lp2.projetofinal.entidades.ChaveNomeTelefone, lp2.projetofinal.entidades.Usuario> chaveNomeTelefoneMap0 = null;
        lp2.projetofinal.persistencia.Persistencia.salvarUsuarios(chaveNomeTelefoneMap0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.itemEmprestadoNoMomento();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item emprestado no momento");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario1 = null;
        lp2.projetofinal.entidades.Usuario usuario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = ordenaUsuarioReputacaoCrescente0.compare(usuario1, usuario2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.itemNaoEncontradoException();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("OUTRO", "", "Caloteiro", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = controllerUsuario0.getInfoUsuario("Caloteiro", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("", "OUTRO", (double) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.List<lp2.projetofinal.entidades.Emprestimo> emprestimoList0 = lp2.projetofinal.persistencia.Persistencia.carregaEmprestimos();
        org.junit.Assert.assertNull(emprestimoList0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("hi!", "Caloteiro", "", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        lp2.projetofinal.util.Checks checks0 = new lp2.projetofinal.util.Checks();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("Caloteiro", "Caloteiro", "Caloteiro", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = facade0.listarEmprestimosUsuarioPegandoEmprestado("hi!", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = controllerUsuario0.getInfoUsuario("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((int) ' ');
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Artista nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Caloteiro");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico0 = lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO;
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico0 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico0.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        lp2.projetofinal.facade.Main main0 = new lp2.projetofinal.facade.Main();
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sistema0.getInfoItem("hi!", "hi!", "", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = sistema0.listarEmprestimosItem("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Map<lp2.projetofinal.entidades.ChaveNomeTelefone, lp2.projetofinal.entidades.Usuario> chaveNomeTelefoneMap0 = lp2.projetofinal.persistencia.Persistencia.carregaUsuarios();
        org.junit.Assert.assertNull(chaveNomeTelefoneMap0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo((int) '#');
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.Item item1 = null;
        lp2.projetofinal.entidades.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = ordenaItemPeloPreco0.compare(item1, item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.emprestimoNaoEncontrado();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 'a');
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("OUTRO", "", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.nenhumItemEmprestado();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nenhum item emprestado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("Lista de usuarios com reputacao negativa: ", "hi!", "", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("", "", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("hi!", "Caloteiro", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.pesquisarDetalhesItem("OUTRO", "", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario4 = controllerUsuario0.identificaUsuario("OUTRO", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("Caloteiro", "", "hi!", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico0 = lp2.projetofinal.enums.PlataformaJogoEletronico.PS4;
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico0 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.PS4 + "'", plataformaJogoEletronico0.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.PS4));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sistema0.listarEmprestimosUsuarioEmprestando("Lista de usuarios com reputacao negativa: ", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = facade0.pesquisarDetalhesItem("", "Lista de usuarios com reputacao negativa: ", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = facade0.listarEmprestimosUsuarioEmprestando("Caloteiro", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("hi!", "Lista de usuarios com reputacao negativa: ", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.usuarioInvalidoException();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("Lista de usuarios com reputacao negativa: ", "Caloteiro", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        lp2.projetofinal.util.Exceptions exceptions0 = new lp2.projetofinal.util.Exceptions();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("hi!", "OUTRO", "Caloteiro", "hi!", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("Caloteiro", "OUTRO", "", (double) 10.0f, (int) (byte) 1, "hi!", "Caloteiro", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaValorVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Valor nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("Lista de usuarios com reputacao negativa: ", "OUTRO", "OUTRO", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosItem("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.FICCAO;
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.FICCAO + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.FICCAO));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.EROTICO;
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.EROTICO + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.EROTICO));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico0 = lp2.projetofinal.enums.PlataformaJogoEletronico.MAC;
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico0 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.MAC + "'", plataformaJogoEletronico0.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.MAC));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.usuarioNaoPodePegarItemException();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario nao pode pegar nenhum item emprestado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("", "OUTRO", "Lista de usuarios com reputacao negativa: ", "OUTRO", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = controllerItens0.getDetalhesItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("OUTRO", "OUTRO", "Caloteiro", "Caloteiro", "Lista de usuarios com reputacao negativa: ", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("ROMANCE", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("Lista de usuarios com reputacao negativa: ", "OUTRO", "Lista de usuarios com reputacao negativa: ", (double) 1.0f, "", (int) (short) 1, "OUTRO", "ROMANCE", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Descricao nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet9, "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = controllerUsuario0.getInfoUsuario("ROMANCE", "", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem(itemSet1, "Lista de usuarios com reputacao negativa: ", "", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.usuarioJaCadastradoException();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario ja cadastrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("ROMANCE");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("", "", (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data devolucao nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.atributoInvalidoException();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("", "hi!", "", "Caloteiro", "hi!", "Caloteiro", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario1 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str2 = controllerUsuario1.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet3 = controllerUsuario1.todosUsuariosItens();
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio(itemSet3, "Caloteiro", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(itemSet3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("ROMANCE", "OUTRO", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.COMEDIA;
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.COMEDIA + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.COMEDIA));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("OUTRO");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerItens controllerItens1 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray2 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet3 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet3, itemArray2);
        controllerItens1.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet3, "Caloteiro", (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = controllerItens0.getDetalhesItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet3, "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("Lista de usuarios com reputacao negativa: ", "", "", (double) 1, (int) (byte) 100, "Lista de usuarios com reputacao negativa: ", "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("ROMANCE");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = controllerUsuario0.getInfoUsuario("", "Lista de usuarios com reputacao negativa: ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("OUTRO", "Caloteiro", "Caloteiro", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.FAROESTE;
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.FAROESTE + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.FAROESTE));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("1: OUTRO - Reputacao: 0,00|", "Nao emprestado", "ROMANCE", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("", "Caloteiro", (double) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) (byte) 100);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("OUTRO", "", "Lista de usuarios com reputacao negativa: ", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("hi!", "OUTRO", "Caloteiro", (double) 1, (int) (short) 1, (int) '#', "Caloteiro", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("1: OUTRO - Reputacao: 0,00|", "ROMANCE", "ROMANCE", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("ROMANCE", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) (short) 10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("Caloteiro", "Lista de usuarios com reputacao negativa: ", "Caloteiro", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("ROMANCE", "1: OUTRO - Reputacao: 0,00|", "", "Caloteiro", "ROMANCE", "1: OUTRO - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        lp2.projetofinal.persistencia.Persistencia persistencia0 = new lp2.projetofinal.persistencia.Persistencia();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sistema0.listarEmprestimosUsuarioEmprestando("ROMANCE", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("OUTRO", "", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.getInfoItem("Lista de usuarios com reputacao negativa: ", "Caloteiro", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("Nao emprestado", "", "ROMANCE", "Caloteiro", "hi!", "Nenhum emprestimos associados ao item", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerItem("Nenhum emprestimos associados ao item", "Nao emprestado", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("", "Nenhum emprestimos associados ao item", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens59 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray60 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet61 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet61, itemArray60);
        controllerItens59.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet61, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario66 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str67 = controllerUsuario66.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet68 = controllerUsuario66.todosUsuariosItens();
        controllerItens59.adicionaItem(itemSet68, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario76 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str77 = controllerUsuario76.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet78 = controllerUsuario76.todosUsuariosItens();
        controllerItens59.adicionaItem(itemSet78, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str83 = controllerItens42.listarItensNaoEmprestados(itemSet78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = controllerItens0.getInfoItem(itemSet78, "OUTRO", "");
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
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(itemSet68);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(itemSet78);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str83, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("OUTRO", "ROMANCE", "", (double) 10L, (int) (byte) 0, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico1 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico1 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico1.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("", "Lista de usuarios com reputacao negativa: ", "OUTRO", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Caloteiro", "1: OUTRO - Reputacao: 0,00|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        lp2.projetofinal.persistencia.Persistencia.resetar();
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("", "Caloteiro", "Nao emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.TERROR;
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.TERROR + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.TERROR));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sistema0.listarEmprestimosItem("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario6 = controllerUsuario0.identificaUsuario("Caloteiro", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario6 = controllerUsuario0.identificaUsuario("ROMANCE", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("hi!", "Lista de usuarios com reputacao negativa: ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) 100, (int) (byte) -1, (int) ' ', "Caloteiro", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet44, "", "Caloteiro");
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
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "hi!", "Caloteiro", 10.0d, "ROMANCE", 1, "OUTRO", "Nenhum emprestimos associados ao item", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", "Nenhum emprestimos associados ao item", (double) (-1L), 0, (int) (byte) 100, "OUTRO", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("OUTRO", "hi!", "Nenhum emprestimos associados ao item", (double) (-1.0f), (int) (short) 100, "Noob", "Nao emprestado", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("ROMANCE", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.pesquisarDetalhesItem("OUTRO", "ROMANCE", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("ROMANCE");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
            java.lang.String str24 = bluRayShow20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Noob", "ROMANCE", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "1: OUTRO - Reputacao: 0,00|");
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
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("OUTRO", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("", "Nao emprestado", "Nao emprestado", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) ' ');
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "", "Nenhum emprestimos associados ao item", "ROMANCE", "1: OUTRO - Reputacao: 0,00|", "", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item25 = controllerItens0.identificaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet19, "OUTRO");
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator1 = ordenaItemEmprestadoAlfabetico0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator2 = ordenaItemEmprestadoAlfabetico0.reversed();
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
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo30 = new lp2.projetofinal.entidades.Emprestimo(usuario17, usuario27, "1: OUTRO - Reputacao: 0,00|");
        lp2.projetofinal.entidades.Emprestimo emprestimo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo30, emprestimo31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertNotNull(emprestimoComparator2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("ROMANCE");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = controllerItens0.getDetalhesItem(itemSet33, "OUTRO");
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("ROMANCE", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "1: OUTRO - Reputacao: 0,00|", "ROMANCE", "OUTRO", "1: OUTRO - Reputacao: 0,00|", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("Noob", "", "hi!", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.getInfoItem("", "1: OUTRO - Reputacao: 0,00|", "Caloteiro", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("Nao emprestado");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("hi!", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "", "OUTRO", 0.0d, "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("Nenhum emprestimos associados ao item", "Caloteiro", "1: OUTRO - Reputacao: 0,00|", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.getInfoUsuario("", "ROMANCE", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionaItem(itemSet17, "Lista de usuarios com reputacao negativa: ", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sistema0.listarEmprestimosUsuarioEmprestando("ROMANCE", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario4 = controllerUsuario0.identificaUsuario("", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        bluRayShow6.setNome("Nao emprestado");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("1: OUTRO - Reputacao: 0,00|", "OUTRO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("Nenhum emprestimos associados ao item", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro", (double) 10L, 100, (int) '4', "ROMANCE", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("", "Nao emprestado", "Caloteiro", 0.0d, (int) ' ', (int) (byte) 0, "Caloteiro", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("MUSICAL", "", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
            java.lang.String str24 = bluRayShow20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("Caloteiro", "", "Nenhum emprestimos associados ao item", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Noob", "Noob", "Nenhum emprestimos associados ao item", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("ROMANCE", "Noob", "hi!", 100.0d, (int) 'a', 0, "MUSICAL", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Numero faixas invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<lp2.projetofinal.entidades.Item> itemSet7 = controllerUsuario0.retornaUsuarioItens("Lista de usuarios com reputacao negativa: ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = controllerUsuario0.getInfoUsuario("", "OUTRO", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) (short) 10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("MUSICAL", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        lp2.projetofinal.entidades.Usuario usuario44 = emprestimo43.getDonoDoItem();
        int int45 = emprestimo43.getNumeroDias();
        // The following exception was thrown during execution in test generation
        try {
            int int46 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo22, emprestimo43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Caloteiro" + "'", str18, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.getInfoUsuario("ROMANCE", "ROMANCE", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        lp2.projetofinal.entidades.Usuario usuario47 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str48 = usuario47.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo50 = new lp2.projetofinal.entidades.Emprestimo(usuario37, usuario47, "1: OUTRO - Reputacao: 0,00|");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo21, emprestimo50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Caloteiro" + "'", str39, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente4 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str10 = usuario9.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int15 = ordenaUsuarioReputacaoCrescente5.compare(usuario9, usuario14);
        lp2.projetofinal.entidades.Usuario usuario19 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str20 = usuario19.getTelefone();
        java.lang.String str21 = usuario19.getNome();
        lp2.projetofinal.entidades.Item item22 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo25 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario19, item22, "OUTRO", 100);
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
        usuario40.atualizaReputacao((double) (short) -1, false);
        int int50 = ordenaUsuarioReputacaoCrescente4.compare(usuario14, usuario40);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente51 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario55 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str56 = usuario55.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario60 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int61 = ordenaUsuarioReputacaoCrescente51.compare(usuario55, usuario60);
        usuario60.setTelefone("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente64 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario68 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str69 = usuario68.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario73 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int74 = ordenaUsuarioReputacaoCrescente64.compare(usuario68, usuario73);
        lp2.projetofinal.entidades.Usuario usuario78 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str79 = usuario78.getTelefone();
        java.lang.String str80 = usuario78.getNome();
        lp2.projetofinal.entidades.Item item81 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo84 = new lp2.projetofinal.entidades.Emprestimo(usuario73, usuario78, item81, "OUTRO", 100);
        usuario78.atualizaReputacao((double) (-1), true);
        int int88 = ordenaUsuarioReputacaoCrescente4.compare(usuario60, usuario78);
        lp2.projetofinal.entidades.BluRayShow bluRayShow95 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str96 = bluRayShow95.getNome();
        lp2.projetofinal.entidades.Emprestimo emprestimo99 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario60, (lp2.projetofinal.entidades.Item) bluRayShow95, "DOZE_ANOS", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Caloteiro" + "'", str21, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Caloteiro" + "'", str42, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Caloteiro" + "'", str80, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Caloteiro" + "'", str96, "Caloteiro");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sistema0.getInfoUsuario("hi!", "Caloteiro", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("ROMANCE", "DOZE_ANOS", "", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("", "", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario7 = controllerUsuario0.identificaUsuario("Caloteiro, OUTRO, ", "MUSICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.getInfoItem("MUSICAL", "DOZE_ANOS", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro", "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("OUTRO");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Lista de usuarios com reputacao negativa: ", (double) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 100);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario18 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str19 = controllerUsuario18.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet20 = controllerUsuario18.todosUsuariosItens();
        controllerItens1.adicionaItem(itemSet20, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = controllerItens0.getInfoItem(itemSet20, "1: OUTRO - Reputacao: 0,00|", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(itemSet10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(itemSet20);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) (byte) 100);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente48 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario52 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str53 = usuario52.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario57 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int58 = ordenaUsuarioReputacaoCrescente48.compare(usuario52, usuario57);
        usuario57.setTelefone("OUTRO");
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
        usuario75.atualizaReputacao((double) (-1), true);
        int int85 = ordenaUsuarioReputacaoCrescente1.compare(usuario57, usuario75);
        lp2.projetofinal.entidades.Usuario usuario89 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str90 = usuario89.getTelefone();
        java.lang.String str91 = usuario89.getNome();
        double double92 = usuario89.getReputacao();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo94 = controllerEmprestimos0.identificaEmprestimo(usuario75, usuario89, "Lista de usuarios com reputacao negativa: ");
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Caloteiro" + "'", str77, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Caloteiro" + "'", str91, "Caloteiro");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("", "Noob", 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("hi!");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario43 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str44 = controllerUsuario43.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet45 = controllerUsuario43.todosUsuariosItens();
        controllerItens42.adicionaItem(itemSet45, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens49 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray50 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet51 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet51, itemArray50);
        controllerItens49.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet51, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario56 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str57 = controllerUsuario56.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet58 = controllerUsuario56.todosUsuariosItens();
        controllerItens49.adicionaItem(itemSet58, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens42.adicionaItem(itemSet58, "Lista de usuarios com reputacao negativa: ", (double) 7, "Nao emprestado", (int) (short) -1, "Lista de usuarios com reputacao negativa: ", "Nao emprestado", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem(itemSet58, "OUTRO", "Lista de usuarios com reputacao negativa: ", "Noob");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(itemSet45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(itemSet58);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray1 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet2 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet2, itemArray1);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet2, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario7 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str8 = controllerUsuario7.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet9 = controllerUsuario7.todosUsuariosItens();
        controllerItens0.adicionaItem(itemSet9, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionaItem(itemSet17, "Caloteiro", (double) (byte) 10, 1, "Nao emprestado", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(itemSet9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("Nao emprestado", "Nenhum emprestimos associados ao item", "MUSICAL", "OUTRO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data devolucao nao pode ser vazia ou nula");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) (short) 100, "hi!", (int) 'a', "DOZE_ANOS", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Genero nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Nenhum emprestimos associados ao item", "Nenhum emprestimos associados ao item", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("COMPLETO");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Caloteiro, Nao emprestado, ", "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("Nenhum emprestimos associados ao item", "ROMANCE", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("DOZE_ANOS", "Caloteiro, OUTRO, ", "MUSICAL", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("1: OUTRO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Lista de usuarios com reputacao negativa: ", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet9, "Noob", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("DOZE_ANOS");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens38 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray39 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet40 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet40, itemArray39);
        controllerItens38.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet40, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerItens controllerItens45 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray46 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet47 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet47, itemArray46);
        controllerItens45.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet47, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario52 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str53 = controllerUsuario52.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet54 = controllerUsuario52.todosUsuariosItens();
        controllerItens45.adicionaItem(itemSet54, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens38.adicionaItem(itemSet54, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario70 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str71 = controllerUsuario70.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet72 = controllerUsuario70.todosUsuariosItens();
        java.lang.String str73 = controllerItens38.listarItensOrdenadosPorValor(itemSet72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = controllerItens0.getDetalhesItem(itemSet72, "Caloteiro");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(itemSet26);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(itemSet54);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(itemSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Noob", "Nao emprestado", "Nenhum emprestimos associados ao item", (double) 10, "", (int) (short) 0, "Nao emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (short) -1);
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("Caloteiro", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioEmprestando("Caloteiro, Nao emprestado, ", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = bluRayShow55.toString();
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
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Caloteiro", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoUsuario("Caloteiro, OUTRO, ", "DOZE_ANOS", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("1: OUTRO - Reputacao: 0,00|", "DOZE_ANOS", "Nao emprestado", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.getInfoUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("DOZE_ANOS", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("1: OUTRO - Reputacao: 0,00|", "DOZE_ANOS", "COMPLETO", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.atualizar("Lista de usuarios com reputacao negativa: ", "Caloteiro");
        int int16 = bluRayShow6.getDuracao();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Caloteiro" + "'", str12, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("Noob");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("MUSICAL", "Caloteiro, Nao emprestado, ", "Caloteiro, OUTRO, ", (double) (byte) 1, 1, "COMPLETO", "OUTRO", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens36 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario37 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str38 = controllerUsuario37.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet39 = controllerUsuario37.todosUsuariosItens();
        controllerItens36.adicionaItem(itemSet39, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens43 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray44 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet45 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet45, itemArray44);
        controllerItens43.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet45, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario50 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str51 = controllerUsuario50.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet52 = controllerUsuario50.todosUsuariosItens();
        controllerItens43.adicionaItem(itemSet52, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens36.adicionaItem(itemSet52, "Lista de usuarios com reputacao negativa: ", (double) 7, "Nao emprestado", (int) (short) -1, "Lista de usuarios com reputacao negativa: ", "Nao emprestado", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio(itemSet52, "Caloteiro, Nao emprestado, ", (-11));
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(itemSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(itemSet39);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(itemSet52);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("DOZE_ANOS", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        bluRayShow6.atualizaNumeroEmprestimos();
        int int8 = bluRayShow6.getDuracao();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("Noob");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
            controllerItens0.adicionarBluRayEpisodio(itemSet61, "1: OUTRO - Reputacao: 0,00|", (int) '4');
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.pesquisarDetalhesItem("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("Nao emprestado", "FreeRyder", "COMPLETO", (double) 1, (-1), (int) (short) -1, "Nenhum emprestimos associados ao item", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("Lista de usuarios com reputacao negativa: ", "", "hi!", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("Caloteiro, OUTRO, ");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("", "DOZE_ANOS", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("1: OUTRO - Reputacao: 0,00|", "OUTRO", "Nao emprestado", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("hi!", "hi!", "FreeRyder", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item", "Lista de usuarios com reputacao negativa: ", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("Caloteiro, OUTRO, ", "", "Caloteiro", (double) 52, (int) (short) -1, (int) '4', "1: OUTRO - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Nenhum emprestimos associados ao item", "ROMANCE", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("ROMANCE", "Nenhum emprestimos associados ao item", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facade0.pesquisarDetalhesItem("MUSICAL", "Caloteiro", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("1: OUTRO - Reputacao: 0,00|", "Caloteiro, OUTRO, ", "", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens49 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray50 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet51 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet51, itemArray50);
        controllerItens49.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet51, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario56 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str57 = controllerUsuario56.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet58 = controllerUsuario56.todosUsuariosItens();
        controllerItens49.adicionaItem(itemSet58, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens42.adicionaItem(itemSet58, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario74 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str75 = controllerUsuario74.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet76 = controllerUsuario74.todosUsuariosItens();
        java.lang.String str77 = controllerItens42.listarItensOrdenadosPorValor(itemSet76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = controllerItens0.getInfoItem(itemSet76, "Noob", "MUSICAL");
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
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(itemSet58);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(itemSet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("Caloteiro", "DOZE_ANOS", "DOZE_ANOS", "Nao emprestado", "COMPLETO", "OUTRO", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens66 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray67 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet68 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet68, itemArray67);
        controllerItens66.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet68, "Caloteiro", (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str74 = controllerItens0.getDetalhesItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet68, "DOZE_ANOS");
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
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "hi!", "Lista de usuarios com reputacao negativa: ", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("FreeRyder", "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item", (double) (-1.0f), "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Usuario usuario4 = controllerUsuario0.identificaUsuario("MUSICAL", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.pesquisarDetalhesItem("Nenhum emprestimos associados ao item", "Caloteiro, Nao emprestado, ", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("COMPLETO", "Caloteiro, Nao emprestado, ", "ROMANCE", 0.0d, "Lista de usuarios com reputacao negativa: ", (int) (byte) 100, "", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 1L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("OUTRO", "MUSICAL", "1: ROMANCE - Reputacao: 0,00|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "1: OUTRO - Reputacao: 0,00|", "ROMANCE", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("ROMANCE", "Nenhum emprestimos associados ao item", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro, Nao emprestado, ", "Nao emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nao emprestado", "ROMANCE", "Noob");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.getInfoUsuario("1: ROMANCE - Reputacao: 0,00|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.listarEmprestimosUsuarioEmprestando("FreeRyder", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        lp2.projetofinal.util.Checks.verificaNomeItemVazioNulo("Nao emprestado");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("Caloteiro");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("1: OUTRO - Reputacao: 0,00|", "FreeRyder", "Caloteiro, Nao emprestado, ", (double) 100L, (int) 'a', 1, "Lista de usuarios com reputacao negativa: ", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) (short) 1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Lista de usuarios com reputacao negativa: ", "ROMANCE", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = controllerUsuario0.getInfoUsuario("Nenhum emprestimos associados ao item", "", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.getInfoItem("1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
            java.lang.String str39 = controllerItens0.listarItensOrdenadosPorValor(itemSet38);
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.getInfoUsuario("COMPLETO", "Caloteiro", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Nao emprestado");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = controllerUsuario0.getInfoUsuario("", "1: OUTRO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("COMPLETO", 100.0d, "COMPLETO", (-11), "", "", 1);
        bluRaySerie7.atualizar("Nenhum item pego emprestado", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator1 = ordenaItemEmprestadoAlfabetico0.reversed();
        java.util.Comparator<lp2.projetofinal.entidades.Emprestimo> emprestimoComparator2 = ordenaItemEmprestadoAlfabetico0.reversed();
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
        boolean boolean25 = emprestimo23.equals((java.lang.Object) (-1.0f));
        int int26 = emprestimo23.getNumeroDias();
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
        int int49 = emprestimo47.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie51 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean52 = emprestimo47.equals((java.lang.Object) episodioSerie51);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo23, emprestimo47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(emprestimoComparator1);
        org.junit.Assert.assertNotNull(emprestimoComparator2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Caloteiro" + "'", str43, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarUsuario("1: ROMANCE - Reputacao: 0,00|", "Caloteiro, OUTRO, ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        java.lang.String str4 = facade0.listarTop10PioresUsuarios();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facade0.getInfoUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Lista de usuarios com reputacao negativa: ", "FreeRyder");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = controllerUsuario0.getInfoUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: ROMANCE - Reputacao: 0,00|", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa((int) 'a');
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("", "COMPLETO", "Noob", (double) 10, "OUTRO", 0, "1: ROMANCE - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        lp2.projetofinal.util.Checks.verificaNumeroFaixasZeroNegativo(10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        java.lang.String str37 = controllerItens17.listarTop10Itens(itemSet36);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario38 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str39 = controllerUsuario38.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet40 = controllerUsuario38.todosUsuariosItens();
        java.lang.String str41 = controllerItens17.listarTop10Itens(itemSet40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = controllerItens0.getDetalhesItem(itemSet40, "Nenhum item pego emprestado");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(itemSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo(5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioPegandoEmprestado("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario25 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str26 = controllerUsuario25.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet27 = controllerUsuario25.todosUsuariosItens();
        controllerItens24.adicionaItem(itemSet27, "Nenhum emprestimos associados ao item", (double) 100);
        lp2.projetofinal.controllers.ControllerItens controllerItens31 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray32 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet33 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet33, itemArray32);
        controllerItens31.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet33, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario38 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str39 = controllerUsuario38.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet40 = controllerUsuario38.todosUsuariosItens();
        controllerItens31.adicionaItem(itemSet40, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens24.adicionaItem(itemSet40, "Lista de usuarios com reputacao negativa: ", (double) 7, "Nao emprestado", (int) (short) -1, "Lista de usuarios com reputacao negativa: ", "Nao emprestado", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item57 = controllerItens0.identificaItem(itemSet40, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(itemSet27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(itemSet40);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = facade0.listarEmprestimosUsuarioEmprestando("Caloteiro, OUTRO, ", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.String str86 = controllerItens66.listarTop10Itens(itemSet85);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario87 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str88 = controllerUsuario87.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet89 = controllerUsuario87.todosUsuariosItens();
        java.lang.String str90 = controllerItens66.listarTop10Itens(itemSet89);
        controllerItens0.adicionaItem(itemSet89, "Noob", 0.0d, "");
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
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(itemSet75);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(itemSet85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(itemSet89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Caloteiro");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        java.lang.String str1 = cartaoNoob0.getNomeCartao();
        int int2 = cartaoNoob0.prazoEmprestimo();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Noob" + "'", str1, "Noob");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarBluRay("1: OUTRO - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ", "DOZE_ANOS", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Nenhum item pego emprestado");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("1: ROMANCE - Reputacao: 0,00|", "Caloteiro, OUTRO, ", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nao emprestado", "1: OUTRO - Reputacao: 0,00|", "Lista de usuarios com reputacao negativa: ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        sistema0.cadastrarUsuario("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "DOZE_ANOS", "Caloteiro, Nao emprestado, ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("1: OUTRO - Reputacao: 0,00|", "FreeRyder", "", (double) (-1.0f), "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("Nenhum item pego emprestado", "MUSICAL", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.pesquisarDetalhesItem("1: ROMANCE - Reputacao: 0,00|", "OUTRO", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("Noob", "Nao emprestado", "hi!", 1.0d, (int) ' ', (int) (short) 100, "Lista de usuarios com reputacao negativa: ", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("hi!", "", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "COMPLETO", (double) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Caloteiro, OUTRO, ", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
            java.lang.String str97 = sistema86.getInfoUsuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "ROMANCE", "Noob");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet2 = controllerUsuario0.todosUsuariosItens();
        controllerUsuario0.cadastrarUsuario("", "Caloteiro, OUTRO, ", "Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("Nenhum item pego emprestado", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(itemSet2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.listarEmprestimosUsuarioPegandoEmprestado("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Nenhum emprestimos associados ao item", "Lista de usuarios com reputacao negativa: ", "Caloteiro, OUTRO, ", (double) 1L, "1: OUTRO - Reputacao: 0,00|", 1, "ROMANCE", "Caloteiro", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Temporada invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens33 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray34 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet35 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet35, itemArray34);
        controllerItens33.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet35, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario40 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str41 = controllerUsuario40.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet42 = controllerUsuario40.todosUsuariosItens();
        controllerItens33.adicionaItem(itemSet42, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens50 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray51 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet52 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet52, itemArray51);
        controllerItens50.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet52, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario57 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str58 = controllerUsuario57.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet59 = controllerUsuario57.todosUsuariosItens();
        controllerItens50.adicionaItem(itemSet59, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario67 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str68 = controllerUsuario67.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet69 = controllerUsuario67.todosUsuariosItens();
        controllerItens50.adicionaItem(itemSet69, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str74 = controllerItens33.listarItensNaoEmprestados(itemSet69);
        java.lang.String str75 = controllerItens1.listarItensOrdenadosPorValor(itemSet69);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.adicionarBluRayEpisodio(itemSet69, "OUTRO", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Item nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(itemSet17);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(itemSet42);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(itemSet59);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(itemSet69);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str74, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str75, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
            sistema86.atualizarUsuario("", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("MUSICAL", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) (short) 10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens60 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray61 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet62 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet62, itemArray61);
        controllerItens60.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet62, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario67 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str68 = controllerUsuario67.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet69 = controllerUsuario67.todosUsuariosItens();
        controllerItens60.adicionaItem(itemSet69, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens53.adicionaItem(itemSet69, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item86 = controllerItens0.identificaItem(itemSet69, "");
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
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(itemSet69);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        boolean boolean23 = emprestimo21.equals((java.lang.Object) (-1.0f));
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
        lp2.projetofinal.entidades.Usuario usuario45 = emprestimo44.getDonoDoItem();
        int int46 = emprestimo44.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie48 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean49 = emprestimo44.equals((java.lang.Object) episodioSerie48);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo21, emprestimo44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Caloteiro" + "'", str40, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("Caloteiro");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("1: OUTRO - Reputacao: 0,00|", "Caloteiro, Nao emprestado, ", "Nenhum item pego emprestado", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("hi!", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, Nao emprestado, ", (double) 10.0f, "Caloteiro, OUTRO, ", (int) ' ', "Lista de usuarios com reputacao negativa: ", "1: ROMANCE - Reputacao: 0,00|", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        controllerItens54.adicionaItem(itemSet80, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.removerItem(itemSet80, "FreeRyder");
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
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(itemSet70);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(itemSet80);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str7 = bluRayShow6.getEstado();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nao emprestado" + "'", str7, "Nao emprestado");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        int int1 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        int int3 = cartaoNoob0.prazoEmprestimo();
        java.lang.String str4 = cartaoNoob0.getNomeCartao();
        boolean boolean5 = cartaoNoob0.permisaoPegarEmprestado();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Noob" + "'", str4, "Noob");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("COMPLETO", "Noob", "Caloteiro, Nao emprestado, ", (double) (short) 0, "Nenhum item pego emprestado", (int) (short) 0, "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        lp2.projetofinal.util.Checks.verificaTemporadaZeroNegativa(1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("COMPLETO", "FreeRyder", "DOZE_ANOS", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens66 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray67 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet68 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet68, itemArray67);
        controllerItens66.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet68, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario73 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str74 = controllerUsuario73.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet75 = controllerUsuario73.todosUsuariosItens();
        controllerItens66.adicionaItem(itemSet75, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens83 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray84 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet85 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet85, itemArray84);
        controllerItens83.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet85, "Caloteiro", (-1.0d));
        java.lang.String str90 = controllerItens66.listarItensOrdenadosPorValor((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet85);
        controllerItens0.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet85, "ROMANCE", (double) (-1), "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (int) '#', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: OUTRO - Reputacao: 0,00|", 100);
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
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(itemSet75);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|" + "'", str90, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico5 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean6 = usuario3.equals((java.lang.Object) plataformaJogoEletronico5);
        usuario3.setTelefone("Caloteiro");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("DOZE_ANOS");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        double double12 = bluRayShow6.getPreco();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente13 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente35 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario39 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str40 = usuario39.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario44 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int45 = ordenaUsuarioReputacaoCrescente35.compare(usuario39, usuario44);
        lp2.projetofinal.entidades.Usuario usuario49 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str50 = usuario49.getTelefone();
        java.lang.String str51 = usuario49.getNome();
        lp2.projetofinal.entidades.Item item52 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo55 = new lp2.projetofinal.entidades.Emprestimo(usuario44, usuario49, item52, "OUTRO", 100);
        usuario49.atualizaReputacao((double) (short) -1, false);
        int int59 = ordenaUsuarioReputacaoCrescente13.compare(usuario23, usuario49);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente60 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str65 = usuario64.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario69 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int70 = ordenaUsuarioReputacaoCrescente60.compare(usuario64, usuario69);
        usuario69.setTelefone("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente73 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario77 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str78 = usuario77.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario82 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int83 = ordenaUsuarioReputacaoCrescente73.compare(usuario77, usuario82);
        lp2.projetofinal.entidades.Usuario usuario87 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str88 = usuario87.getTelefone();
        java.lang.String str89 = usuario87.getNome();
        lp2.projetofinal.entidades.Item item90 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo93 = new lp2.projetofinal.entidades.Emprestimo(usuario82, usuario87, item90, "OUTRO", 100);
        usuario87.atualizaReputacao((double) (-1), true);
        int int97 = ordenaUsuarioReputacaoCrescente13.compare(usuario69, usuario87);
        java.lang.String str98 = usuario69.getEmail();
        boolean boolean99 = bluRayShow6.equals((java.lang.Object) usuario69);
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Caloteiro" + "'", str30, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Caloteiro" + "'", str51, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Caloteiro" + "'", str89, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "OUTRO" + "'", str98, "OUTRO");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("DOZE_ANOS");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = facade0.listarEmprestimosUsuarioPegandoEmprestado("Caloteiro", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("MUSICAL", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa((int) ' ');
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("Nao emprestado");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("Nenhum item pego emprestado");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("FreeRyder");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens45 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray46 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet47 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet47, itemArray46);
        controllerItens45.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet47, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario52 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str53 = controllerUsuario52.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet54 = controllerUsuario52.todosUsuariosItens();
        controllerItens45.adicionaItem(itemSet54, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerItens controllerItens62 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray63 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet64 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet64, itemArray63);
        controllerItens62.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet64, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario69 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str70 = controllerUsuario69.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet71 = controllerUsuario69.todosUsuariosItens();
        controllerItens62.adicionaItem(itemSet71, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario79 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str80 = controllerUsuario79.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet81 = controllerUsuario79.todosUsuariosItens();
        controllerItens62.adicionaItem(itemSet81, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str86 = controllerItens45.listarItensNaoEmprestados(itemSet81);
        controllerItens21.adicionaItem(itemSet81, "DOZE_ANOS", (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item91 = controllerItens0.identificaItem(itemSet81, "Nenhum emprestimos associados ao item");
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
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(itemSet30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(itemSet40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(itemSet54);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(itemSet71);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(itemSet81);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|" + "'", str86, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizaReputacao("Lista de usuarios com reputacao negativa: ", "1: OUTRO - Reputacao: 0,00|", 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRaySerie("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS", (double) 0, "", 7, "Caloteiro, Nao emprestado, ", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("OUTRO", "Lista de usuarios com reputacao negativa: ", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facade0.getInfoUsuario("Caloteiro, OUTRO, ", "Noob", "OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Genero nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        java.lang.Class<?> wildcardClass9 = bluRaySerie7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        lp2.projetofinal.util.Checks.verificaNomeVazioNulo("Noob");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        controllerEmprestimos0.salvarListaEmprestimos();
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaAnoLancamentoZeroNegativo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ano lancamento invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        sistema0.inicializar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("1: ROMANCE - Reputacao: 0,00|", "Noob", "", (double) (-1.0f), 52, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Nenhum emprestimos associados ao item", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("Noob", "FreeRyder", "", "ROMANCE", "OUTRO", "Lista de usuarios com reputacao negativa: ", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10Itens();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "FreeRyder", "Caloteiro", (double) 1L, (int) (short) 0, 5, "MUSICAL", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Exceptions.usuarioImpossibilitadoDePegarItemNessePeriodoException();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario impossiblitado de pegar emprestado por esse periodo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("Nenhum item pego emprestado", "Noob", "DOZE_ANOS", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("Caloteiro, Nao emprestado, ");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str2 = controllerEmprestimos0.listarEmprestimosItens("Nenhum emprestimos associados ao item");
        controllerEmprestimos0.salvarListaEmprestimos();
        lp2.projetofinal.entidades.Usuario usuario7 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente8 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str13 = usuario12.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario17 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int18 = ordenaUsuarioReputacaoCrescente8.compare(usuario12, usuario17);
        lp2.projetofinal.entidades.Usuario usuario22 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str23 = usuario22.getTelefone();
        java.lang.String str24 = usuario22.getNome();
        lp2.projetofinal.entidades.Item item25 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo28 = new lp2.projetofinal.entidades.Emprestimo(usuario17, usuario22, item25, "OUTRO", 100);
        lp2.projetofinal.entidades.Emprestimo emprestimo30 = new lp2.projetofinal.entidades.Emprestimo(usuario7, usuario17, "Nenhum item pego emprestado");
        lp2.projetofinal.entidades.Usuario usuario34 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico36 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean37 = usuario34.equals((java.lang.Object) plataformaJogoEletronico36);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo39 = controllerEmprestimos0.identificaEmprestimo(usuario17, usuario34, "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Caloteiro" + "'", str24, "Caloteiro");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico36 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico36.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarCaloteiros();
        java.lang.String str3 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Lista de usuarios com reputacao negativa: ", "ROMANCE", "Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("FreeRyder", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str2, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
            controllerItens0.atualizarItem(itemSet36, "Caloteiro", "1: ROMANCE - Reputacao: 0,00|", "");
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.pesquisarDetalhesItem("Nenhum item pego emprestado", "MUSICAL", "FreeRyder");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("Nenhum item pego emprestado");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.adicionarBluRay((int) (byte) 0);
        bluRaySerie7.adicionarBluRay(10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ROMANCE" + "'", str9, "ROMANCE");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.registrarEmprestimo("1: ROMANCE - Reputacao: 0,00|", "COMPLETO", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Caloteiro, OUTRO, ", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("OUTRO");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sistema0.pesquisarDetalhesItem("Noob", "Caloteiro, Nao emprestado, ", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sistema0.listarEmprestimosUsuarioEmprestando("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("OUTRO");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, Nao emprestado, ", "Nenhum item pego emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Object obj28 = null;
        boolean boolean29 = emprestimo20.equals(obj28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(usuario27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("DOZE_ANOS");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.cadastrarUsuario("", "", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("Caloteiro, Nao emprestado, ", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "", "BomAmigo", (double) (short) 100, (int) (short) 100, "Caloteiro, Nao emprestado, ", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("Nenhum item pego emprestado", "PC", "Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "COMPLETO", "DOZE_ANOS", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.listarEmprestimosUsuarioEmprestando("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("", "COMPLETO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Nenhum item pego emprestado", "Lista de usuarios com reputacao negativa: ", "MUSICAL", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str4 = facade0.listarEmprestimosItem("OUTRO");
        facade0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("Caloteiro", "Lista de usuarios com reputacao negativa: ", "Caloteiro, Nenhum emprestimos associados ao item, ", (double) '#', 52, "1: ROMANCE - Reputacao: 0,00|", "COMPLETO", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str4, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = emprestimo20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Caloteiro" + "'", str16, "Caloteiro");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente9 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente10 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator11 = ordenaUsuarioReputacaoCrescente9.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente10);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator12 = ordenaUsuarioReputacaoCrescente7.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente9);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator14 = ordenaUsuarioReputacaoCrescente7.thenComparing(usuarioComparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(usuarioComparator11);
        org.junit.Assert.assertNotNull(usuarioComparator12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        int int51 = emprestimo49.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie53 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean54 = emprestimo49.equals((java.lang.Object) episodioSerie53);
        int int55 = emprestimo49.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario56 = emprestimo49.getDonoDoItem();
        // The following exception was thrown during execution in test generation
        try {
            int int57 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo28, emprestimo49);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(usuario56);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("Lista de usuarios com reputacao negativa: ", "Nao emprestado");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie10 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str12 = bluRaySerie10.getInfo("Nao emprestado");
        boolean boolean13 = chaveNomeTelefone2.equals((java.lang.Object) str12);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facade0.listarEmprestimosUsuarioPegandoEmprestado("Nenhum item pego emprestado", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1: ROMANCE - Reputacao: 0,00|" + "'", str10, "1: ROMANCE - Reputacao: 0,00|");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Nenhum item pego emprestado", "Caloteiro, Nenhum emprestimos associados ao item, ", "", "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        lp2.projetofinal.util.Checks.verificaClassificacaoVaziaNula("ROMANCE");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = facade0.getInfoUsuario("Caloteiro, OUTRO, ", "FreeRyder", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("ROMANCE");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensNaoEmprestados();
        facade0.fecharSistema();
        java.lang.String str7 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("Nenhum item pego emprestado", "Nenhum emprestimos associados ao item", "ROMANCE", "Caloteiro, MUSICAL, ", "OUTRO", "Caloteiro, MUSICAL, ", (int) '4');
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("Lista de usuarios com reputacao negativa: ", "1: OUTRO - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("Nenhum item pego emprestado", "Noob", "OUTRO", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarItem("ROMANCE", "Noob", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Nenhum emprestimos associados ao item", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("hi!", "Lista de usuarios com reputacao negativa: ", "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.listarEmprestimosUsuarioEmprestando("Nenhum item pego emprestado", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = facade0.listarEmprestimosUsuarioEmprestando("COMPLETO", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Caloteiro, Nenhum emprestimos associados ao item, ", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("OUTRO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "1: OUTRO - Reputacao: 0,00|", "", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("PC", "1: OUTRO - Reputacao: 0,00|", "Noob", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRaySerie("Caloteiro, MUSICAL, ", "Lista de usuarios com reputacao negativa: ", "PC", (double) 10, "Nenhum item pego emprestado", 1, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "BomAmigo", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("ROMANCE");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarBluRay("COMPLETO", "PC", "1: ROMANCE - Reputacao: 0,00|", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        lp2.projetofinal.util.Checks.verificaDescricaoVaziaNula("Nenhum item pego emprestado");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str8 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerUsuario("Nenhum emprestimos associados ao item", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.POLICIAL;
        java.lang.String str1 = generoBluRay0.getGenero();
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.POLICIAL + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.POLICIAL));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "POLICIAL" + "'", str1, "POLICIAL");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("Caloteiro, MUSICAL, ");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("hi!", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10Itens();
        java.lang.String str3 = facade0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facade0.getInfoItem("ROMANCE", "1: ROMANCE - Reputacao: 0,00|", "1: ROMANCE - Reputacao: 0,00|", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
            java.lang.String str13 = facade0.getInfoItem("", "ROMANCE", "Caloteiro, Nenhum emprestimos associados ao item, ", "Caloteiro, Nenhum emprestimos associados ao item, ");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarTop10MelhoresUsuarios();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("Nenhum item pego emprestado", "Caloteiro, Nenhum emprestimos associados ao item, ", "Caloteiro, OUTRO, ", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        controllerUsuario0.salvarMapaUsuarios();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("Caloteiro, OUTRO, ", "1: ROMANCE - Reputacao: 0,00|", "", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("COMPLETO");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        lp2.projetofinal.util.Checks.verificaDataDevolucaoVaziaNula("Noob");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.removerItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Caloteiro, OUTRO, ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("MUSICAL", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Noob", "COMPLETO", "Noob", "hi!", "Nao emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("DOZE_ANOS");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro0 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        java.lang.String str1 = cartaoCaloteiro0.getNomeCartao();
        int int2 = cartaoCaloteiro0.prazoEmprestimo();
        boolean boolean3 = cartaoCaloteiro0.permisaoPegarEmprestado();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Caloteiro" + "'", str1, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        lp2.projetofinal.entidades.Usuario usuario28 = emprestimo21.getDonoDoItem();
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
        int int51 = emprestimo49.getNumeroDias();
        lp2.projetofinal.entidades.EpisodioSerie episodioSerie53 = new lp2.projetofinal.entidades.EpisodioSerie(10);
        boolean boolean54 = emprestimo49.equals((java.lang.Object) episodioSerie53);
        emprestimo49.setDataDevolucao("Caloteiro, OUTRO, ");
        // The following exception was thrown during execution in test generation
        try {
            int int57 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo21, emprestimo49);
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
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Caloteiro" + "'", str45, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.removerUsuario("", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        int int9 = bluRayFilme6.getAnoLancamento();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OUTRO" + "'", str7, "OUTRO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OUTRO" + "'", str8, "OUTRO");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        lp2.projetofinal.util.Checks.verificaGeneroVazioNulo("Caloteiro, MUSICAL, ");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "DOZE_ANOS", (double) (-1L), "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro2 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str3 = jogoTabuleiro2.contemPecasPerdidas();
        java.lang.Class<?> wildcardClass4 = jogoTabuleiro2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COMPLETO" + "'", str3, "COMPLETO");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        java.lang.String str3 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("COMPLETO", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay1 = lp2.projetofinal.enums.GeneroBluRay.indentificaGenero("DOZE_ANOS");
        org.junit.Assert.assertTrue("'" + generoBluRay1 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.OUTRO + "'", generoBluRay1.equals(lp2.projetofinal.enums.GeneroBluRay.OUTRO));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "Nenhum item pego emprestado", "DOZE_ANOS", "1: OUTRO - Reputacao: 0,00|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        controllerUsuario0.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("Emprestado", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("POLICIAL", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.devolverItem("1: ROMANCE - Reputacao: 0,00|", "Nenhum item pego emprestado", "1: OUTRO - Reputacao: 0,00|", "Caloteiro, OUTRO, ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Nao emprestado", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        bluRayShow31.itemEmprestado();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + classificacaoBluRay20 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay20.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Caloteiro" + "'", str32, "Caloteiro");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.removerUsuario("Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        lp2.projetofinal.util.Checks.verificaPecaVaziaNula("PC");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        java.lang.String str1 = controllerEmprestimos0.listarItensEmprestados();
        java.lang.String str2 = controllerEmprestimos0.listarItensEmprestados();
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
        usuario12.setNome("Caloteiro, Nao emprestado, ");
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
        usuario35.setEmail("OUTRO");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie56 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str58 = bluRaySerie56.getInfo("Nao emprestado");
        java.lang.String str59 = bluRaySerie56.getNome();
        // The following exception was thrown during execution in test generation
        try {
            int int62 = controllerEmprestimos0.devolverItem(usuario12, usuario35, (lp2.projetofinal.entidades.Item) bluRaySerie56, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Caloteiro" + "'", str19, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Caloteiro" + "'", str42, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Noob" + "'", str59, "Noob");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay1 = lp2.projetofinal.enums.ClassificacaoBluRay.indentificaClassificacao("JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
        org.junit.Assert.assertNull(classificacaoBluRay1);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("1: OUTRO - Reputacao: 0,00|", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "POLICIAL", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarTop10Itens();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarUsuario("Lista de usuarios com reputacao negativa: ", "Nenhum emprestimos associados ao item", "BomAmigo", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Periodo nao pode zero ou negativo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        lp2.projetofinal.util.Checks.verificaAtributolVazioNulo("OUTRO");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        lp2.projetofinal.util.Checks.verificaTelefoneVazioNulo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        controllerItens0.adicionaItem(itemSet85, "ROMANCE", (double) (short) 1, "1: OUTRO - Reputacao: 0,00|");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        lp2.projetofinal.entidades.CartaoNoob cartaoNoob0 = new lp2.projetofinal.entidades.CartaoNoob();
        java.lang.String str1 = cartaoNoob0.getNomeCartao();
        java.lang.String str2 = cartaoNoob0.getNomeCartao();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Noob" + "'", str1, "Noob");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Noob" + "'", str2, "Noob");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay0 = lp2.projetofinal.enums.ClassificacaoBluRay.QUATORZE_ANOS;
        java.lang.String str1 = classificacaoBluRay0.getClassificacao();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay0 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.QUATORZE_ANOS + "'", classificacaoBluRay0.equals(lp2.projetofinal.enums.ClassificacaoBluRay.QUATORZE_ANOS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "QUATORZE_ANOS" + "'", str1, "QUATORZE_ANOS");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens32 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray33 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet34 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet34, itemArray33);
        controllerItens32.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet34, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario39 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str40 = controllerUsuario39.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet41 = controllerUsuario39.todosUsuariosItens();
        controllerItens32.adicionaItem(itemSet41, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens25.adicionaItem(itemSet41, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario57 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str58 = controllerUsuario57.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet59 = controllerUsuario57.todosUsuariosItens();
        java.lang.String str60 = controllerItens25.listarItensOrdenadosPorValor(itemSet59);
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Item item62 = controllerItens0.identificaItem(itemSet59, "ROMANCE");
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
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(itemSet59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        java.lang.String str3 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("Nao emprestado", "Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (double) ' ', "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        lp2.projetofinal.entidades.Usuario usuario30 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "1: OUTRO - Reputacao: 0,00|", "hi!");
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
        lp2.projetofinal.entidades.Usuario usuario52 = emprestimo51.getDonoDoItem();
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
        lp2.projetofinal.entidades.Usuario usuario77 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str78 = usuario77.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo80 = new lp2.projetofinal.entidades.Emprestimo(usuario67, usuario77, "1: OUTRO - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet81 = usuario67.retornaSeusItens();
        lp2.projetofinal.entidades.Emprestimo emprestimo83 = new lp2.projetofinal.entidades.Emprestimo(usuario52, usuario67, "COMPLETO");
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo85 = controllerEmprestimos0.identificaEmprestimo(usuario30, usuario67, "Noob");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Caloteiro" + "'", str47, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Caloteiro" + "'", str69, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(itemSet81);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario64 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str65 = controllerUsuario64.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet66 = controllerUsuario64.todosUsuariosItens();
        java.lang.String str67 = controllerItens32.listarItensOrdenadosPorValor(itemSet66);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem(itemSet66, "Noob", "hi!", "ROMANCE");
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(itemSet66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.lang.String str20 = usuario10.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario24 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico26 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean27 = usuario24.equals((java.lang.Object) plataformaJogoEletronico26);
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
        usuario50.setEmail("Nao emprestado");
        int int53 = usuario24.compareTo(usuario50);
        java.lang.String str54 = usuario24.getNome();
        double double55 = usuario24.getReputacao();
        // The following exception was thrown during execution in test generation
        try {
            lp2.projetofinal.entidades.Emprestimo emprestimo57 = controllerEmprestimos0.identificaEmprestimo(usuario10, usuario24, "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Emprestimo nao encontrado");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str2, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertNotNull(usuarioComparator6);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico12 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico12.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico26 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico26.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Caloteiro" + "'", str44, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario49);
        org.junit.Assert.assertNotNull(usuario50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Caloteiro" + "'", str54, "Caloteiro");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.atualizarUsuario("", "BomAmigo", "", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        java.lang.String str2 = facade0.listarTop10PioresUsuarios();
        java.lang.String str3 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarEletronico("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, Nenhum emprestimos associados ao item, ", "MUSICAL", (double) (-1L), "PC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayFilme("FreeRyder", "Caloteiro, Nao emprestado, ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (double) ' ', (-1), "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duracao invalida");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder0 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int1 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str2 = cartaoFreeRyder0.getNomeCartao();
        java.lang.String str3 = cartaoFreeRyder0.getNomeCartao();
        int int4 = cartaoFreeRyder0.prazoEmprestimo();
        java.lang.String str5 = cartaoFreeRyder0.getNomeCartao();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FreeRyder" + "'", str2, "FreeRyder");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FreeRyder" + "'", str3, "FreeRyder");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FreeRyder" + "'", str5, "FreeRyder");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        lp2.projetofinal.util.Checks.verificaDataEmprestimoVaziaNula("Nenhum item pego emprestado");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.Object obj4 = null;
        boolean boolean5 = usuario3.equals(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("1: ROMANCE - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: OUTRO - Reputacao: 0,00|", (double) (-1), 5, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Caloteiro, Nenhum emprestimos associados ao item, ", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.pesquisarDetalhesItem("1: OUTRO - Reputacao: 0,00|", "DOZE_ANOS", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        java.lang.String str7 = facade0.listarEmprestimosItem("Caloteiro");
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarJogoTabuleiro("hi!", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Noob", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str7, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarItensEmprestados();
        java.lang.String str4 = facade0.listarCaloteiros();
        java.lang.String str5 = facade0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facade0.getInfoItem("Emprestado", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "POLICIAL", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str4, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarBluRayShow("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "MUSICAL", "Caloteiro, Nenhum emprestimos associados ao item, ", 10.0d, (int) '#', 35, "COMPLETO", "COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("OUTRO", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "1: ROMANCE - Reputacao: 0,00|", (double) 1.0f, "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        lp2.projetofinal.util.Checks.verificaArtistaVazioNulo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensEmprestados();
        java.lang.String str4 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarJogoTabuleiro("Lista de usuarios com reputacao negativa: ", "DOZE_ANOS", "Nenhum emprestimos associados ao item", (double) (short) 10);
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        lp2.projetofinal.util.Checks.verificaPeriodoZeradoOuNegativo(7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.cadastrarEletronico("Caloteiro, Nenhum emprestimos associados ao item, ", "Lista de usuarios com reputacao negativa: ", "QUATORZE_ANOS", 52.0d, "Caloteiro, Nao emprestado, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.getInfoItem("POLICIAL", "", "", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarItensOrdenadosPorNome();
        java.lang.String str6 = facade0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            facade0.adicionarPecaPerdida("BomAmigo", "Caloteiro, Nao emprestado, ", "", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome item nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str7 = sistema0.listarCaloteiros();
        java.lang.String str8 = sistema0.listarItensOrdenadosPorNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sistema0.listarEmprestimosUsuarioEmprestando("DOZE_ANOS", "Lista de usuarios com reputacao negativa: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str6, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        lp2.projetofinal.enums.GeneroBluRay generoBluRay0 = lp2.projetofinal.enums.GeneroBluRay.DRAMA;
        org.junit.Assert.assertTrue("'" + generoBluRay0 + "' != '" + lp2.projetofinal.enums.GeneroBluRay.DRAMA + "'", generoBluRay0.equals(lp2.projetofinal.enums.GeneroBluRay.DRAMA));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensEmprestados();
        facade0.cadastrarUsuario("ROMANCE", "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "DOZE_ANOS");
        java.lang.String str10 = facade0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facade0.pesquisarDetalhesItem("MUSICAL", "MUSICAL", "Caloteiro, MUSICAL, ");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.itemEmprestado();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        lp2.projetofinal.util.Checks.verificaValorVazioNulo("PC");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("DOZE_ANOS", "Nenhum item pego emprestado", "Caloteiro, Nenhum emprestimos associados ao item, ", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Caloteiro, Nenhum emprestimos associados ao item, ", "OUTRO", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str3 = facade0.listarEmprestimosItem("OUTRO");
        java.lang.String str4 = facade0.listarItensOrdenadosPorValor();
        java.lang.String str5 = facade0.listarItensOrdenadosPorValor();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayShow("MUSICAL", "Noob", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", (double) 0, (-1), (int) (short) -1, "1: OUTRO - Reputacao: 0,00|", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Preco invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str3, "Nenhum emprestimos associados ao item");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico14 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean15 = usuario12.equals((java.lang.Object) plataformaJogoEletronico14);
        usuario12.setEmail("Nenhum emprestimos associados ao item");
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) usuario12);
        java.lang.String str20 = bluRaySerie7.getInfo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        int int21 = bluRaySerie7.duracaoTotal();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nao emprestado" + "'", str8, "Nao emprestado");
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico14 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico14.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        lp2.projetofinal.util.Checks.verificaPrecoZeroNegativo((double) '#');
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet25 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.cadastrarPecaPerdidaNoTabuleiro(itemSet25, "COMPLETO", "Caloteiro");
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
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        lp2.projetofinal.util.Checks.verificaEmailVazioNulo("Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        lp2.projetofinal.util.Checks.verificaPlataformaVaziaNula("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        sistema0.finalizar();
        java.lang.String str6 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str7 = sistema0.listarItensOrdenadosPorNome();
        java.lang.String str9 = sistema0.listarEmprestimosItem("Lista de usuarios com reputacao negativa: ");
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("hi!", "Nao emprestado", "Nenhum item pego emprestado", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sistema0.pesquisarDetalhesItem("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "MUSICAL", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        java.lang.String str3 = facade0.listarTop10Itens();
        facade0.iniciarSistema();
        java.lang.String str5 = facade0.listarTop10PioresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            facade0.registrarEmprestimo("1: OUTRO - Reputacao: 0,00|", "BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Nenhum emprestimos associados ao item", "PC", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sistema0.pesquisarDetalhesItem("", "Lista de usuarios com reputacao negativa: ", "ROMANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.String str33 = usuario3.getNome();
        usuario3.atualizaReputacao((double) (byte) 0, true);
        org.junit.Assert.assertTrue("'" + plataformaJogoEletronico5 + "' != '" + lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO + "'", plataformaJogoEletronico5.equals(lp2.projetofinal.enums.PlataformaJogoEletronico.OUTRO));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Caloteiro" + "'", str23, "Caloteiro");
        org.junit.Assert.assertNotNull(usuario28);
        org.junit.Assert.assertNotNull(usuario29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Caloteiro" + "'", str33, "Caloteiro");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        java.lang.Class<?> wildcardClass9 = bluRayShow6.getClass();
        org.junit.Assert.assertTrue("'" + classificacaoBluRay7 + "' != '" + lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS + "'", classificacaoBluRay7.equals(lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facade0.getInfoItem("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Noob", "Caloteiro, OUTRO, ", "POLICIAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarItensEmprestados();
        java.lang.String str7 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.getInfoItem("Caloteiro", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Nenhum item pego emprestado", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Atributo nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str7, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario43 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str44 = controllerUsuario43.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet45 = controllerUsuario43.todosUsuariosItens();
        controllerItens42.adicionaItem(itemSet45, "Nenhum emprestimos associados ao item", (double) 100);
        java.lang.String str49 = controllerItens25.listarItensOrdenadosPorNome(itemSet45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = controllerItens0.getInfoItem(itemSet45, "1: ROMANCE - Reputacao: 0,00|", "BomAmigo");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(itemSet45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|" + "'", str49, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        lp2.projetofinal.util.Checks.verificaDuracaoZeroNegativa(10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        java.lang.String str7 = sistema0.listarItensEmprestados();
        java.lang.String str8 = sistema0.listarCaloteiros();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.pesquisarDetalhesItem("", "Emprestado", "Noob");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Nome usuario nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str8, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = controllerItens0.listarTop10Itens(itemSet24);
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
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str1 = controllerUsuario0.listarCaloteiros();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        controllerUsuario0.cadastrarUsuario("Nenhum emprestimos associados ao item", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificadisponibilidadeUsuario("Lista de usuarios com reputacao negativa: ", "Nenhum item pego emprestado", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str1, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        lp2.projetofinal.controllers.ControllerItens controllerItens32 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray33 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet34 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet34, itemArray33);
        controllerItens32.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet34, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario39 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str40 = controllerUsuario39.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet41 = controllerUsuario39.todosUsuariosItens();
        controllerItens32.adicionaItem(itemSet41, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        controllerItens25.adicionaItem(itemSet41, "Nenhum emprestimos associados ao item", (double) 1, "ROMANCE", (int) 'a', "ROMANCE", "OUTRO", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            controllerItens0.atualizarItem(itemSet41, "Nenhum item pego emprestado", "1:  - Reputacao: 0,00|", "Caloteiro, OUTRO, ");
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
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(itemSet41);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
            sistema3.adicionarBluRay("", "FreeRyder", "Nenhum item emprestado", (int) (short) 0);
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensNaoEmprestados();
        java.lang.String str3 = sistema0.listarItensNaoEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.atualizarItem("hi!", "Caloteiro, MUSICAL, ", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Emprestado", "Nenhum emprestimos associados ao item");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.lang.String str60 = usuario39.getTelefone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Caloteiro" + "'", str17, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Caloteiro" + "'", str41, "Caloteiro");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str56, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        sistema0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sistema0.listarEmprestimosUsuarioEmprestando("Lista de usuarios com reputacao negativa: ", "Caloteiro, OUTRO, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("DOZE_ANOS", (double) (short) 10, (int) (short) 10, "ROMANCE", "", (int) (short) 100);
        int int7 = bluRayShow6.getDuracao();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            sistema0.adicionarPecaPerdida("1:  - Reputacao: 0,00|", "", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "DOZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario0 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario0.salvarMapaUsuarios();
        java.lang.String str2 = controllerUsuario0.listarTop10MelhoresUsuarios();
        controllerUsuario0.carregaMapaUsuarios();
        java.lang.String str4 = controllerUsuario0.listarTop10PioresUsuarios();
        java.lang.String str5 = controllerUsuario0.listarTop10MelhoresUsuarios();
        // The following exception was thrown during execution in test generation
        try {
            controllerUsuario0.verificaFidelidadeUsuario("Lista de usuarios com reputacao negativa: ", "Caloteiro, Nenhum emprestimos associados ao item, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        java.lang.String str1 = facade0.listarTop10PioresUsuarios();
        facade0.iniciarSistema();
        facade0.fecharSistema();
        // The following exception was thrown during execution in test generation
        try {
            facade0.devolverItem("BomAmigo", "COMPLETO", "MUSICAL", "1:  - Reputacao: 0,00|", "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "Lista de usuarios com reputacao negativa: ", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.cadastrarBluRayFilme("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "", "DOZE_ANOS", (double) ' ', (int) '#', "DOZE_ANOS", "", (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Telefone nao pode ser vazio ou nulo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        java.lang.String str1 = sistema0.listarItensEmprestados();
        java.lang.String str2 = sistema0.listarItensEmprestados();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sistema0.pesquisarDetalhesItem("Emprestado", "Lista de usuarios com reputacao negativa: ", "QUATORZE_ANOS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        lp2.projetofinal.facade.Facade facade0 = new lp2.projetofinal.facade.Facade();
        facade0.fecharSistema();
        java.lang.String str2 = facade0.listarItensEmprestados();
        java.lang.String str3 = facade0.listarCaloteiros();
        facade0.resetarPersistencia();
        // The following exception was thrown during execution in test generation
        try {
            facade0.atualizarUsuario("Nenhum emprestimos associados ao item", "QUATORZE_ANOS", "ROMANCE", "Caloteiro");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str3, "Lista de usuarios com reputacao negativa: ");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        lp2.projetofinal.controllers.Sistema sistema0 = new lp2.projetofinal.controllers.Sistema();
        sistema0.cadastrarUsuario("OUTRO", "OUTRO", "OUTRO");
        java.lang.String str5 = sistema0.listarItensOrdenadosPorValor();
        java.lang.String str6 = sistema0.listarCaloteiros();
        java.lang.String str7 = sistema0.listarTop10MelhoresUsuarios();
        java.lang.String str9 = sistema0.listarEmprestimosItem("JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sistema0.listarEmprestimosUsuarioPegandoEmprestado("Lista de usuarios com reputacao negativa: ", "Emprestado");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Usuario invalido");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lista de usuarios com reputacao negativa: " + "'", str6, "Lista de usuarios com reputacao negativa: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1: OUTRO - Reputacao: 0,00|" + "'", str7, "1: OUTRO - Reputacao: 0,00|");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nenhum emprestimos associados ao item" + "'", str9, "Nenhum emprestimos associados ao item");
    }
}

