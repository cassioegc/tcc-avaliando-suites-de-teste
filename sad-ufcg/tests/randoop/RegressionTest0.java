import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = com.ufcg.sad.models.questao.Questao.MIN_ESCOLHA_SIMPLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.professor.Professor professor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.atualizarProfessor(professor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = com.ufcg.sad.models.questao.Questao.MAX_ESCOLHA_SIMPLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.aluno.Aluno aluno2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.aluno.Aluno aluno3 = disciplinaServiceImpl0.vincularAluno((java.lang.Long) (-1L), aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ufcg.sad.controllers.ControllerParaTestes controllerParaTestes0 = new com.ufcg.sad.controllers.ControllerParaTestes();
        java.lang.Class<?> wildcardClass1 = controllerParaTestes0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = com.ufcg.sad.models.util.Utils.TAMANHO_MAX_STRING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 255 + "'", int0 == 255);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 = professorController0.atualizarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        com.ufcg.sad.models.resposta.Resposta resposta13 = null;
        questionarioAplicado11.addResposta(resposta13);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(respostaArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tokenArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        questionarioAplicado10.setDisciplina("hi!");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        questionarioAplicado10.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.resposta.Resposta resposta12 = null;
        questionarioAplicado10.addResposta(resposta12);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray18 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet19, respostaArray18);
        com.ufcg.sad.models.token.Token[] tokenArray21 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet22 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet22, tokenArray21);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado24 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet19, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet22);
        questionarioAplicado10.setRespostas((java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet19);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(respostaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tokenArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = new com.ufcg.sad.models.disciplina.Disciplina("");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina3 = disciplinaServiceImpl0.cadastrarDisciplina(disciplina2);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Turma inva?lida: null");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        com.ufcg.sad.controllers.ProfessorController professorController37 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean38 = professor11.equals((java.lang.Object) professorController37);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.professor.Professor>> professorListResponseEntity39 = professorController37.getTodosOsProfessores();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet5 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina6 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet5);
        // The following exception was thrown during execution in test generation
        try {
            disciplinaServiceImpl0.removerDisciplina(disciplina6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula7 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet12 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet12);
        matricula7.setDisciplina(disciplina13);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray15 = new com.ufcg.sad.models.matricula.Matricula[] { matricula7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet16, matriculaArray15);
        com.ufcg.sad.models.aluno.Aluno aluno18 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet16);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.aluno.Aluno aluno19 = disciplinaServiceImpl0.vincularAluno((java.lang.Long) 10L, aluno18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula7);
        org.junit.Assert.assertNotNull(matriculaArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) 0L, (java.lang.Long) 0L, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        disciplina8.setId((java.lang.Long) 0L);
        disciplina8.setProfessorId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass14 = disciplina8.getClass();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        java.lang.String str3 = token2.getId();
        token2.setId("hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2" + "'", str3, "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        // The following exception was thrown during execution in test generation
        try {
            professorServiceImpl0.removerProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao0 = new com.ufcg.sad.models.resposta.RespostaSelecao();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 10L, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Long) 100L, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 = professorController0.atualizarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Integer) 100, "4886a34f-e994-44db-804e-76af3c234424");
        respostaEscolhaSimples6.setComentario("hi!");
        respostaEscolhaSimples6.setIdQuestionarioAplicado((java.lang.Long) 0L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException1 = new com.ufcg.sad.exceptions.ParametroInvalidoException("hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        disciplina8.setId((java.lang.Long) 0L);
        disciplina8.setSemestre("");
        com.ufcg.sad.models.matricula.Matricula matricula19 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet24 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina25 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet24);
        matricula19.setDisciplina(disciplina25);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray27 = new com.ufcg.sad.models.matricula.Matricula[] { matricula19 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet28, matriculaArray27);
        com.ufcg.sad.models.aluno.Aluno aluno30 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet28);
        // The following exception was thrown during execution in test generation
        try {
            disciplina8.adicionarAluno(aluno30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula19);
        org.junit.Assert.assertNotNull(matriculaArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        disciplina9.setTurma((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            disciplinaServiceImpl0.removerDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray17 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet18 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet18, respostaArray17);
        com.ufcg.sad.models.token.Token[] tokenArray20 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet21 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet21, tokenArray20);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado23 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet18, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet21);
        com.ufcg.sad.models.resposta.Resposta resposta24 = null;
        questionarioAplicado23.addResposta(resposta24);
        boolean boolean26 = questionarioAplicado11.equals((java.lang.Object) resposta24);
        java.lang.String str27 = questionarioAplicado11.getSemestre();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(respostaArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tokenArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(respostaArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tokenArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray14 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15, matriculaArray14);
        com.ufcg.sad.models.aluno.Aluno aluno17 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.aluno.Aluno aluno18 = alunoServiceImpl0.criarAluno(aluno17);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Aluno apresenta dados inva?lidos");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matriculaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ufcg.sad.models.util.Utils utils0 = new com.ufcg.sad.models.util.Utils();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.criaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = null;
        // The following exception was thrown during execution in test generation
        try {
            questaoServiceImpl0.validaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.criaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina11 = disciplinaServiceImpl0.cadastrarDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado15 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado10, "", (java.lang.Integer) 255, "");
        java.lang.String str16 = questionarioAplicado15.getSemestre();
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ufcg.sad.models.token.Token token0 = new com.ufcg.sad.models.token.Token();
        java.lang.Object obj1 = null;
        boolean boolean2 = token0.equals(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long25 = professor12.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet26 = professor12.getDisciplinas();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor27 = professorServiceImpl0.atualizarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNotNull(disciplinaSet26);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        disciplina8.setId((java.lang.Long) 0L);
        com.ufcg.sad.models.matricula.Matricula matricula17 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula20 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet25 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina26 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet25);
        matricula20.setDisciplina(disciplina26);
        disciplina26.setId((java.lang.Long) 0L);
        matricula17.setDisciplina(disciplina26);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray31 = new com.ufcg.sad.models.matricula.Matricula[] { matricula17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet32 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet32, matriculaArray31);
        com.ufcg.sad.models.aluno.Aluno aluno34 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet32);
        // The following exception was thrown during execution in test generation
        try {
            disciplina8.adicionarAluno(aluno34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula17);
        org.junit.Assert.assertNotNull(matricula20);
        org.junit.Assert.assertNotNull(matriculaArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ufcg.sad.models.token.Token token1 = new com.ufcg.sad.models.token.Token((java.lang.Long) (-1L));
        java.lang.String str2 = token1.getId();
        token1.setId("hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2" + "'", str2, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        com.ufcg.sad.models.professor.Professor professor36 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        com.ufcg.sad.controllers.ProfessorController professorController38 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean39 = professor12.equals((java.lang.Object) professorController38);
        com.ufcg.sad.models.matricula.Matricula matricula42 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        boolean boolean43 = professor12.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor44 = professorServiceImpl0.criarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(matricula42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        disciplina9.setTurma((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina13 = disciplinaServiceImpl0.atualizarDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        disciplina9.setId((java.lang.Long) 0L);
        disciplina9.setSemestre("");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina15 = disciplinaServiceImpl0.cadastrarDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Id deve ser nulo para a criac?a?o de Disciplina.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = null;
        // The following exception was thrown during execution in test generation
        try {
            questaoServiceImpl0.validaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token3.setId("");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet12 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet12);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray14 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina13 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet15, disciplinaArray14);
        com.ufcg.sad.models.professor.Professor professor17 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet15);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina23 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet22);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray24 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina23 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet25 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25, disciplinaArray24);
        professor17.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25);
        professor17.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet36 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina37 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet36);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray38 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina37 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet39 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet39, disciplinaArray38);
        com.ufcg.sad.models.professor.Professor professor41 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet39);
        professor17.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet39);
        boolean boolean43 = token3.equals((java.lang.Object) professor17);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor44 = professorServiceImpl0.atualizarProfessor(professor17);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(disciplinaArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(disciplinaArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long25 = professor12.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet26 = professor12.getDisciplinas();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity27 = professorController0.atualizarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNotNull(disciplinaSet26);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        usuario0.setSenha("");
        usuario0.setId((java.lang.Long) 1L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 0L);
        java.lang.String str3 = token2.getId();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "562dc7a4-935c-4ec1-a22d-2af9d83af33a" + "'", str3, "562dc7a4-935c-4ec1-a22d-2af9d83af33a");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        disciplina8.setId((java.lang.Long) 0L);
        disciplina8.setSemestre("");
        disciplina8.setId((java.lang.Long) (-1L));
        java.lang.String str16 = disciplina8.getNome();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        com.ufcg.sad.controllers.ProfessorController professorController37 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean38 = professor11.equals((java.lang.Object) professorController37);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity40 = professorController37.procurarProfessorPeloSiape("4886a34f-e994-44db-804e-76af3c234424");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Integer) 100, "4886a34f-e994-44db-804e-76af3c234424");
        respostaEscolhaSimples6.setComentario("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        java.util.Date date9 = null;
        respostaEscolhaSimples6.setDataResposta(date9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet4 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina5 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet4);
        java.lang.Long long6 = disciplina5.getId();
        disciplina5.setCodigo("");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        com.ufcg.sad.controllers.ProfessorController professorController37 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean38 = professor11.equals((java.lang.Object) professorController37);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity40 = professorController37.procurarProfessorPeloSiape("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        com.ufcg.sad.models.resposta.Resposta resposta12 = null;
        questionarioAplicado11.addResposta(resposta12);
        java.lang.String str14 = questionarioAplicado11.getSemestre();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(respostaArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tokenArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException1 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        disciplina9.setId((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            disciplinaServiceImpl0.validaDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado0 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        java.lang.Long long1 = questionarioAplicado0.getId();
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta5 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 100L, date1, (java.lang.Long) 0L, (java.lang.Long) 0L, "4886a34f-e994-44db-804e-76af3c234424");
        java.util.Date date6 = respostaAberta5.getDataResposta();
        java.lang.String str7 = respostaAberta5.getComentario();
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl8 = new com.ufcg.sad.services.MatriculaServiceImpl();
        boolean boolean9 = respostaAberta5.equals((java.lang.Object) matriculaServiceImpl8);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str7, "4886a34f-e994-44db-804e-76af3c234424");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        com.ufcg.sad.models.resposta.Resposta resposta11 = null;
        questionarioAplicado10.addResposta(resposta11);
        java.util.Date date14 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta18 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 100L, date14, (java.lang.Long) 0L, (java.lang.Long) 0L, "4886a34f-e994-44db-804e-76af3c234424");
        java.util.Date date19 = respostaAberta18.getDataResposta();
        questionarioAplicado10.addResposta((com.ufcg.sad.models.resposta.Resposta) respostaAberta18);
        respostaAberta18.setComentario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet29 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina30 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet29);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray31 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina30 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet32 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32, disciplinaArray31);
        com.ufcg.sad.models.professor.Professor professor34 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor36 = professorServiceImpl0.criarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: hi!");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao7 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date1, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5);
        java.util.Date date9 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray12 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList13 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList13, opcaoArray12);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao15 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date9, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList13);
        respostaSelecao7.setOpcoesSelecionadas((java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList13);
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(opcaoArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("8d5f6ea8-6ec6-4810-bc12-45045d0b7805", "562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.disciplina.Disciplina disciplina1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.cadastrarDisciplina(disciplina1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        java.util.Date date6 = questionario1.getDataCriacao();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario7 = questionarioServiceImpl0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray14 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15, matriculaArray14);
        com.ufcg.sad.models.aluno.Aluno aluno17 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet24 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina25 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet24);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray26 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina25 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet27 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet27, disciplinaArray26);
        com.ufcg.sad.models.professor.Professor professor29 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet27);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet34 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina35 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet34);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray36 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina35 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet37 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet37, disciplinaArray36);
        professor29.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet37);
        professor29.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        boolean boolean42 = aluno17.equals((java.lang.Object) professor29);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor43 = professorServiceImpl0.atualizarProfessor(professor29);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matriculaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(disciplinaArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(disciplinaArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        com.ufcg.sad.models.matricula.Matricula matricula7 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula10 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet15);
        matricula10.setDisciplina(disciplina16);
        disciplina16.setId((java.lang.Long) 0L);
        matricula7.setDisciplina(disciplina16);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray21 = new com.ufcg.sad.models.matricula.Matricula[] { matricula7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22, matriculaArray21);
        com.ufcg.sad.models.aluno.Aluno aluno24 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 = disciplinaController0.cadastrarAlunoEmDisciplina((java.lang.Long) 1L, aluno24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula7);
        org.junit.Assert.assertNotNull(matricula10);
        org.junit.Assert.assertNotNull(matriculaArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet5 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina6 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet5);
        // The following exception was thrown during execution in test generation
        try {
            disciplinaServiceImpl0.removerDisciplina(disciplina6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        java.lang.String str17 = aluno16.getEmail();
        aluno16.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException0 = new com.ufcg.sad.exceptions.ParametroInvalidoException();
        java.lang.Throwable[] throwableArray1 = parametroInvalidoException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = parametroInvalidoException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        questionario1.setId((java.lang.Long) 10L);
        questionario1.setNome("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario10 = questionarioServiceImpl0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.ParametroInvalidoException; message: Id deve ser nulo para a criac?a?o do questiona?rio.");
        } catch (com.ufcg.sad.exceptions.ParametroInvalidoException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException1 = new com.ufcg.sad.exceptions.EntidadeInvalidaException("");
        java.lang.String str2 = entidadeInvalidaException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.ufcg.sad.exceptions.EntidadeInvalidaException: " + "'", str2, "com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.professor.Professor professor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.criarProfessor(professor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor13 = professorServiceImpl0.criarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: hi!");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet5 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina6 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet5);
        java.lang.Long long7 = disciplina6.getId();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina8 = disciplinaServiceImpl0.atualizarDisciplina(disciplina6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        // The following exception was thrown during execution in test generation
        try {
            disciplinaServiceImpl0.validaDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 = questionarioController0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        java.util.Date date6 = questionario1.getDataCriacao();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario7 = questionarioServiceImpl0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray5 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList6 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList6, opcaoArray5);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao8 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date2, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList6);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.resposta.Resposta resposta9 = respostaServiceImpl0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaSelecao8);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.ParametroInvalidoException; message: Id deve ser nulo para a criac?a?o de resposta.");
        } catch (com.ufcg.sad.exceptions.ParametroInvalidoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(opcaoArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet37 = professor11.getDisciplinas();
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(disciplinaSet37);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token2.setId("");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray13 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina12 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14, disciplinaArray13);
        com.ufcg.sad.models.professor.Professor professor16 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet21 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina22 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet21);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray23 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina22 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet24 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24, disciplinaArray23);
        professor16.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24);
        professor16.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet35 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina36 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet35);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray37 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina36 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet38 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38, disciplinaArray37);
        com.ufcg.sad.models.professor.Professor professor40 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38);
        professor16.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38);
        boolean boolean42 = token2.equals((java.lang.Object) professor16);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet43 = professor16.getDisciplinas();
        org.junit.Assert.assertNotNull(disciplinaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(disciplinaArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(disciplinaArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(disciplinaSet43);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.professor.Professor professor1 = new com.ufcg.sad.models.professor.Professor();
        // The following exception was thrown during execution in test generation
        try {
            professorServiceImpl0.validaProfessor(professor1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: null");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        java.util.Date date4 = questionario1.getDataCriacao();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 = questionarioController0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Integer) 100, "4886a34f-e994-44db-804e-76af3c234424");
        java.util.Date date7 = null;
        respostaEscolhaSimples6.setDataResposta(date7);
        respostaEscolhaSimples6.setIdQuestionarioAplicado((java.lang.Long) 10L);
        java.util.Date date11 = respostaEscolhaSimples6.getDataResposta();
        java.lang.Object obj12 = null;
        boolean boolean13 = respostaEscolhaSimples6.equals(obj12);
        respostaEscolhaSimples6.setEscolhaSimples((int) (byte) 1);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        questionarioAplicado10.setDisciplina("hi!");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.resposta.Resposta resposta12 = null;
        questionarioAplicado10.addResposta(resposta12);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet14 = null;
        questionarioAplicado10.setRespostas(respostaSet14);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina11 = disciplinaServiceImpl0.atualizarDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ufcg.sad.models.opcao.Opcao opcao0 = new com.ufcg.sad.models.opcao.Opcao();
        opcao0.setId((java.lang.Long) 100L);
        opcao0.setDescricao("");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        com.ufcg.sad.controllers.ProfessorController professorController37 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean38 = professor11.equals((java.lang.Object) professorController37);
        com.ufcg.sad.models.matricula.Matricula matricula41 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        boolean boolean42 = professor11.equals((java.lang.Object) "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet49 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina50 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet49);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray51 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina50 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet52 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52, disciplinaArray51);
        com.ufcg.sad.models.professor.Professor professor54 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet59 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina60 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet59);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray61 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina60 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet62 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet62, disciplinaArray61);
        professor54.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet62);
        professor54.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long67 = professor54.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet68 = professor54.getDisciplinas();
        professor11.setDisciplinas(disciplinaSet68);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet76 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina77 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet76);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray78 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina77 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet79 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet79, disciplinaArray78);
        com.ufcg.sad.models.professor.Professor professor81 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet79);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet86 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina87 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet86);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray88 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina87 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet89 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet89, disciplinaArray88);
        professor81.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet89);
        professor81.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long94 = professor81.getId();
        professor81.setId((java.lang.Long) (-1L));
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet97 = professor81.getDisciplinas();
        professor11.setDisciplinas(disciplinaSet97);
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(matricula41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(disciplinaArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(disciplinaArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNotNull(disciplinaSet68);
        org.junit.Assert.assertNotNull(disciplinaArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(disciplinaArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(long94);
        org.junit.Assert.assertNotNull(disciplinaSet97);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        questionario1.setId((java.lang.Long) 10L);
        java.util.Date date8 = questionario1.getDataCriacao();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario9 = questionarioServiceImpl0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.atualizaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ufcg.sad.SadApplication sadApplication0 = new com.ufcg.sad.SadApplication();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet23 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina24 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet23);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray25 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina24 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26, disciplinaArray25);
        com.ufcg.sad.models.professor.Professor professor28 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet33 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina34 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet33);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray35 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina34 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet36 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet36, disciplinaArray35);
        professor28.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet36);
        professor28.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        boolean boolean41 = aluno16.equals((java.lang.Object) professor28);
        professor28.setSiape("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(disciplinaArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(disciplinaArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado15 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado10, "", (java.lang.Integer) 255, "");
        questionarioAplicado15.setId((java.lang.Long) 100L);
        questionarioAplicado15.setSemestre("");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray14 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15, matriculaArray14);
        com.ufcg.sad.models.aluno.Aluno aluno17 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 = alunoController0.atualizarAluno(aluno17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matriculaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        questionario1.setId((java.lang.Long) 10L);
        questionario1.setNome("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario10 = questionarioServiceImpl0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio na?o pode ser vazio.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getEmail();
        java.lang.String str2 = usuario0.getSenha();
        java.lang.String str3 = usuario0.getEmail();
        usuario0.setSobrenome("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples0 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples();
        respostaEscolhaSimples0.setComentario("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            tokenServiceImpl0.validaToken(token2);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Token deve conter: idQuestionarioAplicado e idAluno.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula9 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet14);
        matricula9.setDisciplina(disciplina15);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray17 = new com.ufcg.sad.models.matricula.Matricula[] { matricula9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet18 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18, matriculaArray17);
        com.ufcg.sad.models.aluno.Aluno aluno20 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18);
        com.ufcg.sad.models.aluno.Aluno aluno21 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 0L, "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.aluno.Aluno aluno22 = alunoServiceImpl0.atualizarAluno(aluno21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula9);
        org.junit.Assert.assertNotNull(matriculaArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        java.util.Date date2 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples7 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date2, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Integer) 100, "4886a34f-e994-44db-804e-76af3c234424");
        java.util.Date date8 = null;
        respostaEscolhaSimples7.setDataResposta(date8);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.resposta.Resposta resposta10 = respostaServiceImpl0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaEscolhaSimples7);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.ParametroInvalidoException; message: Id deve ser nulo para a criac?a?o de resposta.");
        } catch (com.ufcg.sad.exceptions.ParametroInvalidoException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        com.ufcg.sad.models.usuario.Usuario usuario10 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str11 = usuario10.getEmail();
        java.lang.String str12 = usuario10.getSenha();
        java.lang.String str13 = usuario10.getEmail();
        boolean boolean14 = matricula2.equals((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha11.setComentario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha11.setIdQuestao((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        com.ufcg.sad.models.professor.Professor professor36 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        com.ufcg.sad.controllers.ProfessorController professorController38 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean39 = professor12.equals((java.lang.Object) professorController38);
        com.ufcg.sad.models.matricula.Matricula matricula42 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        boolean boolean43 = professor12.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity44 = professorController0.criarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(matricula42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet4 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina5 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet4);
        java.lang.Long long6 = disciplina5.getId();
        disciplina5.setNome("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        aluno16.setId((java.lang.Long) 100L);
        aluno16.setSobrenome("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.disciplina.Disciplina disciplina1 = new com.ufcg.sad.models.disciplina.Disciplina();
        // The following exception was thrown during execution in test generation
        try {
            disciplinaServiceImpl0.validaDisciplina(disciplina1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Turma inva?lida: null");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        com.ufcg.sad.controllers.ProfessorController professorController37 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean38 = professor11.equals((java.lang.Object) professorController37);
        com.ufcg.sad.models.professor.Professor professor39 = new com.ufcg.sad.models.professor.Professor();
        professor39.setId((java.lang.Long) 0L);
        java.lang.String str42 = professor39.getNome();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity43 = professorController37.criarProfessor(professor39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ufcg.sad.models.opcao.Opcao opcao3 = new com.ufcg.sad.models.opcao.Opcao((java.lang.Long) 10L, "562dc7a4-935c-4ec1-a22d-2af9d83af33a", "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ufcg.sad.models.token.Token token1 = new com.ufcg.sad.models.token.Token((java.lang.Long) (-1L));
        java.lang.String str2 = token1.getId();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0ff74fdf-f04c-407c-be15-11a0b27a7d88" + "'", str2, "0ff74fdf-f04c-407c-be15-11a0b27a7d88");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ufcg.sad.models.opcao.Opcao opcao0 = new com.ufcg.sad.models.opcao.Opcao();
        opcao0.setNome("");
        java.lang.String str3 = opcao0.getNome();
        java.lang.String str4 = opcao0.getNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        com.ufcg.sad.models.resposta.Resposta resposta11 = null;
        questionarioAplicado10.addResposta(resposta11);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray17 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet18 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet18, respostaArray17);
        com.ufcg.sad.models.token.Token[] tokenArray20 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet21 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet21, tokenArray20);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado23 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet18, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet21);
        questionarioAplicado10.setRespostas((java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet18);
        com.ufcg.sad.models.token.Token token26 = new com.ufcg.sad.models.token.Token((java.lang.Long) (-1L));
        questionarioAplicado10.removeToken(token26);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(respostaArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tokenArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 100L, (java.lang.Long) 1L);
        token2.setIdAluno((java.lang.Long) 100L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ufcg.sad.models.opcao.Opcao opcao0 = new com.ufcg.sad.models.opcao.Opcao();
        java.lang.String str1 = opcao0.getNome();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getSobrenome();
        usuario0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        com.ufcg.sad.models.aluno.Aluno aluno1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.criarAluno(aluno1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Aluno apresenta dados inva?lidos");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long25 = professor12.getId();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor26 = professorServiceImpl0.criarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(long25);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 100L);
        token2.setId("4d494946-e325-4202-b6b7-ef3d0a7413a2");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray16 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet17 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet17, respostaArray16);
        com.ufcg.sad.models.token.Token[] tokenArray19 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet20, tokenArray19);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado22 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet17, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet20);
        com.ufcg.sad.models.resposta.Resposta resposta23 = null;
        questionarioAplicado22.addResposta(resposta23);
        boolean boolean25 = questionarioAplicado10.equals((java.lang.Object) resposta23);
        java.lang.String str26 = questionarioAplicado10.getSemestre();
        java.lang.Integer int27 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado31 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado10, "hi!", (java.lang.Integer) 255, "0ff74fdf-f04c-407c-be15-11a0b27a7d88");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(respostaArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tokenArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(int27);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray16 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet17 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet17, respostaArray16);
        com.ufcg.sad.models.token.Token[] tokenArray19 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet20, tokenArray19);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado22 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet17, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet20);
        com.ufcg.sad.models.resposta.Resposta resposta23 = null;
        questionarioAplicado22.addResposta(resposta23);
        boolean boolean25 = questionarioAplicado10.equals((java.lang.Object) resposta23);
        java.lang.String str26 = questionarioAplicado10.getSemestre();
        java.lang.Integer int27 = questionarioAplicado10.getTurma();
        questionarioAplicado10.setDisciplina("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(respostaArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tokenArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(int27);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        aluno16.setSobrenome("0ff74fdf-f04c-407c-be15-11a0b27a7d88");
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        com.ufcg.sad.models.professor.Professor professor36 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        com.ufcg.sad.controllers.ProfessorController professorController38 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean39 = professor12.equals((java.lang.Object) professorController38);
        com.ufcg.sad.models.matricula.Matricula matricula42 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        boolean boolean43 = professor12.equals((java.lang.Object) "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet50 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina51 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet50);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray52 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina51 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet53 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet53, disciplinaArray52);
        com.ufcg.sad.models.professor.Professor professor55 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet53);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet60 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina61 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet60);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray62 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina61 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet63 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet63, disciplinaArray62);
        professor55.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet63);
        professor55.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long68 = professor55.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet69 = professor55.getDisciplinas();
        professor12.setDisciplinas(disciplinaSet69);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity71 = professorController0.criarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(matricula42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(disciplinaArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(disciplinaArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(long68);
        org.junit.Assert.assertNotNull(disciplinaSet69);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        java.lang.Long long3 = usuario0.getId();
        usuario0.setNome("4886a34f-e994-44db-804e-76af3c234424");
        usuario0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ufcg.sad.models.questionario.Questionario questionario3 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date4 = null;
        questionario3.setDataUltimaEdicao(date4);
        questionario3.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor8 = questionario3.getAutor();
        com.ufcg.sad.models.questao.Questao[] questaoArray12 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList13 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList13, questaoArray12);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet21 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina22 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet21);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray23 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina22 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet24 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24, disciplinaArray23);
        com.ufcg.sad.models.professor.Professor professor26 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        professor26.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet43 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina44 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet43);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray45 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina44 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet46 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet46, disciplinaArray45);
        com.ufcg.sad.models.professor.Professor professor48 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet46);
        professor26.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet46);
        java.util.Date date50 = null;
        java.util.Date date51 = null;
        com.ufcg.sad.models.questionario.Questionario questionario52 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList13, professor26, date50, date51);
        questionario3.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList13);
        com.ufcg.sad.models.professor.Professor professor54 = new com.ufcg.sad.models.professor.Professor();
        java.util.Date date55 = null;
        java.util.Date date56 = null;
        com.ufcg.sad.models.questionario.Questionario questionario57 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) 100L, "562dc7a4-935c-4ec1-a22d-2af9d83af33a", "", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList13, professor54, date55, date56);
        org.junit.Assert.assertNull(professor8);
        org.junit.Assert.assertNotNull(questaoArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(disciplinaArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(disciplinaArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        java.util.Date date2 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples7 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 0L, date2, (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        java.lang.String str8 = respostaEscolhaSimples7.getComentario();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.resposta.Resposta resposta9 = respostaServiceImpl0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaEscolhaSimples7);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.ParametroInvalidoException; message: Id deve ser nulo para a criac?a?o de resposta.");
        } catch (com.ufcg.sad.exceptions.ParametroInvalidoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long25 = professor12.getId();
        professor12.setId((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            professorServiceImpl0.validaProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(long25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        java.lang.Long long3 = usuario0.getId();
        usuario0.setNome("4886a34f-e994-44db-804e-76af3c234424");
        usuario0.setSobrenome("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        java.lang.String str8 = usuario0.getSobrenome();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2" + "'", str8, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        usuario0.setSenha("");
        java.lang.String str5 = usuario0.getSenha();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        boolean boolean17 = matricula2.equals((java.lang.Object) (byte) 0);
        com.ufcg.sad.models.matricula.Matricula matricula20 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.aluno.Aluno aluno21 = matricula20.getAluno();
        matricula2.setAluno(aluno21);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet29 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina30 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet29);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray31 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina30 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet32 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32, disciplinaArray31);
        com.ufcg.sad.models.professor.Professor professor34 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet39 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina40 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet39);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray41 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina40 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet42 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet42, disciplinaArray41);
        professor34.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet42);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet51 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina52 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet51);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray53 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina52 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet54 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet54, disciplinaArray53);
        com.ufcg.sad.models.professor.Professor professor56 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet54);
        professor34.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet54);
        java.lang.String str58 = professor34.getNome();
        java.lang.Long long59 = professor34.getId();
        boolean boolean60 = matricula2.equals((java.lang.Object) professor34);
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(matricula20);
        org.junit.Assert.assertNotNull(aluno21);
        org.junit.Assert.assertNotNull(disciplinaArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(disciplinaArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(disciplinaArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNull(long59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado15 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado10, "", (java.lang.Integer) 255, "");
        questionarioAplicado10.setDisciplina("");
        questionarioAplicado10.setIdProfessor((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet5 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina6 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet5);
        java.lang.Long long7 = disciplina6.getId();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 = disciplinaController0.cadastrarDisciplina(disciplina6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long24 = professor11.getId();
        professor11.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(long24);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Date date1 = null;
        java.util.Date date5 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray8 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList9 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList9, opcaoArray8);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao11 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date5, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList9);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao12 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 10L, date1, (java.lang.Long) 1L, (java.lang.Long) (-1L), (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList9);
        org.junit.Assert.assertNotNull(opcaoArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        disciplina11.setProfessorId((java.lang.Long) 10L);
        java.lang.String str18 = disciplina11.getSemestre();
        disciplina11.setCodigo("506aa218-b85c-412f-a028-e1e7ce66ed2d");
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        matricula2.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula9 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet14);
        matricula9.setDisciplina(disciplina15);
        disciplina15.setId((java.lang.Long) 0L);
        matricula6.setDisciplina(disciplina15);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray20 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet21 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet21, matriculaArray20);
        com.ufcg.sad.models.aluno.Aluno aluno23 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet21);
        aluno23.setSobrenome("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 = alunoController0.criarAluno(aluno23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matricula9);
        org.junit.Assert.assertNotNull(matriculaArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor6 = questionario1.getAutor();
        questionario1.setDescricao("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario9 = questionarioServiceImpl0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(professor6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao7 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date1, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList8 = respostaSelecao7.getOpcoesSelecionadas();
        com.ufcg.sad.models.token.Token token9 = new com.ufcg.sad.models.token.Token();
        java.lang.String str10 = token9.getId();
        boolean boolean11 = respostaSelecao7.equals((java.lang.Object) str10);
        java.util.Date date12 = null;
        respostaSelecao7.setDataResposta(date12);
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(opcaoList8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32684167-a58b-4266-95f2-2d889347db1d" + "'", str10, "32684167-a58b-4266-95f2-2d889347db1d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) (-1L));
        java.lang.String str3 = token2.getId();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.token.Token token4 = tokenServiceImpl0.criaToken(token2);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Token deve conter: idQuestionarioAplicado e idAluno.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3c801200-1501-4e27-add3-30b50cc1bd87" + "'", str3, "3c801200-1501-4e27-add3-30b50cc1bd87");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("4886a34f-e994-44db-804e-76af3c234424", "hi!");
        credenciais2.setSenha("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        boolean boolean17 = matricula2.equals((java.lang.Object) (byte) 0);
        java.lang.Long long18 = matricula2.getId();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha0 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        respostaMultiplaEscolha0.setComentario("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getEmail();
        java.lang.String str2 = usuario0.getSenha();
        usuario0.setNome("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.professor.Professor professor1 = new com.ufcg.sad.models.professor.Professor();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.atualizarProfessor(professor1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: null");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao2 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao1.setTipoQuestao(tipoQuestao2);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questao.Questao questao4 = questaoServiceImpl0.criaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questa?o deve conter enunciado.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tipoQuestao2 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao2.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet28);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray30 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina29 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet31 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31, disciplinaArray30);
        com.ufcg.sad.models.professor.Professor professor33 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        java.lang.String str35 = professor11.getNome();
        java.lang.Long long36 = professor11.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet37 = professor11.getDisciplinas();
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNotNull(disciplinaSet37);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        com.ufcg.sad.models.professor.Professor professor36 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        com.ufcg.sad.controllers.ProfessorController professorController38 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean39 = professor12.equals((java.lang.Object) professorController38);
        com.ufcg.sad.models.matricula.Matricula matricula42 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        boolean boolean43 = professor12.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor44 = professorServiceImpl0.criarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(matricula42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList3 = questionario0.getQuestoes();
        java.util.Date date4 = null;
        questionario0.setDataUltimaEdicao(date4);
        java.util.Date date6 = null;
        questionario0.setDataCriacao(date6);
        org.junit.Assert.assertNotNull(questaoList3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        com.ufcg.sad.models.aluno.Aluno aluno11 = matricula3.getAluno();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 = alunoController0.atualizarAluno(aluno11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
        org.junit.Assert.assertNotNull(aluno11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        com.ufcg.sad.models.aluno.Aluno aluno1 = null;
        // The following exception was thrown during execution in test generation
        try {
            alunoServiceImpl0.removerAluno(aluno1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeNotFoundException; message: null");
        } catch (com.ufcg.sad.exceptions.EntidadeNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        java.util.Date date6 = questionario1.getDataCriacao();
        questionario1.setDescricao("hi!");
        com.ufcg.sad.models.questao.Questao[] questaoArray12 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList13 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList13, questaoArray12);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet21 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina22 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet21);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray23 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina22 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet24 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24, disciplinaArray23);
        com.ufcg.sad.models.professor.Professor professor26 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        professor26.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor26.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long39 = professor26.getId();
        professor26.setId((java.lang.Long) (-1L));
        java.util.Date date42 = null;
        java.util.Date date43 = null;
        com.ufcg.sad.models.questionario.Questionario questionario44 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList13, professor26, date42, date43);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList13);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario46 = questionarioServiceImpl0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(questaoArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(disciplinaArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(long39);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        java.lang.Long long3 = usuario0.getId();
        usuario0.setNome("");
        java.lang.String str6 = usuario0.getEmail();
        usuario0.setSobrenome("hi!");
        java.lang.String str9 = usuario0.getEmail();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor6 = questionario1.getAutor();
        java.lang.String str7 = questionario1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario8 = questionarioServiceImpl0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(professor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        com.ufcg.sad.models.aluno.Aluno aluno1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.criarAluno(aluno1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.ufcg.sad.models.opcao.Opcao opcao0 = new com.ufcg.sad.models.opcao.Opcao();
        opcao0.setId((java.lang.Long) 100L);
        opcao0.setNome("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        java.lang.String str5 = opcao0.getDescricao();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.token.Token token13 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L);
        questionarioAplicado10.addToken(token13);
        com.ufcg.sad.models.token.Token token17 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 0L);
        questionarioAplicado10.addToken(token17);
        java.lang.String str19 = questionarioAplicado10.getSemestre();
        java.lang.Integer int20 = questionarioAplicado10.getTurma();
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(int20);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray14 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15, matriculaArray14);
        com.ufcg.sad.models.aluno.Aluno aluno17 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet24 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina25 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet24);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray26 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina25 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet27 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet27, disciplinaArray26);
        com.ufcg.sad.models.professor.Professor professor29 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet27);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet34 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina35 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet34);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray36 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina35 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet37 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet37, disciplinaArray36);
        professor29.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet37);
        professor29.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        boolean boolean42 = aluno17.equals((java.lang.Object) professor29);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor43 = professorServiceImpl0.criarProfessor(professor29);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matriculaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(disciplinaArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(disciplinaArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray14 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15, matriculaArray14);
        com.ufcg.sad.models.aluno.Aluno aluno17 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.aluno.Aluno aluno18 = alunoServiceImpl0.criarAluno(aluno17);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Aluno apresenta dados inva?lidos");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matriculaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        com.ufcg.sad.models.resposta.Resposta resposta1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.resposta.Resposta resposta2 = respostaServiceImpl0.criarResposta(resposta1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.token.Token token13 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L);
        questionarioAplicado10.addToken(token13);
        com.ufcg.sad.models.token.Token token17 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 0L);
        questionarioAplicado10.addToken(token17);
        java.lang.String str19 = questionarioAplicado10.getSemestre();
        questionarioAplicado10.setIdDisciplina((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = disciplina11.getMatriculas();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNull(matriculaSet16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao0.setComentario("hi!");
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException0 = new com.ufcg.sad.exceptions.ParametroInvalidoException();
        java.lang.Throwable[] throwableArray1 = parametroInvalidoException0.getSuppressed();
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException3 = new com.ufcg.sad.exceptions.EntidadeInvalidaException("");
        parametroInvalidoException0.addSuppressed((java.lang.Throwable) entidadeInvalidaException3);
        java.lang.String str5 = entidadeInvalidaException3.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.ufcg.sad.exceptions.EntidadeInvalidaException: " + "'", str5, "com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException1 = new com.ufcg.sad.exceptions.ParametroInvalidoException("4d494946-e325-4202-b6b7-ef3d0a7413a2");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet28);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray30 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina29 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet31 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31, disciplinaArray30);
        com.ufcg.sad.models.professor.Professor professor33 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet35 = professor11.getDisciplinas();
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(disciplinaSet35);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Integer) 100, "4886a34f-e994-44db-804e-76af3c234424");
        respostaEscolhaSimples6.setComentario("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        java.util.Date date9 = respostaEscolhaSimples6.getDataResposta();
        java.util.Date date10 = null;
        respostaEscolhaSimples6.setDataResposta(date10);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        boolean boolean17 = matricula2.equals((java.lang.Object) (byte) 0);
        com.ufcg.sad.models.matricula.Matricula matricula20 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.aluno.Aluno aluno21 = matricula20.getAluno();
        matricula2.setAluno(aluno21);
        java.lang.String str23 = aluno21.getNome();
        aluno21.setSobrenome("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(matricula20);
        org.junit.Assert.assertNotNull(aluno21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str23, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        professor11.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        com.ufcg.sad.models.resposta.Resposta resposta11 = null;
        questionarioAplicado10.addResposta(resposta11);
        java.lang.String str13 = questionarioAplicado10.getSemestre();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray18 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet19, respostaArray18);
        com.ufcg.sad.models.token.Token[] tokenArray21 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet22 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet22, tokenArray21);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado24 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet19, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet22);
        java.lang.Integer int25 = questionarioAplicado24.getTurma();
        com.ufcg.sad.models.token.Token token27 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L);
        questionarioAplicado24.addToken(token27);
        com.ufcg.sad.models.token.Token token31 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 0L);
        questionarioAplicado24.addToken(token31);
        questionarioAplicado10.addToken(token31);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(respostaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tokenArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        com.ufcg.sad.models.professor.Professor professor36 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        com.ufcg.sad.controllers.ProfessorController professorController38 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean39 = professor12.equals((java.lang.Object) professorController38);
        com.ufcg.sad.models.matricula.Matricula matricula42 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        boolean boolean43 = professor12.equals((java.lang.Object) "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet50 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina51 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet50);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray52 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina51 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet53 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet53, disciplinaArray52);
        com.ufcg.sad.models.professor.Professor professor55 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet53);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet60 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina61 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet60);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray62 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina61 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet63 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet63, disciplinaArray62);
        professor55.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet63);
        professor55.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long68 = professor55.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet69 = professor55.getDisciplinas();
        professor12.setDisciplinas(disciplinaSet69);
        java.lang.String str71 = professor12.getNome();
        // The following exception was thrown during execution in test generation
        try {
            professorServiceImpl0.removerProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(matricula42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(disciplinaArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(disciplinaArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(long68);
        org.junit.Assert.assertNotNull(disciplinaSet69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        professor12.setNome("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        // The following exception was thrown during execution in test generation
        try {
            professorServiceImpl0.validaProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: hi!");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado15 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado10, "", (java.lang.Integer) 255, "");
        java.util.Date date17 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples22 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date17, (java.lang.Long) 100L, (java.lang.Long) 1L, (java.lang.Integer) (-1), "hi!");
        questionarioAplicado10.addResposta((com.ufcg.sad.models.resposta.Resposta) respostaEscolhaSimples22);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.ufcg.sad.models.token.Token token1 = new com.ufcg.sad.models.token.Token((java.lang.Long) 100L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.ufcg.sad.models.disciplina.Disciplina disciplina1 = new com.ufcg.sad.models.disciplina.Disciplina("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray17 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet18 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet18, respostaArray17);
        com.ufcg.sad.models.token.Token[] tokenArray20 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet21 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet21, tokenArray20);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado23 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet18, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet21);
        com.ufcg.sad.models.resposta.Resposta resposta24 = null;
        questionarioAplicado23.addResposta(resposta24);
        boolean boolean26 = questionarioAplicado11.equals((java.lang.Object) resposta24);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado30 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado11, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.lang.Integer) 100, "");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(respostaArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tokenArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(respostaArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tokenArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList4 = questionario1.getQuestoes();
        java.util.Date date5 = null;
        questionario1.setDataUltimaEdicao(date5);
        java.lang.Long long7 = questionario1.getId();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario8 = questionarioServiceImpl0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(questaoList4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException1 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("hi!");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException2 = new com.ufcg.sad.exceptions.EntidadeInvalidaException();
        entidadeNotFoundException1.addSuppressed((java.lang.Throwable) entidadeInvalidaException2);
        java.lang.String str4 = entidadeNotFoundException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.ufcg.sad.exceptions.EntidadeNotFoundException: hi!" + "'", str4, "com.ufcg.sad.exceptions.EntidadeNotFoundException: hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet29 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina30 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet29);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray31 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina30 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet32 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32, disciplinaArray31);
        com.ufcg.sad.models.professor.Professor professor34 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32);
        java.lang.String str36 = professor12.getNome();
        java.lang.Long long37 = professor12.getId();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor38 = professorServiceImpl0.atualizarProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: hi!");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(long37);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet5 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina6 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet5);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina7 = disciplinaServiceImpl0.cadastrarDisciplina(disciplina6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 0L, date1, (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.lang.Integer) 0, "");
        java.lang.String str7 = respostaEscolhaSimples6.getComentario();
        respostaEscolhaSimples6.setIdQuestionarioAplicado((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.ufcg.sad.models.professor.Professor professor0 = new com.ufcg.sad.models.professor.Professor();
        professor0.setId((java.lang.Long) 0L);
        java.lang.String str3 = professor0.getNome();
        java.lang.String str4 = professor0.getSiape();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("", "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("4886a34f-e994-44db-804e-76af3c234424", "hi!");
        credenciais2.setLogin("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        java.lang.String str5 = credenciais2.getSenha();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Date date1 = null;
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList4 = null;
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao5 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 10L, date1, (java.lang.Long) 1L, (java.lang.Long) 10L, opcaoList4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples1 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.resposta.Resposta resposta2 = respostaServiceImpl0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaEscolhaSimples1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: idQuesta?o na?o pode ser nulo.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        java.util.Date date3 = questao0.getDataUltimaEdicao();
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        questionario1.setId((java.lang.Long) 10L);
        questionario1.setNome("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        java.util.Date date10 = questionario1.getDataCriacao();
        java.util.Date date11 = null;
        questionario1.setDataUltimaEdicao(date11);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario13 = questionarioServiceImpl0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.ParametroInvalidoException; message: Id deve ser nulo para a criac?a?o do questiona?rio.");
        } catch (com.ufcg.sad.exceptions.ParametroInvalidoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.ufcg.sad.models.usuario.Usuario usuario5 = new com.ufcg.sad.models.usuario.Usuario((java.lang.Long) 10L, "4886a34f-e994-44db-804e-76af3c234424", "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "4886a34f-e994-44db-804e-76af3c234424", "hi!");
        java.lang.String str6 = usuario5.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str6, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet28);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray30 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina29 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet31 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31, disciplinaArray30);
        com.ufcg.sad.models.professor.Professor professor33 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        java.lang.String str35 = professor11.getNome();
        professor11.setNome("com.ufcg.sad.exceptions.EntidadeNotFoundException: hi!");
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        aluno16.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.matricula.Matricula matricula24 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet29 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina30 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet29);
        matricula24.setDisciplina(disciplina30);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray32 = new com.ufcg.sad.models.matricula.Matricula[] { matricula24 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet33, matriculaArray32);
        com.ufcg.sad.models.aluno.Aluno aluno35 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet33);
        aluno16.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet33);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet41 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina42 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet41);
        com.ufcg.sad.models.matricula.Matricula matricula43 = new com.ufcg.sad.models.matricula.Matricula(aluno16, disciplina42);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(matricula24);
        org.junit.Assert.assertNotNull(matriculaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.ufcg.sad.security.Credenciais credenciais0 = new com.ufcg.sad.security.Credenciais();
        credenciais0.setSenha("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        java.lang.String str3 = credenciais0.getLogin();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException0 = new com.ufcg.sad.exceptions.ParametroInvalidoException();
        java.lang.Throwable[] throwableArray1 = parametroInvalidoException0.getSuppressed();
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException3 = new com.ufcg.sad.exceptions.EntidadeInvalidaException("");
        parametroInvalidoException0.addSuppressed((java.lang.Throwable) entidadeInvalidaException3);
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException6 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("hi!");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException7 = new com.ufcg.sad.exceptions.EntidadeInvalidaException();
        entidadeNotFoundException6.addSuppressed((java.lang.Throwable) entidadeInvalidaException7);
        parametroInvalidoException0.addSuppressed((java.lang.Throwable) entidadeNotFoundException6);
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        com.ufcg.sad.models.aluno.Aluno aluno10 = matricula2.getAluno();
        com.ufcg.sad.models.token.Token token13 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        boolean boolean14 = matricula2.equals((java.lang.Object) token13);
        java.lang.Long long15 = matricula2.getId();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(aluno10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.ufcg.sad.models.professor.Professor professor0 = new com.ufcg.sad.models.professor.Professor();
        professor0.setId((java.lang.Long) 0L);
        java.lang.String str3 = professor0.getNome();
        java.lang.String str4 = professor0.getNome();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        com.ufcg.sad.models.professor.Professor professor36 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        com.ufcg.sad.controllers.ProfessorController professorController38 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean39 = professor12.equals((java.lang.Object) professorController38);
        com.ufcg.sad.models.matricula.Matricula matricula42 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        boolean boolean43 = professor12.equals((java.lang.Object) "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet50 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina51 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet50);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray52 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina51 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet53 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet53, disciplinaArray52);
        com.ufcg.sad.models.professor.Professor professor55 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet53);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet60 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina61 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet60);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray62 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina61 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet63 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet63, disciplinaArray62);
        professor55.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet63);
        professor55.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long68 = professor55.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet69 = professor55.getDisciplinas();
        professor12.setDisciplinas(disciplinaSet69);
        // The following exception was thrown during execution in test generation
        try {
            professorServiceImpl0.removerProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(matricula42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(disciplinaArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(disciplinaArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(long68);
        org.junit.Assert.assertNotNull(disciplinaSet69);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        com.ufcg.sad.models.aluno.Aluno aluno10 = matricula2.getAluno();
        java.lang.Object obj11 = null;
        boolean boolean12 = matricula2.equals(obj11);
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(aluno10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "");
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.ufcg.sad.models.opcao.Opcao opcao3 = new com.ufcg.sad.models.opcao.Opcao((java.lang.Long) (-1L), "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        com.ufcg.sad.models.matricula.Matricula matricula9 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula12 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        matricula12.setDisciplina(disciplina18);
        disciplina18.setId((java.lang.Long) 0L);
        matricula9.setDisciplina(disciplina18);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray23 = new com.ufcg.sad.models.matricula.Matricula[] { matricula9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet24 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet24, matriculaArray23);
        com.ufcg.sad.models.aluno.Aluno aluno26 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet24);
        boolean boolean27 = opcao3.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(matricula9);
        org.junit.Assert.assertNotNull(matricula12);
        org.junit.Assert.assertNotNull(matriculaArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 1L, date1, (java.lang.Long) 100L, (java.lang.Long) 100L, (java.lang.Integer) 1, "hi!");
        java.util.Date date7 = respostaEscolhaSimples6.getDataResposta();
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray14 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15, matriculaArray14);
        com.ufcg.sad.models.aluno.Aluno aluno17 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15);
        com.ufcg.sad.models.disciplina.Disciplina disciplina19 = new com.ufcg.sad.models.disciplina.Disciplina("");
        aluno17.adicionarDisciplina(disciplina19);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina21 = disciplinaServiceImpl0.atualizarDisciplina(disciplina19);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Turma inva?lida: null");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matriculaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado15 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado10, "", (java.lang.Integer) 255, "");
        questionarioAplicado10.setDisciplina("");
        java.lang.Integer int18 = questionarioAplicado10.getTurma();
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        usuario0.setSenha("");
        usuario0.setId((java.lang.Long) 10L);
        java.lang.String str7 = usuario0.getNome();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("4886a34f-e994-44db-804e-76af3c234424", "hi!");
        credenciais2.setLogin("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        credenciais2.setSenha("506aa218-b85c-412f-a028-e1e7ce66ed2d");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("");
        aluno16.adicionarDisciplina(disciplina18);
        java.lang.String str20 = aluno16.getSobrenome();
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor6 = questionario1.getAutor();
        java.lang.String str7 = questionario1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 = questionarioController0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(professor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta5 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 0L, date1, (java.lang.Long) (-1L), (java.lang.Long) (-1L), "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta6 = new com.ufcg.sad.models.resposta.RespostaAberta();
        respostaAberta6.setComentario("4886a34f-e994-44db-804e-76af3c234424");
        boolean boolean9 = respostaAberta5.equals((java.lang.Object) "4886a34f-e994-44db-804e-76af3c234424");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        matricula3.setDisciplina(disciplina9);
        disciplina9.setId((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina13 = disciplinaServiceImpl0.cadastrarDisciplina(disciplina9);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Id deve ser nulo para a criac?a?o de Disciplina.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples0 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples();
        java.util.Date date1 = respostaEscolhaSimples0.getDataResposta();
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao2 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao1.setTipoQuestao(tipoQuestao2);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao4 = com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES;
        questao1.setTipoQuestao(tipoQuestao4);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet12 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet12);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray14 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina13 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet15, disciplinaArray14);
        com.ufcg.sad.models.professor.Professor professor17 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet15);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina23 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet22);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray24 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina23 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet25 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25, disciplinaArray24);
        professor17.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25);
        java.lang.String str28 = professor17.getSiape();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet29 = professor17.getDisciplinas();
        questao1.setAutor(professor17);
        // The following exception was thrown during execution in test generation
        try {
            questaoServiceImpl0.validaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tipoQuestao2 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao2.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertTrue("'" + tipoQuestao4 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES + "'", tipoQuestao4.equals(com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES));
        org.junit.Assert.assertNotNull(disciplinaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(disciplinaArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(disciplinaSet29);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        com.ufcg.sad.models.aluno.Aluno aluno10 = matricula2.getAluno();
        com.ufcg.sad.models.aluno.Aluno aluno11 = matricula2.getAluno();
        java.lang.Long long12 = matricula2.getId();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(aluno10);
        org.junit.Assert.assertNotNull(aluno11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.questao.Questao[] questaoArray4 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList5 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList5, questaoArray4);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet13 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina14 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet13);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray15 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina14 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet16 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet16, disciplinaArray15);
        com.ufcg.sad.models.professor.Professor professor18 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet16);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet23 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina24 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet23);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray25 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina24 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26, disciplinaArray25);
        professor18.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26);
        professor18.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long31 = professor18.getId();
        professor18.setId((java.lang.Long) (-1L));
        java.util.Date date34 = null;
        java.util.Date date35 = null;
        com.ufcg.sad.models.questionario.Questionario questionario36 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList5, professor18, date34, date35);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet37 = professor18.getDisciplinas();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor38 = professorServiceImpl0.criarProfessor(professor18);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Id deve ser nulo para criac?a?o de Professor.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(questaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(disciplinaArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(disciplinaArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(disciplinaSet37);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        opcao4.setNome("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao opcao5 = new com.ufcg.sad.models.opcao.Opcao();
        opcao5.setNome("");
        java.lang.String str8 = opcao5.getNome();
        opcao5.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha12 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date2, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao5, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha12.setId((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            respostaServiceImpl0.validaResposta((com.ufcg.sad.models.resposta.Resposta) respostaMultiplaEscolha12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao3 = questao0.getTipoQuestao();
        questao0.setComentario("4886a34f-e994-44db-804e-76af3c234424");
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertTrue("'" + tipoQuestao3 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao3.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", "562dc7a4-935c-4ec1-a22d-2af9d83af33a");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        questao1.setId((java.lang.Long) 100L);
        questao1.setId((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questao.Questao questao6 = questaoServiceImpl0.atualizaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questa?o deve conter enunciado.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException1 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("hi!");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException2 = new com.ufcg.sad.exceptions.EntidadeInvalidaException();
        entidadeNotFoundException1.addSuppressed((java.lang.Throwable) entidadeInvalidaException2);
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException4 = new com.ufcg.sad.exceptions.ParametroInvalidoException();
        java.lang.Throwable[] throwableArray5 = parametroInvalidoException4.getSuppressed();
        entidadeInvalidaException2.addSuppressed((java.lang.Throwable) parametroInvalidoException4);
        java.lang.Throwable[] throwableArray7 = parametroInvalidoException4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parametroInvalidoException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        questionario0.setDescricao("hi!");
        java.util.Date date5 = questionario0.getDataCriacao();
        questionario0.setDescricao("hi!");
        java.util.Date date8 = null;
        questionario0.setDataCriacao(date8);
        com.ufcg.sad.models.professor.Professor professor10 = questionario0.getAutor();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(professor10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long24 = professor11.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet25 = professor11.getDisciplinas();
        java.lang.String str26 = professor11.getNome();
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertNotNull(disciplinaSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList6 = questionario1.getQuestoes();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario7 = questionarioServiceImpl0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(questaoList6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException1 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException0 = new com.ufcg.sad.exceptions.EntidadeNotFoundException();
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException1 = new com.ufcg.sad.exceptions.EntidadeInvalidaException();
        java.lang.Throwable[] throwableArray2 = entidadeInvalidaException1.getSuppressed();
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException4 = new com.ufcg.sad.exceptions.EntidadeInvalidaException("");
        entidadeInvalidaException1.addSuppressed((java.lang.Throwable) entidadeInvalidaException4);
        entidadeNotFoundException0.addSuppressed((java.lang.Throwable) entidadeInvalidaException4);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        java.lang.Class<?> wildcardClass37 = professor11.getClass();
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("4886a34f-e994-44db-804e-76af3c234424", "hi!");
        java.lang.String str3 = credenciais2.getSenha();
        credenciais2.setSenha("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        java.lang.String str6 = credenciais2.getLogin();
        java.lang.String str7 = credenciais2.getSenha();
        java.lang.String str8 = credenciais2.getSenha();
        credenciais2.setLogin("32684167-a58b-4266-95f2-2d889347db1d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str6, "4886a34f-e994-44db-804e-76af3c234424");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2" + "'", str7, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2" + "'", str8, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta5 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 10L, date1, (java.lang.Long) 100L, (java.lang.Long) 100L, "0ff74fdf-f04c-407c-be15-11a0b27a7d88");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        disciplina8.setNome("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
        disciplina8.setNome("506aa218-b85c-412f-a028-e1e7ce66ed2d");
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao0.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        questao0.setComentario("32684167-a58b-4266-95f2-2d889347db1d");
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha11.setComentario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        com.ufcg.sad.models.opcao.Opcao opcao14 = respostaMultiplaEscolha11.getOpcaoEscolhida();
        com.ufcg.sad.models.questao.Questao questao15 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao16 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao15.setTipoQuestao(tipoQuestao16);
        boolean boolean18 = respostaMultiplaEscolha11.equals((java.lang.Object) questao15);
        java.util.Date date19 = null;
        respostaMultiplaEscolha11.setDataResposta(date19);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(opcao14);
        org.junit.Assert.assertTrue("'" + tipoQuestao16 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao16.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("4886a34f-e994-44db-804e-76af3c234424", "hi!");
        java.lang.String str3 = credenciais2.getSenha();
        credenciais2.setSenha("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        java.lang.String str6 = credenciais2.getSenha();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2" + "'", str6, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("4886a34f-e994-44db-804e-76af3c234424", "hi!");
        java.lang.String str3 = credenciais2.getSenha();
        credenciais2.setSenha("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        credenciais2.setSenha("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        credenciais2.setLogin("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        java.lang.String str10 = credenciais2.getLogin();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2" + "'", str10, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        java.util.Date date2 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta6 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 100L, date2, (java.lang.Long) 0L, (java.lang.Long) 0L, "4886a34f-e994-44db-804e-76af3c234424");
        java.util.Date date7 = respostaAberta6.getDataResposta();
        java.lang.String str8 = respostaAberta6.getComentario();
        boolean boolean10 = respostaAberta6.equals((java.lang.Object) (short) 10);
        java.lang.String str11 = respostaAberta6.getComentario();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.resposta.Resposta resposta12 = respostaServiceImpl0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaAberta6);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.ParametroInvalidoException; message: Id deve ser nulo para a criac?a?o de resposta.");
        } catch (com.ufcg.sad.exceptions.ParametroInvalidoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str8, "4886a34f-e994-44db-804e-76af3c234424");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str11, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        java.lang.String str17 = aluno16.getEmail();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina23 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet22);
        aluno16.adicionarDisciplina(disciplina23);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta0 = new com.ufcg.sad.models.resposta.RespostaAberta();
        respostaAberta0.setIdQuestionarioAplicado((java.lang.Long) 10L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.ufcg.sad.models.questao.Questao[] questaoArray3 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList4 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList4, questaoArray3);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet12 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina13 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet12);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray14 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina13 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet15, disciplinaArray14);
        com.ufcg.sad.models.professor.Professor professor17 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet15);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina23 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet22);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray24 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina23 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet25 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25, disciplinaArray24);
        professor17.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet25);
        professor17.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long30 = professor17.getId();
        professor17.setId((java.lang.Long) (-1L));
        java.util.Date date33 = null;
        java.util.Date date34 = null;
        com.ufcg.sad.models.questionario.Questionario questionario35 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList4, professor17, date33, date34);
        java.lang.String str36 = professor17.getSiape();
        org.junit.Assert.assertNotNull(questaoArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(disciplinaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(disciplinaArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str36, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.professor.Professor professor1 = questao0.getAutor();
        java.util.Date date2 = null;
        questao0.setDataUltimaEdicao(date2);
        org.junit.Assert.assertNull(professor1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        usuario0.setSenha("");
        usuario0.setEmail("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        java.util.Date date2 = null;
        com.ufcg.sad.models.opcao.Opcao opcao5 = new com.ufcg.sad.models.opcao.Opcao();
        opcao5.setNome("");
        java.lang.String str8 = opcao5.getNome();
        opcao5.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha12 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date2, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao5, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha12.setComentario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        com.ufcg.sad.models.opcao.Opcao opcao15 = respostaMultiplaEscolha12.getOpcaoEscolhida();
        com.ufcg.sad.models.questao.Questao questao16 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao17 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao16.setTipoQuestao(tipoQuestao17);
        boolean boolean19 = respostaMultiplaEscolha12.equals((java.lang.Object) questao16);
        questao16.setId((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questao.Questao questao22 = questaoServiceImpl0.atualizaQuestao(questao16);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questa?o deve conter enunciado.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(opcao15);
        org.junit.Assert.assertTrue("'" + tipoQuestao17 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao17.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.ufcg.sad.models.aluno.Aluno aluno0 = new com.ufcg.sad.models.aluno.Aluno();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        com.ufcg.sad.models.matricula.Matricula matricula11 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula14 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet19 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina20 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet19);
        matricula14.setDisciplina(disciplina20);
        disciplina20.setId((java.lang.Long) 0L);
        matricula11.setDisciplina(disciplina20);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray25 = new com.ufcg.sad.models.matricula.Matricula[] { matricula11 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet26, matriculaArray25);
        com.ufcg.sad.models.aluno.Aluno aluno28 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet26);
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina((java.lang.Long) 1L, "4d494946-e325-4202-b6b7-ef3d0a7413a2", (java.lang.Integer) 100, (java.lang.Long) (-1L), "4d494946-e325-4202-b6b7-ef3d0a7413a2", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet26);
        java.lang.String str30 = disciplina29.getCodigo();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 = disciplinaController0.cadastrarDisciplina(disciplina29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula11);
        org.junit.Assert.assertNotNull(matricula14);
        org.junit.Assert.assertNotNull(matriculaArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) (-1L));
        token2.setIdQuestionarioAplicado((java.lang.Long) 0L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.ufcg.sad.models.usuario.Usuario usuario5 = new com.ufcg.sad.models.usuario.Usuario((java.lang.Long) (-1L), "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "32684167-a58b-4266-95f2-2d889347db1d", "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("2b1c88f1-aadb-44fa-af13-4368c48e1ef4", "hi!");
        org.junit.Assert.assertNotNull(matricula2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        questionario0.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor5 = questionario0.getAutor();
        questionario0.setDescricao("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        java.util.Date date8 = null;
        questionario0.setDataCriacao(date8);
        org.junit.Assert.assertNull(professor5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException1 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("hi!");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException2 = new com.ufcg.sad.exceptions.EntidadeInvalidaException();
        entidadeNotFoundException1.addSuppressed((java.lang.Throwable) entidadeInvalidaException2);
        java.lang.Throwable[] throwableArray4 = entidadeNotFoundException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 10L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet28);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray30 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina29 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet31 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31, disciplinaArray30);
        com.ufcg.sad.models.professor.Professor professor33 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        java.lang.String str35 = professor11.getNome();
        java.lang.Long long36 = professor11.getId();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet45 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina46 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet45);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray47 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina46 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet48 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet48, disciplinaArray47);
        com.ufcg.sad.models.professor.Professor professor50 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet48);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet55 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina56 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet55);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray57 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina56 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet58 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet58, disciplinaArray57);
        professor50.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet58);
        professor50.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long63 = professor50.getId();
        professor50.setId((java.lang.Long) (-1L));
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet66 = professor50.getDisciplinas();
        com.ufcg.sad.models.professor.Professor professor67 = new com.ufcg.sad.models.professor.Professor("506aa218-b85c-412f-a028-e1e7ce66ed2d", "506aa218-b85c-412f-a028-e1e7ce66ed2d", disciplinaSet66);
        professor11.setDisciplinas(disciplinaSet66);
        professor11.setSiape("hi!");
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNotNull(disciplinaArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(disciplinaArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(long63);
        org.junit.Assert.assertNotNull(disciplinaSet66);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 0L);
        opcao4.setId((java.lang.Long) 10L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha13 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) 0L, (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha13.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao0.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        com.ufcg.sad.models.questao.Questao questao7 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao8 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao7.setTipoQuestao(tipoQuestao8);
        questao0.setTipoQuestao(tipoQuestao8);
        com.ufcg.sad.models.questao.Questao questao11 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao12 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao11.setTipoQuestao(tipoQuestao12);
        questao11.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao11.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        com.ufcg.sad.models.questao.Questao questao18 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao19 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao18.setTipoQuestao(tipoQuestao19);
        questao11.setTipoQuestao(tipoQuestao19);
        questao0.setTipoQuestao(tipoQuestao19);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList23 = questao0.getOpcoes();
        java.util.Date date25 = null;
        java.util.Date date29 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray32 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList33 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList33, opcaoArray32);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao35 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date29, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList33);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao36 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) (-1L), date25, (java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList33);
        questao0.setOpcoes((java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList33);
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertTrue("'" + tipoQuestao8 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao8.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertTrue("'" + tipoQuestao12 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao12.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertTrue("'" + tipoQuestao19 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao19.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertNull(opcaoList23);
        org.junit.Assert.assertNotNull(opcaoArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) (-1L));
        token2.setId("");
        token2.setId("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao0.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        com.ufcg.sad.models.questao.Questao questao7 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao8 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao7.setTipoQuestao(tipoQuestao8);
        questao0.setTipoQuestao(tipoQuestao8);
        java.util.Date date11 = null;
        questao0.setDataUltimaEdicao(date11);
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertTrue("'" + tipoQuestao8 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao8.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        questionarioAplicado10.setIdDisciplina((java.lang.Long) 10L);
        com.ufcg.sad.models.matricula.Matricula matricula15 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet20 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina21 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet20);
        matricula15.setDisciplina(disciplina21);
        com.ufcg.sad.models.aluno.Aluno aluno23 = matricula15.getAluno();
        com.ufcg.sad.models.token.Token token26 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        boolean boolean27 = matricula15.equals((java.lang.Object) token26);
        boolean boolean28 = questionarioAplicado10.equals((java.lang.Object) matricula15);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matricula15);
        org.junit.Assert.assertNotNull(aluno23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getEmail();
        java.lang.String str2 = usuario0.getNome();
        usuario0.setSenha("0ff74fdf-f04c-407c-be15-11a0b27a7d88");
        usuario0.setSobrenome("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet9 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina10 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet9);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray11 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina10 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet12 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet12, disciplinaArray11);
        com.ufcg.sad.models.professor.Professor professor14 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet12);
        com.ufcg.sad.models.professor.Professor professor15 = new com.ufcg.sad.models.professor.Professor("4886a34f-e994-44db-804e-76af3c234424", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet12);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor16 = professorServiceImpl0.atualizarProfessor(professor15);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Long) 100L, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        com.ufcg.sad.models.questao.Questao[] questaoArray4 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList5 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList5, questaoArray4);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet13 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina14 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet13);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray15 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina14 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet16 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet16, disciplinaArray15);
        com.ufcg.sad.models.professor.Professor professor18 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet16);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet23 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina24 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet23);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray25 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina24 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26, disciplinaArray25);
        professor18.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26);
        professor18.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long31 = professor18.getId();
        professor18.setId((java.lang.Long) (-1L));
        java.util.Date date34 = null;
        java.util.Date date35 = null;
        com.ufcg.sad.models.questionario.Questionario questionario36 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList5, professor18, date34, date35);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.professor.Professor professor37 = professorServiceImpl0.atualizarProfessor(professor18);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Siape inva?lido: 4886a34f-e994-44db-804e-76af3c234424");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(questaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(disciplinaArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(disciplinaArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(long31);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        questionario0.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor5 = questionario0.getAutor();
        com.ufcg.sad.models.questao.Questao[] questaoArray9 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList10 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList10, questaoArray9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet18 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina19 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet18);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray20 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina19 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet21 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet21, disciplinaArray20);
        com.ufcg.sad.models.professor.Professor professor23 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet21);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet28);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray30 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina29 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet31 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31, disciplinaArray30);
        professor23.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet40 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina41 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet40);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray42 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina41 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet43 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet43, disciplinaArray42);
        com.ufcg.sad.models.professor.Professor professor45 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet43);
        professor23.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet43);
        java.util.Date date47 = null;
        java.util.Date date48 = null;
        com.ufcg.sad.models.questionario.Questionario questionario49 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList10, professor23, date47, date48);
        questionario0.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList10);
        java.util.Date date51 = questionario0.getDataCriacao();
        org.junit.Assert.assertNull(professor5);
        org.junit.Assert.assertNotNull(questaoArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(disciplinaArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(disciplinaArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(disciplinaArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(date51);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        java.util.Date date3 = questionario0.getDataCriacao();
        com.ufcg.sad.models.professor.Professor professor4 = questionario0.getAutor();
        java.lang.String str5 = questionario0.getNome();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(professor4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        questionario0.setDescricao("hi!");
        java.util.Date date5 = questionario0.getDataCriacao();
        questionario0.setDescricao("hi!");
        java.util.Date date8 = null;
        questionario0.setDataCriacao(date8);
        java.lang.String str10 = questionario0.getNome();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.ufcg.sad.exceptions.EntidadeNotFoundException entidadeNotFoundException1 = new com.ufcg.sad.exceptions.EntidadeNotFoundException("hi!");
        com.ufcg.sad.exceptions.EntidadeInvalidaException entidadeInvalidaException2 = new com.ufcg.sad.exceptions.EntidadeInvalidaException();
        entidadeNotFoundException1.addSuppressed((java.lang.Throwable) entidadeInvalidaException2);
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException4 = new com.ufcg.sad.exceptions.ParametroInvalidoException();
        java.lang.Throwable[] throwableArray5 = parametroInvalidoException4.getSuppressed();
        entidadeInvalidaException2.addSuppressed((java.lang.Throwable) parametroInvalidoException4);
        java.lang.Throwable[] throwableArray7 = entidadeInvalidaException2.getSuppressed();
        java.lang.Throwable[] throwableArray8 = entidadeInvalidaException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta5 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 100L, date1, (java.lang.Long) 0L, (java.lang.Long) 0L, "4886a34f-e994-44db-804e-76af3c234424");
        java.util.Date date6 = respostaAberta5.getDataResposta();
        java.lang.String str7 = respostaAberta5.getComentario();
        java.lang.Class<?> wildcardClass8 = respostaAberta5.getClass();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str7, "4886a34f-e994-44db-804e-76af3c234424");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        disciplina8.setId((java.lang.Long) 0L);
        com.ufcg.sad.models.opcao.Opcao opcao15 = new com.ufcg.sad.models.opcao.Opcao((java.lang.Long) (-1L), "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        boolean boolean16 = disciplina8.equals((java.lang.Object) opcao15);
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.ufcg.sad.controllers.RespostaController respostaController0 = new com.ufcg.sad.controllers.RespostaController();
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = respostaController0.getResposta((java.lang.Long) 1L);
        org.junit.Assert.assertNull(objResponseEntity2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 1L, date1, (java.lang.Long) 100L, (java.lang.Long) 100L, (java.lang.Integer) 1, "hi!");
        java.lang.String str7 = respostaEscolhaSimples6.getComentario();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        questionario1.setId((java.lang.Long) 10L);
        java.util.Date date8 = questionario1.getDataCriacao();
        java.lang.String str9 = questionario1.getDescricao();
        questionario1.setDescricao("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 = questionarioController0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        professor12.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long25 = professor12.getId();
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet26 = professor12.getDisciplinas();
        java.util.Date date27 = null;
        java.util.Date date30 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray33 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList34 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList34, opcaoArray33);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao36 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date30, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList34);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList37 = respostaSelecao36.getOpcoesSelecionadas();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao38 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        com.ufcg.sad.models.questao.Questao questao39 = com.ufcg.sad.models.util.Utils.createQuestaoTest("4886a34f-e994-44db-804e-76af3c234424", professor12, date27, "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", opcaoList37, tipoQuestao38);
        java.lang.Long long40 = questao39.getId();
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNotNull(disciplinaSet26);
        org.junit.Assert.assertNotNull(opcaoArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(opcaoList37);
        org.junit.Assert.assertTrue("'" + tipoQuestao38 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao38.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertNotNull(questao39);
        org.junit.Assert.assertNull(long40);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao3 = com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES;
        questao0.setTipoQuestao(tipoQuestao3);
        com.ufcg.sad.models.professor.Professor professor5 = questao0.getAutor();
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertTrue("'" + tipoQuestao3 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES + "'", tipoQuestao3.equals(com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES));
        org.junit.Assert.assertNull(professor5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        questao1.setId((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questao.Questao questao4 = questaoServiceImpl0.atualizaQuestao(questao1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questa?o deve conter enunciado.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        usuario0.setSenha("");
        java.lang.String str5 = usuario0.getNome();
        usuario0.setNome("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 1L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        java.util.Date date5 = questao0.getDataUltimaEdicao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao6 = questao0.getTipoQuestao();
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + tipoQuestao6 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao6.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        disciplina12.setId((java.lang.Long) 0L);
        matricula3.setDisciplina(disciplina12);
        boolean boolean18 = matricula3.equals((java.lang.Object) (byte) 0);
        com.ufcg.sad.models.aluno.Aluno aluno19 = matricula3.getAluno();
        // The following exception was thrown during execution in test generation
        try {
            alunoServiceImpl0.removerAluno(aluno19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula3);
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(aluno19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta5 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 0L, date1, (java.lang.Long) 0L, (java.lang.Long) 100L, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.Date date1 = null;
        java.util.Date date5 = null;
        com.ufcg.sad.models.opcao.Opcao opcao8 = new com.ufcg.sad.models.opcao.Opcao();
        opcao8.setNome("");
        java.lang.String str11 = opcao8.getNome();
        opcao8.setId((java.lang.Long) 0L);
        opcao8.setId((java.lang.Long) 10L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha17 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date5, (java.lang.Long) 0L, (java.lang.Long) 1L, opcao8, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha19 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 0L, date1, (java.lang.Long) 0L, (java.lang.Long) 10L, opcao8, "506aa218-b85c-412f-a028-e1e7ce66ed2d");
        java.util.Date date20 = null;
        respostaMultiplaEscolha19.setDataResposta(date20);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao0.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.String str7 = questao0.getComentario();
        java.lang.String str8 = questao0.getComentario();
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha11.setComentario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        com.ufcg.sad.models.opcao.Opcao opcao14 = respostaMultiplaEscolha11.getOpcaoEscolhida();
        com.ufcg.sad.models.questao.Questao questao15 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao16 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao15.setTipoQuestao(tipoQuestao16);
        boolean boolean18 = respostaMultiplaEscolha11.equals((java.lang.Object) questao15);
        com.ufcg.sad.models.professor.Professor professor19 = questao15.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(opcao14);
        org.junit.Assert.assertTrue("'" + tipoQuestao16 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao16.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(professor19);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.ufcg.sad.models.disciplina.Disciplina disciplina1 = new com.ufcg.sad.models.disciplina.Disciplina("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
        java.util.Date date3 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta7 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 1L, date3, (java.lang.Long) 1L, (java.lang.Long) 10L, "562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        com.ufcg.sad.models.matricula.Matricula matricula10 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        boolean boolean11 = respostaAberta7.equals((java.lang.Object) matricula10);
        com.ufcg.sad.models.matricula.Matricula matricula17 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina23 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet22);
        matricula17.setDisciplina(disciplina23);
        com.ufcg.sad.models.aluno.Aluno aluno25 = matricula17.getAluno();
        com.ufcg.sad.models.token.Token token28 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        boolean boolean29 = matricula17.equals((java.lang.Object) token28);
        com.ufcg.sad.models.aluno.Aluno aluno30 = matricula17.getAluno();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = aluno30.getMatriculas();
        com.ufcg.sad.models.aluno.Aluno aluno32 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 100L, "", "2b1c88f1-aadb-44fa-af13-4368c48e1ef4", matriculaSet31);
        matricula10.setAluno(aluno32);
        disciplina1.adicionarAluno(aluno32);
        org.junit.Assert.assertNotNull(matricula10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(matricula17);
        org.junit.Assert.assertNotNull(aluno25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(aluno30);
        org.junit.Assert.assertNotNull(matriculaSet31);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        questionarioAplicado10.setDisciplina("0b7e6eb3-167c-4842-bd84-999ba574d653");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        com.ufcg.sad.models.aluno.Aluno aluno10 = matricula2.getAluno();
        com.ufcg.sad.models.matricula.Matricula matricula13 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula16 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet21 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina22 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet21);
        matricula16.setDisciplina(disciplina22);
        disciplina22.setId((java.lang.Long) 0L);
        matricula13.setDisciplina(disciplina22);
        aluno10.adicionarDisciplina(disciplina22);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = disciplina22.getMatriculas();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(aluno10);
        org.junit.Assert.assertNotNull(matricula13);
        org.junit.Assert.assertNotNull(matricula16);
        org.junit.Assert.assertNull(matriculaSet28);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray9 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina8 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet10 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10, disciplinaArray9);
        com.ufcg.sad.models.professor.Professor professor12 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet10);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina18 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet17);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray19 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina18 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20, disciplinaArray19);
        professor12.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet20);
        java.lang.String str23 = professor12.getSiape();
        // The following exception was thrown during execution in test generation
        try {
            professorServiceImpl0.removerProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(disciplinaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha11.setComentario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        com.ufcg.sad.models.opcao.Opcao opcao14 = respostaMultiplaEscolha11.getOpcaoEscolhida();
        com.ufcg.sad.models.questao.Questao questao15 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao16 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao15.setTipoQuestao(tipoQuestao16);
        boolean boolean18 = respostaMultiplaEscolha11.equals((java.lang.Object) questao15);
        questao15.setId((java.lang.Long) 100L);
        java.util.Date date21 = questao15.getDataCriacao();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(opcao14);
        org.junit.Assert.assertTrue("'" + tipoQuestao16 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao16.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Integer) 100, "4886a34f-e994-44db-804e-76af3c234424");
        java.util.Date date7 = null;
        respostaEscolhaSimples6.setDataResposta(date7);
        respostaEscolhaSimples6.setIdQuestionarioAplicado((java.lang.Long) 10L);
        respostaEscolhaSimples6.setComentario("32684167-a58b-4266-95f2-2d889347db1d");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet20 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina21 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet20);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray22 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina21 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet23 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23, disciplinaArray22);
        com.ufcg.sad.models.professor.Professor professor25 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23);
        com.ufcg.sad.models.professor.Professor professor26 = new com.ufcg.sad.models.professor.Professor("4886a34f-e994-44db-804e-76af3c234424", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet23);
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.ufcg.sad.security.Credenciais credenciais2 = new com.ufcg.sad.security.Credenciais("0b7e6eb3-167c-4842-bd84-999ba574d653", "com.ufcg.sad.exceptions.EntidadeNotFoundException: hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.resposta.Resposta resposta12 = null;
        questionarioAplicado10.addResposta(resposta12);
        questionarioAplicado10.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor6 = questionario1.getAutor();
        questionario1.setDescricao("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario9 = questionarioServiceImpl0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(professor6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getSenha();
        java.lang.String str2 = usuario0.getSenha();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        boolean boolean17 = matricula2.equals((java.lang.Object) (byte) 0);
        com.ufcg.sad.models.aluno.Aluno aluno18 = matricula2.getAluno();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet19 = aluno18.getMatriculas();
        aluno18.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(aluno18);
        org.junit.Assert.assertNotNull(matriculaSet19);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        java.lang.String str3 = token2.getId();
        token2.setId("0b7e6eb3-167c-4842-bd84-999ba574d653");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66aa2e52-6672-47b1-9e54-08eaeee0494a" + "'", str3, "66aa2e52-6672-47b1-9e54-08eaeee0494a");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getSenha();
        usuario0.setId((java.lang.Long) 1L);
        usuario0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        java.lang.String str3 = usuario0.getNome();
        usuario0.setNome("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        java.lang.String str6 = usuario0.getEmail();
        usuario0.setSobrenome("com.ufcg.sad.exceptions.EntidadeNotFoundException: hi!");
        java.lang.Long long9 = usuario0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.ufcg.sad.models.usuario.Usuario usuario5 = new com.ufcg.sad.models.usuario.Usuario((java.lang.Long) 10L, "4886a34f-e994-44db-804e-76af3c234424", "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "4886a34f-e994-44db-804e-76af3c234424", "hi!");
        usuario5.setSobrenome("4886a34f-e994-44db-804e-76af3c234424");
        usuario5.setSenha("506aa218-b85c-412f-a028-e1e7ce66ed2d");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet4 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina5 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet4);
        java.lang.String str6 = disciplina5.getCodigo();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado15 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado10, "", (java.lang.Integer) 255, "");
        questionarioAplicado15.setDisciplina("4886a34f-e994-44db-804e-76af3c234424");
        questionarioAplicado15.setIdDisciplina((java.lang.Long) 10L);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet20 = questionarioAplicado15.getRespostas();
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(respostaSet20);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        questionario1.setId((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 = questionarioController0.atualizaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao3 = com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES;
        questao0.setTipoQuestao(tipoQuestao3);
        java.util.Date date6 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples11 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date6, (java.lang.Long) 100L, (java.lang.Long) 1L, (java.lang.Integer) (-1), "hi!");
        java.util.Date date12 = null;
        respostaEscolhaSimples11.setDataResposta(date12);
        boolean boolean14 = questao0.equals((java.lang.Object) respostaEscolhaSimples11);
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertTrue("'" + tipoQuestao3 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES + "'", tipoQuestao3.equals(com.ufcg.sad.models.questao.TipoQuestao.ESCOLHA_SIMPLES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula7 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula10 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet15);
        matricula10.setDisciplina(disciplina16);
        disciplina16.setId((java.lang.Long) 0L);
        matricula7.setDisciplina(disciplina16);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray21 = new com.ufcg.sad.models.matricula.Matricula[] { matricula7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22, matriculaArray21);
        com.ufcg.sad.models.aluno.Aluno aluno24 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet22);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.aluno.Aluno aluno25 = disciplinaServiceImpl0.vincularAluno((java.lang.Long) 1L, aluno24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula7);
        org.junit.Assert.assertNotNull(matricula10);
        org.junit.Assert.assertNotNull(matriculaArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        com.ufcg.sad.models.matricula.Matricula matricula6 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet11 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina12 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet11);
        matricula6.setDisciplina(disciplina12);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray14 = new com.ufcg.sad.models.matricula.Matricula[] { matricula6 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet15 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15, matriculaArray14);
        com.ufcg.sad.models.aluno.Aluno aluno17 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet15);
        java.lang.String str18 = aluno17.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 = alunoController0.criarAluno(aluno17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula6);
        org.junit.Assert.assertNotNull(matriculaArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaAberta respostaAberta5 = new com.ufcg.sad.models.resposta.RespostaAberta((java.lang.Long) 10L, date1, (java.lang.Long) 0L, (java.lang.Long) (-1L), "562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        java.util.Date date6 = null;
        respostaAberta5.setDataResposta(date6);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.ufcg.sad.exceptions.ParametroInvalidoException parametroInvalidoException1 = new com.ufcg.sad.exceptions.ParametroInvalidoException("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date2 = null;
        questionario1.setDataUltimaEdicao(date2);
        questionario1.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor6 = questionario1.getAutor();
        questionario1.setDescricao("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
        java.util.Date date9 = null;
        questionario1.setDataUltimaEdicao(date9);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario11 = questionarioServiceImpl0.criaQuestionario(questionario1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio sem nome.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(professor6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet8 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina9 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet8);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray10 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet11 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet11, disciplinaArray10);
        com.ufcg.sad.models.professor.Professor professor13 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet11);
        com.ufcg.sad.models.professor.Professor professor14 = new com.ufcg.sad.models.professor.Professor("4886a34f-e994-44db-804e-76af3c234424", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet11);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet21 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina22 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet21);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray23 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina22 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet24 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24, disciplinaArray23);
        com.ufcg.sad.models.professor.Professor professor26 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet31 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina32 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet31);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray33 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina32 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet34 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34, disciplinaArray33);
        professor26.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        professor14.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet34);
        java.lang.Long long38 = professor14.getId();
        java.lang.Long long39 = professor14.getId();
        org.junit.Assert.assertNotNull(disciplinaArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(disciplinaArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(disciplinaArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNull(long39);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet7 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina8 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet7);
        matricula2.setDisciplina(disciplina8);
        com.ufcg.sad.models.aluno.Aluno aluno10 = matricula2.getAluno();
        com.ufcg.sad.models.matricula.Matricula matricula13 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula16 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet21 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina22 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet21);
        matricula16.setDisciplina(disciplina22);
        disciplina22.setId((java.lang.Long) 0L);
        matricula13.setDisciplina(disciplina22);
        aluno10.adicionarDisciplina(disciplina22);
        aluno10.setEmail("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(aluno10);
        org.junit.Assert.assertNotNull(matricula13);
        org.junit.Assert.assertNotNull(matricula16);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.ufcg.sad.models.usuario.Usuario usuario5 = new com.ufcg.sad.models.usuario.Usuario((java.lang.Long) 10L, "4886a34f-e994-44db-804e-76af3c234424", "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "4886a34f-e994-44db-804e-76af3c234424", "hi!");
        usuario5.setSobrenome("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.String str8 = usuario5.getSenha();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha11.setId((java.lang.Long) 1L);
        java.lang.String str14 = respostaMultiplaEscolha11.getComentario();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "8d5f6ea8-6ec6-4810-bc12-45045d0b7805" + "'", str14, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        boolean boolean17 = matricula2.equals((java.lang.Object) (byte) 0);
        com.ufcg.sad.models.aluno.Aluno aluno18 = matricula2.getAluno();
        java.lang.String str19 = aluno18.getNome();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(aluno18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str19, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao[] opcaoArray4 = new com.ufcg.sad.models.opcao.Opcao[] {};
        java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao> opcaoList5 = new java.util.ArrayList<com.ufcg.sad.models.opcao.Opcao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.opcao.Opcao>) opcaoList5, opcaoArray4);
        com.ufcg.sad.models.resposta.RespostaSelecao respostaSelecao7 = new com.ufcg.sad.models.resposta.RespostaSelecao((java.lang.Long) 0L, date1, (java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<com.ufcg.sad.models.opcao.Opcao>) opcaoList5);
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList8 = respostaSelecao7.getOpcoesSelecionadas();
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList9 = respostaSelecao7.getOpcoesSelecionadas();
        org.junit.Assert.assertNotNull(opcaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(opcaoList8);
        org.junit.Assert.assertNotNull(opcaoList9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getEmail();
        usuario0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        java.util.Date date1 = questao0.getDataCriacao();
        java.util.Date date2 = questao0.getDataCriacao();
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList3 = questao0.getOpcoes();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(opcaoList3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 100L, (java.lang.Long) 0L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = new com.ufcg.sad.models.disciplina.Disciplina("");
        com.ufcg.sad.models.matricula.Matricula matricula11 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        matricula11.setDisciplina(disciplina17);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray19 = new com.ufcg.sad.models.matricula.Matricula[] { matricula11 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet20, matriculaArray19);
        com.ufcg.sad.models.aluno.Aluno aluno22 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet20);
        com.ufcg.sad.models.aluno.Aluno aluno23 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 0L, "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet20);
        disciplina2.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet20);
        // The following exception was thrown during execution in test generation
        try {
            disciplinaServiceImpl0.removerDisciplina(disciplina2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula11);
        org.junit.Assert.assertNotNull(matriculaArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.Date date1 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples6 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 0L, date1, (java.lang.Long) 0L, (java.lang.Long) 10L, (java.lang.Integer) 100, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 0L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) 100L, (java.lang.Long) 0L, opcao4, "0b7e6eb3-167c-4842-bd84-999ba574d653");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.Date date1 = null;
        com.ufcg.sad.models.opcao.Opcao opcao4 = new com.ufcg.sad.models.opcao.Opcao();
        opcao4.setNome("");
        java.lang.String str7 = opcao4.getNome();
        opcao4.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha11 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha((java.lang.Long) 100L, date1, (java.lang.Long) (-1L), (java.lang.Long) 1L, opcao4, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        respostaMultiplaEscolha11.setComentario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        com.ufcg.sad.models.opcao.Opcao opcao14 = respostaMultiplaEscolha11.getOpcaoEscolhida();
        com.ufcg.sad.models.questao.Questao questao15 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao16 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao15.setTipoQuestao(tipoQuestao16);
        boolean boolean18 = respostaMultiplaEscolha11.equals((java.lang.Object) questao15);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet25 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina26 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet25);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray27 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina26 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet28 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet28, disciplinaArray27);
        com.ufcg.sad.models.professor.Professor professor30 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet28);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet35 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina36 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet35);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray37 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina36 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet38 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38, disciplinaArray37);
        professor30.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38);
        professor30.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet49 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina50 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet49);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray51 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina50 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet52 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52, disciplinaArray51);
        com.ufcg.sad.models.professor.Professor professor54 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52);
        professor30.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52);
        com.ufcg.sad.controllers.ProfessorController professorController56 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean57 = professor30.equals((java.lang.Object) professorController56);
        questao15.setAutor(professor30);
        questao15.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(opcao14);
        org.junit.Assert.assertTrue("'" + tipoQuestao16 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.SELECAO + "'", tipoQuestao16.equals(com.ufcg.sad.models.questao.TipoQuestao.SELECAO));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(disciplinaArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(disciplinaArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(disciplinaArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        java.lang.String str1 = usuario0.getEmail();
        java.lang.String str2 = usuario0.getSenha();
        usuario0.setNome("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        java.lang.Long long5 = usuario0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray13 = new com.ufcg.sad.models.matricula.Matricula[] { matricula5 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14, matriculaArray13);
        com.ufcg.sad.models.aluno.Aluno aluno16 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet14);
        com.ufcg.sad.models.matricula.Matricula matricula19 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet24 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina25 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet24);
        matricula19.setDisciplina(disciplina25);
        com.ufcg.sad.models.matricula.Matricula matricula35 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet40 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina41 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet40);
        matricula35.setDisciplina(disciplina41);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray43 = new com.ufcg.sad.models.matricula.Matricula[] { matricula35 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet44 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet44, matriculaArray43);
        com.ufcg.sad.models.aluno.Aluno aluno46 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet44);
        aluno46.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.matricula.Matricula matricula54 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet59 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina60 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet59);
        matricula54.setDisciplina(disciplina60);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray62 = new com.ufcg.sad.models.matricula.Matricula[] { matricula54 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet63 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet63, matriculaArray62);
        com.ufcg.sad.models.aluno.Aluno aluno65 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet63);
        aluno46.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet63);
        com.ufcg.sad.models.aluno.Aluno aluno67 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) (-1L), "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet63);
        boolean boolean68 = matricula19.equals((java.lang.Object) matriculaSet63);
        aluno16.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet63);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertNotNull(matriculaArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(matricula19);
        org.junit.Assert.assertNotNull(matricula35);
        org.junit.Assert.assertNotNull(matriculaArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(matricula54);
        org.junit.Assert.assertNotNull(matriculaArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        com.ufcg.sad.controllers.ProfessorController professorController37 = new com.ufcg.sad.controllers.ProfessorController();
        boolean boolean38 = professor11.equals((java.lang.Object) professorController37);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet45 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina46 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet45);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray47 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina46 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet48 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet48, disciplinaArray47);
        com.ufcg.sad.models.professor.Professor professor50 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet48);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet55 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina56 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet55);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray57 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina56 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet58 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet58, disciplinaArray57);
        professor50.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet58);
        professor50.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long63 = professor50.getId();
        professor50.setId((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity66 = professorController37.atualizarProfessor(professor50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(disciplinaArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(disciplinaArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(long63);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        usuario0.setSenha("");
        java.lang.String str5 = usuario0.getNome();
        usuario0.setSobrenome("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
        java.lang.String str8 = usuario0.getSobrenome();
        java.lang.String str9 = usuario0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.ufcg.sad.exceptions.EntidadeInvalidaException: " + "'", str8, "com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.ufcg.sad.models.matricula.Matricula matricula0 = new com.ufcg.sad.models.matricula.Matricula();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula9 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet14);
        matricula9.setDisciplina(disciplina15);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray17 = new com.ufcg.sad.models.matricula.Matricula[] { matricula9 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet18 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18, matriculaArray17);
        com.ufcg.sad.models.aluno.Aluno aluno20 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet18);
        aluno20.setId((java.lang.Long) 100L);
        com.ufcg.sad.models.matricula.Matricula matricula28 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet33 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina34 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet33);
        matricula28.setDisciplina(disciplina34);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray36 = new com.ufcg.sad.models.matricula.Matricula[] { matricula28 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet37 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet37, matriculaArray36);
        com.ufcg.sad.models.aluno.Aluno aluno39 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "4886a34f-e994-44db-804e-76af3c234424", "hi!", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet37);
        aluno20.setMatriculas((java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet37);
        com.ufcg.sad.models.aluno.Aluno aluno41 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) (-1L), "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet37);
        // The following exception was thrown during execution in test generation
        try {
            alunoServiceImpl0.removerAluno(aluno41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula9);
        org.junit.Assert.assertNotNull(matriculaArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(matricula28);
        org.junit.Assert.assertNotNull(matriculaArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao1 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao0.setTipoQuestao(tipoQuestao1);
        questao0.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao0.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.String str7 = questao0.getEnunciado();
        java.util.List<com.ufcg.sad.models.opcao.Opcao> opcaoList8 = questao0.getOpcoes();
        org.junit.Assert.assertTrue("'" + tipoQuestao1 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.ABERTA + "'", tipoQuestao1.equals(com.ufcg.sad.models.questao.TipoQuestao.ABERTA));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str7, "4886a34f-e994-44db-804e-76af3c234424");
        org.junit.Assert.assertNull(opcaoList8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.ufcg.sad.models.usuario.Usuario usuario0 = new com.ufcg.sad.models.usuario.Usuario();
        usuario0.setNome("");
        java.lang.Long long3 = usuario0.getId();
        usuario0.setNome("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.String str6 = usuario0.getSobrenome();
        java.lang.String str7 = usuario0.getNome();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4886a34f-e994-44db-804e-76af3c234424" + "'", str7, "4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        questionario0.setDescricao("hi!");
        questionario0.setId((java.lang.Long) 10L);
        java.util.Date date7 = questionario0.getDataCriacao();
        java.lang.String str8 = questionario0.getDescricao();
        questionario0.setDescricao("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        questionario0.setDescricao("0b7e6eb3-167c-4842-bd84-999ba574d653");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        com.ufcg.sad.models.resposta.Resposta resposta11 = null;
        questionarioAplicado10.addResposta(resposta11);
        questionarioAplicado10.setSemestre("");
        questionarioAplicado10.setSemestre("506aa218-b85c-412f-a028-e1e7ce66ed2d");
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.ufcg.sad.models.usuario.Usuario usuario5 = new com.ufcg.sad.models.usuario.Usuario((java.lang.Long) 10L, "4886a34f-e994-44db-804e-76af3c234424", "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "4886a34f-e994-44db-804e-76af3c234424", "hi!");
        usuario5.setSobrenome("4886a34f-e994-44db-804e-76af3c234424");
        usuario5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.ufcg.sad.models.questao.Questao questao0 = new com.ufcg.sad.models.questao.Questao();
        questao0.setId((java.lang.Long) 100L);
        questao0.setId((java.lang.Long) 0L);
        java.lang.String str5 = questao0.getEnunciado();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet14 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina15 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet14);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray16 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina15 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet17 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet17, disciplinaArray16);
        com.ufcg.sad.models.professor.Professor professor19 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet17);
        com.ufcg.sad.models.professor.Professor professor20 = new com.ufcg.sad.models.professor.Professor("4886a34f-e994-44db-804e-76af3c234424", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet17);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet27 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina28 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet27);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray29 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina28 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet30 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet30, disciplinaArray29);
        com.ufcg.sad.models.professor.Professor professor32 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet30);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet37 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina38 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet37);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray39 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina38 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet40 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet40, disciplinaArray39);
        professor32.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet40);
        professor20.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet40);
        questao0.setAutor(professor20);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao45 = com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA;
        questao0.setTipoQuestao(tipoQuestao45);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(disciplinaArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(disciplinaArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(disciplinaArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + tipoQuestao45 + "' != '" + com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA + "'", tipoQuestao45.equals(com.ufcg.sad.models.questao.TipoQuestao.MULTIPLA_ESCOLHA));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.token.Token token2 = tokenServiceImpl0.criaToken(token1);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Token deve conter: idQuestionarioAplicado e idAluno.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        boolean boolean17 = matricula2.equals((java.lang.Object) (byte) 0);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet22 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina23 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet22);
        java.lang.Long long24 = disciplina23.getId();
        boolean boolean25 = matricula2.equals((java.lang.Object) long24);
        java.lang.Long long26 = matricula2.getId();
        java.lang.Long long27 = matricula2.getId();
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) 1L, (java.lang.Long) 0L, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
        questionarioAplicado5.setSemestre("");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.matricula.Matricula matricula11 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula14 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet19 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina20 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet19);
        matricula14.setDisciplina(disciplina20);
        disciplina20.setId((java.lang.Long) 0L);
        matricula11.setDisciplina(disciplina20);
        com.ufcg.sad.models.matricula.Matricula[] matriculaArray25 = new com.ufcg.sad.models.matricula.Matricula[] { matricula11 };
        java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula> matriculaSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.matricula.Matricula>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.matricula.Matricula>) matriculaSet26, matriculaArray25);
        com.ufcg.sad.models.aluno.Aluno aluno28 = new com.ufcg.sad.models.aluno.Aluno((java.lang.Long) 1L, "", "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet26);
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina((java.lang.Long) 1L, "4d494946-e325-4202-b6b7-ef3d0a7413a2", (java.lang.Integer) 100, (java.lang.Long) (-1L), "4d494946-e325-4202-b6b7-ef3d0a7413a2", (java.util.Set<com.ufcg.sad.models.matricula.Matricula>) matriculaSet26);
        java.lang.String str30 = disciplina29.getCodigo();
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.disciplina.Disciplina disciplina31 = disciplinaServiceImpl0.cadastrarDisciplina(disciplina29);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Id deve ser nulo para a criac?a?o de Disciplina.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matricula11);
        org.junit.Assert.assertNotNull(matricula14);
        org.junit.Assert.assertNotNull(matriculaArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.ufcg.sad.models.professor.Professor professor0 = new com.ufcg.sad.models.professor.Professor();
        professor0.setId((java.lang.Long) 0L);
        java.lang.String str3 = professor0.getNome();
        professor0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.ufcg.sad.models.opcao.Opcao opcao3 = new com.ufcg.sad.models.opcao.Opcao((java.lang.Long) (-1L), "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", "e2958841-b1e5-4423-b003-07c477cd1dc5");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet6 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina7 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet6);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray8 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina7 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9, disciplinaArray8);
        com.ufcg.sad.models.professor.Professor professor11 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet16 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina17 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet16);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray18 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19, disciplinaArray18);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet19);
        professor11.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet30 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina31 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet30);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray32 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33, disciplinaArray32);
        com.ufcg.sad.models.professor.Professor professor35 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        professor11.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet33);
        java.lang.String str37 = professor11.getNome();
        org.junit.Assert.assertNotNull(disciplinaArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(disciplinaArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(disciplinaArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date1 = null;
        questionario0.setDataUltimaEdicao(date1);
        questionario0.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor5 = questionario0.getAutor();
        com.ufcg.sad.models.questao.Questao[] questaoArray9 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList10 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList10, questaoArray9);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet18 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina19 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet18);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray20 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina19 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet21 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet21, disciplinaArray20);
        com.ufcg.sad.models.professor.Professor professor23 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet21);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet28 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina29 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet28);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray30 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina29 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet31 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31, disciplinaArray30);
        professor23.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet31);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet40 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina41 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet40);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray42 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina41 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet43 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet43, disciplinaArray42);
        com.ufcg.sad.models.professor.Professor professor45 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet43);
        professor23.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet43);
        java.util.Date date47 = null;
        java.util.Date date48 = null;
        com.ufcg.sad.models.questionario.Questionario questionario49 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList10, professor23, date47, date48);
        questionario0.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList10);
        com.ufcg.sad.models.questionario.Questionario questionario51 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date52 = null;
        questionario51.setDataUltimaEdicao(date52);
        questionario51.setDescricao("hi!");
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList56 = questionario51.getQuestoes();
        questionario0.setQuestoes(questaoList56);
        org.junit.Assert.assertNull(professor5);
        org.junit.Assert.assertNotNull(questaoArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(disciplinaArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(disciplinaArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(disciplinaArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(questaoList56);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.ufcg.sad.models.matricula.Matricula matricula2 = com.ufcg.sad.models.util.Utils.createMatriculaTest("4886a34f-e994-44db-804e-76af3c234424", "");
        com.ufcg.sad.models.matricula.Matricula matricula5 = com.ufcg.sad.models.util.Utils.createMatriculaTest("", "");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet10 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina11 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet10);
        matricula5.setDisciplina(disciplina11);
        disciplina11.setId((java.lang.Long) 0L);
        matricula2.setDisciplina(disciplina11);
        boolean boolean17 = matricula2.equals((java.lang.Object) (byte) 0);
        com.ufcg.sad.models.aluno.Aluno aluno18 = matricula2.getAluno();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet25 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina26 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet25);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray27 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina26 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet28 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet28, disciplinaArray27);
        com.ufcg.sad.models.professor.Professor professor30 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet28);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet35 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina36 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet35);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray37 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina36 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet38 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38, disciplinaArray37);
        professor30.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38);
        professor30.setSiape("4886a34f-e994-44db-804e-76af3c234424");
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet49 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina50 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet49);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray51 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina50 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet52 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52, disciplinaArray51);
        com.ufcg.sad.models.professor.Professor professor54 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52);
        professor30.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet52);
        professor30.setSiape("");
        java.lang.String str58 = professor30.getSiape();
        boolean boolean59 = aluno18.equals((java.lang.Object) professor30);
        org.junit.Assert.assertNotNull(matricula2);
        org.junit.Assert.assertNotNull(matricula5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(aluno18);
        org.junit.Assert.assertNotNull(disciplinaArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(disciplinaArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(disciplinaArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.ufcg.sad.models.opcao.Opcao opcao3 = new com.ufcg.sad.models.opcao.Opcao((java.lang.Long) (-1L), "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
        com.ufcg.sad.models.questionario.Questionario questionario4 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date5 = null;
        questionario4.setDataUltimaEdicao(date5);
        questionario4.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor9 = questionario4.getAutor();
        java.lang.String str10 = questionario4.getNome();
        boolean boolean11 = opcao3.equals((java.lang.Object) questionario4);
        opcao3.setDescricao("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        org.junit.Assert.assertNull(professor9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        com.ufcg.sad.models.questao.Questao[] questaoArray4 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList5 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList5, questaoArray4);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet13 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina14 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet13);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray15 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina14 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet16 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet16, disciplinaArray15);
        com.ufcg.sad.models.professor.Professor professor18 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet16);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet23 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina24 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet23);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray25 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina24 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26, disciplinaArray25);
        professor18.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet26);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet35 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina36 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet35);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray37 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina36 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet38 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38, disciplinaArray37);
        com.ufcg.sad.models.professor.Professor professor40 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38);
        professor18.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet38);
        java.util.Date date42 = null;
        java.util.Date date43 = null;
        com.ufcg.sad.models.questionario.Questionario questionario44 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList5, professor18, date42, date43);
        questionario44.setDescricao("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        com.ufcg.sad.models.questionario.Questionario questionario47 = new com.ufcg.sad.models.questionario.Questionario();
        java.util.Date date48 = null;
        questionario47.setDataUltimaEdicao(date48);
        questionario47.setDescricao("hi!");
        com.ufcg.sad.models.professor.Professor professor52 = questionario47.getAutor();
        com.ufcg.sad.models.questao.Questao[] questaoArray56 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList57 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList57, questaoArray56);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet65 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina66 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet65);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray67 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina66 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet68 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet68, disciplinaArray67);
        com.ufcg.sad.models.professor.Professor professor70 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet68);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet75 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina76 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet75);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray77 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina76 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet78 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet78, disciplinaArray77);
        professor70.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet78);
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet87 = null;
        com.ufcg.sad.models.disciplina.Disciplina disciplina88 = new com.ufcg.sad.models.disciplina.Disciplina("", (java.lang.Integer) 10, (java.lang.Long) (-1L), "", matriculaSet87);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray89 = new com.ufcg.sad.models.disciplina.Disciplina[] { disciplina88 };
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet90 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet90, disciplinaArray89);
        com.ufcg.sad.models.professor.Professor professor92 = new com.ufcg.sad.models.professor.Professor("hi!", "hi!", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet90);
        professor70.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet90);
        java.util.Date date94 = null;
        java.util.Date date95 = null;
        com.ufcg.sad.models.questionario.Questionario questionario96 = new com.ufcg.sad.models.questionario.Questionario((java.lang.Long) (-1L), "com.ufcg.sad.exceptions.EntidadeInvalidaException: ", "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList57, professor70, date94, date95);
        questionario47.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList57);
        questionario44.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList57);
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.questionario.Questionario questionario99 = questionarioServiceImpl0.atualizaQuestionario(questionario44);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Questiona?rio na?o pode ser vazio.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(questaoArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(disciplinaArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(disciplinaArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(disciplinaArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(professor52);
        org.junit.Assert.assertNotNull(questaoArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(disciplinaArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(disciplinaArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(disciplinaArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        java.util.Date date2 = null;
        com.ufcg.sad.models.resposta.RespostaEscolhaSimples respostaEscolhaSimples7 = new com.ufcg.sad.models.resposta.RespostaEscolhaSimples((java.lang.Long) 100L, date2, (java.lang.Long) 100L, (java.lang.Long) 1L, (java.lang.Integer) (-1), "hi!");
        respostaEscolhaSimples7.setId((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.ufcg.sad.models.resposta.Resposta resposta10 = respostaServiceImpl0.criarResposta((com.ufcg.sad.models.resposta.Resposta) respostaEscolhaSimples7);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.ParametroInvalidoException; message: Id deve ser nulo para a criac?a?o de resposta.");
        } catch (com.ufcg.sad.exceptions.ParametroInvalidoException e) {
        // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.ufcg.sad.models.resposta.Resposta[] respostaArray4 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet5 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, respostaArray4);
        com.ufcg.sad.models.token.Token[] tokenArray7 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet8 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet8, tokenArray7);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado10 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet5, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet8);
        java.lang.Integer int11 = questionarioAplicado10.getTurma();
        com.ufcg.sad.models.resposta.Resposta resposta12 = null;
        questionarioAplicado10.addResposta(resposta12);
        questionarioAplicado10.setTurma((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(respostaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.ufcg.sad.models.disciplina.Disciplina disciplina1 = new com.ufcg.sad.models.disciplina.Disciplina("0b7e6eb3-167c-4842-bd84-999ba574d653");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            tokenServiceImpl0.validaToken(token2);
            org.junit.Assert.fail("Expected exception of type com.ufcg.sad.exceptions.EntidadeInvalidaException; message: Token deve conter: idQuestionarioAplicado e idAluno.");
        } catch (com.ufcg.sad.exceptions.EntidadeInvalidaException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.ufcg.sad.services.questionario.QuestionarioAplicadoServiceImpl questionarioAplicadoServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioAplicadoServiceImpl();
    }
}
