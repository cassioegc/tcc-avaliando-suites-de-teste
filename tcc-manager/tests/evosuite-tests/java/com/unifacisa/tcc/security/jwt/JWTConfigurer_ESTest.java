/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 25 02:05:47 GMT 2021
 */

package com.unifacisa.tcc.security.jwt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.unifacisa.tcc.security.jwt.JWTConfigurer;
import com.unifacisa.tcc.security.jwt.TokenProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JWTConfigurer_ESTest extends JWTConfigurer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JWTConfigurer jWTConfigurer0 = new JWTConfigurer((TokenProvider) null);
      try { 
        jWTConfigurer0.configure((HttpSecurity) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.unifacisa.tcc.security.jwt.JWTConfigurer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JWTConfigurer jWTConfigurer0 = new JWTConfigurer((TokenProvider) null);
      HttpSecurity httpSecurity0 = mock(HttpSecurity.class, new ViolatedAssumptionAnswer());
      doReturn((HttpSecurity) null).when(httpSecurity0).addFilterBefore(any(javax.servlet.Filter.class) , nullable(java.lang.Class.class));
      jWTConfigurer0.configure(httpSecurity0);
  }
}
