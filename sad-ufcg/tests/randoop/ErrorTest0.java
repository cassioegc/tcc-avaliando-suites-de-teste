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
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado>> questionarioAplicadoListResponseEntity1 = questionarioAplicadoController0.getTodosQuestionariosAplicados();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) 0L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) 100L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) 1L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.getDisciplina((java.lang.Long) 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.token.Token> tokenList1 = tokenServiceImpl0.deletaTodosOsTokenAtivos();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) 10L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.getAluno((java.lang.Long) 1L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity1 = alunoController0.getTodosOsAlunos();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.professor.Professor> professorList1 = professorServiceImpl0.getTodosOsProfessores();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.disciplina.Disciplina> disciplinaList1 = disciplinaServiceImpl0.listarTodasAsDisciplinas();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = tokenServiceImpl0.buscarDisciplina("");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token2 = tokenServiceImpl0.verificaSeTokenExiste("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) 10L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        questionarioAplicado11.setDisciplina("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.disciplina.Disciplina>> disciplinaListResponseEntity1 = disciplinaController0.getAll();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.getProfessor((java.lang.Long) (-1L));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token2 = tokenServiceImpl0.verificaSeTokenExiste("");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) (-1L));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.procurarPorEmail("");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token2 = tokenServiceImpl0.verificaSeTokenExiste("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.getDisciplina((java.lang.Long) 0L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) 1L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.procurarPorEmail("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.getProfessor((java.lang.Long) 0L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = tokenServiceImpl0.buscarDisciplina("hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        questionarioAplicado11.setDisciplina("hi!");
        com.ufcg.sad.models.token.Token token17 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token17.setId("");
        com.ufcg.sad.models.token.Token token22 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long23 = token22.getIdQuestionarioAplicado();
        boolean boolean24 = token17.equals((java.lang.Object) token22);
        questionarioAplicado11.removeToken(token22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.procurarProfessorPeloSiape("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) 0L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity2 = disciplinaController0.getAlunosMatriculados((java.lang.Long) 1L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList1 = alunoServiceImpl0.getTodosOsAlunos();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList1 = questaoServiceImpl0.getTodasQuestoes();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.getAluno((java.lang.Long) 10L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.questao.Questao>> questaoListResponseEntity1 = questaoController0.getTodasQuestoes();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.token.Token> tokenList1 = tokenServiceImpl0.deletaTodosOsTokenAtivos();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) 1L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.getAluno((java.lang.Long) 0L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.getAluno((java.lang.Long) 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) 1L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token3.setId("");
        com.ufcg.sad.models.token.Token token8 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long9 = token8.getIdQuestionarioAplicado();
        boolean boolean10 = token3.equals((java.lang.Object) token8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token11 = tokenServiceImpl0.criaToken(token3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.Questionario> questionarioList1 = questionarioServiceImpl0.getTodosQuestionarios();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.procurarProfessorPeloSiape("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 10L, "", (java.lang.Long) 100L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = new com.ufcg.sad.models.disciplina.Disciplina("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        disciplinaServiceImpl0.removerDisciplina(disciplina2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado16 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado11, "", (java.lang.Integer) 255, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.getAluno((java.lang.Long) 100L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token2 = tokenServiceImpl0.verificaSeTokenExiste("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) 100L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.getDisciplina((java.lang.Long) 10L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token3.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token6 = tokenServiceImpl0.criaToken(token3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 10L, "", (java.lang.Long) 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.resposta.Resposta resposta2 = respostaServiceImpl0.getResposta((java.lang.Long) 0L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.getQuestao((java.lang.Long) 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        com.ufcg.sad.models.token.Token token14 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L);
        questionarioAplicado11.addToken(token14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 = tokenController0.criaToken(token14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.getDisciplina((java.lang.Long) 100L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        questionarioAplicado11.setDisciplina("hi!");
        com.ufcg.sad.models.token.Token token17 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token17.setId("");
        com.ufcg.sad.models.token.Token token22 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long23 = token22.getIdQuestionarioAplicado();
        boolean boolean24 = token17.equals((java.lang.Object) token22);
        questionarioAplicado11.removeToken(token22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token26 = tokenServiceImpl0.criaToken(token22);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.lang.Long) 10L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token4 = tokenServiceImpl0.criaToken(token3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList1 = questaoServiceImpl0.getTodasQuestoes();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.resposta.Resposta resposta2 = respostaServiceImpl0.getResposta((java.lang.Long) 100L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = questionarioServiceImpl0.getQuestionario((java.lang.Long) 1L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 10L, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.lang.Long) 100L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        java.lang.Integer int12 = questionarioAplicado11.getTurma();
        questionarioAplicado11.setDisciplina("hi!");
        com.ufcg.sad.models.token.Token token17 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token17.setId("");
        com.ufcg.sad.models.token.Token token22 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long23 = token22.getIdQuestionarioAplicado();
        boolean boolean24 = token17.equals((java.lang.Object) token22);
        questionarioAplicado11.removeToken(token22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 = tokenController0.criaToken(token22);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) (-1L));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.questionario.Questionario>> questionarioListResponseEntity1 = questionarioController0.getTodosQuestionarios();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = tokenServiceImpl0.buscarDisciplina("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.disciplina.Disciplina> disciplinaList1 = disciplinaServiceImpl0.listarTodasAsDisciplinas();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = questionarioServiceImpl0.getQuestionario((java.lang.Long) 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) 10L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.procurarPorEmail("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.getProfessor((java.lang.Long) 1L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 0L, "4d494946-e325-4202-b6b7-ef3d0a7413a2", (java.lang.Long) 0L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 0L, "86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.lang.Long) 1L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 1L, "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.lang.Long) 0L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("506aa218-b85c-412f-a028-e1e7ce66ed2d", (java.lang.Long) 1L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) 100L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList1 = alunoServiceImpl0.getTodosOsAlunos();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = tokenController0.criaToken(token3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.getQuestao((java.lang.Long) 100L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        java.lang.String str4 = token3.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 = tokenController0.criaToken(token3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("506aa218-b85c-412f-a028-e1e7ce66ed2d");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.professor.Professor professor1 = new com.ufcg.sad.models.professor.Professor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.criarProfessor(professor1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.professor.Professor> professorList1 = professorServiceImpl0.getTodosOsProfessores();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("4d494946-e325-4202-b6b7-ef3d0a7413a2");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = questionarioServiceImpl0.getQuestionario((java.lang.Long) 10L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.professor.Professor>> professorListResponseEntity1 = professorController0.getTodosOsProfessores();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.procurarProfessorPeloSiape("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = enviarQuestionarioController0.enviarEmailParaUmQuestionario((java.lang.Long) 1L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity2 = disciplinaController0.getAlunosMatriculados((java.lang.Long) 10L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 10L, "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.lang.Long) 1L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 100L, 1L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token[] tokenArray8 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet9 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet9, tokenArray8);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado11 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet9);
        questionarioAplicado11.setId((java.lang.Long) 100L);
        java.lang.Long long14 = questionarioAplicado11.getIdProfessor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.getAluno((java.lang.Long) 10L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) (-1L));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("4d494946-e325-4202-b6b7-ef3d0a7413a2", (java.lang.Long) 10L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.resposta.Resposta resposta2 = respostaServiceImpl0.getResposta((java.lang.Long) 1L);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) 0L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) 10L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity2 = disciplinaController0.getAlunosMatriculados((java.lang.Long) (-1L));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.getQuestao((java.lang.Long) (-1L));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.getDisciplina((java.lang.Long) 10L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.procurarPorEmail("hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("0ff74fdf-f04c-407c-be15-11a0b27a7d88");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.procurarPorEmail("hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 10L, "2b1c88f1-aadb-44fa-af13-4368c48e1ef4", (java.lang.Long) 0L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = tokenServiceImpl0.buscarDisciplina("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) 1L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 0L, "32684167-a58b-4266-95f2-2d889347db1d", (java.lang.Long) 1L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("a69fc0cb-b307-4ddb-aea9-5f213a61b4b2");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 0L, "8d5f6ea8-6ec6-4810-bc12-45045d0b7805", (java.lang.Long) 10L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.getQuestao((java.lang.Long) (-1L));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.resposta.Resposta resposta2 = respostaServiceImpl0.getResposta((java.lang.Long) 10L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.professor.Professor professor1 = new com.ufcg.sad.models.professor.Professor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.atualizarProfessor(professor1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) (-1L), "2b1c88f1-aadb-44fa-af13-4368c48e1ef4", (java.lang.Long) (-1L));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token3.setId("");
        com.ufcg.sad.models.token.Token token8 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long9 = token8.getIdQuestionarioAplicado();
        boolean boolean10 = token3.equals((java.lang.Object) token8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 = tokenController0.criaToken(token3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) (-1L));
        token3.setId("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.validaToken(token3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("4d494946-e325-4202-b6b7-ef3d0a7413a2", (java.lang.Long) 10L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("2b1c88f1-aadb-44fa-af13-4368c48e1ef4", (java.lang.Long) 100L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao2 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao1.setTipoQuestao(tipoQuestao2);
        questao1.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao1.setComentario("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questao.Questao questao8 = questaoServiceImpl0.atualizaQuestao(questao1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("2b1c88f1-aadb-44fa-af13-4368c48e1ef4", (java.lang.Long) 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token3.setId("");
        com.ufcg.sad.models.token.Token token8 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long9 = token8.getIdQuestionarioAplicado();
        boolean boolean10 = token3.equals((java.lang.Object) token8);
        token3.setIdAluno((java.lang.Long) (-1L));
        token3.setIdAluno((java.lang.Long) 100L);
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl15 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        boolean boolean16 = token3.equals((java.lang.Object) alunoServiceImpl15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token17 = tokenServiceImpl0.criaToken(token3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 100L, "", (java.lang.Long) 0L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2", (java.lang.Long) 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.getAluno((java.lang.Long) (-1L));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("", (java.lang.Long) 0L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("0ff74fdf-f04c-407c-be15-11a0b27a7d88");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) 0L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token2.setId("");
        com.ufcg.sad.models.token.Token token7 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long8 = token7.getIdQuestionarioAplicado();
        boolean boolean9 = token2.equals((java.lang.Object) token7);
        token2.setIdAluno((java.lang.Long) (-1L));
        token2.setIdAluno((java.lang.Long) 100L);
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl14 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        boolean boolean15 = token2.equals((java.lang.Object) alunoServiceImpl14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList16 = alunoServiceImpl14.getTodosOsAlunos();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = tokenServiceImpl0.buscarDisciplina("0ff74fdf-f04c-407c-be15-11a0b27a7d88");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) (-1L));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("4886a34f-e994-44db-804e-76af3c234424", (java.lang.Long) (-1L));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        java.util.Date date2 = questao1.getDataCriacao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questaoController0.criaQuestao(questao1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token2 = tokenServiceImpl0.verificaSeTokenExiste("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("32684167-a58b-4266-95f2-2d889347db1d");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.procurarProfessorPeloSiape("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("562dc7a4-935c-4ec1-a22d-2af9d83af33a", (java.lang.Long) 1L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 100L, "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.lang.Long) 1L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = tokenServiceImpl0.buscarDisciplina("");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao2 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao1.setTipoQuestao(tipoQuestao2);
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao4 = questao1.getTipoQuestao();
        questao1.setComentario("4886a34f-e994-44db-804e-76af3c234424");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = questaoController0.criaQuestao(questao1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao2 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao1.setTipoQuestao(tipoQuestao2);
        questao1.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao1.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        java.lang.String str8 = questao1.getEnunciado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questao.Questao questao9 = questaoServiceImpl0.atualizaQuestao(questao1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("506aa218-b85c-412f-a028-e1e7ce66ed2d");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado6 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) 0L, (java.lang.Long) 0L, "4886a34f-e994-44db-804e-76af3c234424");
        java.lang.Long long7 = questionarioAplicado6.getIdDisciplina();
        java.lang.String str8 = questionarioAplicado6.getDisciplina();
        java.lang.Integer int9 = questionarioAplicado6.getTurma();
        java.lang.Integer int10 = questionarioAplicado6.getTurma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity2 = disciplinaController0.getAlunosMatriculados((java.lang.Long) 0L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.ufcg.sad.services.MatriculaServiceImpl matriculaServiceImpl0 = new com.ufcg.sad.services.MatriculaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.aluno.Aluno> alunoList2 = matriculaServiceImpl0.getAlunosMatriculados((java.lang.Long) 10L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.getProfessor((java.lang.Long) 10L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = enviarQuestionarioController0.enviarEmailParaUmQuestionario((java.lang.Long) (-1L));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.procurarProfessorPeloSiape("86ef003a-89e2-41f8-af23-5f9a2e5b6cb2");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.resposta.Resposta resposta2 = respostaServiceImpl0.getResposta((java.lang.Long) (-1L));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("562dc7a4-935c-4ec1-a22d-2af9d83af33a");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = tokenServiceImpl0.buscarDisciplina("506aa218-b85c-412f-a028-e1e7ce66ed2d");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token2 = tokenServiceImpl0.verificaSeTokenExiste("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao2 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao1.setTipoQuestao(tipoQuestao2);
        questao1.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao1.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        questao1.setComentario("32684167-a58b-4266-95f2-2d889347db1d");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 = questaoController0.atualizaQuestao(questao1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) 100L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("2b1c88f1-aadb-44fa-af13-4368c48e1ef4", (java.lang.Long) 1L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.ufcg.sad.services.questao.QuestaoServiceImpl questaoServiceImpl0 = new com.ufcg.sad.services.questao.QuestaoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questao.Questao questao2 = questaoServiceImpl0.getQuestao((java.lang.Long) 1L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.getDisciplina((java.lang.Long) 1L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token3.setId("");
        com.ufcg.sad.models.token.Token token8 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long9 = token8.getIdQuestionarioAplicado();
        boolean boolean10 = token3.equals((java.lang.Object) token8);
        token3.setIdAluno((java.lang.Long) (-1L));
        token3.setIdAluno((java.lang.Long) 100L);
        java.lang.Long long15 = token3.getIdAluno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token16 = tokenServiceImpl0.criaToken(token3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("4886a34f-e994-44db-804e-76af3c234424");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("8d5f6ea8-6ec6-4810-bc12-45045d0b7805");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado2 = tokenServiceImpl0.buscarQuestionarioAplicado("506aa218-b85c-412f-a028-e1e7ce66ed2d");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioController0.getQuestionario((java.lang.Long) 10L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = enviarQuestionarioController0.enviarEmailParaUmQuestionario((java.lang.Long) 10L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token3.setId("");
        com.ufcg.sad.models.token.Token token8 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long9 = token8.getIdQuestionarioAplicado();
        boolean boolean10 = token3.equals((java.lang.Object) token8);
        java.lang.Long long11 = token8.getIdQuestionarioAplicado();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token12 = tokenServiceImpl0.criaToken(token8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) (-1L));
        token3.setIdQuestionarioAplicado((java.lang.Long) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.token.Token token6 = tokenServiceImpl0.criaToken(token3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token2.setId("");
        com.ufcg.sad.models.token.Token token7 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long8 = token7.getIdQuestionarioAplicado();
        boolean boolean9 = token2.equals((java.lang.Object) token7);
        token2.setIdAluno((java.lang.Long) (-1L));
        token2.setIdAluno((java.lang.Long) 100L);
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl14 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        boolean boolean15 = token2.equals((java.lang.Object) alunoServiceImpl14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno17 = alunoServiceImpl14.getAluno((java.lang.Long) 10L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("", (java.lang.Long) 1L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 1L, (java.lang.Long) 100L);
        token2.setId("");
        com.ufcg.sad.models.token.Token token7 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long8 = token7.getIdQuestionarioAplicado();
        boolean boolean9 = token2.equals((java.lang.Object) token7);
        token2.setIdAluno((java.lang.Long) (-1L));
        token2.setIdAluno((java.lang.Long) 100L);
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl14 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        boolean boolean15 = token2.equals((java.lang.Object) alunoServiceImpl14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno17 = alunoServiceImpl14.procurarPorEmail("");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        tokenServiceImpl0.deletaToken("hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.ufcg.sad.services.token.TokenServiceImpl tokenServiceImpl0 = new com.ufcg.sad.services.token.TokenServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.questionario.Questionario questionario2 = tokenServiceImpl0.buscarQuestionario("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado> questionarioAplicadoList4 = questionarioServiceImpl0.getQuestionariosAplicados((java.lang.Long) 100L, "a69fc0cb-b307-4ddb-aea9-5f213a61b4b2", (java.lang.Long) (-1L));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.procurarProfessorPeloSiape("hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray13 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet14, respostaArray13);
        com.ufcg.sad.models.token.Token[] tokenArray16 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet17 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet17, tokenArray16);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado19 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet14, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet17);
        com.ufcg.sad.models.token.Token token22 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long23 = token22.getIdQuestionarioAplicado();
        com.ufcg.sad.models.token.Token[] tokenArray24 = new com.ufcg.sad.models.token.Token[] { token22 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet25 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet25, tokenArray24);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado27 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet14, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet25);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray36 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet37 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet37, respostaArray36);
        com.ufcg.sad.models.token.Token[] tokenArray39 = new com.ufcg.sad.models.token.Token[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet40 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet40, tokenArray39);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado42 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet37, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet40);
        com.ufcg.sad.models.token.Token token45 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long46 = token45.getIdQuestionarioAplicado();
        com.ufcg.sad.models.token.Token[] tokenArray47 = new com.ufcg.sad.models.token.Token[] { token45 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet48 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet48, tokenArray47);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado50 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Long) 10L, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet37, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet48);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado51 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 0L, (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet14, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity52 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado51);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.disciplina.Disciplina> disciplinaList3 = questionarioServiceImpl0.getDisciplinas((java.lang.Long) 100L, "506aa218-b85c-412f-a028-e1e7ce66ed2d");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.ufcg.sad.services.aluno.AlunoServiceImpl alunoServiceImpl0 = new com.ufcg.sad.services.aluno.AlunoServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.aluno.Aluno aluno2 = alunoServiceImpl0.procurarPorEmail("com.ufcg.sad.exceptions.EntidadeNotFoundException: hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao2 = com.ufcg.sad.models.questao.TipoQuestao.ABERTA;
        questao1.setTipoQuestao(tipoQuestao2);
        questao1.setEnunciado("4d494946-e325-4202-b6b7-ef3d0a7413a2");
        questao1.setEnunciado("4886a34f-e994-44db-804e-76af3c234424");
        com.ufcg.sad.models.questao.Questao questao8 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.questao.TipoQuestao tipoQuestao9 = com.ufcg.sad.models.questao.TipoQuestao.SELECAO;
        questao8.setTipoQuestao(tipoQuestao9);
        questao1.setTipoQuestao(tipoQuestao9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 = questaoController0.atualizaQuestao(questao1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.ufcg.sad.services.professor.ProfessorServiceImpl professorServiceImpl0 = new com.ufcg.sad.services.professor.ProfessorServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.professor.Professor professor2 = professorServiceImpl0.procurarProfessorPeloSiape("com.ufcg.sad.exceptions.EntidadeInvalidaException: ");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.ufcg.sad.services.questionario.QuestionarioServiceImpl questionarioServiceImpl0 = new com.ufcg.sad.services.questionario.QuestionarioServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.questionario.Questionario> questionarioList1 = questionarioServiceImpl0.getTodosQuestionarios();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.ufcg.sad.services.resposta.RespostaServiceImpl respostaServiceImpl0 = new com.ufcg.sad.services.resposta.RespostaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.ufcg.sad.models.resposta.Resposta> respostaList3 = respostaServiceImpl0.getTodasAsRespostas("4886a34f-e994-44db-804e-76af3c234424", (java.lang.Long) 10L);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("5de391a2-d066-4040-9d07-80b3dc5fa5a9", (java.lang.Long) 10L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("0b7e6eb3-167c-4842-bd84-999ba574d653");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.ufcg.sad.services.disciplina.DisciplinaServiceImpl disciplinaServiceImpl0 = new com.ufcg.sad.services.disciplina.DisciplinaServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.ufcg.sad.models.disciplina.Disciplina disciplina2 = disciplinaServiceImpl0.getDisciplina((java.lang.Long) 100L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("2b1c88f1-aadb-44fa-af13-4368c48e1ef4");
    }
}

