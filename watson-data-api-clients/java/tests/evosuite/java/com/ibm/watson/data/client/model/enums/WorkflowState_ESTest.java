/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:24:16 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.WorkflowState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WorkflowState_ESTest extends WorkflowState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WorkflowState workflowState0 = WorkflowState.fromValue("suspended");
      assertEquals(WorkflowState.SUSPENDED, workflowState0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorkflowState[] workflowStateArray0 = WorkflowState.values();
      assertEquals(6, workflowStateArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorkflowState workflowState0 = WorkflowState.valueOf("DELETED");
      assertEquals(WorkflowState.DELETED, workflowState0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WorkflowState workflowState0 = WorkflowState.fromValue("deleted");
      assertEquals(WorkflowState.DELETED, workflowState0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        WorkflowState.fromValue("vVR+MX7Ql");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'vVR+MX7Ql'
         //
         verifyException("com.ibm.watson.data.client.model.enums.WorkflowState", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WorkflowState workflowState0 = WorkflowState.DELETED;
      String string0 = workflowState0.getValue();
      assertEquals("deleted", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WorkflowState workflowState0 = WorkflowState.DELETED;
      String string0 = workflowState0.toString();
      assertEquals("deleted", string0);
  }
}
