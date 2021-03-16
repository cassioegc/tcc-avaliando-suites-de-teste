/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 18:28:23 GMT 2021
 */

package org.apache.xml.security.c14n.implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.c14n.implementations.NameSpaceSymbEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Attr;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NameSpaceSymbEntry_ESTest extends NameSpaceSymbEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NameSpaceSymbEntry nameSpaceSymbEntry0 = new NameSpaceSymbEntry("n|l''URRP9/|G", (Attr) null, false, "cRM6xp'BS");
      NameSpaceSymbEntry nameSpaceSymbEntry1 = nameSpaceSymbEntry0.clone();
      assertFalse(nameSpaceSymbEntry1.equals((Object)nameSpaceSymbEntry0));
  }
}
