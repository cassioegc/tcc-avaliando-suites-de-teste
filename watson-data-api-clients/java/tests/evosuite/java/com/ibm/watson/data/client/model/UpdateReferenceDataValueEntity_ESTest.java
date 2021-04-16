/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 01:01:48 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.UpdateReferenceDataValueEntity;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UpdateReferenceDataValueEntity_ESTest extends UpdateReferenceDataValueEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      updateReferenceDataValueEntity0.setRevision("\n");
      String string0 = updateReferenceDataValueEntity0.getRevision();
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      updateReferenceDataValueEntity0.setRevision("");
      String string0 = updateReferenceDataValueEntity0.getRevision();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity1 = new UpdateReferenceDataValueEntity();
      boolean boolean0 = updateReferenceDataValueEntity0.equals(updateReferenceDataValueEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      boolean boolean0 = updateReferenceDataValueEntity0.equals("com.ibm.watson.data.client.model.ReferenceDataValueEntity");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      boolean boolean0 = updateReferenceDataValueEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      boolean boolean0 = updateReferenceDataValueEntity0.equals(updateReferenceDataValueEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      updateReferenceDataValueEntity0.setValue("");
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity1 = new UpdateReferenceDataValueEntity();
      boolean boolean0 = updateReferenceDataValueEntity0.equals(updateReferenceDataValueEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      String string0 = updateReferenceDataValueEntity0.toString();
      assertEquals("class UpdateReferenceDataValueEntity {\n    code: null\n    value: null\n    description: null\n    revision: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      updateReferenceDataValueEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      updateReferenceDataValueEntity0.setRevision("}");
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity1 = new UpdateReferenceDataValueEntity();
      boolean boolean0 = updateReferenceDataValueEntity0.equals(updateReferenceDataValueEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UpdateReferenceDataValueEntity updateReferenceDataValueEntity0 = new UpdateReferenceDataValueEntity();
      String string0 = updateReferenceDataValueEntity0.getRevision();
      assertNull(string0);
  }
}
