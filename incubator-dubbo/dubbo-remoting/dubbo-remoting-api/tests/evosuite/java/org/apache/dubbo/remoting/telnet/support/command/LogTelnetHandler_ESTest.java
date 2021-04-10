/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 10 03:23:41 GMT 2021
 */

package org.apache.dubbo.remoting.telnet.support.command;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.dubbo.common.logger.Level;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerAdapter;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.remoting.Channel;
import org.apache.dubbo.remoting.telnet.support.command.LogTelnetHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LogTelnetHandler_ESTest extends LogTelnetHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LogTelnetHandler logTelnetHandler0 = new LogTelnetHandler();
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(file0).exists();
      doReturn("telnet.log", (String) null).when(file0).getAbsolutePath();
      Level level0 = Level.OFF;
      LoggerAdapter loggerAdapter0 = mock(LoggerAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(file0).when(loggerAdapter0).getFile();
      doReturn(level0).when(loggerAdapter0).getLevel();
      doReturn(logger0).when(loggerAdapter0).getLogger(anyString());
      LoggerFactory.setLoggerAdapter(loggerAdapter0);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      String string0 = logTelnetHandler0.telnet(channel0, "8");
      assertEquals("null\r\nCURRENT LOG LEVEL:OFF\r\nCURRENT LOG APPENDER:null", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LogTelnetHandler logTelnetHandler0 = new LogTelnetHandler();
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      File file0 = MockFile.createTempFile("telnet.log", "telnet.log");
      Level level0 = Level.OFF;
      LoggerAdapter loggerAdapter0 = mock(LoggerAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(file0).when(loggerAdapter0).getFile();
      doReturn(level0).when(loggerAdapter0).getLevel();
      doReturn(logger0).when(loggerAdapter0).getLogger(anyString());
      LoggerFactory.setLoggerAdapter(loggerAdapter0);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      String string0 = logTelnetHandler0.telnet(channel0, "8");
      assertEquals("\r\ncontent:\r\nmodified:2014-02-14 20:21:21\r\nsize:0\r\n\r\nCURRENT LOG LEVEL:OFF\r\nCURRENT LOG APPENDER:/tmp/telnet.log0telnet.log", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LogTelnetHandler logTelnetHandler0 = new LogTelnetHandler();
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      doReturn("telnet.log").when(file0).getAbsolutePath();
      Level level0 = Level.OFF;
      LoggerAdapter loggerAdapter0 = mock(LoggerAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(file0).when(loggerAdapter0).getFile();
      doReturn(level0).when(loggerAdapter0).getLevel();
      doReturn(logger0).when(loggerAdapter0).getLogger(anyString());
      LoggerFactory.setLoggerAdapter(loggerAdapter0);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      String string0 = logTelnetHandler0.telnet(channel0, "8");
      assertEquals("\r\nMESSAGE: log file not exists or log appender is console .\r\nCURRENT LOG LEVEL:OFF\r\nCURRENT LOG APPENDER:telnet.log", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LogTelnetHandler logTelnetHandler0 = new LogTelnetHandler();
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        logTelnetHandler0.telnet(channel0, "ro");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.dubbo.common.logger.Level.RO
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LogTelnetHandler logTelnetHandler0 = new LogTelnetHandler();
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      String string0 = logTelnetHandler0.telnet(channel0, "");
      assertEquals("EXAMPLE: log error / log 100\r\nCURRENT LOG LEVEL:OFF\r\nCURRENT LOG APPENDER:console", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LogTelnetHandler logTelnetHandler0 = new LogTelnetHandler();
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      String string0 = logTelnetHandler0.telnet(channel0, "8");
      assertEquals("\r\nMESSAGE: log file not exists or log appender is console .\r\nCURRENT LOG LEVEL:OFF\r\nCURRENT LOG APPENDER:console", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LogTelnetHandler logTelnetHandler0 = new LogTelnetHandler();
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      String string0 = logTelnetHandler0.telnet(channel0, (String) null);
      assertEquals("EXAMPLE: log error / log 100\r\nCURRENT LOG LEVEL:OFF\r\nCURRENT LOG APPENDER:console", string0);
  }
}
