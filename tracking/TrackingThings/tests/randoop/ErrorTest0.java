import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        bluRayShow20.setNome("Nao emprestado");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.setNome("Caloteiro");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo23.getDonoDoItem();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        lp2.projetofinal.entidades.Usuario usuario24 = emprestimo23.getUsuarioRequerente();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario24", (usuario5.compareTo(usuario24) == 0) == usuario5.equals(usuario24));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        lp2.projetofinal.controllers.ControllerItens controllerItens0 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow7.setNome("Caloteiro");
        lp2.projetofinal.entidades.BluRayShow bluRayShow16 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente17 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean18 = bluRayShow16.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente17);
        lp2.projetofinal.entidades.BluRayShow bluRayShow25 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow25.setNome("Caloteiro");
        bluRayShow25.itemEmprestado();
        lp2.projetofinal.entidades.BluRayShow bluRayShow35 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente36 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean37 = bluRayShow35.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente36);
        lp2.projetofinal.entidades.Item[] itemArray38 = new lp2.projetofinal.entidades.Item[] { bluRayShow7, bluRayShow16, bluRayShow25, bluRayShow35 };
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet39 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet39, itemArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = controllerItens0.listarItensOrdenadosPorNome((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet39);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        emprestimo23.setDataDevolucao("hi!");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        usuario14.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.entidades.Usuario usuario24 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente25 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario29 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str30 = usuario29.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario34 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int35 = ordenaUsuarioReputacaoCrescente25.compare(usuario29, usuario34);
        usuario34.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo47 = new lp2.projetofinal.entidades.Emprestimo(usuario24, usuario34, (lp2.projetofinal.entidades.Item) bluRayShow44, "Caloteiro", 0);
        lp2.projetofinal.entidades.Usuario usuario48 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente49 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int59 = ordenaUsuarioReputacaoCrescente49.compare(usuario53, usuario58);
        usuario58.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow68 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo71 = new lp2.projetofinal.entidades.Emprestimo(usuario48, usuario58, (lp2.projetofinal.entidades.Item) bluRayShow68, "Caloteiro", 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo74 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario34, (lp2.projetofinal.entidades.Item) bluRayShow68, "", (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario58", (usuario4.compareTo(usuario58) == 0) == usuario4.equals(usuario58));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator85 = ordenaUsuarioReputacaoCrescente0.reversed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario56", (usuario5.compareTo(usuario56) == 0) == usuario5.equals(usuario56));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        emprestimo23.setDataDevolucao("");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRaySerie7.toString();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        usuario14.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.entidades.Usuario usuario24 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente25 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario29 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str30 = usuario29.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario34 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int35 = ordenaUsuarioReputacaoCrescente25.compare(usuario29, usuario34);
        usuario34.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo47 = new lp2.projetofinal.entidades.Emprestimo(usuario24, usuario34, (lp2.projetofinal.entidades.Item) bluRayShow44, "Caloteiro", 0);
        lp2.projetofinal.entidades.Usuario usuario48 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente49 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario53 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str54 = usuario53.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario58 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int59 = ordenaUsuarioReputacaoCrescente49.compare(usuario53, usuario58);
        usuario58.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow68 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo71 = new lp2.projetofinal.entidades.Emprestimo(usuario48, usuario58, (lp2.projetofinal.entidades.Item) bluRayShow68, "Caloteiro", 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo74 = new lp2.projetofinal.entidades.Emprestimo(usuario14, usuario24, (lp2.projetofinal.entidades.Item) bluRayShow68, "Caloteiro", (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario34", (usuario4.compareTo(usuario34) == 0) == usuario4.equals(usuario34));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        bluRaySerie7.itemEmprestado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRaySerie7.toString();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        lp2.projetofinal.entidades.Usuario usuario27 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str28 = usuario27.getTelefone();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos29 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie37 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str39 = bluRaySerie37.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos40 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow47 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay48 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean49 = bluRayShow47.equals((java.lang.Object) classificacaoBluRay48);
        bluRayShow47.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow59 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str60 = bluRayShow59.getNome();
        int int61 = ordenaItemNumeroEmprestimos40.compare((lp2.projetofinal.entidades.Item) bluRayShow47, (lp2.projetofinal.entidades.Item) bluRayShow59);
        int int62 = ordenaItemNumeroEmprestimos29.compare((lp2.projetofinal.entidades.Item) bluRaySerie37, (lp2.projetofinal.entidades.Item) bluRayShow59);
        lp2.projetofinal.entidades.Emprestimo emprestimo65 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario27, (lp2.projetofinal.entidades.Item) bluRayShow59, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", (int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.setNome("Caloteiro");
        bluRayShow6.itemEmprestado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        controllerItens7.adicionaItem(itemSet33, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = controllerItens0.listarItensNaoEmprestados(itemSet33);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRaySerie7.toString();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.toString();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("COMPLETO", 100.0d, "COMPLETO", (-11), "", "", 1);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente8 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
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
        usuario44.atualizaReputacao((double) (short) -1, false);
        int int54 = ordenaUsuarioReputacaoCrescente8.compare(usuario18, usuario44);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente55 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario59 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str60 = usuario59.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario64 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int65 = ordenaUsuarioReputacaoCrescente55.compare(usuario59, usuario64);
        usuario64.setTelefone("OUTRO");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente68 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario72 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str73 = usuario72.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario77 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int78 = ordenaUsuarioReputacaoCrescente68.compare(usuario72, usuario77);
        lp2.projetofinal.entidades.Usuario usuario82 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str83 = usuario82.getTelefone();
        java.lang.String str84 = usuario82.getNome();
        lp2.projetofinal.entidades.Item item85 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo88 = new lp2.projetofinal.entidades.Emprestimo(usuario77, usuario82, item85, "OUTRO", 100);
        usuario82.atualizaReputacao((double) (-1), true);
        int int92 = ordenaUsuarioReputacaoCrescente8.compare(usuario64, usuario82);
        usuario64.setNome("Caloteiro");
        boolean boolean95 = bluRaySerie7.equals((java.lang.Object) "Caloteiro");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario13 and usuario64", (usuario13.compareTo(usuario64) == 0) == usuario13.equals(usuario64));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Noob", 0.0d, (int) (byte) 10, "hi!", "hi!", (int) ' ');
        bluRayShow6.atualizar("Caloteiro", "DOZE_ANOS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayShow6.toString();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = bluRaySerie8.toString();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        java.lang.String str94 = sistema86.listarCaloteiros();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario56", (usuario5.compareTo(usuario56) == 0) == usuario5.equals(usuario56));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        int int10 = bluRaySerie7.getDuracao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRaySerie7.toString();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente0 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator2 = ordenaUsuarioReputacaoCrescente0.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente1);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator3 = usuarioComparator2.reversed();
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
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator89 = usuarioComparator3.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario9 and usuario60", (usuario9.compareTo(usuario60) == 0) == usuario9.equals(usuario60));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario66 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str67 = controllerUsuario66.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet68 = controllerUsuario66.todosUsuariosItens();
        controllerItens24.adicionaItem(itemSet68, "Lista de usuarios com reputacao negativa: ", (double) (-1.0f), "Nao emprestado", 1, "Nenhum item pego emprestado", "Nao emprestado", 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = controllerItens0.listarItensOrdenadosPorValor(itemSet68);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        java.lang.String str94 = sistema86.listarItensOrdenadosPorNome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario56", (usuario5.compareTo(usuario56) == 0) == usuario5.equals(usuario56));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario60 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str61 = controllerUsuario60.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet62 = controllerUsuario60.todosUsuariosItens();
        controllerItens43.adicionaItem(itemSet62, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        controllerItens36.adicionaItem(itemSet62, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = controllerItens0.listarItensNaoEmprestados(itemSet62);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico14 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean15 = usuario12.equals((java.lang.Object) plataformaJogoEletronico14);
        usuario12.setEmail("Nenhum emprestimos associados ao item");
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) usuario12);
        java.lang.String str20 = bluRaySerie7.getInfo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bluRaySerie7.toString();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        lp2.projetofinal.entidades.Item item24 = emprestimo23.getItem();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = bluRaySerie8.toString();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = controllerItens0.listarItensOrdenadosPorValor(itemSet57);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = bluRaySerie8.toString();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bluRaySerie16.toString();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Nenhum emprestimos associados ao item", (double) 7, (int) (short) 0, "Nao emprestado", "Nenhum emprestimos associados ao item", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayShow6.toString();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.setNome("Caloteiro");
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizar("hi!", "Caloteiro, Nenhum emprestimos associados ao item, ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRayShow6.toString();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario49 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str50 = controllerUsuario49.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet51 = controllerUsuario49.todosUsuariosItens();
        controllerItens32.adicionaItem(itemSet51, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        controllerItens25.adicionaItem(itemSet51, "1: OUTRO - Reputacao: 0,00|", (double) (byte) 0, (int) '#', 100, "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = controllerItens0.listarItensOrdenadosPorNome(itemSet51);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) 100L, 5, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "OUTRO", 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayShow6.toString();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario24 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str25 = controllerUsuario24.listarTop10PioresUsuarios();
        java.lang.String str26 = controllerUsuario24.listarTop10MelhoresUsuarios();
        java.lang.String str27 = controllerUsuario24.listarCaloteiros();
        boolean boolean28 = emprestimo23.equals((java.lang.Object) str27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.setNome("Caloteiro");
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizar("BomAmigo", "FreeRyder");
        bluRayShow6.atualizar("Caloteiro, OUTRO, ", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRayShow6.toString();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = bluRaySerie8.getClassificacao();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getDescricao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRaySerie7.toString();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str68 = bluRayShow64.toString();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 7, "Nenhum item pego emprestado", "Nenhum item pego emprestado", (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayShow6.toString();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str90 = bluRayFilme87.toString();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.getClassificacao();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.itemDevolvido();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRayShow6.toString();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.atualizaNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayShow6.toString();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("Caloteiro, OUTRO, ", "Noob");
        int int13 = bluRaySerie7.getNumeroTemporada();
        java.lang.String str14 = bluRaySerie7.getEstado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bluRaySerie7.toString();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Emprestado", 0.0d, 5, "MUSICAL", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str7 = bluRayFilme6.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.toString();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str7 = bluRayShow6.getNome();
        bluRayShow6.setPreco((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayShow6.toString();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        lp2.projetofinal.entidades.ChaveNomeTelefone chaveNomeTelefone2 = new lp2.projetofinal.entidades.ChaveNomeTelefone("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        java.lang.String str3 = chaveNomeTelefone2.getNome();
        java.lang.String str4 = chaveNomeTelefone2.getTelefone();
        java.lang.String str5 = chaveNomeTelefone2.getNome();
        lp2.projetofinal.entidades.Usuario usuario6 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str12 = usuario11.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario16 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int17 = ordenaUsuarioReputacaoCrescente7.compare(usuario11, usuario16);
        usuario16.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow26 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo29 = new lp2.projetofinal.entidades.Emprestimo(usuario6, usuario16, (lp2.projetofinal.entidades.Item) bluRayShow26, "Caloteiro", 0);
        boolean boolean30 = chaveNomeTelefone2.equals((java.lang.Object) usuario6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario11 and usuario16", (usuario11.compareTo(usuario16) == 0) == usuario11.equals(usuario16));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        bluRayShow6.atualizaNumeroEmprestimos();
        int int8 = bluRayShow6.getNumFaixas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        lp2.projetofinal.entidades.Usuario usuario0 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente1 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario5 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str6 = usuario5.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario10 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int11 = ordenaUsuarioReputacaoCrescente1.compare(usuario5, usuario10);
        usuario10.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo23 = new lp2.projetofinal.entidades.Emprestimo(usuario0, usuario10, (lp2.projetofinal.entidades.Item) bluRayShow20, "Caloteiro", 0);
        int int24 = emprestimo23.getNumeroDias();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario10", (usuario5.compareTo(usuario10) == 0) == usuario5.equals(usuario10));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        java.lang.String str56 = bluRaySerie54.getInfo("Nao emprestado");
        lp2.projetofinal.entidades.BluRayShow bluRayShow63 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow63.setNome("Caloteiro");
        int int66 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRaySerie54, (lp2.projetofinal.entidades.Item) bluRayShow63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = bluRayShow63.toString();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        lp2.projetofinal.entidades.Usuario usuario89 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str90 = usuario89.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo92 = new lp2.projetofinal.entidades.Emprestimo(usuario79, usuario89, "1: OUTRO - Reputacao: 0,00|");
        usuario89.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet95 = usuario89.retornaSeusItens();
        controllerItens0.adicionaItem(itemSet95, "", (double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario35 and usuario89", (usuario35.compareTo(usuario89) == 0) == usuario35.equals(usuario89));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str9 = bluRaySerie7.getInfo("Nao emprestado");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.toString();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        int int9 = bluRayFilme6.getNumeroEmprestimos();
        bluRayFilme6.setNome("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRayFilme6.toString();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = bluRaySerie8.toString();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("COMPLETO", 100.0d, "COMPLETO", (-11), "", "", 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRaySerie7.toString();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("COMPLETO", 100.0d, "COMPLETO", (-11), "", "", 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRaySerie7.toString();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("Caloteiro, OUTRO, ", "Noob");
        int int13 = bluRaySerie7.getNumeroTemporada();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRaySerie7.toString();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie39 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie39.adicionarBluRay((-11));
        int int42 = bluRaySerie39.getNumeroTemporada();
        java.lang.String str43 = bluRaySerie39.getGenero();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro46 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.Object obj47 = null;
        boolean boolean48 = jogoTabuleiro46.equals(obj47);
        int int49 = bluRaySerie39.compareTo((lp2.projetofinal.entidades.Item) jogoTabuleiro46);
        lp2.projetofinal.entidades.BluRayShow bluRayShow56 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico60 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        int int61 = bluRayShow56.compareTo((lp2.projetofinal.entidades.Item) jogoEletronico60);
        int int62 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRaySerie39, (lp2.projetofinal.entidades.Item) jogoEletronico60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoEletronico8 and bluRayShow56", (jogoEletronico8.compareTo(bluRayShow56) == 0) == jogoEletronico8.equals(bluRayShow56));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        double double12 = bluRaySerie7.getPreco();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRaySerie7.toString();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str4 = jogoTabuleiro3.contemPecasPerdidas();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico8 = new lp2.projetofinal.entidades.JogoEletronico("Caloteiro", (double) (-1), "");
        int int9 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) jogoEletronico8);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos10 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro13 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente21 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean22 = bluRayShow20.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente21);
        int int23 = ordenaItemNumeroEmprestimos10.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro13, (lp2.projetofinal.entidades.Item) bluRayShow20);
        double double24 = jogoTabuleiro13.getPreco();
        jogoTabuleiro13.itemDevolvido();
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos26 = new lp2.projetofinal.controllers.ControllerEmprestimos();
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
        usuario41.atualizaReputacao((double) (-1), true);
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
        usuario65.atualizaReputacao((double) (-1), true);
        lp2.projetofinal.entidades.BluRayShow bluRayShow81 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str82 = bluRayShow81.getNomeArtista();
        controllerEmprestimos26.registrarEmprestimo(usuario41, usuario65, (lp2.projetofinal.entidades.Item) bluRayShow81, "Caloteiro", (int) (byte) 100);
        java.lang.String str86 = bluRayShow81.getNomeArtista();
        int int87 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro13, (lp2.projetofinal.entidades.Item) bluRayShow81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoEletronico8 and bluRayShow20", (jogoEletronico8.compareTo(bluRayShow20) == 0) == jogoEletronico8.equals(bluRayShow20));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        java.lang.String str9 = bluRaySerie7.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.toString();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str68 = bluRaySerie30.toString();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("COMPLETO", 100.0d, "COMPLETO", (-11), "", "", 1);
        bluRaySerie7.atualizar("Nenhum item pego emprestado", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        lp2.projetofinal.enums.GeneroBluRay generoBluRay8 = lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO;
        boolean boolean9 = bluRaySerie7.equals((java.lang.Object) generoBluRay8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.toString();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        java.lang.String str36 = bluRaySerie8.getInfo("Caloteiro, Nao emprestado, ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = bluRaySerie8.toString();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        bluRaySerie8.itemDevolvido();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = bluRaySerie8.toString();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bluRayShow19.toString();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str15 = bluRayShow6.getInfo("Lista de usuarios com reputacao negativa: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRayShow6.toString();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 7, "Nenhum item pego emprestado", "Nenhum item pego emprestado", (int) (short) -1);
        bluRayShow6.setNome("BomAmigo");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.toString();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        bluRaySerie7.itemEmprestado();
        int int11 = bluRaySerie7.getNumeroTemporada();
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
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo39 = new lp2.projetofinal.entidades.Emprestimo(usuario26, usuario36, "1: OUTRO - Reputacao: 0,00|");
        usuario36.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        java.lang.String str42 = usuario36.getTelefone();
        boolean boolean43 = bluRaySerie7.equals((java.lang.Object) str42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario16 and usuario36", (usuario16.compareTo(usuario36) == 0) == usuario16.equals(usuario36));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (double) (-11), (int) (short) 0, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (int) '#');
        java.lang.String str7 = bluRayShow6.getEstado();
        java.lang.String str9 = bluRayShow6.getInfo("1:  - Reputacao: 0,00|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayShow6.toString();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str4 = jogoTabuleiro3.contemPecasPerdidas();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico8 = new lp2.projetofinal.entidades.JogoEletronico("Caloteiro", (double) (-1), "");
        int int9 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) jogoEletronico8);
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico13 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) 7, "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico17 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str18 = jogoEletronico17.toString();
        java.lang.String str19 = jogoEletronico17.getPlataforma();
        java.lang.String str20 = jogoEletronico17.getPlataforma();
        jogoEletronico17.atualizaNumeroEmprestimos();
        boolean boolean22 = jogoEletronico13.equals((java.lang.Object) jogoEletronico17);
        lp2.projetofinal.entidades.BluRayShow bluRayShow29 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow29.setNome("Caloteiro");
        bluRayShow29.atualizaNumeroEmprestimos();
        bluRayShow29.atualizar("BomAmigo", "FreeRyder");
        bluRayShow29.atualizar("Caloteiro, OUTRO, ", "");
        int int39 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoEletronico13, (lp2.projetofinal.entidades.Item) bluRayShow29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoTabuleiro3 and jogoEletronico17", (jogoTabuleiro3.compareTo(jogoEletronico17) == 0) == jogoTabuleiro3.equals(jogoEletronico17));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("ROMANCE", "1: ROMANCE - Reputacao: 0,00|", "Caloteiro, Nenhum emprestimos associados ao item, ");
        lp2.projetofinal.entidades.Usuario usuario4 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario9 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str10 = usuario9.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario14 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int15 = ordenaUsuarioReputacaoCrescente5.compare(usuario9, usuario14);
        usuario14.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow24 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo27 = new lp2.projetofinal.entidades.Emprestimo(usuario4, usuario14, (lp2.projetofinal.entidades.Item) bluRayShow24, "Caloteiro", 0);
        lp2.projetofinal.interfaces.CartaoFidelidade cartaoFidelidade28 = usuario14.getCartao();
        usuario3.setCartao(cartaoFidelidade28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario9 and usuario14", (usuario9.compareTo(usuario14) == 0) == usuario9.equals(usuario14));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str71 = bluRayFilme20.toString();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("DOZE_ANOS", (double) (short) 10, (int) (short) 10, "ROMANCE", "", (int) (short) 100);
        int int7 = bluRayShow6.getDuracao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayShow6.toString();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRaySerie7.toString();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str14 = bluRayShow6.getNome();
        bluRayShow6.atualizar("1: OUTRO - Reputacao: 0,00|", "Caloteiro, MUSICAL, ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = bluRayFilme55.getClassificacao();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.itemEmprestado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.toString();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str9 = bluRaySerie7.getInfo("Nao emprestado");
        lp2.projetofinal.controllers.ControllerItens controllerItens10 = new lp2.projetofinal.controllers.ControllerItens();
        lp2.projetofinal.entidades.Item[] itemArray11 = new lp2.projetofinal.entidades.Item[] {};
        java.util.LinkedHashSet<lp2.projetofinal.entidades.Item> itemSet12 = new java.util.LinkedHashSet<lp2.projetofinal.entidades.Item>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<lp2.projetofinal.entidades.Item>) itemSet12, itemArray11);
        controllerItens10.adicionaItem((java.util.Set<lp2.projetofinal.entidades.Item>) itemSet12, "Caloteiro", (-1.0d));
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario17 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str18 = controllerUsuario17.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet19 = controllerUsuario17.todosUsuariosItens();
        controllerItens10.adicionaItem(itemSet19, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario27 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str28 = controllerUsuario27.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet29 = controllerUsuario27.todosUsuariosItens();
        controllerItens10.adicionaItem(itemSet29, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario58 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str59 = controllerUsuario58.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet60 = controllerUsuario58.todosUsuariosItens();
        controllerItens51.adicionaItem(itemSet60, "Caloteiro", (double) (short) -1, (int) ' ', "ROMANCE", "Lista de usuarios com reputacao negativa: ", (int) (byte) 0);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario68 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str69 = controllerUsuario68.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet70 = controllerUsuario68.todosUsuariosItens();
        controllerItens51.adicionaItem(itemSet70, "Nao emprestado", 1.0d, "Lista de usuarios com reputacao negativa: ");
        java.lang.String str75 = controllerItens34.listarItensNaoEmprestados(itemSet70);
        controllerItens10.adicionaItem(itemSet70, "DOZE_ANOS", (double) (byte) 100);
        boolean boolean79 = bluRaySerie7.equals((java.lang.Object) "DOZE_ANOS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        lp2.projetofinal.entidades.Usuario usuario12 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico14 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean15 = usuario12.equals((java.lang.Object) plataformaJogoEletronico14);
        usuario12.setEmail("Nenhum emprestimos associados ao item");
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) usuario12);
        java.lang.String str20 = bluRaySerie7.getInfo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bluRaySerie7.toString();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.itemDevolvido();
        bluRayShow6.setPreco((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRayShow6.toString();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        int int9 = bluRayFilme6.getNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayFilme6.toString();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = bluRaySerie8.toString();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        usuario43.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        usuario43.setNome("Caloteiro");
        usuario43.setEmail("Caloteiro, Nenhum emprestimos associados ao item, ");
        lp2.projetofinal.entidades.Usuario usuario56 = new lp2.projetofinal.entidades.Usuario("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "", "Caloteiro");
        java.lang.String str57 = usuario56.toString();
        lp2.projetofinal.entidades.Emprestimo emprestimo59 = new lp2.projetofinal.entidades.Emprestimo(usuario43, usuario56, "DEZOITO_ANOS");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico63 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str64 = jogoEletronico63.getPlataforma();
        java.lang.String str65 = jogoEletronico63.getPlataforma();
        java.lang.String str66 = jogoEletronico63.getPlataforma();
        lp2.projetofinal.entidades.Emprestimo emprestimo69 = new lp2.projetofinal.entidades.Emprestimo(usuario6, usuario56, (lp2.projetofinal.entidades.Item) jogoEletronico63, "ROMANCE", (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario13 and usuario43", (usuario13.compareTo(usuario43) == 0) == usuario13.equals(usuario43));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        bluRaySerie8.itemDevolvido();
        double double44 = bluRaySerie8.getPreco();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = bluRaySerie8.toString();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        int int7 = bluRayShow6.getDuracao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayShow6.toString();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("Caloteiro, OUTRO, ", "Noob");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie20 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) 100L, "Lista de usuarios com reputacao negativa: ", (int) (short) 1, "BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (-11));
        boolean boolean21 = bluRaySerie7.equals((java.lang.Object) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bluRaySerie7.toString();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        double double12 = bluRaySerie7.getPreco();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRaySerie7.toString();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str68 = bluRaySerie41.toString();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        usuario21.setTelefone("Caloteiro");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario21", (usuario4.compareTo(usuario21) == 0) == usuario4.equals(usuario21));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = bluRayShow62.toString();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        bluRaySerie7.atualizar("Nenhum emprestimos associados ao item", "Caloteiro, Nao emprestado, ");
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay14 = lp2.projetofinal.enums.ClassificacaoBluRay.DOZE_ANOS;
        java.lang.String str15 = classificacaoBluRay14.getClassificacao();
        java.lang.String str16 = classificacaoBluRay14.getClassificacao();
        boolean boolean17 = bluRaySerie7.equals((java.lang.Object) classificacaoBluRay14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = bluRaySerie7.toString();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie73 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str74 = bluRaySerie73.getEstado();
        java.lang.String str75 = bluRaySerie73.getGenero();
        bluRaySerie73.atualizar("Caloteiro, OUTRO, ", "Noob");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos79 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro82 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow89 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente90 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean91 = bluRayShow89.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente90);
        int int92 = ordenaItemNumeroEmprestimos79.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro82, (lp2.projetofinal.entidades.Item) bluRayShow89);
        java.lang.String str93 = jogoTabuleiro82.getEstado();
        boolean boolean94 = bluRaySerie73.equals((java.lang.Object) jogoTabuleiro82);
        boolean boolean95 = bluRaySerie62.equals((java.lang.Object) bluRaySerie73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bluRaySerie9 and jogoTabuleiro82", (bluRaySerie9.compareTo(jogoTabuleiro82) == 0) == bluRaySerie9.equals(jogoTabuleiro82));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        sistema86.inicializar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario56", (usuario5.compareTo(usuario56) == 0) == usuario5.equals(usuario56));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = bluRaySerie8.toString();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = bluRaySerie41.toString();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNomeArtista();
        bluRayShow6.atualizar("AVENTURA", "Caloteiro, OUTRO, ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRayShow6.toString();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = bluRayFilme19.toString();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        int int20 = bluRaySerie16.getNumeroTemporada();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bluRaySerie16.toString();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie56 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str57 = bluRaySerie56.getGenero();
        bluRaySerie56.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int61 = bluRaySerie56.getNumeroTemporada();
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme68 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        int int69 = bluRayFilme68.getAnoLancamento();
        int int70 = bluRaySerie56.compareTo((lp2.projetofinal.entidades.Item) bluRayFilme68);
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme77 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str78 = bluRayFilme77.getGenero();
        int int79 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayFilme68, (lp2.projetofinal.entidades.Item) bluRayFilme77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = bluRayFilme68.toString();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str7 = bluRayShow6.getNomeArtista();
        int int8 = bluRayShow6.getNumFaixas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.toString();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str7 = bluRayShow6.getNome();
        java.lang.String str8 = bluRayShow6.getEstado();
        java.lang.String str9 = bluRayShow6.getNomeArtista();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.atualizar("Lista de usuarios com reputacao negativa: ", "Caloteiro");
        int int16 = bluRayShow6.getDuracao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bluRayShow6.toString();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        usuario72.setTelefone("Caloteiro, OUTRO, ");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario6 and usuario72", (usuario6.compareTo(usuario72) == 0) == usuario6.equals(usuario72));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente32 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario41 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int42 = ordenaUsuarioReputacaoCrescente32.compare(usuario36, usuario41);
        lp2.projetofinal.entidades.Usuario usuario46 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str47 = usuario46.getTelefone();
        java.lang.String str48 = usuario46.getNome();
        lp2.projetofinal.entidades.Item item49 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo52 = new lp2.projetofinal.entidades.Emprestimo(usuario41, usuario46, item49, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario56 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str57 = usuario56.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo59 = new lp2.projetofinal.entidades.Emprestimo(usuario46, usuario56, "1: OUTRO - Reputacao: 0,00|");
        usuario56.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet62 = usuario56.retornaSeusItens();
        controllerItens0.adicionaItem(itemSet62, "DEZOITO_ANOS", (double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario36 and usuario56", (usuario36.compareTo(usuario56) == 0) == usuario36.equals(usuario56));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        int int9 = bluRayFilme6.getAnoLancamento();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayFilme6.toString();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        bluRayShow6.setNome("Nao emprestado");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.toString();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        usuario22.setEmail("Nao emprestado");
        java.lang.String str25 = usuario22.toString();
        usuario22.setTelefone("NINTENDO 3DS");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario22", (usuario4.compareTo(usuario22) == 0) == usuario4.equals(usuario22));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int12 = bluRaySerie7.getNumeroTemporada();
        int int13 = bluRaySerie7.getNumeroTemporada();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRaySerie7.toString();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.atualizaNumeroEmprestimos();
        java.lang.String str8 = bluRayShow6.getNomeArtista();
        double double9 = bluRayShow6.getPreco();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayShow6.toString();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente73 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente74 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator75 = ordenaUsuarioReputacaoCrescente73.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente74);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator76 = usuarioComparator75.reversed();
        boolean boolean77 = bluRaySerie41.equals((java.lang.Object) usuarioComparator76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str78 = bluRaySerie41.toString();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("", 1.0d, 0, "1:  - Reputacao: 0,00|", "FreeRyder", (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str7 = bluRayShow6.getNome();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayShow6.toString();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        int int9 = bluRaySerie7.duracaoTotal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.toString();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("", (double) 52, (int) ' ', "DOZE_ANOS", "Nao emprestado", (int) (short) 10);
        java.lang.String str8 = bluRayFilme6.getInfo("Emprestado");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayFilme6.toString();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "Nenhum item pego emprestado");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente73 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente74 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator75 = ordenaUsuarioReputacaoCrescente73.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente74);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator76 = usuarioComparator75.reversed();
        boolean boolean77 = bluRaySerie41.equals((java.lang.Object) usuarioComparator76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str78 = bluRaySerie41.toString();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        usuario26.setTelefone("hi!");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario26", (usuario4.compareTo(usuario26) == 0) == usuario4.equals(usuario26));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        int int90 = bluRaySerie76.getNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str91 = bluRaySerie76.getClassificacao();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str84 = bluRaySerie7.toString();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        bluRaySerie7.itemDevolvido();
        java.lang.String str12 = bluRaySerie7.getDescricao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRaySerie7.toString();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str7 = bluRayShow6.getNome();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayShow6.toString();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.setNome("Caloteiro");
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizar("BomAmigo", "FreeRyder");
        bluRayShow6.atualizar("Caloteiro, OUTRO, ", "");
        int int16 = bluRayShow6.getDuracao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("", (double) 52, (int) ' ', "DOZE_ANOS", "Nao emprestado", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro83 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        jogoTabuleiro83.setPreco((double) (short) 0);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie93 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str94 = bluRaySerie93.getGenero();
        bluRaySerie93.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int98 = bluRaySerie93.getNumeroTemporada();
        int int99 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro83, (lp2.projetofinal.entidades.Item) bluRaySerie93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoEletronico49 and jogoTabuleiro69", (jogoEletronico49.compareTo(jogoTabuleiro69) == 0) == jogoEletronico49.equals(jogoTabuleiro69));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        bluRayFilme6.itemDevolvido();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.toString();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("Caloteiro, OUTRO, ", "Noob");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie20 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) 100L, "Lista de usuarios com reputacao negativa: ", (int) (short) 1, "BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", (-11));
        boolean boolean21 = bluRaySerie7.equals((java.lang.Object) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bluRaySerie7.toString();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        lp2.projetofinal.entidades.BluRayShow bluRayShow45 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str46 = bluRayShow45.getNome();
        int int47 = bluRaySerie8.compareTo((lp2.projetofinal.entidades.Item) bluRayShow45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = bluRaySerie8.toString();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        int int72 = bluRaySerie41.getDuracao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = bluRaySerie41.toString();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        java.lang.String str36 = bluRaySerie8.getInfo("Caloteiro, Nao emprestado, ");
        java.lang.String str37 = bluRaySerie8.getEstado();
        bluRaySerie8.adicionarBluRay(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = bluRaySerie8.toString();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str9 = bluRayFilme6.getInfo("PS3");
        bluRayFilme6.atualizar("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "NINTENDO 3DS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRayFilme6.toString();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        java.lang.String str10 = bluRaySerie7.getEstado();
        bluRaySerie7.adicionarBluRay((int) 'a');
        java.lang.String str13 = bluRaySerie7.getDescricao();
        java.lang.String str15 = bluRaySerie7.getInfo("Caloteiro");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRaySerie7.toString();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = bluRaySerie8.getClassificacao();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario75 = new lp2.projetofinal.controllers.ControllerUsuario();
        java.lang.String str76 = controllerUsuario75.listarTop10PioresUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet77 = controllerUsuario75.todosUsuariosItens();
        controllerItens33.adicionaItem(itemSet77, "Lista de usuarios com reputacao negativa: ", (double) (-1.0f), "Nao emprestado", 1, "Nenhum item pego emprestado", "Nao emprestado", 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str86 = controllerItens0.listarItensOrdenadosPorValor(itemSet77);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bluRayShow7.toString();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.setNome("Caloteiro");
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizar("hi!", "Caloteiro, Nenhum emprestimos associados ao item, ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie56 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str57 = bluRaySerie56.getGenero();
        bluRaySerie56.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int61 = bluRaySerie56.getNumeroTemporada();
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme68 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        int int69 = bluRayFilme68.getAnoLancamento();
        int int70 = bluRaySerie56.compareTo((lp2.projetofinal.entidades.Item) bluRayFilme68);
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme77 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str78 = bluRayFilme77.getGenero();
        int int79 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayFilme68, (lp2.projetofinal.entidades.Item) bluRayFilme77);
        java.lang.String str80 = bluRayFilme77.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = bluRayFilme77.toString();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("BomAmigo", (double) 1, (-18), "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "Caloteiro, OUTRO, ", 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        boolean boolean23 = emprestimo21.equals((java.lang.Object) (-1.0f));
        int int24 = emprestimo21.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario25 = emprestimo21.getUsuarioRequerente();
        lp2.projetofinal.entidades.Usuario usuario29 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        lp2.projetofinal.enums.PlataformaJogoEletronico plataformaJogoEletronico31 = lp2.projetofinal.enums.PlataformaJogoEletronico.indentificaPlataforma("hi!");
        boolean boolean32 = usuario29.equals((java.lang.Object) plataformaJogoEletronico31);
        usuario29.setEmail("Nenhum emprestimos associados ao item");
        int int35 = ordenaUsuarioReputacaoCrescente0.compare(usuario25, usuario29);
        usuario25.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario5 and usuario25", (usuario5.compareTo(usuario25) == 0) == usuario5.equals(usuario25));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico10 = new lp2.projetofinal.entidades.JogoEletronico("ROMANCE", (double) ' ', "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO");
        int int11 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) jogoEletronico10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRayShow6.toString();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        controllerEmprestimos0.carregaListaEmprestimos();
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
        java.lang.String str46 = usuario39.getNome();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie54 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str55 = bluRaySerie54.getEstado();
        java.lang.String str56 = bluRaySerie54.getGenero();
        java.lang.String str57 = bluRaySerie54.getEstado();
        lp2.projetofinal.entidades.Emprestimo emprestimo60 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario39, (lp2.projetofinal.entidades.Item) bluRaySerie54, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (-1));
        double double61 = usuario11.getReputacao();
        usuario11.setTelefone("Nenhum item emprestado");
        java.lang.String str64 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        java.lang.String str66 = controllerEmprestimos0.listarEmprestimosItens("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario6 and usuario11", (usuario6.compareTo(usuario11) == 0) == usuario6.equals(usuario11));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str92 = bluRayFilme87.toString();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        bluRaySerie54.atualizar("JOGO ELETRONICO: COMPLETO, R$ 10.0, Nao emprestado, OUTRO", "1: ROMANCE - Reputacao: 0,00|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = bluRaySerie54.toString();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bluRayShow7.getClassificacao();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Nenhum item pego emprestado", (double) 10L, 35, "COM PECAS PERDIDAS", "1: OUTRO - Reputacao: 0,00|", (int) '4');
        java.lang.String str8 = bluRayFilme6.getInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayFilme6.toString();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.atualizaNumeroEmprestimos();
        java.lang.String str8 = bluRayShow6.getNomeArtista();
        double double9 = bluRayShow6.getPreco();
        java.lang.String str11 = bluRayShow6.getInfo("Caloteiro, Nenhum emprestimos associados ao item, ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRayShow6.toString();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        java.lang.String str10 = bluRaySerie7.getEstado();
        bluRaySerie7.adicionarBluRay((int) 'a');
        java.lang.String str13 = bluRaySerie7.getDescricao();
        java.lang.String str14 = bluRaySerie7.getGenero();
        bluRaySerie7.setPreco((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = bluRaySerie7.toString();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        double double9 = bluRayShow6.getPreco();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", (double) 14, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", 14, "1: Caloteiro, OUTRO,  - Reputacao: 0,00|", "POLICIAL", (int) (byte) 10);
        lp2.projetofinal.entidades.Usuario usuario11 = new lp2.projetofinal.entidades.Usuario("Nenhum item emprestado", "Noob", "Caloteiro, MUSICAL, ");
        boolean boolean12 = bluRaySerie7.equals((java.lang.Object) "Noob");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str4 = jogoTabuleiro3.contemPecasPerdidas();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente5 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente6 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator7 = ordenaUsuarioReputacaoCrescente5.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente6);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator8 = ordenaUsuarioReputacaoCrescente5.reversed();
        boolean boolean9 = jogoTabuleiro3.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente5);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos10 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie18 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str20 = bluRaySerie18.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos21 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow28 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay29 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean30 = bluRayShow28.equals((java.lang.Object) classificacaoBluRay29);
        bluRayShow28.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow40 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str41 = bluRayShow40.getNome();
        int int42 = ordenaItemNumeroEmprestimos21.compare((lp2.projetofinal.entidades.Item) bluRayShow28, (lp2.projetofinal.entidades.Item) bluRayShow40);
        int int43 = ordenaItemNumeroEmprestimos10.compare((lp2.projetofinal.entidades.Item) bluRaySerie18, (lp2.projetofinal.entidades.Item) bluRayShow40);
        java.lang.String str44 = bluRaySerie18.getNome();
        bluRaySerie18.setNome("COMPLETO");
        bluRaySerie18.atualizar("BomAmigo", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        int int50 = bluRaySerie18.duracaoTotal();
        int int51 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRaySerie18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = bluRaySerie18.toString();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Noob", 0.0d, (int) (byte) 10, "hi!", "hi!", (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        java.lang.String str14 = jogoTabuleiro3.toString();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie22 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str23 = bluRaySerie22.getEstado();
        java.lang.String str24 = bluRaySerie22.getGenero();
        bluRaySerie22.atualizar("Caloteiro, OUTRO, ", "Noob");
        boolean boolean28 = jogoTabuleiro3.equals((java.lang.Object) bluRaySerie22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = bluRaySerie22.toString();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        java.lang.String str10 = bluRaySerie7.getEstado();
        java.lang.String str12 = bluRaySerie7.getInfo("XBOX360");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos1 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro4 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow11 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente12 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean13 = bluRayShow11.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente12);
        int int14 = ordenaItemNumeroEmprestimos1.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro4, (lp2.projetofinal.entidades.Item) bluRayShow11);
        java.lang.String str15 = jogoTabuleiro4.toString();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie23 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str24 = bluRaySerie23.getEstado();
        java.lang.String str25 = bluRaySerie23.getGenero();
        bluRaySerie23.atualizar("Caloteiro, OUTRO, ", "Noob");
        boolean boolean29 = jogoTabuleiro4.equals((java.lang.Object) bluRaySerie23);
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico33 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str34 = jogoEletronico33.getPlataforma();
        java.lang.String str35 = jogoEletronico33.toString();
        double double36 = jogoEletronico33.getPreco();
        java.lang.String str37 = jogoEletronico33.getEstado();
        java.lang.String str38 = jogoEletronico33.toString();
        int int39 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro4, (lp2.projetofinal.entidades.Item) jogoEletronico33);
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro42 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        jogoTabuleiro42.itemEmprestado();
        java.lang.String str44 = jogoTabuleiro42.toString();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie52 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str53 = bluRaySerie52.getGenero();
        int int54 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro42, (lp2.projetofinal.entidades.Item) bluRaySerie52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoTabuleiro4 and bluRaySerie23", (jogoTabuleiro4.compareTo(bluRaySerie23) == 0) == jogoTabuleiro4.equals(bluRaySerie23));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        java.lang.String str12 = bluRayShow6.getNome();
        bluRayShow6.itemDevolvido();
        bluRayShow6.setPreco((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRayShow6.toString();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        java.lang.String str36 = usuario3.getEmail();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario11 and usuario21", (usuario11.compareTo(usuario21) == 0) == usuario11.equals(usuario21));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = bluRayShow6.toString();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos48 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie56 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str58 = bluRaySerie56.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos59 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow66 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay67 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean68 = bluRayShow66.equals((java.lang.Object) classificacaoBluRay67);
        bluRayShow66.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow78 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str79 = bluRayShow78.getNome();
        int int80 = ordenaItemNumeroEmprestimos59.compare((lp2.projetofinal.entidades.Item) bluRayShow66, (lp2.projetofinal.entidades.Item) bluRayShow78);
        int int81 = ordenaItemNumeroEmprestimos48.compare((lp2.projetofinal.entidades.Item) bluRaySerie56, (lp2.projetofinal.entidades.Item) bluRayShow78);
        java.lang.String str82 = bluRayShow78.getNomeArtista();
        java.lang.String str84 = bluRayShow78.getInfo("Caloteiro, OUTRO, ");
        int int85 = bluRayShow78.getNumFaixas();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie93 = new lp2.projetofinal.entidades.BluRaySerie("", (-1.0d), "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (int) (byte) 1, "Nenhum item pego emprestado", "Nao emprestado", 0);
        java.lang.String str94 = bluRaySerie93.getGenero();
        java.lang.String str96 = bluRaySerie93.getInfo("JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
        int int97 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayShow78, (lp2.projetofinal.entidades.Item) bluRaySerie93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str98 = bluRayShow78.getClassificacao();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizaNumeroEmprestimos();
        int int9 = bluRayShow6.getNumFaixas();
        int int10 = bluRayShow6.getNumFaixas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRayShow6.toString();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        int int41 = emprestimo40.getNumeroDias();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario24", (usuario4.compareTo(usuario24) == 0) == usuario4.equals(usuario24));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        java.lang.String str73 = bluRayFilme20.getGenero();
        bluRayFilme20.atualizar("MUSICAL", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = bluRayFilme20.toString();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        int int40 = bluRaySerie8.duracaoTotal();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie48 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie48.adicionarBluRay((-11));
        java.lang.String str51 = bluRaySerie48.getNome();
        java.lang.String str52 = bluRaySerie48.getDescricao();
        bluRaySerie48.atualizar("", "");
        boolean boolean56 = bluRaySerie8.equals((java.lang.Object) bluRaySerie48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = bluRaySerie8.toString();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie56 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str57 = bluRaySerie56.getGenero();
        bluRaySerie56.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int61 = bluRaySerie56.getNumeroTemporada();
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme68 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        int int69 = bluRayFilme68.getAnoLancamento();
        int int70 = bluRaySerie56.compareTo((lp2.projetofinal.entidades.Item) bluRayFilme68);
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme77 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        java.lang.String str78 = bluRayFilme77.getGenero();
        int int79 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) bluRayFilme68, (lp2.projetofinal.entidades.Item) bluRayFilme77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = bluRayFilme77.toString();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str7 = bluRayShow6.getNome();
        int int8 = bluRayShow6.getNumFaixas();
        bluRayShow6.itemEmprestado();
        bluRayShow6.itemEmprestado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRayShow6.toString();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int8 = bluRaySerie7.getNumeroEmprestimos();
        lp2.projetofinal.entidades.CartaoFreeRyder cartaoFreeRyder9 = new lp2.projetofinal.entidades.CartaoFreeRyder();
        int int10 = cartaoFreeRyder9.prazoEmprestimo();
        java.lang.String str11 = cartaoFreeRyder9.getNomeCartao();
        boolean boolean12 = bluRaySerie7.equals((java.lang.Object) cartaoFreeRyder9);
        java.lang.String str13 = bluRaySerie7.getDescricao();
        bluRaySerie7.itemDevolvido();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bluRaySerie7.toString();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRaySerie7.toString();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        lp2.projetofinal.entidades.Usuario usuario89 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str90 = usuario89.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo92 = new lp2.projetofinal.entidades.Emprestimo(usuario79, usuario89, "1: OUTRO - Reputacao: 0,00|");
        usuario89.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        lp2.projetofinal.entidades.Emprestimo emprestimo96 = new lp2.projetofinal.entidades.Emprestimo(usuario9, usuario89, "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|");
        lp2.projetofinal.entidades.Item item97 = emprestimo96.getItem();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario9 and usuario89", (usuario9.compareTo(usuario89) == 0) == usuario9.equals(usuario89));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        java.lang.String str12 = bluRaySerie7.getGenero();
        java.lang.String str14 = bluRaySerie7.getInfo("JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = bluRaySerie7.toString();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Caloteiro, Nao emprestado, ", (-1.0d), (int) (byte) 1, "Caloteiro, OUTRO, ", "Noob", (-11));
        java.lang.String str7 = bluRayFilme6.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.toString();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.toString();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str4 = jogoTabuleiro3.contemPecasPerdidas();
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico8 = new lp2.projetofinal.entidades.JogoEletronico("Caloteiro", (double) (-1), "");
        int int9 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) jogoEletronico8);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos10 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro13 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow20 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente21 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean22 = bluRayShow20.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente21);
        int int23 = ordenaItemNumeroEmprestimos10.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro13, (lp2.projetofinal.entidades.Item) bluRayShow20);
        java.lang.String str24 = jogoTabuleiro13.getEstado();
        jogoTabuleiro13.adicionarPecaPerdida("");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie34 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        int int35 = bluRaySerie34.getNumeroEmprestimos();
        int int36 = bluRaySerie34.duracaoTotal();
        int int37 = bluRaySerie34.getDuracao();
        java.lang.String str38 = bluRaySerie34.getDescricao();
        java.lang.String str40 = bluRaySerie34.getInfo("DOZE_ANOS");
        int int41 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro13, (lp2.projetofinal.entidades.Item) bluRaySerie34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoEletronico8 and bluRayShow20", (jogoEletronico8.compareTo(bluRayShow20) == 0) == jogoEletronico8.equals(bluRayShow20));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRayShow10.toString();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        java.lang.String str40 = bluRaySerie8.getNome();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = bluRaySerie8.toString();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("", (-1.0d), "Caloteiro, OUTRO, , Nenhum item pego emprestado, Caloteiro", (int) (byte) 1, "Nenhum item pego emprestado", "Nao emprestado", 0);
        java.lang.String str9 = bluRaySerie7.getInfo("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        java.lang.String str9 = bluRaySerie7.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.toString();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Emprestado", 0.0d, 5, "MUSICAL", "JOGO ELETRONICO: hi!, R$ 10.0, Nao emprestado, OUTRO", 35);
        int int7 = bluRayFilme6.getAnoLancamento();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.toString();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("DEZ_ANOS", (-1.0d), "DEZOITO_ANOS", (int) ' ', "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "Emprestado", (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRaySerie7.toString();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        controllerEmprestimos0.carregaListaEmprestimos();
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
        java.lang.String str46 = usuario39.getNome();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie54 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str55 = bluRaySerie54.getEstado();
        java.lang.String str56 = bluRaySerie54.getGenero();
        java.lang.String str57 = bluRaySerie54.getEstado();
        lp2.projetofinal.entidades.Emprestimo emprestimo60 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario39, (lp2.projetofinal.entidades.Item) bluRaySerie54, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (-1));
        double double61 = usuario11.getReputacao();
        usuario11.setTelefone("Nenhum item emprestado");
        java.lang.String str64 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        lp2.projetofinal.entidades.Usuario usuario65 = null;
        java.lang.String str66 = controllerEmprestimos0.listarEmprestimosEmprestandoOrdenadosPorNomeItem(usuario65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario6 and usuario11", (usuario6.compareTo(usuario11) == 0) == usuario6.equals(usuario11));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str14 = bluRayShow6.getNome();
        bluRayShow6.atualizar("1: OUTRO - Reputacao: 0,00|", "Caloteiro, MUSICAL, ");
        int int18 = bluRayShow6.getNumFaixas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = bluRayShow6.toString();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("PC", (-1.0d), (int) (byte) 1, "EMPRESTIMO - De: Caloteiro, Para: Caloteiro, hi!, Caloteiro, OUTRO, , 10 dias, ENTREGA: Emprestimo em andamento", "1: JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO| - Reputacao: 0,00|", (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayShow6.toString();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = bluRaySerie46.toString();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        lp2.projetofinal.enums.GeneroBluRay generoBluRay8 = lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO;
        boolean boolean9 = bluRaySerie7.equals((java.lang.Object) generoBluRay8);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario10 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario10.salvarMapaUsuarios();
        controllerUsuario10.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario10.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario10.todosUsuariosItens();
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) controllerUsuario10);
        bluRaySerie7.atualizaNumeroEmprestimos();
        bluRaySerie7.setNome("JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.setNome("Caloteiro");
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizar("hi!", "Caloteiro, Nenhum emprestimos associados ao item, ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = bluRayShow6.toString();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("COM PECAS PERDIDAS", (double) 10L, (int) (byte) 100, "POLICIAL", "Caloteiro, OUTRO, ", 14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        java.lang.String str12 = bluRaySerie7.getGenero();
        lp2.projetofinal.facade.Facade facade13 = new lp2.projetofinal.facade.Facade();
        facade13.fecharSistema();
        java.lang.String str15 = facade13.listarItensEmprestados();
        facade13.iniciarSistema();
        java.lang.String str17 = facade13.listarTop10MelhoresUsuarios();
        java.lang.String str18 = facade13.listarItensOrdenadosPorNome();
        java.lang.String str19 = facade13.listarTop10Itens();
        boolean boolean20 = bluRaySerie7.equals((java.lang.Object) facade13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bluRaySerie7.toString();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str8 = bluRayFilme6.getGenero();
        int int9 = bluRayFilme6.getNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayFilme6.toString();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRaySerie7.toString();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        usuario22.setTelefone("JOGO ELETRONICO: 1: Caloteiro - Reputacao: 0,00|, R$ 1.0, Nao emprestado, OUTRO|");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario22", (usuario4.compareTo(usuario22) == 0) == usuario4.equals(usuario22));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = bluRaySerie8.toString();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO", (double) (byte) 1, (int) (byte) -1, "JOGO DE TABULEIRO: hi!, R$ 0.0, Nao emprestado, COMPLETO", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO, , Noob", (int) (byte) 100);
        java.lang.String str7 = bluRayFilme6.getGenero();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.toString();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        lp2.projetofinal.entidades.Usuario usuario35 = null;
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente36 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario40 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str41 = usuario40.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario45 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int46 = ordenaUsuarioReputacaoCrescente36.compare(usuario40, usuario45);
        usuario45.setTelefone("OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow55 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.entidades.Emprestimo emprestimo58 = new lp2.projetofinal.entidades.Emprestimo(usuario35, usuario45, (lp2.projetofinal.entidades.Item) bluRayShow55, "Caloteiro", 0);
        boolean boolean59 = emprestimo27.equals((java.lang.Object) "Caloteiro");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario45", (usuario4.compareTo(usuario45) == 0) == usuario4.equals(usuario45));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Nenhum emprestimos associados ao item", (double) 7, (int) (short) 0, "Nao emprestado", "Nenhum emprestimos associados ao item", (int) (short) 0);
        java.lang.String str8 = bluRayShow6.getInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        bluRaySerie7.itemDevolvido();
        java.lang.String str12 = bluRaySerie7.getDescricao();
        bluRaySerie7.atualizaNumeroEmprestimos();
        java.lang.String str14 = bluRaySerie7.getEstado();
        bluRaySerie7.itemDevolvido();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRaySerie7.toString();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente7 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente7);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie16 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str18 = bluRaySerie16.getInfo("Nao emprestado");
        int int19 = bluRayShow6.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie16);
        int int20 = bluRayShow6.getNumFaixas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = bluRayShow6.toString();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        bluRaySerie7.itemDevolvido();
        java.lang.String str12 = bluRaySerie7.getDescricao();
        int int13 = bluRaySerie7.getNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRaySerie7.toString();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        java.lang.String str58 = jogoTabuleiro3.toString();
        lp2.projetofinal.entidades.BluRayShow bluRayShow65 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str66 = bluRayShow65.getNome();
        java.lang.String str67 = bluRayShow65.getEstado();
        java.lang.String str68 = bluRayShow65.getNomeArtista();
        boolean boolean69 = jogoTabuleiro3.equals((java.lang.Object) bluRayShow65);
        java.lang.String str70 = bluRayShow65.getNome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoTabuleiro3 and bluRaySerie51", (jogoTabuleiro3.compareTo(bluRaySerie51) == 0) == jogoTabuleiro3.equals(bluRaySerie51));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        bluRayShow19.atualizar("BomAmigo", "Lista de usuarios com reputacao negativa: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = bluRayShow19.toString();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str88 = bluRayFilme6.toString();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        java.lang.String str78 = bluRayShow6.getNomeArtista();
        int int79 = bluRayShow6.getNumFaixas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = bluRayShow6.toString();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str7 = bluRayShow6.getNome();
        int int8 = bluRayShow6.getNumFaixas();
        bluRayShow6.itemEmprestado();
        bluRayShow6.itemEmprestado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRayShow6.getClassificacao();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("COM PECAS PERDIDAS", (double) 10L, (int) (byte) 100, "POLICIAL", "Caloteiro, OUTRO, ", 14);
        int int7 = bluRayFilme6.getAnoLancamento();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.toString();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        java.lang.String str7 = bluRayFilme6.getGenero();
        java.lang.String str9 = bluRayFilme6.getInfo("PS3");
        bluRayFilme6.atualizar("JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO", "NINTENDO 3DS");
        bluRayFilme6.atualizaNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRayFilme6.toString();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.atualizar("PS3", "Lista de usuarios com reputacao negativa: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRaySerie7.getClassificacao();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRayShow6.toString();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        bluRaySerie8.setPreco((double) (-11));
        int int40 = bluRaySerie8.getNumeroTemporada();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = bluRaySerie8.getClassificacao();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getGenero();
        bluRaySerie7.atualizar("FreeRyder", "Nenhum item pego emprestado");
        int int12 = bluRaySerie7.getNumeroTemporada();
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme19 = new lp2.projetofinal.entidades.BluRayFilme("ROMANCE", (double) 10.0f, 7, "Nenhum item pego emprestado", "Nao emprestado", 0);
        int int20 = bluRayFilme19.getAnoLancamento();
        int int21 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) bluRayFilme19);
        double double22 = bluRaySerie7.getPreco();
        java.lang.String str23 = bluRaySerie7.getNome();
        int int24 = bluRaySerie7.getNumeroTemporada();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = bluRaySerie7.toString();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        java.lang.String str58 = jogoTabuleiro3.toString();
        lp2.projetofinal.entidades.BluRayShow bluRayShow65 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str66 = bluRayShow65.getNome();
        java.lang.String str67 = bluRayShow65.getEstado();
        java.lang.String str68 = bluRayShow65.getNomeArtista();
        boolean boolean69 = jogoTabuleiro3.equals((java.lang.Object) bluRayShow65);
        bluRayShow65.itemEmprestado();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoTabuleiro3 and bluRaySerie51", (jogoTabuleiro3.compareTo(bluRaySerie51) == 0) == jogoTabuleiro3.equals(bluRaySerie51));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        lp2.projetofinal.entidades.Usuario usuario33 = new lp2.projetofinal.entidades.Usuario("Nao emprestado", "Nenhum item emprestado", "NINTENDO 3DS");
        java.lang.String str34 = usuario33.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo36 = new lp2.projetofinal.entidades.Emprestimo(usuario24, usuario33, "");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos37 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie45 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str47 = bluRaySerie45.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos48 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow55 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay56 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean57 = bluRayShow55.equals((java.lang.Object) classificacaoBluRay56);
        bluRayShow55.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow67 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str68 = bluRayShow67.getNome();
        int int69 = ordenaItemNumeroEmprestimos48.compare((lp2.projetofinal.entidades.Item) bluRayShow55, (lp2.projetofinal.entidades.Item) bluRayShow67);
        int int70 = ordenaItemNumeroEmprestimos37.compare((lp2.projetofinal.entidades.Item) bluRaySerie45, (lp2.projetofinal.entidades.Item) bluRayShow67);
        java.lang.String str71 = bluRaySerie45.getNome();
        bluRaySerie45.setNome("COMPLETO");
        bluRaySerie45.adicionarBluRay((-1));
        int int76 = bluRaySerie45.getDuracao();
        boolean boolean77 = emprestimo36.equals((java.lang.Object) int76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario24", (usuario4.compareTo(usuario24) == 0) == usuario4.equals(usuario24));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("Nenhum emprestimos associados ao item", (-32.0d), (int) (short) -1, "JOGO DE TABULEIRO: Noob, R$ 1.0, Emprestado, COMPLETO", "JOGO ELETRONICO: ROMANCE, R$ 7.0, Nao emprestado, OUTRO", (-37));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayFilme6.toString();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        lp2.projetofinal.entidades.Usuario usuario28 = new lp2.projetofinal.entidades.Usuario("Nenhum item emprestado", "Noob", "Caloteiro, MUSICAL, ");
        int int29 = usuario21.compareTo(usuario28);
        usuario21.atualizaReputacao((double) (-15), true);
        usuario21.setTelefone("1: hi! - Reputacao: 0,00|");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario4 and usuario21", (usuario4.compareTo(usuario21) == 0) == usuario4.equals(usuario21));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = bluRaySerie8.toString();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        bluRayShow83.atualizaNumeroEmprestimos();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bluRayShow18 and bluRaySerie92", (bluRayShow18.compareTo(bluRaySerie92) == 0) == bluRayShow18.equals(bluRaySerie92));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        bluRayFilme6.itemDevolvido();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.toString();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("OUTRO", (double) (short) 1, 10, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", "1: ROMANCE - Reputacao: 0,00|", (int) (short) 10);
        bluRayFilme6.setNome("Lista de usuarios com reputacao negativa: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = bluRayFilme6.toString();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = bluRaySerie8.getClassificacao();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizaNumeroEmprestimos();
        int int9 = bluRayShow6.getNumFaixas();
        java.lang.String str11 = bluRayShow6.getInfo("1: OUTRO - Reputacao: 0,00|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRayShow6.toString();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        controllerEmprestimos0.carregaListaEmprestimos();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente52 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.entidades.Usuario usuario56 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str57 = usuario56.getTelefone();
        lp2.projetofinal.entidades.Usuario usuario61 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        int int62 = ordenaUsuarioReputacaoCrescente52.compare(usuario56, usuario61);
        lp2.projetofinal.entidades.Usuario usuario66 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str67 = usuario66.getTelefone();
        java.lang.String str68 = usuario66.getNome();
        lp2.projetofinal.entidades.Item item69 = null;
        lp2.projetofinal.entidades.Emprestimo emprestimo72 = new lp2.projetofinal.entidades.Emprestimo(usuario61, usuario66, item69, "OUTRO", 100);
        lp2.projetofinal.entidades.Usuario usuario76 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str77 = usuario76.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo79 = new lp2.projetofinal.entidades.Emprestimo(usuario66, usuario76, "1: OUTRO - Reputacao: 0,00|");
        usuario76.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        lp2.projetofinal.entidades.Usuario usuario85 = new lp2.projetofinal.entidades.Usuario("QUATORZE_ANOS", "JOGO DE TABULEIRO: Noob, R$ -1.0, Nao emprestado, COMPLETO", "FreeRyder");
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro88 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, MUSICAL, ", (double) 100L);
        controllerEmprestimos0.registrarEmprestimo(usuario76, usuario85, (lp2.projetofinal.entidades.Item) jogoTabuleiro88, "JOGO ELETRONICO: Nenhum emprestimos associados ao item, R$ 0.0, Nao emprestado, OUTRO|", 35);
        java.lang.String str92 = controllerEmprestimos0.listarItensEmprestados();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario6 and usuario76", (usuario6.compareTo(usuario76) == 0) == usuario6.equals(usuario76));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", 100.0d, (int) (short) -1, "Nao emprestado", "Caloteiro, OUTRO, ", (int) '#');
        bluRayFilme6.itemDevolvido();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayFilme6.getClassificacao();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str8 = bluRaySerie7.getEstado();
        bluRaySerie7.setPreco((double) 7);
        bluRaySerie7.itemDevolvido();
        java.lang.String str12 = bluRaySerie7.getDescricao();
        int int13 = bluRaySerie7.getNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = bluRaySerie7.toString();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        lp2.projetofinal.controllers.ControllerEmprestimos controllerEmprestimos0 = new lp2.projetofinal.controllers.ControllerEmprestimos();
        controllerEmprestimos0.carregaListaEmprestimos();
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
        java.lang.String str46 = usuario39.getNome();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie54 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str55 = bluRaySerie54.getEstado();
        java.lang.String str56 = bluRaySerie54.getGenero();
        java.lang.String str57 = bluRaySerie54.getEstado();
        lp2.projetofinal.entidades.Emprestimo emprestimo60 = new lp2.projetofinal.entidades.Emprestimo(usuario11, usuario39, (lp2.projetofinal.entidades.Item) bluRaySerie54, "JOGO DE TABULEIRO: Nenhum emprestimos associados ao item, R$ 100.0, Nao emprestado, COMPLETO|", (-1));
        double double61 = usuario11.getReputacao();
        usuario11.setTelefone("Nenhum item emprestado");
        java.lang.String str64 = controllerEmprestimos0.listarEmprestimosRequerenteOrdenadosPorNomeItem(usuario11);
        java.lang.String str65 = controllerEmprestimos0.listarItensEmprestados();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario6 and usuario11", (usuario6.compareTo(usuario11) == 0) == usuario6.equals(usuario11));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie29 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str30 = bluRaySerie29.getEstado();
        java.lang.String str31 = bluRaySerie29.getGenero();
        bluRaySerie29.atualizar("FreeRyder", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico38 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str39 = jogoEletronico38.toString();
        java.lang.String str40 = jogoEletronico38.getPlataforma();
        java.lang.String str41 = jogoEletronico38.getPlataforma();
        int int42 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie29, (lp2.projetofinal.entidades.Item) jogoEletronico38);
        java.lang.String str44 = bluRaySerie29.getInfo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = bluRaySerie29.getClassificacao();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", 0.0d, (int) (short) -1, "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", "Nenhum emprestimos associados ao item", (int) (byte) 100);
        java.lang.String str7 = bluRayShow6.getNomeArtista();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayShow6.toString();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        bluRayShow6.setNome("OUTRO");
        java.lang.String str15 = bluRayShow6.getInfo("Caloteiro, OUTRO, 1: ROMANCE - Reputacao: 0,00|");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = bluRayShow6.toString();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        bluRayShow6.atualizaNumeroEmprestimos();
        java.lang.String str8 = bluRayShow6.getNomeArtista();
        bluRayShow6.atualizaNumeroEmprestimos();
        bluRayShow6.atualizaNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = bluRayShow6.toString();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow7 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay8 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean9 = bluRayShow7.equals((java.lang.Object) classificacaoBluRay8);
        bluRayShow7.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow19 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str20 = bluRayShow19.getNome();
        int int21 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRayShow7, (lp2.projetofinal.entidades.Item) bluRayShow19);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie29 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str30 = bluRaySerie29.getEstado();
        java.lang.String str31 = bluRaySerie29.getGenero();
        bluRaySerie29.atualizar("FreeRyder", "JOGO DE TABULEIRO: hi!, R$ 0.0, Emprestado, COMPLETO");
        lp2.projetofinal.entidades.JogoEletronico jogoEletronico38 = new lp2.projetofinal.entidades.JogoEletronico("hi!", (double) (byte) 10, "");
        java.lang.String str39 = jogoEletronico38.toString();
        java.lang.String str40 = jogoEletronico38.getPlataforma();
        java.lang.String str41 = jogoEletronico38.getPlataforma();
        int int42 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) bluRaySerie29, (lp2.projetofinal.entidades.Item) jogoEletronico38);
        java.lang.String str44 = bluRaySerie29.getInfo("JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|");
        bluRaySerie29.adicionarBluRay(0);
        int int47 = bluRaySerie29.getDuracao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = bluRaySerie29.toString();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        lp2.projetofinal.enums.GeneroBluRay generoBluRay8 = lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO;
        boolean boolean9 = bluRaySerie7.equals((java.lang.Object) generoBluRay8);
        lp2.projetofinal.controllers.ControllerUsuario controllerUsuario10 = new lp2.projetofinal.controllers.ControllerUsuario();
        controllerUsuario10.salvarMapaUsuarios();
        controllerUsuario10.cadastrarUsuario("Caloteiro", "DOZE_ANOS", "ROMANCE");
        controllerUsuario10.carregaMapaUsuarios();
        java.util.Set<lp2.projetofinal.entidades.Item> itemSet17 = controllerUsuario10.todosUsuariosItens();
        boolean boolean18 = bluRaySerie7.equals((java.lang.Object) controllerUsuario10);
        bluRaySerie7.atualizaNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = bluRaySerie7.toString();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        lp2.projetofinal.entidades.BluRayFilme bluRayFilme6 = new lp2.projetofinal.entidades.BluRayFilme("", (double) 52, (int) ' ', "DOZE_ANOS", "Nao emprestado", (int) (short) 10);
        java.lang.String str8 = bluRayFilme6.getInfo("Emprestado");
        int int9 = bluRayFilme6.getNumeroEmprestimos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRayFilme6.toString();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos0 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow10 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente11 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean12 = bluRayShow10.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente11);
        int int13 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRayShow10);
        java.util.Comparator<lp2.projetofinal.entidades.Item> itemComparator14 = ordenaItemNumeroEmprestimos0.reversed();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro17 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.String str18 = jogoTabuleiro17.contemPecasPerdidas();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente19 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente20 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator21 = ordenaUsuarioReputacaoCrescente19.thenComparing((java.util.Comparator<lp2.projetofinal.entidades.Usuario>) ordenaUsuarioReputacaoCrescente20);
        java.util.Comparator<lp2.projetofinal.entidades.Usuario> usuarioComparator22 = ordenaUsuarioReputacaoCrescente19.reversed();
        boolean boolean23 = jogoTabuleiro17.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente19);
        jogoTabuleiro17.adicionarPecaPerdida("Nenhum emprestimos associados ao item");
        java.lang.String str26 = jogoTabuleiro17.getEstado();
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
        int int50 = emprestimo47.getNumeroDias();
        lp2.projetofinal.entidades.Usuario usuario51 = emprestimo47.getDonoDoItem();
        boolean boolean52 = jogoTabuleiro17.equals((java.lang.Object) usuario51);
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie60 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie60.adicionarBluRay((-11));
        int int63 = bluRaySerie60.getNumeroTemporada();
        java.lang.String str64 = bluRaySerie60.getGenero();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro67 = new lp2.projetofinal.entidades.JogoTabuleiro("hi!", (double) (short) 0);
        java.lang.Object obj68 = null;
        boolean boolean69 = jogoTabuleiro67.equals(obj68);
        int int70 = bluRaySerie60.compareTo((lp2.projetofinal.entidades.Item) jogoTabuleiro67);
        bluRaySerie60.atualizar("1: Caloteiro - Reputacao: 0,00|", "Caloteiro, OUTRO, 1: ROMANCE - Reputacao: 0,00|");
        int int74 = ordenaItemNumeroEmprestimos0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro17, (lp2.projetofinal.entidades.Item) bluRaySerie60);
        java.lang.String str76 = bluRaySerie60.getInfo("Caloteiro, Caloteiro, MUSICAL, , ");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on jogoTabuleiro17 and jogoTabuleiro67", (jogoTabuleiro17.compareTo(jogoTabuleiro67) == 0) == jogoTabuleiro17.equals(jogoTabuleiro67));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        lp2.projetofinal.entidades.Usuario usuario3 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str4 = usuario3.getTelefone();
        java.lang.String str5 = usuario3.getNome();
        double double6 = usuario3.getReputacao();
        lp2.projetofinal.entidades.CartaoCaloteiro cartaoCaloteiro7 = new lp2.projetofinal.entidades.CartaoCaloteiro();
        int int8 = cartaoCaloteiro7.prazoEmprestimo();
        usuario3.setCartao((lp2.projetofinal.interfaces.CartaoFidelidade) cartaoCaloteiro7);
        usuario3.setNome("QUATORZE_ANOS");
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
        lp2.projetofinal.entidades.Usuario usuario36 = new lp2.projetofinal.entidades.Usuario("Caloteiro", "OUTRO", "");
        java.lang.String str37 = usuario36.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo39 = new lp2.projetofinal.entidades.Emprestimo(usuario26, usuario36, "1: OUTRO - Reputacao: 0,00|");
        usuario36.setTelefone("1: ROMANCE - Reputacao: 0,00|");
        lp2.projetofinal.entidades.Usuario usuario45 = new lp2.projetofinal.entidades.Usuario("Nao emprestado", "Nenhum item emprestado", "NINTENDO 3DS");
        java.lang.String str46 = usuario45.getTelefone();
        lp2.projetofinal.entidades.Emprestimo emprestimo48 = new lp2.projetofinal.entidades.Emprestimo(usuario36, usuario45, "");
        lp2.projetofinal.entidades.Emprestimo emprestimo50 = new lp2.projetofinal.entidades.Emprestimo(usuario3, usuario45, "BomAmigo");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on usuario16 and usuario36", (usuario16.compareTo(usuario36) == 0) == usuario16.equals(usuario36));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Caloteiro", (-1.0d), "Noob", (int) (short) 100, "JOGO DE TABULEIRO: Caloteiro, R$ -1.0, Nao emprestado, COMPLETO|", "JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (int) (byte) 10);
        bluRaySerie7.adicionarBluRay((-11));
        java.lang.String str10 = bluRaySerie7.getNome();
        java.lang.String str11 = bluRaySerie7.getDescricao();
        java.lang.String str12 = bluRaySerie7.getGenero();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie20 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str21 = bluRaySerie20.getEstado();
        bluRaySerie20.setPreco((double) 7);
        bluRaySerie20.itemDevolvido();
        java.lang.String str25 = bluRaySerie20.getDescricao();
        bluRaySerie20.atualizaNumeroEmprestimos();
        java.lang.String str27 = bluRaySerie20.getEstado();
        int int28 = bluRaySerie7.compareTo((lp2.projetofinal.entidades.Item) bluRaySerie20);
        bluRaySerie20.adicionarBluRay(4);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos31 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro34 = new lp2.projetofinal.entidades.JogoTabuleiro("Noob", (double) (-1));
        lp2.projetofinal.entidades.BluRayShow bluRayShow41 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente42 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean43 = bluRayShow41.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente42);
        int int44 = ordenaItemNumeroEmprestimos31.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro34, (lp2.projetofinal.entidades.Item) bluRayShow41);
        double double45 = jogoTabuleiro34.getPreco();
        jogoTabuleiro34.setPreco(1.0d);
        java.lang.String str48 = jogoTabuleiro34.contemPecasPerdidas();
        java.lang.String str49 = jogoTabuleiro34.toString();
        int int50 = bluRaySerie20.compareTo((lp2.projetofinal.entidades.Item) jogoTabuleiro34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bluRaySerie7 and bluRayShow41", (bluRaySerie7.compareTo(bluRayShow41) == 0) == bluRaySerie7.equals(bluRayShow41));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        lp2.projetofinal.orders.OrdenaItemPeloPreco ordenaItemPeloPreco0 = new lp2.projetofinal.orders.OrdenaItemPeloPreco();
        lp2.projetofinal.entidades.JogoTabuleiro jogoTabuleiro3 = new lp2.projetofinal.entidades.JogoTabuleiro("Caloteiro, MUSICAL, ", (double) 35);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos4 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow11 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay12 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean13 = bluRayShow11.equals((java.lang.Object) classificacaoBluRay12);
        bluRayShow11.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow23 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str24 = bluRayShow23.getNome();
        int int25 = ordenaItemNumeroEmprestimos4.compare((lp2.projetofinal.entidades.Item) bluRayShow11, (lp2.projetofinal.entidades.Item) bluRayShow23);
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos26 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie34 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        java.lang.String str36 = bluRaySerie34.getInfo("Nao emprestado");
        lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos ordenaItemNumeroEmprestimos37 = new lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos();
        lp2.projetofinal.entidades.BluRayShow bluRayShow44 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay45 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean46 = bluRayShow44.equals((java.lang.Object) classificacaoBluRay45);
        bluRayShow44.atualizar("hi!", "OUTRO");
        lp2.projetofinal.entidades.BluRayShow bluRayShow56 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        java.lang.String str57 = bluRayShow56.getNome();
        int int58 = ordenaItemNumeroEmprestimos37.compare((lp2.projetofinal.entidades.Item) bluRayShow44, (lp2.projetofinal.entidades.Item) bluRayShow56);
        int int59 = ordenaItemNumeroEmprestimos26.compare((lp2.projetofinal.entidades.Item) bluRaySerie34, (lp2.projetofinal.entidades.Item) bluRayShow56);
        bluRaySerie34.itemDevolvido();
        bluRaySerie34.itemEmprestado();
        lp2.projetofinal.entidades.BluRayShow bluRayShow68 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente ordenaUsuarioReputacaoCrescente69 = new lp2.projetofinal.orders.OrdenaUsuarioReputacaoCrescente();
        boolean boolean70 = bluRayShow68.equals((java.lang.Object) ordenaUsuarioReputacaoCrescente69);
        int int71 = ordenaItemNumeroEmprestimos4.compare((lp2.projetofinal.entidades.Item) bluRaySerie34, (lp2.projetofinal.entidades.Item) bluRayShow68);
        bluRaySerie34.atualizaNumeroEmprestimos();
        int int73 = ordenaItemPeloPreco0.compare((lp2.projetofinal.entidades.Item) jogoTabuleiro3, (lp2.projetofinal.entidades.Item) bluRaySerie34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = bluRaySerie34.getClassificacao();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        java.lang.String str73 = bluRayFilme20.getGenero();
        bluRayFilme20.atualizar("MUSICAL", "Dono do item: Caloteiro, Nome do item emprestado: JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO||");
        java.lang.String str78 = bluRayFilme20.getInfo("PC");
        bluRayFilme20.itemEmprestado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = bluRayFilme20.toString();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        lp2.projetofinal.enums.ClassificacaoBluRay classificacaoBluRay7 = lp2.projetofinal.enums.ClassificacaoBluRay.DEZESSEIS_ANOS;
        boolean boolean8 = bluRayShow6.equals((java.lang.Object) classificacaoBluRay7);
        bluRayShow6.atualizar("hi!", "OUTRO");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = bluRayShow6.toString();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("JOGO ELETRONICO: Nao emprestado, R$ 1.0, Nao emprestado, OUTRO|", (double) '4', 5, "1: OUTRO - Reputacao: 0,00|", "1: OUTRO - Reputacao: 0,00|", (int) (short) 1);
        java.lang.String str7 = bluRayShow6.getNomeArtista();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = bluRayShow6.toString();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        lp2.projetofinal.entidades.BluRaySerie bluRaySerie7 = new lp2.projetofinal.entidades.BluRaySerie("Noob", (double) (byte) 0, "Lista de usuarios com reputacao negativa: ", 100, "ROMANCE", "ROMANCE", (-1));
        lp2.projetofinal.enums.GeneroBluRay generoBluRay8 = lp2.projetofinal.enums.GeneroBluRay.DOCUMENTARIO;
        boolean boolean9 = bluRaySerie7.equals((java.lang.Object) generoBluRay8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = bluRaySerie7.toString();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        lp2.projetofinal.entidades.BluRayShow bluRayShow6 = new lp2.projetofinal.entidades.BluRayShow("Caloteiro", (double) 100.0f, (int) '4', "hi!", "", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = bluRayShow6.toString();
    }
}

