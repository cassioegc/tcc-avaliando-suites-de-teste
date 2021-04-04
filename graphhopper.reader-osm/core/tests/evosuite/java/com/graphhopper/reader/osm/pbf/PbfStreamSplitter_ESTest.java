/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 04:35:15 GMT 2021
 */

package com.graphhopper.reader.osm.pbf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.reader.osm.pbf.PbfRawBlob;
import com.graphhopper.reader.osm.pbf.PbfStreamSplitter;
import java.io.DataInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PbfStreamSplitter_ESTest extends PbfStreamSplitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataInputStream dataInputStream0 = mock(DataInputStream.class, new ViolatedAssumptionAnswer());
      PbfStreamSplitter pbfStreamSplitter0 = new PbfStreamSplitter(dataInputStream0);
      pbfStreamSplitter0.release();
      pbfStreamSplitter0.release();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataInputStream dataInputStream0 = mock(DataInputStream.class, new ViolatedAssumptionAnswer());
      PbfStreamSplitter pbfStreamSplitter0 = new PbfStreamSplitter(dataInputStream0);
      // Undeclared exception!
      try { 
        pbfStreamSplitter0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataInputStream dataInputStream0 = mock(DataInputStream.class, new ViolatedAssumptionAnswer());
      PbfStreamSplitter pbfStreamSplitter0 = new PbfStreamSplitter(dataInputStream0);
      // Undeclared exception!
      try { 
        pbfStreamSplitter0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.reader.osm.pbf.PbfStreamSplitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DataInputStream dataInputStream0 = mock(DataInputStream.class, new ViolatedAssumptionAnswer());
      PbfStreamSplitter pbfStreamSplitter0 = new PbfStreamSplitter(dataInputStream0);
      PbfRawBlob pbfRawBlob0 = pbfStreamSplitter0.next();
      assertNull(pbfRawBlob0);
  }
}
