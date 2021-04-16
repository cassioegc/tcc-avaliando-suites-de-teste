/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 22:05:13 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.LogsResponse;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LogsResponse_ESTest extends LogsResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      Integer integer0 = XmlSuite.DEFAULT_THREAD_COUNT;
      logsResponse0.totalCount(integer0);
      Integer integer1 = logsResponse0.getTotalCount();
      assertEquals(5, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      Integer integer0 = new Integer((-1));
      logsResponse0.totalCount(integer0);
      Integer integer1 = logsResponse0.getTotalCount();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      LinkedList<java.util.Locale.LanguageRange> linkedList0 = new LinkedList<java.util.Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      java.util.Locale.FilteringMode locale_FilteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = java.util.Locale.filterTags((List<java.util.Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1, locale_FilteringMode0);
      logsResponse0.results(list0);
      List<String> list1 = logsResponse0.getResults();
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      LogsResponse logsResponse1 = logsResponse0.addResultsItem(">jqc\"%7atWd");
      List<String> list0 = logsResponse1.getResults();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      LogsResponse logsResponse1 = logsResponse0.addResultsItem(">jqc\"%7atWd");
      String string0 = logsResponse1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      Integer integer0 = XmlSuite.DEFAULT_VERBOSE;
      logsResponse0.totalCount(integer0);
      LogsResponse logsResponse1 = new LogsResponse();
      boolean boolean0 = logsResponse0.equals(logsResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      logsResponse0.addResultsItem("![{JLzZum");
      LogsResponse logsResponse1 = new LogsResponse();
      boolean boolean0 = logsResponse0.equals(logsResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      LogLevel logLevel0 = LogLevel.DEBUG;
      LoggingHandler loggingHandler0 = new LoggingHandler("class LogsResponse {\n", logLevel0);
      boolean boolean0 = logsResponse0.equals(loggingHandler0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      LogsResponse logsResponse1 = new LogsResponse();
      boolean boolean0 = logsResponse0.equals(logsResponse1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      boolean boolean0 = logsResponse0.equals(logsResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      boolean boolean0 = logsResponse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      LogsResponse logsResponse1 = logsResponse0.addResultsItem(">jqc\"%7atWd");
      LogsResponse logsResponse2 = logsResponse1.addResultsItem("j8|_(u>g[WgH");
      assertSame(logsResponse1, logsResponse2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      List<String> list0 = logsResponse0.getResults();
      logsResponse0.setResults(list0);
      assertNull(logsResponse0.getTotalCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      logsResponse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      Integer integer0 = XmlSuite.DEFAULT_VERBOSE;
      logsResponse0.setTotalCount(integer0);
      assertEquals(1, (int)logsResponse0.getTotalCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      Integer integer0 = new Integer(0);
      LogsResponse logsResponse1 = logsResponse0.totalCount(integer0);
      Integer integer1 = logsResponse1.getTotalCount();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogsResponse logsResponse0 = new LogsResponse();
      Integer integer0 = logsResponse0.getTotalCount();
      assertNull(integer0);
  }
}
