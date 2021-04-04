/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 06:32:42 GMT 2021
 */

package com.graphhopper.routing.util.parsers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.reader.ReaderWay;
import com.graphhopper.routing.ev.DecimalEncodedValue;
import com.graphhopper.routing.ev.EncodedValue;
import com.graphhopper.routing.ev.EncodedValueLookup;
import com.graphhopper.routing.util.parsers.OSMMaxWidthParser;
import com.graphhopper.storage.IntsRef;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OSMMaxWidthParser_ESTest extends OSMMaxWidthParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OSMMaxWidthParser oSMMaxWidthParser0 = new OSMMaxWidthParser();
      IntsRef intsRef0 = mock(IntsRef.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(intsRef0).toString();
      ReaderWay readerWay0 = mock(ReaderWay.class, new ViolatedAssumptionAnswer());
      doReturn("limited").when(readerWay0).getFirstPriorityTag(anyList());
      IntsRef intsRef1 = mock(IntsRef.class, new ViolatedAssumptionAnswer());
      IntsRef intsRef2 = oSMMaxWidthParser0.handleWayTags(intsRef0, readerWay0, true, intsRef1);
      assertNotSame(intsRef2, intsRef1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OSMMaxWidthParser oSMMaxWidthParser0 = new OSMMaxWidthParser();
      IntsRef intsRef0 = mock(IntsRef.class, new ViolatedAssumptionAnswer());
      ReaderWay readerWay0 = mock(ReaderWay.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(readerWay0).getFirstPriorityTag(anyList());
      // Undeclared exception!
      try { 
        oSMMaxWidthParser0.handleWayTags(intsRef0, readerWay0, true, intsRef0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.util.Helper", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DecimalEncodedValue decimalEncodedValue0 = mock(DecimalEncodedValue.class, new ViolatedAssumptionAnswer());
      OSMMaxWidthParser oSMMaxWidthParser0 = new OSMMaxWidthParser(decimalEncodedValue0);
      ReaderWay readerWay0 = mock(ReaderWay.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(readerWay0).getFirstPriorityTag(anyList());
      // Undeclared exception!
      try { 
        oSMMaxWidthParser0.handleWayTags((IntsRef) null, readerWay0, false, (IntsRef) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.util.Helper", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DecimalEncodedValue decimalEncodedValue0 = mock(DecimalEncodedValue.class, new ViolatedAssumptionAnswer());
      OSMMaxWidthParser oSMMaxWidthParser0 = new OSMMaxWidthParser(decimalEncodedValue0);
      EncodedValueLookup encodedValueLookup0 = mock(EncodedValueLookup.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        oSMMaxWidthParser0.createEncodedValues(encodedValueLookup0, (List<EncodedValue>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.util.parsers.OSMMaxWidthParser", e);
      }
  }
}
