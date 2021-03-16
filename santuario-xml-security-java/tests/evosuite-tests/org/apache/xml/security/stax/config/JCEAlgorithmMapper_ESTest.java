/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 18:53:51 GMT 2021
 */

package org.apache.xml.security.stax.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xml.security.configuration.JCEAlgorithmMappingsType;
import org.apache.xml.security.stax.config.JCEAlgorithmMapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JCEAlgorithmMapper_ESTest extends JCEAlgorithmMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        JCEAlgorithmMapper.init((JCEAlgorithmMappingsType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.config.JCEAlgorithmMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCEAlgorithmMappingsType jCEAlgorithmMappingsType0 = new JCEAlgorithmMappingsType();
      JCEAlgorithmMapper.init(jCEAlgorithmMappingsType0);
  }
}
