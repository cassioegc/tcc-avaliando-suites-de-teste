/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 25 01:44:23 GMT 2021
 */

package com.unifacisa.tcc.security.jwt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.unifacisa.tcc.security.jwt.JWTFilter;
import com.unifacisa.tcc.security.jwt.TokenProvider;
import io.github.jhipster.config.JHipsterProperties;
import javax.servlet.Filter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import liquibase.integration.servlet.LiquibaseStatusServlet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.PassThroughFilterChain;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.FirewalledRequest;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JWTFilter_ESTest extends JWTFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JHipsterProperties jHipsterProperties0 = new JHipsterProperties();
      TokenProvider tokenProvider0 = new TokenProvider(jHipsterProperties0);
      Injector.executePostConstruct((Object) tokenProvider0, (Class<?>) TokenProvider.class);
      JWTFilter jWTFilter0 = new JWTFilter(tokenProvider0);
      DefaultHttpFirewall defaultHttpFirewall0 = new DefaultHttpFirewall();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("R{%_&-q").when(httpServletRequest0).getHeader(anyString());
      doReturn("+cY$FduHcad").when(httpServletRequest0).getPathInfo();
      doReturn("+cY$FduHcad").when(httpServletRequest0).getRequestURI();
      doReturn("R{%_&-q").when(httpServletRequest0).getServletPath();
      FirewalledRequest firewalledRequest0 = defaultHttpFirewall0.getFirewalledRequest(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponse httpServletResponse1 = defaultHttpFirewall0.getFirewalledResponse(httpServletResponse0);
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse1);
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(httpServletResponseWrapper0);
      LiquibaseStatusServlet liquibaseStatusServlet0 = new LiquibaseStatusServlet();
      PassThroughFilterChain passThroughFilterChain0 = new PassThroughFilterChain(liquibaseStatusServlet0);
      try { 
        jWTFilter0.doFilter(firewalledRequest0, servletResponseWrapper0, passThroughFilterChain0);
        fail("Expecting exception: ServletException");
      
      } catch(ServletException e) {
         //
         // non-HTTP request or response
         //
         verifyException("javax.servlet.http.HttpServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JHipsterProperties jHipsterProperties0 = new JHipsterProperties();
      TokenProvider tokenProvider0 = new TokenProvider(jHipsterProperties0);
      Injector.executePostConstruct((Object) tokenProvider0, (Class<?>) TokenProvider.class);
      DefaultHttpFirewall defaultHttpFirewall0 = new DefaultHttpFirewall();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponse httpServletResponse1 = defaultHttpFirewall0.getFirewalledResponse(httpServletResponse0);
      MockFilterChain mockFilterChain0 = new MockFilterChain();
      JWTFilter jWTFilter0 = new JWTFilter(tokenProvider0);
      httpServletRequestWrapper0.setRequest(httpServletRequestWrapper0);
      // Undeclared exception!
      try { 
        jWTFilter0.doFilter(httpServletRequestWrapper0, httpServletResponse1, mockFilterChain0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JHipsterProperties jHipsterProperties0 = new JHipsterProperties();
      TokenProvider tokenProvider0 = new TokenProvider(jHipsterProperties0);
      Injector.executePostConstruct((Object) tokenProvider0, (Class<?>) TokenProvider.class);
      JWTFilter jWTFilter0 = new JWTFilter(tokenProvider0);
      LiquibaseStatusServlet liquibaseStatusServlet0 = new LiquibaseStatusServlet();
      MockFilterChain mockFilterChain0 = new MockFilterChain(liquibaseStatusServlet0);
      // Undeclared exception!
      try { 
        jWTFilter0.doFilter((ServletRequest) null, (ServletResponse) null, mockFilterChain0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.unifacisa.tcc.security.jwt.JWTFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JHipsterProperties jHipsterProperties0 = new JHipsterProperties();
      TokenProvider tokenProvider0 = new TokenProvider(jHipsterProperties0);
      Injector.executePostConstruct((Object) tokenProvider0, (Class<?>) TokenProvider.class);
      JWTFilter jWTFilter0 = new JWTFilter(tokenProvider0);
      DefaultHttpFirewall defaultHttpFirewall0 = new DefaultHttpFirewall();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(httpServletRequest0).getAttribute(anyString());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(httpServletRequest0).getHeader(anyString());
      doReturn((String) null).when(httpServletRequest0).getMethod();
      doReturn((String) null).when(httpServletRequest0).getPathInfo();
      doReturn((String) null).when(httpServletRequest0).getRequestURI();
      doReturn((String) null).when(httpServletRequest0).getServletPath();
      FirewalledRequest firewalledRequest0 = defaultHttpFirewall0.getFirewalledRequest(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      LiquibaseStatusServlet liquibaseStatusServlet0 = new LiquibaseStatusServlet();
      Filter[] filterArray0 = new Filter[9];
      filterArray0[0] = (Filter) jWTFilter0;
      filterArray0[1] = (Filter) jWTFilter0;
      filterArray0[2] = (Filter) jWTFilter0;
      DelegatingFilterProxy delegatingFilterProxy0 = new DelegatingFilterProxy(jWTFilter0);
      filterArray0[3] = (Filter) delegatingFilterProxy0;
      filterArray0[4] = (Filter) jWTFilter0;
      CharacterEncodingFilter characterEncodingFilter0 = new CharacterEncodingFilter("Bearer Bearer ", true, true);
      filterArray0[5] = (Filter) characterEncodingFilter0;
      filterArray0[6] = (Filter) jWTFilter0;
      filterArray0[7] = (Filter) jWTFilter0;
      filterArray0[8] = (Filter) jWTFilter0;
      MockFilterChain mockFilterChain0 = new MockFilterChain(liquibaseStatusServlet0, filterArray0);
      // Undeclared exception!
      try { 
        jWTFilter0.doFilter(firewalledRequest0, httpServletResponseWrapper0, mockFilterChain0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.servlet.http.HttpServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JWTFilter jWTFilter0 = new JWTFilter((TokenProvider) null);
      DefaultHttpFirewall defaultHttpFirewall0 = new DefaultHttpFirewall();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("IR{kpk4?Ulw").when(httpServletRequest0).getHeader(anyString());
      doReturn("IR{kpk4?Ulw").when(httpServletRequest0).getPathInfo();
      doReturn("IR{kpk4?Ulw").when(httpServletRequest0).getRequestURI();
      doReturn("Bearer &lhst*").when(httpServletRequest0).getServletPath();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      FirewalledRequest firewalledRequest0 = defaultHttpFirewall0.getFirewalledRequest(httpServletRequestWrapper0);
      MockFilterChain mockFilterChain0 = new MockFilterChain();
      // Undeclared exception!
      try { 
        jWTFilter0.doFilter(firewalledRequest0, (ServletResponse) null, mockFilterChain0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Response must not be null
         //
         verifyException("org.springframework.util.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JHipsterProperties jHipsterProperties0 = new JHipsterProperties();
      TokenProvider tokenProvider0 = new TokenProvider(jHipsterProperties0);
      Injector.executePostConstruct((Object) tokenProvider0, (Class<?>) TokenProvider.class);
      DefaultHttpFirewall defaultHttpFirewall0 = new DefaultHttpFirewall();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("Bearer io.jsonwebtoken.impl.DefaultClaims", (String) null).when(httpServletRequest0).getHeader(anyString());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponse httpServletResponse1 = defaultHttpFirewall0.getFirewalledResponse(httpServletResponse0);
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse1);
      MockFilterChain mockFilterChain0 = new MockFilterChain();
      JWTFilter jWTFilter0 = new JWTFilter(tokenProvider0);
      jWTFilter0.doFilter(httpServletRequestWrapper0, httpServletResponse1, mockFilterChain0);
      // Undeclared exception!
      try { 
        jWTFilter0.doFilter(httpServletRequestWrapper0, httpServletResponseWrapper0, mockFilterChain0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This FilterChain has already been called!
         //
         verifyException("org.springframework.mock.web.MockFilterChain", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JHipsterProperties jHipsterProperties0 = new JHipsterProperties();
      TokenProvider tokenProvider0 = new TokenProvider(jHipsterProperties0);
      Injector.executePostConstruct((Object) tokenProvider0, (Class<?>) TokenProvider.class);
      JWTFilter jWTFilter0 = new JWTFilter(tokenProvider0);
      DefaultHttpFirewall defaultHttpFirewall0 = new DefaultHttpFirewall();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getPathInfo();
      doReturn((String) null).when(httpServletRequest0).getRequestURI();
      doReturn((String) null).when(httpServletRequest0).getServletPath();
      FirewalledRequest firewalledRequest0 = defaultHttpFirewall0.getFirewalledRequest(httpServletRequest0);
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(firewalledRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponse httpServletResponse1 = defaultHttpFirewall0.getFirewalledResponse(httpServletResponse0);
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse1);
      MockFilterChain mockFilterChain0 = new MockFilterChain();
      // Undeclared exception!
      try { 
        jWTFilter0.doFilter(servletRequestWrapper0, httpServletResponseWrapper0, mockFilterChain0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.servlet.ServletRequestWrapper cannot be cast to javax.servlet.http.HttpServletRequest
         //
         verifyException("com.unifacisa.tcc.security.jwt.JWTFilter", e);
      }
  }
}
