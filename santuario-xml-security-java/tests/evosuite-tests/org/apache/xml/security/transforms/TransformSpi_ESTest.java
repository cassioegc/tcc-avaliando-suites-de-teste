/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 16:55:39 GMT 2021
 */

package org.apache.xml.security.transforms;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransformSpi_ESTest extends TransformSpi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransformC14NExclusiveWithComments transformC14NExclusiveWithComments0 = new TransformC14NExclusiveWithComments();
  }
}
