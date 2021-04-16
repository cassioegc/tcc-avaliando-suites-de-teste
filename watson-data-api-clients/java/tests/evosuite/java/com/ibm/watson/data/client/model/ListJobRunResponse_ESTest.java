/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 22:01:47 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.JobRun;
import com.ibm.watson.data.client.model.ListJobRunResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListJobRunResponse_ESTest extends ListJobRunResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      Long long0 = new Long(0L);
      listJobRunResponse0.totalRows(long0);
      Long long1 = listJobRunResponse0.getTotalRows();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      Long long0 = new Long((-4313L));
      listJobRunResponse0.totalRows(long0);
      Long long1 = listJobRunResponse0.getTotalRows();
      assertEquals((-4313L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      Long long0 = new Long(1507L);
      listJobRunResponse0.setTotalRows(long0);
      Long long1 = listJobRunResponse0.getTotalRows();
      assertEquals(1507L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      Stack<JobRun> stack0 = new Stack<JobRun>();
      ListJobRunResponse listJobRunResponse1 = listJobRunResponse0.results(stack0);
      List<JobRun> list0 = listJobRunResponse1.getResults();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      JobRun jobRun0 = new JobRun();
      ListJobRunResponse listJobRunResponse1 = listJobRunResponse0.addResultsItem(jobRun0);
      String string0 = listJobRunResponse1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      ListJobRunResponse listJobRunResponse1 = new ListJobRunResponse();
      boolean boolean0 = listJobRunResponse1.equals(listJobRunResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      boolean boolean0 = listJobRunResponse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      boolean boolean0 = listJobRunResponse0.equals(listJobRunResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      LinkedList<JobRun> linkedList0 = new LinkedList<JobRun>();
      ListJobRunResponse listJobRunResponse1 = listJobRunResponse0.results(linkedList0);
      ListJobRunResponse listJobRunResponse2 = new ListJobRunResponse();
      boolean boolean0 = listJobRunResponse1.equals(listJobRunResponse2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      JobRun jobRun0 = new JobRun();
      ListJobRunResponse listJobRunResponse1 = listJobRunResponse0.addResultsItem(jobRun0);
      List<JobRun> list0 = listJobRunResponse1.getResults();
      boolean boolean0 = listJobRunResponse1.equals(list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      Long long0 = listJobRunResponse0.getTotalRows();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      Long long0 = new Long((-4313L));
      listJobRunResponse0.totalRows(long0);
      ListJobRunResponse listJobRunResponse1 = new ListJobRunResponse();
      boolean boolean0 = listJobRunResponse0.equals(listJobRunResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      listJobRunResponse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      LinkedList<JobRun> linkedList0 = new LinkedList<JobRun>();
      listJobRunResponse0.setResults(linkedList0);
      assertNull(listJobRunResponse0.getTotalRows());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      List<JobRun> list0 = listJobRunResponse0.getResults();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ListJobRunResponse listJobRunResponse0 = new ListJobRunResponse();
      LinkedList<JobRun> linkedList0 = new LinkedList<JobRun>();
      ListJobRunResponse listJobRunResponse1 = listJobRunResponse0.results(linkedList0);
      JobRun jobRun0 = new JobRun();
      listJobRunResponse1.addResultsItem(jobRun0);
      assertTrue(linkedList0.contains(jobRun0));
      assertEquals(1, linkedList0.size());
  }
}
