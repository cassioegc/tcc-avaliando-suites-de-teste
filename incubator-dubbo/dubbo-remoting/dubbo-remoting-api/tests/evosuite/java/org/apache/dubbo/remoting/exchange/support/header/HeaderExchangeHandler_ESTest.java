/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 10 03:04:37 GMT 2021
 */

package org.apache.dubbo.remoting.exchange.support.header;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.Channel;
import org.apache.dubbo.remoting.ChannelHandler;
import org.apache.dubbo.remoting.ExecutionException;
import org.apache.dubbo.remoting.RemotingException;
import org.apache.dubbo.remoting.exchange.ExchangeHandler;
import org.apache.dubbo.remoting.exchange.Request;
import org.apache.dubbo.remoting.exchange.Response;
import org.apache.dubbo.remoting.exchange.support.ExchangeHandlerDispatcher;
import org.apache.dubbo.remoting.exchange.support.Replier;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeChannel;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeClient;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler;
import org.apache.dubbo.remoting.transport.ChannelDelegate;
import org.apache.dubbo.remoting.transport.ClientDelegate;
import org.apache.dubbo.remoting.transport.DecodeHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HeaderExchangeHandler_ESTest extends HeaderExchangeHandler_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ChannelHandler[] channelHandlerArray0 = new ChannelHandler[0];
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(channelHandlerArray0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        headerExchangeHandler0.connected((Channel) null);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        ClientDelegate clientDelegate0 = new ClientDelegate();
        Request request0 = new Request(1402L);
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher();
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        // Undeclared exception!
        try {
            headerExchangeHandler0.sent(clientDelegate0, request0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.dubbo.remoting.transport.ClientDelegate", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        ChannelHandler[] channelHandlerArray0 = new ChannelHandler[0];
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(channelHandlerArray0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        Request request0 = new Request((-2843L));
        // Undeclared exception!
        try {
            headerExchangeHandler0.received((Channel) null, request0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Replier<ExecutionException> replier0 = (Replier<ExecutionException>) mock(Replier.class, new ViolatedAssumptionAnswer());
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(replier0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        ChannelDelegate channelDelegate0 = new ChannelDelegate();
        // Undeclared exception!
        try {
            headerExchangeHandler0.disconnected(channelDelegate0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.dubbo.remoting.transport.ChannelDelegate", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Replier<HeaderExchangeHandler> replier0 = (Replier<HeaderExchangeHandler>) mock(Replier.class, new ViolatedAssumptionAnswer());
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(replier0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        exchangeHandlerDispatcher0.addChannelHandler(exchangeHandlerDispatcher0);
        exchangeHandlerDispatcher0.connected((Channel) null);
        // Undeclared exception!
        headerExchangeHandler0.connected((Channel) null);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher((Replier<?>) null);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        ClientDelegate clientDelegate0 = new ClientDelegate();
        HeaderExchangeClient headerExchangeClient0 = new HeaderExchangeClient(clientDelegate0, false);
        String[] stringArray0 = new String[0];
        URL uRL0 = new URL("org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler", "log4j.throwableRenderer", 761, "org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler", stringArray0);
        InetSocketAddress inetSocketAddress0 = uRL0.toInetSocketAddress();
        RemotingException remotingException0 = new RemotingException(inetSocketAddress0, inetSocketAddress0, "5V'4jo=");
        // Undeclared exception!
        try {
            headerExchangeHandler0.caught(headerExchangeClient0, remotingException0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.dubbo.remoting.transport.ClientDelegate", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Replier<String> replier0 = (Replier<String>) mock(Replier.class, new ViolatedAssumptionAnswer());
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(replier0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        ChannelHandler channelHandler0 = headerExchangeHandler0.getHandler();
        assertSame(exchangeHandlerDispatcher0, channelHandler0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Replier<String> replier0 = (Replier<String>) mock(Replier.class, new ViolatedAssumptionAnswer());
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(replier0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        headerExchangeHandler0.received((Channel) null, exchangeHandlerDispatcher0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Replier<HeaderExchangeHandler> replier0 = (Replier<HeaderExchangeHandler>) mock(Replier.class, new ViolatedAssumptionAnswer());
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(replier0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        DecodeHandler decodeHandler0 = new DecodeHandler(headerExchangeHandler0);
        headerExchangeHandler0.sent((Channel) null, decodeHandler0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Replier<String> replier0 = (Replier<String>) mock(Replier.class, new ViolatedAssumptionAnswer());
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(replier0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        Request request0 = new Request(1547L);
        request0.setEvent("");
        headerExchangeHandler0.handlerEvent((Channel) null, request0);
        assertFalse(request0.isBroken());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Replier<HeaderExchangeHandler> replier0 = (Replier<HeaderExchangeHandler>) mock(Replier.class, new ViolatedAssumptionAnswer());
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher(replier0);
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        Request request0 = new Request();
        headerExchangeHandler0.handlerEvent((Channel) null, request0);
        assertNull(request0.getVersion());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Response response0 = new Response(1917L);
        HeaderExchangeHandler.handleResponse((Channel) null, response0);
        assertEquals((byte) 20, Response.OK);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        HeaderExchangeHandler headerExchangeHandler0 = null;
        try {
            headerExchangeHandler0 = new HeaderExchangeHandler((ExchangeHandler) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // handler == null
            //
            verifyException("org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new ExchangeHandlerDispatcher();
        HeaderExchangeHandler headerExchangeHandler0 = new HeaderExchangeHandler(exchangeHandlerDispatcher0);
        ClientDelegate clientDelegate0 = new ClientDelegate();
        // Undeclared exception!
        try {
            headerExchangeHandler0.connected(clientDelegate0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.dubbo.remoting.transport.ClientDelegate", e);
        }
    }
}
