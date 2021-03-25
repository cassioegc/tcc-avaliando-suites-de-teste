/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 25 02:13:31 GMT 2021
 */

package com.unifacisa.tcc.security;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.unifacisa.tcc.repository.UserRepository;
import com.unifacisa.tcc.security.DomainUserDetailsService;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DomainUserDetailsService_ESTest extends DomainUserDetailsService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserRepository userRepository0 = mock(UserRepository.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(userRepository0).findOneWithAuthoritiesByLogin(anyString());
      DomainUserDetailsService domainUserDetailsService0 = new DomainUserDetailsService(userRepository0);
      // Undeclared exception!
      try { 
        domainUserDetailsService0.loadUserByUsername("(nU.`OvHux^/wj");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.unifacisa.tcc.security.DomainUserDetailsService", e);
      }
  }
}
