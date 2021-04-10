/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 10 03:08:18 GMT 2021
 */

package org.apache.dubbo.remoting.exchange.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.threadlocal.NamedInternalThreadFactory;
import org.apache.dubbo.common.threadpool.ThreadlessExecutor;
import org.apache.dubbo.common.utils.NamedThreadFactory;
import org.apache.dubbo.remoting.Channel;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.exchange.Request;
import org.apache.dubbo.remoting.exchange.Response;
import org.apache.dubbo.remoting.exchange.support.DefaultFuture;
import org.apache.dubbo.remoting.transport.ChannelDelegate;
import org.apache.dubbo.remoting.transport.ChannelHandlerAdapter;
import org.apache.dubbo.remoting.transport.ChannelHandlerDispatcher;
import org.apache.dubbo.remoting.transport.ClientDelegate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultFuture_ESTest extends DefaultFuture_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultFuture.getFuture(30L);
      BiFunction<Object, Throwable, String> biFunction0 = (BiFunction<Object, Throwable, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(2091);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      scheduledThreadPoolExecutor0.prestartAllCoreThreads();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Response response0 = new Response((-204L), "J-O}7ZEV!");
      boolean boolean0 = true;
      NamedInternalThreadFactory namedInternalThreadFactory0 = new NamedInternalThreadFactory("", true);
      MockThread mockThread0 = new MockThread("J-O}7ZEV!");
      namedInternalThreadFactory0.newThread(mockThread0);
      Thread thread0 = namedInternalThreadFactory0.newThread(mockThread0);
      response0.setResult(thread0);
      response0.setEvent(false);
      response0.toString();
      response0.setResult("Response [id=-204, version=J-O}7ZEV!, status=20, event=false, error=null, result=Thread[-thread-2,5,Test_Execution_Group]]");
      DefaultFuture.getFuture((byte)100);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Channel channel0 = null;
      Response response0 = new Response(212L, ";<QrhghHOl5JzcoKF@C");
      response0.setErrorMessage(";<QrhghHOl5JzcoKF@C");
      response0.setVersion(";<QrhghHOl5JzcoKF@C");
      response0.setStatus((byte)0);
      response0.setErrorMessage(";<QrhghHOl5JzcoKF@C");
      boolean boolean0 = false;
      DefaultFuture.received((Channel) null, response0, false);
      Request request0 = new Request();
      int int0 = 90;
      request0.toString();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      response0.setStatus((byte)0);
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor(0, (byte)50, 1919L, timeUnit0, (BlockingQueue<Runnable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Channel channel0 = null;
      Response response0 = null;
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        DefaultFuture.received((Channel) null, (Response) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.DefaultFuture", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClientDelegate clientDelegate0 = new ClientDelegate();
      DefaultFuture.closeChannel(clientDelegate0);
      Response response0 = new Response();
      String string0 = null;
      response0.setVersion((String) null);
      response0.setEvent(false);
      // Undeclared exception!
      try { 
        DefaultFuture.received((Channel) clientDelegate0, response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.transport.ClientDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Channel channel0 = null;
      // Undeclared exception!
      try { 
        DefaultFuture.closeChannel((Channel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.DefaultFuture", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClientDelegate clientDelegate0 = new ClientDelegate();
      ClientDelegate clientDelegate1 = new ClientDelegate(clientDelegate0);
      Response response0 = new Response((-123L), "p%ul':");
      response0.setEvent((String) null);
      response0.setEvent(false);
      // Undeclared exception!
      try { 
        DefaultFuture.received((Channel) clientDelegate1, response0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.transport.ClientDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Request request0 = new Request();
      ForkJoinTask.getPool();
      // Undeclared exception!
      try { 
        DefaultFuture.newFuture((Channel) null, request0, 470, (ExecutorService) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClientDelegate clientDelegate0 = new ClientDelegate();
      // Undeclared exception!
      try { 
        DefaultFuture.newFuture(clientDelegate0, (Request) null, 103147770, (ExecutorService) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.DefaultFuture", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultFuture defaultFuture0 = DefaultFuture.getFuture((-1497L));
      assertNull(defaultFuture0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChannelDelegate channelDelegate0 = new ChannelDelegate();
      Request request0 = new Request();
      int int0 = 0;
      // Undeclared exception!
      try { 
        channelDelegate0.getRemoteAddress();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.transport.ChannelDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChannelDelegate channelDelegate0 = new ChannelDelegate();
      Response response0 = new Response();
      response0.setEvent("YrN5je^ka+o}.#K'");
      // Undeclared exception!
      try { 
        DefaultFuture.received((Channel) channelDelegate0, response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.transport.ChannelDelegate", e);
      }
  }
}
