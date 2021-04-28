import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 0L);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        java.lang.Long long1 = questionarioAplicado0.getIdProfessor();
        questionarioAplicado0.setIdQuestionario((java.lang.Long) 1L);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray1 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList2 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList2, questaoArray1);
        questionario0.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList2);
        java.util.Date date5 = questionario0.getDataCriacao();
        questionario0.setNome("hi!");
        java.util.Date date8 = questionario0.getDataUltimaEdicao();
        questionario0.setNome("111b4856-4fdf-442c-b462-ed7ac75fcbb9");
        org.junit.Assert.assertNotNull(questaoArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina3 = matricula2.getDisciplina();
        disciplina3.setId((java.lang.Long) 0L);
        com.ufcg.sad.models.questionario.Questionario questionario6 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str7 = questionario6.getDescricao();
        java.util.Date date8 = questionario6.getDataCriacao();
        java.lang.String str9 = questionario6.getDescricao();
        java.lang.Long long10 = questionario6.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList11 = questionario6.getQuestoes();
        questionario6.setDescricao("hi!");
        questionario6.setId((java.lang.Long) 1L);
        boolean boolean16 = disciplina3.equals((java.lang.Object) questionario6);
        java.lang.String str17 = disciplina3.getSemestre();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(disciplina3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(questaoList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2017.2" + "'", str17, "2017.2");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha0 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.Long long1 = respostaMultiplaEscolha0.getId();
        com.ufcg.sad.models.questionario.Questionario questionario2 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray3 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList4 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList4, questaoArray3);
        questionario2.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList4);
        boolean boolean7 = respostaMultiplaEscolha0.equals((java.lang.Object) questaoList4);
        respostaMultiplaEscolha0.setId((java.lang.Long) 1L);
        java.lang.Long long10 = respostaMultiplaEscolha0.getIdQuestao();
        respostaMultiplaEscolha0.setComentario("111b4856-4fdf-442c-b462-ed7ac75fcbb9");
        java.lang.String str13 = respostaMultiplaEscolha0.getComentario();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(questaoArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "111b4856-4fdf-442c-b462-ed7ac75fcbb9" + "'", str13, "111b4856-4fdf-442c-b462-ed7ac75fcbb9");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.ufcg.sad.controllers.RespostaController respostaController0 = new com.ufcg.sad.controllers.RespostaController();
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = respostaController0.getResposta((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.resposta.Resposta>> respostaListResponseEntity5 = respostaController0.getTodasAsRespostas("863eb965-40bb-4f07-88b4-8c62ef17adaa", (java.lang.Long) 10L);
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta6 = new com.ufcg.sad.models.resposta.RespostaAberta();
        java.lang.String str7 = respostaAberta6.getComentario();
        respostaAberta6.setIdQuestao((java.lang.Long) 0L);
        java.util.Date date10 = null;
        respostaAberta6.setDataResposta(date10);
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 = respostaController0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaAberta6);
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.resposta.Resposta>> respostaListResponseEntity15 = respostaController0.getTodasAsRespostas("com.ufcg.sad.exceptions.ParametroInvalidoException: ", (java.lang.Long) 1L);
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 = respostaController0.getResposta((java.lang.Long) 0L);
        org.junit.Assert.assertNull(objResponseEntity2);
        org.junit.Assert.assertNull(respostaListResponseEntity5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objResponseEntity12);
        org.junit.Assert.assertNull(respostaListResponseEntity15);
        org.junit.Assert.assertNull(objResponseEntity17);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "hi!");
        java.lang.Long long3 = matricula2.getId();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        java.lang.Long long1 = questionarioAplicado0.getIdProfessor();
        java.lang.Long long2 = questionarioAplicado0.getId();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray7 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet8, respostaArray7);
        com.ufcg.sad.models.token.Token token12 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray13 = new com.ufcg.sad.models.token.Token[] { token12 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet14, tokenArray13);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado16 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet8, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet14);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray21 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet22 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet22, respostaArray21);
        com.ufcg.sad.models.token.Token token26 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray27 = new com.ufcg.sad.models.token.Token[] { token26 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet28 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet28, tokenArray27);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado30 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet22, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet28);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet31 = questionarioAplicado30.getRespostas();
        questionarioAplicado30.setIdProfessor((java.lang.Long) 100L);
        java.util.Set<com.ufcg.sad.models.token.Token> tokenSet34 = questionarioAplicado30.getTokens();
        questionarioAplicado16.setTokens(tokenSet34);
        questionarioAplicado0.setTokens(tokenSet34);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(respostaArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tokenArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(respostaArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tokenArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(respostaSet31);
        org.junit.Assert.assertNotNull(tokenSet34);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray2 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet3 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3, disciplinaArray2);
        com.ufcg.sad.models.professor.Professor professor5 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3);
        professor5.setNome("");
        professor5.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("");
        professor5.addDisciplina(disciplina11);
        boolean boolean14 = disciplina11.equals((java.lang.Object) 100.0d);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = disciplina11.getMatriculas();
        disciplina11.setId((java.lang.Long) 1L);
        disciplina11.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(disciplinaArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matriculaSet15);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado4 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado0, "", (java.lang.Integer) 1, "");
        java.lang.Long long5 = questionarioAplicado0.getIdProfessor();
        java.lang.Long long6 = questionarioAplicado0.getIdQuestionario();
        com.ufcg.sad.models.opcao.Opcao opcao7 = new com.ufcg.sad.models.opcao.Opcao();
        java.lang.String str8 = opcao7.getNome();
        opcao7.setNome("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.Long long12 = respostaMultiplaEscolha11.getId();
        com.ufcg.sad.models.questionario.Questionario questionario13 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray14 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList15 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList15, questaoArray14);
        questionario13.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList15);
        boolean boolean18 = respostaMultiplaEscolha11.equals((java.lang.Object) questaoList15);
        boolean boolean19 = opcao7.equals((java.lang.Object) respostaMultiplaEscolha11);
        com.ufcg.sad.models.questionario.Questionario questionario20 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray21 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList22 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList22, questaoArray21);
        questionario20.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList22);
        questionario20.setId((java.lang.Long) 10L);
        java.util.Date date27 = questionario20.getDataUltimaEdicao();
        java.util.Date date28 = questionario20.getDataCriacao();
        boolean boolean29 = opcao7.equals((java.lang.Object) questionario20);
        boolean boolean30 = questionarioAplicado0.equals((java.lang.Object) opcao7);
        opcao7.setNome("053c642d-c4f0-4db8-9f09-a6a0428fcbaf");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(questaoArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(questaoArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.ufcg.sad.models.disciplina.Disciplina disciplina0 = new com.ufcg.sad.models.disciplina.Disciplina();
        disciplina0.setNome("com.ufcg.sad.exceptions.EntidadeNotFoundException");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.ufcg.sad.models.aluno.Aluno aluno1 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str2 = aluno1.getSobrenome();
        com.ufcg.sad.models.disciplina.Disciplina disciplina3 = null;
        com.ufcg.sad.models.matricula.Matricula matricula4 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 100L, aluno1, disciplina3);
        com.ufcg.sad.models.aluno.Aluno aluno5 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina6 = null;
        com.ufcg.sad.models.matricula.Matricula matricula7 = new com.ufcg.sad.models.matricula.Matricula(aluno5, disciplina6);
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = matricula7.getDisciplina();
        boolean boolean9 = matricula4.equals((java.lang.Object) disciplina8);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray12 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet13 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet13, disciplinaArray12);
        com.ufcg.sad.models.professor.Professor professor15 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet13);
        professor15.setNome("");
        com.ufcg.sad.models.matricula.Matricula matricula20 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina21 = matricula20.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = disciplina21.getMatriculas();
        professor15.addDisciplina(disciplina21);
        disciplina21.setTurma((java.lang.Integer) 0);
        disciplina21.setId((java.lang.Long) 0L);
        matricula4.setDisciplina(disciplina21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(disciplina8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(disciplinaArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matricula20);
        org.junit.Assert.assertNotNull(disciplina21);
        org.junit.Assert.assertNotNull(matriculaSet22);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.professor.Professor professor1 = new com.ufcg.sad.models.professor.Professor();
        java.lang.String str2 = professor1.getNome();
        questao0.setAutor(professor1);
        java.util.Date date4 = questao0.getDataCriacao();
        java.util.Date date5 = null;
        questao0.setDataCriacao(date5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("2017.2", "863eb965-40bb-4f07-88b4-8c62ef17adaa");
        java.lang.String str3 = credenciais2.getSenha();
        java.lang.String str4 = credenciais2.getLogin();
        credenciais2.setSenha("com.ufcg.sad.exceptions.EntidadeNotFoundException: cde6b885-0069-445b-83e0-a544d75171b9");
        java.lang.String str7 = credenciais2.getLogin();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "863eb965-40bb-4f07-88b4-8c62ef17adaa" + "'", str3, "863eb965-40bb-4f07-88b4-8c62ef17adaa");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2017.2" + "'", str4, "2017.2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2017.2" + "'", str7, "2017.2");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setId((java.lang.Long) (-1L));
        java.lang.String str3 = usuario0.getSobrenome();
        java.lang.String str4 = usuario0.getSenha();
        usuario0.setNome("com.ufcg.sad.exceptions.EntidadeNotFoundException");
        java.lang.String str7 = usuario0.getSobrenome();
        usuario0.setSenha("2017.2");
        usuario0.setSobrenome("111b4856-4fdf-442c-b462-ed7ac75fcbb9");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getEmail();
        java.lang.String str2 = usuario0.getSenha();
        java.lang.String str3 = usuario0.getNome();
        usuario0.setNome("cde6b885-0069-445b-83e0-a544d75171b9");
        usuario0.setEmail("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        java.lang.String str8 = usuario0.getSenha();
        java.lang.String str9 = usuario0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "863eb965-40bb-4f07-88b4-8c62ef17adaa" + "'", str9, "863eb965-40bb-4f07-88b4-8c62ef17adaa");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.ufcg.sad.models.aluno.Aluno aluno1 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str2 = aluno1.getSobrenome();
        com.ufcg.sad.models.disciplina.Disciplina disciplina3 = null;
        com.ufcg.sad.models.matricula.Matricula matricula4 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 100L, aluno1, disciplina3);
        com.ufcg.sad.models.matricula.Matricula matricula7 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = matricula7.getDisciplina();
        com.ufcg.sad.models.aluno.Aluno aluno12 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = null;
        com.ufcg.sad.models.matricula.Matricula matricula14 = new com.ufcg.sad.models.matricula.Matricula(aluno12, disciplina13);
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = matricula14.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula16 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = null;
        com.ufcg.sad.models.matricula.Matricula matricula19 = new com.ufcg.sad.models.matricula.Matricula(aluno17, disciplina18);
        com.ufcg.sad.models.disciplina.Disciplina disciplina20 = matricula19.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray21 = new com.ufcg.sad.models.matricula.Matricula[] { matricula14, matricula16, matricula19 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22, matriculaArray21);
        com.ufcg.sad.models.aluno.Aluno aluno24 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22);
        com.ufcg.sad.models.aluno.Aluno aluno28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = null;
        com.ufcg.sad.models.matricula.Matricula matricula30 = new com.ufcg.sad.models.matricula.Matricula(aluno28, disciplina29);
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = matricula30.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula32 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno33 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina34 = null;
        com.ufcg.sad.models.matricula.Matricula matricula35 = new com.ufcg.sad.models.matricula.Matricula(aluno33, disciplina34);
        com.ufcg.sad.models.disciplina.Disciplina disciplina36 = matricula35.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray37 = new com.ufcg.sad.models.matricula.Matricula[] { matricula30, matricula32, matricula35 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet38 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet38, matriculaArray37);
        com.ufcg.sad.models.aluno.Aluno aluno40 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet38);
        aluno24.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet38);
        disciplina8.adicionarAluno(aluno24);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet43 = disciplina8.getMatriculas();
        java.lang.Long long44 = disciplina8.getProfessorId();
        disciplina8.setNome("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        aluno1.adicionarDisciplina(disciplina8);
        com.ufcg.sad.models.matricula.Matricula matricula50 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina51 = matricula50.getDisciplina();
        disciplina51.setId((java.lang.Long) 10L);
        disciplina51.setProfessorId((java.lang.Long) 10L);
        com.ufcg.sad.models.aluno.Aluno aluno59 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina60 = null;
        com.ufcg.sad.models.matricula.Matricula matricula61 = new com.ufcg.sad.models.matricula.Matricula(aluno59, disciplina60);
        com.ufcg.sad.models.disciplina.Disciplina disciplina62 = matricula61.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula63 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno64 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina65 = null;
        com.ufcg.sad.models.matricula.Matricula matricula66 = new com.ufcg.sad.models.matricula.Matricula(aluno64, disciplina65);
        com.ufcg.sad.models.disciplina.Disciplina disciplina67 = matricula66.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray68 = new com.ufcg.sad.models.matricula.Matricula[] { matricula61, matricula63, matricula66 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet69 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet69, matriculaArray68);
        com.ufcg.sad.models.aluno.Aluno aluno71 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet69);
        disciplina51.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet69);
        com.ufcg.sad.models.matricula.Matricula matricula73 = new com.ufcg.sad.models.matricula.Matricula(aluno1, disciplina51);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(matricula7);
        org.junit.Assert.assertNotNull(disciplina8);
        org.junit.Assert.assertNull(disciplina15);
        org.junit.Assert.assertNull(disciplina20);
        org.junit.Assert.assertNotNull(matriculaArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(disciplina31);
        org.junit.Assert.assertNull(disciplina36);
        org.junit.Assert.assertNotNull(matriculaArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(matriculaSet43);
        org.junit.Assert.assertNull(long44);
        org.junit.Assert.assertNotNull(matricula50);
        org.junit.Assert.assertNotNull(disciplina51);
        org.junit.Assert.assertNull(disciplina62);
        org.junit.Assert.assertNull(disciplina67);
        org.junit.Assert.assertNotNull(matriculaArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 0L);
        token2.setId("6ce55755-12a5-4de7-827f-c18e407346cd");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray1 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList2 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList2, questaoArray1);
        questionario0.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList2);
        java.lang.Long long5 = questionario0.getId();
        questionario0.setNome("");
        java.util.Date date8 = null;
        questionario0.setDataUltimaEdicao(date8);
        questionario0.setId((java.lang.Long) 0L);
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList12 = questionario0.getQuestoes();
        java.util.Date date13 = questionario0.getDataCriacao();
        org.junit.Assert.assertNotNull(questaoArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNotNull(questaoList12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado4 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado0, "", (java.lang.Integer) 1, "");
        java.lang.String str5 = questionarioAplicado4.getSemestre();
        java.lang.Long long6 = questionarioAplicado4.getIdProfessor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token token9 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray10 = new com.ufcg.sad.models.token.Token[] { token9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet11, tokenArray10);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado13 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet11);
        questionarioAplicado13.setIdProfessor((java.lang.Long) 1L);
        java.util.Date date17 = null;
        com.ufcg.sad.models.professor.Professor professor21 = null;
        java.util.Date date22 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray24 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList25 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList25, opcaoArray24);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao27 = null;
        com.ufcg.sad.models.questao.Questao questao28 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor21, date22, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList25, tipoQuestao27);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao29 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) (-1L), date17, (java.lang.Long) 0L, (java.lang.Long) 10L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList25);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList30 = respostaSelecao29.getOpcoesSelecionadas();
        questionarioAplicado13.addResposta((com.ufcg.sad.models.resposta.Resposta) respostaSelecao29);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(opcaoArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(questao28);
        org.junit.Assert.assertNotNull(opcaoList30);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException1 = new com.ufcg.sad.exceptions.EntidadeInvalidaException("d935651c-b2a6-46f5-93bb-35c7156b386a");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token token9 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray10 = new com.ufcg.sad.models.token.Token[] { token9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet11, tokenArray10);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado13 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet11);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray18 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet19, respostaArray18);
        com.ufcg.sad.models.token.Token token23 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray24 = new com.ufcg.sad.models.token.Token[] { token23 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet25 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet25, tokenArray24);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado27 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet19, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet25);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet28 = questionarioAplicado27.getRespostas();
        questionarioAplicado27.setIdProfessor((java.lang.Long) 100L);
        java.util.Set<com.ufcg.sad.models.token.Token> tokenSet31 = questionarioAplicado27.getTokens();
        questionarioAplicado13.setTokens(tokenSet31);
        java.lang.Integer int33 = questionarioAplicado13.getTurma();
        com.ufcg.sad.models.token.Token token34 = new com.ufcg.sad.models.token.Token();
        token34.setIdAluno((java.lang.Long) 1L);
        token34.setIdQuestionarioAplicado((java.lang.Long) 1L);
        questionarioAplicado13.addToken(token34);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(respostaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tokenArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(respostaSet28);
        org.junit.Assert.assertNotNull(tokenSet31);
        org.junit.Assert.assertNull(int33);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 100L, (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Long) 100L, "70ea7515-9f10-40a2-b76d-742150a7b6d0");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.ufcg.sad.models.aluno.Aluno aluno8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = null;
        com.ufcg.sad.models.matricula.Matricula matricula10 = new com.ufcg.sad.models.matricula.Matricula(aluno8, disciplina9);
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = matricula10.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula12 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno13 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina14 = null;
        com.ufcg.sad.models.matricula.Matricula matricula15 = new com.ufcg.sad.models.matricula.Matricula(aluno13, disciplina14);
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = matricula15.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray17 = new com.ufcg.sad.models.matricula.Matricula[] { matricula10, matricula12, matricula15 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet18 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18, matriculaArray17);
        com.ufcg.sad.models.aluno.Aluno aluno20 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18);
        com.ufcg.sad.models.disciplina.Disciplina disciplina21 = new com.ufcg.sad.models.disciplina.Disciplina((java.lang.Long) 0L, "2017.2", (java.lang.Integer) 10, (java.lang.Long) 1L, "2017.2", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18);
        com.ufcg.sad.models.matricula.Matricula matricula24 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina25 = matricula24.getDisciplina();
        com.ufcg.sad.models.aluno.Aluno aluno29 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina30 = null;
        com.ufcg.sad.models.matricula.Matricula matricula31 = new com.ufcg.sad.models.matricula.Matricula(aluno29, disciplina30);
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = matricula31.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula33 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno34 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina35 = null;
        com.ufcg.sad.models.matricula.Matricula matricula36 = new com.ufcg.sad.models.matricula.Matricula(aluno34, disciplina35);
        com.ufcg.sad.models.disciplina.Disciplina disciplina37 = matricula36.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray38 = new com.ufcg.sad.models.matricula.Matricula[] { matricula31, matricula33, matricula36 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet39 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39, matriculaArray38);
        com.ufcg.sad.models.aluno.Aluno aluno41 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39);
        com.ufcg.sad.models.aluno.Aluno aluno45 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina46 = null;
        com.ufcg.sad.models.matricula.Matricula matricula47 = new com.ufcg.sad.models.matricula.Matricula(aluno45, disciplina46);
        com.ufcg.sad.models.disciplina.Disciplina disciplina48 = matricula47.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula49 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno50 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina51 = null;
        com.ufcg.sad.models.matricula.Matricula matricula52 = new com.ufcg.sad.models.matricula.Matricula(aluno50, disciplina51);
        com.ufcg.sad.models.disciplina.Disciplina disciplina53 = matricula52.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray54 = new com.ufcg.sad.models.matricula.Matricula[] { matricula47, matricula49, matricula52 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet55 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet55, matriculaArray54);
        com.ufcg.sad.models.aluno.Aluno aluno57 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet55);
        aluno41.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet55);
        disciplina25.adicionarAluno(aluno41);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet60 = disciplina25.getMatriculas();
        java.lang.Long long61 = disciplina25.getProfessorId();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet62 = disciplina25.getMatriculas();
        disciplina21.setMatriculas(matriculaSet62);
        org.junit.Assert.assertNull(disciplina11);
        org.junit.Assert.assertNull(disciplina16);
        org.junit.Assert.assertNotNull(matriculaArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(matricula24);
        org.junit.Assert.assertNotNull(disciplina25);
        org.junit.Assert.assertNull(disciplina32);
        org.junit.Assert.assertNull(disciplina37);
        org.junit.Assert.assertNotNull(matriculaArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(disciplina48);
        org.junit.Assert.assertNull(disciplina53);
        org.junit.Assert.assertNotNull(matriculaArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(matriculaSet60);
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertNotNull(matriculaSet62);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray7 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet8, disciplinaArray7);
        com.ufcg.sad.models.professor.Professor professor10 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet8);
        professor10.setNome("");
        professor10.setNome("");
        java.lang.String str15 = professor10.getSiape();
        java.lang.Long long16 = professor10.getId();
        professor10.setNome("2017.2");
        professor10.setId((java.lang.Long) 10L);
        questionario0.setAutor(professor10);
        java.util.Date date22 = questionario0.getDataUltimaEdicao();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(disciplinaArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha0 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.String str1 = respostaMultiplaEscolha0.getComentario();
        com.ufcg.sad.models.opcao.Opcao opcao2 = respostaMultiplaEscolha0.getOpcaoEscolhida();
        com.ufcg.sad.models.opcao.Opcao opcao3 = respostaMultiplaEscolha0.getOpcaoEscolhida();
        java.util.Date date5 = null;
        com.ufcg.sad.models.opcao.Opcao opcao8 = new com.ufcg.sad.models.opcao.Opcao();
        java.lang.String str9 = opcao8.getNome();
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 0L, date5, (java.lang.Long) 1L, (java.lang.Long) 1L, opcao8, "2017.2");
        java.lang.Long long12 = opcao8.getId();
        opcao8.setId((java.lang.Long) (-1L));
        respostaMultiplaEscolha0.setOpcaoEscolhida(opcao8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(opcao2);
        org.junit.Assert.assertNull(opcao3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.ufcg.sad.models.aluno.Aluno aluno0 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str1 = aluno0.getSobrenome();
        aluno0.setId((java.lang.Long) 0L);
        java.lang.String str4 = aluno0.getEmail();
        aluno0.setId((java.lang.Long) 100L);
        aluno0.setSobrenome("com.ufcg.sad.exceptions.EntidadeNotFoundException");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray10 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet11, respostaArray10);
        com.ufcg.sad.models.token.Token token15 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray16 = new com.ufcg.sad.models.token.Token[] { token15 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet17 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet17, tokenArray16);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado19 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet11, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet17);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet20 = questionarioAplicado19.getRespostas();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray29 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet30 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet30, respostaArray29);
        com.ufcg.sad.models.token.Token token34 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray35 = new com.ufcg.sad.models.token.Token[] { token34 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet36 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet36, tokenArray35);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado38 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet30, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet36);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray43 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet44 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet44, respostaArray43);
        com.ufcg.sad.models.token.Token token48 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray49 = new com.ufcg.sad.models.token.Token[] { token48 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet50 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet50, tokenArray49);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado52 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet44, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet50);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado53 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 100L, (java.lang.Long) 0L, (java.lang.Long) 100L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet30, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet50);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado54 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Long) (-1L), "2017.2", (java.lang.Integer) (-1), respostaSet20, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet50);
        questionarioAplicado54.setIdDisciplina((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(respostaArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tokenArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(respostaSet20);
        org.junit.Assert.assertNotNull(respostaArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tokenArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(respostaArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tokenArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token token9 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray10 = new com.ufcg.sad.models.token.Token[] { token9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet11, tokenArray10);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado13 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet11);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet14 = questionarioAplicado13.getRespostas();
        questionarioAplicado13.setIdProfessor((java.lang.Long) 100L);
        questionarioAplicado13.setIdQuestionario((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(respostaSet14);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.ufcg.sad.models.aluno.Aluno aluno4 = new com.ufcg.sad.models.aluno.Aluno();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray7 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet8, disciplinaArray7);
        com.ufcg.sad.models.professor.Professor professor10 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet8);
        professor10.setNome("");
        com.ufcg.sad.models.matricula.Matricula matricula15 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = matricula15.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = disciplina16.getMatriculas();
        professor10.addDisciplina(disciplina16);
        com.ufcg.sad.models.matricula.Matricula matricula19 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 1L, aluno4, disciplina16);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet20 = disciplina16.getMatriculas();
        com.ufcg.sad.models.aluno.Aluno aluno21 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "863eb965-40bb-4f07-88b4-8c62ef17adaa", "111b4856-4fdf-442c-b462-ed7ac75fcbb9", matriculaSet20);
        org.junit.Assert.assertNotNull(disciplinaArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matricula15);
        org.junit.Assert.assertNotNull(disciplina16);
        org.junit.Assert.assertNotNull(matriculaSet17);
        org.junit.Assert.assertNotNull(matriculaSet20);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado4 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado0, "hi!", (java.lang.Integer) 5, "111b4856-4fdf-442c-b462-ed7ac75fcbb9");
        java.lang.String str5 = questionarioAplicado4.getSemestre();
        com.ufcg.sad.models.token.Token token6 = new com.ufcg.sad.models.token.Token();
        token6.setIdAluno((java.lang.Long) 1L);
        token6.setIdQuestionarioAplicado((java.lang.Long) 1L);
        questionarioAplicado4.removeToken(token6);
        java.lang.Long long12 = questionarioAplicado4.getIdQuestionario();
        java.util.Set<com.ufcg.sad.models.token.Token> tokenSet13 = questionarioAplicado4.getTokens();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "111b4856-4fdf-442c-b462-ed7ac75fcbb9" + "'", str5, "111b4856-4fdf-442c-b462-ed7ac75fcbb9");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(tokenSet13);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta5 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 100L, date1, (java.lang.Long) 0L, (java.lang.Long) 1L, "com.ufcg.sad.exceptions.EntidadeNotFoundException: cde6b885-0069-445b-83e0-a544d75171b9");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray10 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet11, respostaArray10);
        com.ufcg.sad.models.token.Token token15 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray16 = new com.ufcg.sad.models.token.Token[] { token15 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet17 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet17, tokenArray16);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado19 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet11, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet17);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet20 = questionarioAplicado19.getRespostas();
        questionarioAplicado19.setIdProfessor((java.lang.Long) 100L);
        java.lang.String str23 = questionarioAplicado19.getDisciplina();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado29 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) 0L, (java.lang.Long) 10L, (java.lang.Long) (-1L), "cde6b885-0069-445b-83e0-a544d75171b9");
        questionarioAplicado29.setId((java.lang.Long) 10L);
        boolean boolean32 = questionarioAplicado19.equals((java.lang.Object) questionarioAplicado29);
        questionarioAplicado29.setSemestre("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        boolean boolean35 = respostaAberta5.equals((java.lang.Object) "863eb965-40bb-4f07-88b4-8c62ef17adaa");
        org.junit.Assert.assertNotNull(respostaArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tokenArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(respostaSet20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray2 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet3 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3, disciplinaArray2);
        com.ufcg.sad.models.professor.Professor professor5 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet6 = professor5.getDisciplinas();
        professor5.setNome("cde6b885-0069-445b-83e0-a544d75171b9");
        professor5.setId((java.lang.Long) 10L);
        java.lang.String str11 = professor5.getSiape();
        org.junit.Assert.assertNotNull(disciplinaArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(disciplinaSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.Date date1 = null;
        com.ufcg.sad.models.professor.Professor professor5 = null;
        java.util.Date date6 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray8 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList9 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList9, opcaoArray8);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao11 = null;
        com.ufcg.sad.models.questao.Questao questao12 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor5, date6, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList9, tipoQuestao11);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao13 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) (-1L), date1, (java.lang.Long) 0L, (java.lang.Long) 10L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList9);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList14 = respostaSelecao13.getOpcoesSelecionadas();
        java.util.Date date15 = null;
        respostaSelecao13.setDataResposta(date15);
        com.ufcg.sad.models.matricula.Matricula matricula17 = new com.ufcg.sad.models.matricula.Matricula();
        boolean boolean18 = respostaSelecao13.equals((java.lang.Object) matricula17);
        org.junit.Assert.assertNotNull(opcaoArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(questao12);
        org.junit.Assert.assertNotNull(opcaoList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.ufcg.sad.models.token.Token token0 = new com.ufcg.sad.models.token.Token();
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha1 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.Long long2 = respostaMultiplaEscolha1.getId();
        com.ufcg.sad.models.questionario.Questionario questionario3 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray4 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList5 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList5, questaoArray4);
        questionario3.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList5);
        boolean boolean8 = respostaMultiplaEscolha1.equals((java.lang.Object) questaoList5);
        respostaMultiplaEscolha1.setId((java.lang.Long) 1L);
        com.ufcg.sad.models.opcao.Opcao opcao11 = respostaMultiplaEscolha1.getOpcaoEscolhida();
        boolean boolean12 = token0.equals((java.lang.Object) respostaMultiplaEscolha1);
        java.lang.String str13 = respostaMultiplaEscolha1.getComentario();
        java.util.Date date14 = respostaMultiplaEscolha1.getDataResposta();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(questaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(opcao11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.ufcg.sad.models.opcao.Opcao opcao0 = new com.ufcg.sad.models.opcao.Opcao();
        opcao0.setDescricao("hi!");
        opcao0.setDescricao("111b4856-4fdf-442c-b462-ed7ac75fcbb9");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException1 = new com.ufcg.sad.exceptions.EntidadeInvalidaException("053c642d-c4f0-4db8-9f09-a6a0428fcbaf");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha3 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.Long long4 = respostaMultiplaEscolha3.getId();
        com.ufcg.sad.models.questionario.Questionario questionario5 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray6 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList7 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList7, questaoArray6);
        questionario5.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList7);
        boolean boolean10 = respostaMultiplaEscolha3.equals((java.lang.Object) questaoList7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray13 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14, disciplinaArray13);
        com.ufcg.sad.models.professor.Professor professor16 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14);
        professor16.setNome("");
        professor16.setNome("");
        professor16.setNome("");
        java.util.Date date23 = null;
        java.util.Date date24 = null;
        com.ufcg.sad.models.questionario.Questionario questionario25 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) 1L, "hi!", "863eb965-40bb-4f07-88b4-8c62ef17adaa", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList7, professor16, date23, date24);
        java.lang.Long long26 = professor16.getId();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(questaoArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(disciplinaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(long26);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException1 = new com.ufcg.sad.exceptions.ParametroInvalidoException("2017.2");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.ufcg.sad.models.professor.Professor professor1 = null;
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao7 = null;
        com.ufcg.sad.models.questao.Questao questao8 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor1, date2, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, tipoQuestao7);
        questao8.setComentario("");
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList11 = questao8.getOpcoes();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao12 = questao8.getTipoQuestao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao13 = questao8.getTipoQuestao();
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(questao8);
        org.junit.Assert.assertNotNull(opcaoList11);
        org.junit.Assert.assertNull(tipoQuestao12);
        org.junit.Assert.assertNull(tipoQuestao13);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.util.Date date3 = null;
        questionario0.setDataCriacao(date3);
        com.ufcg.sad.models.professor.Professor professor5 = questionario0.getAutor();
        com.ufcg.sad.models.professor.Professor professor6 = questionario0.getAutor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(professor5);
        org.junit.Assert.assertNull(professor6);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha0 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.String str1 = respostaMultiplaEscolha0.getComentario();
        com.ufcg.sad.models.opcao.Opcao opcao2 = respostaMultiplaEscolha0.getOpcaoEscolhida();
        respostaMultiplaEscolha0.setIdQuestao((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(opcao2);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.ufcg.sad.models.aluno.Aluno aluno1 = new com.ufcg.sad.models.aluno.Aluno();
        aluno1.setEmail("111b4856-4fdf-442c-b462-ed7ac75fcbb9");
        com.ufcg.sad.models.disciplina.Disciplina disciplina4 = null;
        com.ufcg.sad.models.matricula.Matricula matricula5 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 1L, aluno1, disciplina4);
        java.lang.String str6 = aluno1.getSobrenome();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token token9 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray10 = new com.ufcg.sad.models.token.Token[] { token9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet11, tokenArray10);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado13 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet11);
        questionarioAplicado13.setIdQuestionario((java.lang.Long) (-1L));
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet16 = questionarioAplicado13.getRespostas();
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(respostaSet16);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.ufcg.sad.models.aluno.Aluno aluno2 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str3 = aluno2.getSobrenome();
        com.ufcg.sad.models.disciplina.Disciplina disciplina4 = null;
        com.ufcg.sad.models.matricula.Matricula matricula5 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 100L, aluno2, disciplina4);
        com.ufcg.sad.models.disciplina.Disciplina disciplina6 = new com.ufcg.sad.models.disciplina.Disciplina();
        disciplina6.setProfessorId((java.lang.Long) 10L);
        com.ufcg.sad.models.matricula.Matricula matricula9 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 10L, aluno2, disciplina6);
        disciplina6.setProfessorId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray2 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet3 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3, disciplinaArray2);
        com.ufcg.sad.models.professor.Professor professor5 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3);
        professor5.setNome("");
        professor5.setNome("");
        professor5.setNome("");
        java.util.Date date13 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta17 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) (-1L), date13, (java.lang.Long) 10L, (java.lang.Long) 0L, "");
        java.lang.Class<?> wildcardClass18 = respostaAberta17.getClass();
        boolean boolean19 = professor5.equals((java.lang.Object) respostaAberta17);
        professor5.setId((java.lang.Long) 0L);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray24 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet25 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25, disciplinaArray24);
        com.ufcg.sad.models.professor.Professor professor27 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25);
        professor27.setNome("");
        professor27.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina disciplina33 = new com.ufcg.sad.models.disciplina.Disciplina("");
        professor27.addDisciplina(disciplina33);
        boolean boolean36 = disciplina33.equals((java.lang.Object) 100.0d);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet37 = disciplina33.getMatriculas();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray40 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet41 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet41, disciplinaArray40);
        com.ufcg.sad.models.professor.Professor professor43 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet41);
        professor43.setNome("");
        com.ufcg.sad.models.matricula.Matricula matricula48 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina49 = matricula48.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet50 = disciplina49.getMatriculas();
        professor43.addDisciplina(disciplina49);
        disciplina49.setTurma((java.lang.Integer) 0);
        disciplina49.setId((java.lang.Long) 0L);
        boolean boolean56 = disciplina33.equals((java.lang.Object) 0L);
        java.lang.String str57 = disciplina33.getSemestre();
        java.lang.String str58 = disciplina33.getCodigo();
        professor5.addDisciplina(disciplina33);
        disciplina33.setNome("d935651c-b2a6-46f5-93bb-35c7156b386a");
        org.junit.Assert.assertNotNull(disciplinaArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(disciplinaArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(matriculaSet37);
        org.junit.Assert.assertNotNull(disciplinaArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(matricula48);
        org.junit.Assert.assertNotNull(disciplina49);
        org.junit.Assert.assertNotNull(matriculaSet50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.ufcg.sad.models.aluno.Aluno aluno2 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str3 = aluno2.getSobrenome();
        com.ufcg.sad.models.disciplina.Disciplina disciplina4 = null;
        com.ufcg.sad.models.matricula.Matricula matricula5 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 100L, aluno2, disciplina4);
        com.ufcg.sad.models.matricula.Matricula matricula8 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = matricula8.getDisciplina();
        com.ufcg.sad.models.aluno.Aluno aluno13 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina14 = null;
        com.ufcg.sad.models.matricula.Matricula matricula15 = new com.ufcg.sad.models.matricula.Matricula(aluno13, disciplina14);
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = matricula15.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula17 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno18 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina19 = null;
        com.ufcg.sad.models.matricula.Matricula matricula20 = new com.ufcg.sad.models.matricula.Matricula(aluno18, disciplina19);
        com.ufcg.sad.models.disciplina.Disciplina disciplina21 = matricula20.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray22 = new com.ufcg.sad.models.matricula.Matricula[] { matricula15, matricula17, matricula20 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet23 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet23, matriculaArray22);
        com.ufcg.sad.models.aluno.Aluno aluno25 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet23);
        com.ufcg.sad.models.aluno.Aluno aluno29 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina30 = null;
        com.ufcg.sad.models.matricula.Matricula matricula31 = new com.ufcg.sad.models.matricula.Matricula(aluno29, disciplina30);
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = matricula31.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula33 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno34 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina35 = null;
        com.ufcg.sad.models.matricula.Matricula matricula36 = new com.ufcg.sad.models.matricula.Matricula(aluno34, disciplina35);
        com.ufcg.sad.models.disciplina.Disciplina disciplina37 = matricula36.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray38 = new com.ufcg.sad.models.matricula.Matricula[] { matricula31, matricula33, matricula36 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet39 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39, matriculaArray38);
        com.ufcg.sad.models.aluno.Aluno aluno41 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39);
        aluno25.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39);
        disciplina9.adicionarAluno(aluno25);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet44 = disciplina9.getMatriculas();
        java.lang.Long long45 = disciplina9.getProfessorId();
        disciplina9.setNome("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        aluno2.adicionarDisciplina(disciplina9);
        com.ufcg.sad.models.matricula.Matricula matricula51 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina52 = matricula51.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula53 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 100L, aluno2, disciplina52);
        com.ufcg.sad.models.matricula.Matricula matricula61 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina62 = matricula61.getDisciplina();
        disciplina62.setId((java.lang.Long) 10L);
        disciplina62.setProfessorId((java.lang.Long) 10L);
        com.ufcg.sad.models.aluno.Aluno aluno70 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina71 = null;
        com.ufcg.sad.models.matricula.Matricula matricula72 = new com.ufcg.sad.models.matricula.Matricula(aluno70, disciplina71);
        com.ufcg.sad.models.disciplina.Disciplina disciplina73 = matricula72.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula74 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno75 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina76 = null;
        com.ufcg.sad.models.matricula.Matricula matricula77 = new com.ufcg.sad.models.matricula.Matricula(aluno75, disciplina76);
        com.ufcg.sad.models.disciplina.Disciplina disciplina78 = matricula77.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray79 = new com.ufcg.sad.models.matricula.Matricula[] { matricula72, matricula74, matricula77 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet80 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet80, matriculaArray79);
        com.ufcg.sad.models.aluno.Aluno aluno82 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet80);
        disciplina62.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet80);
        com.ufcg.sad.models.disciplina.Disciplina disciplina84 = new com.ufcg.sad.models.disciplina.Disciplina((java.lang.Long) 0L, "com.ufcg.sad.exceptions.EntidadeNotFoundException", (java.lang.Integer) (-1), (java.lang.Long) 100L, "", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet80);
        aluno2.removerDisciplina(disciplina84);
        java.lang.Long long86 = aluno2.getId();
        aluno2.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(matricula8);
        org.junit.Assert.assertNotNull(disciplina9);
        org.junit.Assert.assertNull(disciplina16);
        org.junit.Assert.assertNull(disciplina21);
        org.junit.Assert.assertNotNull(matriculaArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(disciplina32);
        org.junit.Assert.assertNull(disciplina37);
        org.junit.Assert.assertNotNull(matriculaArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(matriculaSet44);
        org.junit.Assert.assertNull(long45);
        org.junit.Assert.assertNotNull(matricula51);
        org.junit.Assert.assertNotNull(disciplina52);
        org.junit.Assert.assertNotNull(matricula61);
        org.junit.Assert.assertNotNull(disciplina62);
        org.junit.Assert.assertNull(disciplina73);
        org.junit.Assert.assertNull(disciplina78);
        org.junit.Assert.assertNotNull(matriculaArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(long86);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("863eb965-40bb-4f07-88b4-8c62ef17adaa", "6ce55755-12a5-4de7-827f-c18e407346cd");
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.ufcg.sad.models.professor.Professor professor1 = null;
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao7 = null;
        com.ufcg.sad.models.questao.Questao questao8 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor1, date2, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, tipoQuestao7);
        questao8.setComentario("");
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList11 = questao8.getOpcoes();
        java.lang.String str12 = questao8.getEnunciado();
        questao8.setId((java.lang.Long) (-1L));
        java.util.Date date15 = null;
        questao8.setDataUltimaEdicao(date15);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao17 = questao8.getTipoQuestao();
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(questao8);
        org.junit.Assert.assertNotNull(opcaoList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(tipoQuestao17);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        token3.setIdQuestionarioAplicado((java.lang.Long) 0L);
        java.lang.Object obj6 = null;
        boolean boolean7 = token3.equals(obj6);
        token3.setId("cda151ca-1f67-46c2-bfb6-4b1964e2b258");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 = tokenController0.criaToken(token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray1 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList2 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList2, questaoArray1);
        questionario0.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList2);
        questionario0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(questaoArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.ufcg.sad.models.professor.Professor professor1 = null;
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao7 = null;
        com.ufcg.sad.models.questao.Questao questao8 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor1, date2, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, tipoQuestao7);
        questao8.setComentario("");
        java.lang.Long long11 = questao8.getId();
        com.ufcg.sad.models.professor.Professor professor12 = questao8.getAutor();
        java.lang.String str13 = questao8.getComentario();
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(questao8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(professor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina3 = matricula2.getDisciplina();
        com.ufcg.sad.models.aluno.Aluno aluno7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = null;
        com.ufcg.sad.models.matricula.Matricula matricula9 = new com.ufcg.sad.models.matricula.Matricula(aluno7, disciplina8);
        com.ufcg.sad.models.disciplina.Disciplina disciplina10 = matricula9.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula11 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno12 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = null;
        com.ufcg.sad.models.matricula.Matricula matricula14 = new com.ufcg.sad.models.matricula.Matricula(aluno12, disciplina13);
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = matricula14.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray16 = new com.ufcg.sad.models.matricula.Matricula[] { matricula9, matricula11, matricula14 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet17, matriculaArray16);
        com.ufcg.sad.models.aluno.Aluno aluno19 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet17);
        com.ufcg.sad.models.aluno.Aluno aluno23 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina24 = null;
        com.ufcg.sad.models.matricula.Matricula matricula25 = new com.ufcg.sad.models.matricula.Matricula(aluno23, disciplina24);
        com.ufcg.sad.models.disciplina.Disciplina disciplina26 = matricula25.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula27 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = null;
        com.ufcg.sad.models.matricula.Matricula matricula30 = new com.ufcg.sad.models.matricula.Matricula(aluno28, disciplina29);
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = matricula30.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray32 = new com.ufcg.sad.models.matricula.Matricula[] { matricula25, matricula27, matricula30 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet33, matriculaArray32);
        com.ufcg.sad.models.aluno.Aluno aluno35 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet33);
        aluno19.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet33);
        disciplina3.adicionarAluno(aluno19);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet38 = disciplina3.getMatriculas();
        java.lang.Long long39 = disciplina3.getProfessorId();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet40 = disciplina3.getMatriculas();
        boolean boolean42 = disciplina3.equals((java.lang.Object) (short) 100);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet43 = disciplina3.getMatriculas();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(disciplina3);
        org.junit.Assert.assertNull(disciplina10);
        org.junit.Assert.assertNull(disciplina15);
        org.junit.Assert.assertNotNull(matriculaArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(disciplina26);
        org.junit.Assert.assertNull(disciplina31);
        org.junit.Assert.assertNotNull(matriculaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(matriculaSet38);
        org.junit.Assert.assertNull(long39);
        org.junit.Assert.assertNotNull(matriculaSet40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(matriculaSet43);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.Date date1 = null;
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray7 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet8, disciplinaArray7);
        com.ufcg.sad.models.professor.Professor professor10 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet8);
        professor10.setNome("");
        com.ufcg.sad.models.matricula.Matricula matricula15 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = matricula15.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = disciplina16.getMatriculas();
        professor10.addDisciplina(disciplina16);
        java.util.Date date19 = null;
        java.util.Date date22 = null;
        com.ufcg.sad.models.professor.Professor professor26 = null;
        java.util.Date date27 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray29 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList30 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList30, opcaoArray29);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao32 = null;
        com.ufcg.sad.models.questao.Questao questao33 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor26, date27, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList30, tipoQuestao32);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao34 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) (-1L), date22, (java.lang.Long) 0L, (java.lang.Long) 10L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList30);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList35 = respostaSelecao34.getOpcoesSelecionadas();
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList36 = respostaSelecao34.getOpcoesSelecionadas();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao37 = com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA;
        com.ufcg.sad.models.questao.Questao questao38 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor10, date19, "863eb965-40bb-4f07-88b4-8c62ef17adaa", opcaoList36, tipoQuestao37);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList39 = questao38.getOpcoes();
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao40 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) (-1L), date1, (java.lang.Long) 0L, (java.lang.Long) 100L, opcaoList39);
        org.junit.Assert.assertNotNull(disciplinaArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matricula15);
        org.junit.Assert.assertNotNull(disciplina16);
        org.junit.Assert.assertNotNull(matriculaSet17);
        org.junit.Assert.assertNotNull(opcaoArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(questao33);
        org.junit.Assert.assertNotNull(opcaoList35);
        org.junit.Assert.assertNotNull(opcaoList36);
        org.junit.Assert.assertTrue("'" + tipoQuestao37 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA + "'", tipoQuestao37.equals(com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA));
        org.junit.Assert.assertNotNull(questao38);
        org.junit.Assert.assertNotNull(opcaoList39);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        com.ufcg.sad.models.aluno.Aluno aluno2 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str3 = aluno2.getSobrenome();
        com.ufcg.sad.models.disciplina.Disciplina disciplina4 = null;
        com.ufcg.sad.models.matricula.Matricula matricula5 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 100L, aluno2, disciplina4);
        com.ufcg.sad.models.matricula.Matricula matricula8 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = matricula8.getDisciplina();
        com.ufcg.sad.models.aluno.Aluno aluno13 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina14 = null;
        com.ufcg.sad.models.matricula.Matricula matricula15 = new com.ufcg.sad.models.matricula.Matricula(aluno13, disciplina14);
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = matricula15.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula17 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno18 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina19 = null;
        com.ufcg.sad.models.matricula.Matricula matricula20 = new com.ufcg.sad.models.matricula.Matricula(aluno18, disciplina19);
        com.ufcg.sad.models.disciplina.Disciplina disciplina21 = matricula20.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray22 = new com.ufcg.sad.models.matricula.Matricula[] { matricula15, matricula17, matricula20 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet23 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet23, matriculaArray22);
        com.ufcg.sad.models.aluno.Aluno aluno25 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet23);
        com.ufcg.sad.models.aluno.Aluno aluno29 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina30 = null;
        com.ufcg.sad.models.matricula.Matricula matricula31 = new com.ufcg.sad.models.matricula.Matricula(aluno29, disciplina30);
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = matricula31.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula33 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno34 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina35 = null;
        com.ufcg.sad.models.matricula.Matricula matricula36 = new com.ufcg.sad.models.matricula.Matricula(aluno34, disciplina35);
        com.ufcg.sad.models.disciplina.Disciplina disciplina37 = matricula36.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray38 = new com.ufcg.sad.models.matricula.Matricula[] { matricula31, matricula33, matricula36 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet39 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39, matriculaArray38);
        com.ufcg.sad.models.aluno.Aluno aluno41 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39);
        aluno25.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet39);
        disciplina9.adicionarAluno(aluno25);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet44 = disciplina9.getMatriculas();
        java.lang.Long long45 = disciplina9.getProfessorId();
        disciplina9.setNome("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        aluno2.adicionarDisciplina(disciplina9);
        java.lang.String str49 = disciplina9.getCodigo();
        com.ufcg.sad.models.questionario.Questionario questionario50 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray51 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList52 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList52, questaoArray51);
        questionario50.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList52);
        questionario50.setId((java.lang.Long) 10L);
        java.util.Date date57 = questionario50.getDataUltimaEdicao();
        java.util.Date date58 = questionario50.getDataCriacao();
        boolean boolean59 = disciplina9.equals((java.lang.Object) questionario50);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity60 = disciplinaController0.cadastrarDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(matricula8);
        org.junit.Assert.assertNotNull(disciplina9);
        org.junit.Assert.assertNull(disciplina16);
        org.junit.Assert.assertNull(disciplina21);
        org.junit.Assert.assertNotNull(matriculaArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(disciplina32);
        org.junit.Assert.assertNull(disciplina37);
        org.junit.Assert.assertNotNull(matriculaArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(matriculaSet44);
        org.junit.Assert.assertNull(long45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(questaoArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(date57);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta0 = new com.ufcg.sad.models.resposta.RespostaAberta();
        java.lang.String str1 = respostaAberta0.getComentario();
        respostaAberta0.setIdQuestao((java.lang.Long) 0L);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet12 = professor11.getDisciplinas();
        com.ufcg.sad.models.professor.Professor professor13 = new com.ufcg.sad.models.professor.Professor("863eb965-40bb-4f07-88b4-8c62ef17adaa", "", disciplinaSet12);
        boolean boolean14 = respostaAberta0.equals((java.lang.Object) professor13);
        respostaAberta0.setComentario("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(disciplinaSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray3 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet4 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4, disciplinaArray3);
        com.ufcg.sad.models.professor.Professor professor6 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4);
        professor6.setNome("");
        professor6.setNome("");
        java.lang.String str11 = professor6.getSiape();
        java.lang.Long long12 = professor6.getId();
        professor6.setNome("2017.2");
        java.util.Date date15 = null;
        com.ufcg.sad.models.professor.Professor professor18 = null;
        java.util.Date date19 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray21 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList22 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList22, opcaoArray21);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao24 = null;
        com.ufcg.sad.models.questao.Questao questao25 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor18, date19, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList22, tipoQuestao24);
        questao25.setComentario("");
        java.lang.Long long28 = questao25.getId();
        com.ufcg.sad.models.professor.Professor professor29 = questao25.getAutor();
        java.lang.String str30 = questao25.getEnunciado();
        java.util.Date date31 = null;
        questao25.setDataUltimaEdicao(date31);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao33 = com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES;
        questao25.setTipoQuestao(tipoQuestao33);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList35 = questao25.getOpcoes();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao36 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        com.ufcg.sad.models.questao.Questao questao37 = com.ufcg.sad.models.util.Utils.createQuestaoTest("111b4856-4fdf-442c-b462-ed7ac75fcbb9", professor6, date15, "2017.2", opcaoList35, tipoQuestao36);
        java.lang.Object obj38 = null;
        boolean boolean39 = professor6.equals(obj38);
        org.junit.Assert.assertNotNull(disciplinaArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(opcaoArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(questao25);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(professor29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + tipoQuestao33 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES + "'", tipoQuestao33.equals(com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES));
        org.junit.Assert.assertNotNull(opcaoList35);
        org.junit.Assert.assertTrue("'" + tipoQuestao36 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao36.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertNotNull(questao37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        questionario0.setDescricao("hi!");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray10 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet11, disciplinaArray10);
        com.ufcg.sad.models.professor.Professor professor13 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet11);
        professor13.setNome("");
        professor13.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina disciplina19 = new com.ufcg.sad.models.disciplina.Disciplina("");
        professor13.addDisciplina(disciplina19);
        questionario0.setAutor(professor13);
        com.ufcg.sad.models.professor.Professor professor22 = questionario0.getAutor();
        java.lang.String str23 = questionario0.getNome();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(questaoList5);
        org.junit.Assert.assertNotNull(disciplinaArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(professor22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha0 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.Long long1 = respostaMultiplaEscolha0.getId();
        com.ufcg.sad.models.questionario.Questionario questionario2 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray3 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList4 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList4, questaoArray3);
        questionario2.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList4);
        boolean boolean7 = respostaMultiplaEscolha0.equals((java.lang.Object) questaoList4);
        respostaMultiplaEscolha0.setId((java.lang.Long) 1L);
        com.ufcg.sad.models.opcao.Opcao opcao10 = respostaMultiplaEscolha0.getOpcaoEscolhida();
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta11 = new com.ufcg.sad.models.resposta.RespostaAberta();
        java.lang.String str12 = respostaAberta11.getComentario();
        boolean boolean13 = respostaMultiplaEscolha0.equals((java.lang.Object) str12);
        com.ufcg.sad.models.usuario.Usuario usuario14 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str15 = usuario14.getEmail();
        java.lang.Long long16 = usuario14.getId();
        java.lang.Long long17 = usuario14.getId();
        boolean boolean18 = respostaMultiplaEscolha0.equals((java.lang.Object) usuario14);
        usuario14.setSobrenome("com.ufcg.sad.exceptions.EntidadeNotFoundException");
        usuario14.setNome("");
        usuario14.setSobrenome("70ea7515-9f10-40a2-b76d-742150a7b6d0");
        usuario14.setSobrenome("com.ufcg.sad.exceptions.EntidadeNotFoundException");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(questaoArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(opcao10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray2 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet3 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3, disciplinaArray2);
        com.ufcg.sad.models.professor.Professor professor5 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3);
        professor5.setNome("");
        professor5.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray12 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet13 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet13, disciplinaArray12);
        com.ufcg.sad.models.professor.Professor professor15 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet13);
        professor15.setNome("");
        professor15.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray22 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet23 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23, disciplinaArray22);
        com.ufcg.sad.models.professor.Professor professor25 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23);
        professor15.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23);
        professor5.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray30 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet31 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31, disciplinaArray30);
        com.ufcg.sad.models.professor.Professor professor33 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        professor33.setNome("");
        professor33.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina disciplina39 = new com.ufcg.sad.models.disciplina.Disciplina("");
        professor33.addDisciplina(disciplina39);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet41 = professor33.getDisciplinas();
        professor5.setDisciplinas(disciplinaSet41);
        java.lang.String str43 = professor5.getNome();
        org.junit.Assert.assertNotNull(disciplinaArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(disciplinaArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(disciplinaArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(disciplinaArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(disciplinaSet41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.ufcg.sad.models.aluno.Aluno aluno1 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str2 = aluno1.getSobrenome();
        com.ufcg.sad.models.disciplina.Disciplina disciplina3 = null;
        com.ufcg.sad.models.matricula.Matricula matricula4 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 100L, aluno1, disciplina3);
        com.ufcg.sad.models.matricula.Matricula matricula7 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = matricula7.getDisciplina();
        com.ufcg.sad.models.aluno.Aluno aluno12 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = null;
        com.ufcg.sad.models.matricula.Matricula matricula14 = new com.ufcg.sad.models.matricula.Matricula(aluno12, disciplina13);
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = matricula14.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula16 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = null;
        com.ufcg.sad.models.matricula.Matricula matricula19 = new com.ufcg.sad.models.matricula.Matricula(aluno17, disciplina18);
        com.ufcg.sad.models.disciplina.Disciplina disciplina20 = matricula19.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray21 = new com.ufcg.sad.models.matricula.Matricula[] { matricula14, matricula16, matricula19 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22, matriculaArray21);
        com.ufcg.sad.models.aluno.Aluno aluno24 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22);
        com.ufcg.sad.models.aluno.Aluno aluno28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = null;
        com.ufcg.sad.models.matricula.Matricula matricula30 = new com.ufcg.sad.models.matricula.Matricula(aluno28, disciplina29);
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = matricula30.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula32 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno33 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina34 = null;
        com.ufcg.sad.models.matricula.Matricula matricula35 = new com.ufcg.sad.models.matricula.Matricula(aluno33, disciplina34);
        com.ufcg.sad.models.disciplina.Disciplina disciplina36 = matricula35.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray37 = new com.ufcg.sad.models.matricula.Matricula[] { matricula30, matricula32, matricula35 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet38 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet38, matriculaArray37);
        com.ufcg.sad.models.aluno.Aluno aluno40 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet38);
        aluno24.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet38);
        disciplina8.adicionarAluno(aluno24);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet43 = disciplina8.getMatriculas();
        java.lang.Long long44 = disciplina8.getProfessorId();
        disciplina8.setNome("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        aluno1.adicionarDisciplina(disciplina8);
        com.ufcg.sad.models.disciplina.Disciplina disciplina48 = new com.ufcg.sad.models.disciplina.Disciplina();
        disciplina48.setProfessorId((java.lang.Long) 10L);
        com.ufcg.sad.models.matricula.Matricula matricula51 = new com.ufcg.sad.models.matricula.Matricula(aluno1, disciplina48);
        java.lang.Long long52 = aluno1.getId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(matricula7);
        org.junit.Assert.assertNotNull(disciplina8);
        org.junit.Assert.assertNull(disciplina15);
        org.junit.Assert.assertNull(disciplina20);
        org.junit.Assert.assertNotNull(matriculaArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(disciplina31);
        org.junit.Assert.assertNull(disciplina36);
        org.junit.Assert.assertNotNull(matriculaArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(matriculaSet43);
        org.junit.Assert.assertNull(long44);
        org.junit.Assert.assertNull(long52);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado4 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado0, "", (java.lang.Integer) 1, "");
        java.lang.Long long5 = questionarioAplicado4.getId();
        questionarioAplicado4.setSemestre("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        questionarioAplicado4.setId((java.lang.Long) 0L);
        java.util.Date date11 = null;
        java.util.Date date15 = null;
        com.ufcg.sad.models.opcao.Opcao opcao18 = new com.ufcg.sad.models.opcao.Opcao();
        java.lang.String str19 = opcao18.getNome();
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha21 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 0L, date15, (java.lang.Long) 1L, (java.lang.Long) 1L, opcao18, "2017.2");
        java.lang.Long long22 = opcao18.getId();
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha24 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 0L, date11, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao18, "2017.2");
        boolean boolean25 = questionarioAplicado4.equals((java.lang.Object) (-1L));
        questionarioAplicado4.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray2 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet3 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3, disciplinaArray2);
        com.ufcg.sad.models.professor.Professor professor5 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3);
        professor5.setNome("");
        professor5.setNome("");
        java.lang.String str10 = professor5.getSiape();
        java.lang.Long long11 = professor5.getId();
        com.ufcg.sad.models.matricula.Matricula matricula14 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = matricula14.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = disciplina15.getMatriculas();
        professor5.addDisciplina(disciplina15);
        java.lang.String str18 = disciplina15.getNome();
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException19 = new com.ufcg.sad.exceptions.ParametroInvalidoException();
        boolean boolean20 = disciplina15.equals((java.lang.Object) parametroInvalidoException19);
        java.lang.String str21 = disciplina15.getCodigo();
        java.lang.Long long22 = disciplina15.getId();
        org.junit.Assert.assertNotNull(disciplinaArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(matricula14);
        org.junit.Assert.assertNotNull(disciplina15);
        org.junit.Assert.assertNotNull(matriculaSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(long22);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) (-1L), (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.ufcg.sad.controllers.RespostaController respostaController0 = new com.ufcg.sad.controllers.RespostaController();
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = respostaController0.getResposta((java.lang.Long) 0L);
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.resposta.Resposta>> respostaListResponseEntity5 = respostaController0.getTodasAsRespostas("863eb965-40bb-4f07-88b4-8c62ef17adaa", (java.lang.Long) 10L);
        java.util.Date date7 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta11 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) (-1L), date7, (java.lang.Long) 10L, (java.lang.Long) 0L, "");
        respostaAberta11.setComentario("");
        java.lang.String str14 = respostaAberta11.getComentario();
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 = respostaController0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaAberta11);
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 = respostaController0.getResposta((java.lang.Long) 0L);
        org.junit.Assert.assertNull(objResponseEntity2);
        org.junit.Assert.assertNull(respostaListResponseEntity5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(objResponseEntity15);
        org.junit.Assert.assertNull(objResponseEntity17);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.ufcg.sad.models.aluno.Aluno aluno1 = new com.ufcg.sad.models.aluno.Aluno();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray4 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet5, disciplinaArray4);
        com.ufcg.sad.models.professor.Professor professor7 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet5);
        professor7.setNome("");
        com.ufcg.sad.models.matricula.Matricula matricula12 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = matricula12.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = disciplina13.getMatriculas();
        professor7.addDisciplina(disciplina13);
        com.ufcg.sad.models.matricula.Matricula matricula16 = new com.ufcg.sad.models.matricula.Matricula((java.lang.Long) 1L, aluno1, disciplina13);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = aluno1.getMatriculas();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet18 = aluno1.getMatriculas();
        org.junit.Assert.assertNotNull(disciplinaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(matricula12);
        org.junit.Assert.assertNotNull(disciplina13);
        org.junit.Assert.assertNotNull(matriculaSet14);
        org.junit.Assert.assertNotNull(matriculaSet17);
        org.junit.Assert.assertNotNull(matriculaSet18);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina3 = matricula2.getDisciplina();
        disciplina3.setId((java.lang.Long) 10L);
        java.lang.String str6 = disciplina3.getSemestre();
        disciplina3.setProfessorId((java.lang.Long) 10L);
        com.ufcg.sad.models.aluno.Aluno aluno15 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = null;
        com.ufcg.sad.models.matricula.Matricula matricula17 = new com.ufcg.sad.models.matricula.Matricula(aluno15, disciplina16);
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = matricula17.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula matricula19 = new com.ufcg.sad.models.matricula.Matricula();
        com.ufcg.sad.models.aluno.Aluno aluno20 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina21 = null;
        com.ufcg.sad.models.matricula.Matricula matricula22 = new com.ufcg.sad.models.matricula.Matricula(aluno20, disciplina21);
        com.ufcg.sad.models.disciplina.Disciplina disciplina23 = matricula22.getDisciplina();
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray24 = new com.ufcg.sad.models.matricula.Matricula[] { matricula17, matricula19, matricula22 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet25 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet25, matriculaArray24);
        com.ufcg.sad.models.aluno.Aluno aluno27 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet25);
        com.ufcg.sad.models.aluno.Aluno aluno28 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "hi!", "111b4856-4fdf-442c-b462-ed7ac75fcbb9", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet25);
        aluno28.setNome("com.ufcg.sad.exceptions.EntidadeNotFoundException: cde6b885-0069-445b-83e0-a544d75171b9");
        disciplina3.adicionarAluno(aluno28);
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(disciplina3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2017.2" + "'", str6, "2017.2");
        org.junit.Assert.assertNull(disciplina18);
        org.junit.Assert.assertNull(disciplina23);
        org.junit.Assert.assertNotNull(matriculaArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray2 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet3 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3, disciplinaArray2);
        com.ufcg.sad.models.professor.Professor professor5 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3);
        professor5.setNome("");
        professor5.setNome("");
        java.lang.String str10 = professor5.getSiape();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet11 = professor5.getDisciplinas();
        org.junit.Assert.assertNotNull(disciplinaArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(disciplinaSet11);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException1 = new com.ufcg.sad.exceptions.EntidadeInvalidaException("cde6b885-0069-445b-83e0-a544d75171b9");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException3 = new com.ufcg.sad.exceptions.ParametroInvalidoException("hi!");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException5 = new com.ufcg.sad.exceptions.ParametroInvalidoException("hi!");
        java.lang.Throwable[] throwableArray6 = parametroInvalidoException5.getSuppressed();
        parametroInvalidoException3.addSuppressed((java.lang.Throwable) parametroInvalidoException5);
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException9 = new com.ufcg.sad.exceptions.ParametroInvalidoException("hi!");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException11 = new com.ufcg.sad.exceptions.ParametroInvalidoException("hi!");
        java.lang.Throwable[] throwableArray12 = parametroInvalidoException11.getSuppressed();
        parametroInvalidoException9.addSuppressed((java.lang.Throwable) parametroInvalidoException11);
        parametroInvalidoException3.addSuppressed((java.lang.Throwable) parametroInvalidoException9);
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException16 = new com.ufcg.sad.exceptions.ParametroInvalidoException("hi!");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException18 = new com.ufcg.sad.exceptions.ParametroInvalidoException("hi!");
        java.lang.Throwable[] throwableArray19 = parametroInvalidoException18.getSuppressed();
        parametroInvalidoException16.addSuppressed((java.lang.Throwable) parametroInvalidoException18);
        parametroInvalidoException3.addSuppressed((java.lang.Throwable) parametroInvalidoException18);
        entidadeInvalidaException1.addSuppressed((java.lang.Throwable) parametroInvalidoException3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado4 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado0, "", (java.lang.Integer) 1, "");
        java.lang.Long long5 = questionarioAplicado4.getId();
        questionarioAplicado4.setSemestre("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        questionarioAplicado4.setId((java.lang.Long) 0L);
        questionarioAplicado4.setIdProfessor((java.lang.Long) 1L);
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta12 = new com.ufcg.sad.models.resposta.RespostaAberta();
        java.lang.String str13 = respostaAberta12.getComentario();
        respostaAberta12.setIdQuestao((java.lang.Long) 0L);
        questionarioAplicado4.addResposta((com.ufcg.sad.models.resposta.Resposta) respostaAberta12);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setId((java.lang.Long) 0L);
        usuario0.setSenha("hi!");
        usuario0.setEmail("");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray1 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList2 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList2, questaoArray1);
        questionario0.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList2);
        java.lang.Long long5 = questionario0.getId();
        questionario0.setNome("");
        java.util.Date date8 = null;
        questionario0.setDataUltimaEdicao(date8);
        questionario0.setId((java.lang.Long) 0L);
        questionario0.setId((java.lang.Long) 1L);
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList14 = questionario0.getQuestoes();
        org.junit.Assert.assertNotNull(questaoArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNotNull(questaoList14);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.ufcg.sad.models.opcao.Opcao opcao0 = new com.ufcg.sad.models.opcao.Opcao();
        java.lang.String str1 = opcao0.getNome();
        com.ufcg.sad.models.questionario.Questionario questionario2 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str3 = questionario2.getDescricao();
        java.util.Date date4 = questionario2.getDataCriacao();
        java.lang.String str5 = questionario2.getDescricao();
        java.lang.Long long6 = questionario2.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList7 = questionario2.getQuestoes();
        java.lang.Long long8 = questionario2.getId();
        java.lang.Long long9 = questionario2.getId();
        boolean boolean10 = opcao0.equals((java.lang.Object) long9);
        java.lang.Long long11 = opcao0.getId();
        java.lang.String str12 = opcao0.getDescricao();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(questaoList7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setSenha("hi!");
        java.lang.Long long3 = usuario0.getId();
        usuario0.setSobrenome("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        usuario0.setNome("");
        java.lang.String str8 = usuario0.getSobrenome();
        java.lang.String str9 = usuario0.getEmail();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "863eb965-40bb-4f07-88b4-8c62ef17adaa" + "'", str8, "863eb965-40bb-4f07-88b4-8c62ef17adaa");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.ufcg.sad.models.professor.Professor professor1 = null;
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao7 = null;
        com.ufcg.sad.models.questao.Questao questao8 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor1, date2, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, tipoQuestao7);
        questao8.setComentario("");
        java.lang.Long long11 = questao8.getId();
        com.ufcg.sad.models.professor.Professor professor12 = questao8.getAutor();
        java.lang.String str13 = questao8.getEnunciado();
        java.util.Date date14 = null;
        questao8.setDataUltimaEdicao(date14);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        com.ufcg.sad.models.professor.Professor professor21 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor21.setNome("");
        professor21.setNome("");
        professor21.setNome("");
        questao8.setAutor(professor21);
        java.util.Date date30 = null;
        com.ufcg.sad.models.professor.Professor professor34 = null;
        java.util.Date date35 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray37 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList38 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList38, opcaoArray37);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao40 = null;
        com.ufcg.sad.models.questao.Questao questao41 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor34, date35, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList38, tipoQuestao40);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao42 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) (-1L), date30, (java.lang.Long) 0L, (java.lang.Long) 10L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList38);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList43 = respostaSelecao42.getOpcoesSelecionadas();
        questao8.setOpcoes(opcaoList43);
        java.util.Date date45 = null;
        questao8.setDataUltimaEdicao(date45);
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(questao8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(professor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(opcaoArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(questao41);
        org.junit.Assert.assertNotNull(opcaoList43);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException1 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("com.ufcg.sad.exceptions.EntidadeNotFoundException");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray2 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet3 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3, disciplinaArray2);
        com.ufcg.sad.models.professor.Professor professor5 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet3);
        professor5.setNome("");
        com.ufcg.sad.models.matricula.Matricula matricula10 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = matricula10.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet12 = disciplina11.getMatriculas();
        professor5.addDisciplina(disciplina11);
        disciplina11.setTurma((java.lang.Integer) 0);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = disciplina11.getMatriculas();
        java.lang.Long long17 = disciplina11.getProfessorId();
        org.junit.Assert.assertNotNull(disciplinaArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matricula10);
        org.junit.Assert.assertNotNull(disciplina11);
        org.junit.Assert.assertNotNull(matriculaSet12);
        org.junit.Assert.assertNotNull(matriculaSet16);
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.ufcg.sad.models.professor.Professor professor1 = null;
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao7 = null;
        com.ufcg.sad.models.questao.Questao questao8 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor1, date2, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, tipoQuestao7);
        questao8.setComentario("");
        java.lang.Long long11 = questao8.getId();
        com.ufcg.sad.models.professor.Professor professor12 = questao8.getAutor();
        java.lang.String str13 = questao8.getEnunciado();
        java.util.Date date14 = null;
        questao8.setDataUltimaEdicao(date14);
        com.ufcg.sad.models.professor.Professor professor17 = null;
        java.util.Date date18 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray20 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList21 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList21, opcaoArray20);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao23 = null;
        com.ufcg.sad.models.questao.Questao questao24 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor17, date18, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList21, tipoQuestao23);
        questao24.setComentario("");
        java.lang.String str27 = questao24.getEnunciado();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray31 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet32 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32, disciplinaArray31);
        com.ufcg.sad.models.professor.Professor professor34 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet35 = professor34.getDisciplinas();
        java.util.Date date36 = null;
        com.ufcg.sad.models.professor.Professor professor39 = null;
        java.util.Date date40 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray42 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList43 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList43, opcaoArray42);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao45 = null;
        com.ufcg.sad.models.questao.Questao questao46 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor39, date40, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList43, tipoQuestao45);
        questao46.setComentario("");
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList49 = questao46.getOpcoes();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao50 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        com.ufcg.sad.models.questao.Questao questao51 = com.ufcg.sad.models.util.Utils.createQuestaoTest("111b4856-4fdf-442c-b462-ed7ac75fcbb9", professor34, date36, "hi!", opcaoList49, tipoQuestao50);
        questao24.setOpcoes(opcaoList49);
        questao24.setComentario("");
        java.util.Date date55 = questao24.getDataCriacao();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray59 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet60 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet60, disciplinaArray59);
        com.ufcg.sad.models.professor.Professor professor62 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet60);
        professor62.setNome("");
        com.ufcg.sad.models.matricula.Matricula matricula67 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina68 = matricula67.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet69 = disciplina68.getMatriculas();
        professor62.addDisciplina(disciplina68);
        java.util.Date date71 = null;
        java.util.Date date74 = null;
        com.ufcg.sad.models.professor.Professor professor78 = null;
        java.util.Date date79 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray81 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList82 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList82, opcaoArray81);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao84 = null;
        com.ufcg.sad.models.questao.Questao questao85 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor78, date79, "", (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList82, tipoQuestao84);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao86 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) (-1L), date74, (java.lang.Long) 0L, (java.lang.Long) 10L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList82);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList87 = respostaSelecao86.getOpcoesSelecionadas();
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList88 = respostaSelecao86.getOpcoesSelecionadas();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao89 = com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA;
        com.ufcg.sad.models.questao.Questao questao90 = com.ufcg.sad.models.util.Utils.createQuestaoTest("hi!", professor62, date71, "863eb965-40bb-4f07-88b4-8c62ef17adaa", opcaoList88, tipoQuestao89);
        questao24.setTipoQuestao(tipoQuestao89);
        questao8.setTipoQuestao(tipoQuestao89);
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(questao8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(professor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(opcaoArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(questao24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(disciplinaArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(disciplinaSet35);
        org.junit.Assert.assertNotNull(opcaoArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(questao46);
        org.junit.Assert.assertNotNull(opcaoList49);
        org.junit.Assert.assertTrue("'" + tipoQuestao50 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao50.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertNotNull(questao51);
        org.junit.Assert.assertNull(date55);
        org.junit.Assert.assertNotNull(disciplinaArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(matricula67);
        org.junit.Assert.assertNotNull(disciplina68);
        org.junit.Assert.assertNotNull(matriculaSet69);
        org.junit.Assert.assertNotNull(opcaoArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(questao85);
        org.junit.Assert.assertNotNull(opcaoList87);
        org.junit.Assert.assertNotNull(opcaoList88);
        org.junit.Assert.assertTrue("'" + tipoQuestao89 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA + "'", tipoQuestao89.equals(com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA));
        org.junit.Assert.assertNotNull(questao90);
    }
}

