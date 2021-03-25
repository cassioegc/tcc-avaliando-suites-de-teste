/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 25 02:08:02 GMT 2021
 */

package com.unifacisa.tcc.security.social;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.unifacisa.tcc.security.jwt.TokenProvider;
import com.unifacisa.tcc.security.social.CustomSignInAdapter;
import io.github.jhipster.config.JHipsterProperties;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.social.connect.Connection;
import org.springframework.web.context.request.NativeWebRequest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomSignInAdapter_ESTest extends CustomSignInAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserDetails userDetails0 = mock(UserDetails.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(userDetails0).getAuthorities();
      UserDetailsService userDetailsService0 = mock(UserDetailsService.class, new ViolatedAssumptionAnswer());
      doReturn(userDetails0).when(userDetailsService0).loadUserByUsername(anyString());
      TokenProvider tokenProvider0 = mock(TokenProvider.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tokenProvider0).createToken(any(org.springframework.security.core.Authentication.class) , anyBoolean());
      Connection<Integer> connection0 = (Connection<Integer>) mock(Connection.class, new ViolatedAssumptionAnswer());
      JHipsterProperties jHipsterProperties0 = mock(JHipsterProperties.class, new ViolatedAssumptionAnswer());
      CustomSignInAdapter customSignInAdapter0 = new CustomSignInAdapter(userDetailsService0, jHipsterProperties0, tokenProvider0);
      // Undeclared exception!
      try { 
        customSignInAdapter0.signIn("", connection0, (NativeWebRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.unifacisa.tcc.security.social.CustomSignInAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserDetails userDetails0 = mock(UserDetails.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(userDetails0).getAuthorities();
      UserDetailsService userDetailsService0 = mock(UserDetailsService.class, new ViolatedAssumptionAnswer());
      doReturn(userDetails0).when(userDetailsService0).loadUserByUsername(anyString());
      JHipsterProperties jHipsterProperties0 = mock(JHipsterProperties.class, new ViolatedAssumptionAnswer());
      TokenProvider tokenProvider0 = mock(TokenProvider.class, new ViolatedAssumptionAnswer());
      doReturn("").when(tokenProvider0).createToken(any(org.springframework.security.core.Authentication.class) , anyBoolean());
      CustomSignInAdapter customSignInAdapter0 = new CustomSignInAdapter(userDetailsService0, jHipsterProperties0, tokenProvider0);
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        customSignInAdapter0.signIn("", (Connection<?>) null, nativeWebRequest0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.springframework.web.context.request.NativeWebRequest$MockitoMock$935622707 cannot be cast to org.springframework.web.context.request.ServletWebRequest
         //
         verifyException("com.unifacisa.tcc.security.social.CustomSignInAdapter", e);
      }
  }
}
