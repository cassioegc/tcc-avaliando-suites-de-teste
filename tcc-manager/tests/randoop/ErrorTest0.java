import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection0.setRank((java.lang.Long) 10L);
        java.lang.String str5 = socialUserConnection0.getProviderId();
        socialUserConnection0.setImageURL("Authority{name='null'}");
        socialUserConnection0.setRefreshToken("LoginVM{username='null', rememberMe=null}");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection10 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection10.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        socialUserConnection10.setProfileURL("error.concurrencyFailure");
        java.lang.String str15 = socialUserConnection10.getProfileURL();
        boolean boolean16 = socialUserConnection0.equals((java.lang.Object) str15);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on socialUserConnection0, socialUserConnection10, and socialUserConnection10.", !(socialUserConnection0.equals(socialUserConnection10) && socialUserConnection10.equals(socialUserConnection10)) || socialUserConnection0.equals(socialUserConnection10));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection0 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection0.setId((java.lang.Long) (-1L));
        socialUserConnection0.setImageURL("UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=LoginVM{username='null', rememberMe=false}, createdDate=2021-03-26T03:34:04.306Z, lastModifiedBy='null', lastModifiedDate=2021-03-26T03:34:04.306Z, authorities=[ManagedUserVM{} UserDTO{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated=false, langKey='null', createdBy=null, createdDate=null, lastModifiedBy='null', lastModifiedDate=null, authorities=null}]}");
        socialUserConnection0.setAccessToken("LoggerVM{name='null', level='null'}");
        com.unifacisa.tcc.domain.SocialUserConnection socialUserConnection7 = new com.unifacisa.tcc.domain.SocialUserConnection();
        socialUserConnection7.setProviderId("Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}");
        java.lang.String str10 = socialUserConnection7.getProviderId();
        socialUserConnection7.setProfileURL("User{login='null', firstName='null', lastName='null', email='null', imageUrl='null', activated='false', langKey='null', activationKey='null'}");
        java.lang.String str13 = socialUserConnection7.getImageURL();
        java.lang.String str14 = socialUserConnection7.getAccessToken();
        socialUserConnection7.setDisplayName("SocialUserConnection{id=null, userId=null, providerId='Professor{id=null, primeiroNome='null', segundoNome='null', matricula='null', email='null', numeroContato='null', diponibilidade='null'}', providerUserId='null', rank=10, displayName='null', profileURL='null', imageURL='null', accessToken='null', secret='null', refreshToken='null', expireTime=null}");
        boolean boolean17 = socialUserConnection0.equals((java.lang.Object) socialUserConnection7);
        socialUserConnection0.setImageURL("LoginVM{username='LoggerVM{name='LoginVM{username='null', rememberMe=false}', level='null'}', rememberMe=true}");
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on socialUserConnection7, socialUserConnection0, and socialUserConnection7.", !(socialUserConnection7.equals(socialUserConnection0) && socialUserConnection0.equals(socialUserConnection7)) || socialUserConnection7.equals(socialUserConnection7));
    }
}

