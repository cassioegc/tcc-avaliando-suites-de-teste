import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection3 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str4 = socialUserConnection3.getUserId();
        java.lang.Long long5 = socialUserConnection3.getRank();
        java.lang.String str6 = socialUserConnection3.getRefreshToken();
        socialUserConnection3.setProfileURL("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        boolean boolean9 = socialUserConnection0.equals((java.lang.Object) "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on socialUserConnection0, socialUserConnection3, and socialUserConnection3.", !(socialUserConnection0.equals(socialUserConnection3) && socialUserConnection3.equals(socialUserConnection3)) || socialUserConnection0.equals(socialUserConnection3));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        java.lang.String str3 = socialUserConnection0.getProfileURL();
        java.lang.String str4 = socialUserConnection0.getImageURL();
        java.lang.String str5 = socialUserConnection0.getProviderId();
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection6 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection6.setUserId("error.validation");
        java.lang.String str9 = socialUserConnection6.getProfileURL();
        socialUserConnection6.setId((java.lang.Long) 1L);
        java.lang.Long long12 = socialUserConnection6.getId();
        socialUserConnection6.setDisplayName("Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        boolean boolean15 = socialUserConnection0.equals((java.lang.Object) "Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on socialUserConnection0, socialUserConnection6, and socialUserConnection6.", !(socialUserConnection0.equals(socialUserConnection6) && socialUserConnection6.equals(socialUserConnection6)) || socialUserConnection0.equals(socialUserConnection6));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("", "hi!", "UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}", (java.lang.Long) 0L, "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=0}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "error.validation", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "LoginVM{username='null', rememberMe=null}", "", (java.lang.Long) 0L);
        socialUserConnection11.setAccessToken("LoggerVM{name='null', level='error.validation'}");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection14 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str15 = socialUserConnection14.getUserId();
        socialUserConnection14.setProviderId("");
        socialUserConnection14.setSecret("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = socialUserConnection11.equals((java.lang.Object) socialUserConnection14);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str1 = aluno0.getEmail();
        aluno0.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection4 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean5 = aluno0.equals((java.lang.Object) socialUserConnection4);
        com.unifacisa.tcc.domain.Aluno aluno7 = aluno0.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno9 = aluno0.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor10 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str11 = professor10.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor13 = professor10.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa15 = professor13.primeiroNome("error.concurrencyFailure");
        com.unifacisa.tcc.domain.Aluno aluno16 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str17 = aluno16.getEmail();
        aluno16.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection20 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean21 = aluno16.equals((java.lang.Object) socialUserConnection20);
        com.unifacisa.tcc.domain.Aluno aluno23 = aluno16.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor24 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str27 = aluno26.getEmail();
        aluno26.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno31 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str32 = aluno31.getEmail();
        aluno31.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray35 = new com.unifacisa.tcc.domain.Aluno[] { aluno25, aluno26, aluno30, aluno31 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet36 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet36, alunoArray35);
        professor24.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet36);
        java.lang.String str39 = professor24.toString();
        com.unifacisa.tcc.domain.Professor professor41 = professor24.diponibilidade((java.lang.Boolean) false);
        aluno23.setProfessor(professor24);
        com.unifacisa.tcc.domain.Professor professor43 = aluno23.getProfessor();
        java.lang.String str44 = aluno23.getEmail();
        com.unifacisa.tcc.domain.Professor professor45 = professor13.addAluno(aluno23);
        com.unifacisa.tcc.domain.Professor professor46 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno48 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str49 = aluno48.getEmail();
        aluno48.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str54 = aluno53.getEmail();
        aluno53.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray57 = new com.unifacisa.tcc.domain.Aluno[] { aluno47, aluno48, aluno52, aluno53 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet58 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet58, alunoArray57);
        professor46.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet58);
        com.unifacisa.tcc.domain.Aluno aluno61 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str62 = aluno61.getEmail();
        java.lang.Boolean boolean63 = aluno61.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor64 = professor46.addAluno(aluno61);
        com.unifacisa.tcc.domain.Professor professor65 = aluno61.getProfessor();
        com.unifacisa.tcc.domain.Professor professor66 = aluno61.getProfessor();
        java.lang.String str67 = aluno61.getEmail();
        com.unifacisa.tcc.domain.Professor professor68 = professor13.addAluno(aluno61);
        com.unifacisa.tcc.domain.Professor professor70 = professor68.diponibilidade((java.lang.Boolean) true);
        aluno0.setProfessor(professor68);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on socialUserConnection4 and socialUserConnection20.", socialUserConnection4.equals(socialUserConnection20) == socialUserConnection20.equals(socialUserConnection4));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor3 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa5 = professor3.primeiroNome("error.concurrencyFailure");
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str7 = aluno6.getEmail();
        aluno6.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection10 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean11 = aluno6.equals((java.lang.Object) socialUserConnection10);
        com.unifacisa.tcc.domain.Aluno aluno13 = aluno6.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor14 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno16 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str17 = aluno16.getEmail();
        aluno16.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str22 = aluno21.getEmail();
        aluno21.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray25 = new com.unifacisa.tcc.domain.Aluno[] { aluno15, aluno16, aluno20, aluno21 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet26 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet26, alunoArray25);
        professor14.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet26);
        java.lang.String str29 = professor14.toString();
        com.unifacisa.tcc.domain.Professor professor31 = professor14.diponibilidade((java.lang.Boolean) false);
        aluno13.setProfessor(professor14);
        com.unifacisa.tcc.domain.Professor professor33 = aluno13.getProfessor();
        java.lang.String str34 = aluno13.getEmail();
        com.unifacisa.tcc.domain.Professor professor35 = professor3.addAluno(aluno13);
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
        com.unifacisa.tcc.domain.Aluno aluno51 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str52 = aluno51.getEmail();
        java.lang.Boolean boolean53 = aluno51.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor54 = professor36.addAluno(aluno51);
        com.unifacisa.tcc.domain.Professor professor55 = aluno51.getProfessor();
        com.unifacisa.tcc.domain.Professor professor56 = aluno51.getProfessor();
        java.lang.String str57 = aluno51.getEmail();
        com.unifacisa.tcc.domain.Professor professor58 = professor3.addAluno(aluno51);
        com.unifacisa.tcc.domain.Professor professor59 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno60 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno61 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str62 = aluno61.getEmail();
        aluno61.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno65 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno66 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str67 = aluno66.getEmail();
        aluno66.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray70 = new com.unifacisa.tcc.domain.Aluno[] { aluno60, aluno61, aluno65, aluno66 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet71 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet71, alunoArray70);
        professor59.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet71);
        com.unifacisa.tcc.domain.Aluno aluno74 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str75 = aluno74.getEmail();
        java.lang.Boolean boolean76 = aluno74.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor77 = professor59.addAluno(aluno74);
        com.unifacisa.tcc.domain.Aluno aluno78 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str79 = aluno78.getEmail();
        aluno78.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection82 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean83 = aluno78.equals((java.lang.Object) socialUserConnection82);
        socialUserConnection82.setRefreshToken("error.validation");
        socialUserConnection82.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean88 = aluno74.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str89 = aluno74.toString();
        java.lang.Boolean boolean90 = aluno74.isHabilitadoTcc();
        aluno74.setHabilitadoTcc((java.lang.Boolean) true);
        aluno74.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor95 = professor3.removeAluno(aluno74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on socialUserConnection10 and socialUserConnection82.", socialUserConnection10.equals(socialUserConnection82) == socialUserConnection82.equals(socialUserConnection10));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        professor0.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor17 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str20 = aluno19.getEmail();
        aluno19.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str25 = aluno24.getEmail();
        aluno24.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray28 = new com.unifacisa.tcc.domain.Aluno[] { aluno18, aluno19, aluno23, aluno24 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet29 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet29, alunoArray28);
        professor17.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet29);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str33 = aluno32.getEmail();
        java.lang.Boolean boolean34 = aluno32.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor35 = professor17.addAluno(aluno32);
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str37 = aluno36.getEmail();
        aluno36.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection40 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean41 = aluno36.equals((java.lang.Object) socialUserConnection40);
        socialUserConnection40.setRefreshToken("error.validation");
        socialUserConnection40.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean46 = aluno32.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str47 = aluno32.toString();
        com.unifacisa.tcc.domain.Aluno aluno49 = aluno32.habilitadoTcc((java.lang.Boolean) true);
        java.lang.String str50 = aluno32.toString();
        com.unifacisa.tcc.domain.Professor professor51 = professor0.removeAluno(aluno32);
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
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str68 = aluno67.getEmail();
        java.lang.Boolean boolean69 = aluno67.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor70 = professor52.addAluno(aluno67);
        com.unifacisa.tcc.domain.Aluno aluno71 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str72 = aluno71.getEmail();
        aluno71.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection75 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean76 = aluno71.equals((java.lang.Object) socialUserConnection75);
        socialUserConnection75.setRefreshToken("error.validation");
        socialUserConnection75.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean81 = aluno67.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str82 = aluno67.toString();
        com.unifacisa.tcc.domain.Aluno aluno84 = aluno67.habilitadoTcc((java.lang.Boolean) true);
        java.lang.String str85 = aluno67.toString();
        com.unifacisa.tcc.domain.Professor professor86 = professor0.addAluno(aluno67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on socialUserConnection40 and socialUserConnection75.", socialUserConnection40.equals(socialUserConnection75) == socialUserConnection75.equals(socialUserConnection40));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str1 = aluno0.getEmail();
        aluno0.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection4 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean5 = aluno0.equals((java.lang.Object) socialUserConnection4);
        com.unifacisa.tcc.domain.Aluno aluno7 = aluno0.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor8 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno9 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str11 = aluno10.getEmail();
        aluno10.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str16 = aluno15.getEmail();
        aluno15.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray19 = new com.unifacisa.tcc.domain.Aluno[] { aluno9, aluno10, aluno14, aluno15 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet20 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet20, alunoArray19);
        professor8.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet20);
        java.lang.String str23 = professor8.toString();
        com.unifacisa.tcc.domain.Professor professor25 = professor8.diponibilidade((java.lang.Boolean) false);
        aluno7.setProfessor(professor8);
        com.unifacisa.tcc.domain.Professor professor27 = aluno7.getProfessor();
        java.lang.String str28 = aluno7.getEmail();
        com.unifacisa.tcc.domain.Professor professor29 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str30 = professor29.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor32 = professor29.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa34 = professor32.primeiroNome("error.concurrencyFailure");
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str36 = aluno35.getEmail();
        aluno35.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection39 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean40 = aluno35.equals((java.lang.Object) socialUserConnection39);
        com.unifacisa.tcc.domain.Aluno aluno42 = aluno35.habilitadoTcc((java.lang.Boolean) false);
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
        java.lang.String str58 = professor43.toString();
        com.unifacisa.tcc.domain.Professor professor60 = professor43.diponibilidade((java.lang.Boolean) false);
        aluno42.setProfessor(professor43);
        com.unifacisa.tcc.domain.Professor professor62 = aluno42.getProfessor();
        java.lang.String str63 = aluno42.getEmail();
        com.unifacisa.tcc.domain.Professor professor64 = professor32.addAluno(aluno42);
        com.unifacisa.tcc.domain.Professor professor65 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno66 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str68 = aluno67.getEmail();
        aluno67.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno71 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno72 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str73 = aluno72.getEmail();
        aluno72.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray76 = new com.unifacisa.tcc.domain.Aluno[] { aluno66, aluno67, aluno71, aluno72 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet77 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet77, alunoArray76);
        professor65.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet77);
        com.unifacisa.tcc.domain.Aluno aluno80 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str81 = aluno80.getEmail();
        java.lang.Boolean boolean82 = aluno80.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor83 = professor65.addAluno(aluno80);
        com.unifacisa.tcc.domain.Professor professor84 = aluno80.getProfessor();
        com.unifacisa.tcc.domain.Professor professor85 = aluno80.getProfessor();
        java.lang.String str86 = aluno80.getEmail();
        com.unifacisa.tcc.domain.Professor professor87 = professor32.addAluno(aluno80);
        com.unifacisa.tcc.domain.Professor professor89 = professor87.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno90 = aluno7.professor(professor87);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on socialUserConnection4 and socialUserConnection39.", socialUserConnection4.equals(socialUserConnection39) == socialUserConnection39.equals(socialUserConnection4));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str1 = aluno0.getEmail();
        aluno0.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection4 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean5 = aluno0.equals((java.lang.Object) socialUserConnection4);
        socialUserConnection4.setRefreshToken("error.validation");
        socialUserConnection4.setProviderUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection4.setProfileURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='1', habilitadoTcc='null'}");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection12 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str13 = socialUserConnection12.getProviderId();
        java.lang.String str14 = socialUserConnection12.getAccessToken();
        socialUserConnection12.setProfileURL("LoggerVM{name='null', level='UserDTO{login='', firstName='', lastName='error.concurrencyFailure', email='error.concurrencyFailure', imageUrl='hi!', activated=true, langKey='error.validation', createdBy=error.concurrencyFailure, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[hi!, error.validation, ]}'}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = socialUserConnection4.equals((java.lang.Object) socialUserConnection12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        com.unifacisa.tcc.domain.Aluno aluno22 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str23 = aluno22.getEmail();
        aluno22.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection26 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean27 = aluno22.equals((java.lang.Object) socialUserConnection26);
        com.unifacisa.tcc.domain.Aluno aluno29 = aluno22.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor30 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno31 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str33 = aluno32.getEmail();
        aluno32.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno37 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str38 = aluno37.getEmail();
        aluno37.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno[] alunoArray41 = new com.unifacisa.tcc.domain.Aluno[] { aluno31, aluno32, aluno36, aluno37 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet42 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet42, alunoArray41);
        professor30.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet42);
        java.lang.String str45 = professor30.toString();
        com.unifacisa.tcc.domain.Professor professor47 = professor30.diponibilidade((java.lang.Boolean) false);
        aluno29.setProfessor(professor30);
        com.unifacisa.tcc.domain.Professor professor49 = professor17.removeAluno(aluno29);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection50 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str51 = socialUserConnection50.getUserId();
        java.lang.Long long52 = socialUserConnection50.getRank();
        java.lang.String str53 = socialUserConnection50.getRefreshToken();
        java.lang.String str54 = socialUserConnection50.getUserId();
        java.lang.String str55 = socialUserConnection50.getAccessToken();
        java.lang.Long long56 = socialUserConnection50.getRank();
        socialUserConnection50.setExpireTime((java.lang.Long) 10L);
        boolean boolean59 = professor49.equals((java.lang.Object) socialUserConnection50);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on socialUserConnection50, socialUserConnection26, and professor49.", !(socialUserConnection50.equals(socialUserConnection26) && socialUserConnection26.equals(professor49)) || socialUserConnection50.equals(professor49));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        com.unifacisa.tcc.domain.Professor professor36 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str37 = professor36.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor39 = professor36.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa41 = professor39.primeiroNome("error.concurrencyFailure");
        aluno20.setProfessor(professor39);
        com.unifacisa.tcc.domain.Aluno aluno43 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str44 = aluno43.getEmail();
        aluno43.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection47 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean48 = aluno43.equals((java.lang.Object) socialUserConnection47);
        socialUserConnection47.setRefreshToken("error.validation");
        socialUserConnection47.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str53 = socialUserConnection47.getProviderUserId();
        boolean boolean54 = professor39.equals((java.lang.Object) str53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on socialUserConnection28 and socialUserConnection47.", socialUserConnection28.equals(socialUserConnection47) == socialUserConnection47.equals(socialUserConnection28));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        socialUserConnection0.setDisplayName("");
        java.lang.String str4 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setDisplayName("hi!");
        java.lang.String str7 = socialUserConnection0.getSecret();
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection19 = new com.unifacisa.tcc.domain.SocialUserConnection("SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "SocialUserConnection{id=null, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "Aluno{id=-1, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", (java.lang.Long) 0L, "LoginVM{username='null', rememberMe=null}", "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='null'}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}", "", "LoggerVM{name='null', level='null'}", (java.lang.Long) 0L);
        socialUserConnection19.setId((java.lang.Long) 1L);
        socialUserConnection19.setRefreshToken("Professor{id=null, primeiroNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection19.setId((java.lang.Long) 10L);
        java.lang.String str26 = socialUserConnection19.getImageURL();
        boolean boolean27 = socialUserConnection0.equals((java.lang.Object) str26);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on socialUserConnection0, socialUserConnection19, and socialUserConnection19.", !(socialUserConnection0.equals(socialUserConnection19) && socialUserConnection19.equals(socialUserConnection19)) || socialUserConnection0.equals(socialUserConnection19));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        java.lang.String str1 = socialUserConnection0.getUserId();
        java.lang.Long long2 = socialUserConnection0.getRank();
        java.lang.String str3 = socialUserConnection0.getSecret();
        java.lang.Long long4 = socialUserConnection0.getRank();
        java.lang.String str5 = socialUserConnection0.getProviderId();
        socialUserConnection0.setUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.Long long8 = socialUserConnection0.getExpireTime();
        java.lang.String str9 = socialUserConnection0.toString();
        java.lang.Long long10 = socialUserConnection0.getId();
        com.unifacisa.tcc.domain.Professor professor11 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str12 = professor11.getPrimeiroNome();
        java.lang.Boolean boolean13 = professor11.isDiponibilidade();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa15 = professor11.primeiroNome("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
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
        com.unifacisa.tcc.domain.Aluno aluno31 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str32 = aluno31.getEmail();
        java.lang.Boolean boolean33 = aluno31.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor34 = professor16.addAluno(aluno31);
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str36 = aluno35.getEmail();
        aluno35.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection39 = new com.unifacisa.tcc.domain.SocialUserConnection();
        boolean boolean40 = aluno35.equals((java.lang.Object) socialUserConnection39);
        socialUserConnection39.setRefreshToken("error.validation");
        socialUserConnection39.setProviderUserId("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        boolean boolean45 = aluno31.equals((java.lang.Object) "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.domain.Professor professor46 = professor11.removeAluno(aluno31);
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.String str48 = aluno47.getEmail();
        aluno47.setNumeroContato((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor51 = aluno47.getProfessor();
        com.unifacisa.tcc.domain.Professor professor52 = professor46.addAluno(aluno47);
        boolean boolean53 = socialUserConnection0.equals((java.lang.Object) professor52);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on socialUserConnection0, socialUserConnection39, and professor52.", !(socialUserConnection0.equals(socialUserConnection39) && socialUserConnection39.equals(professor52)) || socialUserConnection0.equals(professor52));
    }
}

