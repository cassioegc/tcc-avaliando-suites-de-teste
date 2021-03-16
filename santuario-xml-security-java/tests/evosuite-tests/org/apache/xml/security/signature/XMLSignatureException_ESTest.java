/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 22:12:34 GMT 2021
 */

package org.apache.xml.security.signature;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xml.security.signature.XMLSignatureException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLSignatureException_ESTest extends XMLSignatureException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLSignatureException xMLSignatureException0 = null;
      try {
        xMLSignatureException0 = new XMLSignatureException((Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.exceptions.XMLSecurityException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMLSignatureException xMLSignatureException0 = new XMLSignatureException(".v!eB\"qz|iW?oX<]gp");
      StackTraceElement[] stackTraceElementArray0 = xMLSignatureException0.getStackTrace();
      XMLSignatureException xMLSignatureException1 = new XMLSignatureException(xMLSignatureException0, "/<^hW&00x", stackTraceElementArray0);
      assertFalse(xMLSignatureException1.equals((Object)xMLSignatureException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLSignatureException xMLSignatureException0 = new XMLSignatureException(".v!eB\"qz|iW?oX<]gp");
      XMLSignatureException xMLSignatureException1 = new XMLSignatureException(xMLSignatureException0, "Missing message string");
      assertFalse(xMLSignatureException1.equals((Object)xMLSignatureException0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      XMLSignatureException xMLSignatureException0 = new XMLSignatureException("Missing message string", objectArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XMLSignatureException xMLSignatureException0 = new XMLSignatureException();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XMLSignatureException xMLSignatureException0 = new XMLSignatureException(".v!eB\"qz|iW?oX<]gp");
      XMLSignatureException xMLSignatureException1 = new XMLSignatureException(xMLSignatureException0);
      assertFalse(xMLSignatureException1.equals((Object)xMLSignatureException0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XMLSignatureException xMLSignatureException0 = new XMLSignatureException(".v!eB\"qz|iW?oX<]gp");
      Object[] objectArray0 = new Object[9];
      XMLSignatureException xMLSignatureException1 = new XMLSignatureException(":EK]upMrOZMX_0]K?L", objectArray0, xMLSignatureException0);
      assertFalse(xMLSignatureException1.equals((Object)xMLSignatureException0));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XMLSignatureException xMLSignatureException0 = new XMLSignatureException(".v!eB\"qz|iW?oX<]gp");
      XMLSignatureException xMLSignatureException1 = new XMLSignatureException("Missing message string", xMLSignatureException0);
      assertFalse(xMLSignatureException1.equals((Object)xMLSignatureException0));
  }
}
