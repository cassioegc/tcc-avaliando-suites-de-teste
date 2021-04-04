/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 03:13:46 GMT 2021
 */

package com.graphhopper.routing.ch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.ch.ShortcutUnpacker;
import com.graphhopper.storage.RoutingCHGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShortcutUnpacker_ESTest extends ShortcutUnpacker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ShortcutUnpacker.Visitor shortcutUnpacker_Visitor0 = mock(ShortcutUnpacker.Visitor.class, new ViolatedAssumptionAnswer());
      ShortcutUnpacker shortcutUnpacker0 = new ShortcutUnpacker((RoutingCHGraph) null, shortcutUnpacker_Visitor0, false);
      // Undeclared exception!
      try { 
        shortcutUnpacker0.visitOriginalEdgesBwd((-1007), 1749, false, (-912));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.ch.ShortcutUnpacker", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShortcutUnpacker shortcutUnpacker0 = new ShortcutUnpacker((RoutingCHGraph) null, (ShortcutUnpacker.Visitor) null, false);
      // Undeclared exception!
      try { 
        shortcutUnpacker0.visitOriginalEdgesFwd((-56), 871, false, (-56));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.ch.ShortcutUnpacker", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ShortcutUnpacker.Visitor shortcutUnpacker_Visitor0 = mock(ShortcutUnpacker.Visitor.class, new ViolatedAssumptionAnswer());
      ShortcutUnpacker shortcutUnpacker0 = new ShortcutUnpacker((RoutingCHGraph) null, shortcutUnpacker_Visitor0, false);
      // Undeclared exception!
      try { 
        shortcutUnpacker0.visitOriginalEdgesFwd(1264, 1264, false, (-2894));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.ch.ShortcutUnpacker", e);
      }
  }
}
