/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 23:53:12 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.ColumnInfoDetails;
import com.ibm.watson.data.client.model.ColumnTerm;
import io.netty.handler.logging.ByteBufFormat;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ColumnInfoDetails_ESTest extends ColumnInfoDetails_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      String string0 = columnInfoDetails0.getOmrsGuid();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      columnInfoDetails0.setOmrsGuid("");
      String string0 = columnInfoDetails0.getOmrsGuid();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      Vector<ColumnTerm> vector0 = new Vector<ColumnTerm>();
      ColumnTerm columnTerm0 = new ColumnTerm();
      vector0.add(columnTerm0);
      columnInfoDetails0.setColumnTerms(vector0);
      List<ColumnTerm> list0 = columnInfoDetails0.getColumnTerms();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      ArrayList<ColumnTerm> arrayList0 = new ArrayList<ColumnTerm>();
      columnInfoDetails0.setColumnTerms(arrayList0);
      ColumnInfoDetails columnInfoDetails1 = new ColumnInfoDetails();
      columnInfoDetails1.toString();
      boolean boolean0 = columnInfoDetails0.equals(columnInfoDetails1);
      assertFalse(boolean0);
      
      columnInfoDetails0.getColumnTerms();
      String string0 = columnInfoDetails1.toString();
      assertEquals("class ColumnInfoDetails {\n    omrsGuid: null\n    columnTerms: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      ColumnInfoDetails columnInfoDetails1 = new ColumnInfoDetails();
      columnInfoDetails1.toString();
      boolean boolean0 = columnInfoDetails0.equals(columnInfoDetails1);
      assertTrue(boolean0);
      
      columnInfoDetails0.getColumnTerms();
      String string0 = columnInfoDetails1.toString();
      assertEquals("class ColumnInfoDetails {\n    omrsGuid: null\n    columnTerms: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      columnInfoDetails0.setOmrsGuid("\n    ");
      columnInfoDetails0.hashCode();
      ColumnInfoDetails columnInfoDetails1 = new ColumnInfoDetails();
      boolean boolean0 = columnInfoDetails0.equals(columnInfoDetails1);
      assertFalse(boolean0);
      
      columnInfoDetails0.toString();
      assertFalse(columnInfoDetails0.equals((Object)columnInfoDetails1));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      LogLevel logLevel0 = LogLevel.INFO;
      ByteBufFormat byteBufFormat0 = ByteBufFormat.HEX_DUMP;
      LoggingHandler loggingHandler0 = new LoggingHandler("aZor:&,z</jl:", logLevel0, byteBufFormat0);
      columnInfoDetails0.equals(loggingHandler0);
      columnInfoDetails0.setOmrsGuid("_|I{J.[Ci");
      String string0 = columnInfoDetails0.getOmrsGuid();
      assertEquals("_|I{J.[Ci", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      columnInfoDetails0.equals(columnInfoDetails0);
      columnInfoDetails0.setOmrsGuid("_|I{J.[Ci");
      assertEquals("_|I{J.[Ci", columnInfoDetails0.getOmrsGuid());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ColumnInfoDetails columnInfoDetails0 = new ColumnInfoDetails();
      columnInfoDetails0.equals((Object) null);
      columnInfoDetails0.hashCode();
  }
}
