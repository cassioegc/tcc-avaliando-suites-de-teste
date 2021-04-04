/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 05:51:18 GMT 2021
 */

package com.graphhopper.routing.ev;

import org.junit.Test;
import static org.junit.Assert.*;
import com.graphhopper.routing.ev.Toll;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Toll_ESTest extends Toll_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Toll[] tollArray0 = Toll.values();
      assertEquals(3, tollArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Toll toll0 = Toll.valueOf("NO");
      assertEquals("no", toll0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Toll toll0 = Toll.find("");
      assertEquals(Toll.NO, toll0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Toll toll0 = Toll.find((String) null);
      String string0 = toll0.toString();
      assertEquals("no", string0);
  }
}
