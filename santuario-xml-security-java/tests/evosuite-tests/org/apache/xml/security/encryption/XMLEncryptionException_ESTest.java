/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 17:11:22 GMT 2021
 */

package org.apache.xml.security.encryption;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xml.security.encryption.XMLEncryptionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLEncryptionException_ESTest extends XMLEncryptionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLEncryptionException xMLEncryptionException0 = null;
      try {
        xMLEncryptionException0 = new XMLEncryptionException((Exception) null);
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
      XMLEncryptionException xMLEncryptionException0 = new XMLEncryptionException("");
      XMLEncryptionException xMLEncryptionException1 = new XMLEncryptionException(xMLEncryptionException0, "", (Object[]) null);
      assertFalse(xMLEncryptionException1.equals((Object)xMLEncryptionException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLEncryptionException xMLEncryptionException0 = new XMLEncryptionException("", (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XMLEncryptionException xMLEncryptionException0 = new XMLEncryptionException("");
      XMLEncryptionException xMLEncryptionException1 = new XMLEncryptionException(xMLEncryptionException0);
      assertFalse(xMLEncryptionException1.equals((Object)xMLEncryptionException0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XMLEncryptionException xMLEncryptionException0 = new XMLEncryptionException();
      XMLEncryptionException xMLEncryptionException1 = new XMLEncryptionException(xMLEncryptionException0, "b4gYUAhC`c@9Qjs");
      assertFalse(xMLEncryptionException1.equals((Object)xMLEncryptionException0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XMLEncryptionException xMLEncryptionException0 = new XMLEncryptionException("");
      Object[] objectArray0 = new Object[7];
      XMLEncryptionException xMLEncryptionException1 = new XMLEncryptionException("N50bc6i%tZ", objectArray0, xMLEncryptionException0);
      assertFalse(xMLEncryptionException1.equals((Object)xMLEncryptionException0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XMLEncryptionException xMLEncryptionException0 = new XMLEncryptionException("");
      XMLEncryptionException xMLEncryptionException1 = new XMLEncryptionException("N50bc6i%tZ", xMLEncryptionException0);
      assertFalse(xMLEncryptionException1.equals((Object)xMLEncryptionException0));
  }
}
