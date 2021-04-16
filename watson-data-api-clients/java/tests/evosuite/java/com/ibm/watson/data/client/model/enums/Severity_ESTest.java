/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:43:58 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.Severity;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Severity_ESTest extends Severity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Severity severity0 = Severity.fromValue("error");
      assertEquals(Severity.ERROR, severity0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Severity[] severityArray0 = Severity.values();
      assertEquals(3, severityArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Severity severity0 = Severity.valueOf("INFO");
      assertEquals("info", severity0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Severity severity0 = Severity.fromValue("warning");
      assertEquals(Severity.WARNING, severity0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        Severity.fromValue("ERROR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'ERROR'
         //
         verifyException("com.ibm.watson.data.client.model.enums.Severity", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Severity severity0 = Severity.WARNING;
      String string0 = severity0.getValue();
      assertEquals("warning", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Severity severity0 = Severity.WARNING;
      String string0 = severity0.toString();
      assertEquals("warning", string0);
  }
}
