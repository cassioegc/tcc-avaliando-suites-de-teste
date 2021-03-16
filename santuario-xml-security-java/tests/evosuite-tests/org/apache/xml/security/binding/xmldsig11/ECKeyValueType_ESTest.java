/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 17:51:49 GMT 2021
 */

package org.apache.xml.security.binding.xmldsig11;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.binding.xmldsig11.ECKeyValueType;
import org.apache.xml.security.binding.xmldsig11.ECParametersType;
import org.apache.xml.security.binding.xmldsig11.NamedCurveType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ECKeyValueType_ESTest extends ECKeyValueType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      ECParametersType eCParametersType0 = new ECParametersType();
      eCKeyValueType0.setECParameters(eCParametersType0);
      assertNull(eCKeyValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      byte[] byteArray0 = new byte[2];
      eCKeyValueType0.publicKey = byteArray0;
      byte[] byteArray1 = eCKeyValueType0.getPublicKey();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      byte[] byteArray0 = new byte[0];
      eCKeyValueType0.publicKey = byteArray0;
      byte[] byteArray1 = eCKeyValueType0.getPublicKey();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      eCKeyValueType0.id = "nR{#L:f)";
      String string0 = eCKeyValueType0.getId();
      assertEquals("nR{#L:f)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      eCKeyValueType0.setId("");
      String string0 = eCKeyValueType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      ECParametersType eCParametersType0 = new ECParametersType();
      eCKeyValueType0.ecParameters = eCParametersType0;
      ECParametersType eCParametersType1 = eCKeyValueType0.getECParameters();
      assertSame(eCParametersType1, eCParametersType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      NamedCurveType namedCurveType0 = new NamedCurveType();
      eCKeyValueType0.setNamedCurve(namedCurveType0);
      NamedCurveType namedCurveType1 = eCKeyValueType0.getNamedCurve();
      assertSame(namedCurveType1, namedCurveType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      String string0 = eCKeyValueType0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      NamedCurveType namedCurveType0 = eCKeyValueType0.getNamedCurve();
      assertNull(namedCurveType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      byte[] byteArray0 = new byte[2];
      eCKeyValueType0.setPublicKey(byteArray0);
      assertNull(eCKeyValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      byte[] byteArray0 = eCKeyValueType0.getPublicKey();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ECKeyValueType eCKeyValueType0 = new ECKeyValueType();
      ECParametersType eCParametersType0 = eCKeyValueType0.getECParameters();
      assertNull(eCParametersType0);
  }
}
