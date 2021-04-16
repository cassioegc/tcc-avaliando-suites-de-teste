/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 16:35:25 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.ibm.watson.data.client.model.HrefModel;
import com.ibm.watson.data.client.model.PaginatedResourceWorkflow;
import com.ibm.watson.data.client.model.Workflow;
import io.netty.util.concurrent.DefaultEventExecutor;
import io.netty.util.concurrent.ScheduledFuture;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockserver.scheduler.Scheduler;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PaginatedResourceWorkflow_ESTest extends PaginatedResourceWorkflow_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Long long0 = new Long(45L);
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.totalCount(long0);
      Long long1 = paginatedResourceWorkflow1.getTotalCount();
      assertEquals(45L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Long long0 = new Long(0L);
      paginatedResourceWorkflow0.setTotalCount(long0);
      Long long1 = paginatedResourceWorkflow0.getTotalCount();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Long long0 = new Long((-693L));
      paginatedResourceWorkflow0.totalCount(long0);
      Long long1 = paginatedResourceWorkflow0.getTotalCount();
      assertEquals((-693L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Long long0 = new Long((-2868L));
      paginatedResourceWorkflow0.setTotalCount(long0);
      Long long1 = paginatedResourceWorkflow0.getTotalCount();
      assertEquals((-2868L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Stack<Workflow> stack0 = new Stack<Workflow>();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.resources(stack0);
      List<Workflow> list0 = paginatedResourceWorkflow1.getResources();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Workflow workflow0 = new Workflow();
      paginatedResourceWorkflow0.addResourcesItem(workflow0);
      List<Workflow> list0 = paginatedResourceWorkflow0.getResources();
      assertTrue(list0.contains(workflow0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.previous(hrefModel0);
      HrefModel hrefModel1 = paginatedResourceWorkflow1.getPrevious();
      assertSame(hrefModel1, hrefModel0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Integer integer0 = new Integer((-402));
      paginatedResourceWorkflow0.setOffset(integer0);
      Integer integer1 = paginatedResourceWorkflow0.getOffset();
      assertEquals((-402), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Integer integer0 = new Integer(0);
      paginatedResourceWorkflow0.setOffset(integer0);
      Integer integer1 = paginatedResourceWorkflow0.getOffset();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Integer integer0 = XmlSuite.DEFAULT_VERBOSE;
      paginatedResourceWorkflow0.setOffset(integer0);
      Integer integer1 = paginatedResourceWorkflow0.getOffset();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Integer integer0 = new Integer(1991);
      paginatedResourceWorkflow0.offset(integer0);
      Integer integer1 = paginatedResourceWorkflow0.getOffset();
      assertEquals(1991, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow0.setNext(hrefModel0);
      HrefModel hrefModel1 = paginatedResourceWorkflow0.getNext();
      assertNull(hrefModel1.getHref());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Integer integer0 = new Integer(0);
      paginatedResourceWorkflow0.limit(integer0);
      Integer integer1 = paginatedResourceWorkflow0.getLimit();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Integer integer0 = XmlSuite.DEFAULT_VERBOSE;
      paginatedResourceWorkflow0.limit(integer0);
      Integer integer1 = paginatedResourceWorkflow0.getLimit();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Integer integer0 = new Integer((-3128));
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.limit(integer0);
      Integer integer1 = paginatedResourceWorkflow1.getLimit();
      assertEquals((-3128), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow0.last(hrefModel0);
      HrefModel hrefModel1 = paginatedResourceWorkflow0.getLast();
      assertNull(hrefModel1.getHref());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow0.first(hrefModel0);
      HrefModel hrefModel1 = paginatedResourceWorkflow0.getFirst();
      assertSame(hrefModel1, hrefModel0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow0.next(hrefModel0);
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow2 = paginatedResourceWorkflow1.limit((Integer) null);
      paginatedResourceWorkflow0.equals(paginatedResourceWorkflow2);
      long long0 = Long.max(857L, 578L);
      assertEquals(857L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Long long0 = paginatedResourceWorkflow0.getTotalCount();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Long long0 = new Long(0L);
      String string0 = Long.toUnsignedString(0L);
      paginatedResourceWorkflow0.setTotalCount(long0);
      String string1 = paginatedResourceWorkflow0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Long long0 = new Long(0L);
      paginatedResourceWorkflow0.setTotalCount(long0);
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      long long1 = Long.max(857L, 578L);
      assertEquals(857L, long1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      assertTrue(paginatedResourceWorkflow1.equals((Object)paginatedResourceWorkflow0));
      
      Vector<Workflow> vector0 = new Vector<Workflow>();
      paginatedResourceWorkflow1.setResources(vector0);
      boolean boolean0 = paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      assertFalse(boolean0);
      
      paginatedResourceWorkflow0.offset((Integer) null);
      assertFalse(paginatedResourceWorkflow0.equals((Object)paginatedResourceWorkflow1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      assertTrue(paginatedResourceWorkflow1.equals((Object)paginatedResourceWorkflow0));
      
      HrefModel hrefModel0 = new HrefModel();
      Object object0 = new Object();
      paginatedResourceWorkflow1.previous(hrefModel0);
      boolean boolean0 = paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      assertTrue(paginatedResourceWorkflow1.equals((Object)paginatedResourceWorkflow0));
      
      Integer integer0 = new Integer((-1542));
      paginatedResourceWorkflow1.offset(integer0);
      boolean boolean0 = paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      assertFalse(boolean0);
      
      paginatedResourceWorkflow0.next((HrefModel) null);
      assertFalse(paginatedResourceWorkflow0.equals((Object)paginatedResourceWorkflow1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      assertTrue(paginatedResourceWorkflow1.equals((Object)paginatedResourceWorkflow0));
      
      Integer integer0 = new Integer(0);
      paginatedResourceWorkflow1.setLimit(integer0);
      paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      assertFalse(paginatedResourceWorkflow1.equals((Object)paginatedResourceWorkflow0));
      
      String string0 = paginatedResourceWorkflow0.toString();
      assertEquals("class PaginatedResourceWorkflow {\n    first: null\n    last: null\n    limit: null\n    next: null\n    offset: null\n    previous: null\n    resources: null\n    totalCount: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow1.last(hrefModel0);
      paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      long long0 = Long.max(834L, 578L);
      assertEquals(834L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      paginatedResourceWorkflow0.limit((Integer) null);
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow0.setFirst(hrefModel0);
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      boolean boolean0 = paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Scheduler.SchedulerThreadFactory scheduler_SchedulerThreadFactory0 = new Scheduler.SchedulerThreadFactory("");
      DefaultEventExecutor defaultEventExecutor0 = new DefaultEventExecutor(scheduler_SchedulerThreadFactory0);
      Callable<Integer> callable0 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      ScheduledFuture<Integer> scheduledFuture0 = defaultEventExecutor0.schedule(callable0, 578L, timeUnit0);
      paginatedResourceWorkflow0.equals(scheduledFuture0);
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.offset((Integer) null);
      assertNull(paginatedResourceWorkflow1.getTotalCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = new PaginatedResourceWorkflow();
      boolean boolean0 = paginatedResourceWorkflow0.equals(paginatedResourceWorkflow1);
      assertTrue(boolean0);
      
      paginatedResourceWorkflow0.offset((Integer) null);
      assertTrue(paginatedResourceWorkflow0.equals((Object)paginatedResourceWorkflow1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      boolean boolean0 = paginatedResourceWorkflow0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Stack<Workflow> stack0 = new Stack<Workflow>();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.resources(stack0);
      paginatedResourceWorkflow1.equals(paginatedResourceWorkflow0);
      paginatedResourceWorkflow0.addResourcesItem((Workflow) null);
      paginatedResourceWorkflow1.setFirst((HrefModel) null);
      assertEquals(1, stack0.size());
      assertEquals("[null]", stack0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = paginatedResourceWorkflow0.getPrevious();
      assertNull(hrefModel0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      Stack<Workflow> stack0 = new Stack<Workflow>();
      paginatedResourceWorkflow0.getNext();
      paginatedResourceWorkflow0.setResources(stack0);
      paginatedResourceWorkflow0.setFirst((HrefModel) null);
      assertNull(paginatedResourceWorkflow0.getOffset());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      Stack<Workflow> stack0 = new Stack<Workflow>();
      paginatedResourceWorkflow0.resources(stack0);
      paginatedResourceWorkflow0.setLast((HrefModel) null);
      assertNull(paginatedResourceWorkflow0.getOffset());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.first(hrefModel0);
      paginatedResourceWorkflow1.next(hrefModel0);
      paginatedResourceWorkflow0.hashCode();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.last(hrefModel0);
      paginatedResourceWorkflow1.getLimit();
      paginatedResourceWorkflow0.hashCode();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow0.setPrevious(hrefModel0);
      assertNull(paginatedResourceWorkflow0.getOffset());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      PaginatedResourceWorkflow paginatedResourceWorkflow1 = paginatedResourceWorkflow0.offset((Integer) null);
      paginatedResourceWorkflow1.getOffset();
      List<Workflow> list0 = paginatedResourceWorkflow0.getResources();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = paginatedResourceWorkflow0.getFirst();
      assertNull(hrefModel0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PaginatedResourceWorkflow paginatedResourceWorkflow0 = new PaginatedResourceWorkflow();
      HrefModel hrefModel0 = new HrefModel();
      paginatedResourceWorkflow0.getLast();
      paginatedResourceWorkflow0.setLast((HrefModel) null);
      assertNull(paginatedResourceWorkflow0.getLimit());
  }
}
