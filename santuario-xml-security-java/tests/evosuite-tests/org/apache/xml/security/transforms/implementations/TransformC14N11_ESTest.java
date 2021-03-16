/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 16:40:07 GMT 2021
 */

package org.apache.xml.security.transforms.implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315;
import org.apache.xml.security.transforms.implementations.TransformC14N11;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransformC14N11_ESTest extends TransformC14N11_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransformC14N11 transformC14N11_0 = new TransformC14N11();
      String string0 = transformC14N11_0.engineGetURI();
      assertEquals("http://www.w3.org/2006/12/xml-c14n11", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransformC14N11 transformC14N11_0 = new TransformC14N11();
      Canonicalizer20010315 canonicalizer20010315_0 = transformC14N11_0.getCanonicalizer();
      assertEquals("http://www.w3.org/2006/12/xml-c14n11", canonicalizer20010315_0.engineGetURI());
  }
}
