/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 00:17:15 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.GlossaryObjectMetadata;
import com.ibm.watson.data.client.model.RelationshipObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RelationshipObject_ESTest extends RelationshipObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      GlossaryObjectMetadata glossaryObjectMetadata0 = new GlossaryObjectMetadata();
      relationshipObject0.metadata(glossaryObjectMetadata0);
      GlossaryObjectMetadata glossaryObjectMetadata1 = relationshipObject0.getMetadata();
      assertNull(glossaryObjectMetadata1.getRemoveEndDate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      boolean boolean0 = relationshipObject0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      boolean boolean0 = relationshipObject0.equals(relationshipObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      boolean boolean0 = relationshipObject0.equals("5vtBP'S3lHCu;/!:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      Object object0 = new Object();
      relationshipObject0.setEntity(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      Object object0 = relationshipObject0.getEntity();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      GlossaryObjectMetadata glossaryObjectMetadata0 = new GlossaryObjectMetadata();
      relationshipObject0.setMetadata(glossaryObjectMetadata0);
      assertNull(glossaryObjectMetadata0.getDraftMode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      GlossaryObjectMetadata glossaryObjectMetadata0 = new GlossaryObjectMetadata();
      RelationshipObject relationshipObject1 = relationshipObject0.metadata(glossaryObjectMetadata0);
      String string0 = relationshipObject1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      relationshipObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      GlossaryObjectMetadata glossaryObjectMetadata0 = relationshipObject0.getMetadata();
      assertNull(glossaryObjectMetadata0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RelationshipObject relationshipObject0 = new RelationshipObject();
      Integer integer0 = new Integer((-65));
      relationshipObject0.entity(integer0);
      Object object0 = relationshipObject0.getEntity();
      assertEquals((-65), object0);
  }
}
