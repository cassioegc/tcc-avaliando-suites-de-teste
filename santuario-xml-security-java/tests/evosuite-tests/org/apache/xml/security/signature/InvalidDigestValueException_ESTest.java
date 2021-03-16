/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 22:13:51 GMT 2021
 */

package org.apache.xml.security.signature;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.signature.InvalidDigestValueException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidDigestValueException_ESTest extends InvalidDigestValueException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      InvalidDigestValueException invalidDigestValueException0 = new InvalidDigestValueException((String) null, objectArray0, (Exception) null);
      InvalidDigestValueException invalidDigestValueException1 = new InvalidDigestValueException(invalidDigestValueException0, (String) null);
      assertFalse(invalidDigestValueException1.equals((Object)invalidDigestValueException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      InvalidDigestValueException invalidDigestValueException0 = new InvalidDigestValueException("org.apache.xml.security.signature.InvalidDigestValueException", objectArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InvalidDigestValueException invalidDigestValueException0 = new InvalidDigestValueException();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InvalidDigestValueException invalidDigestValueException0 = new InvalidDigestValueException("(J*4|");
      Object[] objectArray0 = new Object[6];
      InvalidDigestValueException invalidDigestValueException1 = new InvalidDigestValueException(invalidDigestValueException0, "&dZ%PYJW :L", objectArray0);
      assertFalse(invalidDigestValueException1.equals((Object)invalidDigestValueException0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InvalidDigestValueException invalidDigestValueException0 = new InvalidDigestValueException("(J*4|");
      InvalidDigestValueException invalidDigestValueException1 = new InvalidDigestValueException("(J*4|", invalidDigestValueException0);
      assertFalse(invalidDigestValueException1.equals((Object)invalidDigestValueException0));
  }
}
