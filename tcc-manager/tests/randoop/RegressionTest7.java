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
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.matricula((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.Professor professor7 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor9 = professor7.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa11 = professor7.email("");
        java.lang.String str12 = professor7.toString();
        com.unifacisa.tcc.domain.Aluno aluno13 = aluno0.professor(professor7);
        com.unifacisa.tcc.domain.Aluno aluno15 = aluno0.habilitadoTcc((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor9);
        org.junit.Assert.assertNotNull(pessoa11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}" + "'", str12, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertNotNull(aluno13);
        org.junit.Assert.assertNotNull(aluno15);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        com.unifacisa.tcc.domain.User user39 = userMapper0.userFromId((java.lang.Long) 0L);
        java.lang.String str40 = user39.getCreatedBy();
        com.unifacisa.tcc.service.dto.UserDTO userDTO41 = new com.unifacisa.tcc.service.dto.UserDTO(user39);
        java.time.Instant instant42 = user39.getResetDate();
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(authoritySet37);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(instant42);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str5 = professor2.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor6 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor8 = professor6.diponibilidade((java.lang.Boolean) true);
        professor8.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        aluno11.setPrimeiroNome("");
        java.lang.Long long14 = aluno11.getMatricula();
        aluno11.setHabilitadoTcc((java.lang.Boolean) false);
        aluno11.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        aluno19.setPrimeiroNome("");
        java.lang.Long long22 = aluno19.getMatricula();
        java.lang.Long long23 = aluno19.getMatricula();
        aluno19.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        aluno26.setPrimeiroNome("");
        java.lang.Long long29 = aluno26.getMatricula();
        java.lang.Long long30 = aluno26.getMatricula();
        aluno26.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray34 = new com.unifacisa.tcc.domain.Aluno[] { aluno11, aluno19, aluno26, aluno33 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet35 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet35, alunoArray34);
        com.unifacisa.tcc.domain.Professor professor37 = professor8.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Professor professor38 = professor2.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor40 = null;
        aluno39.setProfessor(professor40);
        aluno39.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor44 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor46 = professor44.diponibilidade((java.lang.Boolean) true);
        professor46.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno49 = new com.unifacisa.tcc.domain.Aluno();
        aluno49.setPrimeiroNome("");
        java.lang.Long long52 = aluno49.getMatricula();
        aluno49.setHabilitadoTcc((java.lang.Boolean) false);
        aluno49.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        aluno57.setPrimeiroNome("");
        java.lang.Long long60 = aluno57.getMatricula();
        java.lang.Long long61 = aluno57.getMatricula();
        aluno57.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno64 = new com.unifacisa.tcc.domain.Aluno();
        aluno64.setPrimeiroNome("");
        java.lang.Long long67 = aluno64.getMatricula();
        java.lang.Long long68 = aluno64.getMatricula();
        aluno64.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno71 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray72 = new com.unifacisa.tcc.domain.Aluno[] { aluno49, aluno57, aluno64, aluno71 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet73 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet73, alunoArray72);
        com.unifacisa.tcc.domain.Professor professor75 = professor46.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet73);
        com.unifacisa.tcc.domain.Aluno aluno76 = aluno39.professor(professor75);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa78 = aluno76.segundoNome("");
        com.unifacisa.tcc.domain.Aluno aluno80 = aluno76.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor81 = professor38.removeAluno(aluno76);
        java.lang.Boolean boolean82 = aluno76.isHabilitadoTcc();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa84 = aluno76.matricula((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.Professor professor85 = aluno76.getProfessor();
        java.lang.Boolean boolean86 = aluno76.isHabilitadoTcc();
        aluno76.setHabilitadoTcc((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNotNull(alunoArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNotNull(professor38);
        org.junit.Assert.assertNotNull(professor46);
        org.junit.Assert.assertNull(long52);
        org.junit.Assert.assertNull(long60);
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNull(long68);
        org.junit.Assert.assertNotNull(alunoArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(professor75);
        org.junit.Assert.assertNotNull(aluno76);
        org.junit.Assert.assertNotNull(pessoa78);
        org.junit.Assert.assertNotNull(aluno80);
        org.junit.Assert.assertNotNull(professor81);
        org.junit.Assert.assertEquals("'" + boolean82 + "' != '" + false + "'", boolean82, false);
        org.junit.Assert.assertNotNull(pessoa84);
        org.junit.Assert.assertNull(professor85);
        org.junit.Assert.assertEquals("'" + boolean86 + "' != '" + false + "'", boolean86, false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository0 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator1 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository2 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository0, connectionFactoryLocator1);
        org.springframework.social.connect.ConnectionRepository connectionRepository4 = customSocialUsersConnectionRepository2.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository6 = customSocialUsersConnectionRepository2.createConnectionRepository("");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray9 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList10 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList10, userArray9);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList12 = userMapper8.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList10);
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
        java.util.List<com.unifacisa.tcc.domain.User> userList24 = userMapper8.userDTOsToUsers(userDTOList23);
        java.lang.String[] strArray47 = new java.lang.String[] { "User{login='null', firstName='null', lastName='null', email='Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "User{login='null', firstName='null', lastName='null', email='Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}", "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='LoggerVM{name='null', level='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}'}'}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "Aluno{id=0, primeiroNome='error.validation', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='false'}", "User{login='null', firstName='LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "LoggerVM{name='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:34.552Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:34.552Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', level='null'}", "LoginVM{username='null', rememberMe=false}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='null', accessToken='hi!', secret='null', refreshToken='null', expireTime=null}", "LoginVM{username='null', rememberMe=null}", "error.validation", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='false'}", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}'}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=, createdDate=2021-03-26T03:34:26.101Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:26.101Z, authorities=[]}", "SocialUserConnection{id=null, userId=Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=null, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "UserDTO{login='', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='hi!', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "SocialUserConnection{id=null, userId=, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=-1, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='false'}" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet50 = userMapper8.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet48);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet51 = customSocialUsersConnectionRepository2.findUserIdsConnectedTo("Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", (java.util.Set<java.lang.String>) strSet48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(connectionRepository4);
        org.junit.Assert.assertNotNull(connectionRepository6);
        org.junit.Assert.assertNotNull(userArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userDTOList12);
        org.junit.Assert.assertNotNull(userArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userDTOList17);
        org.junit.Assert.assertNotNull(userArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userDTOList22);
        org.junit.Assert.assertNotNull(userDTOList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(authoritySet50);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        boolean boolean7 = user2.equals((java.lang.Object) 10.0f);
        java.lang.String str8 = user2.getPassword();
        user2.setPassword("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str11 = user2.toString();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str11, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet3 = professor2.getAlunos();
        com.unifacisa.tcc.domain.Professor professor4 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str5 = professor4.toString();
        com.unifacisa.tcc.domain.Professor professor7 = professor4.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor8 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor10 = professor8.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor11 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno12 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor13 = null;
        aluno12.setProfessor(professor13);
        aluno12.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor19 = null;
        aluno18.setProfessor(professor19);
        java.lang.Long long21 = aluno18.getMatricula();
        java.lang.String str22 = aluno18.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean25 = aluno23.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor27 = null;
        aluno26.setProfessor(professor27);
        aluno26.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno31 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean33 = aluno31.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno34 = new com.unifacisa.tcc.domain.Aluno();
        aluno34.setPrimeiroNome("");
        java.lang.Long long37 = aluno34.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        aluno38.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray41 = new com.unifacisa.tcc.domain.Aluno[] { aluno12, aluno17, aluno18, aluno23, aluno26, aluno31, aluno34, aluno38 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet42 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet42, alunoArray41);
        professor11.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet42);
        com.unifacisa.tcc.domain.Professor professor45 = professor10.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet42);
        java.lang.Long long46 = professor45.getId();
        com.unifacisa.tcc.domain.Professor professor47 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor49 = professor47.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor50 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno51 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor52 = null;
        aluno51.setProfessor(professor52);
        aluno51.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno56 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor58 = null;
        aluno57.setProfessor(professor58);
        java.lang.Long long60 = aluno57.getMatricula();
        java.lang.String str61 = aluno57.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno62 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean64 = aluno62.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno65 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor66 = null;
        aluno65.setProfessor(professor66);
        aluno65.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno70 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean72 = aluno70.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno73 = new com.unifacisa.tcc.domain.Aluno();
        aluno73.setPrimeiroNome("");
        java.lang.Long long76 = aluno73.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno77 = new com.unifacisa.tcc.domain.Aluno();
        aluno77.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray80 = new com.unifacisa.tcc.domain.Aluno[] { aluno51, aluno56, aluno57, aluno62, aluno65, aluno70, aluno73, aluno77 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet81 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet81, alunoArray80);
        professor50.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet81);
        com.unifacisa.tcc.domain.Professor professor84 = professor49.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet81);
        java.lang.Long long85 = professor49.getId();
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet86 = professor49.getAlunos();
        com.unifacisa.tcc.domain.Professor professor87 = professor45.alunos(alunoSet86);
        com.unifacisa.tcc.domain.Professor professor88 = professor7.alunos(alunoSet86);
        professor2.setAlunos(alunoSet86);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(alunoSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str5, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor7);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(long37);
        org.junit.Assert.assertNotNull(alunoArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(professor45);
        org.junit.Assert.assertNull(long46);
        org.junit.Assert.assertNotNull(professor49);
        org.junit.Assert.assertNull(long60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(long76);
        org.junit.Assert.assertNotNull(alunoArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(professor84);
        org.junit.Assert.assertNull(long85);
        org.junit.Assert.assertNotNull(alunoSet86);
        org.junit.Assert.assertNotNull(professor87);
        org.junit.Assert.assertNotNull(professor88);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM keyAndPasswordVM0 = new com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM();
        keyAndPasswordVM0.setNewPassword("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        keyAndPasswordVM0.setNewPassword("LoginVM{username='null', rememberMe=null}");
        keyAndPasswordVM0.setKey("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        keyAndPasswordVM0.setKey("SocialUserConnection{id=null, userId=Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=null, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.lang.String str9 = keyAndPasswordVM0.getKey();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SocialUserConnection{id=null, userId=Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=null, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}" + "'", str9, "SocialUserConnection{id=null, userId=Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='LoginVM{username='null', rememberMe=false}', rank=null, displayName='null', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM0.setName("LoginVM{username='null', rememberMe=false}");
        java.lang.String str3 = loggerVM0.getName();
        java.lang.String str4 = loggerVM0.getName();
        java.lang.String str5 = loggerVM0.toString();
        java.lang.String str6 = loggerVM0.getLevel();
        java.lang.String str7 = loggerVM0.toString();
        java.lang.String str8 = loggerVM0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str3, "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str4, "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}" + "'", str5, "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}" + "'", str7, "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str8, "LoginVM{username='null', rememberMe=false}");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("Professor{id=0, primeiroNome='LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='error.validation', numeroContato='null', diponibilidade='true'}", socialUserConnectionRepository1, connectionFactoryLocator2);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setProfileURL("error.concurrencyFailure");
        java.lang.String str5 = socialUserConnection0.getRefreshToken();
        java.lang.Long long6 = socialUserConnection0.getRank();
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        socialUserConnection0.setImageURL("error.concurrencyFailure");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 10L);
        java.lang.String str3 = user2.getPassword();
        java.lang.String str4 = user2.getLastName();
        user2.setActivated(false);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.time.Instant instant10 = null;
        java.time.Instant instant12 = null;
        java.time.Instant instant22 = null;
        java.time.Instant instant24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        com.unifacisa.tcc.service.dto.UserDTO userDTO30 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant22, "hi!", instant24, (java.util.Set<java.lang.String>) strSet28);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM31 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 0L, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", "hi!", "hi!", "", true, "hi!", "", "", instant10, "", instant12, (java.util.Set<java.lang.String>) strSet28);
        java.lang.String str32 = managedUserVM31.getImageUrl();
        java.lang.String str33 = managedUserVM31.getEmail();
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        user2.setResetKey("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant18);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getPassword();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = loginVM0.isRememberMe();
        loginVM0.setPassword("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
        loginVM0.setRememberMe((java.lang.Boolean) true);
        loginVM0.setPassword("LoginVM{username='null', rememberMe=false}");
        java.lang.Boolean boolean11 = loginVM0.isRememberMe();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str9 = socialUserConnection0.getImageURL();
        java.lang.String str10 = socialUserConnection0.getImageURL();
        java.lang.String str11 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProviderUserId("LoginVM{username='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', rememberMe=false}");
        java.lang.String str14 = socialUserConnection0.getUserId();
        java.lang.String str15 = socialUserConnection0.getUserId();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str11, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper1 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user3 = userMapper1.userFromId((java.lang.Long) 100L);
        user3.setLangKey("");
        java.time.Instant instant6 = user3.getResetDate();
        java.time.Instant instant7 = user3.getCreatedDate();
        user0.setCreatedDate(instant7);
        boolean boolean9 = user0.getActivated();
        boolean boolean10 = user0.getActivated();
        java.lang.String str11 = user0.getLastModifiedBy();
        java.lang.String str12 = user0.getEmail();
        user0.setLangKey("LoggerVM{name='null', level='ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}'}");
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        user2.setLastName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        java.lang.String str8 = user2.getLastModifiedBy();
        java.lang.String str9 = user2.getLangKey();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getPassword();
        loginVM0.setRememberMe((java.lang.Boolean) false);
        java.lang.String str4 = loginVM0.toString();
        java.lang.String str5 = loginVM0.getPassword();
        loginVM0.setUsername("LoginVM{username='null', rememberMe=false}");
        loginVM0.setUsername("LoginVM{username='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', rememberMe=null}");
        loginVM0.setRememberMe((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str4, "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityUpdateAlert("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:35:16.174Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:35:16.174Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='0', diponibilidade='true'}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository1 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator2 = null;
        com.unifacisa.tcc.repository.CustomSocialConnectionRepository customSocialConnectionRepository3 = new com.unifacisa.tcc.repository.CustomSocialConnectionRepository("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='LoggerVM{name='null', level='null'}', secret='null', refreshToken='null', expireTime=null}", socialUserConnectionRepository1, connectionFactoryLocator2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.social.connect.Connection<?>> wildcardConnectionList5 = customSocialConnectionRepository3.findConnections("LoggerVM{name='Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='true'}', level='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("");
        socialUserConnection0.setProfileURL("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
        java.lang.String str12 = socialUserConnection0.getImageURL();
        java.lang.String str13 = socialUserConnection0.getSecret();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str12, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant1 = managedUserVM0.getCreatedDate();
        java.lang.String str2 = managedUserVM0.getImageUrl();
        java.time.Instant instant3 = managedUserVM0.getCreatedDate();
        java.time.Instant instant4 = managedUserVM0.getLastModifiedDate();
        java.lang.String str5 = managedUserVM0.getLastModifiedBy();
        java.lang.String str6 = managedUserVM0.getEmail();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper3 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray4 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList5 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList5, userArray4);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList7 = userMapper3.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList5);
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
        com.unifacisa.tcc.service.mapper.UserMapper userMapper46 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray47 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList48 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList48, userArray47);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList50 = userMapper46.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList48);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList51 = userMapper8.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList48);
        java.util.List<com.unifacisa.tcc.domain.User> userList52 = userMapper3.userDTOsToUsers(userDTOList51);
        java.util.List<com.unifacisa.tcc.domain.User> userList53 = userMapper0.userDTOsToUsers(userDTOList51);
        com.unifacisa.tcc.domain.User user55 = userMapper0.userFromId((java.lang.Long) 100L);
        user55.setId((java.lang.Long) 0L);
        java.lang.String str58 = user55.getImageUrl();
        user55.setActivated(true);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(userArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userDTOList7);
        org.junit.Assert.assertNotNull(userArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userDTOList12);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(authoritySet45);
        org.junit.Assert.assertNotNull(userArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(userDTOList50);
        org.junit.Assert.assertNotNull(userDTOList51);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(user55);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper5 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray6 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList7 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList7, userArray6);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList9 = userMapper5.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList7);
        com.unifacisa.tcc.domain.User user11 = new com.unifacisa.tcc.domain.User();
        user11.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM14 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet15 = managedUserVM14.getAuthorities();
        boolean boolean16 = user11.equals((java.lang.Object) strSet15);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper17 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray18 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList19 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList19, userArray18);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList21 = userMapper17.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList19);
        java.time.Instant instant32 = null;
        java.time.Instant instant34 = null;
        java.time.Instant instant44 = null;
        java.time.Instant instant46 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        com.unifacisa.tcc.service.dto.UserDTO userDTO52 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant44, "hi!", instant46, (java.util.Set<java.lang.String>) strSet50);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM53 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant32, "", instant34, (java.util.Set<java.lang.String>) strSet50);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet54 = userMapper17.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet50);
        user11.setAuthorities(authoritySet54);
        java.lang.String str56 = user11.getFirstName();
        user11.setId((java.lang.Long) 10L);
        com.unifacisa.tcc.service.dto.UserDTO userDTO59 = userMapper0.userToUserDTO(user11);
        com.unifacisa.tcc.domain.User user61 = userMapper0.userFromId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.User user62 = new com.unifacisa.tcc.domain.User();
        user62.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user62.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant67 = user62.getLastModifiedDate();
        user62.setResetKey("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.time.Instant instant70 = user62.getResetDate();
        user62.setLastModifiedBy("Authority{name='error.concurrencyFailure'}");
        java.time.Instant instant73 = user62.getResetDate();
        user62.setLastName("LoginVM{username='null', rememberMe=false}");
        java.time.Instant instant76 = user62.getLastModifiedDate();
        java.lang.String str77 = user62.getCreatedBy();
        com.unifacisa.tcc.service.dto.UserDTO userDTO78 = userMapper0.userToUserDTO(user62);
        java.lang.String str79 = user62.getEmail();
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(userArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDTOList9);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userDTOList21);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(authoritySet54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(userDTO59);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertNull(instant70);
        org.junit.Assert.assertNull(instant73);
        org.junit.Assert.assertNotNull(instant76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str77, "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertNotNull(userDTO78);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant5 = managedUserVM4.getCreatedDate();
        java.lang.Long long6 = managedUserVM4.getId();
        java.lang.Long long7 = managedUserVM4.getId();
        java.lang.String str8 = managedUserVM4.toString();
        managedUserVM4.setId((java.lang.Long) (-1L));
        java.util.Set<java.lang.String> strSet11 = managedUserVM4.getAuthorities();
        java.lang.String str12 = managedUserVM4.getImageUrl();
        org.springframework.http.ResponseEntity responseEntity13 = userResource3.createUser(managedUserVM4);
        java.time.Instant instant24 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant36 = null;
        java.time.Instant instant38 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        com.unifacisa.tcc.service.dto.UserDTO userDTO44 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant36, "hi!", instant38, (java.util.Set<java.lang.String>) strSet42);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM45 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", false, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoginVM{username='null', rememberMe=false}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant24, "hi!", instant26, (java.util.Set<java.lang.String>) strSet42);
        org.springframework.http.ResponseEntity responseEntity46 = userResource3.createUser(managedUserVM45);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity responseEntity48 = userResource3.createUser(managedUserVM47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str8, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(responseEntity13);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(responseEntity46);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        user2.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str9 = user2.toString();
        java.lang.String str10 = user2.toString();
        user2.setLastModifiedBy("LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='LoggerVM{name='null', level='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}'}'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}" + "'", str9, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}" + "'", str10, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.springframework.core.env.Environment environment19 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect20 = loggingAspectConfiguration15.loggingAspect(environment19);
        loggingAspect20.applicationPackagePointcut();
        org.aspectj.lang.JoinPoint joinPoint22 = null;
        java.lang.Throwable throwable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            loggingAspect20.logAfterThrowing(joinPoint22, throwable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(loggingAspect18);
        org.junit.Assert.assertNotNull(loggingAspect20);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.getPassword();
        java.lang.String str2 = loginVM0.getPassword();
        java.lang.String str3 = loginVM0.getPassword();
        loginVM0.setPassword("ManagedUserVM{} UserDTO{login='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        loginVM0.setRememberMe((java.lang.Boolean) false);
        java.lang.String str8 = loginVM0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str8, "LoginVM{username='null', rememberMe=false}");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        java.lang.String str5 = socialUserConnection0.getDisplayName();
        java.lang.String str6 = socialUserConnection0.getAccessToken();
        socialUserConnection0.setUserId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}");
        java.lang.String str9 = socialUserConnection0.getProviderId();
        java.lang.String str10 = socialUserConnection0.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str9, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SocialUserConnection{id=null, userId=Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}" + "'", str10, "SocialUserConnection{id=null, userId=Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor7 = professor5.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa9 = professor5.email("");
        com.unifacisa.tcc.domain.Professor professor11 = professor5.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno12 = aluno0.professor(professor11);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa14 = professor11.segundoNome("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='error.validation', accessToken='null', secret='LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=true}', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNotNull(professor7);
        org.junit.Assert.assertNotNull(pessoa9);
        org.junit.Assert.assertNotNull(professor11);
        org.junit.Assert.assertNotNull(aluno12);
        org.junit.Assert.assertNotNull(pessoa14);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        java.lang.String str7 = aluno0.getEmail();
        com.unifacisa.tcc.domain.Professor professor8 = aluno0.getProfessor();
        com.unifacisa.tcc.domain.Professor professor9 = aluno0.getProfessor();
        java.lang.String str10 = aluno0.toString();
        aluno0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(professor8);
        org.junit.Assert.assertNull(professor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str10, "Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        persistentAuditEvent0.setId((java.lang.Long) 1L);
        java.time.Instant instant6 = persistentAuditEvent0.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = persistentAuditEvent0.getData();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.toString();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        java.lang.Long long5 = aluno2.getMatricula();
        java.lang.String str6 = aluno2.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean9 = aluno7.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor10 = aluno7.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean13 = aluno11.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor16 = null;
        aluno15.setProfessor(professor16);
        java.lang.Long long18 = aluno15.getMatricula();
        java.lang.String str19 = aluno15.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean22 = aluno20.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor23 = aluno20.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor25 = null;
        aluno24.setProfessor(professor25);
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        aluno27.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor31 = null;
        aluno30.setProfessor(professor31);
        aluno30.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor36 = null;
        aluno35.setProfessor(professor36);
        java.lang.Long long38 = aluno35.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno40 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean42 = aluno40.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno43 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor44 = null;
        aluno43.setProfessor(professor44);
        com.unifacisa.tcc.domain.Aluno[] alunoArray46 = new com.unifacisa.tcc.domain.Aluno[] { aluno2, aluno7, aluno11, aluno14, aluno15, aluno20, aluno24, aluno27, aluno30, aluno35, aluno39, aluno40, aluno43 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet47 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet47, alunoArray46);
        com.unifacisa.tcc.domain.Professor professor49 = professor0.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet47);
        com.unifacisa.tcc.domain.Professor professor51 = professor0.diponibilidade((java.lang.Boolean) false);
        java.lang.Boolean boolean52 = professor0.isDiponibilidade();
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor54 = professor0.removeAluno(aluno53);
        aluno53.setNumeroContato((java.lang.Long) 1L);
        java.lang.String str57 = aluno53.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str1, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(professor10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(professor23);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(alunoArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(professor49);
        org.junit.Assert.assertNotNull(professor51);
        org.junit.Assert.assertEquals("'" + boolean52 + "' != '" + false + "'", boolean52, false);
        org.junit.Assert.assertNotNull(professor54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='1', habilitadoTcc='null'}" + "'", str57, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='1', habilitadoTcc='null'}");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.User user3 = new com.unifacisa.tcc.domain.User();
        user3.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user3.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user10 = userMapper8.userFromId((java.lang.Long) 100L);
        user10.setLangKey("");
        java.time.Instant instant13 = user10.getResetDate();
        java.time.Instant instant14 = user10.getCreatedDate();
        user3.setResetDate(instant14);
        boolean boolean16 = user3.getActivated();
        user3.setLangKey("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant19 = user3.getCreatedDate();
        user2.setCreatedDate(instant19);
        user2.setId((java.lang.Long) 10L);
        user2.setLangKey("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        user2.setActivationKey("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='1', habilitadoTcc='true'}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(instant19);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str5 = professor2.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor6 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor8 = professor6.diponibilidade((java.lang.Boolean) true);
        professor8.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        aluno11.setPrimeiroNome("");
        java.lang.Long long14 = aluno11.getMatricula();
        aluno11.setHabilitadoTcc((java.lang.Boolean) false);
        aluno11.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        aluno19.setPrimeiroNome("");
        java.lang.Long long22 = aluno19.getMatricula();
        java.lang.Long long23 = aluno19.getMatricula();
        aluno19.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        aluno26.setPrimeiroNome("");
        java.lang.Long long29 = aluno26.getMatricula();
        java.lang.Long long30 = aluno26.getMatricula();
        aluno26.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray34 = new com.unifacisa.tcc.domain.Aluno[] { aluno11, aluno19, aluno26, aluno33 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet35 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet35, alunoArray34);
        com.unifacisa.tcc.domain.Professor professor37 = professor8.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Professor professor38 = professor2.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor40 = null;
        aluno39.setProfessor(professor40);
        aluno39.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor44 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor46 = professor44.diponibilidade((java.lang.Boolean) true);
        professor46.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno49 = new com.unifacisa.tcc.domain.Aluno();
        aluno49.setPrimeiroNome("");
        java.lang.Long long52 = aluno49.getMatricula();
        aluno49.setHabilitadoTcc((java.lang.Boolean) false);
        aluno49.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        aluno57.setPrimeiroNome("");
        java.lang.Long long60 = aluno57.getMatricula();
        java.lang.Long long61 = aluno57.getMatricula();
        aluno57.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno64 = new com.unifacisa.tcc.domain.Aluno();
        aluno64.setPrimeiroNome("");
        java.lang.Long long67 = aluno64.getMatricula();
        java.lang.Long long68 = aluno64.getMatricula();
        aluno64.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno71 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray72 = new com.unifacisa.tcc.domain.Aluno[] { aluno49, aluno57, aluno64, aluno71 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet73 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet73, alunoArray72);
        com.unifacisa.tcc.domain.Professor professor75 = professor46.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet73);
        com.unifacisa.tcc.domain.Aluno aluno76 = aluno39.professor(professor75);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa78 = aluno76.segundoNome("");
        com.unifacisa.tcc.domain.Aluno aluno80 = aluno76.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor81 = professor38.removeAluno(aluno76);
        professor81.setPrimeiroNome("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNotNull(alunoArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNotNull(professor38);
        org.junit.Assert.assertNotNull(professor46);
        org.junit.Assert.assertNull(long52);
        org.junit.Assert.assertNull(long60);
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNull(long68);
        org.junit.Assert.assertNotNull(alunoArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(professor75);
        org.junit.Assert.assertNotNull(aluno76);
        org.junit.Assert.assertNotNull(pessoa78);
        org.junit.Assert.assertNotNull(aluno80);
        org.junit.Assert.assertNotNull(professor81);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        socialUserConnection0.setExpireTime((java.lang.Long) (-1L));
        socialUserConnection0.setProviderUserId("hi!");
        java.lang.String str12 = socialUserConnection0.getUserId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.String str8 = socialUserConnection0.getImageURL();
        java.lang.String str9 = socialUserConnection0.getProviderUserId();
        java.lang.String str10 = socialUserConnection0.toString();
        socialUserConnection0.setRefreshToken("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        socialUserConnection0.setRank((java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error.validation" + "'", str8, "error.validation");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='error.validation', accessToken='null', secret='null', refreshToken='null', expireTime=null}" + "'", str10, "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='error.validation', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.time.Instant instant2 = managedUserVM0.getLastModifiedDate();
        java.time.Instant instant3 = null;
        managedUserVM0.setLastModifiedDate(instant3);
        boolean boolean5 = managedUserVM0.isActivated();
        java.lang.String str6 = managedUserVM0.toString();
        boolean boolean7 = managedUserVM0.isActivated();
        boolean boolean8 = managedUserVM0.isActivated();
        java.util.Set<java.lang.String> strSet9 = managedUserVM0.getAuthorities();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str6, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long5 = professor2.getId();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa7 = professor2.email("error.validation");
        professor2.setId((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa11 = professor2.primeiroNome("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa13 = professor2.matricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Professor professor14 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor16 = professor14.diponibilidade((java.lang.Boolean) true);
        professor16.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        professor16.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        professor16.setPrimeiroNome("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor24 = null;
        aluno23.setProfessor(professor24);
        aluno23.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa29 = aluno23.primeiroNome("hi!");
        java.lang.Long long30 = aluno23.getId();
        java.lang.String str31 = aluno23.getSegundoNome();
        aluno23.setSegundoNome("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
        com.unifacisa.tcc.domain.Professor professor34 = professor16.removeAluno(aluno23);
        com.unifacisa.tcc.domain.Professor professor35 = professor2.removeAluno(aluno23);
        professor35.setMatricula((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNotNull(pessoa7);
        org.junit.Assert.assertNotNull(pessoa11);
        org.junit.Assert.assertNotNull(pessoa13);
        org.junit.Assert.assertNotNull(professor16);
        org.junit.Assert.assertNotNull(pessoa29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(professor34);
        org.junit.Assert.assertNotNull(professor35);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean4 = aluno2.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor5 = aluno2.getProfessor();
        java.lang.String str6 = aluno2.toString();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa8 = aluno2.matricula((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity9 = alunoResource1.createAluno(aluno2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(professor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str6, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(pessoa8);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Professor professor6 = professor0.diponibilidade((java.lang.Boolean) true);
        professor0.setDiponibilidade((java.lang.Boolean) false);
        professor0.setMatricula((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor6);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.unifacisa.tcc.domain.Authority authority0 = new com.unifacisa.tcc.domain.Authority();
        authority0.setName("Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}");
        java.lang.String str3 = authority0.getName();
        java.lang.String str4 = authority0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}" + "'", str3, "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}" + "'", str4, "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        user2.setPassword("");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent9 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant10 = persistentAuditEvent9.getAuditEventDate();
        java.time.Instant instant11 = null;
        persistentAuditEvent9.setAuditEventDate(instant11);
        java.time.Instant instant13 = persistentAuditEvent9.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        persistentAuditEvent9.setData(strMap14);
        java.lang.String str16 = persistentAuditEvent9.getPrincipal();
        boolean boolean17 = user2.equals((java.lang.Object) persistentAuditEvent9);
        java.lang.String str18 = user2.getImageUrl();
        user2.setResetKey("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        java.time.Instant instant21 = user2.getCreatedDate();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNull(instant10);
        org.junit.Assert.assertNull(instant13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant1 = managedUserVM0.getCreatedDate();
        java.lang.Long long2 = managedUserVM0.getId();
        java.lang.Long long3 = managedUserVM0.getId();
        java.lang.String str4 = managedUserVM0.getLogin();
        java.lang.String str5 = managedUserVM0.toString();
        java.lang.String str6 = managedUserVM0.getLangKey();
        java.lang.String str7 = managedUserVM0.getEmail();
        java.lang.String str8 = managedUserVM0.getEmail();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str5, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setExpireTime((java.lang.Long) 100L);
        socialUserConnection0.setProviderUserId("");
        socialUserConnection0.setUserId("LoginVM{username='null', rememberMe=false}");
        java.lang.Long long14 = socialUserConnection0.getId();
        socialUserConnection0.setRefreshToken("User{login='null', firstName='null', lastName='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant1 = managedUserVM0.getCreatedDate();
        java.lang.String str2 = managedUserVM0.getImageUrl();
        java.lang.Long long3 = managedUserVM0.getId();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        java.lang.String str23 = userDTO22.getEmail();
        userDTO22.setId((java.lang.Long) (-1L));
        userDTO22.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setExpireTime((java.lang.Long) 100L);
        java.lang.String str10 = socialUserConnection0.getUserId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        aluno5.setPrimeiroNome("");
        aluno5.setId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor10 = professor0.addAluno(aluno5);
        com.unifacisa.tcc.domain.User user11 = new com.unifacisa.tcc.domain.User();
        user11.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user11.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper16 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user18 = userMapper16.userFromId((java.lang.Long) 100L);
        user18.setLangKey("");
        java.time.Instant instant21 = user18.getResetDate();
        java.time.Instant instant22 = user18.getCreatedDate();
        user11.setResetDate(instant22);
        java.time.Instant instant24 = null;
        user11.setCreatedDate(instant24);
        java.lang.String str26 = user11.getPassword();
        boolean boolean27 = user11.getActivated();
        boolean boolean28 = aluno5.equals((java.lang.Object) user11);
        com.unifacisa.tcc.domain.Professor professor29 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor31 = professor29.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor32 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor34 = null;
        aluno33.setProfessor(professor34);
        aluno33.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno38 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor40 = null;
        aluno39.setProfessor(professor40);
        java.lang.Long long42 = aluno39.getMatricula();
        java.lang.String str43 = aluno39.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno44 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean46 = aluno44.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor48 = null;
        aluno47.setProfessor(professor48);
        aluno47.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean54 = aluno52.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        aluno55.setPrimeiroNome("");
        java.lang.Long long58 = aluno55.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno59 = new com.unifacisa.tcc.domain.Aluno();
        aluno59.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray62 = new com.unifacisa.tcc.domain.Aluno[] { aluno33, aluno38, aluno39, aluno44, aluno47, aluno52, aluno55, aluno59 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet63 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet63, alunoArray62);
        professor32.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet63);
        com.unifacisa.tcc.domain.Professor professor66 = professor31.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet63);
        java.lang.Long long67 = professor66.getMatricula();
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet68 = professor66.getAlunos();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa70 = professor66.segundoNome("hi!");
        professor66.setNumeroContato((java.lang.Long) 1L);
        aluno5.setProfessor(professor66);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet74 = null;
        professor66.setAlunos(alunoSet74);
        java.lang.Boolean boolean76 = professor66.isDiponibilidade();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNull(instant21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(professor31);
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(long58);
        org.junit.Assert.assertNotNull(alunoArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(professor66);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNotNull(alunoSet68);
        org.junit.Assert.assertNotNull(pessoa70);
        org.junit.Assert.assertEquals("'" + boolean76 + "' != '" + true + "'", boolean76, true);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.unifacisa.tcc.domain.Authority authority0 = new com.unifacisa.tcc.domain.Authority();
        java.lang.String str1 = authority0.getName();
        java.lang.String str2 = authority0.getName();
        boolean boolean4 = authority0.equals((java.lang.Object) '#');
        authority0.setName("SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.lang.String str7 = authority0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='null', secret='null', refreshToken='null', expireTime=null}" + "'", str7, "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.lang.String str2 = managedUserVM0.getLogin();
        java.lang.String str3 = managedUserVM0.getFirstName();
        java.time.Instant instant4 = managedUserVM0.getCreatedDate();
        java.lang.String str5 = managedUserVM0.getPassword();
        java.lang.String str6 = managedUserVM0.getLastModifiedBy();
        java.lang.String str7 = managedUserVM0.getEmail();
        java.time.Instant instant8 = managedUserVM0.getCreatedDate();
        java.util.Set<java.lang.String> strSet9 = managedUserVM0.getAuthorities();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(instant8);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.Long long1 = aluno0.getId();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa3 = aluno0.matricula((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa5 = aluno0.numeroContato((java.lang.Long) 1L);
        aluno0.setHabilitadoTcc((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(pessoa3);
        org.junit.Assert.assertNotNull(pessoa5);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean2 = aluno0.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor3 = aluno0.getProfessor();
        java.lang.String str4 = aluno0.toString();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.matricula((java.lang.Long) 1L);
        java.lang.Long long7 = aluno0.getNumeroContato();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa9 = aluno0.primeiroNome("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        aluno0.setHabilitadoTcc((java.lang.Boolean) false);
        aluno0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(professor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str4, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(pessoa9);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        professor4.setDiponibilidade((java.lang.Boolean) false);
        professor4.setId((java.lang.Long) 100L);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity9 = professorResource1.createProfessor(professor4);
        professor4.setEmail("LoggerVM{name='null', level='ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}'}");
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(professorResponseEntity9);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        user2.setCreatedBy("Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str24 = user2.getLastName();
        java.lang.String str25 = user2.getCreatedBy();
        java.time.Instant instant26 = user2.getResetDate();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}" + "'", str25, "Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.junit.Assert.assertNotNull(instant26);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        java.time.Instant instant4 = persistentAuditEvent0.getAuditEventDate();
        java.lang.String str5 = persistentAuditEvent0.getAuditEventType();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper6 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user8 = userMapper6.userFromId((java.lang.Long) 100L);
        user8.setLangKey("");
        java.time.Instant instant11 = user8.getResetDate();
        java.time.Instant instant12 = user8.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno13 = new com.unifacisa.tcc.domain.Aluno();
        aluno13.setPrimeiroNome("");
        java.lang.String str16 = aluno13.getPrimeiroNome();
        java.lang.Long long17 = aluno13.getMatricula();
        boolean boolean18 = user8.equals((java.lang.Object) aluno13);
        user8.setFirstName("");
        com.unifacisa.tcc.domain.User user21 = new com.unifacisa.tcc.domain.User();
        user21.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user21.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper26 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user28 = userMapper26.userFromId((java.lang.Long) 100L);
        user28.setLangKey("");
        java.time.Instant instant31 = user28.getResetDate();
        java.time.Instant instant32 = user28.getCreatedDate();
        user21.setResetDate(instant32);
        user8.setCreatedDate(instant32);
        persistentAuditEvent0.setAuditEventDate(instant32);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = persistentAuditEvent0.getData();
        com.unifacisa.tcc.domain.User user37 = new com.unifacisa.tcc.domain.User();
        user37.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user37.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper42 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user44 = userMapper42.userFromId((java.lang.Long) 100L);
        user44.setLangKey("");
        java.time.Instant instant47 = user44.getResetDate();
        java.time.Instant instant48 = user44.getCreatedDate();
        user37.setResetDate(instant48);
        persistentAuditEvent0.setAuditEventDate(instant48);
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNull(instant31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNull(instant47);
        org.junit.Assert.assertNotNull(instant48);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.unifacisa.tcc.config.LoggingAspectConfiguration loggingAspectConfiguration0 = new com.unifacisa.tcc.config.LoggingAspectConfiguration();
        org.springframework.core.env.Environment environment1 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect2 = loggingAspectConfiguration0.loggingAspect(environment1);
        org.springframework.core.env.Environment environment3 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect4 = loggingAspectConfiguration0.loggingAspect(environment3);
        loggingAspect4.springBeanPointcut();
        loggingAspect4.applicationPackagePointcut();
        org.junit.Assert.assertNotNull(loggingAspect2);
        org.junit.Assert.assertNotNull(loggingAspect4);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM0 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM0.setName("LoginVM{username='null', rememberMe=false}");
        java.lang.String str3 = loggerVM0.getName();
        loggerVM0.setLevel("LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}");
        loggerVM0.setLevel("LoginVM{username='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', rememberMe=null}");
        java.lang.String str8 = loggerVM0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str3, "LoginVM{username='null', rememberMe=false}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LoginVM{username='null', rememberMe=false}" + "'", str8, "LoginVM{username='null', rememberMe=false}");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        aluno55.setId((java.lang.Long) 1L);
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
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        user2.setPassword("");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent9 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant10 = persistentAuditEvent9.getAuditEventDate();
        java.time.Instant instant11 = null;
        persistentAuditEvent9.setAuditEventDate(instant11);
        java.time.Instant instant13 = persistentAuditEvent9.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        persistentAuditEvent9.setData(strMap14);
        java.lang.String str16 = persistentAuditEvent9.getPrincipal();
        boolean boolean17 = user2.equals((java.lang.Object) persistentAuditEvent9);
        java.lang.String str18 = user2.getEmail();
        java.lang.String str19 = user2.getImageUrl();
        java.time.Instant instant30 = null;
        java.time.Instant instant32 = null;
        java.time.Instant instant42 = null;
        java.time.Instant instant44 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.unifacisa.tcc.service.dto.UserDTO userDTO50 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant42, "hi!", instant44, (java.util.Set<java.lang.String>) strSet48);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM51 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 0L, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", "hi!", "hi!", "", true, "hi!", "", "", instant30, "", instant32, (java.util.Set<java.lang.String>) strSet48);
        java.time.Instant instant52 = managedUserVM51.getCreatedDate();
        java.lang.String str53 = managedUserVM51.getLangKey();
        java.lang.String str54 = managedUserVM51.getLogin();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper55 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user57 = userMapper55.userFromId((java.lang.Long) 100L);
        user57.setLangKey("");
        java.time.Instant instant60 = user57.getResetDate();
        java.time.Instant instant61 = user57.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno62 = new com.unifacisa.tcc.domain.Aluno();
        aluno62.setPrimeiroNome("");
        java.lang.String str65 = aluno62.getPrimeiroNome();
        java.lang.Long long66 = aluno62.getMatricula();
        boolean boolean67 = user57.equals((java.lang.Object) aluno62);
        user57.setFirstName("");
        com.unifacisa.tcc.domain.User user70 = new com.unifacisa.tcc.domain.User();
        user70.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user70.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper75 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user77 = userMapper75.userFromId((java.lang.Long) 100L);
        user77.setLangKey("");
        java.time.Instant instant80 = user77.getResetDate();
        java.time.Instant instant81 = user77.getCreatedDate();
        user70.setResetDate(instant81);
        user57.setCreatedDate(instant81);
        managedUserVM51.setLastModifiedDate(instant81);
        user2.setCreatedDate(instant81);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNull(instant10);
        org.junit.Assert.assertNull(instant13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(instant52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str54, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertNull(instant60);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(long66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNull(instant80);
        org.junit.Assert.assertNotNull(instant81);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("error.concurrencyFailure");
        java.lang.Long long12 = socialUserConnection0.getRank();
        socialUserConnection0.setUserId("");
        socialUserConnection0.setProviderId("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        socialUserConnection0.setProviderUserId("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}");
        socialUserConnection0.setDisplayName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.repository.SocialUserConnectionRepository socialUserConnectionRepository21 = null;
        org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator22 = null;
        com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository customSocialUsersConnectionRepository23 = new com.unifacisa.tcc.repository.CustomSocialUsersConnectionRepository(socialUserConnectionRepository21, connectionFactoryLocator22);
        org.springframework.social.connect.ConnectionRepository connectionRepository25 = customSocialUsersConnectionRepository23.createConnectionRepository("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.springframework.social.connect.ConnectionRepository connectionRepository27 = customSocialUsersConnectionRepository23.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.springframework.social.connect.ConnectionRepository connectionRepository29 = customSocialUsersConnectionRepository23.createConnectionRepository("LoginVM{username='null', rememberMe=false}");
        org.springframework.social.connect.ConnectionRepository connectionRepository31 = customSocialUsersConnectionRepository23.createConnectionRepository("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        org.springframework.social.connect.ConnectionRepository connectionRepository33 = customSocialUsersConnectionRepository23.createConnectionRepository("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        boolean boolean34 = socialUserConnection0.equals((java.lang.Object) customSocialUsersConnectionRepository23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(connectionRepository25);
        org.junit.Assert.assertNotNull(connectionRepository27);
        org.junit.Assert.assertNotNull(connectionRepository29);
        org.junit.Assert.assertNotNull(connectionRepository31);
        org.junit.Assert.assertNotNull(connectionRepository33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='false'}", "ManagedUserVM{} UserDTO{login='error.concurrencyFailure', firstName='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', lastName='', email='hi!', imageUrl='hi!', activated=false, langKey='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', createdBy=error.validation, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", (java.lang.Long) 10L, "LoggerVM{name='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}', level='Aluno{id=null, primeiroNome='null', segundoNome='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}'}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='1', email='null', numeroContato='null', diponibilidade='false'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "SocialUserConnection{id=null, userId=Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', numeroContato='null', diponibilidade='true'}", "Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}", (java.lang.Long) 10L);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        com.unifacisa.tcc.domain.Professor professor6 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor8 = professor6.diponibilidade((java.lang.Boolean) true);
        professor8.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str11 = professor8.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor14 = professor12.diponibilidade((java.lang.Boolean) true);
        professor14.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        aluno17.setPrimeiroNome("");
        java.lang.Long long20 = aluno17.getMatricula();
        aluno17.setHabilitadoTcc((java.lang.Boolean) false);
        aluno17.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        aluno25.setPrimeiroNome("");
        java.lang.Long long28 = aluno25.getMatricula();
        java.lang.Long long29 = aluno25.getMatricula();
        aluno25.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        aluno32.setPrimeiroNome("");
        java.lang.Long long35 = aluno32.getMatricula();
        java.lang.Long long36 = aluno32.getMatricula();
        aluno32.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray40 = new com.unifacisa.tcc.domain.Aluno[] { aluno17, aluno25, aluno32, aluno39 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet41 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet41, alunoArray40);
        com.unifacisa.tcc.domain.Professor professor43 = professor14.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet41);
        com.unifacisa.tcc.domain.Professor professor44 = professor8.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet41);
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor46 = null;
        aluno45.setProfessor(professor46);
        aluno45.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor50 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor52 = professor50.diponibilidade((java.lang.Boolean) true);
        professor52.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        aluno55.setPrimeiroNome("");
        java.lang.Long long58 = aluno55.getMatricula();
        aluno55.setHabilitadoTcc((java.lang.Boolean) false);
        aluno55.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno63 = new com.unifacisa.tcc.domain.Aluno();
        aluno63.setPrimeiroNome("");
        java.lang.Long long66 = aluno63.getMatricula();
        java.lang.Long long67 = aluno63.getMatricula();
        aluno63.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno70 = new com.unifacisa.tcc.domain.Aluno();
        aluno70.setPrimeiroNome("");
        java.lang.Long long73 = aluno70.getMatricula();
        java.lang.Long long74 = aluno70.getMatricula();
        aluno70.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno77 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray78 = new com.unifacisa.tcc.domain.Aluno[] { aluno55, aluno63, aluno70, aluno77 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet79 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet79, alunoArray78);
        com.unifacisa.tcc.domain.Professor professor81 = professor52.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet79);
        com.unifacisa.tcc.domain.Aluno aluno82 = aluno45.professor(professor81);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa84 = aluno82.segundoNome("");
        com.unifacisa.tcc.domain.Aluno aluno86 = aluno82.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor87 = professor44.removeAluno(aluno82);
        com.unifacisa.tcc.domain.Professor professor89 = professor87.diponibilidade((java.lang.Boolean) true);
        boolean boolean90 = user2.equals((java.lang.Object) professor87);
        java.time.Instant instant91 = user2.getLastModifiedDate();
        user2.setLangKey("SocialUserConnection{id=100, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='error.validation', accessToken='null', secret='null', refreshToken='null', expireTime=-1}");
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(professor14);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNotNull(alunoArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(professor43);
        org.junit.Assert.assertNotNull(professor44);
        org.junit.Assert.assertNotNull(professor52);
        org.junit.Assert.assertNull(long58);
        org.junit.Assert.assertNull(long66);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNull(long73);
        org.junit.Assert.assertNull(long74);
        org.junit.Assert.assertNotNull(alunoArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(professor81);
        org.junit.Assert.assertNotNull(aluno82);
        org.junit.Assert.assertNotNull(pessoa84);
        org.junit.Assert.assertNotNull(aluno86);
        org.junit.Assert.assertNotNull(professor87);
        org.junit.Assert.assertNotNull(professor89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(instant91);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity13 = professorResource1.getProfessor((java.lang.Long) (-1L));
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
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 0L);
        java.time.Instant instant13 = null;
        java.time.Instant instant15 = null;
        java.time.Instant instant25 = null;
        java.time.Instant instant27 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.unifacisa.tcc.service.dto.UserDTO userDTO33 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant25, "hi!", instant27, (java.util.Set<java.lang.String>) strSet31);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM34 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", false, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoginVM{username='null', rememberMe=false}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant13, "hi!", instant15, (java.util.Set<java.lang.String>) strSet31);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet35 = userMapper0.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet31);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper36 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user38 = userMapper36.userFromId((java.lang.Long) 100L);
        user38.setLangKey("");
        java.time.Instant instant41 = user38.getResetDate();
        java.time.Instant instant42 = user38.getCreatedDate();
        user38.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        user38.setLastModifiedBy("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str47 = user38.toString();
        java.lang.String str48 = user38.getActivationKey();
        com.unifacisa.tcc.service.dto.UserDTO userDTO49 = userMapper0.userToUserDTO(user38);
        boolean boolean50 = userDTO49.isActivated();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(authoritySet35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNull(instant41);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}" + "'", str47, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(userDTO49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = null;
        persistentAuditEvent0.setAuditEventDate(instant1);
        java.lang.String str3 = persistentAuditEvent0.getAuditEventType();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = persistentAuditEvent0.getData();
        java.time.Instant instant5 = persistentAuditEvent0.getAuditEventDate();
        java.lang.String str6 = persistentAuditEvent0.getAuditEventType();
        java.time.Instant instant7 = persistentAuditEvent0.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = persistentAuditEvent0.getData();
        persistentAuditEvent0.setPrincipal("Aluno{id=1, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        persistentAuditEvent0.setPrincipal("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setLangKey("");
        java.time.Instant instant5 = user2.getResetDate();
        java.time.Instant instant6 = user2.getCreatedDate();
        user2.setCreatedBy("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        com.unifacisa.tcc.service.dto.UserDTO userDTO9 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        user2.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}", (java.lang.Long) 1L, "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='0', email='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', numeroContato='null', habilitadoTcc='true'}", "LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}", "UserDTO{login='LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=false, langKey='', createdBy=, createdDate=null, lastModifiedBy='hi!', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "SocialUserConnection{id=-1, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='LoggerVM{name='null', level='null'}', secret='null', refreshToken='LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}', expireTime=null}", "User{login='null', firstName='null', lastName='null', email='Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}', imageUrl='null', activated='false', langKey='null', activationKey='null'}", (java.lang.Long) 1L);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM keyAndPasswordVM0 = new com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM();
        keyAndPasswordVM0.setNewPassword("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        keyAndPasswordVM0.setKey("Authority{name='null'}");
        java.lang.String str5 = keyAndPasswordVM0.getNewPassword();
        keyAndPasswordVM0.setKey("ManagedUserVM{} UserDTO{login='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.lang.String str8 = keyAndPasswordVM0.getKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str5, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ManagedUserVM{} UserDTO{login='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str8, "ManagedUserVM{} UserDTO{login='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        java.lang.String str5 = professor0.toString();
        com.unifacisa.tcc.domain.Aluno aluno6 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor7 = null;
        aluno6.setProfessor(professor7);
        aluno6.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Professor professor11 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor13 = professor11.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa15 = professor11.email("");
        com.unifacisa.tcc.domain.Professor professor17 = professor11.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno18 = aluno6.professor(professor17);
        com.unifacisa.tcc.domain.Aluno aluno20 = aluno18.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor21 = professor0.addAluno(aluno18);
        com.unifacisa.tcc.domain.Professor professor22 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor24 = professor22.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor25 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor27 = null;
        aluno26.setProfessor(professor27);
        aluno26.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno31 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor33 = null;
        aluno32.setProfessor(professor33);
        java.lang.Long long35 = aluno32.getMatricula();
        java.lang.String str36 = aluno32.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno37 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean39 = aluno37.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno40 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor41 = null;
        aluno40.setProfessor(professor41);
        aluno40.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean47 = aluno45.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno48 = new com.unifacisa.tcc.domain.Aluno();
        aluno48.setPrimeiroNome("");
        java.lang.Long long51 = aluno48.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        aluno52.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray55 = new com.unifacisa.tcc.domain.Aluno[] { aluno26, aluno31, aluno32, aluno37, aluno40, aluno45, aluno48, aluno52 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet56 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet56, alunoArray55);
        professor25.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet56);
        com.unifacisa.tcc.domain.Professor professor59 = professor24.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet56);
        com.unifacisa.tcc.domain.Professor professor61 = professor59.diponibilidade((java.lang.Boolean) true);
        professor59.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno64 = aluno18.professor(professor59);
        java.lang.Long long65 = professor59.getId();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}" + "'", str5, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertNotNull(professor13);
        org.junit.Assert.assertNotNull(pessoa15);
        org.junit.Assert.assertNotNull(professor17);
        org.junit.Assert.assertNotNull(aluno18);
        org.junit.Assert.assertNotNull(aluno20);
        org.junit.Assert.assertNotNull(professor21);
        org.junit.Assert.assertNotNull(professor24);
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(long51);
        org.junit.Assert.assertNotNull(alunoArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(professor59);
        org.junit.Assert.assertNotNull(professor61);
        org.junit.Assert.assertNotNull(aluno64);
        org.junit.Assert.assertNull(long65);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = persistentAuditEvent0.getAuditEventDate();
        java.time.Instant instant2 = null;
        persistentAuditEvent0.setAuditEventDate(instant2);
        java.time.Instant instant4 = persistentAuditEvent0.getAuditEventDate();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        persistentAuditEvent0.setData(strMap5);
        java.lang.Long long7 = persistentAuditEvent0.getId();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user10 = userMapper8.userFromId((java.lang.Long) 100L);
        user10.setResetKey("hi!");
        java.lang.String str13 = user10.getResetKey();
        com.unifacisa.tcc.service.dto.UserDTO userDTO14 = new com.unifacisa.tcc.service.dto.UserDTO(user10);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper15 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user17 = userMapper15.userFromId((java.lang.Long) 100L);
        user17.setResetKey("hi!");
        java.lang.String str20 = user17.getResetKey();
        boolean boolean22 = user17.equals((java.lang.Object) 10.0f);
        java.lang.String str23 = user17.getCreatedBy();
        com.unifacisa.tcc.domain.User user24 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper25 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user27 = userMapper25.userFromId((java.lang.Long) 100L);
        user27.setLangKey("");
        java.time.Instant instant30 = user27.getResetDate();
        java.time.Instant instant31 = user27.getCreatedDate();
        user24.setCreatedDate(instant31);
        boolean boolean33 = user24.getActivated();
        com.unifacisa.tcc.domain.User user43 = new com.unifacisa.tcc.domain.User();
        user43.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user43.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        java.time.Instant instant48 = user43.getLastModifiedDate();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper50 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user52 = userMapper50.userFromId((java.lang.Long) 100L);
        user52.setLangKey("");
        java.time.Instant instant55 = user52.getResetDate();
        java.time.Instant instant56 = user52.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        aluno57.setPrimeiroNome("");
        java.lang.String str60 = aluno57.getPrimeiroNome();
        java.lang.Long long61 = aluno57.getMatricula();
        boolean boolean62 = user52.equals((java.lang.Object) aluno57);
        user52.setFirstName("");
        com.unifacisa.tcc.domain.User user65 = new com.unifacisa.tcc.domain.User();
        user65.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user65.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper70 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user72 = userMapper70.userFromId((java.lang.Long) 100L);
        user72.setLangKey("");
        java.time.Instant instant75 = user72.getResetDate();
        java.time.Instant instant76 = user72.getCreatedDate();
        user65.setResetDate(instant76);
        user52.setCreatedDate(instant76);
        java.util.Set<java.lang.String> strSet79 = null;
        com.unifacisa.tcc.service.dto.UserDTO userDTO80 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}", "error.concurrencyFailure", "LoginVM{username='null', rememberMe=false}", true, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant48, "", instant76, strSet79);
        user24.setLastModifiedDate(instant48);
        user17.setResetDate(instant48);
        user10.setLastModifiedDate(instant48);
        persistentAuditEvent0.setAuditEventDate(instant48);
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNull(instant30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertNull(instant55);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNull(instant75);
        org.junit.Assert.assertNotNull(instant76);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str5 = professor2.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor6 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor8 = professor6.diponibilidade((java.lang.Boolean) true);
        professor8.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        aluno11.setPrimeiroNome("");
        java.lang.Long long14 = aluno11.getMatricula();
        aluno11.setHabilitadoTcc((java.lang.Boolean) false);
        aluno11.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        aluno19.setPrimeiroNome("");
        java.lang.Long long22 = aluno19.getMatricula();
        java.lang.Long long23 = aluno19.getMatricula();
        aluno19.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        aluno26.setPrimeiroNome("");
        java.lang.Long long29 = aluno26.getMatricula();
        java.lang.Long long30 = aluno26.getMatricula();
        aluno26.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray34 = new com.unifacisa.tcc.domain.Aluno[] { aluno11, aluno19, aluno26, aluno33 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet35 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet35, alunoArray34);
        com.unifacisa.tcc.domain.Professor professor37 = professor8.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Professor professor38 = professor2.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        aluno39.setPrimeiroNome("");
        java.lang.Long long42 = aluno39.getMatricula();
        java.lang.Long long43 = aluno39.getMatricula();
        aluno39.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa47 = aluno39.email("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        com.unifacisa.tcc.domain.Aluno aluno49 = aluno39.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno50 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor51 = null;
        aluno50.setProfessor(professor51);
        aluno50.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa56 = aluno50.primeiroNome("hi!");
        java.lang.Long long57 = aluno50.getId();
        com.unifacisa.tcc.domain.Aluno aluno59 = aluno50.habilitadoTcc((java.lang.Boolean) false);
        aluno50.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor62 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str63 = professor62.toString();
        com.unifacisa.tcc.domain.Professor professor65 = professor62.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet66 = professor62.getAlunos();
        java.lang.Long long67 = professor62.getNumeroContato();
        professor62.setMatricula((java.lang.Long) (-1L));
        aluno50.setProfessor(professor62);
        com.unifacisa.tcc.domain.Aluno aluno71 = aluno49.professor(professor62);
        com.unifacisa.tcc.domain.Professor professor72 = professor2.addAluno(aluno49);
        java.lang.String str73 = professor2.getEmail();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNotNull(alunoArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNotNull(professor38);
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertNull(long43);
        org.junit.Assert.assertNotNull(pessoa47);
        org.junit.Assert.assertNotNull(aluno49);
        org.junit.Assert.assertNotNull(pessoa56);
        org.junit.Assert.assertNull(long57);
        org.junit.Assert.assertNotNull(aluno59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str63, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor65);
        org.junit.Assert.assertNotNull(alunoSet66);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNotNull(aluno71);
        org.junit.Assert.assertNotNull(professor72);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        managedUserVM0.setLogin("User{login='null', firstName='error.validation', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str4 = managedUserVM0.getLastName();
        managedUserVM0.setLogin("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=2021-03-26T03:34:08.443Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:08.443Z, authorities=[]}");
        java.lang.String str7 = managedUserVM0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.unifacisa.tcc.repository.AlunoRepository alunoRepository0 = null;
        com.unifacisa.tcc.web.rest.AlunoResource alunoResource1 = new com.unifacisa.tcc.web.rest.AlunoResource(alunoRepository0);
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        aluno2.setPrimeiroNome("");
        aluno2.setId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor7 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor9 = professor7.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa11 = professor7.email("");
        com.unifacisa.tcc.domain.Professor professor13 = professor7.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno14 = aluno2.professor(professor7);
        aluno2.setHabilitadoTcc((java.lang.Boolean) false);
        java.lang.String str17 = aluno2.toString();
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity18 = alunoResource1.createAluno(aluno2);
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        aluno19.setPrimeiroNome("");
        aluno19.setId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor24 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor26 = professor24.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa28 = professor24.email("");
        com.unifacisa.tcc.domain.Professor professor30 = professor24.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno31 = aluno19.professor(professor24);
        com.unifacisa.tcc.domain.Professor professor32 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor34 = professor32.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor35 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno36 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor37 = null;
        aluno36.setProfessor(professor37);
        aluno36.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno41 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor43 = null;
        aluno42.setProfessor(professor43);
        java.lang.Long long45 = aluno42.getMatricula();
        java.lang.String str46 = aluno42.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean49 = aluno47.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno50 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor51 = null;
        aluno50.setProfessor(professor51);
        aluno50.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean57 = aluno55.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno58 = new com.unifacisa.tcc.domain.Aluno();
        aluno58.setPrimeiroNome("");
        java.lang.Long long61 = aluno58.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno62 = new com.unifacisa.tcc.domain.Aluno();
        aluno62.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray65 = new com.unifacisa.tcc.domain.Aluno[] { aluno36, aluno41, aluno42, aluno47, aluno50, aluno55, aluno58, aluno62 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet66 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet66, alunoArray65);
        professor35.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet66);
        com.unifacisa.tcc.domain.Professor professor69 = professor34.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet66);
        aluno19.setProfessor(professor34);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Aluno> alunoResponseEntity71 = alunoResource1.createAluno(aluno19);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity73 = alunoResource1.deleteAluno((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor9);
        org.junit.Assert.assertNotNull(pessoa11);
        org.junit.Assert.assertNotNull(professor13);
        org.junit.Assert.assertNotNull(aluno14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Aluno{id=1, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}" + "'", str17, "Aluno{id=1, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}");
        org.junit.Assert.assertNotNull(alunoResponseEntity18);
        org.junit.Assert.assertNotNull(professor26);
        org.junit.Assert.assertNotNull(pessoa28);
        org.junit.Assert.assertNotNull(professor30);
        org.junit.Assert.assertNotNull(aluno31);
        org.junit.Assert.assertNotNull(professor34);
        org.junit.Assert.assertNull(long45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertNotNull(alunoArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(professor69);
        org.junit.Assert.assertNotNull(alunoResponseEntity71);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str9 = socialUserConnection0.getImageURL();
        java.lang.String str10 = socialUserConnection0.getImageURL();
        java.lang.String str11 = socialUserConnection0.getImageURL();
        socialUserConnection0.setProviderId("LoginVM{username='SocialUserConnection{id=null, userId=ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=null, displayName='null', profileURL='null', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=100}', rememberMe=false}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM keyAndPasswordVM0 = new com.unifacisa.tcc.web.rest.vm.KeyAndPasswordVM();
        keyAndPasswordVM0.setKey("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        keyAndPasswordVM0.setNewPassword("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        keyAndPasswordVM0.setKey("");
        keyAndPasswordVM0.setNewPassword("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        java.lang.String str9 = keyAndPasswordVM0.getNewPassword();
        keyAndPasswordVM0.setNewPassword("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        java.lang.String str12 = keyAndPasswordVM0.getNewPassword();
        java.lang.String str13 = keyAndPasswordVM0.getKey();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}" + "'", str9, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}" + "'", str12, "User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = aluno0.primeiroNome("hi!");
        java.lang.Long long7 = aluno0.getId();
        com.unifacisa.tcc.domain.Aluno aluno9 = aluno0.habilitadoTcc((java.lang.Boolean) false);
        java.lang.Long long10 = aluno9.getId();
        com.unifacisa.tcc.domain.Professor professor11 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor13 = professor11.diponibilidade((java.lang.Boolean) true);
        professor13.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.domain.Aluno aluno16 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor17 = null;
        aluno16.setProfessor(professor17);
        aluno16.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa22 = aluno16.primeiroNome("hi!");
        java.lang.Long long23 = aluno16.getId();
        com.unifacisa.tcc.domain.Aluno aluno25 = aluno16.habilitadoTcc((java.lang.Boolean) false);
        aluno16.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor28 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str29 = professor28.toString();
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor31 = null;
        aluno30.setProfessor(professor31);
        java.lang.Long long33 = aluno30.getMatricula();
        java.lang.String str34 = aluno30.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean37 = aluno35.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor38 = aluno35.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean41 = aluno39.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno42 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno43 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor44 = null;
        aluno43.setProfessor(professor44);
        java.lang.Long long46 = aluno43.getMatricula();
        java.lang.String str47 = aluno43.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno48 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean50 = aluno48.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor51 = aluno48.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno52 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor53 = null;
        aluno52.setProfessor(professor53);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        aluno55.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno58 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor59 = null;
        aluno58.setProfessor(professor59);
        aluno58.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno63 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor64 = null;
        aluno63.setProfessor(professor64);
        java.lang.Long long66 = aluno63.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno68 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean70 = aluno68.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno71 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor72 = null;
        aluno71.setProfessor(professor72);
        com.unifacisa.tcc.domain.Aluno[] alunoArray74 = new com.unifacisa.tcc.domain.Aluno[] { aluno30, aluno35, aluno39, aluno42, aluno43, aluno48, aluno52, aluno55, aluno58, aluno63, aluno67, aluno68, aluno71 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet75 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet75, alunoArray74);
        com.unifacisa.tcc.domain.Professor professor77 = professor28.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet75);
        com.unifacisa.tcc.domain.Aluno aluno78 = aluno16.professor(professor28);
        com.unifacisa.tcc.domain.Aluno aluno80 = aluno78.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor81 = aluno80.getProfessor();
        com.unifacisa.tcc.domain.Professor professor82 = professor13.removeAluno(aluno80);
        com.unifacisa.tcc.domain.Aluno aluno83 = aluno9.professor(professor13);
        com.unifacisa.tcc.domain.Professor professor84 = aluno9.getProfessor();
        com.unifacisa.tcc.domain.Professor professor86 = professor84.diponibilidade((java.lang.Boolean) false);
        java.lang.String str87 = professor84.toString();
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNotNull(aluno9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNotNull(professor13);
        org.junit.Assert.assertNotNull(pessoa22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNotNull(aluno25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str29, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(professor38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(long46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(professor51);
        org.junit.Assert.assertNull(long66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(alunoArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(professor77);
        org.junit.Assert.assertNotNull(aluno78);
        org.junit.Assert.assertNotNull(aluno80);
        org.junit.Assert.assertNotNull(professor81);
        org.junit.Assert.assertNotNull(professor82);
        org.junit.Assert.assertNotNull(aluno83);
        org.junit.Assert.assertNotNull(professor84);
        org.junit.Assert.assertNotNull(professor86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='false'}" + "'", str87, "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='false'}");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.unifacisa.tcc.web.rest.errors.FieldErrorVM fieldErrorVM3 = new com.unifacisa.tcc.web.rest.errors.FieldErrorVM("Authority{name='Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', refreshToken='null', expireTime=null}", "Aluno{id=null, primeiroNome='hi!', segundoNome='Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str4 = fieldErrorVM3.getObjectName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authority{name='Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}'}" + "'", str4, "Authority{name='Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}'}");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository0 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource1 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository0);
        com.unifacisa.tcc.domain.Professor professor2 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor4 = professor2.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("");
        com.unifacisa.tcc.domain.Professor professor8 = professor2.diponibilidade((java.lang.Boolean) true);
        professor8.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity11 = professorResource1.createProfessor(professor8);
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor14 = professor12.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa16 = professor12.email("");
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        aluno17.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Professor professor20 = professor12.addAluno(aluno17);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity21 = professorResource1.createProfessor(professor20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(professor4);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professorResponseEntity11);
        org.junit.Assert.assertNotNull(professor14);
        org.junit.Assert.assertNotNull(pessoa16);
        org.junit.Assert.assertNotNull(professor20);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.String str6 = socialUserConnection0.getProviderUserId();
        java.lang.String str7 = socialUserConnection0.getSecret();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str1 = professor0.toString();
        com.unifacisa.tcc.domain.Aluno aluno2 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor3 = null;
        aluno2.setProfessor(professor3);
        java.lang.Long long5 = aluno2.getMatricula();
        java.lang.String str6 = aluno2.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno7 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean9 = aluno7.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor10 = aluno7.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean13 = aluno11.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor16 = null;
        aluno15.setProfessor(professor16);
        java.lang.Long long18 = aluno15.getMatricula();
        java.lang.String str19 = aluno15.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean22 = aluno20.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor23 = aluno20.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor25 = null;
        aluno24.setProfessor(professor25);
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        aluno27.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno30 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor31 = null;
        aluno30.setProfessor(professor31);
        aluno30.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor36 = null;
        aluno35.setProfessor(professor36);
        java.lang.Long long38 = aluno35.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno40 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean42 = aluno40.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno43 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor44 = null;
        aluno43.setProfessor(professor44);
        com.unifacisa.tcc.domain.Aluno[] alunoArray46 = new com.unifacisa.tcc.domain.Aluno[] { aluno2, aluno7, aluno11, aluno14, aluno15, aluno20, aluno24, aluno27, aluno30, aluno35, aluno39, aluno40, aluno43 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet47 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet47, alunoArray46);
        com.unifacisa.tcc.domain.Professor professor49 = professor0.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet47);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa51 = professor49.segundoNome("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str1, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(professor10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(professor23);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(alunoArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(professor49);
        org.junit.Assert.assertNotNull(pessoa51);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper5 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray6 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList7 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList7, userArray6);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList9 = userMapper5.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList7);
        com.unifacisa.tcc.domain.User user11 = new com.unifacisa.tcc.domain.User();
        user11.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM14 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet15 = managedUserVM14.getAuthorities();
        boolean boolean16 = user11.equals((java.lang.Object) strSet15);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper17 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray18 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList19 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList19, userArray18);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList21 = userMapper17.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList19);
        java.time.Instant instant32 = null;
        java.time.Instant instant34 = null;
        java.time.Instant instant44 = null;
        java.time.Instant instant46 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        com.unifacisa.tcc.service.dto.UserDTO userDTO52 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant44, "hi!", instant46, (java.util.Set<java.lang.String>) strSet50);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM53 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant32, "", instant34, (java.util.Set<java.lang.String>) strSet50);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet54 = userMapper17.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet50);
        user11.setAuthorities(authoritySet54);
        java.lang.String str56 = user11.getFirstName();
        user11.setId((java.lang.Long) 10L);
        com.unifacisa.tcc.service.dto.UserDTO userDTO59 = userMapper0.userToUserDTO(user11);
        com.unifacisa.tcc.domain.User user61 = userMapper0.userFromId((java.lang.Long) 0L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper62 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user64 = userMapper62.userFromId((java.lang.Long) 10L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper65 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray66 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList67 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList67, userArray66);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList69 = userMapper65.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList67);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper70 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray71 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList72 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList72, userArray71);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList74 = userMapper70.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList72);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList75 = userMapper65.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList72);
        java.util.List<com.unifacisa.tcc.domain.User> userList76 = userMapper62.userDTOsToUsers(userDTOList75);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList77 = userMapper0.usersToUserDTOs(userList76);
        com.unifacisa.tcc.domain.User user79 = userMapper0.userFromId((java.lang.Long) 0L);
        user79.setActivated(true);
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(userArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDTOList9);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userDTOList21);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(authoritySet54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(userDTO59);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(userArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(userDTOList69);
        org.junit.Assert.assertNotNull(userArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(userDTOList74);
        org.junit.Assert.assertNotNull(userDTOList75);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(userDTOList77);
        org.junit.Assert.assertNotNull(user79);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        socialUserConnection0.setDisplayName("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setRefreshToken("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setProviderUserId("");
        java.lang.String str11 = socialUserConnection0.toString();
        socialUserConnection0.setProfileURL("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
        java.lang.String str14 = socialUserConnection0.getAccessToken();
        socialUserConnection0.setProfileURL("LoginVM{username='LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}', rememberMe=true}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}" + "'", str11, "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setImageURL("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("");
        socialUserConnection0.setProfileURL("Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}");
        socialUserConnection0.setAccessToken("Authority{name='null'}");
        socialUserConnection0.setSecret("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:50.246Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:50.246Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa6 = professor2.email("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.Long long7 = professor2.getId();
        java.lang.String str8 = professor2.toString();
        java.lang.String str9 = professor2.toString();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', numeroContato='null', diponibilidade='true'}" + "'", str8, "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', numeroContato='null', diponibilidade='true'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', numeroContato='null', diponibilidade='true'}" + "'", str9, "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', numeroContato='null', diponibilidade='true'}");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        socialUserConnection0.setProviderUserId("LoginVM{username='null', rememberMe=false}");
        socialUserConnection0.setUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        socialUserConnection0.setUserId("error.concurrencyFailure");
        socialUserConnection0.setAccessToken("LoggerVM{name='null', level='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}'}");
        java.lang.String str14 = socialUserConnection0.getAccessToken();
        java.lang.Long long15 = socialUserConnection0.getExpireTime();
        java.lang.Long long16 = socialUserConnection0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LoggerVM{name='null', level='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}'}" + "'", str14, "LoggerVM{name='null', level='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}'}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.User user3 = new com.unifacisa.tcc.domain.User();
        user3.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user3.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper8 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user10 = userMapper8.userFromId((java.lang.Long) 100L);
        user10.setLangKey("");
        java.time.Instant instant13 = user10.getResetDate();
        java.time.Instant instant14 = user10.getCreatedDate();
        user3.setResetDate(instant14);
        boolean boolean16 = user3.getActivated();
        user3.setLangKey("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.time.Instant instant19 = user3.getCreatedDate();
        user2.setCreatedDate(instant19);
        user2.setId((java.lang.Long) 10L);
        user2.setLangKey("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        user2.setLangKey("User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
        java.lang.String str27 = user2.toString();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}', activationKey='null'}" + "'", str27, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='User{login='null', firstName='', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}', activationKey='null'}");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        java.lang.Long long38 = professor37.getMatricula();
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet39 = professor37.getAlunos();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa41 = professor37.segundoNome("hi!");
        java.lang.String str42 = professor37.getPrimeiroNome();
        java.lang.String str43 = professor37.getPrimeiroNome();
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
        com.unifacisa.tcc.domain.Professor professor83 = professor81.diponibilidade((java.lang.Boolean) true);
        professor81.setDiponibilidade((java.lang.Boolean) false);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet86 = professor81.getAlunos();
        com.unifacisa.tcc.domain.Professor professor87 = professor37.alunos(alunoSet86);
        professor37.setMatricula((java.lang.Long) 0L);
        java.lang.String str90 = professor37.getSegundoNome();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNotNull(alunoArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNotNull(alunoSet39);
        org.junit.Assert.assertNotNull(pessoa41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(professor46);
        org.junit.Assert.assertNull(long57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(long73);
        org.junit.Assert.assertNotNull(alunoArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(professor81);
        org.junit.Assert.assertNotNull(professor83);
        org.junit.Assert.assertNotNull(alunoSet86);
        org.junit.Assert.assertNotNull(professor87);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.unifacisa.tcc.domain.Authority authority0 = new com.unifacisa.tcc.domain.Authority();
        authority0.setName("Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}");
        java.lang.String str3 = authority0.getName();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM4 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM4.setLevel("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        boolean boolean7 = authority0.equals((java.lang.Object) "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        authority0.setName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper10 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray11 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList12 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList12, userArray11);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList14 = userMapper10.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList12);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper15 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray16 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList17 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList17, userArray16);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList19 = userMapper15.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList17);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList20 = userMapper10.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList17);
        com.unifacisa.tcc.domain.User user21 = new com.unifacisa.tcc.domain.User();
        user21.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM24 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet25 = managedUserVM24.getAuthorities();
        boolean boolean26 = user21.equals((java.lang.Object) strSet25);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper27 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray28 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList29 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList29, userArray28);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList31 = userMapper27.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList29);
        java.time.Instant instant42 = null;
        java.time.Instant instant44 = null;
        java.time.Instant instant54 = null;
        java.time.Instant instant56 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        com.unifacisa.tcc.service.dto.UserDTO userDTO62 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant54, "hi!", instant56, (java.util.Set<java.lang.String>) strSet60);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM63 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant42, "", instant44, (java.util.Set<java.lang.String>) strSet60);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet64 = userMapper27.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet60);
        user21.setAuthorities(authoritySet64);
        java.lang.String str66 = user21.getFirstName();
        user21.setId((java.lang.Long) 10L);
        com.unifacisa.tcc.service.dto.UserDTO userDTO69 = userMapper10.userToUserDTO(user21);
        com.unifacisa.tcc.domain.User user70 = new com.unifacisa.tcc.domain.User();
        user70.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user70.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper75 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user77 = userMapper75.userFromId((java.lang.Long) 100L);
        user77.setLangKey("");
        java.time.Instant instant80 = user77.getResetDate();
        java.time.Instant instant81 = user77.getCreatedDate();
        user70.setResetDate(instant81);
        java.time.Instant instant83 = null;
        user70.setCreatedDate(instant83);
        java.lang.String str85 = user70.getLastModifiedBy();
        com.unifacisa.tcc.domain.User user86 = new com.unifacisa.tcc.domain.User();
        java.lang.String str87 = user86.toString();
        boolean boolean88 = user70.equals((java.lang.Object) user86);
        java.lang.String str89 = user86.getCreatedBy();
        com.unifacisa.tcc.service.dto.UserDTO userDTO90 = userMapper10.userToUserDTO(user86);
        java.lang.String str91 = user86.getResetKey();
        boolean boolean92 = authority0.equals((java.lang.Object) user86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}" + "'", str3, "Authority{name='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}'}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userDTOList14);
        org.junit.Assert.assertNotNull(userArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userDTOList19);
        org.junit.Assert.assertNotNull(userDTOList20);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userDTOList31);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(authoritySet64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(userDTO69);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNull(instant80);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str87, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(userDTO90);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Professor professor6 = professor0.diponibilidade((java.lang.Boolean) true);
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
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa40 = professor9.matricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor41 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor43 = professor41.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor44 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor46 = null;
        aluno45.setProfessor(professor46);
        aluno45.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno50 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno51 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor52 = null;
        aluno51.setProfessor(professor52);
        java.lang.Long long54 = aluno51.getMatricula();
        java.lang.String str55 = aluno51.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno56 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean58 = aluno56.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno59 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor60 = null;
        aluno59.setProfessor(professor60);
        aluno59.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno64 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean66 = aluno64.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno67 = new com.unifacisa.tcc.domain.Aluno();
        aluno67.setPrimeiroNome("");
        java.lang.Long long70 = aluno67.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno71 = new com.unifacisa.tcc.domain.Aluno();
        aluno71.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray74 = new com.unifacisa.tcc.domain.Aluno[] { aluno45, aluno50, aluno51, aluno56, aluno59, aluno64, aluno67, aluno71 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet75 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet75, alunoArray74);
        professor44.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet75);
        com.unifacisa.tcc.domain.Professor professor78 = professor43.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet75);
        com.unifacisa.tcc.domain.Professor professor79 = professor9.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet75);
        com.unifacisa.tcc.domain.Professor professor80 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str81 = professor80.toString();
        com.unifacisa.tcc.domain.Professor professor83 = professor80.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet84 = professor80.getAlunos();
        professor9.setAlunos(alunoSet84);
        com.unifacisa.tcc.domain.Professor professor86 = professor0.alunos(alunoSet84);
        java.lang.Boolean boolean87 = professor0.isDiponibilidade();
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor6);
        org.junit.Assert.assertNotNull(professor9);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNotNull(alunoArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(professor38);
        org.junit.Assert.assertNotNull(pessoa40);
        org.junit.Assert.assertNotNull(professor43);
        org.junit.Assert.assertNull(long54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(long70);
        org.junit.Assert.assertNotNull(alunoArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(professor78);
        org.junit.Assert.assertNotNull(professor79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str81, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor83);
        org.junit.Assert.assertNotNull(alunoSet84);
        org.junit.Assert.assertNotNull(professor86);
        org.junit.Assert.assertEquals("'" + boolean87 + "' != '" + true + "'", boolean87, true);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 10L);
        user2.setResetKey("LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}");
        user2.setImageUrl("LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}");
        user2.setActivated(true);
        user2.setResetKey("LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='LoggerVM{name='null', level='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}'}'}");
        org.junit.Assert.assertNotNull(user2);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.lang.String str1 = managedUserVM0.toString();
        java.time.Instant instant2 = managedUserVM0.getLastModifiedDate();
        managedUserVM0.setId((java.lang.Long) (-1L));
        java.time.Instant instant5 = managedUserVM0.getLastModifiedDate();
        java.lang.String str6 = managedUserVM0.getCreatedBy();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str1, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user0.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper5 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user7 = userMapper5.userFromId((java.lang.Long) 100L);
        user7.setLangKey("");
        java.time.Instant instant10 = user7.getResetDate();
        java.time.Instant instant11 = user7.getCreatedDate();
        user0.setResetDate(instant11);
        java.time.Instant instant13 = null;
        user0.setCreatedDate(instant13);
        java.lang.String str15 = user0.getLastModifiedBy();
        com.unifacisa.tcc.domain.User user16 = new com.unifacisa.tcc.domain.User();
        java.lang.String str17 = user16.toString();
        boolean boolean18 = user0.equals((java.lang.Object) user16);
        com.unifacisa.tcc.domain.User user19 = new com.unifacisa.tcc.domain.User();
        user19.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM22 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet23 = managedUserVM22.getAuthorities();
        boolean boolean24 = user19.equals((java.lang.Object) strSet23);
        java.time.Instant instant25 = user19.getLastModifiedDate();
        user16.setLastModifiedDate(instant25);
        com.unifacisa.tcc.service.dto.UserDTO userDTO27 = new com.unifacisa.tcc.service.dto.UserDTO(user16);
        user16.setImageUrl("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}");
        java.lang.String str30 = user16.getActivationKey();
        user16.setActivated(true);
        java.lang.Object obj33 = null;
        boolean boolean34 = user16.equals(obj33);
        java.lang.String str35 = user16.getActivationKey();
        user16.setEmail("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=true}");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(instant10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}" + "'", str17, "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:35:16.174Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:35:16.174Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", "Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='0', diponibilidade='true'}", "LoginVM{username='LoginVM{username='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', rememberMe=null}', rememberMe=true}", (java.lang.Long) (-1L), "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=, createdDate=2021-03-26T03:34:34.902Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:34.902Z, authorities=[]}", "Professor{id=null, primeiroNome='null', segundoNome='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='true'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", "User{login='null', firstName='LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "LoggerVM{name='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}', level='null'}", "UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:34.552Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:34.552Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}", (java.lang.Long) 10L);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.lang.String str20 = loggerVM13.toString();
        java.lang.String str21 = loggerVM13.getLevel();
        loggerVM13.setName("");
        loggerVM13.setName("LoginVM{username='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', rememberMe=null}");
        java.lang.String str26 = loggerVM13.getLevel();
        org.junit.Assert.assertNotNull(loggerVMList5);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}" + "'", str20, "LoggerVM{name='Authority{name='error.concurrencyFailure'}', level='null'}");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        com.unifacisa.tcc.service.dto.UserDTO userDTO36 = new com.unifacisa.tcc.service.dto.UserDTO(user2);
        user2.setImageUrl("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', numeroContato='null', habilitadoTcc='null'}");
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
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        aluno0.setPrimeiroNome("");
        java.lang.Long long3 = aluno0.getMatricula();
        aluno0.setHabilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa7 = aluno0.primeiroNome("");
        java.lang.Boolean boolean8 = aluno0.isHabilitadoTcc();
        com.unifacisa.tcc.domain.Professor professor9 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor11 = professor9.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno13 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor14 = null;
        aluno13.setProfessor(professor14);
        aluno13.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno18 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor20 = null;
        aluno19.setProfessor(professor20);
        java.lang.Long long22 = aluno19.getMatricula();
        java.lang.String str23 = aluno19.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno24 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean26 = aluno24.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno27 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor28 = null;
        aluno27.setProfessor(professor28);
        aluno27.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean34 = aluno32.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        aluno35.setPrimeiroNome("");
        java.lang.Long long38 = aluno35.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        aluno39.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray42 = new com.unifacisa.tcc.domain.Aluno[] { aluno13, aluno18, aluno19, aluno24, aluno27, aluno32, aluno35, aluno39 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet43 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet43, alunoArray42);
        professor12.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet43);
        com.unifacisa.tcc.domain.Professor professor46 = professor11.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet43);
        java.lang.Long long47 = professor46.getMatricula();
        java.lang.Long long48 = professor46.getMatricula();
        professor46.setEmail("Aluno{id=0, primeiroNome='error.validation', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        java.lang.String str51 = professor46.getPrimeiroNome();
        com.unifacisa.tcc.domain.Aluno aluno52 = aluno0.professor(professor46);
        com.unifacisa.tcc.domain.Professor professor53 = aluno0.getProfessor();
        java.lang.Boolean boolean54 = aluno0.isHabilitadoTcc();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNotNull(pessoa7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNotNull(professor11);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNotNull(alunoArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(professor46);
        org.junit.Assert.assertNull(long47);
        org.junit.Assert.assertNull(long48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(aluno52);
        org.junit.Assert.assertNotNull(professor53);
        org.junit.Assert.assertEquals("'" + boolean54 + "' != '" + false + "'", boolean54, false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str6 = socialUserConnection0.getImageURL();
        java.lang.String str7 = socialUserConnection0.getAccessToken();
        socialUserConnection0.setDisplayName("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        java.lang.String str16 = user0.getPassword();
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent17 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant18 = persistentAuditEvent17.getAuditEventDate();
        java.time.Instant instant19 = null;
        persistentAuditEvent17.setAuditEventDate(instant19);
        persistentAuditEvent17.setId((java.lang.Long) 1L);
        persistentAuditEvent17.setId((java.lang.Long) 100L);
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent25 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        persistentAuditEvent25.setData(strMap26);
        persistentAuditEvent25.setAuditEventType("hi!");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent30 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant31 = null;
        persistentAuditEvent30.setAuditEventDate(instant31);
        com.unifacisa.tcc.domain.User user33 = new com.unifacisa.tcc.domain.User();
        user33.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        user33.setLastName("ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper38 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user40 = userMapper38.userFromId((java.lang.Long) 100L);
        user40.setLangKey("");
        java.time.Instant instant43 = user40.getResetDate();
        java.time.Instant instant44 = user40.getCreatedDate();
        user33.setResetDate(instant44);
        persistentAuditEvent30.setAuditEventDate(instant44);
        persistentAuditEvent25.setAuditEventDate(instant44);
        persistentAuditEvent17.setAuditEventDate(instant44);
        com.unifacisa.tcc.domain.User user49 = new com.unifacisa.tcc.domain.User();
        user49.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM52 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet53 = managedUserVM52.getAuthorities();
        boolean boolean54 = user49.equals((java.lang.Object) strSet53);
        java.time.Instant instant55 = user49.getLastModifiedDate();
        persistentAuditEvent17.setAuditEventDate(instant55);
        user0.setCreatedDate(instant55);
        java.lang.String str58 = user0.getPassword();
        java.lang.String str59 = user0.getLogin();
        java.lang.String str60 = user0.getEmail();
        user0.setLastName("LoggerVM{name='', level='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}'}");
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNull(instant10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNull(instant43);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        java.lang.Long long1 = aluno0.getId();
        com.unifacisa.tcc.domain.Aluno aluno3 = aluno0.habilitadoTcc((java.lang.Boolean) true);
        java.lang.String str4 = aluno0.getEmail();
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str6 = professor5.toString();
        com.unifacisa.tcc.domain.Professor professor8 = professor5.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet9 = professor5.getAlunos();
        com.unifacisa.tcc.domain.Aluno aluno10 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor11 = null;
        aluno10.setProfessor(professor11);
        java.lang.Long long13 = aluno10.getMatricula();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa15 = aluno10.numeroContato((java.lang.Long) 1L);
        java.lang.Boolean boolean16 = aluno10.isHabilitadoTcc();
        java.lang.String str17 = aluno10.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor18 = professor5.removeAluno(aluno10);
        aluno0.setProfessor(professor5);
        java.lang.String str20 = aluno0.toString();
        com.unifacisa.tcc.domain.Aluno aluno21 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor22 = null;
        aluno21.setProfessor(professor22);
        aluno21.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa27 = aluno21.primeiroNome("hi!");
        java.lang.Long long28 = aluno21.getId();
        com.unifacisa.tcc.domain.Aluno aluno30 = aluno21.habilitadoTcc((java.lang.Boolean) false);
        aluno21.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor33 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str34 = professor33.toString();
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor36 = null;
        aluno35.setProfessor(professor36);
        java.lang.Long long38 = aluno35.getMatricula();
        java.lang.String str39 = aluno35.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno40 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean42 = aluno40.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor43 = aluno40.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno44 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean46 = aluno44.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno47 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno48 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor49 = null;
        aluno48.setProfessor(professor49);
        java.lang.Long long51 = aluno48.getMatricula();
        java.lang.String str52 = aluno48.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean55 = aluno53.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Professor professor56 = aluno53.getProfessor();
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor58 = null;
        aluno57.setProfessor(professor58);
        com.unifacisa.tcc.domain.Aluno aluno60 = new com.unifacisa.tcc.domain.Aluno();
        aluno60.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno aluno63 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor64 = null;
        aluno63.setProfessor(professor64);
        aluno63.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno68 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor69 = null;
        aluno68.setProfessor(professor69);
        java.lang.Long long71 = aluno68.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno72 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno73 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean75 = aluno73.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno76 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor77 = null;
        aluno76.setProfessor(professor77);
        com.unifacisa.tcc.domain.Aluno[] alunoArray79 = new com.unifacisa.tcc.domain.Aluno[] { aluno35, aluno40, aluno44, aluno47, aluno48, aluno53, aluno57, aluno60, aluno63, aluno68, aluno72, aluno73, aluno76 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet80 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet80, alunoArray79);
        com.unifacisa.tcc.domain.Professor professor82 = professor33.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet80);
        com.unifacisa.tcc.domain.Aluno aluno83 = aluno21.professor(professor33);
        com.unifacisa.tcc.domain.Aluno aluno85 = aluno83.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno87 = aluno85.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor88 = aluno87.getProfessor();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa90 = professor88.email("");
        aluno0.setProfessor(professor88);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(aluno3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str6, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(alunoSet9);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNotNull(pessoa15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(professor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}" + "'", str20, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNotNull(pessoa27);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNotNull(aluno30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str34, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(professor43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(long51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(professor56);
        org.junit.Assert.assertNull(long71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(alunoArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(professor82);
        org.junit.Assert.assertNotNull(aluno83);
        org.junit.Assert.assertNotNull(aluno85);
        org.junit.Assert.assertNotNull(aluno87);
        org.junit.Assert.assertNotNull(professor88);
        org.junit.Assert.assertNotNull(pessoa90);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        aluno0.setPrimeiroNome("");
        aluno0.setId((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor7 = professor5.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa9 = professor5.email("");
        com.unifacisa.tcc.domain.Professor professor11 = professor5.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno12 = aluno0.professor(professor5);
        aluno0.setPrimeiroNome("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        org.junit.Assert.assertNotNull(professor7);
        org.junit.Assert.assertNotNull(pessoa9);
        org.junit.Assert.assertNotNull(professor11);
        org.junit.Assert.assertNotNull(aluno12);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper1 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user3 = userMapper1.userFromId((java.lang.Long) 100L);
        user3.setLangKey("");
        java.time.Instant instant6 = user3.getResetDate();
        java.time.Instant instant7 = user3.getCreatedDate();
        user0.setCreatedDate(instant7);
        boolean boolean9 = user0.getActivated();
        boolean boolean10 = user0.getActivated();
        java.lang.String str11 = user0.getLastModifiedBy();
        user0.setActivated(false);
        java.time.Instant instant14 = user0.getCreatedDate();
        user0.setId((java.lang.Long) (-1L));
        java.lang.String str17 = user0.getEmail();
        java.time.Instant instant18 = user0.getCreatedDate();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(instant18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray1 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList2 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList2, userArray1);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList4 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList2);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper5 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray6 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList7 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList7, userArray6);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList9 = userMapper5.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList7);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList10 = userMapper0.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList7);
        com.unifacisa.tcc.domain.User user11 = new com.unifacisa.tcc.domain.User();
        user11.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM14 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet15 = managedUserVM14.getAuthorities();
        boolean boolean16 = user11.equals((java.lang.Object) strSet15);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper17 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User[] userArray18 = new com.unifacisa.tcc.domain.User[] {};
        java.util.ArrayList<com.unifacisa.tcc.domain.User> userList19 = new java.util.ArrayList<com.unifacisa.tcc.domain.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.User>) userList19, userArray18);
        java.util.List<com.unifacisa.tcc.service.dto.UserDTO> userDTOList21 = userMapper17.usersToUserDTOs((java.util.List<com.unifacisa.tcc.domain.User>) userList19);
        java.time.Instant instant32 = null;
        java.time.Instant instant34 = null;
        java.time.Instant instant44 = null;
        java.time.Instant instant46 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        com.unifacisa.tcc.service.dto.UserDTO userDTO52 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant44, "hi!", instant46, (java.util.Set<java.lang.String>) strSet50);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM53 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 1L, "", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", "hi!", false, "hi!", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.validation", instant32, "", instant34, (java.util.Set<java.lang.String>) strSet50);
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet54 = userMapper17.authoritiesFromStrings((java.util.Set<java.lang.String>) strSet50);
        user11.setAuthorities(authoritySet54);
        java.lang.String str56 = user11.getFirstName();
        user11.setId((java.lang.Long) 10L);
        com.unifacisa.tcc.service.dto.UserDTO userDTO59 = userMapper0.userToUserDTO(user11);
        com.unifacisa.tcc.domain.User user61 = userMapper0.userFromId((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.User user63 = userMapper0.userFromId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.User user65 = userMapper0.userFromId((java.lang.Long) 1L);
        java.lang.String str66 = user65.getLangKey();
        java.lang.String str67 = user65.getImageUrl();
        org.junit.Assert.assertNotNull(userArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userDTOList4);
        org.junit.Assert.assertNotNull(userArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userDTOList9);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userDTOList21);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(authoritySet54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(userDTO59);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.String str8 = socialUserConnection0.getProfileURL();
        java.lang.String str9 = socialUserConnection0.getImageURL();
        socialUserConnection0.setProviderUserId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str12 = socialUserConnection0.getDisplayName();
        java.lang.String str13 = socialUserConnection0.getProviderUserId();
        java.lang.String str14 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setExpireTime((java.lang.Long) 1L);
        java.lang.String str17 = socialUserConnection0.getSecret();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "error.validation" + "'", str9, "error.validation");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str13, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection11 = new com.unifacisa.tcc.domain.SocialUserConnection("User{login='null', firstName='LoggerVM{name='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', level='null'}', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', expireTime=null}", "Authority{name='null'}", (java.lang.Long) 1L, "SocialUserConnection{id=-1, userId=null, providerId='null', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}', accessToken='LoggerVM{name='null', level='null'}', secret='null', refreshToken='null', expireTime=null}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='Authority{name='null'}', accessToken='null', secret='null', refreshToken='LoginVM{username='null', rememberMe=null}', expireTime=null}", "SocialUserConnection{id=null, userId=error.concurrencyFailure, providerId='LoggerVM{name='null', level='null'}', providerUserId='LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}', rank=10, displayName='', profileURL='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}', imageURL='LoggerVM{name='null', level='null'}', accessToken='hi!', secret='LoginVM{username='null', rememberMe=false}', refreshToken='LoginVM{username='null', rememberMe=null}', expireTime=10}", "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='false'}", "SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='null', accessToken='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', secret='null', refreshToken='null', expireTime=100}", (java.lang.Long) 10L);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        professor2.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str5 = professor2.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor6 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor8 = professor6.diponibilidade((java.lang.Boolean) true);
        professor8.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno11 = new com.unifacisa.tcc.domain.Aluno();
        aluno11.setPrimeiroNome("");
        java.lang.Long long14 = aluno11.getMatricula();
        aluno11.setHabilitadoTcc((java.lang.Boolean) false);
        aluno11.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno19 = new com.unifacisa.tcc.domain.Aluno();
        aluno19.setPrimeiroNome("");
        java.lang.Long long22 = aluno19.getMatricula();
        java.lang.Long long23 = aluno19.getMatricula();
        aluno19.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno26 = new com.unifacisa.tcc.domain.Aluno();
        aluno26.setPrimeiroNome("");
        java.lang.Long long29 = aluno26.getMatricula();
        java.lang.Long long30 = aluno26.getMatricula();
        aluno26.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno33 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray34 = new com.unifacisa.tcc.domain.Aluno[] { aluno11, aluno19, aluno26, aluno33 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet35 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet35, alunoArray34);
        com.unifacisa.tcc.domain.Professor professor37 = professor8.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Professor professor38 = professor2.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet35);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor40 = null;
        aluno39.setProfessor(professor40);
        aluno39.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor44 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor46 = professor44.diponibilidade((java.lang.Boolean) true);
        professor46.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno49 = new com.unifacisa.tcc.domain.Aluno();
        aluno49.setPrimeiroNome("");
        java.lang.Long long52 = aluno49.getMatricula();
        aluno49.setHabilitadoTcc((java.lang.Boolean) false);
        aluno49.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno57 = new com.unifacisa.tcc.domain.Aluno();
        aluno57.setPrimeiroNome("");
        java.lang.Long long60 = aluno57.getMatricula();
        java.lang.Long long61 = aluno57.getMatricula();
        aluno57.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno64 = new com.unifacisa.tcc.domain.Aluno();
        aluno64.setPrimeiroNome("");
        java.lang.Long long67 = aluno64.getMatricula();
        java.lang.Long long68 = aluno64.getMatricula();
        aluno64.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno71 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray72 = new com.unifacisa.tcc.domain.Aluno[] { aluno49, aluno57, aluno64, aluno71 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet73 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet73, alunoArray72);
        com.unifacisa.tcc.domain.Professor professor75 = professor46.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet73);
        com.unifacisa.tcc.domain.Aluno aluno76 = aluno39.professor(professor75);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa78 = aluno76.segundoNome("");
        com.unifacisa.tcc.domain.Aluno aluno80 = aluno76.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor81 = professor38.removeAluno(aluno76);
        com.unifacisa.tcc.domain.Professor professor83 = professor81.diponibilidade((java.lang.Boolean) true);
        professor81.setPrimeiroNome("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=, createdDate=2021-03-26T03:34:26.101Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:26.101Z, authorities=[]}");
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(long22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNotNull(alunoArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNotNull(professor38);
        org.junit.Assert.assertNotNull(professor46);
        org.junit.Assert.assertNull(long52);
        org.junit.Assert.assertNull(long60);
        org.junit.Assert.assertNull(long61);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNull(long68);
        org.junit.Assert.assertNotNull(alunoArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(professor75);
        org.junit.Assert.assertNotNull(aluno76);
        org.junit.Assert.assertNotNull(pessoa78);
        org.junit.Assert.assertNotNull(aluno80);
        org.junit.Assert.assertNotNull(professor81);
        org.junit.Assert.assertNotNull(professor83);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("error.validation");
        socialUserConnection0.setRank((java.lang.Long) (-1L));
        java.lang.String str8 = socialUserConnection0.getImageURL();
        socialUserConnection0.setExpireTime((java.lang.Long) 0L);
        java.lang.String str11 = socialUserConnection0.getUserId();
        socialUserConnection0.setRefreshToken("ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', firstName='hi!', lastName='hi!', email='', imageUrl='hi!', activated=true, langKey='', createdBy=, createdDate=null, lastModifiedBy='', lastModifiedDate=null, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        socialUserConnection0.setProviderUserId("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='1', habilitadoTcc='null'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error.validation" + "'", str8, "error.validation");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str3 = socialUserConnection0.getProviderId();
        socialUserConnection0.setDisplayName("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str6 = socialUserConnection0.getSecret();
        socialUserConnection0.setRank((java.lang.Long) 100L);
        java.lang.String str9 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("SocialUserConnection{id=null, userId=, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='null', profileURL='Aluno{id=null, primeiroNome='hi!', segundoNome='hi!', matricula='null', email='null', numeroContato='-1', habilitadoTcc='false'}', imageURL='Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str9, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant5 = managedUserVM4.getCreatedDate();
        java.lang.Long long6 = managedUserVM4.getId();
        java.lang.Long long7 = managedUserVM4.getId();
        java.lang.String str8 = managedUserVM4.toString();
        managedUserVM4.setId((java.lang.Long) (-1L));
        java.util.Set<java.lang.String> strSet11 = managedUserVM4.getAuthorities();
        java.lang.String str12 = managedUserVM4.getImageUrl();
        org.springframework.http.ResponseEntity responseEntity13 = userResource3.createUser(managedUserVM4);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM14 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet15 = managedUserVM14.getAuthorities();
        managedUserVM14.setId((java.lang.Long) 1L);
        org.springframework.http.ResponseEntity responseEntity18 = userResource3.createUser(managedUserVM14);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<java.lang.Void> voidResponseEntity20 = userResource3.deleteUser("LoggerVM{name='Professor{id=null, primeiroNome='null', segundoNome='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', matricula='null', email='null', numeroContato='null', diponibilidade='true'}', level='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str8, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(responseEntity13);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(responseEntity18);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        aluno5.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Professor professor8 = professor0.addAluno(aluno5);
        com.unifacisa.tcc.domain.Professor professor10 = professor8.diponibilidade((java.lang.Boolean) true);
        professor8.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno13 = new com.unifacisa.tcc.domain.Aluno();
        aluno13.setPrimeiroNome("");
        java.lang.Long long16 = aluno13.getMatricula();
        java.lang.Long long17 = aluno13.getMatricula();
        aluno13.setMatricula((java.lang.Long) 0L);
        aluno13.setId((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.Professor professor22 = professor8.removeAluno(aluno13);
        java.lang.String str23 = professor8.getPrimeiroNome();
        java.lang.Long long24 = professor8.getId();
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository25 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource26 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository25);
        com.unifacisa.tcc.repository.ProfessorRepository professorRepository27 = null;
        com.unifacisa.tcc.web.rest.ProfessorResource professorResource28 = new com.unifacisa.tcc.web.rest.ProfessorResource(professorRepository27);
        com.unifacisa.tcc.domain.Professor professor29 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor31 = professor29.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa33 = professor29.email("");
        com.unifacisa.tcc.domain.Professor professor35 = professor29.diponibilidade((java.lang.Boolean) true);
        professor35.setId((java.lang.Long) (-1L));
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity38 = professorResource28.createProfessor(professor35);
        org.springframework.http.ResponseEntity<com.unifacisa.tcc.domain.Professor> professorResponseEntity39 = professorResource26.createProfessor(professor35);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa41 = professor35.segundoNome("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='', activationKey='null'}");
        com.unifacisa.tcc.domain.Professor professor42 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor44 = professor42.diponibilidade((java.lang.Boolean) true);
        professor44.setSegundoNome("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.Long long47 = professor44.getId();
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet48 = professor44.getAlunos();
        com.unifacisa.tcc.domain.Professor professor49 = professor35.alunos(alunoSet48);
        professor35.setDiponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet52 = professor35.getAlunos();
        com.unifacisa.tcc.domain.Professor professor53 = professor8.alunos(alunoSet52);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNotNull(professor22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertNotNull(professor31);
        org.junit.Assert.assertNotNull(pessoa33);
        org.junit.Assert.assertNotNull(professor35);
        org.junit.Assert.assertNotNull(professorResponseEntity38);
        org.junit.Assert.assertNotNull(professorResponseEntity39);
        org.junit.Assert.assertNotNull(pessoa41);
        org.junit.Assert.assertNotNull(professor44);
        org.junit.Assert.assertNull(long47);
        org.junit.Assert.assertNotNull(alunoSet48);
        org.junit.Assert.assertNotNull(professor49);
        org.junit.Assert.assertNotNull(alunoSet52);
        org.junit.Assert.assertNotNull(professor53);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        aluno5.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Professor professor8 = professor0.addAluno(aluno5);
        com.unifacisa.tcc.domain.Professor professor10 = professor8.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.web.rest.LogsResource logsResource11 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM12 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM12.setName("LoginVM{username='null', rememberMe=false}");
        logsResource11.changeLevel(loggerVM12);
        boolean boolean16 = professor10.equals((java.lang.Object) logsResource11);
        professor10.setNumeroContato((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa20 = professor10.matricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa22 = pessoa20.numeroContato((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professor10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(pessoa20);
        org.junit.Assert.assertNotNull(pessoa22);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        org.springframework.core.env.Environment environment19 = null;
        com.unifacisa.tcc.aop.logging.LoggingAspect loggingAspect20 = loggingAspectConfiguration15.loggingAspect(environment19);
        loggingAspect20.applicationPackagePointcut();
        loggingAspect20.springBeanPointcut();
        org.aspectj.lang.JoinPoint joinPoint23 = null;
        java.lang.Throwable throwable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            loggingAspect20.logAfterThrowing(joinPoint23, throwable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str3, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(loggingAspect18);
        org.junit.Assert.assertNotNull(loggingAspect20);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        com.unifacisa.tcc.web.rest.LogsResource logsResource20 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM21 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM21.setName("LoginVM{username='null', rememberMe=false}");
        logsResource20.changeLevel(loggerVM21);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList25 = logsResource20.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM26 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM26.setName("LoginVM{username='null', rememberMe=false}");
        loggerVM26.setName("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        logsResource20.changeLevel(loggerVM26);
        com.unifacisa.tcc.web.rest.LogsResource logsResource32 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM33 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM33.setName("LoginVM{username='null', rememberMe=false}");
        logsResource32.changeLevel(loggerVM33);
        loggerVM33.setName("Authority{name='error.concurrencyFailure'}");
        logsResource20.changeLevel(loggerVM33);
        logsResource0.changeLevel(loggerVM33);
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM41 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM41.setLevel("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        loggerVM41.setName("");
        logsResource0.changeLevel(loggerVM41);
        org.junit.Assert.assertNotNull(loggerVMList5);
        org.junit.Assert.assertNotNull(loggerVMList25);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        java.lang.String str5 = socialUserConnection0.getDisplayName();
        java.lang.String str6 = socialUserConnection0.getAccessToken();
        socialUserConnection0.setExpireTime((java.lang.Long) 100L);
        socialUserConnection0.setImageURL("Authority{name='null'}");
        java.lang.String str11 = socialUserConnection0.getProviderUserId();
        java.lang.String str12 = socialUserConnection0.getProfileURL();
        socialUserConnection0.setSecret("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM0 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant1 = managedUserVM0.getCreatedDate();
        java.lang.Long long2 = managedUserVM0.getId();
        java.lang.Long long3 = managedUserVM0.getId();
        java.lang.String str4 = managedUserVM0.toString();
        java.lang.String str5 = managedUserVM0.getCreatedBy();
        boolean boolean6 = managedUserVM0.isActivated();
        java.time.Instant instant7 = managedUserVM0.getLastModifiedDate();
        java.lang.String str8 = managedUserVM0.getLangKey();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str4, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.springframework.http.HttpHeaders httpHeaders2 = com.unifacisa.tcc.web.rest.util.HeaderUtil.createEntityDeletionAlert("Aluno{id=0, primeiroNome='error.validation', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}", "SocialUserConnection{id=-1, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='', rank=10, displayName='User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', profileURL='null', imageURL='null', accessToken='LoggerVM{name='null', level='null'}', secret='null', refreshToken='LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}', expireTime=null}");
        org.junit.Assert.assertNotNull(httpHeaders2);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        loginVM0.setPassword("");
        loginVM0.setPassword("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        loginVM0.setPassword("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        loginVM0.setUsername("Aluno{id=null, primeiroNome='', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='null'}");
        loginVM0.setPassword("ManagedUserVM{} UserDTO{login='LoginVM{username='null', rememberMe=false}', firstName='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', lastName='error.concurrencyFailure', email='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', imageUrl='LoginVM{username='null', rememberMe=false}', activated=false, langKey='hi!', createdBy=User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}, createdDate=null, lastModifiedBy='error.concurrencyFailure', lastModifiedDate=null, authorities=[hi!, , LoginVM{username='null', rememberMe=false}]}");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.unifacisa.tcc.web.rest.vm.LoginVM loginVM0 = new com.unifacisa.tcc.web.rest.vm.LoginVM();
        java.lang.String str1 = loginVM0.toString();
        loginVM0.setUsername("ManagedUserVM{} UserDTO{login='ManagedUserVM{} UserDTO{login='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='', numeroContato='null', diponibilidade='true'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LoginVM{username='null', rememberMe=null}" + "'", str1, "LoginVM{username='null', rememberMe=null}");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent0 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant1 = null;
        persistentAuditEvent0.setAuditEventDate(instant1);
        java.lang.Long long3 = persistentAuditEvent0.getId();
        java.lang.String str4 = persistentAuditEvent0.getPrincipal();
        java.lang.String str5 = persistentAuditEvent0.getAuditEventType();
        com.unifacisa.tcc.domain.PersistentAuditEvent persistentAuditEvent6 = new com.unifacisa.tcc.domain.PersistentAuditEvent();
        java.time.Instant instant7 = persistentAuditEvent6.getAuditEventDate();
        java.time.Instant instant8 = null;
        persistentAuditEvent6.setAuditEventDate(instant8);
        persistentAuditEvent6.setAuditEventType("LoginVM{username='null', rememberMe=false}");
        java.lang.Long long12 = persistentAuditEvent6.getId();
        persistentAuditEvent6.setPrincipal("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=-1, displayName='null', profileURL='null', imageURL='error.validation', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = persistentAuditEvent6.getData();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = persistentAuditEvent6.getData();
        persistentAuditEvent0.setData(strMap16);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        java.lang.String str33 = professor23.getPrimeiroNome();
        com.unifacisa.tcc.domain.Professor professor34 = new com.unifacisa.tcc.domain.Professor();
        java.lang.String str35 = professor34.toString();
        com.unifacisa.tcc.domain.Professor professor37 = professor34.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet38 = professor34.getAlunos();
        com.unifacisa.tcc.domain.Professor professor39 = professor23.alunos(alunoSet38);
        com.unifacisa.tcc.domain.Aluno aluno40 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor41 = null;
        aluno40.setProfessor(professor41);
        aluno40.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Professor professor45 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor47 = professor45.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa49 = professor45.email("");
        com.unifacisa.tcc.domain.Professor professor51 = professor45.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Aluno aluno52 = aluno40.professor(professor51);
        com.unifacisa.tcc.domain.Professor professor53 = professor23.removeAluno(aluno40);
        com.unifacisa.tcc.domain.Aluno aluno54 = new com.unifacisa.tcc.domain.Aluno();
        aluno54.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Aluno aluno58 = aluno54.habilitadoTcc((java.lang.Boolean) false);
        boolean boolean59 = professor53.equals((java.lang.Object) aluno54);
        professor53.setSegundoNome("");
        java.lang.Boolean boolean62 = professor53.isDiponibilidade();
        com.unifacisa.tcc.domain.Professor professor63 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor65 = professor63.diponibilidade((java.lang.Boolean) true);
        professor65.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno68 = new com.unifacisa.tcc.domain.Aluno();
        aluno68.setPrimeiroNome("");
        java.lang.Long long71 = aluno68.getMatricula();
        aluno68.setHabilitadoTcc((java.lang.Boolean) false);
        aluno68.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno76 = new com.unifacisa.tcc.domain.Aluno();
        aluno76.setPrimeiroNome("");
        java.lang.Long long79 = aluno76.getMatricula();
        java.lang.Long long80 = aluno76.getMatricula();
        aluno76.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno83 = new com.unifacisa.tcc.domain.Aluno();
        aluno83.setPrimeiroNome("");
        java.lang.Long long86 = aluno83.getMatricula();
        java.lang.Long long87 = aluno83.getMatricula();
        aluno83.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno90 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray91 = new com.unifacisa.tcc.domain.Aluno[] { aluno68, aluno76, aluno83, aluno90 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet92 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet92, alunoArray91);
        com.unifacisa.tcc.domain.Professor professor94 = professor65.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet92);
        professor53.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet92);
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str35, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(professor37);
        org.junit.Assert.assertNotNull(alunoSet38);
        org.junit.Assert.assertNotNull(professor39);
        org.junit.Assert.assertNotNull(professor47);
        org.junit.Assert.assertNotNull(pessoa49);
        org.junit.Assert.assertNotNull(professor51);
        org.junit.Assert.assertNotNull(aluno52);
        org.junit.Assert.assertNotNull(professor53);
        org.junit.Assert.assertNotNull(aluno58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + boolean62 + "' != '" + true + "'", boolean62, true);
        org.junit.Assert.assertNotNull(professor65);
        org.junit.Assert.assertNull(long71);
        org.junit.Assert.assertNull(long79);
        org.junit.Assert.assertNull(long80);
        org.junit.Assert.assertNull(long86);
        org.junit.Assert.assertNull(long87);
        org.junit.Assert.assertNotNull(alunoArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(professor94);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.unifacisa.tcc.domain.User user0 = new com.unifacisa.tcc.domain.User();
        user0.setCreatedBy("LoginVM{username='null', rememberMe=false}");
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM3 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet4 = managedUserVM3.getAuthorities();
        boolean boolean5 = user0.equals((java.lang.Object) strSet4);
        java.time.Instant instant6 = user0.getLastModifiedDate();
        user0.setFirstName("LoginVM{username='null', rememberMe=false}");
        java.time.Instant instant9 = user0.getResetDate();
        java.lang.Long long10 = user0.getId();
        com.unifacisa.tcc.service.dto.UserDTO userDTO11 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str12 = user0.getLastName();
        java.time.Instant instant13 = user0.getLastModifiedDate();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNull(instant9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor1 = null;
        aluno0.setProfessor(professor1);
        aluno0.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor5 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor7 = professor5.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor8 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Aluno aluno9 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor10 = null;
        aluno9.setProfessor(professor10);
        aluno9.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Aluno aluno14 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno aluno15 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor16 = null;
        aluno15.setProfessor(professor16);
        java.lang.Long long18 = aluno15.getMatricula();
        java.lang.String str19 = aluno15.getSegundoNome();
        com.unifacisa.tcc.domain.Aluno aluno20 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean22 = aluno20.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno23 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor24 = null;
        aluno23.setProfessor(professor24);
        aluno23.setSegundoNome("hi!");
        com.unifacisa.tcc.domain.Aluno aluno28 = new com.unifacisa.tcc.domain.Aluno();
        boolean boolean30 = aluno28.equals((java.lang.Object) 100.0f);
        com.unifacisa.tcc.domain.Aluno aluno31 = new com.unifacisa.tcc.domain.Aluno();
        aluno31.setPrimeiroNome("");
        java.lang.Long long34 = aluno31.getMatricula();
        com.unifacisa.tcc.domain.Aluno aluno35 = new com.unifacisa.tcc.domain.Aluno();
        aluno35.setPrimeiroNome("");
        com.unifacisa.tcc.domain.Aluno[] alunoArray38 = new com.unifacisa.tcc.domain.Aluno[] { aluno9, aluno14, aluno15, aluno20, aluno23, aluno28, aluno31, aluno35 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet39 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet39, alunoArray38);
        professor8.setAlunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet39);
        com.unifacisa.tcc.domain.Professor professor42 = professor7.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet39);
        aluno0.setProfessor(professor42);
        aluno0.setMatricula((java.lang.Long) 10L);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa47 = aluno0.segundoNome("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}', refreshToken='null', expireTime=null}");
        pessoa47.setMatricula((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(professor7);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(long34);
        org.junit.Assert.assertNotNull(alunoArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(professor42);
        org.junit.Assert.assertNotNull(pessoa47);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        java.lang.String str33 = managedUserVM31.getLangKey();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper34 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user36 = userMapper34.userFromId((java.lang.Long) 100L);
        user36.setResetKey("hi!");
        java.lang.String str39 = user36.getResetKey();
        user36.setId((java.lang.Long) 0L);
        com.unifacisa.tcc.service.mapper.UserMapper userMapper42 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user44 = userMapper42.userFromId((java.lang.Long) 100L);
        user44.setResetKey("hi!");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper47 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user49 = userMapper47.userFromId((java.lang.Long) 100L);
        user49.setLangKey("");
        java.time.Instant instant52 = user49.getResetDate();
        java.time.Instant instant53 = user49.getCreatedDate();
        user44.setResetDate(instant53);
        user36.setResetDate(instant53);
        managedUserVM31.setLastModifiedDate(instant53);
        managedUserVM31.setId((java.lang.Long) 1L);
        java.time.Instant instant59 = managedUserVM31.getCreatedDate();
        java.lang.String str60 = managedUserVM31.getLangKey();
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(instant32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNull(instant52);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNull(instant59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.unifacisa.tcc.domain.Professor professor0 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor2 = professor0.diponibilidade((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa4 = professor0.email("");
        com.unifacisa.tcc.domain.Aluno aluno5 = new com.unifacisa.tcc.domain.Aluno();
        aluno5.setPrimeiroNome("error.validation");
        com.unifacisa.tcc.domain.Professor professor8 = professor0.addAluno(aluno5);
        com.unifacisa.tcc.domain.Professor professor10 = professor8.diponibilidade((java.lang.Boolean) true);
        java.util.Set<com.unifacisa.tcc.domain.Aluno> alunoSet11 = null;
        professor10.setAlunos(alunoSet11);
        org.junit.Assert.assertNotNull(professor2);
        org.junit.Assert.assertNotNull(pessoa4);
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNotNull(professor10);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.unifacisa.tcc.domain.Aluno aluno0 = new com.unifacisa.tcc.domain.Aluno();
        aluno0.setPrimeiroNome("");
        java.lang.Long long3 = aluno0.getId();
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa5 = aluno0.segundoNome("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=null, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        com.unifacisa.tcc.domain.Aluno aluno7 = aluno0.habilitadoTcc((java.lang.Boolean) true);
        com.unifacisa.tcc.domain.Professor professor8 = aluno0.getProfessor();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNotNull(pessoa5);
        org.junit.Assert.assertNotNull(aluno7);
        org.junit.Assert.assertNull(professor8);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.unifacisa.tcc.service.mapper.UserMapper userMapper0 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user2 = userMapper0.userFromId((java.lang.Long) 100L);
        user2.setResetKey("hi!");
        java.lang.String str5 = user2.getResetKey();
        com.unifacisa.tcc.domain.Professor professor6 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor8 = professor6.diponibilidade((java.lang.Boolean) true);
        professor8.setDiponibilidade((java.lang.Boolean) false);
        java.lang.String str11 = professor8.getSegundoNome();
        com.unifacisa.tcc.domain.Professor professor12 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor14 = professor12.diponibilidade((java.lang.Boolean) true);
        professor14.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno17 = new com.unifacisa.tcc.domain.Aluno();
        aluno17.setPrimeiroNome("");
        java.lang.Long long20 = aluno17.getMatricula();
        aluno17.setHabilitadoTcc((java.lang.Boolean) false);
        aluno17.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno25 = new com.unifacisa.tcc.domain.Aluno();
        aluno25.setPrimeiroNome("");
        java.lang.Long long28 = aluno25.getMatricula();
        java.lang.Long long29 = aluno25.getMatricula();
        aluno25.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno32 = new com.unifacisa.tcc.domain.Aluno();
        aluno32.setPrimeiroNome("");
        java.lang.Long long35 = aluno32.getMatricula();
        java.lang.Long long36 = aluno32.getMatricula();
        aluno32.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno39 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray40 = new com.unifacisa.tcc.domain.Aluno[] { aluno17, aluno25, aluno32, aluno39 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet41 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet41, alunoArray40);
        com.unifacisa.tcc.domain.Professor professor43 = professor14.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet41);
        com.unifacisa.tcc.domain.Professor professor44 = professor8.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet41);
        com.unifacisa.tcc.domain.Aluno aluno45 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Professor professor46 = null;
        aluno45.setProfessor(professor46);
        aluno45.setMatricula((java.lang.Long) 1L);
        com.unifacisa.tcc.domain.Professor professor50 = new com.unifacisa.tcc.domain.Professor();
        com.unifacisa.tcc.domain.Professor professor52 = professor50.diponibilidade((java.lang.Boolean) true);
        professor52.setDiponibilidade((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Aluno aluno55 = new com.unifacisa.tcc.domain.Aluno();
        aluno55.setPrimeiroNome("");
        java.lang.Long long58 = aluno55.getMatricula();
        aluno55.setHabilitadoTcc((java.lang.Boolean) false);
        aluno55.setId((java.lang.Long) (-1L));
        com.unifacisa.tcc.domain.Aluno aluno63 = new com.unifacisa.tcc.domain.Aluno();
        aluno63.setPrimeiroNome("");
        java.lang.Long long66 = aluno63.getMatricula();
        java.lang.Long long67 = aluno63.getMatricula();
        aluno63.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno70 = new com.unifacisa.tcc.domain.Aluno();
        aluno70.setPrimeiroNome("");
        java.lang.Long long73 = aluno70.getMatricula();
        java.lang.Long long74 = aluno70.getMatricula();
        aluno70.setMatricula((java.lang.Long) 0L);
        com.unifacisa.tcc.domain.Aluno aluno77 = new com.unifacisa.tcc.domain.Aluno();
        com.unifacisa.tcc.domain.Aluno[] alunoArray78 = new com.unifacisa.tcc.domain.Aluno[] { aluno55, aluno63, aluno70, aluno77 };
        java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno> alunoSet79 = new java.util.LinkedHashSet<com.unifacisa.tcc.domain.Aluno>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.unifacisa.tcc.domain.Aluno>) alunoSet79, alunoArray78);
        com.unifacisa.tcc.domain.Professor professor81 = professor52.alunos((java.util.Set<com.unifacisa.tcc.domain.Aluno>) alunoSet79);
        com.unifacisa.tcc.domain.Aluno aluno82 = aluno45.professor(professor81);
        com.unifacisa.tcc.domain.abstractions.Pessoa pessoa84 = aluno82.segundoNome("");
        com.unifacisa.tcc.domain.Aluno aluno86 = aluno82.habilitadoTcc((java.lang.Boolean) false);
        com.unifacisa.tcc.domain.Professor professor87 = professor44.removeAluno(aluno82);
        com.unifacisa.tcc.domain.Professor professor89 = professor87.diponibilidade((java.lang.Boolean) true);
        boolean boolean90 = user2.equals((java.lang.Object) professor87);
        user2.setPassword("ManagedUserVM{} UserDTO{login='User{login='null', firstName='error.validation', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        user2.setActivationKey("LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}");
        java.lang.String str95 = user2.getLastName();
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(professor8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(professor14);
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertNull(long35);
        org.junit.Assert.assertNull(long36);
        org.junit.Assert.assertNotNull(alunoArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(professor43);
        org.junit.Assert.assertNotNull(professor44);
        org.junit.Assert.assertNotNull(professor52);
        org.junit.Assert.assertNull(long58);
        org.junit.Assert.assertNull(long66);
        org.junit.Assert.assertNull(long67);
        org.junit.Assert.assertNull(long73);
        org.junit.Assert.assertNull(long74);
        org.junit.Assert.assertNotNull(alunoArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(professor81);
        org.junit.Assert.assertNotNull(aluno82);
        org.junit.Assert.assertNotNull(pessoa84);
        org.junit.Assert.assertNotNull(aluno86);
        org.junit.Assert.assertNotNull(professor87);
        org.junit.Assert.assertNotNull(professor89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.unifacisa.tcc.repository.UserRepository userRepository0 = null;
        com.unifacisa.tcc.service.MailService mailService1 = null;
        com.unifacisa.tcc.service.UserService userService2 = null;
        com.unifacisa.tcc.web.rest.UserResource userResource3 = new com.unifacisa.tcc.web.rest.UserResource(userRepository0, mailService1, userService2);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM4 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.time.Instant instant5 = managedUserVM4.getCreatedDate();
        java.lang.Long long6 = managedUserVM4.getId();
        java.lang.Long long7 = managedUserVM4.getId();
        java.lang.String str8 = managedUserVM4.toString();
        managedUserVM4.setId((java.lang.Long) (-1L));
        java.util.Set<java.lang.String> strSet11 = managedUserVM4.getAuthorities();
        java.lang.String str12 = managedUserVM4.getImageUrl();
        org.springframework.http.ResponseEntity responseEntity13 = userResource3.createUser(managedUserVM4);
        java.time.Instant instant24 = null;
        java.time.Instant instant26 = null;
        java.time.Instant instant36 = null;
        java.time.Instant instant38 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        com.unifacisa.tcc.service.dto.UserDTO userDTO44 = new com.unifacisa.tcc.service.dto.UserDTO((java.lang.Long) 100L, "", "hi!", "hi!", "", false, "hi!", "", "", instant36, "hi!", instant38, (java.util.Set<java.lang.String>) strSet42);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM45 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", "", false, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "LoginVM{username='null', rememberMe=false}", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", instant24, "hi!", instant26, (java.util.Set<java.lang.String>) strSet42);
        org.springframework.http.ResponseEntity responseEntity46 = userResource3.createUser(managedUserVM45);
        java.time.Instant instant57 = null;
        java.time.Instant instant59 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!", "", "LoginVM{username='null', rememberMe=false}" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM67 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM((java.lang.Long) 100L, "LoginVM{username='null', rememberMe=false}", "LoginVM{username='null', rememberMe=false}", "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}", "error.concurrencyFailure", "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}", false, "LoginVM{username='null', rememberMe=false}", "hi!", "User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}", instant57, "error.concurrencyFailure", instant59, (java.util.Set<java.lang.String>) strSet65);
        java.lang.String str68 = managedUserVM67.getFirstName();
        org.springframework.http.ResponseEntity responseEntity69 = userResource3.createUser(managedUserVM67);
        com.unifacisa.tcc.web.rest.vm.ManagedUserVM managedUserVM70 = new com.unifacisa.tcc.web.rest.vm.ManagedUserVM();
        java.util.Set<java.lang.String> strSet71 = managedUserVM70.getAuthorities();
        java.time.Instant instant72 = null;
        managedUserVM70.setLastModifiedDate(instant72);
        java.lang.String str74 = managedUserVM70.toString();
        java.time.Instant instant75 = null;
        managedUserVM70.setLastModifiedDate(instant75);
        java.lang.String str77 = managedUserVM70.getLangKey();
        java.lang.String str78 = managedUserVM70.getLastName();
        java.lang.String str79 = managedUserVM70.toString();
        java.util.Set<java.lang.String> strSet80 = managedUserVM70.getAuthorities();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.ResponseEntity<com.unifacisa.tcc.service.dto.UserDTO> userDTOResponseEntity81 = userResource3.updateUser(managedUserVM70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str8, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(responseEntity13);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(responseEntity46);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}" + "'", str68, "Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        org.junit.Assert.assertNotNull(responseEntity69);
        org.junit.Assert.assertNull(strSet71);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str74, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}" + "'", str79, "ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}");
        org.junit.Assert.assertNull(strSet80);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.unifacisa.tcc.web.rest.LogsResource logsResource0 = new com.unifacisa.tcc.web.rest.LogsResource();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM1 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM1.setName("LoginVM{username='null', rememberMe=false}");
        logsResource0.changeLevel(loggerVM1);
        java.util.List<com.unifacisa.tcc.web.rest.vm.LoggerVM> loggerVMList5 = logsResource0.getList();
        com.unifacisa.tcc.web.rest.vm.LoggerVM loggerVM6 = new com.unifacisa.tcc.web.rest.vm.LoggerVM();
        loggerVM6.setName("LoginVM{username='null', rememberMe=false}");
        loggerVM6.setName("Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        logsResource0.changeLevel(loggerVM6);
        java.lang.String str12 = loggerVM6.getName();
        loggerVM6.setName("LoginVM{username='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', rememberMe=false}");
        java.lang.String str15 = loggerVM6.getLevel();
        org.junit.Assert.assertNotNull(loggerVMList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}" + "'", str12, "Aluno{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', habilitadoTcc='true'}");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        java.lang.String str38 = user2.getCreatedBy();
        java.lang.String str39 = user2.getPassword();
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
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        boolean boolean45 = user0.getActivated();
        com.unifacisa.tcc.service.mapper.UserMapper userMapper46 = new com.unifacisa.tcc.service.mapper.UserMapper();
        com.unifacisa.tcc.domain.User user48 = userMapper46.userFromId((java.lang.Long) 100L);
        user48.setLangKey("");
        java.time.Instant instant51 = user48.getResetDate();
        java.time.Instant instant52 = user48.getCreatedDate();
        com.unifacisa.tcc.domain.Aluno aluno53 = new com.unifacisa.tcc.domain.Aluno();
        aluno53.setPrimeiroNome("");
        java.lang.String str56 = aluno53.getPrimeiroNome();
        java.lang.Long long57 = aluno53.getMatricula();
        boolean boolean58 = user48.equals((java.lang.Object) aluno53);
        user48.setFirstName("");
        user48.setActivationKey("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.util.Set<com.unifacisa.tcc.domain.Authority> authoritySet63 = user48.getAuthorities();
        user0.setAuthorities(authoritySet63);
        com.unifacisa.tcc.service.dto.UserDTO userDTO65 = new com.unifacisa.tcc.service.dto.UserDTO(user0);
        java.lang.String str66 = userDTO65.getEmail();
        userDTO65.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userDTOList10);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(authoritySet43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(user48);
        org.junit.Assert.assertNull(instant51);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(long57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(authoritySet63);
        org.junit.Assert.assertNull(str66);
    }
}

