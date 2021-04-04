/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 05:24:26 GMT 2021
 */

package com.graphhopper.reader.osm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.reader.ReaderElement;
import com.graphhopper.reader.osm.OSMFileHeader;
import javax.xml.stream.XMLStreamReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OSMFileHeader_ESTest extends OSMFileHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLStreamReader xMLStreamReader0 = mock(XMLStreamReader.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(xMLStreamReader0).nextTag();
      OSMFileHeader oSMFileHeader0 = OSMFileHeader.create(0L, xMLStreamReader0);
      XMLStreamReader xMLStreamReader1 = mock(XMLStreamReader.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(xMLStreamReader1).getEventType();
      doReturn("com.graphhopper.reader.osm.OSMFileHeader").when(xMLStreamReader1).getLocalName();
      oSMFileHeader0.readFileHeader(xMLStreamReader1);
      assertEquals(0, ReaderElement.NODE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        OSMFileHeader.create(0L, (XMLStreamReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.reader.osm.OSMFileHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OSMFileHeader oSMFileHeader0 = new OSMFileHeader();
      XMLStreamReader xMLStreamReader0 = mock(XMLStreamReader.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(xMLStreamReader0).getEventType();
      doReturn("osm", (String) null).when(xMLStreamReader0).getLocalName();
      doReturn(0).when(xMLStreamReader0).nextTag();
      // Undeclared exception!
      try { 
        oSMFileHeader0.readFileHeader(xMLStreamReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OSMFileHeader oSMFileHeader0 = new OSMFileHeader();
      XMLStreamReader xMLStreamReader0 = mock(XMLStreamReader.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(xMLStreamReader0).getEventType();
      oSMFileHeader0.readFileHeader(xMLStreamReader0);
      assertEquals(3, ReaderElement.FILEHEADER);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OSMFileHeader oSMFileHeader0 = new OSMFileHeader();
      String string0 = oSMFileHeader0.toString();
      assertNotNull(string0);
  }
}
