/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 23:51:51 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.AssetAggregatedCommentsMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AssetAggregatedCommentsMetadata_ESTest extends AssetAggregatedCommentsMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata1 = assetAggregatedCommentsMetadata0.timeZoneOffset("6bq-d?tE\"5Y_");
      String string0 = assetAggregatedCommentsMetadata1.getTimeZoneOffset();
      assertEquals("6bq-d?tE\"5Y_", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      assetAggregatedCommentsMetadata0.timeZoneOffset("");
      String string0 = assetAggregatedCommentsMetadata0.getTimeZoneOffset();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata1 = assetAggregatedCommentsMetadata0.dayOfEvent("NON_DEFAULT");
      String string0 = assetAggregatedCommentsMetadata1.getDayOfEvent();
      assertEquals("NON_DEFAULT", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      assetAggregatedCommentsMetadata0.dayOfEvent("");
      String string0 = assetAggregatedCommentsMetadata0.getDayOfEvent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata1 = new AssetAggregatedCommentsMetadata();
      assertTrue(assetAggregatedCommentsMetadata1.equals((Object)assetAggregatedCommentsMetadata0));
      
      assetAggregatedCommentsMetadata1.timeZoneOffset("zu^X~1dXm");
      boolean boolean0 = assetAggregatedCommentsMetadata0.equals(assetAggregatedCommentsMetadata1);
      assertFalse(assetAggregatedCommentsMetadata1.equals((Object)assetAggregatedCommentsMetadata0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata1 = new AssetAggregatedCommentsMetadata();
      boolean boolean0 = assetAggregatedCommentsMetadata0.equals(assetAggregatedCommentsMetadata1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      Object object0 = new Object();
      boolean boolean0 = assetAggregatedCommentsMetadata0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      boolean boolean0 = assetAggregatedCommentsMetadata0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      boolean boolean0 = assetAggregatedCommentsMetadata0.equals(assetAggregatedCommentsMetadata0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      assetAggregatedCommentsMetadata0.setDayOfEvent("sDe)yukPUxK%K");
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata1 = new AssetAggregatedCommentsMetadata();
      boolean boolean0 = assetAggregatedCommentsMetadata0.equals(assetAggregatedCommentsMetadata1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      assetAggregatedCommentsMetadata0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      assetAggregatedCommentsMetadata0.timeZoneOffset("zu^X~1dXm");
      String string0 = assetAggregatedCommentsMetadata0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      String string0 = assetAggregatedCommentsMetadata0.getDayOfEvent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      assetAggregatedCommentsMetadata0.setTimeZoneOffset("NON_NULL");
      assertEquals("NON_NULL", assetAggregatedCommentsMetadata0.getTimeZoneOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata0 = new AssetAggregatedCommentsMetadata();
      String string0 = assetAggregatedCommentsMetadata0.getTimeZoneOffset();
      assertNull(string0);
  }
}
