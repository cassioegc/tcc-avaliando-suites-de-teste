/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 06:15:24 GMT 2021
 */

package com.graphhopper.routing.ch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.SPTEntry;
import com.graphhopper.routing.ch.CHEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CHEntry_ESTest extends CHEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CHEntry cHEntry0 = new CHEntry((-2641), (-2641), 765, (-2641));
      cHEntry0.edge = 765;
      String string0 = cHEntry0.toString();
      assertEquals("765 (765) weight: -2641.0, incEdge: -2641", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CHEntry cHEntry0 = new CHEntry(0, 0.0);
      cHEntry0.parent = (SPTEntry) cHEntry0;
      CHEntry cHEntry1 = cHEntry0.getParent();
      assertEquals((-1), cHEntry1.incEdge);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CHEntry cHEntry0 = new CHEntry(0, 0.0);
      CHEntry cHEntry1 = new CHEntry(0, (-2407), (-1), 1.0);
      cHEntry0.parent = (SPTEntry) cHEntry1;
      CHEntry cHEntry2 = cHEntry0.getParent();
      assertEquals((-2407), cHEntry2.incEdge);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CHEntry cHEntry0 = new CHEntry((-2641), (-2641), 765, (-2641));
      cHEntry0.parent = (SPTEntry) cHEntry0;
      CHEntry cHEntry1 = cHEntry0.getParent();
      assertEquals((-2641), cHEntry1.incEdge);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CHEntry cHEntry0 = new CHEntry(366, 2789, 2789, 2789);
      SPTEntry sPTEntry0 = cHEntry0.cloneFull();
      cHEntry0.parent = sPTEntry0;
      // Undeclared exception!
      try { 
        cHEntry0.getParent();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.graphhopper.routing.SPTEntry cannot be cast to com.graphhopper.routing.ch.CHEntry
         //
         verifyException("com.graphhopper.routing.ch.CHEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CHEntry cHEntry0 = new CHEntry((-45), (-45));
      cHEntry0.getParent();
      assertEquals((-1), cHEntry0.incEdge);
  }
}
