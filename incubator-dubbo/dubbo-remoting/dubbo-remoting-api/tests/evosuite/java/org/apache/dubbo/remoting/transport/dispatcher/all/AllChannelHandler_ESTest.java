/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 10 04:10:53 GMT 2021
 */

package org.apache.dubbo.remoting.transport.dispatcher.all;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.Channel;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.transport.dispatcher.all.AllChannelHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AllChannelHandler_ESTest extends AllChannelHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChannelHandler channelHandler0 = mock(ChannelHandler.class, new ViolatedAssumptionAnswer());
      AllChannelHandler allChannelHandler0 = new AllChannelHandler(channelHandler0, (URL) null);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        allChannelHandler0.caught(channel0, throwable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.common.threadpool.manager.DefaultExecutorRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChannelHandler channelHandler0 = mock(ChannelHandler.class, new ViolatedAssumptionAnswer());
      AllChannelHandler allChannelHandler0 = new AllChannelHandler(channelHandler0, (URL) null);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        allChannelHandler0.disconnected(channel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.common.threadpool.manager.DefaultExecutorRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChannelHandler channelHandler0 = mock(ChannelHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = mock(URL.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(uRL0).getParameter(anyString());
      doReturn(0, 0, 0, 0, 0).when(uRL0).getPort();
      AllChannelHandler allChannelHandler0 = new AllChannelHandler(channelHandler0, uRL0);
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.caught((Channel) null, throwable0);
      String string0 = "";
      allChannelHandler0.getPreferredExecutorService("");
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.connected(channel0);
      allChannelHandler0.getSharedExecutorService();
      Channel channel1 = mock(Channel.class, new ViolatedAssumptionAnswer());
      Channel channel2 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.getPreferredExecutorService("");
      allChannelHandler0.sent(channel2, channel2);
      allChannelHandler0.connected(channel1);
      URL uRL1 = null;
      AllChannelHandler allChannelHandler1 = new AllChannelHandler(allChannelHandler0, (URL) null);
      Channel channel3 = mock(Channel.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        allChannelHandler1.received(channel3, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.common.threadpool.manager.DefaultExecutorRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChannelHandler channelHandler0 = mock(ChannelHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = null;
      AllChannelHandler allChannelHandler0 = new AllChannelHandler(channelHandler0, (URL) null);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        allChannelHandler0.connected(channel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.common.threadpool.manager.DefaultExecutorRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChannelHandler channelHandler0 = mock(ChannelHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = mock(URL.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(uRL0).getParameter(anyString());
      doReturn(0, 0, 0, 0, 0).when(uRL0).getPort();
      AllChannelHandler allChannelHandler0 = new AllChannelHandler(channelHandler0, uRL0);
      assertNotNull(allChannelHandler0);
      
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.received(channel0, channel0);
      allChannelHandler0.getSharedExecutorService();
      allChannelHandler0.getPreferredExecutorService((Object) null);
      URL uRL1 = mock(URL.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(uRL1).getParameter(anyString());
      doReturn(0, 0, 0, 0, 0).when(uRL1).getPort();
      AllChannelHandler allChannelHandler1 = new AllChannelHandler(allChannelHandler0, uRL1);
      Channel channel1 = mock(Channel.class, new ViolatedAssumptionAnswer());
      Channel channel2 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler1.disconnected(channel2);
      allChannelHandler1.sent((Channel) null, (Object) null);
      allChannelHandler1.connected((Channel) null);
      allChannelHandler0.received((Channel) null, "");
      allChannelHandler0.getSharedExecutorService();
      allChannelHandler1.getSharedExecutorService();
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      allChannelHandler1.disconnected((Channel) null);
      allChannelHandler0.caught(channel1, throwable0);
      allChannelHandler1.disconnected((Channel) null);
      Throwable throwable1 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.caught((Channel) null, throwable1);
      Throwable throwable2 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.caught((Channel) null, throwable2);
      allChannelHandler1.connected((Channel) null);
      allChannelHandler0.connected((Channel) null);
      allChannelHandler0.connected((Channel) null);
      allChannelHandler1.disconnected((Channel) null);
      allChannelHandler0.disconnected((Channel) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChannelHandler channelHandler0 = mock(ChannelHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = mock(URL.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(uRL0).getParameter(anyString());
      doReturn(0, 0, 0, 0, 0).when(uRL0).getPort();
      AllChannelHandler allChannelHandler0 = new AllChannelHandler(channelHandler0, uRL0);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.getPreferredExecutorService(" error when process connected event .");
      allChannelHandler0.getSharedExecutorService();
      allChannelHandler0.received(channel0, "INFO");
      Channel channel1 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.received(channel1, "org.apache.dubbo.remoting.transport.dispatcher.all.AllChannelHandler");
      Channel channel2 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.disconnected(channel2);
      Channel channel3 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.caught(channel3, (Throwable) null);
      Channel channel4 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.connected(channel4);
      Channel channel5 = mock(Channel.class, new ViolatedAssumptionAnswer());
      allChannelHandler0.caught(channel5, (Throwable) null);
  }
}
