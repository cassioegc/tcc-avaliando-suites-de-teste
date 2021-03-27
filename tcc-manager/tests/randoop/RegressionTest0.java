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
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.Long> pessoaSingularAttribute0 = com.unifacisa.tcc.domain.abstractions.Pessoa_.id;
        org.junit.Assert.assertNull(pessoaSingularAttribute0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.time.Instant> abstractAuditingEntitySingularAttribute0 = com.unifacisa.tcc.domain.AbstractAuditingEntity_.createdDate;
        org.junit.Assert.assertNull(abstractAuditingEntitySingularAttribute0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.String> pessoaSingularAttribute0 = null;
        com.unifacisa.tcc.domain.abstractions.Pessoa_.primeiroNome = pessoaSingularAttribute0;
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.login;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.profileURL;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.springframework.core.env.Environment environment0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = com.unifacisa.tcc.config.DefaultProfileUtil.getActiveProfiles(environment0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.resetKey = userSingularAttribute0;
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.accessToken = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("hi!", "", "");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.Long> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.id;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        javax.persistence.metamodel.MapAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.String, java.lang.String> persistentAuditEventMapAttribute0 = null;
        com.unifacisa.tcc.domain.PersistentAuditEvent_.data = persistentAuditEventMapAttribute0;
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Professor, java.lang.Boolean> professorSingularAttribute0 = com.unifacisa.tcc.domain.Professor_.diponibilidade;
        org.junit.Assert.assertNull(professorSingularAttribute0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.email;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.providerUserId = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.time.Instant> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.resetDate;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Professor, java.lang.Boolean> professorSingularAttribute0 = null;
        com.unifacisa.tcc.domain.Professor_.diponibilidade = professorSingularAttribute0;
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.lastName;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.accessToken;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.login = userSingularAttribute0;
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.String> pessoaSingularAttribute0 = null;
        com.unifacisa.tcc.domain.abstractions.Pessoa_.email = pessoaSingularAttribute0;
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.time.Instant> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.resetDate = userSingularAttribute0;
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.refreshToken = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.lang.String> abstractAuditingEntitySingularAttribute0 = null;
        com.unifacisa.tcc.domain.AbstractAuditingEntity_.lastModifiedBy = abstractAuditingEntitySingularAttribute0;
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.time.Instant> abstractAuditingEntitySingularAttribute0 = null;
        com.unifacisa.tcc.domain.AbstractAuditingEntity_.lastModifiedDate = abstractAuditingEntitySingularAttribute0;
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.time.Instant> persistentAuditEventSingularAttribute0 = null;
        com.unifacisa.tcc.domain.PersistentAuditEvent_.auditEventDate = persistentAuditEventSingularAttribute0;
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.lastName = userSingularAttribute0;
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.Long> pessoaSingularAttribute0 = com.unifacisa.tcc.domain.abstractions.Pessoa_.numeroContato;
        org.junit.Assert.assertNull(pessoaSingularAttribute0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.Long> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.id;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.unifacisa.tcc.security.SpringSecurityAuditorAware springSecurityAuditorAware0 = new com.unifacisa.tcc.security.SpringSecurityAuditorAware();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.String> persistentAuditEventSingularAttribute0 = null;
        com.unifacisa.tcc.domain.PersistentAuditEvent_.auditEventType = persistentAuditEventSingularAttribute0;
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.Long> pessoaSingularAttribute0 = null;
        com.unifacisa.tcc.domain.abstractions.Pessoa_.numeroContato = pessoaSingularAttribute0;
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.providerId;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.displayName = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.firstName = userSingularAttribute0;
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = com.unifacisa.tcc.web.rest.vm.ManagedUserVM.PASSWORD_MAX_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.Long> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.id = userSingularAttribute0;
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.Long> persistentAuditEventSingularAttribute0 = null;
        com.unifacisa.tcc.domain.PersistentAuditEvent_.id = persistentAuditEventSingularAttribute0;
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.activationKey = userSingularAttribute0;
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.langKey;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.userId;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.resetKey;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.springframework.boot.SpringApplication springApplication0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.unifacisa.tcc.config.DefaultProfileUtil.addDefaultProfile(springApplication0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.langKey = userSingularAttribute0;
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.Long> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.rank;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.displayName;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.time.Instant> abstractAuditingEntitySingularAttribute0 = com.unifacisa.tcc.domain.AbstractAuditingEntity_.lastModifiedDate;
        org.junit.Assert.assertNull(abstractAuditingEntitySingularAttribute0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Aluno, com.unifacisa.tcc.domain.Professor> alunoSingularAttribute0 = com.unifacisa.tcc.domain.Aluno_.professor;
        org.junit.Assert.assertNull(alunoSingularAttribute0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect1 = new com.unifacisa.tcc.aop.logging.LoggingAspect(environment0);
        org.aspectj.lang.JoinPoint joinPoint2 = null;
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            loggingAspect1.logAfterThrowing(joinPoint2, throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.lang.String> abstractAuditingEntitySingularAttribute0 = com.unifacisa.tcc.domain.AbstractAuditingEntity_.createdBy;
        org.junit.Assert.assertNull(abstractAuditingEntitySingularAttribute0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("", "hi!", "");
        java.lang.String str4 = fieldErrorVM3.getObjectName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.imageUrl;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("hi!", "hi!", "hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.imageUrl = userSingularAttribute0;
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        java.lang.Long long3 = aluno0.getMatricula();
        java.lang.String str4 = aluno0.getSegundoNome();
        aluno0.setMatricula((java.lang.Long) 10L);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        javax.persistence.metamodel.SetAttribute<com.unifacisa.tcc.domain.Professor, com.unifacisa.tcc.domain.Aluno> professorSetAttribute0 = com.unifacisa.tcc.domain.Professor_.alunos;
        org.junit.Assert.assertNull(professorSetAttribute0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = professorResource1.deleteProfessor((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = professorResource1.deleteProfessor((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.lang.String> abstractAuditingEntitySingularAttribute0 = com.unifacisa.tcc.domain.AbstractAuditingEntity_.lastModifiedBy;
        org.junit.Assert.assertNull(abstractAuditingEntitySingularAttribute0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect1 = new com.unifacisa.tcc.aop.logging.LoggingAspect(environment0);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = loggingAspect1.logAround(proceedingJoinPoint2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.password = userSingularAttribute0;
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.String> persistentAuditEventSingularAttribute0 = com.unifacisa.tcc.domain.PersistentAuditEvent_.principal;
        org.junit.Assert.assertNull(persistentAuditEventSingularAttribute0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        javax.persistence.metamodel.SetAttribute<com.unifacisa.tcc.domain.User, com.unifacisa.tcc.domain.Authority> userSetAttribute0 = com.unifacisa.tcc.domain.User_.authorities;
        org.junit.Assert.assertNull(userSetAttribute0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.time.Instant> abstractAuditingEntitySingularAttribute0 = null;
        com.unifacisa.tcc.domain.AbstractAuditingEntity_.createdDate = abstractAuditingEntitySingularAttribute0;
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.Boolean> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.activated;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        javax.persistence.metamodel.MapAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.String, java.lang.String> persistentAuditEventMapAttribute0 = com.unifacisa.tcc.domain.PersistentAuditEvent_.data;
        org.junit.Assert.assertNull(persistentAuditEventMapAttribute0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.email = userSingularAttribute0;
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.net.URI uRI0 = com.unifacisa.tcc.web.rest.errors.ErrorConstants.PARAMETERIZED_TYPE;
        org.junit.Assert.assertNotNull(uRI0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.String> persistentAuditEventSingularAttribute0 = com.unifacisa.tcc.domain.PersistentAuditEvent_.auditEventType;
        org.junit.Assert.assertNull(persistentAuditEventSingularAttribute0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String str0 = com.unifacisa.tcc.web.rest.errors.ErrorConstants.ERR_VALIDATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error.validation" + "'", str0, "error.validation");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity3 = professorResource1.createProfessor(professor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.refreshToken;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.String> persistentAuditEventSingularAttribute0 = null;
        com.unifacisa.tcc.domain.PersistentAuditEvent_.principal = persistentAuditEventSingularAttribute0;
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Authority, java.lang.String> authoritySingularAttribute0 = null;
        com.unifacisa.tcc.domain.Authority_.name = authoritySingularAttribute0;
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityUpdateAlert("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.imageURL = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.activationKey;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        ch.qos.logback.classic.Logger logger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM(logger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.providerUserId;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.lang.String str2 = managedUserVM0.getLogin();
        java.lang.Long long3 = managedUserVM0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.AbstractAuditingEntity, java.lang.String> abstractAuditingEntitySingularAttribute0 = null;
        com.unifacisa.tcc.domain.AbstractAuditingEntity_.createdBy = abstractAuditingEntitySingularAttribute0;
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.Boolean> userSingularAttribute0 = null;
        com.unifacisa.tcc.domain.User_.activated = userSingularAttribute0;
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Authority, java.lang.String> authoritySingularAttribute0 = com.unifacisa.tcc.domain.Authority_.name;
        org.junit.Assert.assertNull(authoritySingularAttribute0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean2 = aluno0.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass3 = aluno0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.profileURL = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.Long> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.expireTime = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setDiponibilidade((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity7 = professorResource1.createProfessor(professor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity5 = professorResource1.updateProfessor(professor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.String> pessoaSingularAttribute0 = null;
        com.unifacisa.tcc.domain.abstractions.Pessoa_.segundoNome = pessoaSingularAttribute0;
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.secret = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.Long> pessoaSingularAttribute0 = null;
        com.unifacisa.tcc.domain.abstractions.Pessoa_.id = pessoaSingularAttribute0;
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.Long> pessoaSingularAttribute0 = null;
        com.unifacisa.tcc.domain.abstractions.Pessoa_.matricula = pessoaSingularAttribute0;
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        javax.persistence.metamodel.SetAttribute<com.unifacisa.tcc.domain.User, com.unifacisa.tcc.domain.Authority> userSetAttribute0 = null;
        com.unifacisa.tcc.domain.User_.authorities = userSetAttribute0;
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.TccmanagerApp tccmanagerApp1 = new com.unifacisa.tcc.TccmanagerApp(environment0);
        // The following exception was thrown during execution in test generation
        try {
            tccmanagerApp1.initApplication();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.Long> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.id = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "LoginVM{username='null', rememberMe=false}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str0 = com.unifacisa.tcc.web.rest.errors.ErrorConstants.ERR_CONCURRENCY_FAILURE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error.concurrencyFailure" + "'", str0, "error.concurrencyFailure");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect1 = new com.unifacisa.tcc.aop.logging.LoggingAspect(environment0);
        loggingAspect1.applicationPackagePointcut();
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = loggingAspect1.logAround(proceedingJoinPoint3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.net.URI uRI0 = com.unifacisa.tcc.web.rest.errors.ErrorConstants.DEFAULT_TYPE;
        org.junit.Assert.assertNotNull(uRI0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.Long> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.expireTime;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.userId = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        persistentAuditEvent0.setData(strMap1);
        persistentAuditEvent0.setAuditEventType("hi!");
        java.lang.Long long5 = persistentAuditEvent0.getId();
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.social.connect.Connection<?> wildcardConnection5 = customSocialConnectionRepository3.getConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.String> pessoaSingularAttribute0 = com.unifacisa.tcc.domain.abstractions.Pessoa_.email;
        org.junit.Assert.assertNull(pessoaSingularAttribute0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Aluno, com.unifacisa.tcc.domain.Professor> alunoSingularAttribute0 = null;
        com.unifacisa.tcc.domain.Aluno_.professor = alunoSingularAttribute0;
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int0 = com.unifacisa.tcc.web.rest.vm.ManagedUserVM.PASSWORD_MIN_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        java.lang.Long long7 = pessoa6.getNumeroContato();
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityUpdateAlert("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        persistentAuditEvent0.setData(strMap1);
        persistentAuditEvent0.setId((java.lang.Long) 10L);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = professorResource1.deleteProfessor((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.time.Instant> persistentAuditEventSingularAttribute0 = com.unifacisa.tcc.domain.PersistentAuditEvent_.auditEventDate;
        org.junit.Assert.assertNull(persistentAuditEventSingularAttribute0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Aluno, java.lang.Boolean> alunoSingularAttribute0 = null;
        com.unifacisa.tcc.domain.Aluno_.habilitadoTcc = alunoSingularAttribute0;
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityUpdateAlert("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity3 = professorResource1.getProfessor((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        javax.persistence.metamodel.SetAttribute<com.unifacisa.tcc.domain.Professor, com.unifacisa.tcc.domain.Aluno> professorSetAttribute0 = null;
        com.unifacisa.tcc.domain.Professor_.alunos = professorSetAttribute0;
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        java.lang.String str5 = pessoa4.getPrimeiroNome();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.firstName;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        org.aspectj.lang.JoinPoint joinPoint3 = null;
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            loggingAspect2.logAfterThrowing(joinPoint3, throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM1.setLevel("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name argument cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.imageURL;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity3 = professorResource1.getProfessor((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        java.util.List<com.unifacisa.tcc.domain.User> userList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList6 = userMapper0.usersToUserDTOs(userList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setDisplayName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str6 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str6, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap4 = customSocialConnectionRepository3.findAllConnections();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("error.concurrencyFailure", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "error.validation");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("error.validation");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        loggingAspect2.applicationPackagePointcut();
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = loggingAspect2.logAround(proceedingJoinPoint4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.social.connect.Connection<?> wildcardConnection5 = customSocialConnectionRepository3.getConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.unifacisa.tcc.config.ApplicationProperties applicationProperties0 = new com.unifacisa.tcc.config.ApplicationProperties();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant15 = null;
        java.time.Instant instant17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        com.unifacisa.tcc.service.dto.UserDTO userDTO23 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant15, "hi!", instant17, (java.util.Set<java.lang.String>) strSet21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet24 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", (java.util.Set<java.lang.String>) strSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity5 = userResource3.getUser("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.Long> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.rank = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setExpireTime((java.lang.Long) 100L);
        socialUserConnection0.setProviderUserId("");
        socialUserConnection0.setSecret("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap4 = customSocialConnectionRepository3.findAllConnections();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.Long> pessoaSingularAttribute0 = com.unifacisa.tcc.domain.abstractions.Pessoa_.matricula;
        org.junit.Assert.assertNull(pessoaSingularAttribute0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = com.unifacisa.tcc.domain.SocialUserConnection_.secret;
        org.junit.Assert.assertNull(socialUserConnectionSingularAttribute0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity5 = userResource3.deleteUser("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray7 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList8 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList8, userArray7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper6.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList8);
        java.time.Instant instant21 = null;
        java.time.Instant instant23 = null;
        java.time.Instant instant33 = null;
        java.time.Instant instant35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant33, "hi!", instant35, (java.util.Set<java.lang.String>) strSet39);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant21, "", instant23, (java.util.Set<java.lang.String>) strSet39);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet43 = userMapper6.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet39);
        user0.setAuthorities(authoritySet43);
        java.lang.String str45 = user0.getFirstName();
        user0.setActivationKey("error.validation");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setFirstName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        user0.setActivationKey("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor7 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor9 = professor7.diponibilidade((java.lang.Boolean) true);
        professor9.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        aluno12.setPrimeiroNome("");
        java.lang.Long long15 = aluno12.getMatricula();
        aluno12.setHabilitadoTcc((java.lang.Boolean) false);
        aluno12.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        aluno20.setPrimeiroNome("");
        java.lang.Long long23 = aluno20.getMatricula();
        java.lang.Long long24 = aluno20.getMatricula();
        aluno20.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        aluno27.setPrimeiroNome("");
        java.lang.Long long30 = aluno27.getMatricula();
        java.lang.Long long31 = aluno27.getMatricula();
        aluno27.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno34 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray35 = new com.unifacisa.tcc.domain.Aluno[] { aluno12, aluno20, aluno27, aluno34 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet36 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet36, alunoArray35);
        com.unifacisa.tcc.domain.Professor professor38 = professor9.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        com.unifacisa.tcc.domain.Aluno aluno39 = aluno2.professor(professor38);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity40 = professorResource1.createProfessor(professor38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor9);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(alunoArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(professor38);
        org.junit.Assert.assertNotNull(aluno39);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        java.lang.String str5 = socialUserConnection0.getDisplayName();
        socialUserConnection0.setDisplayName("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str5 = managedUserVM4.toString();
        java.time.Instant instant6 = managedUserVM4.getLastModifiedDate();
        java.time.Instant instant7 = null;
        managedUserVM4.setLastModifiedDate(instant7);
        java.lang.String str9 = managedUserVM4.getLogin();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity10 = userResource3.createUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str5, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.String> pessoaSingularAttribute0 = com.unifacisa.tcc.domain.abstractions.Pessoa_.segundoNome;
        org.junit.Assert.assertNull(pessoaSingularAttribute0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.User, java.lang.String> userSingularAttribute0 = com.unifacisa.tcc.domain.User_.password;
        org.junit.Assert.assertNull(userSingularAttribute0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity37 = userResource3.updateUser(managedUserVM35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long7 = professor4.getId();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity8 = professorResource1.updateProfessor(professor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.Aluno, java.lang.Boolean> alunoSingularAttribute0 = com.unifacisa.tcc.domain.Aluno_.habilitadoTcc;
        org.junit.Assert.assertNull(alunoSingularAttribute0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("LoginVM{username='null', rememberMe=false}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.unifacisa.tcc.domain.Professor> professorList2 = professorResource1.getAllProfessors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user0.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.dto.UserDTO userDTO5 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        userDTO5.setLogin("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.updateProfessor(professor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderUserId("error.concurrencyFailure");
        java.lang.Long long3 = socialUserConnection0.getExpireTime();
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setExpireTime((java.lang.Long) 1L);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray7 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList8 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList8, userArray7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper6.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList8);
        java.time.Instant instant21 = null;
        java.time.Instant instant23 = null;
        java.time.Instant instant33 = null;
        java.time.Instant instant35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant33, "hi!", instant35, (java.util.Set<java.lang.String>) strSet39);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant21, "", instant23, (java.util.Set<java.lang.String>) strSet39);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet43 = userMapper6.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet39);
        user0.setAuthorities(authoritySet43);
        java.lang.String str45 = user0.getActivationKey();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        aluno2.setPrimeiroNome("");
        aluno2.setId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor7 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor9 = professor7.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa11 = professor7.email("");
        com.unifacisa.tcc.domain.Professor professor13 = professor7.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno14 = aluno2.professor(professor7);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity15 = professorResource1.updateProfessor(professor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor9);
        org.junit.Assert.assertNotNull(pessoa11);
        org.junit.Assert.assertNotNull(professor13);
        org.junit.Assert.assertNotNull(aluno14);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.SocialUserConnection, java.lang.String> socialUserConnectionSingularAttribute0 = null;
        com.unifacisa.tcc.domain.SocialUserConnection_.providerId = socialUserConnectionSingularAttribute0;
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str5 = managedUserVM4.toString();
        java.lang.String str6 = managedUserVM4.getLogin();
        java.time.Instant instant7 = managedUserVM4.getLastModifiedDate();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity8 = userResource3.updateUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str5, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(instant7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.http.HttpHeaders httpHeaders7 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("hi!", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap8 = customSocialConnectionRepository3.findConnectionsToUsers((org.springframework.util.MultiValueMap<java.lang.String, java.lang.String>) httpHeaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpHeaders7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("LoginVM{username='null', rememberMe=false}", "error.validation", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str4 = fieldErrorVM3.getObjectName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str4, "LoginVM{username='null', rememberMe=false}");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor2 = null;
        aluno1.setProfessor(professor2);
        aluno1.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor8 = null;
        aluno7.setProfessor(professor8);
        java.lang.Long long10 = aluno7.getMatricula();
        java.lang.String str11 = aluno7.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean14 = aluno12.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor16 = null;
        aluno15.setProfessor(professor16);
        aluno15.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean22 = aluno20.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        aluno23.setPrimeiroNome("");
        java.lang.Long long26 = aluno23.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        aluno27.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray30 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno6, aluno7, aluno12, aluno15, aluno20, aluno23, aluno27 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet31 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet31, alunoArray30);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet31);
        professor0.setPrimeiroNome("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        professor0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNotNull(alunoArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity3 = alunoResource1.getAluno((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.abstractions.Pessoa, java.lang.String> pessoaSingularAttribute0 = com.unifacisa.tcc.domain.abstractions.Pessoa_.primeiroNome;
        org.junit.Assert.assertNull(pessoaSingularAttribute0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray7 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList8 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList8, userArray7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper6.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList8);
        java.time.Instant instant21 = null;
        java.time.Instant instant23 = null;
        java.time.Instant instant33 = null;
        java.time.Instant instant35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant33, "hi!", instant35, (java.util.Set<java.lang.String>) strSet39);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant21, "", instant23, (java.util.Set<java.lang.String>) strSet39);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet43 = userMapper6.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet39);
        user0.setAuthorities(authoritySet43);
        com.unifacisa.tcc.service.dto.UserDTO userDTO45 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        user0.setFirstName("");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        org.springframework.data.domain.Pageable pageable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.util.List<com.unifacisa.tcc.service.dto.UserDTO>> userDTOListResponseEntity5 = userResource3.getAllUsers(pageable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity3 = professorResource1.getProfessor((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        user2.setFirstName("error.validation");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper7 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user9 = userMapper7.userFromId((java.lang.Long) 100L);
        user9.setLangKey("");
        java.time.Instant instant12 = user9.getResetDate();
        java.time.Instant instant13 = user9.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        aluno14.setPrimeiroNome("");
        java.lang.String str17 = aluno14.getPrimeiroNome();
        java.lang.Long long18 = aluno14.getMatricula();
        boolean boolean19 = user9.equals((java.lang.Object) aluno14);
        user9.setFirstName("");
        com.unifacisa.tcc.domain.User user22 = new com.unifacisa.tcc.domain.User();
        user22.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user22.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper27 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user29 = userMapper27.userFromId((java.lang.Long) 100L);
        user29.setLangKey("");
        java.time.Instant instant32 = user29.getResetDate();
        java.time.Instant instant33 = user29.getCreatedDate();
        user22.setResetDate(instant33);
        user9.setCreatedDate(instant33);
        user2.setResetDate(instant33);
        com.unifacisa.tcc.service.dto.UserDTO userDTO37 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        java.lang.String str38 = userDTO37.getLastName();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(instant12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNull(instant32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = professorResource1.deleteProfessor((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("error.concurrencyFailure", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray7 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList8 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList8, userArray7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper6.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList8);
        java.time.Instant instant21 = null;
        java.time.Instant instant23 = null;
        java.time.Instant instant33 = null;
        java.time.Instant instant35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant33, "hi!", instant35, (java.util.Set<java.lang.String>) strSet39);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant21, "", instant23, (java.util.Set<java.lang.String>) strSet39);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet43 = userMapper6.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet39);
        user0.setAuthorities(authoritySet43);
        java.lang.String str45 = user0.getFirstName();
        user0.setLastModifiedBy("hi!");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.http.HttpHeaders httpHeaders6 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap7 = customSocialConnectionRepository3.findConnectionsToUsers((org.springframework.util.MultiValueMap<java.lang.String, java.lang.String>) httpHeaders6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpHeaders6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.primeiroNome("hi!");
        java.lang.String str9 = aluno2.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity10 = alunoResource1.updateAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity3 = alunoResource1.updateAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        loggingAspect2.springBeanPointcut();
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = loggingAspect2.logAround(proceedingJoinPoint4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity3 = alunoResource1.getAluno((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "hi!", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray9 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList10 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList10, userArray9);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList12 = userMapper8.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList10);
        java.time.Instant instant23 = null;
        java.time.Instant instant25 = null;
        java.time.Instant instant35 = null;
        java.time.Instant instant37 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        com.unifacisa.tcc.service.dto.UserDTO userDTO43 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant35, "hi!", instant37, (java.util.Set<java.lang.String>) strSet41);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM44 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant23, "", instant25, (java.util.Set<java.lang.String>) strSet41);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet45 = userMapper8.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet46 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", (java.util.Set<java.lang.String>) strSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(userArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userDTOList12);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(authoritySet45);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.String str8 = socialUserConnection0.getProfileURL();
        java.time.Instant instant19 = null;
        java.time.Instant instant21 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM29 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant19, "error.concurrencyFailure", instant21, (java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = socialUserConnection0.equals((java.lang.Object) "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor7 = null;
        aluno6.setProfessor(professor7);
        aluno6.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor13 = null;
        aluno12.setProfessor(professor13);
        java.lang.Long long15 = aluno12.getMatricula();
        java.lang.String str16 = aluno12.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean19 = aluno17.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor21 = null;
        aluno20.setProfessor(professor21);
        aluno20.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean27 = aluno25.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        aluno28.setPrimeiroNome("");
        java.lang.Long long31 = aluno28.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        aluno32.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray35 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno11, aluno12, aluno17, aluno20, aluno25, aluno28, aluno32 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet36 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet36, alunoArray35);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        com.unifacisa.tcc.domain.Professor professor39 = professor4.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        java.lang.Long long40 = professor39.getMatricula();
        com.unifacisa.tcc.domain.Professor professor41 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor43 = professor41.diponibilidade((java.lang.Boolean) true);
        professor43.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str46 = professor43.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor47 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor49 = professor47.diponibilidade((java.lang.Boolean) true);
        professor49.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        aluno52.setPrimeiroNome("");
        java.lang.Long long55 = aluno52.getMatricula();
        aluno52.setHabilitadoTcc((java.lang.Boolean) false);
        aluno52.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno60 = new com.unifacisa.tcc.domain.Aluno();
        aluno60.setPrimeiroNome("");
        java.lang.Long long63 = aluno60.getMatricula();
        java.lang.Long long64 = aluno60.getMatricula();
        aluno60.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        aluno67.setPrimeiroNome("");
        java.lang.Long long70 = aluno67.getMatricula();
        java.lang.Long long71 = aluno67.getMatricula();
        aluno67.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno74 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray75 = new com.unifacisa.tcc.domain.Aluno[] { aluno52, aluno60, aluno67, aluno74 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet76 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet76, alunoArray75);
        com.unifacisa.tcc.domain.Professor professor78 = professor49.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet76);
        com.unifacisa.tcc.domain.Professor professor79 = professor43.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet76);
        professor39.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet76);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity81 = professorResource1.createProfessor(professor39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(alunoArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNotNull(professor43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(professor49);
        org.junit.Assert.assertNull(long55);
        org.junit.Assert.assertNull(long63);
        org.junit.Assert.assertNull(long64);
        org.junit.Assert.assertNull(long70);
        org.junit.Assert.assertNull(long71);
        org.junit.Assert.assertNotNull(alunoArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(professor78);
        org.junit.Assert.assertNotNull(professor79);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("error.validation", "LoginVM{username='null', rememberMe=null}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        professor4.setPrimeiroNome("LoginVM{username='null', rememberMe=false}");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity9 = professorResource1.createProfessor(professor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getDisplayName();
        java.lang.String str4 = socialUserConnection0.getProfileURL();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant16 = null;
        java.time.Instant instant18 = null;
        java.time.Instant instant28 = null;
        java.time.Instant instant30 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        com.unifacisa.tcc.service.dto.UserDTO userDTO36 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant28, "hi!", instant30, (java.util.Set<java.lang.String>) strSet34);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM37 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 0L, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", "hi!", "hi!", "", true, "hi!", "", "", instant16, "", instant18, (java.util.Set<java.lang.String>) strSet34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet38 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("LoginVM{username='null', rememberMe=null}", (java.util.Set<java.lang.String>) strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect1 = new com.unifacisa.tcc.aop.logging.LoggingAspect(environment0);
        loggingAspect1.springBeanPointcut();
        loggingAspect1.springBeanPointcut();
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = loggingAspect1.logAround(proceedingJoinPoint4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        aluno7.setPrimeiroNome("");
        java.lang.Long long10 = aluno7.getMatricula();
        aluno7.setHabilitadoTcc((java.lang.Boolean) false);
        aluno7.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        aluno15.setPrimeiroNome("");
        java.lang.Long long18 = aluno15.getMatricula();
        java.lang.Long long19 = aluno15.getMatricula();
        aluno15.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        aluno22.setPrimeiroNome("");
        java.lang.Long long25 = aluno22.getMatricula();
        java.lang.Long long26 = aluno22.getMatricula();
        aluno22.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray30 = new com.unifacisa.tcc.domain.Aluno[] { aluno7, aluno15, aluno22, aluno29 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet31 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet31, alunoArray30);
        com.unifacisa.tcc.domain.Professor professor33 = professor4.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet31);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity34 = professorResource1.createProfessor(professor33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNotNull(alunoArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(professor33);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.TccmanagerApp tccmanagerApp1 = new com.unifacisa.tcc.TccmanagerApp(environment0);
        java.lang.Class<?> wildcardClass2 = tccmanagerApp1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = userResource3.getAuthorities();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "Authority{name='error.concurrencyFailure'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("error.validation", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", (java.lang.Long) 0L, "error.validation", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", "error.validation", "Authority{name='error.concurrencyFailure'}", "error.validation", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", (java.lang.Long) 1L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("LoggerVM{name='null', level='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean2 = aluno0.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor3 = aluno0.getProfessor();
        // The following exception was thrown during execution in test generation
        try {
            professor3.setSegundoNome("Authority{name='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(professor3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet5 = managedUserVM4.getAuthorities();
        java.time.Instant instant6 = null;
        managedUserVM4.setLastModifiedDate(instant6);
        java.lang.String str8 = managedUserVM4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity9 = userResource3.createUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str8, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity5 = userResource3.deleteUser("LoginVM{username='null', rememberMe=false}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str5 = managedUserVM4.toString();
        java.time.Instant instant6 = managedUserVM4.getLastModifiedDate();
        java.time.Instant instant7 = null;
        managedUserVM4.setLastModifiedDate(instant7);
        java.lang.String str9 = managedUserVM4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity10 = userResource3.createUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str5, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str9, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.unifacisa.tcc.domain.Aluno> alunoList2 = alunoResource1.getAllAlunos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity3 = alunoResource1.getAluno((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "Authority{name='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        java.time.Instant instant4 = persistentAuditEvent0.getAuditEventDate();
        persistentAuditEvent0.setAuditEventType("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = alunoResource1.deleteAluno((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM1.setName("LoginVM{username='null', rememberMe=false}");
        logsResource0.changeLevel(loggerVM1);
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM5 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str6 = loggerVM5.getName();
        java.lang.String str7 = loggerVM5.getLevel();
        java.lang.String str8 = loggerVM5.toString();
        java.lang.String str9 = loggerVM5.getName();
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name argument cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LoggerVM{name='null', level='null'}" + "'", str8, "LoggerVM{name='null', level='null'}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.time.Instant instant10 = null;
        java.time.Instant instant12 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        com.unifacisa.tcc.service.dto.UserDTO userDTO30 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant22, "hi!", instant24, (java.util.Set<java.lang.String>) strSet28);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM31 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", false, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoginVM{username='null', rememberMe=false}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant10, "hi!", instant12, (java.util.Set<java.lang.String>) strSet28);
        java.lang.String str32 = managedUserVM31.getFirstName();
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str32, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("error.validation");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        user2.setId((java.lang.Long) 0L);
        java.lang.String str8 = user2.getImageUrl();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant1 = managedUserVM0.getCreatedDate();
        java.lang.Long long2 = managedUserVM0.getId();
        java.time.Instant instant3 = managedUserVM0.getCreatedDate();
        java.lang.String str4 = managedUserVM0.getLastName();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        org.springframework.data.domain.Pageable pageable38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.util.List<com.unifacisa.tcc.service.dto.UserDTO>> userDTOListResponseEntity39 = userResource3.getAllUsers(pageable38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setExpireTime((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.unifacisa.tcc.service.dto.UserDTO userDTO0 = new com.unifacisa.tcc.service.dto.UserDTO();
        java.util.Set<java.lang.String> strSet1 = userDTO0.getAuthorities();
        java.lang.String str2 = userDTO0.getEmail();
        java.lang.String str3 = userDTO0.getImageUrl();
        org.junit.Assert.assertNull(strSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        aluno2.setPrimeiroNome("");
        java.lang.String str5 = aluno2.getPrimeiroNome();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity6 = alunoResource1.updateAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        user2.setId((java.lang.Long) 0L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user10 = userMapper8.userFromId((java.lang.Long) 100L);
        user10.setResetKey("hi!");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user15 = userMapper13.userFromId((java.lang.Long) 100L);
        user15.setLangKey("");
        java.time.Instant instant18 = user15.getResetDate();
        java.time.Instant instant19 = user15.getCreatedDate();
        user10.setResetDate(instant19);
        user2.setResetDate(instant19);
        com.unifacisa.tcc.service.dto.UserDTO userDTO22 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        java.lang.String str23 = user2.getCreatedBy();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        aluno5.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Professor professor8 = professor0.addAluno(aluno5);
        java.lang.Long long9 = aluno5.getNumeroContato();
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor11 = null;
        aluno10.setProfessor(professor11);
        aluno10.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor15 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor17 = professor15.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor18 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor20 = null;
        aluno19.setProfessor(professor20);
        aluno19.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor26 = null;
        aluno25.setProfessor(professor26);
        java.lang.Long long28 = aluno25.getMatricula();
        java.lang.String str29 = aluno25.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean32 = aluno30.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor34 = null;
        aluno33.setProfessor(professor34);
        aluno33.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean40 = aluno38.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno41 = new com.unifacisa.tcc.domain.Aluno();
        aluno41.setPrimeiroNome("");
        java.lang.Long long44 = aluno41.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        aluno45.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray48 = new com.unifacisa.tcc.domain.Aluno[] { aluno19, aluno24, aluno25, aluno30, aluno33, aluno38, aluno41, aluno45 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet49 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet49, alunoArray48);
        professor18.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet49);
        com.unifacisa.tcc.domain.Professor professor52 = professor17.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet49);
        aluno10.setProfessor(professor52);
        aluno5.setProfessor(professor52);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        aluno55.setPrimeiroNome("error.validation");
        java.lang.String str58 = aluno55.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor59 = professor52.removeAluno(aluno55);
        com.unifacisa.tcc.domain.Professor professor61 = professor59.diponibilidade((java.lang.Boolean) true);
        professor59.setPrimeiroNome("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNotNull(professor17);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(long44);
        org.junit.Assert.assertNotNull(alunoArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(professor52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "error.validation" + "'", str58, "error.validation");
        org.junit.Assert.assertNotNull(professor59);
        org.junit.Assert.assertNotNull(professor61);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.http.HttpHeaders httpHeaders6 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap7 = customSocialConnectionRepository3.findConnectionsToUsers((org.springframework.util.MultiValueMap<java.lang.String, java.lang.String>) httpHeaders6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpHeaders6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.time.Instant instant2 = managedUserVM0.getLastModifiedDate();
        java.time.Instant instant3 = null;
        managedUserVM0.setLastModifiedDate(instant3);
        java.lang.String str5 = managedUserVM0.getEmail();
        java.lang.String str6 = managedUserVM0.getLastModifiedBy();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("error.concurrencyFailure", "hi!");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setProviderUserId("");
        java.lang.String str11 = socialUserConnection0.getProviderUserId();
        socialUserConnection0.setAccessToken("LoginVM{username='null', rememberMe=null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setProviderUserId("");
        org.springframework.http.HttpHeaders httpHeaders13 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "error.validation");
        boolean boolean14 = socialUserConnection0.equals((java.lang.Object) "error.validation");
        org.junit.Assert.assertNotNull(httpHeaders13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        java.time.Instant instant15 = null;
        java.time.Instant instant17 = null;
        java.time.Instant instant27 = null;
        java.time.Instant instant29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        com.unifacisa.tcc.service.dto.UserDTO userDTO35 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant27, "hi!", instant29, (java.util.Set<java.lang.String>) strSet33);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM36 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant15, "", instant17, (java.util.Set<java.lang.String>) strSet33);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet37 = userMapper0.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet33);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper38 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray39 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList40 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList40, userArray39);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList42 = userMapper38.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList40);
        java.time.Instant instant53 = null;
        java.time.Instant instant55 = null;
        java.time.Instant instant65 = null;
        java.time.Instant instant67 = null;
        java.lang.String[] strArray70 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        com.unifacisa.tcc.service.dto.UserDTO userDTO73 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant65, "hi!", instant67, (java.util.Set<java.lang.String>) strSet71);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM74 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant53, "", instant55, (java.util.Set<java.lang.String>) strSet71);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet75 = userMapper38.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet71);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper76 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray77 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList78 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList78, userArray77);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList80 = userMapper76.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList78);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList81 = userMapper38.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList78);
        java.util.List<com.unifacisa.tcc.domain.User> userList82 = userMapper0.userDTOsToUsers(userDTOList81);
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(authoritySet37);
        org.junit.Assert.assertNotNull(userArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(userDTOList42);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(authoritySet75);
        org.junit.Assert.assertNotNull(userArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(userDTOList80);
        org.junit.Assert.assertNotNull(userDTOList81);
        org.junit.Assert.assertNotNull(userList82);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.Long long1 = managedUserVM0.getId();
        java.lang.String str2 = managedUserVM0.toString();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str2, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user15 = userMapper13.userFromId((java.lang.Long) 100L);
        user15.setLangKey("");
        java.time.Instant instant18 = user15.getResetDate();
        java.time.Instant instant19 = user15.getCreatedDate();
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent21 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        persistentAuditEvent21.setData(strMap22);
        persistentAuditEvent21.setAuditEventType("hi!");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent26 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant27 = null;
        persistentAuditEvent26.setAuditEventDate(instant27);
        com.unifacisa.tcc.domain.User user29 = new com.unifacisa.tcc.domain.User();
        user29.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user29.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper34 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user36 = userMapper34.userFromId((java.lang.Long) 100L);
        user36.setLangKey("");
        java.time.Instant instant39 = user36.getResetDate();
        java.time.Instant instant40 = user36.getCreatedDate();
        user29.setResetDate(instant40);
        persistentAuditEvent26.setAuditEventDate(instant40);
        persistentAuditEvent21.setAuditEventDate(instant40);
        java.time.Instant instant54 = null;
        java.time.Instant instant56 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM64 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant54, "error.concurrencyFailure", instant56, (java.util.Set<java.lang.String>) strSet62);
        com.unifacisa.tcc.service.dto.UserDTO userDTO65 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 0L, "hi!", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", true, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", instant19, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant40, (java.util.Set<java.lang.String>) strSet62);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet66 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", (java.util.Set<java.lang.String>) strSet62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNull(instant39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setDisplayName("error.validation");
        java.lang.Long long8 = socialUserConnection0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) 10L);
        java.lang.String str6 = socialUserConnection0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}" + "'", str6, "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.Long long3 = aluno2.getId();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity4 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        java.lang.String str3 = user0.getResetKey();
        user0.setLastModifiedBy("hi!");
        java.lang.String str6 = user0.getLogin();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM1.setName("LoginVM{username='null', rememberMe=false}");
        logsResource0.changeLevel(loggerVM1);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList5 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM6 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str7 = loggerVM6.getLevel();
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name argument cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggerVMList5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM38 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant39 = managedUserVM38.getCreatedDate();
        java.lang.String str40 = managedUserVM38.getImageUrl();
        java.time.Instant instant41 = managedUserVM38.getCreatedDate();
        java.time.Instant instant42 = managedUserVM38.getLastModifiedDate();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity43 = userResource3.updateUser(managedUserVM38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
        org.junit.Assert.assertNull(instant39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(instant41);
        org.junit.Assert.assertNull(instant42);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity39 = userResource3.deleteUser("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity39 = userResource3.getUser("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("error.concurrencyFailure");
        java.lang.Long long12 = socialUserConnection0.getRank();
        java.lang.String str13 = socialUserConnection0.getUserId();
        java.lang.String str14 = socialUserConnection0.getImageURL();
        socialUserConnection0.setProviderId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error.concurrencyFailure" + "'", str13, "error.concurrencyFailure");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.toString();
        com.unifacisa.tcc.domain.Professor professor3 = professor0.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet4 = professor0.getAlunos();
        professor0.setPrimeiroNome("");
        professor0.setDiponibilidade((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str1, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor3);
        org.junit.Assert.assertNotNull(alunoSet4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno3 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor4 = null;
        aluno3.setProfessor(professor4);
        aluno3.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno8 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno9 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor10 = null;
        aluno9.setProfessor(professor10);
        java.lang.Long long12 = aluno9.getMatricula();
        java.lang.String str13 = aluno9.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean16 = aluno14.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor18 = null;
        aluno17.setProfessor(professor18);
        aluno17.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean24 = aluno22.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        aluno25.setPrimeiroNome("");
        java.lang.Long long28 = aluno25.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        aluno29.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray32 = new com.unifacisa.tcc.domain.Aluno[] { aluno3, aluno8, aluno9, aluno14, aluno17, aluno22, aluno25, aluno29 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet33 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet33, alunoArray32);
        professor2.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet33);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity36 = professorResource1.updateProfessor(professor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(alunoArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.String str8 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setProviderUserId("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        socialUserConnection0.setRefreshToken("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Professor professor6 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.unifacisa.tcc.domain.Professor professor8 = professor6.removeAluno(aluno7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean2 = aluno0.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor3 = aluno0.getProfessor();
        // The following exception was thrown during execution in test generation
        try {
            com.unifacisa.tcc.domain.abstractions.Pessoa pessoa5 = professor3.numeroContato((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(professor3);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.unifacisa.tcc.domain.Authority authority0 = new com.unifacisa.tcc.domain.Authority();
        authority0.setName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        authority0.setName("error.concurrencyFailure");
        java.lang.String str5 = authority0.toString();
        authority0.setName("Authority{name='error.concurrencyFailure'}");
        java.lang.String str8 = authority0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authority{name='error.concurrencyFailure'}" + "'", str5, "Authority{name='error.concurrencyFailure'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authority{name='Authority{name='error.concurrencyFailure'}'}" + "'", str8, "Authority{name='Authority{name='error.concurrencyFailure'}'}");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("Authority{name='error.concurrencyFailure'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "LoggerVM{name='null', level='null'}", (java.lang.Long) 10L, "Authority{name='Authority{name='error.concurrencyFailure'}'}", "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "LoggerVM{name='null', level='null'}", "Authority{name='error.concurrencyFailure'}", (java.lang.Long) 1L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity39 = userResource3.deleteUser("Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity39 = userResource3.getUser("error.validation");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet1 = managedUserVM0.getAuthorities();
        java.time.Instant instant2 = null;
        managedUserVM0.setLastModifiedDate(instant2);
        managedUserVM0.setId((java.lang.Long) 100L);
        java.time.Instant instant6 = managedUserVM0.getLastModifiedDate();
        org.junit.Assert.assertNull(strSet1);
        org.junit.Assert.assertNull(instant6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setExpireTime((java.lang.Long) 100L);
        socialUserConnection0.setProviderUserId("");
        socialUserConnection0.setSecret("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = alunoResource1.deleteAluno((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str5 = managedUserVM4.toString();
        java.lang.String str6 = managedUserVM4.getLogin();
        java.lang.String str7 = managedUserVM4.getFirstName();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity8 = userResource3.createUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str5, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        aluno2.setPrimeiroNome("");
        java.lang.String str5 = aluno2.getPrimeiroNome();
        java.lang.Long long6 = aluno2.getMatricula();
        java.lang.Boolean boolean7 = aluno2.isHabilitadoTcc();
        java.lang.String str8 = aluno2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity9 = alunoResource1.updateAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str8, "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("error.concurrencyFailure");
        java.lang.Long long12 = socialUserConnection0.getRank();
        java.lang.String str13 = socialUserConnection0.getUserId();
        java.lang.String str14 = socialUserConnection0.getImageURL();
        java.lang.String str15 = socialUserConnection0.getProviderUserId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error.concurrencyFailure" + "'", str13, "error.concurrencyFailure");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str15, "LoginVM{username='null', rememberMe=false}");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.springframework.social.connect.ConnectionRepository connectionRepository8 = customSocialUsersConnectionRepository2.createConnectionRepository("LoginVM{username='null', rememberMe=false}");
        org.springframework.social.connect.ConnectionRepository connectionRepository10 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.util.Set<java.lang.String> strSet12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet13 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("LoginVM{username='null', rememberMe=null}", strSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(connectionRepository8);
        org.junit.Assert.assertNotNull(connectionRepository10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        java.lang.String str1 = user0.toString();
        user0.setPassword("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str4 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str1, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        aluno5.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Professor professor8 = professor0.addAluno(aluno5);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa10 = aluno5.email("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        java.lang.String str11 = pessoa10.getPrimeiroNome();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(pessoa10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "error.validation" + "'", str11, "error.validation");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet5 = user2.getAuthorities();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(authoritySet5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "Authority{name='error.concurrencyFailure'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        java.lang.Long long7 = aluno0.getId();
        com.unifacisa.tcc.domain.Aluno aluno9 = aluno0.habilitadoTcc((java.lang.Boolean) false);
        java.lang.Long long10 = aluno9.getId();
        aluno9.setNumeroContato((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa14 = aluno9.matricula((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(aluno9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(pessoa14);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM38 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet39 = managedUserVM38.getAuthorities();
        managedUserVM38.setId((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity42 = userResource3.updateUser(managedUserVM38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
        org.junit.Assert.assertNull(strSet39);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long8 = socialUserConnection0.getId();
        socialUserConnection0.setRefreshToken("Authority{name='null'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityUpdateAlert("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}", "LoggerVM{name='null', level='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.primeiroNome("hi!");
        java.lang.Long long9 = aluno2.getId();
        com.unifacisa.tcc.domain.Aluno aluno11 = aluno2.habilitadoTcc((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity12 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNotNull(aluno11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.User user4 = userMapper0.userFromId((java.lang.Long) (-1L));
        user4.setCreatedBy("error.concurrencyFailure");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        javax.persistence.metamodel.SingularAttribute<com.unifacisa.tcc.domain.PersistentAuditEvent, java.lang.Long> persistentAuditEventSingularAttribute0 = com.unifacisa.tcc.domain.PersistentAuditEvent_.id;
        org.junit.Assert.assertNull(persistentAuditEventSingularAttribute0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.createProfessor(professor8);
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str13 = professor12.toString();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor15 = null;
        aluno14.setProfessor(professor15);
        java.lang.Long long17 = aluno14.getMatricula();
        java.lang.String str18 = aluno14.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean21 = aluno19.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor22 = aluno19.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean25 = aluno23.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor28 = null;
        aluno27.setProfessor(professor28);
        java.lang.Long long30 = aluno27.getMatricula();
        java.lang.String str31 = aluno27.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean34 = aluno32.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor35 = aluno32.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor37 = null;
        aluno36.setProfessor(professor37);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        aluno39.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor43 = null;
        aluno42.setProfessor(professor43);
        aluno42.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor48 = null;
        aluno47.setProfessor(professor48);
        java.lang.Long long50 = aluno47.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno51 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean54 = aluno52.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor56 = null;
        aluno55.setProfessor(professor56);
        com.unifacisa.tcc.domain.Aluno[] alunoArray58 = new com.unifacisa.tcc.domain.Aluno[] { aluno14, aluno19, aluno23, aluno26, aluno27, aluno32, aluno36, aluno39, aluno42, aluno47, aluno51, aluno52, aluno55 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet59 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet59, alunoArray58);
        com.unifacisa.tcc.domain.Professor professor61 = professor12.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet59);
        com.unifacisa.tcc.domain.Professor professor63 = professor12.diponibilidade((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity64 = professorResource1.createProfessor(professor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professorResponseEntity11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str13, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(professor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(professor35);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(alunoArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(professor61);
        org.junit.Assert.assertNotNull(professor63);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.time.Instant instant2 = managedUserVM0.getLastModifiedDate();
        java.time.Instant instant3 = null;
        managedUserVM0.setLastModifiedDate(instant3);
        java.time.Instant instant5 = managedUserVM0.getLastModifiedDate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(instant5);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.createProfessor(professor8);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource1.getProfessor((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professorResponseEntity11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.createProfessor(professor8);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity13 = professorResource1.deleteProfessor((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professorResponseEntity11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.toString();
        java.lang.String str2 = loginVM0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LoginVM{username='null', rememberMe=null}" + "'", str1, "LoginVM{username='null', rememberMe=null}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) 10L);
        java.lang.String str6 = socialUserConnection0.getProfileURL();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("LoggerVM{name='null', level='null'}", "Authority{name='Authority{name='error.concurrencyFailure'}'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap4 = customSocialConnectionRepository3.findAllConnections();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity5 = userResource3.deleteUser("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        user2.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        user2.setImageUrl("LoggerVM{name='null', level='null'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = alunoResource1.deleteAluno((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.matricula((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity9 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoa8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.createProfessor(professor8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.unifacisa.tcc.domain.Professor> professorList12 = professorResource1.getAllProfessors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professorResponseEntity11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.unifacisa.tcc.domain.User user0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        aluno0.setPrimeiroNome("");
        java.lang.Long long3 = aluno0.getMatricula();
        java.lang.Long long4 = aluno0.getMatricula();
        aluno0.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor8 = null;
        aluno7.setProfessor(professor8);
        aluno7.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor14 = professor12.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor15 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno16 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor17 = null;
        aluno16.setProfessor(professor17);
        aluno16.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor23 = null;
        aluno22.setProfessor(professor23);
        java.lang.Long long25 = aluno22.getMatricula();
        java.lang.String str26 = aluno22.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean29 = aluno27.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor31 = null;
        aluno30.setProfessor(professor31);
        aluno30.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean37 = aluno35.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        aluno38.setPrimeiroNome("");
        java.lang.Long long41 = aluno38.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        aluno42.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray45 = new com.unifacisa.tcc.domain.Aluno[] { aluno16, aluno21, aluno22, aluno27, aluno30, aluno35, aluno38, aluno42 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet46 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet46, alunoArray45);
        professor15.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet46);
        com.unifacisa.tcc.domain.Professor professor49 = professor14.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet46);
        aluno7.setProfessor(professor49);
        aluno0.setProfessor(professor49);
        aluno0.setHabilitadoTcc((java.lang.Boolean) false);
        aluno0.setId((java.lang.Long) 1L);
        java.lang.String str56 = aluno0.getPrimeiroNome();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa58 = aluno0.segundoNome("error.concurrencyFailure");
        pessoa58.setMatricula((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(professor14);
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(long41);
        org.junit.Assert.assertNotNull(alunoArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(professor49);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(pessoa58);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 10L);
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getEmail();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user8 = userMapper6.userFromId((java.lang.Long) 100L);
        user8.setResetKey("hi!");
        user8.setFirstName("error.validation");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user15 = userMapper13.userFromId((java.lang.Long) 100L);
        user15.setLangKey("");
        java.time.Instant instant18 = user15.getResetDate();
        java.time.Instant instant19 = user15.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        aluno20.setPrimeiroNome("");
        java.lang.String str23 = aluno20.getPrimeiroNome();
        java.lang.Long long24 = aluno20.getMatricula();
        boolean boolean25 = user15.equals((java.lang.Object) aluno20);
        user15.setFirstName("");
        com.unifacisa.tcc.domain.User user28 = new com.unifacisa.tcc.domain.User();
        user28.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user28.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper33 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user35 = userMapper33.userFromId((java.lang.Long) 100L);
        user35.setLangKey("");
        java.time.Instant instant38 = user35.getResetDate();
        java.time.Instant instant39 = user35.getCreatedDate();
        user28.setResetDate(instant39);
        user15.setCreatedDate(instant39);
        user8.setResetDate(instant39);
        com.unifacisa.tcc.service.dto.UserDTO userDTO43 = new com.unifacisa.tcc.service.dto.UserDTO(user8);
        java.time.Instant instant44 = userDTO43.getCreatedDate();
        user2.setLastModifiedDate(instant44);
        user2.setActivationKey("Authority{name='null'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNull(instant38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant44);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity3 = alunoResource1.getAluno((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", "Authority{name='error.concurrencyFailure'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("error.concurrencyFailure", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM keyAndPasswordVM0 = new com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM();
        keyAndPasswordVM0.setKey("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        keyAndPasswordVM0.setKey("");
        keyAndPasswordVM0.setNewPassword("LoginVM{username='null', rememberMe=false}");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderUserId("error.concurrencyFailure");
        socialUserConnection0.setProviderId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "LoggerVM{name='null', level='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity5 = userResource3.deleteUser("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("", "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProfileURL("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet5 = managedUserVM4.getAuthorities();
        java.time.Instant instant6 = null;
        managedUserVM4.setLastModifiedDate(instant6);
        java.lang.String str8 = managedUserVM4.toString();
        java.time.Instant instant9 = null;
        managedUserVM4.setLastModifiedDate(instant9);
        java.lang.String str11 = managedUserVM4.getLangKey();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity12 = userResource3.createUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str8, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.time.Instant instant10 = null;
        java.time.Instant instant12 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        com.unifacisa.tcc.service.dto.UserDTO userDTO30 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant22, "hi!", instant24, (java.util.Set<java.lang.String>) strSet28);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM31 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 0L, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", "hi!", "hi!", "", true, "hi!", "", "", instant10, "", instant12, (java.util.Set<java.lang.String>) strSet28);
        java.time.Instant instant32 = managedUserVM31.getCreatedDate();
        java.lang.String str33 = managedUserVM31.getCreatedBy();
        java.time.Instant instant34 = managedUserVM31.getLastModifiedDate();
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(instant32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(instant34);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.springframework.social.connect.ConnectionRepository connectionRepository8 = customSocialUsersConnectionRepository2.createConnectionRepository("LoginVM{username='null', rememberMe=false}");
        org.springframework.social.connect.ConnectionRepository connectionRepository10 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.time.Instant instant34 = null;
        java.time.Instant instant36 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        com.unifacisa.tcc.service.dto.UserDTO userDTO42 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant34, "hi!", instant36, (java.util.Set<java.lang.String>) strSet40);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM43 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", false, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoginVM{username='null', rememberMe=false}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant22, "hi!", instant24, (java.util.Set<java.lang.String>) strSet40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet44 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}", (java.util.Set<java.lang.String>) strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(connectionRepository8);
        org.junit.Assert.assertNotNull(connectionRepository10);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Authority{name='error.concurrencyFailure'}", "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.createProfessor(professor8);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource1.getProfessor((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professorResponseEntity11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setProviderUserId("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}");
        socialUserConnection0.setUserId("Authority{name='null'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        loginVM0.setPassword("");
        loginVM0.setPassword("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        loginVM0.setRememberMe((java.lang.Boolean) true);
        loginVM0.setUsername("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        loginVM0.setRememberMe((java.lang.Boolean) true);
        loginVM0.setUsername("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        aluno0.setPrimeiroNome("error.validation");
        aluno0.setId((java.lang.Long) 0L);
        java.lang.String str5 = aluno0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Aluno{id=0, primeiroNome='error.validation', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str5, "Aluno{id=0, primeiroNome='error.validation', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        java.lang.String str4 = socialUserConnection0.getDisplayName();
        java.lang.String str5 = socialUserConnection0.getProviderUserId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setDisplayName("Authority{name='error.concurrencyFailure'}");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity3 = alunoResource1.deleteAluno((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 10L);
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getEmail();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user8 = userMapper6.userFromId((java.lang.Long) 100L);
        user8.setResetKey("hi!");
        user8.setFirstName("error.validation");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user15 = userMapper13.userFromId((java.lang.Long) 100L);
        user15.setLangKey("");
        java.time.Instant instant18 = user15.getResetDate();
        java.time.Instant instant19 = user15.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        aluno20.setPrimeiroNome("");
        java.lang.String str23 = aluno20.getPrimeiroNome();
        java.lang.Long long24 = aluno20.getMatricula();
        boolean boolean25 = user15.equals((java.lang.Object) aluno20);
        user15.setFirstName("");
        com.unifacisa.tcc.domain.User user28 = new com.unifacisa.tcc.domain.User();
        user28.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user28.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper33 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user35 = userMapper33.userFromId((java.lang.Long) 100L);
        user35.setLangKey("");
        java.time.Instant instant38 = user35.getResetDate();
        java.time.Instant instant39 = user35.getCreatedDate();
        user28.setResetDate(instant39);
        user15.setCreatedDate(instant39);
        user8.setResetDate(instant39);
        com.unifacisa.tcc.service.dto.UserDTO userDTO43 = new com.unifacisa.tcc.service.dto.UserDTO(user8);
        java.time.Instant instant44 = userDTO43.getCreatedDate();
        user2.setLastModifiedDate(instant44);
        user2.setEmail("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNull(instant38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant44);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        user2.setId((java.lang.Long) 0L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user10 = userMapper8.userFromId((java.lang.Long) 100L);
        user10.setResetKey("hi!");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user15 = userMapper13.userFromId((java.lang.Long) 100L);
        user15.setLangKey("");
        java.time.Instant instant18 = user15.getResetDate();
        java.time.Instant instant19 = user15.getCreatedDate();
        user10.setResetDate(instant19);
        user2.setResetDate(instant19);
        com.unifacisa.tcc.service.dto.UserDTO userDTO22 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        java.lang.String str23 = userDTO22.getFirstName();
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent24 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        persistentAuditEvent24.setData(strMap25);
        persistentAuditEvent24.setAuditEventType("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.User user38 = new com.unifacisa.tcc.domain.User();
        user38.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user38.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant43 = user38.getLastModifiedDate();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper45 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user47 = userMapper45.userFromId((java.lang.Long) 100L);
        user47.setLangKey("");
        java.time.Instant instant50 = user47.getResetDate();
        java.time.Instant instant51 = user47.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        aluno52.setPrimeiroNome("");
        java.lang.String str55 = aluno52.getPrimeiroNome();
        java.lang.Long long56 = aluno52.getMatricula();
        boolean boolean57 = user47.equals((java.lang.Object) aluno52);
        user47.setFirstName("");
        com.unifacisa.tcc.domain.User user60 = new com.unifacisa.tcc.domain.User();
        user60.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user60.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper65 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user67 = userMapper65.userFromId((java.lang.Long) 100L);
        user67.setLangKey("");
        java.time.Instant instant70 = user67.getResetDate();
        java.time.Instant instant71 = user67.getCreatedDate();
        user60.setResetDate(instant71);
        user47.setCreatedDate(instant71);
        java.util.Set<java.lang.String> strSet74 = null;
        com.unifacisa.tcc.service.dto.UserDTO userDTO75 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", "error.concurrencyFailure", "LoginVM{username='null', rememberMe=false}", true, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant43, "", instant71, strSet74);
        persistentAuditEvent24.setAuditEventDate(instant71);
        userDTO22.setLastModifiedDate(instant71);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNull(instant50);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(long56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNull(instant70);
        org.junit.Assert.assertNotNull(instant71);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}", "error.concurrencyFailure");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.springframework.social.connect.ConnectionRepository connectionRepository8 = customSocialUsersConnectionRepository2.createConnectionRepository("LoginVM{username='null', rememberMe=false}");
        org.springframework.social.connect.ConnectionRepository connectionRepository10 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.time.Instant instant34 = null;
        java.time.Instant instant36 = null;
        java.lang.String[] strArray39 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        com.unifacisa.tcc.service.dto.UserDTO userDTO42 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant34, "hi!", instant36, (java.util.Set<java.lang.String>) strSet40);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM43 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", false, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoginVM{username='null', rememberMe=false}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant22, "hi!", instant24, (java.util.Set<java.lang.String>) strSet40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet44 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", (java.util.Set<java.lang.String>) strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(connectionRepository8);
        org.junit.Assert.assertNotNull(connectionRepository10);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("error.concurrencyFailure");
        java.lang.Long long12 = socialUserConnection0.getRank();
        socialUserConnection0.setUserId("");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration15 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        boolean boolean16 = socialUserConnection0.equals((java.lang.Object) loggingAspectConfiguration15);
        org.springframework.core.env.Environment environment17 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect18 = loggingAspectConfiguration15.loggingAspect(environment17);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = loggingAspect18.logAround(proceedingJoinPoint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(loggingAspect18);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        user2.setFirstName("error.validation");
        java.lang.String str7 = user2.getActivationKey();
        java.lang.String str8 = user2.getPassword();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user0.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper5 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user7 = userMapper5.userFromId((java.lang.Long) 100L);
        user7.setLangKey("");
        java.time.Instant instant10 = user7.getResetDate();
        java.time.Instant instant11 = user7.getCreatedDate();
        user0.setResetDate(instant11);
        boolean boolean13 = user0.getActivated();
        user0.setLangKey("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant16 = user0.getCreatedDate();
        user0.setEmail("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        com.unifacisa.tcc.domain.User user19 = new com.unifacisa.tcc.domain.User();
        user19.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM22 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet23 = managedUserVM22.getAuthorities();
        boolean boolean24 = user19.equals((java.lang.Object) strSet23);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper25 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray26 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList27 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList27, userArray26);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList29 = userMapper25.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList27);
        java.time.Instant instant40 = null;
        java.time.Instant instant42 = null;
        java.time.Instant instant52 = null;
        java.time.Instant instant54 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        com.unifacisa.tcc.service.dto.UserDTO userDTO60 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant52, "hi!", instant54, (java.util.Set<java.lang.String>) strSet58);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM61 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant40, "", instant42, (java.util.Set<java.lang.String>) strSet58);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet62 = userMapper25.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet58);
        user19.setAuthorities(authoritySet62);
        user0.setAuthorities(authoritySet62);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(instant10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userDTOList29);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(authoritySet62);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        loggingAspect2.springBeanPointcut();
        loggingAspect2.applicationPackagePointcut();
        org.aspectj.lang.JoinPoint joinPoint5 = null;
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            loggingAspect2.logAfterThrowing(joinPoint5, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet1 = managedUserVM0.getAuthorities();
        java.time.Instant instant2 = null;
        managedUserVM0.setLastModifiedDate(instant2);
        java.lang.String str4 = managedUserVM0.toString();
        java.lang.Long long5 = managedUserVM0.getId();
        org.junit.Assert.assertNull(strSet1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str4, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity39 = userResource3.getUser("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        loggingAspect2.springBeanPointcut();
        org.aspectj.lang.JoinPoint joinPoint4 = null;
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            loggingAspect2.logAfterThrowing(joinPoint4, throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        aluno7.setPrimeiroNome("");
        java.lang.String str10 = aluno7.getPrimeiroNome();
        java.lang.Long long11 = aluno7.getMatricula();
        boolean boolean12 = user2.equals((java.lang.Object) aluno7);
        com.unifacisa.tcc.domain.User user13 = new com.unifacisa.tcc.domain.User();
        user13.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user13.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant18 = user13.getLastModifiedDate();
        user2.setCreatedDate(instant18);
        user2.setLastModifiedBy("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}");
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet22 = user2.getAuthorities();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(authoritySet22);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        aluno5.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Professor professor8 = professor0.addAluno(aluno5);
        java.lang.Long long9 = aluno5.getNumeroContato();
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor11 = null;
        aluno10.setProfessor(professor11);
        aluno10.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor15 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor17 = professor15.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor18 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor20 = null;
        aluno19.setProfessor(professor20);
        aluno19.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor26 = null;
        aluno25.setProfessor(professor26);
        java.lang.Long long28 = aluno25.getMatricula();
        java.lang.String str29 = aluno25.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean32 = aluno30.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor34 = null;
        aluno33.setProfessor(professor34);
        aluno33.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean40 = aluno38.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno41 = new com.unifacisa.tcc.domain.Aluno();
        aluno41.setPrimeiroNome("");
        java.lang.Long long44 = aluno41.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        aluno45.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray48 = new com.unifacisa.tcc.domain.Aluno[] { aluno19, aluno24, aluno25, aluno30, aluno33, aluno38, aluno41, aluno45 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet49 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet49, alunoArray48);
        professor18.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet49);
        com.unifacisa.tcc.domain.Professor professor52 = professor17.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet49);
        aluno10.setProfessor(professor52);
        aluno5.setProfessor(professor52);
        com.unifacisa.tcc.domain.Professor professor55 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor57 = professor55.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa59 = professor55.email("");
        com.unifacisa.tcc.domain.Professor professor61 = professor55.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor62 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor64 = professor62.diponibilidade((java.lang.Boolean) true);
        professor64.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        aluno67.setPrimeiroNome("");
        java.lang.Long long70 = aluno67.getMatricula();
        aluno67.setHabilitadoTcc((java.lang.Boolean) false);
        aluno67.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno75 = new com.unifacisa.tcc.domain.Aluno();
        aluno75.setPrimeiroNome("");
        java.lang.Long long78 = aluno75.getMatricula();
        java.lang.Long long79 = aluno75.getMatricula();
        aluno75.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno82 = new com.unifacisa.tcc.domain.Aluno();
        aluno82.setPrimeiroNome("");
        java.lang.Long long85 = aluno82.getMatricula();
        java.lang.Long long86 = aluno82.getMatricula();
        aluno82.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno89 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray90 = new com.unifacisa.tcc.domain.Aluno[] { aluno67, aluno75, aluno82, aluno89 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet91 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet91, alunoArray90);
        com.unifacisa.tcc.domain.Professor professor93 = professor64.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet91);
        com.unifacisa.tcc.domain.Professor professor94 = professor61.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet91);
        professor52.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet91);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNotNull(professor17);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(long44);
        org.junit.Assert.assertNotNull(alunoArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(professor52);
        org.junit.Assert.assertNotNull(professor57);
        org.junit.Assert.assertNotNull(pessoa59);
        org.junit.Assert.assertNotNull(professor61);
        org.junit.Assert.assertNotNull(professor64);
        org.junit.Assert.assertNull(long70);
        org.junit.Assert.assertNull(long78);
        org.junit.Assert.assertNull(long79);
        org.junit.Assert.assertNull(long85);
        org.junit.Assert.assertNull(long86);
        org.junit.Assert.assertNotNull(alunoArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(professor93);
        org.junit.Assert.assertNotNull(professor94);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("error.concurrencyFailure");
        java.lang.Long long12 = socialUserConnection0.getRank();
        socialUserConnection0.setUserId("");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration15 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        boolean boolean16 = socialUserConnection0.equals((java.lang.Object) loggingAspectConfiguration15);
        java.lang.String str17 = socialUserConnection0.getRefreshToken();
        java.lang.String str18 = socialUserConnection0.getProfileURL();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str18, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.primeiroNome("hi!");
        java.lang.Long long9 = aluno2.getId();
        com.unifacisa.tcc.domain.Aluno aluno11 = aluno2.habilitadoTcc((java.lang.Boolean) false);
        aluno2.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor14 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str15 = professor14.toString();
        com.unifacisa.tcc.domain.Aluno aluno16 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor17 = null;
        aluno16.setProfessor(professor17);
        java.lang.Long long19 = aluno16.getMatricula();
        java.lang.String str20 = aluno16.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean23 = aluno21.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor24 = aluno21.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean27 = aluno25.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor30 = null;
        aluno29.setProfessor(professor30);
        java.lang.Long long32 = aluno29.getMatricula();
        java.lang.String str33 = aluno29.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno34 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean36 = aluno34.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor37 = aluno34.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor39 = null;
        aluno38.setProfessor(professor39);
        com.unifacisa.tcc.domain.Aluno aluno41 = new com.unifacisa.tcc.domain.Aluno();
        aluno41.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno44 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor45 = null;
        aluno44.setProfessor(professor45);
        aluno44.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno49 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor50 = null;
        aluno49.setProfessor(professor50);
        java.lang.Long long52 = aluno49.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno54 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean56 = aluno54.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor58 = null;
        aluno57.setProfessor(professor58);
        com.unifacisa.tcc.domain.Aluno[] alunoArray60 = new com.unifacisa.tcc.domain.Aluno[] { aluno16, aluno21, aluno25, aluno28, aluno29, aluno34, aluno38, aluno41, aluno44, aluno49, aluno53, aluno54, aluno57 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet61 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet61, alunoArray60);
        com.unifacisa.tcc.domain.Professor professor63 = professor14.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet61);
        com.unifacisa.tcc.domain.Aluno aluno64 = aluno2.professor(professor14);
        com.unifacisa.tcc.domain.Aluno aluno66 = aluno64.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor67 = aluno66.getProfessor();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity68 = alunoResource1.createAluno(aluno66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNotNull(aluno11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(professor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(professor37);
        org.junit.Assert.assertNull(long52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(alunoArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(professor63);
        org.junit.Assert.assertNotNull(aluno64);
        org.junit.Assert.assertNotNull(aluno66);
        org.junit.Assert.assertNotNull(professor67);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity5 = userResource3.deleteUser("LoginVM{username='null', rememberMe=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "Authority{name='Authority{name='error.concurrencyFailure'}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.social.connect.Connection<?> wildcardConnection5 = customSocialConnectionRepository3.getConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity3 = professorResource1.getProfessor((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("error.concurrencyFailure");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = loggingAspect2.logAround(proceedingJoinPoint3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor7 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor9 = professor7.diponibilidade((java.lang.Boolean) true);
        professor9.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        aluno12.setPrimeiroNome("");
        java.lang.Long long15 = aluno12.getMatricula();
        aluno12.setHabilitadoTcc((java.lang.Boolean) false);
        aluno12.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        aluno20.setPrimeiroNome("");
        java.lang.Long long23 = aluno20.getMatricula();
        java.lang.Long long24 = aluno20.getMatricula();
        aluno20.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        aluno27.setPrimeiroNome("");
        java.lang.Long long30 = aluno27.getMatricula();
        java.lang.Long long31 = aluno27.getMatricula();
        aluno27.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno34 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray35 = new com.unifacisa.tcc.domain.Aluno[] { aluno12, aluno20, aluno27, aluno34 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet36 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet36, alunoArray35);
        com.unifacisa.tcc.domain.Professor professor38 = professor9.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        com.unifacisa.tcc.domain.Aluno aluno39 = aluno2.professor(professor38);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa41 = aluno39.segundoNome("");
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor43 = null;
        aluno42.setProfessor(professor43);
        aluno42.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor47 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor49 = professor47.diponibilidade((java.lang.Boolean) true);
        professor49.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        aluno52.setPrimeiroNome("");
        java.lang.Long long55 = aluno52.getMatricula();
        aluno52.setHabilitadoTcc((java.lang.Boolean) false);
        aluno52.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno60 = new com.unifacisa.tcc.domain.Aluno();
        aluno60.setPrimeiroNome("");
        java.lang.Long long63 = aluno60.getMatricula();
        java.lang.Long long64 = aluno60.getMatricula();
        aluno60.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        aluno67.setPrimeiroNome("");
        java.lang.Long long70 = aluno67.getMatricula();
        java.lang.Long long71 = aluno67.getMatricula();
        aluno67.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno74 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray75 = new com.unifacisa.tcc.domain.Aluno[] { aluno52, aluno60, aluno67, aluno74 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet76 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet76, alunoArray75);
        com.unifacisa.tcc.domain.Professor professor78 = professor49.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet76);
        com.unifacisa.tcc.domain.Aluno aluno79 = aluno42.professor(professor78);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa81 = aluno79.segundoNome("");
        boolean boolean82 = aluno39.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity83 = alunoResource1.createAluno(aluno39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor9);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(alunoArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(professor38);
        org.junit.Assert.assertNotNull(aluno39);
        org.junit.Assert.assertNotNull(pessoa41);
        org.junit.Assert.assertNotNull(professor49);
        org.junit.Assert.assertNull(long55);
        org.junit.Assert.assertNull(long63);
        org.junit.Assert.assertNull(long64);
        org.junit.Assert.assertNull(long70);
        org.junit.Assert.assertNull(long71);
        org.junit.Assert.assertNotNull(alunoArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(professor78);
        org.junit.Assert.assertNotNull(aluno79);
        org.junit.Assert.assertNotNull(pessoa81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity39 = userResource3.getUser("LoggerVM{name='null', level='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.time.Instant instant2 = managedUserVM0.getLastModifiedDate();
        java.time.Instant instant3 = null;
        managedUserVM0.setLastModifiedDate(instant3);
        java.lang.String str5 = managedUserVM0.getLogin();
        java.lang.String str6 = managedUserVM0.toString();
        java.time.Instant instant7 = managedUserVM0.getCreatedDate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str6, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        com.unifacisa.tcc.service.dto.UserDTO userDTO6 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        java.lang.String str7 = userDTO6.toString();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=2021-03-26T03:34:08.443Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.443Z, authorities=[]}" + "'", str7, "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=2021-03-26T03:34:08.443Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.443Z, authorities=[]}");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getPassword();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        loginVM0.setUsername("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        loginVM0.setRememberMe((java.lang.Boolean) true);
        java.lang.String str8 = loginVM0.getUsername();
        java.lang.String str9 = loginVM0.toString();
        loginVM0.setPassword("Authority{name='error.concurrencyFailure'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str8, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=true}" + "'", str9, "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=true}");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.Long long5 = managedUserVM4.getId();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity6 = userResource3.createUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        org.springframework.core.env.Environment environment3 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect4 = loggingAspectConfiguration0.loggingAspect(environment3);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = loggingAspect4.logAround(proceedingJoinPoint5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
        org.junit.Assert.assertNotNull(loggingAspect4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray7 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList8 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList8, userArray7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper6.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList8);
        java.time.Instant instant21 = null;
        java.time.Instant instant23 = null;
        java.time.Instant instant33 = null;
        java.time.Instant instant35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant33, "hi!", instant35, (java.util.Set<java.lang.String>) strSet39);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant21, "", instant23, (java.util.Set<java.lang.String>) strSet39);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet43 = userMapper6.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet39);
        user0.setAuthorities(authoritySet43);
        com.unifacisa.tcc.service.dto.UserDTO userDTO45 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.time.Instant instant46 = userDTO45.getCreatedDate();
        java.lang.String str47 = userDTO45.toString();
        userDTO45.setLogin("LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
        org.junit.Assert.assertNotNull(instant46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:08.859Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.859Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}" + "'", str47, "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:08.859Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.859Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.Long long6 = socialUserConnection0.getExpireTime();
        socialUserConnection0.setImageURL("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=true}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long7 = professor2.getId();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa9 = professor2.segundoNome("LoggerVM{name='null', level='null'}");
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet10 = professor2.getAlunos();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(pessoa9);
        org.junit.Assert.assertNotNull(alunoSet10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean4 = aluno2.equals((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity5 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.Long long6 = socialUserConnection0.getExpireTime();
        socialUserConnection0.setDisplayName("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        user2.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        user2.setLastModifiedBy("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        user2.setLangKey("LoggerVM{name='null', level='null'}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray14 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList15 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList15, userArray14);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList17 = userMapper13.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList15);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper18 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray19 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList20 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList20, userArray19);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList22 = userMapper18.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList20);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList23 = userMapper13.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList20);
        com.unifacisa.tcc.domain.User user24 = new com.unifacisa.tcc.domain.User();
        user24.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM27 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet28 = managedUserVM27.getAuthorities();
        boolean boolean29 = user24.equals((java.lang.Object) strSet28);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper30 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray31 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList32 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList32, userArray31);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList34 = userMapper30.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList32);
        java.time.Instant instant45 = null;
        java.time.Instant instant47 = null;
        java.time.Instant instant57 = null;
        java.time.Instant instant59 = null;
        java.lang.String[] strArray62 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        com.unifacisa.tcc.service.dto.UserDTO userDTO65 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant57, "hi!", instant59, (java.util.Set<java.lang.String>) strSet63);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM66 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant45, "", instant47, (java.util.Set<java.lang.String>) strSet63);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet67 = userMapper30.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet63);
        user24.setAuthorities(authoritySet67);
        java.lang.String str69 = user24.getFirstName();
        user24.setId((java.lang.Long) 10L);
        com.unifacisa.tcc.service.dto.UserDTO userDTO72 = userMapper13.userToUserDTO(user24);
        com.unifacisa.tcc.domain.User user74 = userMapper13.userFromId((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.User user76 = userMapper13.userFromId((java.lang.Long) (-1L));
        java.time.Instant instant87 = null;
        java.time.Instant instant89 = null;
        java.lang.String[] strArray94 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet95 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet95, strArray94);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM97 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant87, "error.concurrencyFailure", instant89, (java.util.Set<java.lang.String>) strSet95);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet98 = userMapper13.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet95);
        user2.setAuthorities(authoritySet98);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(userArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userDTOList17);
        org.junit.Assert.assertNotNull(userArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userDTOList22);
        org.junit.Assert.assertNotNull(userDTOList23);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userDTOList34);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(authoritySet67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(userDTO72);
        org.junit.Assert.assertNotNull(user74);
        org.junit.Assert.assertNotNull(user76);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(authoritySet98);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM0.setName("LoginVM{username='null', rememberMe=false}");
        java.lang.String str3 = loggerVM0.getLevel();
        java.lang.String str4 = loggerVM0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}" + "'", str4, "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.time.Instant instant9 = null;
        com.unifacisa.tcc.service.mapper.UserMapper userMapper20 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user22 = userMapper20.userFromId((java.lang.Long) 100L);
        user22.setLangKey("");
        java.time.Instant instant25 = user22.getResetDate();
        java.time.Instant instant26 = user22.getCreatedDate();
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent28 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        persistentAuditEvent28.setData(strMap29);
        persistentAuditEvent28.setAuditEventType("hi!");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent33 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant34 = null;
        persistentAuditEvent33.setAuditEventDate(instant34);
        com.unifacisa.tcc.domain.User user36 = new com.unifacisa.tcc.domain.User();
        user36.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user36.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper41 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user43 = userMapper41.userFromId((java.lang.Long) 100L);
        user43.setLangKey("");
        java.time.Instant instant46 = user43.getResetDate();
        java.time.Instant instant47 = user43.getCreatedDate();
        user36.setResetDate(instant47);
        persistentAuditEvent33.setAuditEventDate(instant47);
        persistentAuditEvent28.setAuditEventDate(instant47);
        java.time.Instant instant61 = null;
        java.time.Instant instant63 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM71 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant61, "error.concurrencyFailure", instant63, (java.util.Set<java.lang.String>) strSet69);
        com.unifacisa.tcc.service.dto.UserDTO userDTO72 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 0L, "hi!", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", true, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", instant26, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant47, (java.util.Set<java.lang.String>) strSet69);
        java.time.Instant instant83 = null;
        java.time.Instant instant85 = null;
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet91 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet91, strArray90);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM93 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant83, "error.concurrencyFailure", instant85, (java.util.Set<java.lang.String>) strSet91);
        com.unifacisa.tcc.service.dto.UserDTO userDTO94 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "LoggerVM{name='null', level='null'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "error.validation", "error.validation", false, "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant9, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", instant26, (java.util.Set<java.lang.String>) strSet91);
        userDTO94.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNull(instant25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNull(instant46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.time.Instant instant10 = null;
        java.time.Instant instant12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM20 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant10, "error.concurrencyFailure", instant12, (java.util.Set<java.lang.String>) strSet18);
        managedUserVM20.setLogin("");
        java.lang.String str23 = managedUserVM20.getCreatedBy();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str23, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        user2.setFirstName("error.validation");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper7 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user9 = userMapper7.userFromId((java.lang.Long) 100L);
        user9.setLangKey("");
        java.time.Instant instant12 = user9.getResetDate();
        java.time.Instant instant13 = user9.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        aluno14.setPrimeiroNome("");
        java.lang.String str17 = aluno14.getPrimeiroNome();
        java.lang.Long long18 = aluno14.getMatricula();
        boolean boolean19 = user9.equals((java.lang.Object) aluno14);
        user9.setFirstName("");
        com.unifacisa.tcc.domain.User user22 = new com.unifacisa.tcc.domain.User();
        user22.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user22.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper27 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user29 = userMapper27.userFromId((java.lang.Long) 100L);
        user29.setLangKey("");
        java.time.Instant instant32 = user29.getResetDate();
        java.time.Instant instant33 = user29.getCreatedDate();
        user22.setResetDate(instant33);
        user9.setCreatedDate(instant33);
        user2.setResetDate(instant33);
        user2.setPassword("hi!");
        java.lang.String str39 = user2.toString();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(instant12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNull(instant32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "User{login='null', firstName='error.validation', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str39, "User{login='null', firstName='error.validation', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor3 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno4 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor5 = null;
        aluno4.setProfessor(professor5);
        aluno4.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno9 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor11 = null;
        aluno10.setProfessor(professor11);
        java.lang.Long long13 = aluno10.getMatricula();
        java.lang.String str14 = aluno10.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean17 = aluno15.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor19 = null;
        aluno18.setProfessor(professor19);
        aluno18.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean25 = aluno23.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        aluno26.setPrimeiroNome("");
        java.lang.Long long29 = aluno26.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        aluno30.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray33 = new com.unifacisa.tcc.domain.Aluno[] { aluno4, aluno9, aluno10, aluno15, aluno18, aluno23, aluno26, aluno30 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet34 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet34, alunoArray33);
        professor3.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet34);
        com.unifacisa.tcc.domain.Professor professor37 = professor2.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet34);
        com.unifacisa.tcc.domain.Professor professor39 = professor37.diponibilidade((java.lang.Boolean) true);
        professor37.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant43 = managedUserVM42.getCreatedDate();
        boolean boolean44 = professor37.equals((java.lang.Object) instant43);
        com.unifacisa.tcc.domain.Professor professor46 = professor37.diponibilidade((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNotNull(alunoArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNull(instant43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(professor46);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        java.lang.String str8 = socialUserConnection0.getProviderId();
        java.lang.String str9 = socialUserConnection0.getSecret();
        socialUserConnection0.setRefreshToken("error.validation");
        java.lang.String str12 = socialUserConnection0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str8, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=null, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='error.validation', expireTime=null}" + "'", str12, "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=null, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='error.validation', expireTime=null}");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        loginVM0.setPassword("");
        loginVM0.setUsername("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str5 = loginVM0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LoginVM{username='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', rememberMe=null}" + "'", str5, "LoginVM{username='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', rememberMe=null}");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getPassword();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        java.lang.String str4 = loginVM0.toString();
        java.lang.String str5 = loginVM0.getUsername();
        loginVM0.setPassword("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str4, "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        boolean boolean2 = managedUserVM0.isActivated();
        managedUserVM0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("", "Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.createProfessor(professor8);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity13 = professorResource1.deleteProfessor((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professorResponseEntity11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        user2.setCreatedBy("Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.Long long1 = aluno0.getId();
        aluno0.setHabilitadoTcc((java.lang.Boolean) true);
        java.lang.Long long4 = aluno0.getId();
        java.lang.Long long5 = aluno0.getNumeroContato();
        aluno0.setPrimeiroNome("Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap4 = customSocialConnectionRepository3.findAllConnections();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        java.lang.String str1 = user0.toString();
        user0.setLastModifiedBy("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        java.lang.String str4 = user0.getLangKey();
        java.lang.String str5 = user0.getPassword();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str1, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList38 = userResource3.getAuthorities();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.http.HttpHeaders httpHeaders6 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap7 = customSocialConnectionRepository3.findConnectionsToUsers((org.springframework.util.MultiValueMap<java.lang.String, java.lang.String>) httpHeaders6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpHeaders6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Professor professor6 = professor0.diponibilidade((java.lang.Boolean) true);
        java.lang.Long long7 = professor0.getId();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.primeiroNome("hi!");
        java.lang.Long long9 = aluno2.getId();
        com.unifacisa.tcc.domain.Aluno aluno11 = aluno2.habilitadoTcc((java.lang.Boolean) false);
        java.lang.Long long12 = aluno11.getId();
        aluno11.setNumeroContato((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity15 = alunoResource1.updateAluno(aluno11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNotNull(aluno11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM1.setName("LoginVM{username='null', rememberMe=false}");
        logsResource0.changeLevel(loggerVM1);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList5 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM6 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str7 = loggerVM6.getName();
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name argument cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggerVMList5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor7 = null;
        aluno6.setProfessor(professor7);
        aluno6.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor13 = null;
        aluno12.setProfessor(professor13);
        java.lang.Long long15 = aluno12.getMatricula();
        java.lang.String str16 = aluno12.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean19 = aluno17.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor21 = null;
        aluno20.setProfessor(professor21);
        aluno20.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean27 = aluno25.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        aluno28.setPrimeiroNome("");
        java.lang.Long long31 = aluno28.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        aluno32.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray35 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno11, aluno12, aluno17, aluno20, aluno25, aluno28, aluno32 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet36 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet36, alunoArray35);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        com.unifacisa.tcc.domain.Professor professor39 = professor4.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        java.lang.Long long40 = professor39.getMatricula();
        java.lang.Long long41 = professor39.getNumeroContato();
        java.lang.Long long42 = professor39.getMatricula();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity43 = professorResource1.createProfessor(professor39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(alunoArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNull(long41);
        org.junit.Assert.assertNull(long42);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity5 = userResource3.getUser("SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("error.validation");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        socialUserConnection0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}", "Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        aluno7.setPrimeiroNome("");
        java.lang.String str10 = aluno7.getPrimeiroNome();
        java.lang.Long long11 = aluno7.getMatricula();
        boolean boolean12 = user2.equals((java.lang.Object) aluno7);
        user2.setFirstName("");
        com.unifacisa.tcc.domain.User user15 = new com.unifacisa.tcc.domain.User();
        user15.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user15.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper20 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user22 = userMapper20.userFromId((java.lang.Long) 100L);
        user22.setLangKey("");
        java.time.Instant instant25 = user22.getResetDate();
        java.time.Instant instant26 = user22.getCreatedDate();
        user15.setResetDate(instant26);
        user2.setCreatedDate(instant26);
        user2.setLastName("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNull(instant25);
        org.junit.Assert.assertNotNull(instant26);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM keyAndPasswordVM0 = new com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM();
        keyAndPasswordVM0.setKey("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        keyAndPasswordVM0.setNewPassword("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        keyAndPasswordVM0.setKey("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        keyAndPasswordVM0.setKey("hi!");
        java.lang.String str9 = keyAndPasswordVM0.getKey();
        java.lang.String str10 = keyAndPasswordVM0.getNewPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str10, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        java.time.Instant instant15 = null;
        java.time.Instant instant17 = null;
        java.time.Instant instant27 = null;
        java.time.Instant instant29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        com.unifacisa.tcc.service.dto.UserDTO userDTO35 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant27, "hi!", instant29, (java.util.Set<java.lang.String>) strSet33);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM36 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant15, "", instant17, (java.util.Set<java.lang.String>) strSet33);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet37 = userMapper0.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet33);
        com.unifacisa.tcc.domain.User user38 = new com.unifacisa.tcc.domain.User();
        user38.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user38.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper43 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user45 = userMapper43.userFromId((java.lang.Long) 100L);
        user45.setLangKey("");
        java.time.Instant instant48 = user45.getResetDate();
        java.time.Instant instant49 = user45.getCreatedDate();
        user38.setResetDate(instant49);
        java.time.Instant instant51 = null;
        user38.setCreatedDate(instant51);
        java.lang.String str53 = user38.getLastModifiedBy();
        com.unifacisa.tcc.domain.User user54 = new com.unifacisa.tcc.domain.User();
        java.lang.String str55 = user54.toString();
        boolean boolean56 = user38.equals((java.lang.Object) user54);
        user38.setEmail("");
        com.unifacisa.tcc.service.dto.UserDTO userDTO59 = userMapper0.userToUserDTO(user38);
        java.util.Set<java.lang.String> strSet60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet61 = userMapper0.authoritiesFromStrings(strSet60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(authoritySet37);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNull(instant48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str55, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(userDTO59);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        java.lang.String str8 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str8, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository2 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource3 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository2);
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor6 = professor4.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = professor4.email("");
        com.unifacisa.tcc.domain.Professor professor10 = professor4.diponibilidade((java.lang.Boolean) true);
        professor10.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource3.createProfessor(professor10);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity14 = professorResource1.createProfessor(professor10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity16 = professorResource1.deleteProfessor((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNotNull(professorResponseEntity13);
        org.junit.Assert.assertNotNull(professorResponseEntity14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        java.lang.Long long7 = aluno0.getId();
        com.unifacisa.tcc.domain.Aluno aluno9 = aluno0.habilitadoTcc((java.lang.Boolean) false);
        aluno0.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str13 = professor12.toString();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor15 = null;
        aluno14.setProfessor(professor15);
        java.lang.Long long17 = aluno14.getMatricula();
        java.lang.String str18 = aluno14.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean21 = aluno19.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor22 = aluno19.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean25 = aluno23.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor28 = null;
        aluno27.setProfessor(professor28);
        java.lang.Long long30 = aluno27.getMatricula();
        java.lang.String str31 = aluno27.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean34 = aluno32.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor35 = aluno32.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor37 = null;
        aluno36.setProfessor(professor37);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        aluno39.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor43 = null;
        aluno42.setProfessor(professor43);
        aluno42.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor48 = null;
        aluno47.setProfessor(professor48);
        java.lang.Long long50 = aluno47.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno51 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean54 = aluno52.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor56 = null;
        aluno55.setProfessor(professor56);
        com.unifacisa.tcc.domain.Aluno[] alunoArray58 = new com.unifacisa.tcc.domain.Aluno[] { aluno14, aluno19, aluno23, aluno26, aluno27, aluno32, aluno36, aluno39, aluno42, aluno47, aluno51, aluno52, aluno55 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet59 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet59, alunoArray58);
        com.unifacisa.tcc.domain.Professor professor61 = professor12.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet59);
        com.unifacisa.tcc.domain.Aluno aluno62 = aluno0.professor(professor12);
        com.unifacisa.tcc.domain.Aluno aluno64 = aluno62.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa66 = aluno62.matricula((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(aluno9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str13, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(professor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(professor35);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(alunoArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(professor61);
        org.junit.Assert.assertNotNull(aluno62);
        org.junit.Assert.assertNotNull(aluno64);
        org.junit.Assert.assertNotNull(pessoa66);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        aluno0.setPrimeiroNome("");
        java.lang.Long long3 = aluno0.getMatricula();
        java.lang.Long long4 = aluno0.getMatricula();
        aluno0.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno0.email("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        com.unifacisa.tcc.domain.Aluno aluno10 = aluno0.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor12 = null;
        aluno11.setProfessor(professor12);
        aluno11.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa17 = aluno11.primeiroNome("hi!");
        java.lang.Long long18 = aluno11.getId();
        com.unifacisa.tcc.domain.Aluno aluno20 = aluno11.habilitadoTcc((java.lang.Boolean) false);
        aluno11.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor23 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str24 = professor23.toString();
        com.unifacisa.tcc.domain.Professor professor26 = professor23.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet27 = professor23.getAlunos();
        java.lang.Long long28 = professor23.getNumeroContato();
        professor23.setMatricula((java.lang.Long) (-1L));
        aluno11.setProfessor(professor23);
        com.unifacisa.tcc.domain.Aluno aluno32 = aluno10.professor(professor23);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa34 = professor23.numeroContato((java.lang.Long) 1L);
        pessoa34.setNumeroContato((java.lang.Long) 1L);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(aluno10);
        org.junit.Assert.assertNotNull(pessoa17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNotNull(aluno20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str24, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor26);
        org.junit.Assert.assertNotNull(alunoSet27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(aluno32);
        org.junit.Assert.assertNotNull(pessoa34);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor7 = professor5.diponibilidade((java.lang.Boolean) true);
        professor7.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        aluno10.setPrimeiroNome("");
        java.lang.Long long13 = aluno10.getMatricula();
        aluno10.setHabilitadoTcc((java.lang.Boolean) false);
        aluno10.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        aluno18.setPrimeiroNome("");
        java.lang.Long long21 = aluno18.getMatricula();
        java.lang.Long long22 = aluno18.getMatricula();
        aluno18.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        aluno25.setPrimeiroNome("");
        java.lang.Long long28 = aluno25.getMatricula();
        java.lang.Long long29 = aluno25.getMatricula();
        aluno25.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray33 = new com.unifacisa.tcc.domain.Aluno[] { aluno10, aluno18, aluno25, aluno32 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet34 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet34, alunoArray33);
        com.unifacisa.tcc.domain.Professor professor36 = professor7.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet34);
        com.unifacisa.tcc.domain.Aluno aluno37 = aluno0.professor(professor36);
        com.unifacisa.tcc.domain.Professor professor38 = aluno37.getProfessor();
        org.junit.Assert.assertNotNull(professor7);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNotNull(alunoArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(professor36);
        org.junit.Assert.assertNotNull(aluno37);
        org.junit.Assert.assertNotNull(professor38);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM1.setName("LoginVM{username='null', rememberMe=false}");
        logsResource0.changeLevel(loggerVM1);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList5 = logsResource0.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList6 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM7 = null;
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggerVMList5);
        org.junit.Assert.assertNotNull(loggerVMList6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.http.HttpHeaders httpHeaders7 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap8 = customSocialConnectionRepository3.findConnectionsToUsers((org.springframework.util.MultiValueMap<java.lang.String, java.lang.String>) httpHeaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpHeaders7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("hi!", "", "");
        java.lang.String str4 = fieldErrorVM3.getObjectName();
        java.lang.String str5 = fieldErrorVM3.getField();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper15 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user17 = userMapper15.userFromId((java.lang.Long) 100L);
        user17.setLangKey("");
        java.time.Instant instant20 = user17.getResetDate();
        java.time.Instant instant21 = user17.getCreatedDate();
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent23 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        persistentAuditEvent23.setData(strMap24);
        persistentAuditEvent23.setAuditEventType("hi!");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent28 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant29 = null;
        persistentAuditEvent28.setAuditEventDate(instant29);
        com.unifacisa.tcc.domain.User user31 = new com.unifacisa.tcc.domain.User();
        user31.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user31.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper36 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user38 = userMapper36.userFromId((java.lang.Long) 100L);
        user38.setLangKey("");
        java.time.Instant instant41 = user38.getResetDate();
        java.time.Instant instant42 = user38.getCreatedDate();
        user31.setResetDate(instant42);
        persistentAuditEvent28.setAuditEventDate(instant42);
        persistentAuditEvent23.setAuditEventDate(instant42);
        java.time.Instant instant56 = null;
        java.time.Instant instant58 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM66 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant56, "error.concurrencyFailure", instant58, (java.util.Set<java.lang.String>) strSet64);
        com.unifacisa.tcc.service.dto.UserDTO userDTO67 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 0L, "hi!", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", true, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", instant21, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant42, (java.util.Set<java.lang.String>) strSet64);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet68 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}", (java.util.Set<java.lang.String>) strSet64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNull(instant20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNull(instant41);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        java.lang.Long long7 = aluno0.getId();
        com.unifacisa.tcc.domain.Aluno aluno9 = aluno0.habilitadoTcc((java.lang.Boolean) false);
        aluno0.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str13 = professor12.toString();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor15 = null;
        aluno14.setProfessor(professor15);
        java.lang.Long long17 = aluno14.getMatricula();
        java.lang.String str18 = aluno14.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean21 = aluno19.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor22 = aluno19.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean25 = aluno23.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor28 = null;
        aluno27.setProfessor(professor28);
        java.lang.Long long30 = aluno27.getMatricula();
        java.lang.String str31 = aluno27.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean34 = aluno32.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor35 = aluno32.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor37 = null;
        aluno36.setProfessor(professor37);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        aluno39.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor43 = null;
        aluno42.setProfessor(professor43);
        aluno42.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor48 = null;
        aluno47.setProfessor(professor48);
        java.lang.Long long50 = aluno47.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno51 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean54 = aluno52.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor56 = null;
        aluno55.setProfessor(professor56);
        com.unifacisa.tcc.domain.Aluno[] alunoArray58 = new com.unifacisa.tcc.domain.Aluno[] { aluno14, aluno19, aluno23, aluno26, aluno27, aluno32, aluno36, aluno39, aluno42, aluno47, aluno51, aluno52, aluno55 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet59 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet59, alunoArray58);
        com.unifacisa.tcc.domain.Professor professor61 = professor12.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet59);
        com.unifacisa.tcc.domain.Aluno aluno62 = aluno0.professor(professor12);
        com.unifacisa.tcc.domain.Aluno aluno64 = aluno62.habilitadoTcc((java.lang.Boolean) false);
        java.lang.Boolean boolean65 = aluno64.isHabilitadoTcc();
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(aluno9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str13, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(professor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(professor35);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(alunoArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(professor61);
        org.junit.Assert.assertNotNull(aluno62);
        org.junit.Assert.assertNotNull(aluno64);
        org.junit.Assert.assertEquals("'" + boolean65 + "' != '" + false + "'", boolean65, false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        com.unifacisa.tcc.domain.Professor professor7 = aluno0.getProfessor();
        java.lang.Boolean boolean8 = aluno0.isHabilitadoTcc();
        java.lang.Long long9 = aluno0.getMatricula();
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(professor7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper1 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user3 = userMapper1.userFromId((java.lang.Long) 100L);
        user3.setLangKey("");
        java.time.Instant instant6 = user3.getResetDate();
        java.time.Instant instant7 = user3.getCreatedDate();
        user0.setCreatedDate(instant7);
        boolean boolean9 = user0.getActivated();
        java.lang.String str10 = user0.getResetKey();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        com.unifacisa.tcc.service.dto.UserDTO userDTO3 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        boolean boolean4 = user2.getActivated();
        java.lang.String str5 = user2.getResetKey();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity39 = userResource3.getUser("Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='true'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityUpdateAlert("Authority{name='null'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.time.Instant instant9 = null;
        java.time.Instant instant11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        com.unifacisa.tcc.service.dto.UserDTO userDTO17 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant9, "hi!", instant11, (java.util.Set<java.lang.String>) strSet15);
        java.lang.String str18 = userDTO17.getLogin();
        java.lang.String str19 = userDTO17.getFirstName();
        java.lang.String str20 = userDTO17.getImageUrl();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:08.859Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.859Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.Class<?> wildcardClass1 = loggerVM0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("error.validation", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        aluno7.setPrimeiroNome("");
        java.lang.String str10 = aluno7.getPrimeiroNome();
        java.lang.Long long11 = aluno7.getMatricula();
        boolean boolean12 = user2.equals((java.lang.Object) aluno7);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user15 = userMapper13.userFromId((java.lang.Long) 100L);
        user15.setResetKey("hi!");
        java.lang.String str18 = user15.getResetKey();
        user15.setId((java.lang.Long) 0L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper21 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user23 = userMapper21.userFromId((java.lang.Long) 100L);
        user23.setResetKey("hi!");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper26 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user28 = userMapper26.userFromId((java.lang.Long) 100L);
        user28.setLangKey("");
        java.time.Instant instant31 = user28.getResetDate();
        java.time.Instant instant32 = user28.getCreatedDate();
        user23.setResetDate(instant32);
        user15.setResetDate(instant32);
        user2.setCreatedDate(instant32);
        java.lang.String str36 = user2.getPassword();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNull(instant31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}", "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "LoggerVM{name='LoggerVM{name='null', level='null'}', level='null'}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setProfileURL("error.concurrencyFailure");
        socialUserConnection0.setUserId("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}");
        socialUserConnection0.setUserId("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=true}");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM keyAndPasswordVM0 = new com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM();
        keyAndPasswordVM0.setKey("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        keyAndPasswordVM0.setNewPassword("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        keyAndPasswordVM0.setNewPassword("SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=100}");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setProviderUserId("");
        java.lang.Long long11 = socialUserConnection0.getId();
        java.lang.String str12 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setRefreshToken("");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setDiponibilidade((java.lang.Boolean) false);
        professor4.setId((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity9 = professorResource1.createProfessor(professor4);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity11 = professorResource1.deleteProfessor((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(professorResponseEntity9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setProfileURL("error.concurrencyFailure");
        java.lang.String str5 = socialUserConnection0.getRefreshToken();
        java.lang.Long long6 = socialUserConnection0.getRank();
        socialUserConnection0.setRefreshToken("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect1 = new com.unifacisa.tcc.aop.logging.LoggingAspect(environment0);
        loggingAspect1.springBeanPointcut();
        loggingAspect1.springBeanPointcut();
        loggingAspect1.springBeanPointcut();
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = loggingAspect1.logAround(proceedingJoinPoint5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        java.time.Instant instant4 = persistentAuditEvent0.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        persistentAuditEvent0.setData(strMap5);
        java.time.Instant instant7 = persistentAuditEvent0.getAuditEventDate();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user10 = userMapper8.userFromId((java.lang.Long) 100L);
        user10.setLangKey("");
        java.time.Instant instant13 = user10.getResetDate();
        java.time.Instant instant14 = user10.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        aluno15.setPrimeiroNome("");
        java.lang.String str18 = aluno15.getPrimeiroNome();
        java.lang.Long long19 = aluno15.getMatricula();
        boolean boolean20 = user10.equals((java.lang.Object) aluno15);
        user10.setFirstName("");
        com.unifacisa.tcc.domain.User user23 = new com.unifacisa.tcc.domain.User();
        user23.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user23.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper28 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user30 = userMapper28.userFromId((java.lang.Long) 100L);
        user30.setLangKey("");
        java.time.Instant instant33 = user30.getResetDate();
        java.time.Instant instant34 = user30.getCreatedDate();
        user23.setResetDate(instant34);
        user10.setCreatedDate(instant34);
        persistentAuditEvent0.setAuditEventDate(instant34);
        persistentAuditEvent0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNull(instant33);
        org.junit.Assert.assertNotNull(instant34);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("error.concurrencyFailure");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM15 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("LoginVM{username='null', rememberMe=false}", "error.validation", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean16 = socialUserConnection0.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM38 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str39 = managedUserVM38.toString();
        java.lang.String str40 = managedUserVM38.getLogin();
        java.time.Instant instant41 = managedUserVM38.getLastModifiedDate();
        java.lang.String str42 = managedUserVM38.getLangKey();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity43 = userResource3.createUser(managedUserVM38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str39, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(instant41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM38 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str39 = managedUserVM38.toString();
        java.time.Instant instant40 = managedUserVM38.getLastModifiedDate();
        java.time.Instant instant41 = null;
        managedUserVM38.setLastModifiedDate(instant41);
        java.lang.String str43 = managedUserVM38.toString();
        java.time.Instant instant44 = managedUserVM38.getCreatedDate();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity45 = userResource3.updateUser(managedUserVM38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str39, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str43, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant44);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor3 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno4 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor5 = null;
        aluno4.setProfessor(professor5);
        aluno4.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno9 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor11 = null;
        aluno10.setProfessor(professor11);
        java.lang.Long long13 = aluno10.getMatricula();
        java.lang.String str14 = aluno10.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean17 = aluno15.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor19 = null;
        aluno18.setProfessor(professor19);
        aluno18.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean25 = aluno23.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        aluno26.setPrimeiroNome("");
        java.lang.Long long29 = aluno26.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        aluno30.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray33 = new com.unifacisa.tcc.domain.Aluno[] { aluno4, aluno9, aluno10, aluno15, aluno18, aluno23, aluno26, aluno30 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet34 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet34, alunoArray33);
        professor3.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet34);
        com.unifacisa.tcc.domain.Professor professor37 = professor2.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet34);
        com.unifacisa.tcc.domain.Professor professor39 = professor37.diponibilidade((java.lang.Boolean) true);
        professor37.setDiponibilidade((java.lang.Boolean) false);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet42 = professor37.getAlunos();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa44 = professor37.segundoNome("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        java.lang.Object obj45 = null;
        boolean boolean46 = professor37.equals(obj45);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNotNull(alunoArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNotNull(alunoSet42);
        org.junit.Assert.assertNotNull(pessoa44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean4 = aluno2.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno2.primeiroNome("Authority{name='error.concurrencyFailure'}");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity7 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pessoa6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        persistentAuditEvent0.setId((java.lang.Long) 1L);
        persistentAuditEvent0.setId((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent8 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        persistentAuditEvent8.setData(strMap9);
        persistentAuditEvent8.setAuditEventType("hi!");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent13 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant14 = null;
        persistentAuditEvent13.setAuditEventDate(instant14);
        com.unifacisa.tcc.domain.User user16 = new com.unifacisa.tcc.domain.User();
        user16.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user16.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper21 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user23 = userMapper21.userFromId((java.lang.Long) 100L);
        user23.setLangKey("");
        java.time.Instant instant26 = user23.getResetDate();
        java.time.Instant instant27 = user23.getCreatedDate();
        user16.setResetDate(instant27);
        persistentAuditEvent13.setAuditEventDate(instant27);
        persistentAuditEvent8.setAuditEventDate(instant27);
        persistentAuditEvent0.setAuditEventDate(instant27);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = persistentAuditEvent0.getData();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNull(instant26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createAlert("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}", "LoginVM{username='null', rememberMe=null}");
        java.lang.Class<?> wildcardClass3 = httpHeaders2.getClass();
        org.junit.Assert.assertNotNull(httpHeaders2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getPassword();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        loginVM0.setPassword("error.validation");
        loginVM0.setPassword("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str8 = loginVM0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str5 = managedUserVM4.toString();
        java.lang.String str6 = managedUserVM4.getLogin();
        java.lang.String str7 = managedUserVM4.getFirstName();
        java.lang.Long long8 = managedUserVM4.getId();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity9 = userResource3.updateUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str5, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setDiponibilidade((java.lang.Boolean) false);
        professor4.setId((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity9 = professorResource1.createProfessor(professor4);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.getProfessor((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(professorResponseEntity9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.matricula((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa10 = aluno2.email("");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity11 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(pessoa10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setDiponibilidade((java.lang.Boolean) false);
        professor4.setId((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity9 = professorResource1.createProfessor(professor4);
        com.unifacisa.tcc.domain.Professor professor10 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor12 = professor10.diponibilidade((java.lang.Boolean) true);
        professor12.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        aluno15.setPrimeiroNome("");
        java.lang.Long long18 = aluno15.getMatricula();
        aluno15.setHabilitadoTcc((java.lang.Boolean) false);
        aluno15.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        aluno23.setPrimeiroNome("");
        java.lang.Long long26 = aluno23.getMatricula();
        java.lang.Long long27 = aluno23.getMatricula();
        aluno23.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        aluno30.setPrimeiroNome("");
        java.lang.Long long33 = aluno30.getMatricula();
        java.lang.Long long34 = aluno30.getMatricula();
        aluno30.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno37 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray38 = new com.unifacisa.tcc.domain.Aluno[] { aluno15, aluno23, aluno30, aluno37 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet39 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet39, alunoArray38);
        com.unifacisa.tcc.domain.Professor professor41 = professor12.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet39);
        com.unifacisa.tcc.domain.Professor professor42 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor44 = professor42.diponibilidade((java.lang.Boolean) true);
        professor44.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str47 = professor44.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor48 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor50 = professor48.diponibilidade((java.lang.Boolean) true);
        professor50.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        aluno53.setPrimeiroNome("");
        java.lang.Long long56 = aluno53.getMatricula();
        aluno53.setHabilitadoTcc((java.lang.Boolean) false);
        aluno53.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno61 = new com.unifacisa.tcc.domain.Aluno();
        aluno61.setPrimeiroNome("");
        java.lang.Long long64 = aluno61.getMatricula();
        java.lang.Long long65 = aluno61.getMatricula();
        aluno61.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno68 = new com.unifacisa.tcc.domain.Aluno();
        aluno68.setPrimeiroNome("");
        java.lang.Long long71 = aluno68.getMatricula();
        java.lang.Long long72 = aluno68.getMatricula();
        aluno68.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno75 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray76 = new com.unifacisa.tcc.domain.Aluno[] { aluno53, aluno61, aluno68, aluno75 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet77 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet77, alunoArray76);
        com.unifacisa.tcc.domain.Professor professor79 = professor50.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet77);
        com.unifacisa.tcc.domain.Professor professor80 = professor44.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet77);
        com.unifacisa.tcc.domain.Professor professor81 = professor12.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet77);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity82 = professorResource1.updateProfessor(professor81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(professorResponseEntity9);
        org.junit.Assert.assertNotNull(professor12);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNull(long33);
        org.junit.Assert.assertNull(long34);
        org.junit.Assert.assertNotNull(alunoArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(professor41);
        org.junit.Assert.assertNotNull(professor44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(professor50);
        org.junit.Assert.assertNull(long56);
        org.junit.Assert.assertNull(long64);
        org.junit.Assert.assertNull(long65);
        org.junit.Assert.assertNull(long71);
        org.junit.Assert.assertNull(long72);
        org.junit.Assert.assertNotNull(alunoArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(professor79);
        org.junit.Assert.assertNotNull(professor80);
        org.junit.Assert.assertNotNull(professor81);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository2 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource3 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository2);
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor6 = professor4.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = professor4.email("");
        com.unifacisa.tcc.domain.Professor professor10 = professor4.diponibilidade((java.lang.Boolean) true);
        professor10.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource3.createProfessor(professor10);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity14 = professorResource1.createProfessor(professor10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity16 = professorResource1.getProfessor((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNotNull(professorResponseEntity13);
        org.junit.Assert.assertNotNull(professorResponseEntity14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.unifacisa.tcc.service.dto.UserDTO userDTO34 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant26, "hi!", instant28, (java.util.Set<java.lang.String>) strSet32);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM35 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = managedUserVM35.getLastModifiedBy();
        org.springframework.http.ResponseEntity responseEntity37 = userResource3.createUser(managedUserVM35);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity39 = userResource3.deleteUser("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(responseEntity37);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity3 = alunoResource1.getAluno((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        java.time.Instant instant4 = persistentAuditEvent0.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        persistentAuditEvent0.setData(strMap5);
        java.lang.Long long7 = persistentAuditEvent0.getId();
        java.time.Instant instant8 = persistentAuditEvent0.getAuditEventDate();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(instant8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.springframework.http.HttpHeaders httpHeaders3 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createFailureAlert("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertNotNull(httpHeaders3);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        boolean boolean7 = user2.equals((java.lang.Object) 10.0f);
        java.lang.String str8 = user2.getEmail();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MultiValueMap<java.lang.String, org.springframework.social.connect.Connection<?>> strMap4 = customSocialConnectionRepository3.findAllConnections();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper17 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user19 = userMapper17.userFromId((java.lang.Long) 100L);
        user19.setLangKey("");
        java.time.Instant instant22 = user19.getResetDate();
        java.time.Instant instant23 = user19.getCreatedDate();
        user19.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.time.Instant instant26 = user19.getCreatedDate();
        com.unifacisa.tcc.domain.User user28 = new com.unifacisa.tcc.domain.User();
        user28.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user28.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant33 = user28.getLastModifiedDate();
        java.lang.String[] strArray49 = new java.lang.String[] { "LoginVM{username='null', rememberMe=false}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=100}", "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}", "Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}", "LoggerVM{name='null', level='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        com.unifacisa.tcc.service.dto.UserDTO userDTO52 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}", false, "hi!", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=2021-03-26T03:34:08.443Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.443Z, authorities=[]}", instant26, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", instant33, (java.util.Set<java.lang.String>) strSet50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet53 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("error.concurrencyFailure", (java.util.Set<java.lang.String>) strSet50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNull(instant22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        aluno2.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Aluno aluno6 = aluno2.habilitadoTcc((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity7 = alunoResource1.updateAluno(aluno6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aluno6);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor7 = null;
        aluno6.setProfessor(professor7);
        aluno6.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor13 = null;
        aluno12.setProfessor(professor13);
        java.lang.Long long15 = aluno12.getMatricula();
        java.lang.String str16 = aluno12.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean19 = aluno17.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor21 = null;
        aluno20.setProfessor(professor21);
        aluno20.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean27 = aluno25.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        aluno28.setPrimeiroNome("");
        java.lang.Long long31 = aluno28.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        aluno32.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray35 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno11, aluno12, aluno17, aluno20, aluno25, aluno28, aluno32 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet36 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet36, alunoArray35);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        com.unifacisa.tcc.domain.Professor professor39 = professor4.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        java.lang.Long long40 = professor39.getId();
        java.lang.Long long41 = professor39.getId();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity42 = professorResource1.createProfessor(professor39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(alunoArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNull(long41);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        com.unifacisa.tcc.domain.Professor professor3 = aluno0.getProfessor();
        org.junit.Assert.assertNull(professor3);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository2 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource3 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository2);
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor6 = professor4.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = professor4.email("");
        com.unifacisa.tcc.domain.Professor professor10 = professor4.diponibilidade((java.lang.Boolean) true);
        professor10.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource3.createProfessor(professor10);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity14 = professorResource1.createProfessor(professor10);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor16 = null;
        aluno15.setProfessor(professor16);
        aluno15.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa21 = aluno15.primeiroNome("hi!");
        java.lang.String str22 = aluno15.getEmail();
        com.unifacisa.tcc.domain.Professor professor23 = aluno15.getProfessor();
        com.unifacisa.tcc.domain.Professor professor24 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor26 = professor24.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa28 = professor24.email("");
        com.unifacisa.tcc.domain.Professor professor30 = professor24.diponibilidade((java.lang.Boolean) true);
        java.lang.String str31 = professor30.toString();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        aluno32.setPrimeiroNome("");
        java.lang.Long long35 = aluno32.getMatricula();
        java.lang.Long long36 = aluno32.getMatricula();
        aluno32.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor40 = null;
        aluno39.setProfessor(professor40);
        aluno39.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor44 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor46 = professor44.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor47 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno48 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor49 = null;
        aluno48.setProfessor(professor49);
        aluno48.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno54 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor55 = null;
        aluno54.setProfessor(professor55);
        java.lang.Long long57 = aluno54.getMatricula();
        java.lang.String str58 = aluno54.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno59 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean61 = aluno59.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno62 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor63 = null;
        aluno62.setProfessor(professor63);
        aluno62.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean69 = aluno67.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno70 = new com.unifacisa.tcc.domain.Aluno();
        aluno70.setPrimeiroNome("");
        java.lang.Long long73 = aluno70.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno74 = new com.unifacisa.tcc.domain.Aluno();
        aluno74.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray77 = new com.unifacisa.tcc.domain.Aluno[] { aluno48, aluno53, aluno54, aluno59, aluno62, aluno67, aluno70, aluno74 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet78 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet78, alunoArray77);
        professor47.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet78);
        com.unifacisa.tcc.domain.Professor professor81 = professor46.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet78);
        aluno39.setProfessor(professor81);
        aluno32.setProfessor(professor81);
        aluno32.setHabilitadoTcc((java.lang.Boolean) false);
        aluno32.setId((java.lang.Long) 1L);
        java.lang.String str88 = aluno32.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor89 = professor30.addAluno(aluno32);
        com.unifacisa.tcc.domain.Aluno aluno90 = aluno15.professor(professor89);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity91 = professorResource1.updateProfessor(professor89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNotNull(professorResponseEntity13);
        org.junit.Assert.assertNotNull(professorResponseEntity14);
        org.junit.Assert.assertNotNull(pessoa21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(professor23);
        org.junit.Assert.assertNotNull(professor26);
        org.junit.Assert.assertNotNull(pessoa28);
        org.junit.Assert.assertNotNull(professor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}" + "'", str31, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNotNull(professor46);
        org.junit.Assert.assertNull(long57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(long73);
        org.junit.Assert.assertNotNull(alunoArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(professor81);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(professor89);
        org.junit.Assert.assertNotNull(aluno90);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant1 = managedUserVM0.getCreatedDate();
        java.lang.String str2 = managedUserVM0.getImageUrl();
        java.time.Instant instant3 = managedUserVM0.getCreatedDate();
        managedUserVM0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(instant3);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        persistentAuditEvent0.setId((java.lang.Long) 1L);
        persistentAuditEvent0.setId((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent8 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        persistentAuditEvent8.setData(strMap9);
        persistentAuditEvent8.setAuditEventType("hi!");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent13 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant14 = null;
        persistentAuditEvent13.setAuditEventDate(instant14);
        com.unifacisa.tcc.domain.User user16 = new com.unifacisa.tcc.domain.User();
        user16.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user16.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper21 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user23 = userMapper21.userFromId((java.lang.Long) 100L);
        user23.setLangKey("");
        java.time.Instant instant26 = user23.getResetDate();
        java.time.Instant instant27 = user23.getCreatedDate();
        user16.setResetDate(instant27);
        persistentAuditEvent13.setAuditEventDate(instant27);
        persistentAuditEvent8.setAuditEventDate(instant27);
        persistentAuditEvent0.setAuditEventDate(instant27);
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent32 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant33 = persistentAuditEvent32.getAuditEventDate();
        java.time.Instant instant34 = null;
        persistentAuditEvent32.setAuditEventDate(instant34);
        java.time.Instant instant36 = persistentAuditEvent32.getAuditEventDate();
        java.lang.String str37 = persistentAuditEvent32.getAuditEventType();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper38 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user40 = userMapper38.userFromId((java.lang.Long) 100L);
        user40.setLangKey("");
        java.time.Instant instant43 = user40.getResetDate();
        java.time.Instant instant44 = user40.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        aluno45.setPrimeiroNome("");
        java.lang.String str48 = aluno45.getPrimeiroNome();
        java.lang.Long long49 = aluno45.getMatricula();
        boolean boolean50 = user40.equals((java.lang.Object) aluno45);
        user40.setFirstName("");
        com.unifacisa.tcc.domain.User user53 = new com.unifacisa.tcc.domain.User();
        user53.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user53.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper58 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user60 = userMapper58.userFromId((java.lang.Long) 100L);
        user60.setLangKey("");
        java.time.Instant instant63 = user60.getResetDate();
        java.time.Instant instant64 = user60.getCreatedDate();
        user53.setResetDate(instant64);
        user40.setCreatedDate(instant64);
        persistentAuditEvent32.setAuditEventDate(instant64);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = persistentAuditEvent32.getData();
        persistentAuditEvent0.setData(strMap68);
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNull(instant26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNull(instant33);
        org.junit.Assert.assertNull(instant36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNull(instant43);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(long49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNull(instant63);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(strMap68);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        user2.setId((java.lang.Long) 0L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user10 = userMapper8.userFromId((java.lang.Long) 100L);
        user10.setResetKey("hi!");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper13 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user15 = userMapper13.userFromId((java.lang.Long) 100L);
        user15.setLangKey("");
        java.time.Instant instant18 = user15.getResetDate();
        java.time.Instant instant19 = user15.getCreatedDate();
        user10.setResetDate(instant19);
        user2.setResetDate(instant19);
        com.unifacisa.tcc.service.dto.UserDTO userDTO22 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        java.lang.String str23 = userDTO22.getCreatedBy();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnections("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.social.connect.Connection<?> wildcardConnection5 = customSocialConnectionRepository3.getConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        java.time.Instant instant6 = user0.getLastModifiedDate();
        user0.setFirstName("LoginVM{username='null', rememberMe=false}");
        java.lang.Long long9 = user0.getId();
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        professor2.setDiponibilidade((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(professor2);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=2021-03-26T03:34:08.443Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.443Z, authorities=[]}", "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        persistentAuditEvent0.setData(strMap1);
        java.time.Instant instant3 = null;
        persistentAuditEvent0.setAuditEventDate(instant3);
        java.time.Instant instant5 = persistentAuditEvent0.getAuditEventDate();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user8 = userMapper6.userFromId((java.lang.Long) 100L);
        user8.setLangKey("");
        java.time.Instant instant11 = user8.getResetDate();
        java.time.Instant instant12 = user8.getCreatedDate();
        user8.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str15 = user8.toString();
        com.unifacisa.tcc.domain.User user16 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper17 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user19 = userMapper17.userFromId((java.lang.Long) 100L);
        user19.setLangKey("");
        java.time.Instant instant22 = user19.getResetDate();
        java.time.Instant instant23 = user19.getCreatedDate();
        user16.setCreatedDate(instant23);
        user8.setResetDate(instant23);
        persistentAuditEvent0.setAuditEventDate(instant23);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}" + "'", str15, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNull(instant22);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", socialUserConnectionRepository1, connectionFactoryLocator2);
        org.springframework.social.connect.ConnectionKey connectionKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customSocialConnectionRepository3.removeConnection(connectionKey4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray7 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList8 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList8, userArray7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper6.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList8);
        java.time.Instant instant21 = null;
        java.time.Instant instant23 = null;
        java.time.Instant instant33 = null;
        java.time.Instant instant35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant33, "hi!", instant35, (java.util.Set<java.lang.String>) strSet39);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant21, "", instant23, (java.util.Set<java.lang.String>) strSet39);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet43 = userMapper6.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet39);
        user0.setAuthorities(authoritySet43);
        java.lang.Long long45 = user0.getId();
        java.lang.String str46 = user0.getResetKey();
        com.unifacisa.tcc.domain.User user56 = new com.unifacisa.tcc.domain.User();
        user56.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user56.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant61 = user56.getLastModifiedDate();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper63 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user65 = userMapper63.userFromId((java.lang.Long) 100L);
        user65.setLangKey("");
        java.time.Instant instant68 = user65.getResetDate();
        java.time.Instant instant69 = user65.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno70 = new com.unifacisa.tcc.domain.Aluno();
        aluno70.setPrimeiroNome("");
        java.lang.String str73 = aluno70.getPrimeiroNome();
        java.lang.Long long74 = aluno70.getMatricula();
        boolean boolean75 = user65.equals((java.lang.Object) aluno70);
        user65.setFirstName("");
        com.unifacisa.tcc.domain.User user78 = new com.unifacisa.tcc.domain.User();
        user78.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user78.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper83 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user85 = userMapper83.userFromId((java.lang.Long) 100L);
        user85.setLangKey("");
        java.time.Instant instant88 = user85.getResetDate();
        java.time.Instant instant89 = user85.getCreatedDate();
        user78.setResetDate(instant89);
        user65.setCreatedDate(instant89);
        java.util.Set<java.lang.String> strSet92 = null;
        com.unifacisa.tcc.service.dto.UserDTO userDTO93 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", "error.concurrencyFailure", "LoginVM{username='null', rememberMe=false}", true, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant61, "", instant89, strSet92);
        user0.setCreatedDate(instant61);
        java.time.Instant instant95 = user0.getCreatedDate();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
        org.junit.Assert.assertNull(long45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNull(instant68);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(long74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(user85);
        org.junit.Assert.assertNull(instant88);
        org.junit.Assert.assertNotNull(instant89);
        org.junit.Assert.assertNotNull(instant95);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setExpireTime((java.lang.Long) 100L);
        socialUserConnection0.setProviderUserId("");
        socialUserConnection0.setUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str16 = socialUserConnection0.getRefreshToken();
        java.lang.String str17 = socialUserConnection0.toString();
        socialUserConnection0.setUserId("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=100}" + "'", str17, "SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=100}");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user0.setLastModifiedBy("ManagedUserVM{} UserDTO{login='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.net.URI uRI9 = com.unifacisa.tcc.web.rest.errors.ErrorConstants.CONSTRAINT_VIOLATION_TYPE;
        boolean boolean10 = socialUserConnection0.equals((java.lang.Object) uRI9);
        java.lang.Class<?> wildcardClass11 = socialUserConnection0.getClass();
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.lang.String str2 = managedUserVM0.getLogin();
        java.lang.String str3 = managedUserVM0.getFirstName();
        java.time.Instant instant4 = managedUserVM0.getCreatedDate();
        java.lang.String str5 = managedUserVM0.getPassword();
        java.lang.String str6 = managedUserVM0.getLastModifiedBy();
        java.time.Instant instant7 = managedUserVM0.getLastModifiedDate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(instant7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository2 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource3 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository2);
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor6 = professor4.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = professor4.email("");
        com.unifacisa.tcc.domain.Professor professor10 = professor4.diponibilidade((java.lang.Boolean) true);
        professor10.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource3.createProfessor(professor10);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity14 = professorResource1.createProfessor(professor10);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        aluno15.setPrimeiroNome("");
        java.lang.Long long18 = aluno15.getMatricula();
        java.lang.Long long19 = aluno15.getMatricula();
        aluno15.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor23 = null;
        aluno22.setProfessor(professor23);
        aluno22.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor27 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor29 = professor27.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor30 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno31 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor32 = null;
        aluno31.setProfessor(professor32);
        aluno31.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno37 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor38 = null;
        aluno37.setProfessor(professor38);
        java.lang.Long long40 = aluno37.getMatricula();
        java.lang.String str41 = aluno37.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean44 = aluno42.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor46 = null;
        aluno45.setProfessor(professor46);
        aluno45.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno50 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean52 = aluno50.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        aluno53.setPrimeiroNome("");
        java.lang.Long long56 = aluno53.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        aluno57.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray60 = new com.unifacisa.tcc.domain.Aluno[] { aluno31, aluno36, aluno37, aluno42, aluno45, aluno50, aluno53, aluno57 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet61 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet61, alunoArray60);
        professor30.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet61);
        com.unifacisa.tcc.domain.Professor professor64 = professor29.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet61);
        aluno22.setProfessor(professor64);
        aluno15.setProfessor(professor64);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity67 = professorResource1.updateProfessor(professor64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNotNull(professorResponseEntity13);
        org.junit.Assert.assertNotNull(professorResponseEntity14);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNotNull(professor29);
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(long56);
        org.junit.Assert.assertNotNull(alunoArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(professor64);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray9 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList10 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList10, userArray9);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList12 = userMapper8.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList10);
        java.time.Instant instant23 = null;
        java.time.Instant instant25 = null;
        java.time.Instant instant35 = null;
        java.time.Instant instant37 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        com.unifacisa.tcc.service.dto.UserDTO userDTO43 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant35, "hi!", instant37, (java.util.Set<java.lang.String>) strSet41);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM44 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant23, "", instant25, (java.util.Set<java.lang.String>) strSet41);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet45 = userMapper8.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet46 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='null', secret='null', refreshToken='null', expireTime=null}", (java.util.Set<java.lang.String>) strSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(userArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userDTOList12);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(authoritySet45);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long7 = professor2.getId();
        professor2.setNumeroContato((java.lang.Long) 100L);
        java.lang.String str10 = professor2.getPrimeiroNome();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.lang.String str2 = managedUserVM0.getLogin();
        java.lang.String str3 = managedUserVM0.getFirstName();
        java.time.Instant instant4 = managedUserVM0.getCreatedDate();
        java.lang.String str5 = managedUserVM0.getLastName();
        java.util.Set<java.lang.String> strSet6 = managedUserVM0.getAuthorities();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        loggingAspect2.springBeanPointcut();
        loggingAspect2.applicationPackagePointcut();
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = loggingAspect2.logAround(proceedingJoinPoint5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggingAspect2);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.toString();
        com.unifacisa.tcc.domain.Professor professor3 = professor0.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet4 = professor0.getAlunos();
        java.lang.Long long5 = professor0.getNumeroContato();
        professor0.setMatricula((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno8 = new com.unifacisa.tcc.domain.Aluno();
        aluno8.setPrimeiroNome("");
        java.lang.Long long11 = aluno8.getMatricula();
        java.lang.Long long12 = aluno8.getMatricula();
        aluno8.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa16 = aluno8.email("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        com.unifacisa.tcc.domain.Aluno aluno18 = aluno8.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor20 = null;
        aluno19.setProfessor(professor20);
        aluno19.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa25 = aluno19.primeiroNome("hi!");
        java.lang.Long long26 = aluno19.getId();
        com.unifacisa.tcc.domain.Aluno aluno28 = aluno19.habilitadoTcc((java.lang.Boolean) false);
        aluno19.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor31 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str32 = professor31.toString();
        com.unifacisa.tcc.domain.Professor professor34 = professor31.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet35 = professor31.getAlunos();
        java.lang.Long long36 = professor31.getNumeroContato();
        professor31.setMatricula((java.lang.Long) (-1L));
        aluno19.setProfessor(professor31);
        com.unifacisa.tcc.domain.Aluno aluno40 = aluno18.professor(professor31);
        com.unifacisa.tcc.domain.Professor professor41 = professor0.addAluno(aluno18);
        professor41.setSegundoNome("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:08.859Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.859Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str1, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor3);
        org.junit.Assert.assertNotNull(alunoSet4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(pessoa16);
        org.junit.Assert.assertNotNull(aluno18);
        org.junit.Assert.assertNotNull(pessoa25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNotNull(aluno28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str32, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor34);
        org.junit.Assert.assertNotNull(alunoSet35);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNotNull(aluno40);
        org.junit.Assert.assertNotNull(professor41);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository2 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource3 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository2);
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor6 = professor4.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = professor4.email("");
        com.unifacisa.tcc.domain.Professor professor10 = professor4.diponibilidade((java.lang.Boolean) true);
        professor10.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource3.createProfessor(professor10);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity14 = professorResource1.createProfessor(professor10);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity16 = professorResource1.getProfessor((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNotNull(professorResponseEntity13);
        org.junit.Assert.assertNotNull(professorResponseEntity14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity5 = userResource3.updateUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("Authority{name='Authority{name='error.concurrencyFailure'}'}", "User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setDiponibilidade((java.lang.Boolean) false);
        professor4.setId((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity9 = professorResource1.createProfessor(professor4);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.getProfessor((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(professorResponseEntity9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.springframework.data.domain.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.PaginationUtil.generatePaginationHttpHeaders(page0, "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='error.validation', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("ManagedUserVM{} UserDTO{login='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.springframework.social.connect.ConnectionRepository connectionRepository8 = customSocialUsersConnectionRepository2.createConnectionRepository("LoginVM{username='null', rememberMe=false}");
        org.springframework.social.connect.ConnectionRepository connectionRepository10 = customSocialUsersConnectionRepository2.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper21 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user23 = userMapper21.userFromId((java.lang.Long) 100L);
        user23.setLangKey("");
        java.time.Instant instant26 = user23.getResetDate();
        java.time.Instant instant27 = user23.getCreatedDate();
        user23.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.time.Instant instant30 = user23.getCreatedDate();
        com.unifacisa.tcc.domain.User user32 = new com.unifacisa.tcc.domain.User();
        user32.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user32.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant37 = user32.getLastModifiedDate();
        java.lang.String[] strArray53 = new java.lang.String[] { "LoginVM{username='null', rememberMe=false}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=100}", "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}", "Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}", "LoggerVM{name='null', level='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        com.unifacisa.tcc.service.dto.UserDTO userDTO56 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}", false, "hi!", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=2021-03-26T03:34:08.443Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.443Z, authorities=[]}", instant30, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", instant37, (java.util.Set<java.lang.String>) strSet54);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet57 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", (java.util.Set<java.lang.String>) strSet54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(connectionRepository8);
        org.junit.Assert.assertNotNull(connectionRepository10);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNull(instant26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.User user3 = new com.unifacisa.tcc.domain.User();
        user3.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM6 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet7 = managedUserVM6.getAuthorities();
        boolean boolean8 = user3.equals((java.lang.Object) strSet7);
        java.time.Instant instant9 = user3.getLastModifiedDate();
        com.unifacisa.tcc.service.dto.UserDTO userDTO10 = userMapper0.userToUserDTO(user3);
        java.time.Instant instant11 = user3.getResetDate();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(userDTO10);
        org.junit.Assert.assertNull(instant11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("LoggerVM{name='LoggerVM{name='null', level='null'}', level='null'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='error.validation', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = null;
        persistentAuditEvent0.setAuditEventDate(instant1);
        java.lang.String str3 = persistentAuditEvent0.getAuditEventType();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = persistentAuditEvent0.getData();
        java.lang.Long long5 = persistentAuditEvent0.getId();
        java.lang.String str6 = persistentAuditEvent0.getAuditEventType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getPassword();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = loginVM0.isRememberMe();
        loginVM0.setPassword("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
        loginVM0.setRememberMe((java.lang.Boolean) true);
        java.lang.String str9 = loginVM0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}" + "'", str9, "Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper9 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user11 = userMapper9.userFromId((java.lang.Long) 100L);
        user11.setResetKey("hi!");
        user11.setFirstName("error.validation");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper16 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user18 = userMapper16.userFromId((java.lang.Long) 100L);
        user18.setLangKey("");
        java.time.Instant instant21 = user18.getResetDate();
        java.time.Instant instant22 = user18.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        aluno23.setPrimeiroNome("");
        java.lang.String str26 = aluno23.getPrimeiroNome();
        java.lang.Long long27 = aluno23.getMatricula();
        boolean boolean28 = user18.equals((java.lang.Object) aluno23);
        user18.setFirstName("");
        com.unifacisa.tcc.domain.User user31 = new com.unifacisa.tcc.domain.User();
        user31.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user31.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper36 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user38 = userMapper36.userFromId((java.lang.Long) 100L);
        user38.setLangKey("");
        java.time.Instant instant41 = user38.getResetDate();
        java.time.Instant instant42 = user38.getCreatedDate();
        user31.setResetDate(instant42);
        user18.setCreatedDate(instant42);
        user11.setResetDate(instant42);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper47 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user49 = userMapper47.userFromId((java.lang.Long) 100L);
        user49.setLangKey("");
        java.time.Instant instant52 = user49.getResetDate();
        java.time.Instant instant53 = user49.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno54 = new com.unifacisa.tcc.domain.Aluno();
        aluno54.setPrimeiroNome("");
        java.lang.String str57 = aluno54.getPrimeiroNome();
        java.lang.Long long58 = aluno54.getMatricula();
        boolean boolean59 = user49.equals((java.lang.Object) aluno54);
        user49.setFirstName("");
        com.unifacisa.tcc.domain.User user62 = new com.unifacisa.tcc.domain.User();
        user62.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user62.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper67 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user69 = userMapper67.userFromId((java.lang.Long) 100L);
        user69.setLangKey("");
        java.time.Instant instant72 = user69.getResetDate();
        java.time.Instant instant73 = user69.getCreatedDate();
        user62.setResetDate(instant73);
        user49.setCreatedDate(instant73);
        java.time.Instant instant85 = null;
        java.time.Instant instant87 = null;
        java.lang.String[] strArray90 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet91 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet91, strArray90);
        com.unifacisa.tcc.service.dto.UserDTO userDTO93 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant85, "hi!", instant87, (java.util.Set<java.lang.String>) strSet91);
        com.unifacisa.tcc.service.dto.UserDTO userDTO94 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) (-1L), "", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", instant42, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", instant73, (java.util.Set<java.lang.String>) strSet91);
        java.time.Instant instant95 = userDTO94.getCreatedDate();
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNull(instant21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNull(instant41);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNull(instant52);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(long58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(user69);
        org.junit.Assert.assertNull(instant72);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(instant95);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        aluno2.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.primeiroNome("hi!");
        java.lang.Long long9 = aluno2.getId();
        com.unifacisa.tcc.domain.Aluno aluno11 = aluno2.habilitadoTcc((java.lang.Boolean) false);
        java.lang.Long long12 = aluno11.getId();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity13 = alunoResource1.createAluno(aluno11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNotNull(aluno11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.Long long1 = aluno0.getId();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa3 = aluno0.matricula((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa5 = aluno0.numeroContato((java.lang.Long) 1L);
        pessoa5.setMatricula((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass8 = pessoa5.getClass();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(pessoa3);
        org.junit.Assert.assertNotNull(pessoa5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean2 = aluno0.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor3 = aluno0.getProfessor();
        java.lang.String str4 = aluno0.toString();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.matricula((java.lang.Long) 1L);
        java.lang.Long long7 = aluno0.getNumeroContato();
        com.unifacisa.tcc.domain.Professor professor8 = aluno0.getProfessor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(professor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str4, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(professor8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.springframework.core.env.Environment environment0 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect1 = new com.unifacisa.tcc.aop.logging.LoggingAspect(environment0);
        loggingAspect1.applicationPackagePointcut();
        org.aspectj.lang.JoinPoint joinPoint3 = null;
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            loggingAspect1.logAfterThrowing(joinPoint3, throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM1.setName("LoginVM{username='null', rememberMe=false}");
        logsResource0.changeLevel(loggerVM1);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList5 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM6 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM6.setName("LoginVM{username='null', rememberMe=false}");
        loggerVM6.setName("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        logsResource0.changeLevel(loggerVM6);
        com.unifacisa.tcc.web.rest.LogsResource logsResource12 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM13 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM13.setName("LoginVM{username='null', rememberMe=false}");
        logsResource12.changeLevel(loggerVM13);
        loggerVM13.setName("Authority{name='error.concurrencyFailure'}");
        logsResource0.changeLevel(loggerVM13);
        loggerVM13.setLevel("error.validation");
        org.junit.Assert.assertNotNull(loggerVMList5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        aluno2.setPrimeiroNome("");
        java.lang.Long long5 = aluno2.getMatricula();
        java.lang.Long long6 = aluno2.getMatricula();
        aluno2.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno9 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor10 = null;
        aluno9.setProfessor(professor10);
        aluno9.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor14 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor16 = professor14.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor17 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor19 = null;
        aluno18.setProfessor(professor19);
        aluno18.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor25 = null;
        aluno24.setProfessor(professor25);
        java.lang.Long long27 = aluno24.getMatricula();
        java.lang.String str28 = aluno24.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean31 = aluno29.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor33 = null;
        aluno32.setProfessor(professor33);
        aluno32.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno37 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean39 = aluno37.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno40 = new com.unifacisa.tcc.domain.Aluno();
        aluno40.setPrimeiroNome("");
        java.lang.Long long43 = aluno40.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno44 = new com.unifacisa.tcc.domain.Aluno();
        aluno44.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray47 = new com.unifacisa.tcc.domain.Aluno[] { aluno18, aluno23, aluno24, aluno29, aluno32, aluno37, aluno40, aluno44 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet48 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet48, alunoArray47);
        professor17.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet48);
        com.unifacisa.tcc.domain.Professor professor51 = professor16.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet48);
        aluno9.setProfessor(professor51);
        aluno2.setProfessor(professor51);
        aluno2.setHabilitadoTcc((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity56 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNotNull(professor16);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(long43);
        org.junit.Assert.assertNotNull(alunoArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(professor51);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long5 = professor2.getId();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa7 = professor2.email("error.validation");
        professor2.setId((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa11 = professor2.primeiroNome("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        pessoa11.setPrimeiroNome("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNotNull(pessoa7);
        org.junit.Assert.assertNotNull(pessoa11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        user2.setId((java.lang.Long) 0L);
        java.lang.String str8 = user2.toString();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str8, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("error.concurrencyFailure", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}", "", (java.lang.Long) 1L, "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", "ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=null, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='error.validation', expireTime=null}", "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", "LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}", (java.lang.Long) 10L);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        aluno7.setPrimeiroNome("");
        java.lang.String str10 = aluno7.getPrimeiroNome();
        java.lang.Long long11 = aluno7.getMatricula();
        boolean boolean12 = user2.equals((java.lang.Object) aluno7);
        aluno7.setPrimeiroNome("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:08.859Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.859Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        java.lang.Long long15 = aluno7.getId();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=2021-03-26T03:34:08.443Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.443Z, authorities=[]}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:08.859Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.859Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "User{login='null', firstName='error.validation', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        java.time.Instant instant4 = persistentAuditEvent0.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        persistentAuditEvent0.setData(strMap5);
        java.lang.String str7 = persistentAuditEvent0.getPrincipal();
        java.lang.String str8 = persistentAuditEvent0.getAuditEventType();
        persistentAuditEvent0.setId((java.lang.Long) 100L);
        persistentAuditEvent0.setAuditEventType("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        java.time.Instant instant13 = persistentAuditEvent0.getAuditEventDate();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(instant13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant1 = managedUserVM0.getCreatedDate();
        java.lang.String str2 = managedUserVM0.getImageUrl();
        java.lang.String str3 = managedUserVM0.toString();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str3, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.String str8 = socialUserConnection0.getImageURL();
        socialUserConnection0.setDisplayName("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str11 = socialUserConnection0.getUserId();
        java.lang.String str12 = socialUserConnection0.getUserId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error.validation" + "'", str8, "error.validation");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository2 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource3 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository2);
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor6 = professor4.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = professor4.email("");
        com.unifacisa.tcc.domain.Professor professor10 = professor4.diponibilidade((java.lang.Boolean) true);
        professor10.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource3.createProfessor(professor10);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity14 = professorResource1.createProfessor(professor10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.unifacisa.tcc.domain.Professor> professorList15 = professorResource1.getAllProfessors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNotNull(professorResponseEntity13);
        org.junit.Assert.assertNotNull(professorResponseEntity14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        java.time.Instant instant4 = persistentAuditEvent0.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        persistentAuditEvent0.setData(strMap5);
        java.lang.String str7 = persistentAuditEvent0.getPrincipal();
        java.lang.String str8 = persistentAuditEvent0.getAuditEventType();
        java.lang.String str9 = persistentAuditEvent0.getAuditEventType();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList1 = logsResource0.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList2 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM3 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM3.setLevel("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str6 = loggerVM3.getName();
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name argument cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggerVMList1);
        org.junit.Assert.assertNotNull(loggerVMList2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityCreationAlert("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", "");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long8 = socialUserConnection0.getId();
        java.lang.String str9 = socialUserConnection0.getUserId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList1 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM2 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM2.setName("LoginVM{username='null', rememberMe=false}");
        java.lang.String str5 = loggerVM2.getLevel();
        logsResource0.changeLevel(loggerVM2);
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM7 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str8 = loggerVM7.getName();
        java.lang.String str9 = loggerVM7.getLevel();
        java.lang.String str10 = loggerVM7.getName();
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name argument cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggerVMList1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant5 = managedUserVM4.getCreatedDate();
        java.lang.String str6 = managedUserVM4.getCreatedBy();
        java.lang.String str7 = managedUserVM4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity8 = userResource3.updateUser(managedUserVM4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str7, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray7 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList8 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList8, userArray7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper6.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList8);
        java.time.Instant instant21 = null;
        java.time.Instant instant23 = null;
        java.time.Instant instant33 = null;
        java.time.Instant instant35 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant33, "hi!", instant35, (java.util.Set<java.lang.String>) strSet39);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM42 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant21, "", instant23, (java.util.Set<java.lang.String>) strSet39);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet43 = userMapper6.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet39);
        user0.setAuthorities(authoritySet43);
        java.lang.Long long45 = user0.getId();
        user0.setActivated(true);
        user0.setActivated(false);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
        org.junit.Assert.assertNull(long45);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        java.lang.Long long7 = aluno0.getId();
        com.unifacisa.tcc.domain.Aluno aluno9 = aluno0.habilitadoTcc((java.lang.Boolean) false);
        aluno0.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str13 = professor12.toString();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor15 = null;
        aluno14.setProfessor(professor15);
        java.lang.Long long17 = aluno14.getMatricula();
        java.lang.String str18 = aluno14.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean21 = aluno19.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor22 = aluno19.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean25 = aluno23.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor28 = null;
        aluno27.setProfessor(professor28);
        java.lang.Long long30 = aluno27.getMatricula();
        java.lang.String str31 = aluno27.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean34 = aluno32.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor35 = aluno32.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor37 = null;
        aluno36.setProfessor(professor37);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        aluno39.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor43 = null;
        aluno42.setProfessor(professor43);
        aluno42.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor48 = null;
        aluno47.setProfessor(professor48);
        java.lang.Long long50 = aluno47.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno51 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean54 = aluno52.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor56 = null;
        aluno55.setProfessor(professor56);
        com.unifacisa.tcc.domain.Aluno[] alunoArray58 = new com.unifacisa.tcc.domain.Aluno[] { aluno14, aluno19, aluno23, aluno26, aluno27, aluno32, aluno36, aluno39, aluno42, aluno47, aluno51, aluno52, aluno55 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet59 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet59, alunoArray58);
        com.unifacisa.tcc.domain.Professor professor61 = professor12.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet59);
        com.unifacisa.tcc.domain.Aluno aluno62 = aluno0.professor(professor12);
        com.unifacisa.tcc.domain.Aluno aluno64 = aluno62.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor65 = aluno64.getProfessor();
        com.unifacisa.tcc.domain.Professor professor66 = null;
        aluno64.setProfessor(professor66);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa69 = aluno64.segundoNome("ManagedUserVM{} UserDTO{login='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(aluno9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str13, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(professor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(professor35);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(alunoArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(professor61);
        org.junit.Assert.assertNotNull(aluno62);
        org.junit.Assert.assertNotNull(aluno64);
        org.junit.Assert.assertNotNull(professor65);
        org.junit.Assert.assertNotNull(pessoa69);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("error.concurrencyFailure", "hi!", "hi!", (java.lang.Long) 10L, "LoginVM{username='null', rememberMe=false}", "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}", "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}", "User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}", "LoginVM{username='null', rememberMe=false}", "", (java.lang.Long) 10L);
        java.lang.Long long12 = socialUserConnection11.getId();
        org.junit.Assert.assertNull(long12);
    }
}
