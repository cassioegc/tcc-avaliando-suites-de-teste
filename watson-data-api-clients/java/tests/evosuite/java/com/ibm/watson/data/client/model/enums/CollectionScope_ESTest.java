/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:44:49 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.CollectionScope;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionScope_ESTest extends CollectionScope_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CollectionScope collectionScope0 = CollectionScope.fromValue("USER");
      assertEquals(CollectionScope.USER, collectionScope0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CollectionScope[] collectionScopeArray0 = CollectionScope.values();
      assertEquals(2, collectionScopeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionScope collectionScope0 = CollectionScope.valueOf("CATALOG");
      assertEquals("CATALOG", collectionScope0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CollectionScope collectionScope0 = CollectionScope.fromValue("CATALOG");
      assertEquals(CollectionScope.CATALOG, collectionScope0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        CollectionScope.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value ''
         //
         verifyException("com.ibm.watson.data.client.model.enums.CollectionScope", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CollectionScope collectionScope0 = CollectionScope.CATALOG;
      String string0 = collectionScope0.getValue();
      assertEquals("CATALOG", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CollectionScope collectionScope0 = CollectionScope.CATALOG;
      String string0 = collectionScope0.toString();
      assertEquals("CATALOG", string0);
  }
}
