/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 17:11:14 GMT 2021
 */

package org.apache.xml.security.algorithms;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageDigestAlgorithm_ESTest extends MessageDigestAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      boolean boolean0 = MessageDigestAlgorithm.isEqual(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = MessageDigestAlgorithm.isEqual((byte[]) null, (byte[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MessageDigestAlgorithm.getInstance((Document) null, ">Sjc\"#k8*nW/09e0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Document is null
         //
         verifyException("org.apache.xml.security.utils.SignatureElementProxy", e);
      }
  }
}
