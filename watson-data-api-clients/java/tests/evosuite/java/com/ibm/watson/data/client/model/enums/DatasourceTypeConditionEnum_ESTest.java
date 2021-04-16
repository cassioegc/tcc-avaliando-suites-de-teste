/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:39:45 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatasourceTypeConditionEnum_ESTest extends DatasourceTypeConditionEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = DatasourceTypeConditionEnum.fromValue("not_equals");
      assertEquals(DatasourceTypeConditionEnum.NOT_EQUALS, datasourceTypeConditionEnum0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DatasourceTypeConditionEnum[] datasourceTypeConditionEnumArray0 = DatasourceTypeConditionEnum.values();
      assertEquals(14, datasourceTypeConditionEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = DatasourceTypeConditionEnum.valueOf("NOT_SET");
      assertEquals(DatasourceTypeConditionEnum.NOT_SET, datasourceTypeConditionEnum0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = DatasourceTypeConditionEnum.fromValue("not_set");
      assertEquals(DatasourceTypeConditionEnum.NOT_SET, datasourceTypeConditionEnum0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatasourceTypeConditionEnum.fromValue("ues");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'ues'
         //
         verifyException("com.ibm.watson.data.client.model.enums.DatasourceTypeConditionEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = DatasourceTypeConditionEnum.NOT_SET;
      String string0 = datasourceTypeConditionEnum0.toString();
      assertEquals("not_set", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DatasourceTypeConditionEnum datasourceTypeConditionEnum0 = DatasourceTypeConditionEnum.NOT_SET;
      String string0 = datasourceTypeConditionEnum0.getValue();
      assertEquals("not_set", string0);
  }
}
