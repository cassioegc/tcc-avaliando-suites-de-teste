/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 18:07:43 GMT 2021
 */

package org.apache.xml.security.binding.xmlenc;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.xml.security.binding.xmlenc.AgreementMethodType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AgreementMethodType_ESTest extends AgreementMethodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AgreementMethodType agreementMethodType0 = new AgreementMethodType();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      agreementMethodType0.content = (List<Object>) linkedList0;
      linkedList0.add((Object) "");
      List<Object> list0 = agreementMethodType0.getContent();
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AgreementMethodType agreementMethodType0 = new AgreementMethodType();
      agreementMethodType0.algorithm = "org.apache.xml.security.binding.xmlenc.AgreementMethodType";
      String string0 = agreementMethodType0.getAlgorithm();
      assertEquals("org.apache.xml.security.binding.xmlenc.AgreementMethodType", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AgreementMethodType agreementMethodType0 = new AgreementMethodType();
      agreementMethodType0.setAlgorithm("");
      String string0 = agreementMethodType0.getAlgorithm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AgreementMethodType agreementMethodType0 = new AgreementMethodType();
      agreementMethodType0.getContent();
      List<Object> list0 = agreementMethodType0.getContent();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AgreementMethodType agreementMethodType0 = new AgreementMethodType();
      String string0 = agreementMethodType0.getAlgorithm();
      assertNull(string0);
  }
}
