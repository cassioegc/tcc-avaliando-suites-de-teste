/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 20:41:37 GMT 2021
 */

package org.apache.xml.security.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.xml.security.utils.UnsyncByteArrayOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnsyncByteArrayOutputStream_ESTest extends UnsyncByteArrayOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        unsyncByteArrayOutputStream0.write(byteArray0, 1039, 262144);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      byte[] byteArray0 = new byte[5];
      unsyncByteArrayOutputStream0.write(byteArray0);
      unsyncByteArrayOutputStream0.write((-405));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      byte[] byteArray0 = new byte[5];
      unsyncByteArrayOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        unsyncByteArrayOutputStream0.write(byteArray0, (int) (byte) (-101), 8192);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        unsyncByteArrayOutputStream0.write(byteArray0, (int) (byte) (-101), 8192);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      byte[] byteArray0 = new byte[5];
      unsyncByteArrayOutputStream0.write(byteArray0);
      unsyncByteArrayOutputStream0.write(byteArray0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      unsyncByteArrayOutputStream0.write(3100);
      byte[] byteArray0 = unsyncByteArrayOutputStream0.toByteArray();
      unsyncByteArrayOutputStream0.write(byteArray0, 1, 0);
      assertArrayEquals(new byte[] {(byte)28}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      // Undeclared exception!
      try { 
        unsyncByteArrayOutputStream0.writeTo((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.utils.UnsyncByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("_@Q$]fB~D", true);
      try { 
        unsyncByteArrayOutputStream0.writeTo(mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      // Undeclared exception!
      try { 
        unsyncByteArrayOutputStream0.write((byte[]) null, 5272, 8205);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      // Undeclared exception!
      try { 
        unsyncByteArrayOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.utils.UnsyncByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(unsyncByteArrayOutputStream0, false);
      mockPrintStream0.print(false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      byte[] byteArray0 = unsyncByteArrayOutputStream0.toByteArray();
      // Undeclared exception!
      try { 
        unsyncByteArrayOutputStream0.write(byteArray0, 8206, 8206);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(unsyncByteArrayOutputStream0, false);
      unsyncByteArrayOutputStream0.writeTo(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      unsyncByteArrayOutputStream0.reset();
  }
}
