/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 19:30:30 GMT 2021
 */

package org.apache.xml.security.stax.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.xml.security.stax.ext.XMLSecurityConstants;
import org.apache.xml.security.stax.impl.DocumentContextImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentContextImpl_ESTest extends DocumentContextImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      HashMap<Integer, XMLSecurityConstants.ContentType> hashMap0 = new HashMap<Integer, XMLSecurityConstants.ContentType>();
      documentContextImpl0.setContentTypeMap(hashMap0);
      assertNull(documentContextImpl0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      documentContextImpl0.setIsInSignedContent((-602), documentContextImpl0);
      documentContextImpl0.unsetIsInSignedContent(documentContextImpl0);
      assertFalse(documentContextImpl0.isInSignedContent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      documentContextImpl0.setIsInEncryptedContent(1, "A$");
      documentContextImpl0.unsetIsInEncryptedContent("A$");
      assertFalse(documentContextImpl0.isInEncryptedContent());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      HashMap<Integer, XMLSecurityConstants.ContentType> hashMap0 = new HashMap<Integer, XMLSecurityConstants.ContentType>();
      documentContextImpl0.setIsInSignedContent(619, hashMap0);
      List<XMLSecurityConstants.ContentType> list0 = documentContextImpl0.getProtectionOrder();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      documentContextImpl0.setEncoding("$FCWD/|_tt!vj%>lt");
      String string0 = documentContextImpl0.getEncoding();
      assertEquals("$FCWD/|_tt!vj%>lt", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      documentContextImpl0.setBaseURI("http://www.w3.org/2001/04/xmlenc#aes192-cbc");
      String string0 = documentContextImpl0.getBaseURI();
      assertEquals("http://www.w3.org/2001/04/xmlenc#aes192-cbc", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      documentContextImpl0.setIsInSignedContent((-996), (Object) null);
      DocumentContextImpl documentContextImpl1 = documentContextImpl0.clone();
      assertNotSame(documentContextImpl1, documentContextImpl0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      Object object0 = new Object();
      documentContextImpl0.setIsInEncryptedContent(619, object0);
      DocumentContextImpl documentContextImpl1 = documentContextImpl0.clone();
      assertNotSame(documentContextImpl1, documentContextImpl0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      // Undeclared exception!
      try { 
        documentContextImpl0.setContentTypeMap((Map<Integer, XMLSecurityConstants.ContentType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      Map<Integer, XMLSecurityConstants.ContentType> map0 = documentContextImpl0.getContentTypeMap();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      documentContextImpl0.setBaseURI("");
      String string0 = documentContextImpl0.getBaseURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      documentContextImpl0.setEncoding("");
      String string0 = documentContextImpl0.getEncoding();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      boolean boolean0 = documentContextImpl0.isInSignedContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      assertFalse(documentContextImpl0.isInEncryptedContent());
      
      Object object0 = new Object();
      documentContextImpl0.setIsInEncryptedContent(619, object0);
      boolean boolean0 = documentContextImpl0.isInEncryptedContent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      boolean boolean0 = documentContextImpl0.isInEncryptedContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        documentContextImpl0.unsetIsInSignedContent(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      String string0 = documentContextImpl0.getBaseURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      String string0 = documentContextImpl0.getEncoding();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      List<XMLSecurityConstants.ContentType> list0 = documentContextImpl0.getProtectionOrder();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      // Undeclared exception!
      try { 
        documentContextImpl0.unsetIsInEncryptedContent((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      assertFalse(documentContextImpl0.isInSignedContent());
      
      HashMap<Integer, XMLSecurityConstants.ContentType> hashMap0 = new HashMap<Integer, XMLSecurityConstants.ContentType>();
      documentContextImpl0.setIsInSignedContent(619, hashMap0);
      boolean boolean0 = documentContextImpl0.isInSignedContent();
      assertTrue(boolean0);
  }
}
