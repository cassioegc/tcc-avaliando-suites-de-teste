/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 18:10:03 GMT 2021
 */

package org.apache.xml.security.binding.xmlenc11;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlgorithmIdentifierType_ESTest extends AlgorithmIdentifierType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlgorithmIdentifierType algorithmIdentifierType0 = new AlgorithmIdentifierType();
      algorithmIdentifierType0.setParameters("org.apache.xml.security.binding.xmlenc11.AlgorithmIdentifierType");
      assertNull(algorithmIdentifierType0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AlgorithmIdentifierType algorithmIdentifierType0 = new AlgorithmIdentifierType();
      algorithmIdentifierType0.parameters = (Object) "";
      Object object0 = algorithmIdentifierType0.getParameters();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AlgorithmIdentifierType algorithmIdentifierType0 = new AlgorithmIdentifierType();
      algorithmIdentifierType0.setAlgorithm("oIF<hq5{g8N");
      String string0 = algorithmIdentifierType0.getAlgorithm();
      assertEquals("oIF<hq5{g8N", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AlgorithmIdentifierType algorithmIdentifierType0 = new AlgorithmIdentifierType();
      algorithmIdentifierType0.setAlgorithm("");
      String string0 = algorithmIdentifierType0.getAlgorithm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AlgorithmIdentifierType algorithmIdentifierType0 = new AlgorithmIdentifierType();
      String string0 = algorithmIdentifierType0.getAlgorithm();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AlgorithmIdentifierType algorithmIdentifierType0 = new AlgorithmIdentifierType();
      Object object0 = algorithmIdentifierType0.getParameters();
      assertNull(object0);
  }
}
