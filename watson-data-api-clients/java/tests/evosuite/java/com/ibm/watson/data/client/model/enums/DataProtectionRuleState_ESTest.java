/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:51:33 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.DataProtectionRuleState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataProtectionRuleState_ESTest extends DataProtectionRuleState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataProtectionRuleState dataProtectionRuleState0 = DataProtectionRuleState.fromValue("draft");
      assertEquals(DataProtectionRuleState.DRAFT, dataProtectionRuleState0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataProtectionRuleState[] dataProtectionRuleStateArray0 = DataProtectionRuleState.values();
      assertEquals(3, dataProtectionRuleStateArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataProtectionRuleState dataProtectionRuleState0 = DataProtectionRuleState.valueOf("ACTIVE");
      assertEquals("active", dataProtectionRuleState0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DataProtectionRuleState dataProtectionRuleState0 = DataProtectionRuleState.fromValue("archived");
      assertEquals(DataProtectionRuleState.ARCHIVED, dataProtectionRuleState0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataProtectionRuleState.fromValue("PROPERTIES");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'PROPERTIES'
         //
         verifyException("com.ibm.watson.data.client.model.enums.DataProtectionRuleState", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DataProtectionRuleState dataProtectionRuleState0 = DataProtectionRuleState.ARCHIVED;
      String string0 = dataProtectionRuleState0.toString();
      assertEquals("archived", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DataProtectionRuleState dataProtectionRuleState0 = DataProtectionRuleState.ARCHIVED;
      String string0 = dataProtectionRuleState0.getValue();
      assertEquals("archived", string0);
  }
}
