/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 20:49:46 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.Classification;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Classification_ESTest extends Classification_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Classification classification0 = new Classification();
      classification0.setClassificationName("\n    ");
      String string0 = classification0.getClassificationName();
      assertEquals("\n    ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Classification classification0 = new Classification();
      classification0.classificationName("");
      String string0 = classification0.getClassificationName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Classification classification0 = new Classification();
      classification0.putClassificationPropertiesItem("    classificationProperties: ", "GI^6xRS'a'WGzW$");
      Map<String, Object> map0 = classification0.getClassificationProperties();
      classification0.putClassificationPropertiesItem("]|*4v*,0r", map0);
      // Undeclared exception!
      try { 
        classification0.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Classification classification0 = new Classification();
      classification0.putClassificationPropertiesItem((String) null, (Object) null);
      String string0 = classification0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Classification classification0 = new Classification();
      Object object0 = new Object();
      classification0.putClassificationPropertiesItem("", object0);
      Classification classification1 = new Classification();
      boolean boolean0 = classification0.equals(classification1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Classification classification0 = new Classification();
      Classification classification1 = classification0.classificationName("");
      Classification classification2 = new Classification();
      boolean boolean0 = classification1.equals(classification2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Classification classification0 = new Classification();
      LogLevel logLevel0 = LogLevel.ERROR;
      LoggingHandler loggingHandler0 = new LoggingHandler(logLevel0);
      boolean boolean0 = classification0.equals(loggingHandler0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Classification classification0 = new Classification();
      Classification classification1 = new Classification();
      boolean boolean0 = classification0.equals(classification1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Classification classification0 = new Classification();
      boolean boolean0 = classification0.equals(classification0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Classification classification0 = new Classification();
      boolean boolean0 = classification0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Classification classification0 = new Classification();
      Classification classification1 = classification0.classificationProperties((Map<String, Object>) null);
      assertNull(classification1.getClassificationName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Classification classification0 = new Classification();
      String string0 = classification0.getClassificationName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Classification classification0 = new Classification();
      classification0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Classification classification0 = new Classification();
      classification0.setClassificationProperties((Map<String, Object>) null);
      assertNull(classification0.getClassificationName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Classification classification0 = new Classification();
      Map<String, Object> map0 = classification0.getClassificationProperties();
      assertNull(map0);
  }
}
