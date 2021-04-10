/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 10 03:52:56 GMT 2021
 */

package org.apache.dubbo.remoting.exchange.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.dubbo.remoting.exchange.ExchangeChannel;
import org.apache.dubbo.remoting.exchange.support.Replier;
import org.apache.dubbo.remoting.exchange.support.ReplierDispatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReplierDispatcher_ESTest extends ReplierDispatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Replier<String> replier0 = (Replier<String>) mock(Replier.class, new ViolatedAssumptionAnswer());
      ReplierDispatcher replierDispatcher0 = new ReplierDispatcher(replier0);
      ExchangeChannel exchangeChannel0 = mock(ExchangeChannel.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        replierDispatcher0.reply(exchangeChannel0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ReplierDispatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReplierDispatcher replierDispatcher0 = new ReplierDispatcher();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        replierDispatcher0.addReplier(class0, (Replier<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Replier<String> replier0 = (Replier<String>) mock(Replier.class, new ViolatedAssumptionAnswer());
      ReplierDispatcher replierDispatcher0 = new ReplierDispatcher(replier0);
      Class<Object> class0 = Object.class;
      ReplierDispatcher replierDispatcher1 = new ReplierDispatcher();
      replierDispatcher0.addReplier(class0, (Replier<Object>) replierDispatcher1);
      ExchangeChannel exchangeChannel0 = mock(ExchangeChannel.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        replierDispatcher0.reply(exchangeChannel0, exchangeChannel0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Replier not found, Unsupported message object: class org.apache.dubbo.remoting.exchange.ExchangeChannel$MockitoMock$2053171746
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ReplierDispatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Replier<String> replier0 = (Replier<String>) mock(Replier.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(replier0).toString();
      doReturn((Object) null).when(replier0).reply(any(org.apache.dubbo.remoting.exchange.ExchangeChannel.class) , anyString());
      ReplierDispatcher replierDispatcher0 = new ReplierDispatcher(replier0);
      ExchangeChannel exchangeChannel0 = mock(ExchangeChannel.class, new ViolatedAssumptionAnswer());
      Class<String> class0 = String.class;
      Replier<String> replier1 = (Replier<String>) mock(Replier.class, new ViolatedAssumptionAnswer());
      ReplierDispatcher replierDispatcher1 = replierDispatcher0.addReplier(class0, replier1);
      Object object0 = replierDispatcher0.reply(exchangeChannel0, replierDispatcher1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReplierDispatcher replierDispatcher0 = new ReplierDispatcher();
      Class<Object> class0 = Object.class;
      ReplierDispatcher replierDispatcher1 = replierDispatcher0.removeReplier(class0);
      assertSame(replierDispatcher1, replierDispatcher0);
  }
}
