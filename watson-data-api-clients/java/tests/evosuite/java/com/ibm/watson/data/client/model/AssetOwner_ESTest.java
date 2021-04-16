/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 00:10:50 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.AssetOwner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AssetOwner_ESTest extends AssetOwner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      AssetOwner assetOwner1 = assetOwner0.ownerId("-E|j.$,sNiLQFLud");
      String string0 = assetOwner1.getOwnerId();
      assertEquals("-E|j.$,sNiLQFLud", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      assetOwner0.ownerId("");
      String string0 = assetOwner0.getOwnerId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      assetOwner0.owner("");
      String string0 = assetOwner0.getOwner();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      AssetOwner assetOwner1 = assetOwner0.ownerId("SO");
      String string0 = assetOwner1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      AssetOwner assetOwner1 = new AssetOwner();
      boolean boolean0 = assetOwner0.equals(assetOwner1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      AssetOwner assetOwner1 = new AssetOwner();
      assetOwner0.setOwner("class AssetOwner {\n    owner: null\n    ownerId: null\n}");
      boolean boolean0 = assetOwner0.equals(assetOwner1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      boolean boolean0 = assetOwner0.equals("class AssetOwner {\n    owner: null\n    ownerId: null\n}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      boolean boolean0 = assetOwner0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      boolean boolean0 = assetOwner0.equals(assetOwner0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      AssetOwner assetOwner1 = assetOwner0.ownerId("SO");
      AssetOwner assetOwner2 = new AssetOwner();
      boolean boolean0 = assetOwner1.equals(assetOwner2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      String string0 = assetOwner0.getOwner();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      String string0 = assetOwner0.getOwnerId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      assetOwner0.owner("SO");
      String string0 = assetOwner0.getOwner();
      assertEquals("SO", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      assetOwner0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AssetOwner assetOwner0 = new AssetOwner();
      assetOwner0.setOwnerId("class AssetOwner {\n    owner: null\n    ownerId: null\n}");
      assertEquals("class AssetOwner {\n    owner: null\n    ownerId: null\n}", assetOwner0.getOwnerId());
  }
}
