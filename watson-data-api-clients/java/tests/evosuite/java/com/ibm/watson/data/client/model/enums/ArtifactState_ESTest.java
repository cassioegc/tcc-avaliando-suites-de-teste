/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:45:39 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.ArtifactState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArtifactState_ESTest extends ArtifactState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArtifactState artifactState0 = ArtifactState.fromValue("draft");
      assertEquals(ArtifactState.DRAFT, artifactState0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArtifactState[] artifactStateArray0 = ArtifactState.values();
      assertEquals(3, artifactStateArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArtifactState artifactState0 = ArtifactState.valueOf("PUBLISHED");
      assertEquals(ArtifactState.PUBLISHED, artifactState0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArtifactState artifactState0 = ArtifactState.fromValue("published");
      assertEquals(ArtifactState.PUBLISHED, artifactState0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArtifactState.fromValue("publisfcd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'publisfcd'
         //
         verifyException("com.ibm.watson.data.client.model.enums.ArtifactState", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArtifactState artifactState0 = ArtifactState.PUBLISHED;
      String string0 = artifactState0.toString();
      assertEquals("published", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArtifactState artifactState0 = ArtifactState.PUBLISHED;
      String string0 = artifactState0.getValue();
      assertEquals("published", string0);
  }
}
