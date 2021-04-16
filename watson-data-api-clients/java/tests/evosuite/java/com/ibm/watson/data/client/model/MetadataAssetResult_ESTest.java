/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 20:32:54 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.Attachment;
import com.ibm.watson.data.client.model.MetadataAsset;
import com.ibm.watson.data.client.model.MetadataAssetResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MetadataAssetResult_ESTest extends MetadataAssetResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "");
      metadataAssetResult0.toString(stringBuilder0);
      assertEquals("    metadata: null\n    attachments: null\n    href: null\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      MetadataAsset metadataAsset0 = new MetadataAsset();
      metadataAssetResult0.metadata(metadataAsset0);
      MetadataAsset metadataAsset1 = metadataAssetResult0.getMetadata();
      assertNull(metadataAsset1.getCreated());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      metadataAssetResult0.href("elastic-evictor-");
      String string0 = metadataAssetResult0.getHref();
      assertEquals("elastic-evictor-", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      Vector<Attachment> vector0 = new Vector<Attachment>();
      metadataAssetResult0.attachments(vector0);
      List<Attachment> list0 = metadataAssetResult0.getAttachments();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      // Undeclared exception!
      try { 
        metadataAssetResult0.toString((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.watson.data.client.model.MetadataAssetResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      String string0 = metadataAssetResult0.toIndentedString(metadataAssetResult0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      MetadataAsset metadataAsset0 = new MetadataAsset();
      MetadataAssetResult metadataAssetResult1 = metadataAssetResult0.metadata(metadataAsset0);
      metadataAssetResult1.setHref("");
      MetadataAssetResult metadataAssetResult2 = new MetadataAssetResult();
      MetadataAssetResult metadataAssetResult3 = metadataAssetResult2.metadata(metadataAsset0);
      boolean boolean0 = metadataAssetResult1.equals(metadataAssetResult3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      boolean boolean0 = metadataAssetResult0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      MetadataAssetResult metadataAssetResult1 = new MetadataAssetResult();
      boolean boolean0 = metadataAssetResult1.equals(metadataAssetResult0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      boolean boolean0 = metadataAssetResult0.equals(metadataAssetResult0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      boolean boolean0 = metadataAssetResult0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      Attachment attachment0 = new Attachment();
      metadataAssetResult0.addAttachmentsItem(attachment0);
      List<Attachment> list0 = metadataAssetResult0.getAttachments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      metadataAssetResult0.setHref("");
      String string0 = metadataAssetResult0.getHref();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      MetadataAsset metadataAsset0 = metadataAssetResult0.getMetadata();
      assertNull(metadataAsset0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      metadataAssetResult0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      MetadataAsset metadataAsset0 = new MetadataAsset();
      metadataAssetResult0.setMetadata(metadataAsset0);
      MetadataAssetResult metadataAssetResult1 = new MetadataAssetResult();
      boolean boolean0 = metadataAssetResult1.equals(metadataAssetResult0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      MetadataAsset metadataAsset0 = new MetadataAsset();
      MetadataAssetResult metadataAssetResult1 = metadataAssetResult0.metadata(metadataAsset0);
      MetadataAssetResult metadataAssetResult2 = new MetadataAssetResult();
      Stack<Attachment> stack0 = new Stack<Attachment>();
      metadataAssetResult2.attachments(stack0);
      MetadataAssetResult metadataAssetResult3 = metadataAssetResult2.metadata(metadataAsset0);
      boolean boolean0 = metadataAssetResult1.equals(metadataAssetResult3);
      assertFalse(metadataAssetResult2.equals((Object)metadataAssetResult0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      String string0 = metadataAssetResult0.toString();
      assertEquals("class MetadataAssetResult {\n    metadata: null\n    attachments: null\n    href: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      String string0 = metadataAssetResult0.getHref();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      List<Attachment> list0 = metadataAssetResult0.getAttachments();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      Stack<Attachment> stack0 = new Stack<Attachment>();
      metadataAssetResult0.setAttachments(stack0);
      assertEquals(0, stack0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MetadataAssetResult metadataAssetResult0 = new MetadataAssetResult();
      ArrayList<Attachment> arrayList0 = new ArrayList<Attachment>();
      MetadataAssetResult metadataAssetResult1 = metadataAssetResult0.attachments(arrayList0);
      Attachment attachment0 = new Attachment();
      metadataAssetResult1.addAttachmentsItem(attachment0);
      assertTrue(arrayList0.contains(attachment0));
      assertFalse(arrayList0.isEmpty());
  }
}
