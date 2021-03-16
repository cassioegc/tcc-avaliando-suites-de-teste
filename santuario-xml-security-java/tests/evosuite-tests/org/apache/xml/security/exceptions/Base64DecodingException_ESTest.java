/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 21:21:22 GMT 2021
 */

package org.apache.xml.security.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64DecodingException_ESTest extends Base64DecodingException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Base64DecodingException base64DecodingException0 = new Base64DecodingException("\nOriginal Exception was ", objectArray0);
      Base64DecodingException base64DecodingException1 = new Base64DecodingException(base64DecodingException0, "", objectArray0);
      assertFalse(base64DecodingException1.equals((Object)base64DecodingException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Base64DecodingException base64DecodingException0 = new Base64DecodingException("\nOriginal Exception was ", objectArray0);
      Base64DecodingException base64DecodingException1 = new Base64DecodingException("", base64DecodingException0);
      assertFalse(base64DecodingException1.equals((Object)base64DecodingException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Base64DecodingException base64DecodingException0 = new Base64DecodingException("\nOriginal Exception was ", objectArray0);
      Base64DecodingException base64DecodingException1 = new Base64DecodingException(base64DecodingException0, "\nOriginal Exception was ");
      assertFalse(base64DecodingException1.equals((Object)base64DecodingException0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Base64DecodingException base64DecodingException0 = new Base64DecodingException();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Base64DecodingException base64DecodingException0 = new Base64DecodingException("");
      Object[] objectArray0 = new Object[8];
      Base64DecodingException base64DecodingException1 = new Base64DecodingException("", objectArray0, base64DecodingException0);
      assertFalse(base64DecodingException1.equals((Object)base64DecodingException0));
  }
}
