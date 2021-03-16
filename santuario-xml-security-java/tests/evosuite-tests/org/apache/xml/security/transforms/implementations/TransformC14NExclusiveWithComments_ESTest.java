/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 16:45:04 GMT 2021
 */

package org.apache.xml.security.transforms.implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315Excl;
import org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransformC14NExclusiveWithComments_ESTest extends TransformC14NExclusiveWithComments_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransformC14NExclusiveWithComments transformC14NExclusiveWithComments0 = new TransformC14NExclusiveWithComments();
      String string0 = transformC14NExclusiveWithComments0.engineGetURI();
      assertEquals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransformC14NExclusiveWithComments transformC14NExclusiveWithComments0 = new TransformC14NExclusiveWithComments();
      Canonicalizer20010315Excl canonicalizer20010315Excl0 = transformC14NExclusiveWithComments0.getCanonicalizer();
      assertEquals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", canonicalizer20010315Excl0.engineGetURI());
  }
}
