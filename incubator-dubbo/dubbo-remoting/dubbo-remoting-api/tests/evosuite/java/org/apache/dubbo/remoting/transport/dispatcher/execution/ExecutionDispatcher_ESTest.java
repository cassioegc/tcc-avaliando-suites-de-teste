/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 10 04:28:40 GMT 2021
 */

package org.apache.dubbo.remoting.transport.dispatcher.execution;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.transport.dispatcher.execution.ExecutionDispatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExecutionDispatcher_ESTest extends ExecutionDispatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExecutionDispatcher executionDispatcher0 = new ExecutionDispatcher();
      ChannelHandler channelHandler0 = executionDispatcher0.dispatch((ChannelHandler) null, (URL) null);
      assertNotNull(channelHandler0);
  }
}
