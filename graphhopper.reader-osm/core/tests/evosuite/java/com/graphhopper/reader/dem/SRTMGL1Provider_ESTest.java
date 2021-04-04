/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 04:38:13 GMT 2021
 */

package com.graphhopper.reader.dem;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.reader.dem.SRTMGL1Provider;
import java.io.File;
import java.io.FileNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SRTMGL1Provider_ESTest extends SRTMGL1Provider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("1RA':,PVH<V");
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      String string0 = sRTMGL1Provider0.getDownloadURL(30.0, 30.0);
      assertNotNull(string0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals("North/North_30_60/N30E030.hgt", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider();
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      String string0 = sRTMGL1Provider0.getDownloadURL(Double.NaN, Double.NaN);
      assertNotNull(string0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals("South/S90W180.hgt", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("VEr/SIXe@oLe");
      assertNotNull(sRTMGL1Provider0);
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      
      int int0 = sRTMGL1Provider0.getMinLonForTile(0.0);
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("");
      assertNotNull(sRTMGL1Provider0);
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      
      int int0 = sRTMGL1Provider0.getMinLonForTile(46.468835);
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertEquals(46, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider();
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      int int0 = sRTMGL1Provider0.getMinLonForTile((-629.724922353447));
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals((-630), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("3<5Z,9n|Ku)`oPS69");
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      int int0 = sRTMGL1Provider0.getMinLatForTile(0.0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("com.graphhopper.reader.dem.ElevationProvider");
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      int int0 = sRTMGL1Provider0.getMinLatForTile(5440.046607035577);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals(5440, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider();
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      int int0 = sRTMGL1Provider0.getMinLatForTile((-1018.6));
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      assertEquals((-1019), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider();
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      // Undeclared exception!
      try { 
        sRTMGL1Provider0.readFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("VEr/SIXe@oLe");
      assertNotNull(sRTMGL1Provider0);
      assertEquals("srtmgl1", sRTMGL1Provider0.toString());
      assertFalse(sRTMGL1Provider0.getInterpolate());
      
      MockFile mockFile0 = (MockFile)sRTMGL1Provider0.cacheDir;
      assertNotNull(mockFile0);
      assertEquals("/home/cassioegc/tcc/graphhopper.reader-osm/core/VEr", mockFile0.getParent());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("SIXe@oLe", mockFile0.getName());
      assertEquals("/home/cassioegc/tcc/graphhopper.reader-osm/core/VEr/SIXe@oLe", mockFile0.toString());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.canRead());
      
      try { 
        sRTMGL1Provider0.readFile(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/srtmgl1");
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertTrue(boolean0);
      assertEquals(2, byteArray0.length);
      
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        SRTMGL1Provider.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cache path has to be a directory
         //
         verifyException("com.graphhopper.reader.dem.AbstractElevationProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = null;
      try {
        sRTMGL1Provider0 = new SRTMGL1Provider("1\u0000");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Invalid file path
         //
         verifyException("com.graphhopper.reader.dem.AbstractElevationProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = null;
      try {
        sRTMGL1Provider0 = new SRTMGL1Provider((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/srtmgl1");
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "zf\"s-}SIQ<g");
      assertTrue(boolean0);
      
      SRTMGL1Provider sRTMGL1Provider0 = null;
      try {
        sRTMGL1Provider0 = new SRTMGL1Provider("/tmp/srtmgl1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cache path has to be a directory
         //
         verifyException("com.graphhopper.reader.dem.AbstractElevationProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      SRTMGL1Provider sRTMGL1Provider0 = null;
      try {
        sRTMGL1Provider0 = new SRTMGL1Provider();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Simulated IOException
         //
         verifyException("com.graphhopper.reader.dem.AbstractElevationProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/srtmgl1");
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "VEr/SIXe@oLe");
      assertTrue(boolean0);
      
      SRTMGL1Provider sRTMGL1Provider0 = null;
      try {
        sRTMGL1Provider0 = new SRTMGL1Provider();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cache path has to be a directory
         //
         verifyException("com.graphhopper.reader.dem.AbstractElevationProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[8];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/srtmgl1/N49E011.hgt");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "B(@\"5O*");
      // Undeclared exception!
      try { 
        SRTMGL1Provider.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There was an issue looking up the coordinates for -22.532854,-65.110474
         //
         verifyException("com.graphhopper.reader.dem.AbstractSRTMElevationProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider();
      File file0 = MockFile.createTempFile("skadi", "");
      byte[] byteArray0 = sRTMGL1Provider0.readFile(file0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("VEr/SIXe@oLe");
      String string0 = sRTMGL1Provider0.getDownloadURL(0.0, 0.0);
      assertEquals("North/North_0_29/N00E000.hgt", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider();
      String string0 = sRTMGL1Provider0.toString();
      assertEquals("srtmgl1", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SRTMGL1Provider sRTMGL1Provider0 = new SRTMGL1Provider("");
      String string0 = sRTMGL1Provider0.getFileName(84.0, 84.0);
      assertEquals("n84e084", string0);
  }
}
