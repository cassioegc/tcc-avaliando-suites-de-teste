/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 17:52:52 GMT 2021
 */

package org.apache.xml.security.binding.xmldsig11;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.xml.security.binding.xmldsig11.CharTwoFieldParamsType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharTwoFieldParamsType_ESTest extends CharTwoFieldParamsType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharTwoFieldParamsType charTwoFieldParamsType0 = new CharTwoFieldParamsType();
      byte[] byteArray0 = new byte[9];
      byteArray0[7] = (byte) (-90);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      charTwoFieldParamsType0.m = bigInteger0;
      BigInteger bigInteger1 = charTwoFieldParamsType0.getM();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharTwoFieldParamsType charTwoFieldParamsType0 = new CharTwoFieldParamsType();
      BigInteger bigInteger0 = BigInteger.ZERO;
      charTwoFieldParamsType0.setM(bigInteger0);
      BigInteger bigInteger1 = charTwoFieldParamsType0.getM();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharTwoFieldParamsType charTwoFieldParamsType0 = new CharTwoFieldParamsType();
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-56);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      charTwoFieldParamsType0.m = bigInteger0;
      BigInteger bigInteger1 = charTwoFieldParamsType0.getM();
      assertEquals((byte) (-56), bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharTwoFieldParamsType charTwoFieldParamsType0 = new CharTwoFieldParamsType();
      BigInteger bigInteger0 = BigInteger.ONE;
      charTwoFieldParamsType0.setM(bigInteger0);
      BigInteger bigInteger1 = charTwoFieldParamsType0.getM();
      assertEquals((byte)1, bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharTwoFieldParamsType charTwoFieldParamsType0 = new CharTwoFieldParamsType();
      BigInteger bigInteger0 = charTwoFieldParamsType0.getM();
      assertNull(bigInteger0);
  }
}
