/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 17:48:02 GMT 2021
 */

package org.apache.xml.security.binding.xmldsig.pss;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.binding.xmldsig.DigestMethodType;
import org.apache.xml.security.binding.xmldsig.pss.MaskGenerationFunctionType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaskGenerationFunctionType_ESTest extends MaskGenerationFunctionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MaskGenerationFunctionType maskGenerationFunctionType0 = new MaskGenerationFunctionType();
      DigestMethodType digestMethodType0 = new DigestMethodType();
      maskGenerationFunctionType0.setDigestMethod(digestMethodType0);
      DigestMethodType digestMethodType1 = maskGenerationFunctionType0.getDigestMethod();
      assertNull(digestMethodType1.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MaskGenerationFunctionType maskGenerationFunctionType0 = new MaskGenerationFunctionType();
      maskGenerationFunctionType0.algorithm = "";
      String string0 = maskGenerationFunctionType0.getAlgorithm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaskGenerationFunctionType maskGenerationFunctionType0 = new MaskGenerationFunctionType();
      String string0 = maskGenerationFunctionType0.getAlgorithm();
      assertNotNull(string0);
      assertEquals("http://www.w3.org/2007/05/xmldsig-more#MGF1", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaskGenerationFunctionType maskGenerationFunctionType0 = new MaskGenerationFunctionType();
      DigestMethodType digestMethodType0 = maskGenerationFunctionType0.getDigestMethod();
      assertNull(digestMethodType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MaskGenerationFunctionType maskGenerationFunctionType0 = new MaskGenerationFunctionType();
      maskGenerationFunctionType0.setAlgorithm("http://www.w3.org/2007/05/xmldsig-more#MGF1");
      String string0 = maskGenerationFunctionType0.getAlgorithm();
      assertEquals("http://www.w3.org/2007/05/xmldsig-more#MGF1", string0);
  }
}
