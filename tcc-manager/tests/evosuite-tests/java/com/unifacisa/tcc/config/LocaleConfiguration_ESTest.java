/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 25 02:22:28 GMT 2021
 */

package com.unifacisa.tcc.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.unifacisa.tcc.config.LocaleConfiguration;
import io.github.jhipster.config.locale.AngularCookieLocaleResolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocaleConfiguration_ESTest extends LocaleConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocaleConfiguration localeConfiguration0 = new LocaleConfiguration();
      // Undeclared exception!
      try { 
        localeConfiguration0.addInterceptors((InterceptorRegistry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.unifacisa.tcc.config.LocaleConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocaleConfiguration localeConfiguration0 = new LocaleConfiguration();
      InterceptorRegistry interceptorRegistry0 = mock(InterceptorRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((InterceptorRegistration) null).when(interceptorRegistry0).addInterceptor(any(org.springframework.web.servlet.HandlerInterceptor.class));
      localeConfiguration0.addInterceptors(interceptorRegistry0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocaleConfiguration localeConfiguration0 = new LocaleConfiguration();
      Environment environment0 = mock(Environment.class, new ViolatedAssumptionAnswer());
      localeConfiguration0.setEnvironment(environment0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocaleConfiguration localeConfiguration0 = new LocaleConfiguration();
      AngularCookieLocaleResolver angularCookieLocaleResolver0 = (AngularCookieLocaleResolver)localeConfiguration0.localeResolver();
      assertEquals("NG_TRANSLATE_LANG_KEY", angularCookieLocaleResolver0.getCookieName());
  }
}
