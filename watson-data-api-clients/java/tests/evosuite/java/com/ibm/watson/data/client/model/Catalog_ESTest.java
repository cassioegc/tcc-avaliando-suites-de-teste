/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 21:22:49 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.Catalog;
import com.ibm.watson.data.client.model.CatalogEntity;
import com.ibm.watson.data.client.model.CatalogMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Catalog_ESTest extends Catalog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      CatalogMetadata catalogMetadata0 = new CatalogMetadata();
      catalog0.metadata(catalogMetadata0);
      CatalogMetadata catalogMetadata1 = catalog0.getMetadata();
      assertNull(catalogMetadata1.getCreatorId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      catalog0.setHref("null");
      String string0 = catalog0.getHref();
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      Catalog catalog1 = new Catalog();
      assertTrue(catalog1.equals((Object)catalog0));
      
      catalog1.setHref("");
      CatalogMetadata catalogMetadata0 = new CatalogMetadata();
      Catalog catalog2 = catalog1.metadata(catalogMetadata0);
      Catalog catalog3 = catalog0.metadata(catalogMetadata0);
      boolean boolean0 = catalog2.equals(catalog3);
      assertFalse(catalog1.equals((Object)catalog0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      Catalog catalog1 = new Catalog();
      assertTrue(catalog1.equals((Object)catalog0));
      
      CatalogEntity catalogEntity0 = new CatalogEntity();
      catalog1.entity(catalogEntity0);
      boolean boolean0 = catalog0.equals(catalog1);
      assertFalse(catalog1.equals((Object)catalog0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      CatalogMetadata catalogMetadata0 = new CatalogMetadata();
      Catalog catalog1 = new Catalog();
      catalog1.setMetadata(catalogMetadata0);
      boolean boolean0 = catalog1.equals(catalog0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      Catalog catalog1 = new Catalog();
      boolean boolean0 = catalog1.equals(catalog0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      boolean boolean0 = catalog0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      boolean boolean0 = catalog0.equals(catalog0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      Object object0 = new Object();
      boolean boolean0 = catalog0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      String string0 = catalog0.toString();
      assertEquals("class Catalog {\n    metadata: null\n    entity: null\n    href: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      catalog0.setHref("");
      String string0 = catalog0.getHref();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      CatalogMetadata catalogMetadata0 = catalog0.getMetadata();
      assertNull(catalogMetadata0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      catalog0.setEntity((CatalogEntity) null);
      assertNull(catalog0.getHref());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      CatalogMetadata catalogMetadata0 = new CatalogMetadata();
      Catalog catalog1 = catalog0.metadata(catalogMetadata0);
      String string0 = catalog1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      catalog0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      String string0 = catalog0.getHref();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      CatalogEntity catalogEntity0 = catalog0.getEntity();
      assertNull(catalogEntity0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Catalog catalog0 = new Catalog();
      CatalogEntity catalogEntity0 = new CatalogEntity();
      catalog0.entity(catalogEntity0);
      CatalogEntity catalogEntity1 = catalog0.getEntity();
      assertNull(catalogEntity1.getSamlInstanceName());
  }
}
