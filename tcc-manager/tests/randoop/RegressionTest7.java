import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        java.lang.String str15 = professor0.toString();
        com.unifacisa.tcc.domain.Professor professor17 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor18 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str21 = aluno20.getEmail();
        aluno20.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str26 = aluno25.getEmail();
        aluno25.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray29 = new com.unifacisa.tcc.domain.Aluno[] { aluno19, aluno20, aluno24, aluno25 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet30 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet30, alunoArray29);
        professor18.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet30);
        java.lang.String str33 = professor18.toString();
        com.unifacisa.tcc.domain.Professor professor35 = professor18.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet36 = professor18.getAlunos();
        professor17.setAlunos(alunoSet36);
        com.unifacisa.tcc.domain.Professor professor39 = professor17.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa41 = professor39.numeroContato((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Professor professor43 = professor39.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno44 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str45 = aluno44.getEmail();
        aluno44.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa49 = aluno44.matricula((java.lang.Long) 10L);
        java.lang.Long long50 = aluno44.getId();
        com.unifacisa.tcc.domain.Professor professor51 = professor43.removeAluno(aluno44);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(alunoArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str33, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor35);
        org.junit.Assert.assertNotNull(alunoSet36);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNotNull(pessoa41);
        org.junit.Assert.assertNotNull(professor43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(pessoa49);
        org.junit.Assert.assertNull(long50);
        org.junit.Assert.assertNotNull(professor51);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.getPrimeiroNome();
        java.lang.Boolean boolean2 = professor0.isDiponibilidade();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str13 = aluno12.getEmail();
        aluno12.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray16 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno7, aluno11, aluno12 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet17 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet17, alunoArray16);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet17);
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str21 = aluno20.getEmail();
        java.lang.Boolean boolean22 = aluno20.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor23 = professor5.addAluno(aluno20);
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str25 = aluno24.getEmail();
        aluno24.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection28 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean29 = aluno24.equals((java.lang.Object) socialUserConnection28);
        socialUserConnection28.setRefreshToken("error.validation");
        socialUserConnection28.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean34 = aluno20.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.domain.Professor professor35 = professor0.removeAluno(aluno20);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa37 = aluno20.primeiroNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Object obj38 = null;
        boolean boolean39 = aluno20.equals(obj38);
        com.unifacisa.tcc.domain.Aluno aluno41 = aluno20.habilitadoTcc((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(alunoArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(professor23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(professor35);
        org.junit.Assert.assertNotNull(pessoa37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(aluno41);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        java.time.Instant instant11 = null;
        java.time.Instant instant13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM21 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant11, "error.validation", instant13, (java.util.Set<java.lang.String>) strSet19);
        java.lang.String str22 = managedUserVM21.getFirstName();
        java.lang.String str23 = managedUserVM21.getPassword();
        java.util.Set<java.lang.String> strSet24 = managedUserVM21.getAuthorities();
        java.util.Set<java.lang.String> strSet25 = managedUserVM21.getAuthorities();
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet26 = userMapper0.authoritiesFromStrings(strSet25);
        com.unifacisa.tcc.domain.User user28 = userMapper0.userFromId((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.User user30 = userMapper0.userFromId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.User user32 = userMapper0.userFromId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "error.concurrencyFailure" + "'", str23, "error.concurrencyFailure");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(authoritySet26);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user32);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getProfileURL();
        java.lang.String str2 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setId((java.lang.Long) 10L);
        socialUserConnection0.setAccessToken("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.lang.String str7 = socialUserConnection0.getProviderId();
        java.lang.String str8 = socialUserConnection0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SocialUserConnection{id=10, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}', secret='null', refreshToken='null', expireTime=null}" + "'", str8, "SocialUserConnection{id=10, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}', secret='null', refreshToken='null', expireTime=null}");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getUsername();
        java.lang.Boolean boolean2 = loginVM0.isRememberMe();
        loginVM0.setUsername("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='Authority{name='null'}', numeroContato='null', habilitadoTcc='null'}");
        loginVM0.setRememberMe((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        loginVM0.setUsername("error.concurrencyFailure");
        java.lang.Boolean boolean3 = loginVM0.isRememberMe();
        java.lang.String str4 = loginVM0.toString();
        java.lang.String str5 = loginVM0.getUsername();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        java.lang.String str8 = loginVM0.toString();
        java.lang.Boolean boolean9 = loginVM0.isRememberMe();
        java.lang.String str10 = loginVM0.toString();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginVM{username='error.concurrencyFailure', rememberMe=null}" + "'", str4, "LoginVM{username='error.concurrencyFailure', rememberMe=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error.concurrencyFailure" + "'", str5, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LoginVM{username='error.concurrencyFailure', rememberMe=false}" + "'", str8, "LoginVM{username='error.concurrencyFailure', rememberMe=false}");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LoginVM{username='error.concurrencyFailure', rememberMe=false}" + "'", str10, "LoginVM{username='error.concurrencyFailure', rememberMe=false}");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str1 = loggerVM0.getLevel();
        java.lang.String str2 = loggerVM0.getName();
        loggerVM0.setLevel("ManagedUserVM{} UserDTO{login='LoginVM{username='null', rememberMe=false}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        loggerVM0.setLevel("LoggerVM{name='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', level='error.validation'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str16 = aluno15.getEmail();
        java.lang.Boolean boolean17 = aluno15.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor18 = professor0.addAluno(aluno15);
        com.unifacisa.tcc.domain.Professor professor19 = aluno15.getProfessor();
        com.unifacisa.tcc.domain.Professor professor20 = aluno15.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str22 = aluno21.getEmail();
        aluno21.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor25 = professor20.removeAluno(aluno21);
        com.unifacisa.tcc.domain.Professor professor26 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str29 = aluno28.getEmail();
        aluno28.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str34 = aluno33.getEmail();
        aluno33.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray37 = new com.unifacisa.tcc.domain.Aluno[] { aluno27, aluno28, aluno32, aluno33 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet38 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet38, alunoArray37);
        professor26.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet38);
        com.unifacisa.tcc.domain.Aluno aluno41 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str42 = aluno41.getEmail();
        java.lang.Boolean boolean43 = aluno41.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor44 = professor26.addAluno(aluno41);
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str46 = aluno45.getEmail();
        aluno45.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection49 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean50 = aluno45.equals((java.lang.Object) socialUserConnection49);
        socialUserConnection49.setRefreshToken("error.validation");
        socialUserConnection49.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean55 = aluno41.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str56 = aluno41.toString();
        java.lang.Boolean boolean57 = aluno41.isHabilitadoTcc();
        aluno41.setHabilitadoTcc((java.lang.Boolean) true);
        aluno41.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor62 = aluno41.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno63 = aluno21.professor(professor62);
        com.unifacisa.tcc.domain.Aluno aluno65 = aluno21.habilitadoTcc((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(professor18);
        org.junit.Assert.assertNotNull(professor19);
        org.junit.Assert.assertNotNull(professor20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(professor25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(alunoArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(professor44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str56, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNull(boolean57);
        org.junit.Assert.assertNotNull(professor62);
        org.junit.Assert.assertNotNull(aluno63);
        org.junit.Assert.assertNotNull(aluno65);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        java.lang.String str15 = professor0.toString();
        professor0.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str19 = aluno18.getEmail();
        aluno18.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor22 = aluno18.getProfessor();
        com.unifacisa.tcc.domain.Professor professor23 = professor0.addAluno(aluno18);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa25 = professor0.primeiroNome("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.Professor professor26 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str29 = aluno28.getEmail();
        aluno28.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str34 = aluno33.getEmail();
        aluno33.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray37 = new com.unifacisa.tcc.domain.Aluno[] { aluno27, aluno28, aluno32, aluno33 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet38 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet38, alunoArray37);
        professor26.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet38);
        java.lang.String str41 = professor26.toString();
        com.unifacisa.tcc.domain.Professor professor43 = professor26.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa45 = professor43.primeiroNome("");
        com.unifacisa.tcc.domain.Professor professor47 = professor43.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet48 = professor47.getAlunos();
        com.unifacisa.tcc.domain.Professor professor49 = professor0.alunos(alunoSet48);
        professor0.setDiponibilidade((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(professor22);
        org.junit.Assert.assertNotNull(professor23);
        org.junit.Assert.assertNotNull(pessoa25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(alunoArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str41, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor43);
        org.junit.Assert.assertNotNull(pessoa45);
        org.junit.Assert.assertNotNull(professor47);
        org.junit.Assert.assertNotNull(alunoSet48);
        org.junit.Assert.assertNotNull(professor49);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str1 = aluno0.getEmail();
        aluno0.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection4 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean5 = aluno0.equals((java.lang.Object) socialUserConnection4);
        socialUserConnection4.setRefreshToken("error.validation");
        socialUserConnection4.setDisplayName("hi!");
        socialUserConnection4.setRefreshToken("Authority{name='null'}");
        socialUserConnection4.setId((java.lang.Long) 0L);
        socialUserConnection4.setRefreshToken("User{login='null', firstName='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str16 = socialUserConnection4.getProviderId();
        java.lang.String str17 = socialUserConnection4.getProfileURL();
        java.lang.String str18 = socialUserConnection4.toString();
        socialUserConnection4.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SocialUserConnection{id=0, userId=null, providerId='null', providerUserId='null', rank=null, displayName='hi!', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='User{login='null', firstName='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}" + "'", str18, "SocialUserConnection{id=0, userId=null, providerId='null', providerUserId='null', rank=null, displayName='hi!', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='User{login='null', firstName='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.unifacisa.tcc.domain.Authority authority0 = new com.unifacisa.tcc.domain.Authority();
        java.lang.String str1 = authority0.toString();
        java.lang.String str2 = authority0.toString();
        authority0.setName("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str6 = professor5.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor8 = professor5.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa10 = professor8.primeiroNome("error.concurrencyFailure");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa12 = professor8.primeiroNome("SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        boolean boolean13 = authority0.equals((java.lang.Object) pessoa12);
        pessoa12.setPrimeiroNome("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='error.concurrencyFailure', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Authority{name='null'}" + "'", str1, "Authority{name='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Authority{name='null'}" + "'", str2, "Authority{name='null'}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(pessoa10);
        org.junit.Assert.assertNotNull(pessoa12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.time.Instant instant9 = null;
        java.time.Instant instant11 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM32 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant22, "error.validation", instant24, (java.util.Set<java.lang.String>) strSet30);
        com.unifacisa.tcc.service.dto.UserDTO userDTO33 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant9, "", instant11, (java.util.Set<java.lang.String>) strSet30);
        java.lang.String str34 = userDTO33.getLastName();
        java.lang.String str35 = userDTO33.getLastName();
        java.lang.String str36 = userDTO33.getLastName();
        java.lang.String str37 = userDTO33.getLastModifiedBy();
        userDTO33.setLogin("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        java.lang.String str40 = userDTO33.getFirstName();
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "error.concurrencyFailure" + "'", str34, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "error.concurrencyFailure" + "'", str35, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error.concurrencyFailure" + "'", str36, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.getImageUrl();
        java.lang.String str3 = user0.getLangKey();
        java.lang.String str4 = user0.getLogin();
        com.unifacisa.tcc.domain.User user5 = new com.unifacisa.tcc.domain.User();
        user5.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant8 = user5.getLastModifiedDate();
        user0.setLastModifiedDate(instant8);
        java.lang.String str10 = user0.getLogin();
        java.lang.String str11 = user0.getPassword();
        user0.setResetKey("Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}'}");
        user0.setActivated(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        java.lang.String str1 = user0.getCreatedBy();
        java.lang.String str2 = user0.getLangKey();
        com.unifacisa.tcc.domain.Professor professor3 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno4 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str6 = aluno5.getEmail();
        aluno5.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno9 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str11 = aluno10.getEmail();
        aluno10.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray14 = new com.unifacisa.tcc.domain.Aluno[] { aluno4, aluno5, aluno9, aluno10 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet15 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet15, alunoArray14);
        professor3.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet15);
        java.lang.String str18 = professor3.toString();
        com.unifacisa.tcc.domain.Professor professor19 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str22 = aluno21.getEmail();
        aluno21.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str27 = aluno26.getEmail();
        aluno26.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray30 = new com.unifacisa.tcc.domain.Aluno[] { aluno20, aluno21, aluno25, aluno26 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet31 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet31, alunoArray30);
        professor19.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet31);
        com.unifacisa.tcc.domain.Professor professor34 = professor3.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet31);
        boolean boolean35 = user0.equals((java.lang.Object) professor3);
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent36 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        com.unifacisa.tcc.domain.User user37 = new com.unifacisa.tcc.domain.User();
        java.lang.String str38 = user37.getCreatedBy();
        java.lang.String str39 = user37.getLangKey();
        java.time.Instant instant40 = user37.getCreatedDate();
        persistentAuditEvent36.setAuditEventDate(instant40);
        user0.setCreatedDate(instant40);
        boolean boolean43 = user0.getActivated();
        user0.setEmail("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=100, displayName='ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', expireTime=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(alunoArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str18, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(alunoArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(professor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno3 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str4 = aluno3.getEmail();
        aluno3.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno8 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str9 = aluno8.getEmail();
        aluno8.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray12 = new com.unifacisa.tcc.domain.Aluno[] { aluno2, aluno3, aluno7, aluno8 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet13 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet13, alunoArray12);
        professor1.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet13);
        java.lang.String str16 = professor1.toString();
        com.unifacisa.tcc.domain.Professor professor18 = professor1.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor19 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str22 = aluno21.getEmail();
        aluno21.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str27 = aluno26.getEmail();
        aluno26.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray30 = new com.unifacisa.tcc.domain.Aluno[] { aluno20, aluno21, aluno25, aluno26 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet31 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet31, alunoArray30);
        professor19.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet31);
        com.unifacisa.tcc.domain.Professor professor34 = professor18.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet31);
        aluno0.setProfessor(professor34);
        com.unifacisa.tcc.domain.Professor professor37 = professor34.diponibilidade((java.lang.Boolean) true);
        java.lang.Long long38 = professor34.getNumeroContato();
        professor34.setEmail("");
        com.unifacisa.tcc.domain.User user41 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO42 = new com.unifacisa.tcc.service.dto.UserDTO(user41);
        java.lang.String str43 = user41.getImageUrl();
        java.lang.String str44 = user41.getLangKey();
        java.lang.String str45 = user41.getLogin();
        com.unifacisa.tcc.domain.User user46 = new com.unifacisa.tcc.domain.User();
        user46.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant49 = user46.getLastModifiedDate();
        user41.setLastModifiedDate(instant49);
        user41.setPassword("SocialUserConnection{id=1, userId=error.validation, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str54 = aluno53.toString();
        com.unifacisa.tcc.domain.Professor professor55 = aluno53.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno57 = aluno53.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno59 = aluno57.habilitadoTcc((java.lang.Boolean) false);
        boolean boolean60 = user41.equals((java.lang.Object) aluno59);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa62 = aluno59.numeroContato((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.Professor professor63 = professor34.removeAluno(aluno59);
        com.unifacisa.tcc.domain.Aluno aluno64 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str65 = aluno64.getEmail();
        java.lang.Boolean boolean66 = aluno64.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor67 = aluno64.getProfessor();
        com.unifacisa.tcc.domain.Professor professor68 = aluno64.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno70 = aluno64.habilitadoTcc((java.lang.Boolean) true);
        aluno64.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor73 = professor34.addAluno(aluno64);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(alunoArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str16, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(alunoArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(professor34);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str54, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNull(professor55);
        org.junit.Assert.assertNotNull(aluno57);
        org.junit.Assert.assertNotNull(aluno59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(pessoa62);
        org.junit.Assert.assertNotNull(professor63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(boolean66);
        org.junit.Assert.assertNull(professor67);
        org.junit.Assert.assertNull(professor68);
        org.junit.Assert.assertNotNull(aluno70);
        org.junit.Assert.assertNotNull(professor73);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.time.Instant instant10 = null;
        java.time.Instant instant12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM20 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant10, "error.validation", instant12, (java.util.Set<java.lang.String>) strSet18);
        java.lang.String str21 = managedUserVM20.getFirstName();
        java.lang.String str22 = managedUserVM20.getPassword();
        java.util.Set<java.lang.String> strSet23 = managedUserVM20.getAuthorities();
        java.util.Set<java.lang.String> strSet24 = managedUserVM20.getAuthorities();
        java.lang.String str25 = managedUserVM20.toString();
        java.util.Set<java.lang.String> strSet26 = managedUserVM20.getAuthorities();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "error.concurrencyFailure" + "'", str22, "error.concurrencyFailure");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}" + "'", str25, "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str1 = aluno0.getEmail();
        java.lang.Boolean boolean2 = aluno0.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor3 = aluno0.getProfessor();
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str7 = aluno6.getEmail();
        aluno6.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str12 = aluno11.getEmail();
        aluno11.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray15 = new com.unifacisa.tcc.domain.Aluno[] { aluno5, aluno6, aluno10, aluno11 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet16 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet16, alunoArray15);
        professor4.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet16);
        java.lang.String str19 = professor4.toString();
        com.unifacisa.tcc.domain.Professor professor20 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str23 = aluno22.getEmail();
        aluno22.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str28 = aluno27.getEmail();
        aluno27.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray31 = new com.unifacisa.tcc.domain.Aluno[] { aluno21, aluno22, aluno26, aluno27 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet32 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet32, alunoArray31);
        professor20.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet32);
        com.unifacisa.tcc.domain.Professor professor35 = professor4.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet32);
        com.unifacisa.tcc.domain.Aluno aluno36 = aluno0.professor(professor35);
        com.unifacisa.tcc.domain.User user37 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO38 = new com.unifacisa.tcc.service.dto.UserDTO(user37);
        java.lang.String str39 = user37.getImageUrl();
        user37.setLangKey("UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        user37.setActivated(true);
        boolean boolean44 = aluno0.equals((java.lang.Object) user37);
        java.lang.String str45 = aluno0.toString();
        aluno0.setEmail("SocialUserConnection{id=null, userId=null, providerId='Authority{name='null'}', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(professor3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(alunoArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str19, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(alunoArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(professor35);
        org.junit.Assert.assertNotNull(aluno36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str45, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setImageURL("error.concurrencyFailure");
        boolean boolean5 = socialUserConnection0.equals((java.lang.Object) "");
        java.lang.Long long6 = socialUserConnection0.getId();
        socialUserConnection0.setRefreshToken("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str9 = socialUserConnection0.getSecret();
        java.lang.String str10 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setId((java.lang.Long) 100L);
        socialUserConnection0.setRank((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.getImageUrl();
        boolean boolean4 = user0.equals((java.lang.Object) (byte) -1);
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getLangKey();
        java.time.Instant instant8 = user0.getResetDate();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper9 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user11 = userMapper9.userFromId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.User user13 = userMapper9.userFromId((java.lang.Long) 100L);
        user13.setEmail("LoggerVM{name='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', level='error.validation'}");
        java.time.Instant instant16 = user13.getLastModifiedDate();
        user0.setLastModifiedDate(instant16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(instant8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 1L);
        boolean boolean3 = user2.getActivated();
        java.time.Instant instant4 = user2.getLastModifiedDate();
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str6 = aluno5.getEmail();
        aluno5.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection9 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean10 = aluno5.equals((java.lang.Object) socialUserConnection9);
        com.unifacisa.tcc.domain.Aluno aluno12 = aluno5.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno14 = aluno5.habilitadoTcc((java.lang.Boolean) true);
        java.lang.String str15 = aluno5.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor16 = aluno5.getProfessor();
        boolean boolean17 = user2.equals((java.lang.Object) aluno5);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa19 = aluno5.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='0', email='error.concurrencyFailure', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(aluno12);
        org.junit.Assert.assertNotNull(aluno14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(professor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(pessoa19);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setImageURL("error.concurrencyFailure");
        boolean boolean5 = socialUserConnection0.equals((java.lang.Object) "");
        java.lang.Long long6 = socialUserConnection0.getId();
        socialUserConnection0.setRefreshToken("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str9 = socialUserConnection0.getUserId();
        java.lang.String str10 = socialUserConnection0.toString();
        java.lang.String str11 = socialUserConnection0.getProviderUserId();
        java.lang.String str12 = socialUserConnection0.toString();
        java.lang.Long long13 = socialUserConnection0.getExpireTime();
        socialUserConnection0.setSecret("LoginVM{username='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', rememberMe=null}");
        java.lang.String str16 = socialUserConnection0.getProviderUserId();
        socialUserConnection0.setExpireTime((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}" + "'", str10, "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}" + "'", str12, "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.getImageUrl();
        boolean boolean4 = user0.equals((java.lang.Object) (byte) -1);
        java.lang.String str5 = user0.getLastName();
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet6 = user0.getAuthorities();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getLangKey();
        java.time.Instant instant9 = user0.getResetDate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(authoritySet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(instant9);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.getImageUrl();
        user0.setLangKey("UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant27 = null;
        java.time.Instant instant29 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM37 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant27, "error.validation", instant29, (java.util.Set<java.lang.String>) strSet35);
        com.unifacisa.tcc.service.dto.UserDTO userDTO38 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant14, "", instant16, (java.util.Set<java.lang.String>) strSet35);
        java.lang.String str39 = userDTO38.getLastModifiedBy();
        java.time.Instant instant40 = userDTO38.getLastModifiedDate();
        boolean boolean41 = user0.equals((java.lang.Object) userDTO38);
        user0.setId((java.lang.Long) 1L);
        java.lang.String str44 = user0.getCreatedBy();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.lang.Long long2 = persistentAuditEvent0.getId();
        java.lang.Long long3 = persistentAuditEvent0.getId();
        com.unifacisa.tcc.domain.User user4 = new com.unifacisa.tcc.domain.User();
        java.lang.String str5 = user4.getCreatedBy();
        java.lang.String str6 = user4.getLangKey();
        java.time.Instant instant7 = user4.getCreatedDate();
        persistentAuditEvent0.setAuditEventDate(instant7);
        java.time.Instant instant9 = persistentAuditEvent0.getAuditEventDate();
        com.unifacisa.tcc.domain.User user10 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO11 = new com.unifacisa.tcc.service.dto.UserDTO(user10);
        java.lang.String str12 = user10.getImageUrl();
        java.lang.String str13 = user10.getLangKey();
        user10.setLastModifiedBy("");
        user10.setLastModifiedBy("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.time.Instant instant18 = user10.getCreatedDate();
        persistentAuditEvent0.setAuditEventDate(instant18);
        java.time.Instant instant20 = persistentAuditEvent0.getAuditEventDate();
        persistentAuditEvent0.setPrincipal("LoggerVM{name='error.concurrencyFailure', level='error.validation'}");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = persistentAuditEvent0.getData();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.getImageUrl();
        boolean boolean4 = user0.equals((java.lang.Object) (byte) -1);
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getFirstName();
        java.time.Instant instant7 = user0.getResetDate();
        com.unifacisa.tcc.service.dto.UserDTO userDTO8 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str9 = user0.getCreatedBy();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setUserId("error.validation");
        java.lang.String str3 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setDisplayName("error.validation");
        socialUserConnection0.setImageURL("Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}'}");
        java.lang.String str8 = socialUserConnection0.getAccessToken();
        java.lang.String str9 = socialUserConnection0.getSecret();
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='10', habilitadoTcc='true'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str1 = loggerVM0.getName();
        loggerVM0.setLevel("error.validation");
        java.lang.String str4 = loggerVM0.getLevel();
        java.lang.String str5 = loggerVM0.toString();
        java.lang.String str6 = loggerVM0.getLevel();
        java.lang.String str7 = loggerVM0.getLevel();
        loggerVM0.setName("Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error.validation" + "'", str4, "error.validation");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str5, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error.validation" + "'", str6, "error.validation");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error.validation" + "'", str7, "error.validation");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("LoginVM{username='error.concurrencyFailure', rememberMe=null}", "Professor{id=null, primeiroNome='', segundoNome='null', matricula='null', email='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', numeroContato='null', diponibilidade='false'}", "User{login='null', firstName='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", (java.lang.Long) 1L, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}", "UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", "Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", "ManagedUserVM{} UserDTO{login='SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", (java.lang.Long) 100L);
        socialUserConnection11.setUserId("Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}'}");
        socialUserConnection11.setProfileURL("User{login='null', firstName='null', lastName='SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=10}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        java.lang.String str1 = user0.getCreatedBy();
        java.lang.String str2 = user0.getLastModifiedBy();
        user0.setCreatedBy("ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.lang.String str5 = user0.toString();
        com.unifacisa.tcc.domain.User user6 = new com.unifacisa.tcc.domain.User();
        java.lang.String str7 = user6.getCreatedBy();
        java.lang.String str8 = user6.getLastModifiedBy();
        user6.setEmail("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.domain.User user11 = new com.unifacisa.tcc.domain.User();
        java.lang.String str12 = user11.getCreatedBy();
        user11.setFirstName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.service.dto.UserDTO userDTO15 = new com.unifacisa.tcc.service.dto.UserDTO(user11);
        java.time.Instant instant16 = userDTO15.getLastModifiedDate();
        user6.setCreatedDate(instant16);
        user0.setResetDate(instant16);
        java.lang.String str19 = user0.getLastModifiedBy();
        java.lang.String str20 = user0.getLastModifiedBy();
        user0.setLastName("error.validation");
        java.time.Instant instant23 = user0.getLastModifiedDate();
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM24 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str25 = managedUserVM24.getPassword();
        java.lang.String str26 = managedUserVM24.toString();
        java.lang.String str27 = managedUserVM24.getPassword();
        java.lang.String str28 = managedUserVM24.getLastName();
        managedUserVM24.setLogin("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}");
        java.time.Instant instant31 = managedUserVM24.getCreatedDate();
        boolean boolean32 = managedUserVM24.isActivated();
        java.lang.String str33 = managedUserVM24.getPassword();
        com.unifacisa.tcc.domain.User user34 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO35 = new com.unifacisa.tcc.service.dto.UserDTO(user34);
        java.lang.String str36 = user34.getImageUrl();
        java.lang.String str37 = user34.getLangKey();
        java.lang.String str38 = user34.getLogin();
        com.unifacisa.tcc.domain.User user39 = new com.unifacisa.tcc.domain.User();
        user39.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant42 = user39.getLastModifiedDate();
        user34.setLastModifiedDate(instant42);
        java.lang.String str44 = user34.getLogin();
        user34.setLastName("");
        user34.setLastModifiedBy("Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent49 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        com.unifacisa.tcc.domain.User user50 = new com.unifacisa.tcc.domain.User();
        java.lang.String str51 = user50.getCreatedBy();
        java.lang.String str52 = user50.getLangKey();
        java.time.Instant instant53 = user50.getCreatedDate();
        persistentAuditEvent49.setAuditEventDate(instant53);
        java.lang.String str55 = persistentAuditEvent49.getPrincipal();
        persistentAuditEvent49.setAuditEventType("SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.User user58 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO59 = new com.unifacisa.tcc.service.dto.UserDTO(user58);
        java.lang.String str60 = user58.getImageUrl();
        java.lang.String str61 = user58.getLangKey();
        user58.setLastModifiedBy("");
        com.unifacisa.tcc.domain.User user64 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO65 = new com.unifacisa.tcc.service.dto.UserDTO(user64);
        java.lang.String str66 = user64.getImageUrl();
        java.lang.String str67 = user64.getLangKey();
        java.lang.String str68 = user64.getLogin();
        com.unifacisa.tcc.domain.User user69 = new com.unifacisa.tcc.domain.User();
        user69.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant72 = user69.getLastModifiedDate();
        user64.setLastModifiedDate(instant72);
        user58.setLastModifiedDate(instant72);
        persistentAuditEvent49.setAuditEventDate(instant72);
        user34.setLastModifiedDate(instant72);
        managedUserVM24.setLastModifiedDate(instant72);
        user0.setLastModifiedDate(instant72);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str5, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str26, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(instant72);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.time.Instant instant39 = null;
        java.time.Instant instant41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM49 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant39, "error.validation", instant41, (java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.service.dto.UserDTO userDTO50 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant26, "", instant28, (java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.service.dto.UserDTO userDTO51 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 10L, "", "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", "error.concurrencyFailure", "hi!", false, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "LoginVM{username='null', rememberMe=null}", "LoginVM{username='null', rememberMe=null}", instant14, "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", instant16, (java.util.Set<java.lang.String>) strSet47);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet52 = userMapper0.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.domain.User user54 = userMapper0.userFromId((java.lang.Long) 100L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper55 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray56 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList57 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList57, userArray56);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList59 = userMapper55.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList57);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper60 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray61 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList62 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList62, userArray61);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList64 = userMapper60.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList62);
        java.util.List<com.unifacisa.tcc.domain.User> userList65 = userMapper55.userDTOsToUsers(userDTOList64);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper66 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray67 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList68 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList68, userArray67);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList70 = userMapper66.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList68);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper71 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray72 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList73 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList73, userArray72);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList75 = userMapper71.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList73);
        java.util.List<com.unifacisa.tcc.domain.User> userList76 = userMapper66.userDTOsToUsers(userDTOList75);
        java.util.List<com.unifacisa.tcc.domain.User> userList77 = userMapper55.userDTOsToUsers(userDTOList75);
        java.util.List<com.unifacisa.tcc.domain.User> userList78 = userMapper0.userDTOsToUsers(userDTOList75);
        com.unifacisa.tcc.domain.User user80 = userMapper0.userFromId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(authoritySet52);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(userArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(userDTOList59);
        org.junit.Assert.assertNotNull(userArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(userDTOList64);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(userArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(userDTOList70);
        org.junit.Assert.assertNotNull(userArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(userDTOList75);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(userList77);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(user80);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str16 = aluno15.getEmail();
        java.lang.Boolean boolean17 = aluno15.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor18 = professor0.addAluno(aluno15);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa20 = professor18.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa22 = professor18.segundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str24 = aluno23.getEmail();
        java.lang.Boolean boolean25 = aluno23.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor26 = aluno23.getProfessor();
        com.unifacisa.tcc.domain.Professor professor27 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str30 = aluno29.getEmail();
        aluno29.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno34 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str35 = aluno34.getEmail();
        aluno34.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray38 = new com.unifacisa.tcc.domain.Aluno[] { aluno28, aluno29, aluno33, aluno34 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet39 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet39, alunoArray38);
        professor27.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet39);
        java.lang.String str42 = professor27.toString();
        com.unifacisa.tcc.domain.Professor professor43 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno44 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str46 = aluno45.getEmail();
        aluno45.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno49 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno50 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str51 = aluno50.getEmail();
        aluno50.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray54 = new com.unifacisa.tcc.domain.Aluno[] { aluno44, aluno45, aluno49, aluno50 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet55 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet55, alunoArray54);
        professor43.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet55);
        com.unifacisa.tcc.domain.Professor professor58 = professor27.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet55);
        com.unifacisa.tcc.domain.Aluno aluno59 = aluno23.professor(professor58);
        com.unifacisa.tcc.domain.Aluno aluno61 = aluno23.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor62 = professor18.removeAluno(aluno61);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa64 = aluno61.numeroContato((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa66 = aluno61.segundoNome("Aluno{id=null, primeiroNome='null', segundoNome='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection67 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str68 = socialUserConnection67.getUserId();
        java.lang.Long long69 = socialUserConnection67.getRank();
        java.lang.String str70 = socialUserConnection67.getRefreshToken();
        socialUserConnection67.setProfileURL("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection67.setId((java.lang.Long) (-1L));
        socialUserConnection67.setUserId("LoginVM{username='null', rememberMe=false}");
        boolean boolean77 = aluno61.equals((java.lang.Object) socialUserConnection67);
        java.lang.String str78 = socialUserConnection67.getProviderId();
        socialUserConnection67.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(professor18);
        org.junit.Assert.assertNotNull(pessoa20);
        org.junit.Assert.assertNotNull(pessoa22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(professor26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(alunoArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str42, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(alunoArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(professor58);
        org.junit.Assert.assertNotNull(aluno59);
        org.junit.Assert.assertNotNull(aluno61);
        org.junit.Assert.assertNotNull(professor62);
        org.junit.Assert.assertNotNull(pessoa64);
        org.junit.Assert.assertNotNull(pessoa66);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(long69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant3 = user0.getLastModifiedDate();
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet4 = null;
        user0.setAuthorities(authoritySet4);
        user0.setActivationKey("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}");
        java.lang.String str8 = user0.getResetKey();
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCreatedBy();
        java.lang.String str11 = user0.getImageUrl();
        user0.setActivationKey("SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.lang.Long long14 = user0.getId();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("LoggerVM{name='null', level='error.validation'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "", (java.lang.Long) 1L, "error.concurrencyFailure", "error.validation", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", "Authority{name='null'}", "Professor{id=null, primeiroNome='', segundoNome='null', matricula='null', email='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', numeroContato='null', diponibilidade='false'}", (java.lang.Long) 100L);
        socialUserConnection11.setSecret("ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.lang.String str14 = socialUserConnection11.getRefreshToken();
        boolean boolean16 = socialUserConnection11.equals((java.lang.Object) "LoginVM{username='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', rememberMe=false}");
        java.lang.String str17 = socialUserConnection11.getImageURL();
        java.lang.String str18 = socialUserConnection11.getImageURL();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Professor{id=null, primeiroNome='', segundoNome='null', matricula='null', email='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', numeroContato='null', diponibilidade='false'}" + "'", str14, "Professor{id=null, primeiroNome='', segundoNome='null', matricula='null', email='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', numeroContato='null', diponibilidade='false'}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str17, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str18, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno3 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str4 = aluno3.getEmail();
        aluno3.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno8 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str9 = aluno8.getEmail();
        aluno8.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray12 = new com.unifacisa.tcc.domain.Aluno[] { aluno2, aluno3, aluno7, aluno8 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet13 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet13, alunoArray12);
        professor1.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet13);
        aluno0.setProfessor(professor1);
        java.lang.Boolean boolean17 = professor1.isDiponibilidade();
        java.lang.Boolean boolean18 = professor1.isDiponibilidade();
        com.unifacisa.tcc.domain.Professor professor19 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str22 = aluno21.getEmail();
        aluno21.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str27 = aluno26.getEmail();
        aluno26.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray30 = new com.unifacisa.tcc.domain.Aluno[] { aluno20, aluno21, aluno25, aluno26 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet31 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet31, alunoArray30);
        professor19.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet31);
        com.unifacisa.tcc.domain.Aluno aluno34 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str35 = aluno34.getEmail();
        java.lang.Boolean boolean36 = aluno34.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor37 = professor19.addAluno(aluno34);
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str39 = aluno38.getEmail();
        aluno38.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection42 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean43 = aluno38.equals((java.lang.Object) socialUserConnection42);
        socialUserConnection42.setRefreshToken("error.validation");
        socialUserConnection42.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean48 = aluno34.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str49 = aluno34.toString();
        java.lang.Boolean boolean50 = aluno34.isHabilitadoTcc();
        java.lang.String str51 = aluno34.toString();
        aluno34.setPrimeiroNome("Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        aluno34.setEmail("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.domain.Professor professor56 = null;
        com.unifacisa.tcc.domain.Aluno aluno57 = aluno34.professor(professor56);
        com.unifacisa.tcc.domain.Professor professor58 = professor1.removeAluno(aluno34);
        com.unifacisa.tcc.domain.Professor professor59 = null;
        aluno34.setProfessor(professor59);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(alunoArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(alunoArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str49, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNull(boolean50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str51, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(aluno57);
        org.junit.Assert.assertNotNull(professor58);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.getImageUrl();
        java.lang.String str3 = user0.getLangKey();
        user0.setLastModifiedBy("");
        user0.setLastName("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.User user8 = new com.unifacisa.tcc.domain.User();
        java.lang.String str9 = user8.getCreatedBy();
        java.lang.String str10 = user8.getLastModifiedBy();
        user8.setCreatedBy("ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.lang.String str13 = user8.toString();
        com.unifacisa.tcc.domain.User user14 = new com.unifacisa.tcc.domain.User();
        java.lang.String str15 = user14.getCreatedBy();
        java.lang.String str16 = user14.getLastModifiedBy();
        user14.setEmail("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.domain.User user19 = new com.unifacisa.tcc.domain.User();
        java.lang.String str20 = user19.getCreatedBy();
        user19.setFirstName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.service.dto.UserDTO userDTO23 = new com.unifacisa.tcc.service.dto.UserDTO(user19);
        java.time.Instant instant24 = userDTO23.getLastModifiedDate();
        user14.setCreatedDate(instant24);
        user8.setResetDate(instant24);
        java.lang.String str27 = user8.getFirstName();
        java.lang.String str28 = user8.getLastName();
        java.time.Instant instant29 = user8.getLastModifiedDate();
        user0.setCreatedDate(instant29);
        java.lang.String str31 = user0.getCreatedBy();
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet32 = user0.getAuthorities();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str13, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(authoritySet32);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        java.lang.String str15 = professor0.toString();
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet16 = professor0.getAlunos();
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.time.Instant instant39 = null;
        java.time.Instant instant41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM49 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant39, "error.validation", instant41, (java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.service.dto.UserDTO userDTO50 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant26, "", instant28, (java.util.Set<java.lang.String>) strSet47);
        java.lang.String str51 = userDTO50.getLastName();
        java.lang.String str52 = userDTO50.getEmail();
        userDTO50.setId((java.lang.Long) 0L);
        java.lang.String str55 = userDTO50.getImageUrl();
        userDTO50.setLogin("UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        boolean boolean58 = professor0.equals((java.lang.Object) userDTO50);
        professor0.setDiponibilidade((java.lang.Boolean) true);
        java.lang.Long long61 = professor0.getMatricula();
        com.unifacisa.tcc.domain.Professor professor62 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno63 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno64 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str65 = aluno64.getEmail();
        aluno64.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno68 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno69 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str70 = aluno69.getEmail();
        aluno69.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray73 = new com.unifacisa.tcc.domain.Aluno[] { aluno63, aluno64, aluno68, aluno69 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet74 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet74, alunoArray73);
        professor62.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet74);
        com.unifacisa.tcc.domain.Aluno aluno77 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str78 = aluno77.getEmail();
        java.lang.Boolean boolean79 = aluno77.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor80 = professor62.addAluno(aluno77);
        aluno77.setNumeroContato((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Professor professor83 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str84 = professor83.getPrimeiroNome();
        java.lang.Boolean boolean85 = professor83.isDiponibilidade();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa87 = professor83.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.Aluno aluno88 = aluno77.professor(professor83);
        com.unifacisa.tcc.domain.Professor professor89 = professor0.addAluno(aluno77);
        java.lang.String str90 = professor0.toString();
        java.lang.Long long91 = professor0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(alunoSet16);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "error.concurrencyFailure" + "'", str51, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "error.concurrencyFailure" + "'", str52, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(alunoArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(boolean79);
        org.junit.Assert.assertNotNull(professor80);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(boolean85);
        org.junit.Assert.assertNotNull(pessoa87);
        org.junit.Assert.assertNotNull(aluno88);
        org.junit.Assert.assertNotNull(professor89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}" + "'", str90, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertNull(long91);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.time.Instant instant9 = null;
        java.time.Instant instant11 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM32 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant22, "error.validation", instant24, (java.util.Set<java.lang.String>) strSet30);
        com.unifacisa.tcc.service.dto.UserDTO userDTO33 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant9, "", instant11, (java.util.Set<java.lang.String>) strSet30);
        java.lang.String str34 = userDTO33.getLogin();
        java.lang.String str35 = userDTO33.getImageUrl();
        java.lang.String str36 = userDTO33.getLastName();
        java.lang.String str37 = userDTO33.getLastModifiedBy();
        java.lang.String str38 = userDTO33.getImageUrl();
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error.concurrencyFailure" + "'", str36, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setRefreshToken("LoginVM{username='null', rememberMe=null}");
        java.lang.Long long4 = socialUserConnection0.getRank();
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str13 = aluno12.getEmail();
        aluno12.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray16 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno7, aluno11, aluno12 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet17 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet17, alunoArray16);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet17);
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str21 = aluno20.getEmail();
        java.lang.Boolean boolean22 = aluno20.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor23 = professor5.addAluno(aluno20);
        aluno20.setNumeroContato((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Professor professor26 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str27 = professor26.getPrimeiroNome();
        java.lang.Boolean boolean28 = professor26.isDiponibilidade();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa30 = professor26.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.Aluno aluno31 = aluno20.professor(professor26);
        java.lang.Long long32 = aluno31.getMatricula();
        java.lang.Long long33 = aluno31.getId();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa35 = aluno31.matricula((java.lang.Long) 100L);
        boolean boolean36 = socialUserConnection0.equals((java.lang.Object) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(alunoArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(professor23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(pessoa30);
        org.junit.Assert.assertNotNull(aluno31);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertNull(long33);
        org.junit.Assert.assertNotNull(pessoa35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setImageURL("error.concurrencyFailure");
        boolean boolean5 = socialUserConnection0.equals((java.lang.Object) "");
        java.lang.Long long6 = socialUserConnection0.getId();
        socialUserConnection0.setRefreshToken("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str9 = socialUserConnection0.getUserId();
        java.lang.Long long10 = socialUserConnection0.getRank();
        java.lang.String str11 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) 100L);
        socialUserConnection0.setProviderId("LoggerVM{name='null', level='User{login='null', firstName='null', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
        java.lang.Long long16 = socialUserConnection0.getId();
        java.lang.String str17 = socialUserConnection0.getAccessToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        java.lang.String str1 = user0.getCreatedBy();
        java.lang.String str2 = user0.getLastModifiedBy();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getActivationKey();
        java.lang.String str5 = user0.getCreatedBy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.unifacisa.tcc.domain.Authority authority0 = new com.unifacisa.tcc.domain.Authority();
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM1 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str2 = loginVM1.getUsername();
        loginVM1.setUsername("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.lang.Boolean boolean5 = loginVM1.isRememberMe();
        boolean boolean6 = authority0.equals((java.lang.Object) loginVM1);
        java.lang.String str7 = authority0.getName();
        java.lang.String str8 = authority0.toString();
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM12 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("error.validation", "error.validation", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str13 = fieldErrorVM12.getObjectName();
        java.lang.String str14 = fieldErrorVM12.getField();
        java.lang.String str15 = fieldErrorVM12.getField();
        boolean boolean16 = authority0.equals((java.lang.Object) fieldErrorVM12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authority{name='null'}" + "'", str8, "Authority{name='null'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error.validation" + "'", str13, "error.validation");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error.validation" + "'", str14, "error.validation");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "error.validation" + "'", str15, "error.validation");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.time.Instant instant9 = null;
        java.time.Instant instant11 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM32 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant22, "error.validation", instant24, (java.util.Set<java.lang.String>) strSet30);
        com.unifacisa.tcc.service.dto.UserDTO userDTO33 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant9, "", instant11, (java.util.Set<java.lang.String>) strSet30);
        java.lang.String str34 = userDTO33.getLastName();
        java.lang.String str35 = userDTO33.getLastName();
        java.lang.String str36 = userDTO33.getLastName();
        java.time.Instant instant37 = userDTO33.getLastModifiedDate();
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "error.concurrencyFailure" + "'", str34, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "error.concurrencyFailure" + "'", str35, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error.concurrencyFailure" + "'", str36, "error.concurrencyFailure");
        org.junit.Assert.assertNull(instant37);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        java.lang.String str15 = professor0.toString();
        com.unifacisa.tcc.domain.Professor professor17 = professor0.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet18 = professor0.getAlunos();
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM19 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str20 = managedUserVM19.getCreatedBy();
        java.time.Instant instant21 = managedUserVM19.getCreatedDate();
        boolean boolean22 = professor0.equals((java.lang.Object) managedUserVM19);
        boolean boolean23 = managedUserVM19.isActivated();
        java.lang.Long long24 = managedUserVM19.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor17);
        org.junit.Assert.assertNotNull(alunoSet18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(instant21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(long24);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("LoginVM{username='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', rememberMe=null}", "SocialUserConnection{id=1, userId=error.validation, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='0', habilitadoTcc='null'}", (java.lang.Long) 0L, "LoggerVM{name='null', level='null'}", "Authority{name='null'}", "LoggerVM{name='null', level='User{login='null', firstName='null', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}", "UserDTO{login='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", "LoggerVM{name='null', level='error.validation'}", "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", (java.lang.Long) 10L);
        socialUserConnection11.setExpireTime((java.lang.Long) 10L);
        java.lang.String str14 = socialUserConnection11.getImageURL();
        socialUserConnection11.setRank((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LoggerVM{name='null', level='User{login='null', firstName='null', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}" + "'", str14, "LoggerVM{name='null', level='User{login='null', firstName='null', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.toString();
        com.unifacisa.tcc.domain.User user3 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO4 = new com.unifacisa.tcc.service.dto.UserDTO(user3);
        java.lang.String str5 = user3.getImageUrl();
        boolean boolean7 = user3.equals((java.lang.Object) (byte) -1);
        java.lang.String str8 = user3.getLastName();
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet9 = user3.getAuthorities();
        user0.setAuthorities(authoritySet9);
        user0.setResetKey("SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.time.Instant instant13 = user0.getResetDate();
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection14 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str15 = socialUserConnection14.getUserId();
        socialUserConnection14.setDisplayName("");
        java.lang.String str18 = socialUserConnection14.getProfileURL();
        boolean boolean19 = user0.equals((java.lang.Object) socialUserConnection14);
        com.unifacisa.tcc.service.dto.UserDTO userDTO20 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str21 = user0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str2, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(authoritySet9);
        org.junit.Assert.assertNull(instant13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str21, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str1 = loggerVM0.getName();
        loggerVM0.setLevel("error.validation");
        java.lang.String str4 = loggerVM0.getLevel();
        java.lang.String str5 = loggerVM0.toString();
        loggerVM0.setLevel("UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.lang.String str8 = loggerVM0.toString();
        loggerVM0.setLevel("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error.validation" + "'", str4, "error.validation");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str5, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LoggerVM{name='null', level='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}'}" + "'", str8, "LoggerVM{name='null', level='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}'}");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        socialUserConnection0.setId((java.lang.Long) (-1L));
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        socialUserConnection0.setDisplayName("ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.lang.String str11 = socialUserConnection0.getProviderId();
        java.lang.String str12 = socialUserConnection0.getProviderUserId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        java.lang.String str15 = professor0.toString();
        com.unifacisa.tcc.domain.Professor professor17 = professor0.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa19 = professor17.primeiroNome("");
        professor17.setDiponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor23 = professor17.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor25 = professor23.diponibilidade((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor17);
        org.junit.Assert.assertNotNull(pessoa19);
        org.junit.Assert.assertNotNull(professor23);
        org.junit.Assert.assertNotNull(professor25);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        java.time.Instant instant21 = null;
        com.unifacisa.tcc.domain.User user23 = new com.unifacisa.tcc.domain.User();
        java.lang.String str24 = user23.getCreatedBy();
        user23.setFirstName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.service.dto.UserDTO userDTO27 = new com.unifacisa.tcc.service.dto.UserDTO(user23);
        java.time.Instant instant28 = userDTO27.getLastModifiedDate();
        java.time.Instant instant39 = null;
        java.time.Instant instant41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM49 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant39, "error.validation", instant41, (java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM50 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=10}", "User{login='null', firstName='null', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "User{login='null', firstName='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", false, "Aluno{id=null, primeiroNome='null', segundoNome='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}", "LoginVM{username='null', rememberMe=false}", "error.validation", instant21, "UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", instant28, (java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.domain.User user52 = new com.unifacisa.tcc.domain.User();
        java.lang.String str53 = user52.getCreatedBy();
        java.lang.String str54 = user52.getLastModifiedBy();
        user52.setResetKey("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str57 = user52.getEmail();
        java.time.Instant instant58 = user52.getLastModifiedDate();
        java.lang.String[] strArray82 = new java.lang.String[] { "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "LoggerVM{name='null', level='null'}", "Professor{id=null, primeiroNome='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "Professor{id=null, primeiroNome='', segundoNome='null', matricula='null', email='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', numeroContato='null', diponibilidade='false'}", "ManagedUserVM{} UserDTO{login='SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", "SocialUserConnection{id=1, userId=error.validation, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "LoginVM{username='null', rememberMe=false}", "User{login='null', firstName='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "User{login='null', firstName='null', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}", "hi!", "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=10}", "User{login='null', firstName='null', lastName='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" };
        java.util.LinkedHashSet<java.lang.String> strSet83 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet83, strArray82);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM85 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 0L, "LoginVM{username='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', rememberMe=false}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "", true, "Aluno{id=null, primeiroNome='null', segundoNome='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}", "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", instant21, "LoginVM{username='null', rememberMe=null}", instant58, (java.util.Set<java.lang.String>) strSet83);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet86 = userMapper0.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet83);
        com.unifacisa.tcc.domain.User user87 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO88 = new com.unifacisa.tcc.service.dto.UserDTO(user87);
        java.time.Instant instant89 = user87.getResetDate();
        user87.setLangKey("LoginVM{username='null', rememberMe=false}");
        user87.setId((java.lang.Long) 0L);
        java.lang.String str94 = user87.getLogin();
        com.unifacisa.tcc.service.dto.UserDTO userDTO95 = userMapper0.userToUserDTO(user87);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(authoritySet86);
        org.junit.Assert.assertNull(instant89);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNotNull(userDTO95);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        java.lang.String str1 = user0.getCreatedBy();
        java.lang.String str2 = user0.getLangKey();
        java.time.Instant instant3 = user0.getCreatedDate();
        java.lang.String str4 = user0.getLastName();
        user0.setId((java.lang.Long) 100L);
        java.lang.String str7 = user0.getImageUrl();
        user0.setPassword("LoginVM{username='LoginVM{username='Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', rememberMe=false}', rememberMe=false}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setProviderId("");
        java.lang.String str4 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setRank((java.lang.Long) 100L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper7 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user9 = userMapper7.userFromId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.User user10 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO11 = new com.unifacisa.tcc.service.dto.UserDTO(user10);
        java.lang.String str12 = user10.getImageUrl();
        boolean boolean14 = user10.equals((java.lang.Object) (byte) -1);
        java.lang.String str15 = user10.getLastName();
        java.lang.String str16 = user10.getFirstName();
        java.time.Instant instant17 = user10.getResetDate();
        com.unifacisa.tcc.service.dto.UserDTO userDTO18 = userMapper7.userToUserDTO(user10);
        com.unifacisa.tcc.domain.User user20 = userMapper7.userFromId((java.lang.Long) (-1L));
        user20.setLangKey("ManagedUserVM{} UserDTO{login='LoggerVM{name='null', level='error.validation'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean23 = socialUserConnection0.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='LoggerVM{name='null', level='error.validation'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str24 = socialUserConnection0.getUserId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(instant17);
        org.junit.Assert.assertNotNull(userDTO18);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.getPrimeiroNome();
        java.lang.Boolean boolean2 = professor0.isDiponibilidade();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str13 = aluno12.getEmail();
        aluno12.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray16 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno7, aluno11, aluno12 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet17 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet17, alunoArray16);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet17);
        java.lang.String str20 = professor5.toString();
        com.unifacisa.tcc.domain.Professor professor22 = professor5.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa24 = professor22.primeiroNome("");
        professor22.setEmail("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.domain.Professor professor27 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str30 = aluno29.getEmail();
        aluno29.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno34 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str35 = aluno34.getEmail();
        aluno34.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray38 = new com.unifacisa.tcc.domain.Aluno[] { aluno28, aluno29, aluno33, aluno34 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet39 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet39, alunoArray38);
        professor27.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet39);
        professor22.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet39);
        com.unifacisa.tcc.domain.Professor professor43 = professor0.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet39);
        java.lang.String str44 = professor0.toString();
        professor0.setSegundoNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        java.lang.String str47 = professor0.toString();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa49 = professor0.email("ManagedUserVM{} UserDTO{login='LoginVM{username='null', rememberMe=false}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(alunoArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str20, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor22);
        org.junit.Assert.assertNotNull(pessoa24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(alunoArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(professor43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str44, "Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str47, "Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(pessoa49);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str1 = loggerVM0.getName();
        loggerVM0.setLevel("error.validation");
        java.lang.String str4 = loggerVM0.getName();
        java.lang.String str5 = loggerVM0.getLevel();
        loggerVM0.setLevel("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        loggerVM0.setName("LoginVM{username='error.concurrencyFailure', rememberMe=null}");
        loggerVM0.setName("UserDTO{login='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        loggerVM0.setLevel("ManagedUserVM{} UserDTO{login='SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error.validation" + "'", str5, "error.validation");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 1L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper3 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray4 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList5 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList5, userArray4);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList7 = userMapper3.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList5);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList8 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList5);
        com.unifacisa.tcc.domain.User user10 = userMapper0.userFromId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(userArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userDTOList7);
        org.junit.Assert.assertNotNull(userDTOList8);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        loginVM0.setUsername("error.concurrencyFailure");
        java.lang.Boolean boolean3 = loginVM0.isRememberMe();
        java.lang.String str4 = loginVM0.toString();
        java.lang.String str5 = loginVM0.getUsername();
        loginVM0.setUsername("LoginVM{username='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', rememberMe=true}");
        loginVM0.setPassword("LoginVM{username='Aluno{id=null, primeiroNome='null', segundoNome='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}', rememberMe=false}");
        java.lang.String str10 = loginVM0.getUsername();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginVM{username='error.concurrencyFailure', rememberMe=null}" + "'", str4, "LoginVM{username='error.concurrencyFailure', rememberMe=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error.concurrencyFailure" + "'", str5, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LoginVM{username='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', rememberMe=true}" + "'", str10, "LoginVM{username='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', rememberMe=true}");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.getPrimeiroNome();
        java.lang.Boolean boolean2 = professor0.isDiponibilidade();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str13 = aluno12.getEmail();
        aluno12.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray16 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno7, aluno11, aluno12 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet17 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet17, alunoArray16);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet17);
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str21 = aluno20.getEmail();
        java.lang.Boolean boolean22 = aluno20.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor23 = professor5.addAluno(aluno20);
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str25 = aluno24.getEmail();
        aluno24.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection28 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean29 = aluno24.equals((java.lang.Object) socialUserConnection28);
        socialUserConnection28.setRefreshToken("error.validation");
        socialUserConnection28.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean34 = aluno20.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.domain.Professor professor35 = professor0.removeAluno(aluno20);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa37 = aluno20.numeroContato((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa39 = aluno20.segundoNome("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        pessoa39.setNumeroContato((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(alunoArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(professor23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(professor35);
        org.junit.Assert.assertNotNull(pessoa37);
        org.junit.Assert.assertNotNull(pessoa39);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        java.lang.String str3 = socialUserConnection0.getRefreshToken();
        java.lang.String str4 = socialUserConnection0.getUserId();
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        java.lang.String str7 = socialUserConnection0.toString();
        socialUserConnection0.setProviderId("SocialUserConnection{id=null, userId=null, providerId='', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.lang.Long long10 = socialUserConnection0.getId();
        socialUserConnection0.setUserId("Professor{id=null, primeiroNome='null', segundoNome='', matricula='null', email='null', numeroContato='null', diponibilidade='false'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}" + "'", str7, "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}");
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.lang.String str1 = persistentAuditEvent0.getPrincipal();
        java.lang.Long long2 = persistentAuditEvent0.getId();
        persistentAuditEvent0.setPrincipal("LoginVM{username='null', rememberMe=null}");
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str13 = aluno12.getEmail();
        aluno12.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray16 = new com.unifacisa.tcc.domain.Aluno[] { aluno6, aluno7, aluno11, aluno12 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet17 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet17, alunoArray16);
        professor5.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet17);
        java.lang.String str20 = professor5.toString();
        com.unifacisa.tcc.domain.Professor professor22 = professor5.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet23 = professor5.getAlunos();
        com.unifacisa.tcc.domain.User user24 = new com.unifacisa.tcc.domain.User();
        java.lang.String str25 = user24.getCreatedBy();
        user24.setFirstName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        java.time.Instant instant28 = user24.getLastModifiedDate();
        boolean boolean29 = professor5.equals((java.lang.Object) instant28);
        persistentAuditEvent0.setAuditEventDate(instant28);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(alunoArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str20, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor22);
        org.junit.Assert.assertNotNull(alunoSet23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.time.Instant instant9 = null;
        java.time.Instant instant11 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM32 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant22, "error.validation", instant24, (java.util.Set<java.lang.String>) strSet30);
        com.unifacisa.tcc.service.dto.UserDTO userDTO33 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant9, "", instant11, (java.util.Set<java.lang.String>) strSet30);
        java.lang.String str34 = userDTO33.getLogin();
        java.lang.String str35 = userDTO33.getImageUrl();
        java.lang.String str36 = userDTO33.getLastName();
        java.lang.String str37 = userDTO33.getLastModifiedBy();
        java.lang.String str38 = userDTO33.getLastName();
        java.lang.String str39 = userDTO33.getImageUrl();
        java.util.Set<java.lang.String> strSet40 = userDTO33.getAuthorities();
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error.concurrencyFailure" + "'", str36, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "error.concurrencyFailure" + "'", str38, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        java.lang.String str3 = socialUserConnection0.getRefreshToken();
        socialUserConnection0.setProfileURL("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setId((java.lang.Long) 1L);
        socialUserConnection0.setId((java.lang.Long) 0L);
        java.lang.String str10 = socialUserConnection0.getSecret();
        java.lang.String str11 = socialUserConnection0.getRefreshToken();
        socialUserConnection0.setUserId("LoggerVM{name='error.concurrencyFailure', level='error.validation'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("hi!", "error.concurrencyFailure", "hi!");
        java.lang.String str4 = fieldErrorVM3.getField();
        java.lang.String str5 = fieldErrorVM3.getField();
        java.lang.String str6 = fieldErrorVM3.getField();
        java.lang.String str7 = fieldErrorVM3.getObjectName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error.concurrencyFailure" + "'", str4, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error.concurrencyFailure" + "'", str5, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error.concurrencyFailure" + "'", str6, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str16 = aluno15.getEmail();
        java.lang.Boolean boolean17 = aluno15.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor18 = professor0.addAluno(aluno15);
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str20 = aluno19.getEmail();
        aluno19.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection23 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean24 = aluno19.equals((java.lang.Object) socialUserConnection23);
        socialUserConnection23.setRefreshToken("error.validation");
        socialUserConnection23.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean29 = aluno15.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str30 = aluno15.toString();
        java.lang.Boolean boolean31 = aluno15.isHabilitadoTcc();
        aluno15.setHabilitadoTcc((java.lang.Boolean) true);
        aluno15.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor36 = aluno15.getProfessor();
        com.unifacisa.tcc.domain.Professor professor37 = aluno15.getProfessor();
        aluno15.setMatricula((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(professor18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str30, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNotNull(professor36);
        org.junit.Assert.assertNotNull(professor37);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.time.Instant instant10 = null;
        java.time.Instant instant12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM20 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant10, "error.validation", instant12, (java.util.Set<java.lang.String>) strSet18);
        java.lang.String str21 = managedUserVM20.getFirstName();
        java.lang.String str22 = managedUserVM20.toString();
        java.lang.String str23 = managedUserVM20.getEmail();
        boolean boolean24 = managedUserVM20.isActivated();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}" + "'", str22, "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "error.validation" + "'", str23, "error.validation");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setProviderId("");
        java.lang.String str4 = socialUserConnection0.getProfileURL();
        java.lang.String str5 = socialUserConnection0.getRefreshToken();
        java.lang.String str6 = socialUserConnection0.getSecret();
        socialUserConnection0.setRefreshToken("error.concurrencyFailure");
        java.lang.String str9 = socialUserConnection0.getProviderUserId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        java.lang.String str15 = professor0.toString();
        com.unifacisa.tcc.domain.Professor professor16 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str19 = aluno18.getEmail();
        aluno18.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str24 = aluno23.getEmail();
        aluno23.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray27 = new com.unifacisa.tcc.domain.Aluno[] { aluno17, aluno18, aluno22, aluno23 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet28 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet28, alunoArray27);
        professor16.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet28);
        com.unifacisa.tcc.domain.Professor professor31 = professor0.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet28);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str33 = aluno32.getEmail();
        java.lang.Boolean boolean34 = aluno32.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor35 = aluno32.getProfessor();
        com.unifacisa.tcc.domain.Professor professor36 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno37 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str39 = aluno38.getEmail();
        aluno38.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno43 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str44 = aluno43.getEmail();
        aluno43.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray47 = new com.unifacisa.tcc.domain.Aluno[] { aluno37, aluno38, aluno42, aluno43 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet48 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet48, alunoArray47);
        professor36.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet48);
        java.lang.String str51 = professor36.toString();
        com.unifacisa.tcc.domain.Professor professor52 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno54 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str55 = aluno54.getEmail();
        aluno54.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno58 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno59 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str60 = aluno59.getEmail();
        aluno59.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray63 = new com.unifacisa.tcc.domain.Aluno[] { aluno53, aluno54, aluno58, aluno59 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet64 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet64, alunoArray63);
        professor52.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet64);
        com.unifacisa.tcc.domain.Professor professor67 = professor36.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet64);
        com.unifacisa.tcc.domain.Aluno aluno68 = aluno32.professor(professor67);
        com.unifacisa.tcc.domain.Aluno aluno70 = aluno32.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa72 = aluno32.numeroContato((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.Professor professor73 = professor31.removeAluno(aluno32);
        com.unifacisa.tcc.domain.Professor professor75 = professor31.diponibilidade((java.lang.Boolean) true);
        java.lang.Long long76 = professor75.getNumeroContato();
        java.lang.Long long77 = professor75.getNumeroContato();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(alunoArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(professor31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNull(professor35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(alunoArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str51, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(alunoArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(professor67);
        org.junit.Assert.assertNotNull(aluno68);
        org.junit.Assert.assertNotNull(aluno70);
        org.junit.Assert.assertNotNull(pessoa72);
        org.junit.Assert.assertNotNull(professor73);
        org.junit.Assert.assertNotNull(professor75);
        org.junit.Assert.assertNull(long76);
        org.junit.Assert.assertNull(long77);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList1 = logsResource0.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList2 = logsResource0.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList3 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM4 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str5 = loggerVM4.getName();
        loggerVM4.setLevel("error.validation");
        java.lang.String str8 = loggerVM4.getLevel();
        java.lang.String str9 = loggerVM4.toString();
        java.lang.String str10 = loggerVM4.toString();
        loggerVM4.setName("error.concurrencyFailure");
        java.lang.String str13 = loggerVM4.getName();
        logsResource0.changeLevel(loggerVM4);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList15 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.LogsResource logsResource16 = new com.unifacisa.tcc.web.rest.LogsResource();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList17 = logsResource16.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList18 = logsResource16.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList19 = logsResource16.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM20 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str21 = loggerVM20.getName();
        loggerVM20.setLevel("error.validation");
        java.lang.String str24 = loggerVM20.getLevel();
        java.lang.String str25 = loggerVM20.toString();
        java.lang.String str26 = loggerVM20.toString();
        loggerVM20.setName("error.concurrencyFailure");
        java.lang.String str29 = loggerVM20.getName();
        logsResource16.changeLevel(loggerVM20);
        logsResource0.changeLevel(loggerVM20);
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM32 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str33 = loggerVM32.getName();
        loggerVM32.setLevel("error.validation");
        java.lang.String str36 = loggerVM32.getLevel();
        java.lang.String str37 = loggerVM32.toString();
        java.lang.String str38 = loggerVM32.getLevel();
        java.lang.String str39 = loggerVM32.getLevel();
        // The following exception was thrown during execution in test generation
        try {
            logsResource0.changeLevel(loggerVM32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name argument cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(loggerVMList1);
        org.junit.Assert.assertNotNull(loggerVMList2);
        org.junit.Assert.assertNotNull(loggerVMList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error.validation" + "'", str8, "error.validation");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str9, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str10, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error.concurrencyFailure" + "'", str13, "error.concurrencyFailure");
        org.junit.Assert.assertNotNull(loggerVMList15);
        org.junit.Assert.assertNotNull(loggerVMList17);
        org.junit.Assert.assertNotNull(loggerVMList18);
        org.junit.Assert.assertNotNull(loggerVMList19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "error.validation" + "'", str24, "error.validation");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str25, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str26, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "error.concurrencyFailure" + "'", str29, "error.concurrencyFailure");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error.validation" + "'", str36, "error.validation");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str37, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "error.validation" + "'", str38, "error.validation");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "error.validation" + "'", str39, "error.validation");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str1 = aluno0.getEmail();
        java.lang.Boolean boolean2 = aluno0.isHabilitadoTcc();
        aluno0.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.segundoNome("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno0.matricula((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.Professor professor9 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str10 = professor9.getPrimeiroNome();
        professor9.setDiponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor13 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str16 = aluno15.getEmail();
        aluno15.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str21 = aluno20.getEmail();
        aluno20.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray24 = new com.unifacisa.tcc.domain.Aluno[] { aluno14, aluno15, aluno19, aluno20 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet25 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet25, alunoArray24);
        professor13.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet25);
        professor9.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet25);
        java.lang.String str29 = professor9.getEmail();
        com.unifacisa.tcc.domain.Aluno aluno30 = aluno0.professor(professor9);
        com.unifacisa.tcc.domain.Aluno aluno32 = aluno30.habilitadoTcc((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(pessoa8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(alunoArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(aluno30);
        org.junit.Assert.assertNotNull(aluno32);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.time.Instant instant2 = user0.getResetDate();
        java.lang.Long long3 = user0.getId();
        user0.setPassword("ManagedUserVM{} UserDTO{login='SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.time.Instant instant9 = null;
        java.time.Instant instant11 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM32 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant22, "error.validation", instant24, (java.util.Set<java.lang.String>) strSet30);
        com.unifacisa.tcc.service.dto.UserDTO userDTO33 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant9, "", instant11, (java.util.Set<java.lang.String>) strSet30);
        java.lang.String str34 = userDTO33.getLastModifiedBy();
        java.time.Instant instant35 = userDTO33.getLastModifiedDate();
        java.util.Set<java.lang.String> strSet36 = userDTO33.getAuthorities();
        userDTO33.setId((java.lang.Long) 1L);
        java.lang.String str39 = userDTO33.getLastName();
        java.lang.String str40 = userDTO33.getLogin();
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(instant35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "error.concurrencyFailure" + "'", str39, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getUsername();
        java.lang.Boolean boolean2 = loginVM0.isRememberMe();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        loginVM0.setPassword("hi!");
        java.lang.Boolean boolean7 = loginVM0.isRememberMe();
        java.lang.Boolean boolean8 = loginVM0.isRememberMe();
        loginVM0.setRememberMe((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setProviderId("");
        socialUserConnection0.setRefreshToken("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str6 = socialUserConnection0.getUserId();
        socialUserConnection0.setProfileURL("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', refreshToken='error.validation', expireTime=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.lang.Long long1 = persistentAuditEvent0.getId();
        persistentAuditEvent0.setAuditEventType("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.Long long4 = persistentAuditEvent0.getId();
        com.unifacisa.tcc.domain.User user5 = new com.unifacisa.tcc.domain.User();
        java.lang.String str6 = user5.getCreatedBy();
        user5.setFirstName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        java.time.Instant instant9 = user5.getLastModifiedDate();
        persistentAuditEvent0.setAuditEventDate(instant9);
        java.lang.String str11 = persistentAuditEvent0.getAuditEventType();
        java.lang.Long long12 = persistentAuditEvent0.getId();
        persistentAuditEvent0.setPrincipal("LoggerVM{name='null', level='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}'}");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str11, "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        java.lang.String str3 = socialUserConnection0.getAccessToken();
        java.lang.String str4 = socialUserConnection0.getImageURL();
        java.lang.Long long5 = socialUserConnection0.getRank();
        socialUserConnection0.setDisplayName("LoggerVM{name='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', level='error.validation'}");
        java.lang.String str8 = socialUserConnection0.getAccessToken();
        java.lang.String str9 = socialUserConnection0.getDisplayName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LoggerVM{name='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', level='error.validation'}" + "'", str9, "LoggerVM{name='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}', level='error.validation'}");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.time.Instant instant2 = user0.getResetDate();
        java.lang.String str3 = user0.getResetKey();
        com.unifacisa.tcc.domain.User user14 = new com.unifacisa.tcc.domain.User();
        user14.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str17 = user14.getLastName();
        java.time.Instant instant18 = user14.getLastModifiedDate();
        com.unifacisa.tcc.domain.User user20 = new com.unifacisa.tcc.domain.User();
        user20.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str23 = user20.getLastName();
        java.time.Instant instant24 = user20.getLastModifiedDate();
        java.time.Instant instant34 = null;
        java.time.Instant instant36 = null;
        java.time.Instant instant47 = null;
        java.time.Instant instant49 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM57 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant47, "error.validation", instant49, (java.util.Set<java.lang.String>) strSet55);
        com.unifacisa.tcc.service.dto.UserDTO userDTO58 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant34, "", instant36, (java.util.Set<java.lang.String>) strSet55);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM59 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) (-1L), "LoggerVM{name='null', level='error.validation'}", "Authority{name='null'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "LoggerVM{name='null', level='error.validation'}", instant18, "", instant24, (java.util.Set<java.lang.String>) strSet55);
        user0.setResetDate(instant18);
        user0.setEmail("Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str63 = user0.getResetKey();
        java.lang.String str64 = user0.getLastName();
        java.lang.String str65 = user0.getLastName();
        user0.setActivated(true);
        user0.setResetKey("Professor{id=-1, primeiroNome='LoginVM{username='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', rememberMe=false}', segundoNome='null', matricula='null', email='LoggerVM{name='null', level='error.validation'}', numeroContato='null', diponibilidade='true'}");
        java.lang.String str70 = user0.getLastModifiedBy();
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str17, "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str23, "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.lang.Long long2 = persistentAuditEvent0.getId();
        java.lang.String str3 = persistentAuditEvent0.getAuditEventType();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        persistentAuditEvent0.setData(strMap4);
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent6 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant7 = persistentAuditEvent6.getAuditEventDate();
        java.lang.Long long8 = persistentAuditEvent6.getId();
        java.lang.String str9 = persistentAuditEvent6.getAuditEventType();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        persistentAuditEvent6.setData(strMap10);
        com.unifacisa.tcc.domain.Professor professor22 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str25 = aluno24.getEmail();
        aluno24.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str30 = aluno29.getEmail();
        aluno29.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray33 = new com.unifacisa.tcc.domain.Aluno[] { aluno23, aluno24, aluno28, aluno29 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet34 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet34, alunoArray33);
        professor22.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet34);
        java.lang.String str37 = professor22.toString();
        com.unifacisa.tcc.domain.Professor professor39 = professor22.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet40 = professor22.getAlunos();
        com.unifacisa.tcc.domain.User user41 = new com.unifacisa.tcc.domain.User();
        java.lang.String str42 = user41.getCreatedBy();
        user41.setFirstName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}");
        java.time.Instant instant45 = user41.getLastModifiedDate();
        boolean boolean46 = professor22.equals((java.lang.Object) instant45);
        com.unifacisa.tcc.domain.User user48 = new com.unifacisa.tcc.domain.User();
        java.lang.String str49 = user48.getCreatedBy();
        java.lang.String str50 = user48.getLangKey();
        java.time.Instant instant51 = user48.getCreatedDate();
        java.time.Instant instant62 = null;
        java.time.Instant instant64 = null;
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM72 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant62, "error.validation", instant64, (java.util.Set<java.lang.String>) strSet70);
        java.lang.String str73 = managedUserVM72.getFirstName();
        java.lang.String str74 = managedUserVM72.getCreatedBy();
        java.util.Set<java.lang.String> strSet75 = managedUserVM72.getAuthorities();
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM76 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) (-1L), "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}", "Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoggerVM{name='null', level='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoggerVM{name='null', level='error.validation'}", true, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}", instant45, "LoginVM{username='null', rememberMe=null}", instant51, strSet75);
        persistentAuditEvent6.setAuditEventDate(instant51);
        persistentAuditEvent0.setAuditEventDate(instant51);
        java.time.Instant instant79 = persistentAuditEvent0.getAuditEventDate();
        java.lang.Long long80 = persistentAuditEvent0.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap81 = persistentAuditEvent0.getData();
        java.lang.String str82 = persistentAuditEvent0.getAuditEventType();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(alunoArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str37, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNotNull(alunoSet40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(instant79);
        org.junit.Assert.assertNull(long80);
        org.junit.Assert.assertNull(strMap81);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}", "hi!", "LoginVM{username='', rememberMe=null}", (java.lang.Long) 10L, "LoginVM{username='error.concurrencyFailure', rememberMe=null}", "", "Professor{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='false'}", "Authority{name='Aluno{id=null, primeiroNome='null', segundoNome='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}'}", "LoggerVM{name='null', level='ManagedUserVM{} UserDTO{login='LoggerVM{name='null', level='error.validation'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}'}", "LoginVM{username='Aluno{id=null, primeiroNome='null', segundoNome='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}', rememberMe=false}", (java.lang.Long) 0L);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        java.lang.String str15 = professor0.toString();
        com.unifacisa.tcc.domain.Professor professor17 = professor0.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa19 = professor17.primeiroNome("");
        com.unifacisa.tcc.domain.Professor professor21 = professor17.diponibilidade((java.lang.Boolean) true);
        java.lang.Long long22 = professor21.getNumeroContato();
        professor21.setMatricula((java.lang.Long) 0L);
        professor21.setNumeroContato((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str15, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor17);
        org.junit.Assert.assertNotNull(pessoa19);
        org.junit.Assert.assertNotNull(professor21);
        org.junit.Assert.assertNull(long22);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str1 = aluno0.getEmail();
        aluno0.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection4 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean5 = aluno0.equals((java.lang.Object) socialUserConnection4);
        socialUserConnection4.setRefreshToken("error.validation");
        socialUserConnection4.setSecret("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        socialUserConnection4.setExpireTime((java.lang.Long) 100L);
        socialUserConnection4.setExpireTime((java.lang.Long) 0L);
        socialUserConnection4.setSecret("LoggerVM{name='null', level='error.validation'}");
        socialUserConnection4.setId((java.lang.Long) 0L);
        java.lang.String str18 = socialUserConnection4.getProfileURL();
        socialUserConnection4.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        java.lang.String str1 = user0.getCreatedBy();
        java.lang.String str2 = user0.getLangKey();
        java.time.Instant instant3 = user0.getCreatedDate();
        user0.setLangKey("Authority{name='null'}");
        java.lang.Long long6 = user0.getId();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getLangKey();
        java.time.Instant instant9 = user0.getResetDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='Authority{name='null'}', activationKey='null'}" + "'", str7, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='Authority{name='null'}', activationKey='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authority{name='null'}" + "'", str8, "Authority{name='null'}");
        org.junit.Assert.assertNull(instant9);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str16 = aluno15.getEmail();
        java.lang.Boolean boolean17 = aluno15.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor18 = professor0.addAluno(aluno15);
        com.unifacisa.tcc.domain.Professor professor19 = aluno15.getProfessor();
        com.unifacisa.tcc.domain.Professor professor20 = aluno15.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno22 = aluno15.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor23 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str26 = aluno25.getEmail();
        aluno25.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno29 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str31 = aluno30.getEmail();
        aluno30.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray34 = new com.unifacisa.tcc.domain.Aluno[] { aluno24, aluno25, aluno29, aluno30 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet35 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet35, alunoArray34);
        professor23.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        java.lang.String str38 = professor23.toString();
        com.unifacisa.tcc.domain.Professor professor40 = professor23.diponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa42 = professor40.primeiroNome("");
        com.unifacisa.tcc.domain.Professor professor43 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno44 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str46 = aluno45.getEmail();
        aluno45.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno49 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno50 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str51 = aluno50.getEmail();
        aluno50.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray54 = new com.unifacisa.tcc.domain.Aluno[] { aluno44, aluno45, aluno49, aluno50 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet55 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet55, alunoArray54);
        professor43.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet55);
        com.unifacisa.tcc.domain.Aluno aluno58 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str59 = aluno58.getEmail();
        java.lang.Boolean boolean60 = aluno58.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor61 = professor43.addAluno(aluno58);
        com.unifacisa.tcc.domain.Professor professor62 = aluno58.getProfessor();
        com.unifacisa.tcc.domain.Professor professor63 = aluno58.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno64 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str65 = aluno64.getEmail();
        aluno64.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor68 = professor63.removeAluno(aluno64);
        aluno64.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor71 = professor40.removeAluno(aluno64);
        professor40.setMatricula((java.lang.Long) (-1L));
        aluno22.setProfessor(professor40);
        java.lang.String str75 = aluno22.getSegundoNome();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(professor18);
        org.junit.Assert.assertNotNull(professor19);
        org.junit.Assert.assertNotNull(professor20);
        org.junit.Assert.assertNotNull(aluno22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(alunoArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str38, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor40);
        org.junit.Assert.assertNotNull(pessoa42);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(alunoArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(boolean60);
        org.junit.Assert.assertNotNull(professor61);
        org.junit.Assert.assertNotNull(professor62);
        org.junit.Assert.assertNotNull(professor63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(professor68);
        org.junit.Assert.assertNotNull(professor71);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        user0.setResetKey("LoginVM{username='null', rememberMe=null}");
        java.lang.String str5 = user0.getImageUrl();
        java.lang.String str6 = user0.getLogin();
        com.unifacisa.tcc.domain.User user7 = new com.unifacisa.tcc.domain.User();
        java.lang.String str8 = user7.getCreatedBy();
        java.lang.String str9 = user7.getLastModifiedBy();
        user7.setCreatedBy("ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.lang.String str12 = user7.toString();
        java.time.Instant instant13 = user7.getCreatedDate();
        user0.setResetDate(instant13);
        user0.setLastName("UserDTO{login='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        java.lang.String str17 = user0.getLastName();
        java.lang.String str18 = user0.getImageUrl();
        java.time.Instant instant29 = null;
        java.time.Instant instant31 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM39 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant29, "error.validation", instant31, (java.util.Set<java.lang.String>) strSet37);
        java.lang.String str40 = managedUserVM39.getFirstName();
        java.lang.String str41 = managedUserVM39.getPassword();
        java.lang.String str42 = managedUserVM39.getLastModifiedBy();
        managedUserVM39.setId((java.lang.Long) (-1L));
        java.time.Instant instant45 = managedUserVM39.getLastModifiedDate();
        boolean boolean46 = user0.equals((java.lang.Object) managedUserVM39);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str12, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UserDTO{login='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}" + "'", str17, "UserDTO{login='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "error.concurrencyFailure" + "'", str41, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "error.validation" + "'", str42, "error.validation");
        org.junit.Assert.assertNull(instant45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        java.lang.String str3 = socialUserConnection0.getRefreshToken();
        java.lang.String str4 = socialUserConnection0.getUserId();
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        java.lang.String str7 = socialUserConnection0.getProviderUserId();
        socialUserConnection0.setProviderUserId("");
        socialUserConnection0.setRank((java.lang.Long) 1L);
        java.lang.String str12 = socialUserConnection0.getProviderId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setProviderId("");
        java.time.Instant instant13 = null;
        java.time.Instant instant15 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM36 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant26, "error.validation", instant28, (java.util.Set<java.lang.String>) strSet34);
        com.unifacisa.tcc.service.dto.UserDTO userDTO37 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant13, "", instant15, (java.util.Set<java.lang.String>) strSet34);
        java.time.Instant instant38 = userDTO37.getLastModifiedDate();
        userDTO37.setLogin("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        boolean boolean41 = socialUserConnection0.equals((java.lang.Object) userDTO37);
        java.lang.String str42 = userDTO37.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(instant38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", "LoggerVM{name='null', level='null'}", "LoginVM{username='null', rememberMe=null}", (java.lang.Long) 100L, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "Authority{name='null'}", "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}", "LoggerVM{name='null', level='null'}", "LoggerVM{name='null', level='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", (java.lang.Long) 1L);
        java.lang.String str12 = socialUserConnection11.getProviderId();
        java.lang.String str13 = socialUserConnection11.getAccessToken();
        socialUserConnection11.setUserId("Aluno{id=-1, primeiroNome='null', segundoNome='LoginVM{username='null', rememberMe=false}', matricula='0', email='null', numeroContato='null', habilitadoTcc='false'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LoggerVM{name='null', level='null'}" + "'", str12, "LoggerVM{name='null', level='null'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LoggerVM{name='null', level='null'}" + "'", str13, "LoggerVM{name='null', level='null'}");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setImageURL("error.concurrencyFailure");
        socialUserConnection0.setProviderId("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='error.concurrencyFailure', accessToken='null', secret='null', refreshToken='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', expireTime=null}");
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList1 = logsResource0.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList2 = logsResource0.getList();
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList3 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM4 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str5 = loggerVM4.getName();
        loggerVM4.setLevel("error.validation");
        java.lang.String str8 = loggerVM4.getLevel();
        java.lang.String str9 = loggerVM4.toString();
        java.lang.String str10 = loggerVM4.toString();
        loggerVM4.setName("error.concurrencyFailure");
        java.lang.String str13 = loggerVM4.getName();
        logsResource0.changeLevel(loggerVM4);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList15 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM16 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str17 = loggerVM16.getName();
        loggerVM16.setLevel("error.validation");
        java.lang.String str20 = loggerVM16.getLevel();
        java.lang.String str21 = loggerVM16.toString();
        java.lang.String str22 = loggerVM16.toString();
        loggerVM16.setName("error.concurrencyFailure");
        java.lang.String str25 = loggerVM16.getLevel();
        java.lang.String str26 = loggerVM16.getName();
        loggerVM16.setName("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}");
        java.lang.String str29 = loggerVM16.getName();
        logsResource0.changeLevel(loggerVM16);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList31 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM32 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        java.lang.String str33 = loggerVM32.getName();
        loggerVM32.setLevel("error.validation");
        java.lang.String str36 = loggerVM32.getLevel();
        loggerVM32.setLevel("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str39 = loggerVM32.getLevel();
        java.lang.String str40 = loggerVM32.getLevel();
        loggerVM32.setLevel("LoggerVM{name='null', level='error.validation'}");
        java.lang.String str43 = loggerVM32.getLevel();
        loggerVM32.setName("LoginVM{username='Aluno{id=null, primeiroNome='null', segundoNome='SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}', rememberMe=false}");
        logsResource0.changeLevel(loggerVM32);
        org.junit.Assert.assertNotNull(loggerVMList1);
        org.junit.Assert.assertNotNull(loggerVMList2);
        org.junit.Assert.assertNotNull(loggerVMList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error.validation" + "'", str8, "error.validation");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str9, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str10, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error.concurrencyFailure" + "'", str13, "error.concurrencyFailure");
        org.junit.Assert.assertNotNull(loggerVMList15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error.validation" + "'", str20, "error.validation");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str21, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str22, "LoggerVM{name='null', level='error.validation'}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "error.validation" + "'", str25, "error.validation");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "error.concurrencyFailure" + "'", str26, "error.concurrencyFailure");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}" + "'", str29, "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}");
        org.junit.Assert.assertNotNull(loggerVMList31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error.validation" + "'", str36, "error.validation");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str39, "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str40, "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "LoggerVM{name='null', level='error.validation'}" + "'", str43, "LoggerVM{name='null', level='error.validation'}");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        java.time.Instant instant14 = null;
        java.time.Instant instant16 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant28 = null;
        java.time.Instant instant39 = null;
        java.time.Instant instant41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "error.validation", "error.validation", "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM49 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "hi!", "error.concurrencyFailure", "hi!", "error.concurrencyFailure", "error.validation", false, "", "", "", instant39, "error.validation", instant41, (java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.service.dto.UserDTO userDTO50 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 1L, "", "", "error.concurrencyFailure", "error.concurrencyFailure", true, "hi!", "error.validation", "error.concurrencyFailure", instant26, "", instant28, (java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.service.dto.UserDTO userDTO51 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 10L, "", "ManagedUserVM{} UserDTO{login='hi!', firstName='hi!', lastName='error.concurrencyFailure', email='error.validation', imageUrl='', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='error.validation', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", "error.concurrencyFailure", "hi!", false, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "LoginVM{username='null', rememberMe=null}", "LoginVM{username='null', rememberMe=null}", instant14, "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", instant16, (java.util.Set<java.lang.String>) strSet47);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet52 = userMapper0.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet47);
        com.unifacisa.tcc.domain.User user54 = userMapper0.userFromId((java.lang.Long) 100L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper55 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray56 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList57 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList57, userArray56);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList59 = userMapper55.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList57);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper60 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray61 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList62 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList62, userArray61);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList64 = userMapper60.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList62);
        java.util.List<com.unifacisa.tcc.domain.User> userList65 = userMapper55.userDTOsToUsers(userDTOList64);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList66 = userMapper0.usersToUserDTOs(userList65);
        com.unifacisa.tcc.domain.User user67 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO68 = new com.unifacisa.tcc.service.dto.UserDTO(user67);
        java.lang.String str69 = user67.getImageUrl();
        java.lang.String str70 = user67.getLangKey();
        java.lang.String str71 = user67.getLogin();
        com.unifacisa.tcc.domain.User user72 = new com.unifacisa.tcc.domain.User();
        user72.setLastName("Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant75 = user72.getLastModifiedDate();
        user67.setLastModifiedDate(instant75);
        java.lang.String str77 = user67.getPassword();
        java.time.Instant instant78 = user67.getResetDate();
        java.time.Instant instant79 = user67.getCreatedDate();
        java.lang.String str80 = user67.getImageUrl();
        com.unifacisa.tcc.service.dto.UserDTO userDTO81 = userMapper0.userToUserDTO(user67);
        com.unifacisa.tcc.service.dto.UserDTO userDTO82 = new com.unifacisa.tcc.service.dto.UserDTO(user67);
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(authoritySet52);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(userArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(userDTOList59);
        org.junit.Assert.assertNotNull(userArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(userDTOList64);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(userDTOList66);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(instant75);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(instant78);
        org.junit.Assert.assertNotNull(instant79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(userDTO81);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        java.lang.String str3 = socialUserConnection0.getRefreshToken();
        socialUserConnection0.setProfileURL("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str6 = socialUserConnection0.getProfileURL();
        java.lang.String str7 = socialUserConnection0.getSecret();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str6, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.dto.UserDTO userDTO1 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str2 = user0.getImageUrl();
        boolean boolean4 = user0.equals((java.lang.Object) (byte) -1);
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getFirstName();
        java.time.Instant instant7 = user0.getResetDate();
        java.time.Instant instant8 = user0.getResetDate();
        java.lang.String str9 = user0.getImageUrl();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNull(instant8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno1 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str3 = aluno2.getEmail();
        aluno2.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str8 = aluno7.getEmail();
        aluno7.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray11 = new com.unifacisa.tcc.domain.Aluno[] { aluno1, aluno2, aluno6, aluno7 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet12 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet12, alunoArray11);
        professor0.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet12);
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str16 = aluno15.getEmail();
        java.lang.Boolean boolean17 = aluno15.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor18 = professor0.addAluno(aluno15);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa20 = professor18.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.Professor professor21 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str24 = aluno23.getEmail();
        aluno23.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str29 = aluno28.getEmail();
        aluno28.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray32 = new com.unifacisa.tcc.domain.Aluno[] { aluno22, aluno23, aluno27, aluno28 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet33 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet33, alunoArray32);
        professor21.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet33);
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str37 = aluno36.getEmail();
        java.lang.Boolean boolean38 = aluno36.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor39 = professor21.addAluno(aluno36);
        com.unifacisa.tcc.domain.Professor professor40 = aluno36.getProfessor();
        com.unifacisa.tcc.domain.Professor professor41 = aluno36.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str43 = aluno42.getEmail();
        aluno42.setHabilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor46 = professor41.removeAluno(aluno42);
        com.unifacisa.tcc.domain.Professor professor47 = professor18.removeAluno(aluno42);
        com.unifacisa.tcc.domain.Professor professor48 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str49 = professor48.getPrimeiroNome();
        professor48.setDiponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor52 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno54 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str55 = aluno54.getEmail();
        aluno54.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno58 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno59 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str60 = aluno59.getEmail();
        aluno59.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray63 = new com.unifacisa.tcc.domain.Aluno[] { aluno53, aluno54, aluno58, aluno59 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet64 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet64, alunoArray63);
        professor52.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet64);
        professor48.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet64);
        java.lang.String str68 = professor48.getEmail();
        java.lang.String str69 = professor48.toString();
        aluno42.setProfessor(professor48);
        aluno42.setHabilitadoTcc((java.lang.Boolean) false);
        java.lang.Long long73 = aluno42.getNumeroContato();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(alunoArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(professor18);
        org.junit.Assert.assertNotNull(pessoa20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(alunoArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNotNull(professor40);
        org.junit.Assert.assertNotNull(professor41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(professor46);
        org.junit.Assert.assertNotNull(professor47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(alunoArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}" + "'", str69, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertNull(long73);
    }
}

