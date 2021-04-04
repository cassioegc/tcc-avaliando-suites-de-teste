/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 05:33:04 GMT 2021
 */

package com.graphhopper.coll;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.coll.GHBitSet;
import com.graphhopper.coll.GHBitSetImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GHBitSetImpl_ESTest extends GHBitSetImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      int int0 = gHBitSetImpl0.nextClear(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      gHBitSetImpl0.add(0);
      int int0 = gHBitSetImpl0.next(0);
      assertEquals(1, gHBitSetImpl0.length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      gHBitSetImpl0.add(2049);
      int int0 = gHBitSetImpl0.next(0);
      assertEquals(2050, gHBitSetImpl0.length());
      assertEquals(2049, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      gHBitSetImpl0.add(0);
      gHBitSetImpl0.getCardinality();
      assertEquals("{0}", gHBitSetImpl0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      boolean boolean0 = gHBitSetImpl0.contains(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      // Undeclared exception!
      try { 
        gHBitSetImpl0.remove((-269));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // bitIndex < 0: -269
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      // Undeclared exception!
      try { 
        gHBitSetImpl0.next((-936));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex < 0: -936
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      // Undeclared exception!
      try { 
        gHBitSetImpl0.copyTo((GHBitSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.coll.GHBitSetImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      // Undeclared exception!
      try { 
        gHBitSetImpl0.add((-1489));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // bitIndex < 0: -1489
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = null;
      try {
        gHBitSetImpl0 = new GHBitSetImpl((-66));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -66
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      GHBitSetImpl gHBitSetImpl1 = (GHBitSetImpl)gHBitSetImpl0.copyTo(gHBitSetImpl0);
      assertTrue(gHBitSetImpl1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      gHBitSetImpl0.add(0);
      boolean boolean0 = gHBitSetImpl0.contains(0);
      assertEquals(1, gHBitSetImpl0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      gHBitSetImpl0.remove(0);
      assertEquals(64, gHBitSetImpl0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      // Undeclared exception!
      try { 
        gHBitSetImpl0.contains((byte) (-71));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // bitIndex < 0: -71
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl(0);
      int int0 = gHBitSetImpl0.nextClear(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      // Undeclared exception!
      try { 
        gHBitSetImpl0.nextClear((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex < 0: -1
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      int int0 = gHBitSetImpl0.next(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GHBitSetImpl gHBitSetImpl0 = new GHBitSetImpl();
      int int0 = gHBitSetImpl0.getCardinality();
      assertEquals(0, int0);
  }
}
