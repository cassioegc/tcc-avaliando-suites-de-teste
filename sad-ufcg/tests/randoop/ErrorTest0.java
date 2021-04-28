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
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) 10L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) 1L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.disciplina.Disciplina>> disciplinaListResponseEntity1 = disciplinaController0.getAll();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray3 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet4 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4, disciplinaArray3);
        com.ufcg.sad.models.professor.Professor professor6 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = professorController0.atualizarProfessor(professor6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity2 = disciplinaController0.getAlunosMatriculados((java.lang.Long) 10L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) (-1L));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token token10 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray11 = new com.ufcg.sad.models.token.Token[] { token10 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet12 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet12, tokenArray11);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado14 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet12);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet15 = questionarioAplicado14.getRespostas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioController0.getQuestionario((java.lang.Long) 0L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) 1L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = tokenController0.criaToken(token2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token token10 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray11 = new com.ufcg.sad.models.token.Token[] { token10 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet12 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet12, tokenArray11);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado14 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet12);
        questionarioAplicado14.setIdProfessor((java.lang.Long) 1L);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet17 = questionarioAplicado14.getRespostas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 1L, "", (java.lang.Long) (-1L));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) 0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.questao.Questao>> questaoListResponseEntity1 = questaoController0.getTodasQuestoes();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity1 = alunoController0.getTodosOsAlunos();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.questionario.Questionario>> questionarioListResponseEntity1 = questionarioController0.getTodosQuestionarios();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 = questionarioAplicadoController6.getQuestionarioAplicado((java.lang.Long) 100L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        token3.setIdQuestionarioAplicado((java.lang.Long) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 = tokenController0.criaToken(token3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado1 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado1, "", (java.lang.Integer) 1, "");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado9 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado5, "", (java.lang.Integer) 0, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity2 = disciplinaController0.getAlunosMatriculados((java.lang.Long) (-1L));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) 0L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) 10L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str2 = questionario1.getDescricao();
        java.util.Date date3 = questionario1.getDataCriacao();
        java.lang.String str4 = questionario1.getDescricao();
        java.lang.Long long5 = questionario1.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList6 = questionario1.getQuestoes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray2 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList3 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList3, questaoArray2);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList3);
        java.lang.Long long6 = questionario1.getId();
        com.ufcg.sad.models.professor.Professor professor7 = questionario1.getAutor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("111b4856-4fdf-442c-b462-ed7ac75fcbb9");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("111b4856-4fdf-442c-b462-ed7ac75fcbb9");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado1 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado1, "", (java.lang.Integer) 1, "");
        java.lang.String str6 = questionarioAplicado5.getSemestre();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str2 = questionario1.getDescricao();
        java.util.Date date3 = questionario1.getDataCriacao();
        java.lang.String str4 = questionario1.getDescricao();
        java.lang.Long long5 = questionario1.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = enviarQuestionarioController0.enviarEmailParaUmQuestionario((java.lang.Long) (-1L));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray2 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList3 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList3, questaoArray2);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList3);
        questionario1.setId((java.lang.Long) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) (-1L));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 1L, "2017.2", (java.lang.Long) 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("863eb965-40bb-4f07-88b4-8c62ef17adaa");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token1 = new com.ufcg.sad.models.token.Token();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.criaToken(token1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("111b4856-4fdf-442c-b462-ed7ac75fcbb9", "");
        com.ufcg.sad.models.disciplina.Disciplina disciplina4 = matricula3.getDisciplina();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 = disciplinaController0.cadastrarDisciplina(disciplina4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.getAluno((java.lang.Long) (-1L));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.professor.Professor>> professorListResponseEntity1 = professorController0.getTodosOsProfessores();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        com.ufcg.sad.models.aluno.Aluno aluno1 = new com.ufcg.sad.models.aluno.Aluno();
        java.lang.String str2 = aluno1.getSobrenome();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = alunoController0.criarAluno(aluno1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str2 = questionario1.getDescricao();
        java.util.Date date3 = questionario1.getDataCriacao();
        java.lang.String str4 = questionario1.getDescricao();
        java.lang.Long long5 = questionario1.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList6 = questionario1.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController7 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean8 = questionario1.equals((java.lang.Object) questionarioAplicadoController7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("2017.2");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado>> questionarioAplicadoListResponseEntity8 = questionarioAplicadoController6.getTodosQuestionariosAplicados();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.getAluno((java.lang.Long) 10L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("cde6b885-0069-445b-83e0-a544d75171b9");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 100L);
        token2.setIdQuestionarioAplicado((java.lang.Long) 0L);
        java.lang.String str5 = token2.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 = tokenController0.criaToken(token2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray2 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList3 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList3, questaoArray2);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList3);
        java.util.Date date6 = questionario1.getDataCriacao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray3 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet4 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4, disciplinaArray3);
        com.ufcg.sad.models.professor.Professor professor6 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4);
        professor6.setNome("");
        professor6.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray13 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14, disciplinaArray13);
        com.ufcg.sad.models.professor.Professor professor16 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14);
        professor6.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 = professorController0.atualizarProfessor(professor6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token token10 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray11 = new com.ufcg.sad.models.token.Token[] { token10 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet12 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet12, tokenArray11);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado14 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet12);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet15 = questionarioAplicado14.getRespostas();
        questionarioAplicado14.setIdProfessor((java.lang.Long) 100L);
        questionarioAplicado14.setIdProfessor((java.lang.Long) (-1L));
        java.lang.Long long20 = questionarioAplicado14.getIdProfessor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.getAluno((java.lang.Long) 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado1 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        java.lang.Long long2 = questionarioAplicado1.getIdProfessor();
        questionarioAplicado1.setSemestre("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray3 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet4 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4, disciplinaArray3);
        com.ufcg.sad.models.professor.Professor professor6 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = professorController0.criarProfessor(professor6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("com.ufcg.sad.exceptions.EntidadeNotFoundException");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("2017.2");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questaoController0.getQuestionario((java.lang.Long) 100L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("2017.2");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) 10L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray3 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet4 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4, disciplinaArray3);
        com.ufcg.sad.models.professor.Professor professor6 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4);
        professor6.setNome("");
        professor6.setNome("");
        java.lang.String str11 = professor6.getSiape();
        java.lang.Long long12 = professor6.getId();
        com.ufcg.sad.models.matricula.Matricula matricula15 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina16 = matricula15.getDisciplina();
        java.util.Set<com.ufcg.sad.models.matricula.Matricula> matriculaSet17 = disciplina16.getMatriculas();
        professor6.addDisciplina(disciplina16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 = disciplinaController0.cadastrarDisciplina(disciplina16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray3 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet4 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4, disciplinaArray3);
        com.ufcg.sad.models.professor.Professor professor6 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4);
        professor6.setNome("");
        professor6.setNome("");
        java.lang.String str11 = professor6.getSiape();
        java.lang.Long long12 = professor6.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 = professorController0.criarProfessor(professor6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token token10 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray11 = new com.ufcg.sad.models.token.Token[] { token10 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet12 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet12, tokenArray11);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado14 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet12);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet15 = questionarioAplicado14.getRespostas();
        questionarioAplicado14.setIdProfessor((java.lang.Long) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) (-1L));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) 100L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("com.ufcg.sad.exceptions.EntidadeNotFoundException");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) 0L, (java.lang.Long) 10L, (java.lang.Long) (-1L), "cde6b885-0069-445b-83e0-a544d75171b9");
        com.ufcg.sad.models.token.Token token6 = new com.ufcg.sad.models.token.Token();
        token6.setIdAluno((java.lang.Long) 10L);
        token6.setIdAluno((java.lang.Long) 1L);
        java.lang.Long long11 = token6.getIdAluno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        questionarioAplicado5.removeToken(token6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) 100L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioController0.getQuestionario((java.lang.Long) (-1L));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) 10L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray5 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, respostaArray5);
        com.ufcg.sad.models.token.Token token10 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray11 = new com.ufcg.sad.models.token.Token[] { token10 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet12 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet12, tokenArray11);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado14 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet6, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet12);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray19 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet20 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet20, respostaArray19);
        com.ufcg.sad.models.token.Token token24 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray25 = new com.ufcg.sad.models.token.Token[] { token24 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet26, tokenArray25);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado28 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet20, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet26);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet29 = questionarioAplicado28.getRespostas();
        questionarioAplicado28.setIdProfessor((java.lang.Long) 100L);
        java.util.Set<com.ufcg.sad.models.token.Token> tokenSet32 = questionarioAplicado28.getTokens();
        questionarioAplicado14.setTokens(tokenSet32);
        java.lang.Integer int34 = questionarioAplicado14.getTurma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity35 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 1L, "111b4856-4fdf-442c-b462-ed7ac75fcbb9", (java.lang.Long) 100L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado1 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado5 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado1, "", (java.lang.Integer) 1, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("", (java.lang.Long) 1L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, (-1L), 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray2 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList3 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList3, questaoArray2);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList3);
        java.util.Date date6 = questionario1.getDataCriacao();
        questionario1.setNome("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 = questionarioController0.criaQuestionario(questionario1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) (-1L));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.questionario.QuestionarioAplicado>> questionarioAplicadoListResponseEntity1 = questionarioAplicadoController0.getTodosQuestionariosAplicados();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray12 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet13 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet13, respostaArray12);
        com.ufcg.sad.models.token.Token token17 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray18 = new com.ufcg.sad.models.token.Token[] { token17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet19, tokenArray18);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado21 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet13, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet19);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray26 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet27 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet27, respostaArray26);
        com.ufcg.sad.models.token.Token token31 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray32 = new com.ufcg.sad.models.token.Token[] { token31 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet33 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet33, tokenArray32);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado35 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet27, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet33);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet36 = questionarioAplicado35.getRespostas();
        questionarioAplicado35.setIdProfessor((java.lang.Long) 100L);
        java.util.Set<com.ufcg.sad.models.token.Token> tokenSet39 = questionarioAplicado35.getTokens();
        questionarioAplicado21.setTokens(tokenSet39);
        java.lang.Integer int41 = questionarioAplicado21.getTurma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity42 = questionarioAplicadoController6.atualizaQuestionarioAplicado(questionarioAplicado21);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("com.ufcg.sad.exceptions.ParametroInvalidoException: ");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) (-1L), "2017.2", (java.lang.Long) 100L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str2 = questionario1.getDescricao();
        java.util.Date date3 = questionario1.getDataCriacao();
        java.lang.String str4 = questionario1.getDescricao();
        java.lang.Long long5 = questionario1.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList6 = questionario1.getQuestoes();
        com.ufcg.sad.models.questionario.Questionario questionario7 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray8 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList9 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList9, questaoArray8);
        questionario7.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList9);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList9);
        questionario1.setNome("cde6b885-0069-445b-83e0-a544d75171b9");
        java.lang.String str15 = questionario1.getNome();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token2 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = tokenController0.criaToken(token2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.util.List<com.ufcg.sad.models.aluno.Aluno>> alunoListResponseEntity2 = disciplinaController0.getAlunosMatriculados((java.lang.Long) 0L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray2 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList3 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList3, questaoArray2);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList3);
        java.lang.Long long6 = questionario1.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.ufcg.sad.controllers.QuestaoController questaoController0 = new com.ufcg.sad.controllers.QuestaoController();
        com.ufcg.sad.models.questao.Questao questao1 = new com.ufcg.sad.models.questao.Questao();
        com.ufcg.sad.models.professor.Professor professor2 = new com.ufcg.sad.models.professor.Professor();
        java.lang.String str3 = professor2.getNome();
        questao1.setAutor(professor2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 = questaoController0.atualizaQuestao(questao1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.getAluno((java.lang.Long) 1L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str2 = questionario1.getDescricao();
        java.util.Date date3 = questionario1.getDataCriacao();
        java.lang.String str4 = questionario1.getDescricao();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario1.getQuestoes();
        java.util.Date date6 = questionario1.getDataUltimaEdicao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) (-1L), "hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("", (java.lang.Long) (-1L));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado8 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado12 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado8, "", (java.lang.Integer) 1, "");
        java.lang.Long long13 = questionarioAplicado12.getId();
        java.lang.Long long14 = questionarioAplicado12.getIdQuestionario();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 = questionarioAplicadoController6.atualizaQuestionarioAplicado(questionarioAplicado12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.opcao.Opcao opcao1 = new com.ufcg.sad.models.opcao.Opcao();
        java.lang.String str2 = opcao1.getNome();
        opcao1.setNome("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha5 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.Long long6 = respostaMultiplaEscolha5.getId();
        com.ufcg.sad.models.questionario.Questionario questionario7 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray8 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList9 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList9, questaoArray8);
        questionario7.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList9);
        boolean boolean12 = respostaMultiplaEscolha5.equals((java.lang.Object) questaoList9);
        boolean boolean13 = opcao1.equals((java.lang.Object) respostaMultiplaEscolha5);
        com.ufcg.sad.models.questionario.Questionario questionario14 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray15 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList16 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList16, questaoArray15);
        questionario14.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList16);
        questionario14.setId((java.lang.Long) 10L);
        java.util.Date date21 = questionario14.getDataUltimaEdicao();
        java.util.Date date22 = questionario14.getDataCriacao();
        boolean boolean23 = opcao1.equals((java.lang.Object) questionario14);
        questionario14.setId((java.lang.Long) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 = questionarioController0.criaQuestionario(questionario14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("com.ufcg.sad.exceptions.EntidadeNotFoundException: cde6b885-0069-445b-83e0-a544d75171b9");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str2 = questionario1.getDescricao();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.atualizaQuestionario(questionario1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray12 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet13 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet13, respostaArray12);
        com.ufcg.sad.models.token.Token token17 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray18 = new com.ufcg.sad.models.token.Token[] { token17 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet19 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet19, tokenArray18);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado21 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet13, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet19);
        questionarioAplicado21.setIdQuestionario((java.lang.Long) (-1L));
        java.lang.Long long24 = questionarioAplicado21.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 = questionarioAplicadoController6.criaQuestionarioAplicado(questionarioAplicado21);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 0L, (java.lang.Long) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = tokenController0.criaToken(token3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = tokenController0.deletaToken("com.ufcg.sad.exceptions.EntidadeNotFoundException: cde6b885-0069-445b-83e0-a544d75171b9");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = professorController0.getProfessor((java.lang.Long) 1L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        com.ufcg.sad.models.matricula.Matricula matricula3 = com.ufcg.sad.models.util.Utils.createMatriculaTest("hi!", "hi!");
        com.ufcg.sad.models.disciplina.Disciplina disciplina4 = matricula3.getDisciplina();
        disciplina4.setId((java.lang.Long) 10L);
        java.lang.String str7 = disciplina4.getSemestre();
        disciplina4.setTurma((java.lang.Integer) 0);
        java.lang.Integer int10 = disciplina4.getTurma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 = disciplinaController0.cadastrarDisciplina(disciplina4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado8 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado12 = new com.ufcg.sad.models.questionario.QuestionarioAplicado(questionarioAplicado8, "", (java.lang.Integer) 1, "");
        java.lang.String str13 = questionarioAplicado12.getSemestre();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 = questionarioAplicadoController6.atualizaQuestionarioAplicado(questionarioAplicado12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado13 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 1L, (java.lang.Long) (-1L), (java.lang.Long) 100L, (java.lang.Long) 0L, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 = questionarioAplicadoController6.criaQuestionarioAplicado(questionarioAplicado13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        com.ufcg.sad.models.aluno.Aluno aluno1 = new com.ufcg.sad.models.aluno.Aluno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.atualizarAluno(aluno1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("cde6b885-0069-445b-83e0-a544d75171b9", (java.lang.Long) 1L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 0L, "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        token3.setIdQuestionarioAplicado((java.lang.Long) 0L);
        token3.setIdQuestionarioAplicado((java.lang.Long) 100L);
        com.ufcg.sad.models.matricula.Matricula matricula8 = new com.ufcg.sad.models.matricula.Matricula();
        boolean boolean10 = matricula8.equals((java.lang.Object) 'a');
        boolean boolean11 = token3.equals((java.lang.Object) boolean10);
        token3.setId("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 = tokenController0.criaToken(token3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        com.ufcg.sad.models.questionario.Questionario questionario1 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray2 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList3 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList3, questaoArray2);
        questionario1.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList3);
        java.lang.Long long6 = questionario1.getId();
        com.ufcg.sad.models.professor.Professor professor7 = questionario1.getAutor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 = questionarioController0.criaQuestionario(questionario1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.resposta.Resposta[] respostaArray11 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet12 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet12, respostaArray11);
        com.ufcg.sad.models.token.Token token16 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray17 = new com.ufcg.sad.models.token.Token[] { token16 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet18 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet18, tokenArray17);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado20 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet12, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet18);
        com.ufcg.sad.models.resposta.Resposta[] respostaArray25 = new com.ufcg.sad.models.resposta.Resposta[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta> respostaSet26 = new java.util.LinkedHashSet<com.ufcg.sad.models.resposta.Resposta>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.resposta.Resposta>) respostaSet26, respostaArray25);
        com.ufcg.sad.models.token.Token token30 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        com.ufcg.sad.models.token.Token[] tokenArray31 = new com.ufcg.sad.models.token.Token[] { token30 };
        java.util.LinkedHashSet<com.ufcg.sad.models.token.Token> tokenSet32 = new java.util.LinkedHashSet<com.ufcg.sad.models.token.Token>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.token.Token>) tokenSet32, tokenArray31);
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado34 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet26, (java.util.Set<com.ufcg.sad.models.token.Token>) tokenSet32);
        java.util.Set<com.ufcg.sad.models.resposta.Resposta> respostaSet35 = questionarioAplicado34.getRespostas();
        questionarioAplicado34.setIdProfessor((java.lang.Long) 100L);
        questionarioAplicado34.setIdProfessor((java.lang.Long) (-1L));
        com.ufcg.sad.models.resposta.RespostaMultiplaEscolha respostaMultiplaEscolha40 = new com.ufcg.sad.models.resposta.RespostaMultiplaEscolha();
        java.lang.Long long41 = respostaMultiplaEscolha40.getId();
        com.ufcg.sad.models.questionario.Questionario questionario42 = new com.ufcg.sad.models.questionario.Questionario();
        com.ufcg.sad.models.questao.Questao[] questaoArray43 = new com.ufcg.sad.models.questao.Questao[] {};
        java.util.ArrayList<com.ufcg.sad.models.questao.Questao> questaoList44 = new java.util.ArrayList<com.ufcg.sad.models.questao.Questao>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.questao.Questao>) questaoList44, questaoArray43);
        questionario42.setQuestoes((java.util.List<com.ufcg.sad.models.questao.Questao>) questaoList44);
        boolean boolean47 = respostaMultiplaEscolha40.equals((java.lang.Object) questaoList44);
        java.lang.String str48 = respostaMultiplaEscolha40.getComentario();
        boolean boolean49 = questionarioAplicado34.equals((java.lang.Object) respostaMultiplaEscolha40);
        java.lang.Long long50 = questionarioAplicado34.getIdDisciplina();
        com.ufcg.sad.models.token.Token token53 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        token53.setIdQuestionarioAplicado((java.lang.Long) 0L);
        token53.setIdQuestionarioAplicado((java.lang.Long) 100L);
        com.ufcg.sad.models.matricula.Matricula matricula58 = new com.ufcg.sad.models.matricula.Matricula();
        boolean boolean60 = matricula58.equals((java.lang.Object) 'a');
        boolean boolean61 = token53.equals((java.lang.Object) boolean60);
        token53.setId("863eb965-40bb-4f07-88b4-8c62ef17adaa");
        questionarioAplicado34.removeToken(token53);
        java.util.Set<com.ufcg.sad.models.token.Token> tokenSet65 = questionarioAplicado34.getTokens();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado66 = new com.ufcg.sad.models.questionario.QuestionarioAplicado((java.lang.Long) 100L, (java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.lang.Long) 1L, "com.ufcg.sad.exceptions.EntidadeNotFoundException", (java.lang.Integer) 1, (java.util.Set<com.ufcg.sad.models.resposta.Resposta>) respostaSet12, tokenSet65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity67 = questionarioAplicadoController0.atualizaQuestionarioAplicado(questionarioAplicado66);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = enviarQuestionarioController0.enviarEmailParaUmQuestionario((java.lang.Long) 100L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        com.ufcg.sad.models.questionario.QuestionarioAplicado questionarioAplicado1 = new com.ufcg.sad.models.questionario.QuestionarioAplicado();
        java.lang.Long long2 = questionarioAplicado1.getIdProfessor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioAplicadoController0.criaQuestionarioAplicado(questionarioAplicado1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 = questionarioController0.getDisciplinas("053c642d-c4f0-4db8-9f09-a6a0428fcbaf", (java.lang.Long) 10L);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray5 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet6 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet6, disciplinaArray5);
        com.ufcg.sad.models.professor.Professor professor8 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet6);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet9 = professor8.getDisciplinas();
        com.ufcg.sad.models.professor.Professor professor10 = new com.ufcg.sad.models.professor.Professor("863eb965-40bb-4f07-88b4-8c62ef17adaa", "", disciplinaSet9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 = professorController0.atualizarProfessor(professor10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.ufcg.sad.models.questionario.Questionario questionario0 = new com.ufcg.sad.models.questionario.Questionario();
        java.lang.String str1 = questionario0.getDescricao();
        java.util.Date date2 = questionario0.getDataCriacao();
        java.lang.String str3 = questionario0.getDescricao();
        java.lang.Long long4 = questionario0.getId();
        java.util.List<com.ufcg.sad.models.questao.Questao> questaoList5 = questionario0.getQuestoes();
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController6 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        boolean boolean7 = questionario0.equals((java.lang.Object) questionarioAplicadoController6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 = questionarioAplicadoController6.getQuestionarioAplicado((java.lang.Long) 0L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<com.ufcg.sad.models.professor.Professor> professorResponseEntity2 = professorController0.procurarProfessorPeloSiape("053c642d-c4f0-4db8-9f09-a6a0428fcbaf");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = enviarQuestionarioController0.enviarEmailParaUmQuestionario((java.lang.Long) 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.ufcg.sad.controllers.DisciplinaController disciplinaController0 = new com.ufcg.sad.controllers.DisciplinaController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = disciplinaController0.getDisciplina((java.lang.Long) 0L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) 10L, "70ea7515-9f10-40a2-b76d-742150a7b6d0", (java.lang.Long) 100L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.ufcg.sad.controllers.TokenController tokenController0 = new com.ufcg.sad.controllers.TokenController();
        com.ufcg.sad.models.token.Token token3 = new com.ufcg.sad.models.token.Token((java.lang.Long) 10L, (java.lang.Long) 0L);
        token3.setIdQuestionarioAplicado((java.lang.Long) 0L);
        token3.setIdQuestionarioAplicado((java.lang.Long) 100L);
        token3.setIdAluno((java.lang.Long) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 = tokenController0.criaToken(token3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.ufcg.sad.controllers.EnviarQuestionarioController enviarQuestionarioController0 = new com.ufcg.sad.controllers.EnviarQuestionarioController();
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 = enviarQuestionarioController0.enviarEmailParaVariosQuestionarios((java.util.List<java.lang.Long>) longList5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.ufcg.sad.controllers.AlunoController alunoController0 = new com.ufcg.sad.controllers.AlunoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = alunoController0.procurarPorEmail("cda151ca-1f67-46c2-bfb6-4b1964e2b258");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.ufcg.sad.controllers.ProfessorController professorController0 = new com.ufcg.sad.controllers.ProfessorController();
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray3 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet4 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4, disciplinaArray3);
        com.ufcg.sad.models.professor.Professor professor6 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet4);
        professor6.setNome("");
        professor6.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray13 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet14 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14, disciplinaArray13);
        com.ufcg.sad.models.professor.Professor professor16 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet14);
        professor16.setNome("");
        professor16.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray23 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet24 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24, disciplinaArray23);
        com.ufcg.sad.models.professor.Professor professor26 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24);
        professor16.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24);
        professor6.setDisciplinas((java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet24);
        com.ufcg.sad.models.disciplina.Disciplina[] disciplinaArray31 = new com.ufcg.sad.models.disciplina.Disciplina[] {};
        java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet32 = new java.util.LinkedHashSet<com.ufcg.sad.models.disciplina.Disciplina>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32, disciplinaArray31);
        com.ufcg.sad.models.professor.Professor professor34 = new com.ufcg.sad.models.professor.Professor("hi!", "", (java.util.Set<com.ufcg.sad.models.disciplina.Disciplina>) disciplinaSet32);
        professor34.setNome("");
        professor34.setNome("");
        com.ufcg.sad.models.disciplina.Disciplina disciplina40 = new com.ufcg.sad.models.disciplina.Disciplina("");
        professor34.addDisciplina(disciplina40);
        java.util.Set<com.ufcg.sad.models.disciplina.Disciplina> disciplinaSet42 = professor34.getDisciplinas();
        professor6.setDisciplinas(disciplinaSet42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity44 = professorController0.atualizarProfessor(professor6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.ufcg.sad.controllers.QuestionarioAplicadoController questionarioAplicadoController0 = new com.ufcg.sad.controllers.QuestionarioAplicadoController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 = questionarioAplicadoController0.getQuestionarioAplicado((java.lang.Long) 1L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.ufcg.sad.controllers.QuestionarioController questionarioController0 = new com.ufcg.sad.controllers.QuestionarioController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 = questionarioController0.getQuestionariosAplicadosByIDs((java.lang.Long) (-1L), "cde6b885-0069-445b-83e0-a544d75171b9", (java.lang.Long) 10L);
    }
}

