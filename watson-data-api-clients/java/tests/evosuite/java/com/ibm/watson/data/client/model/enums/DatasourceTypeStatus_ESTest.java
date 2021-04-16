/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:19:26 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.DatasourceTypeStatus;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatasourceTypeStatus_ESTest extends DatasourceTypeStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.fromValue("internal");
      assertEquals(DatasourceTypeStatus.INTERNAL, datasourceTypeStatus0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DatasourceTypeStatus[] datasourceTypeStatusArray0 = DatasourceTypeStatus.values();
      assertEquals(6, datasourceTypeStatusArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.valueOf("INTERNAL");
      assertEquals("internal", datasourceTypeStatus0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.fromValue("system");
      assertEquals(DatasourceTypeStatus.SYSTEM, datasourceTypeStatus0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatasourceTypeStatus.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value ''
         //
         verifyException("com.ibm.watson.data.client.model.enums.DatasourceTypeStatus", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.INTERNAL;
      String string0 = datasourceTypeStatus0.getValue();
      assertEquals("internal", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.INTERNAL;
      String string0 = datasourceTypeStatus0.toString();
      assertEquals("internal", string0);
  }
}
