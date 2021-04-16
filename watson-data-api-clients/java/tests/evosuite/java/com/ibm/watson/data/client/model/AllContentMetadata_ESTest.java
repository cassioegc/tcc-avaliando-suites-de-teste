/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 22:30:21 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.AllContentMetadata;
import com.ibm.watson.data.client.model.ContentMetadata;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AllContentMetadata_ESTest extends AllContentMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      Integer integer0 = new Integer((-524));
      allContentMetadata0.totalCount(integer0);
      Integer integer1 = allContentMetadata0.getTotalCount();
      assertEquals((-524), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      Integer integer0 = new Integer(0);
      allContentMetadata0.totalCount(integer0);
      Integer integer1 = allContentMetadata0.getTotalCount();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      Integer integer0 = XmlSuite.DEFAULT_DATA_PROVIDER_THREAD_COUNT;
      AllContentMetadata allContentMetadata1 = allContentMetadata0.totalCount(integer0);
      Integer integer1 = allContentMetadata1.getTotalCount();
      assertEquals(10, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      AllContentMetadata allContentMetadata1 = allContentMetadata0.attachments((List<ContentMetadata>) null);
      List<ContentMetadata> list0 = allContentMetadata1.getAttachments();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      allContentMetadata0.addAttachmentsItem((ContentMetadata) null);
      List<ContentMetadata> list0 = allContentMetadata0.getAttachments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      AllContentMetadata allContentMetadata1 = allContentMetadata0.attachments((List<ContentMetadata>) null);
      ContentMetadata contentMetadata0 = new ContentMetadata();
      // Undeclared exception!
      try { 
        allContentMetadata1.addAttachmentsItem(contentMetadata0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.watson.data.client.model.AllContentMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      AllContentMetadata allContentMetadata1 = allContentMetadata0.addAttachmentsItem((ContentMetadata) null);
      AllContentMetadata allContentMetadata2 = new AllContentMetadata();
      boolean boolean0 = allContentMetadata1.equals(allContentMetadata2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      Integer integer0 = new Integer(1008);
      AllContentMetadata allContentMetadata1 = new AllContentMetadata();
      List<ContentMetadata> list0 = allContentMetadata1.getAttachments();
      AllContentMetadata allContentMetadata2 = allContentMetadata1.attachments(list0);
      allContentMetadata0.setTotalCount(integer0);
      boolean boolean0 = allContentMetadata2.equals(allContentMetadata0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      AllContentMetadata allContentMetadata1 = new AllContentMetadata();
      boolean boolean0 = allContentMetadata0.equals(allContentMetadata1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      boolean boolean0 = allContentMetadata0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      boolean boolean0 = allContentMetadata0.equals(allContentMetadata0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      boolean boolean0 = allContentMetadata0.equals("1008");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      String string0 = allContentMetadata0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      List<ContentMetadata> list0 = allContentMetadata0.getAttachments();
      allContentMetadata0.setAttachments(list0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      allContentMetadata0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AllContentMetadata allContentMetadata0 = new AllContentMetadata();
      Integer integer0 = allContentMetadata0.getTotalCount();
      assertNull(integer0);
  }
}
