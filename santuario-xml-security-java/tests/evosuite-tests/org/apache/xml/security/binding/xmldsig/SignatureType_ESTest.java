/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 17:44:37 GMT 2021
 */

package org.apache.xml.security.binding.xmldsig;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.xml.security.binding.xmldsig.KeyInfoType;
import org.apache.xml.security.binding.xmldsig.ObjectType;
import org.apache.xml.security.binding.xmldsig.SignatureType;
import org.apache.xml.security.binding.xmldsig.SignatureValueType;
import org.apache.xml.security.binding.xmldsig.SignedInfoType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SignatureType_ESTest extends SignatureType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = new SignedInfoType();
      signatureType0.setSignedInfo(signedInfoType0);
      SignedInfoType signedInfoType1 = signatureType0.getSignedInfo();
      assertNull(signedInfoType1.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = new SignatureValueType();
      signatureType0.setSignatureValue(signatureValueType0);
      SignatureValueType signatureValueType1 = signatureType0.getSignatureValue();
      assertSame(signatureValueType1, signatureValueType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      LinkedList<ObjectType> linkedList0 = new LinkedList<ObjectType>();
      signatureType0.object = (List<ObjectType>) linkedList0;
      ObjectType objectType0 = new ObjectType();
      linkedList0.add(objectType0);
      List<ObjectType> list0 = signatureType0.getObject();
      assertTrue(list0.contains(objectType0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = new KeyInfoType();
      signatureType0.setKeyInfo(keyInfoType0);
      KeyInfoType keyInfoType1 = signatureType0.getKeyInfo();
      assertSame(keyInfoType1, keyInfoType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.setId("org.apache.xml.security.binding.xmldsig.SignatureMethodType");
      String string0 = signatureType0.getId();
      assertEquals("org.apache.xml.security.binding.xmldsig.SignatureMethodType", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      signatureType0.setId("");
      String string0 = signatureType0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      List<ObjectType> list0 = signatureType0.getObject();
      List<ObjectType> list1 = signatureType0.getObject();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      String string0 = signatureType0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignatureValueType signatureValueType0 = signatureType0.getSignatureValue();
      assertNull(signatureValueType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      SignedInfoType signedInfoType0 = signatureType0.getSignedInfo();
      assertNull(signedInfoType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SignatureType signatureType0 = new SignatureType();
      KeyInfoType keyInfoType0 = signatureType0.getKeyInfo();
      assertNull(keyInfoType0);
  }
}
