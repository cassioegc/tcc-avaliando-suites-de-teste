/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 10 04:20:36 GMT 2021
 */

package org.apache.dubbo.remoting.exchange.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.exchange.ExchangeServer;
import org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExchangeServerDelegate_ESTest extends ExchangeServerDelegate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      exchangeServerDelegate0.setServer(exchangeServerDelegate0);
      assertFalse(exchangeServerDelegate0.canHandleIdle());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.getExchangeChannels();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.isBound();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.getLocalAddress();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.getUrl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.send((Object) "Y;-6RoSP8vl", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate((ExchangeServer) null);
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.send((Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.startClose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.isClosed();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.getChannelHandler();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.getChannel((InetSocketAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.getExchangeChannel((InetSocketAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      ExchangeServerDelegate exchangeServerDelegate1 = new ExchangeServerDelegate(exchangeServerDelegate0);
      ExchangeServer exchangeServer0 = exchangeServerDelegate1.getServer();
      assertSame(exchangeServer0, exchangeServerDelegate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      ExchangeServer exchangeServer0 = exchangeServerDelegate0.getServer();
      assertNull(exchangeServer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.getChannels();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.reset((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExchangeServerDelegate exchangeServerDelegate0 = new ExchangeServerDelegate();
      // Undeclared exception!
      try { 
        exchangeServerDelegate0.close(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate", e);
      }
  }
}
