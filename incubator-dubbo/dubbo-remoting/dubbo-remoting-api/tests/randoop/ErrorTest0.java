import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.remoting.ChannelHandler channelHandler1 = exchangeServerDelegate0.getChannelHandler();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetSocketAddress inetSocketAddress1 = exchangeServerDelegate0.getLocalAddress();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.dubbo.remoting.transport.ChannelDelegate channelDelegate0 = new org.apache.dubbo.remoting.transport.ChannelDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        channelDelegate0.setAttribute("telnet", (java.lang.Object) "heartbeat.timeout");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.close();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<org.apache.dubbo.remoting.Channel> channelCollection3 = serverDelegate2.getChannels();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.close();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.send((java.lang.Object) "reconnect", false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.close((int) (byte) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = exchangeServerDelegate0.isBound();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serverDelegate2.send((java.lang.Object) "reconnect", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer4 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        byte[] byteArray5 = heapChannelBuffer4.array();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 20, (byte) 70, (byte) 10 };
        heapChannelBuffer4.writeBytes(byteArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serverDelegate2.send((java.lang.Object) heapChannelBuffer4, true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetSocketAddress inetSocketAddress3 = exchangeServerDelegate0.getLocalAddress();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.remoting.ChannelHandler channelHandler2 = serverDelegate1.getChannelHandler();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = exchangeServerDelegate0.isClosed();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetSocketAddress inetSocketAddress3 = exchangeServerDelegate0.getLocalAddress();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        org.apache.dubbo.remoting.buffer.ChannelBufferFactory channelBufferFactory3 = org.apache.dubbo.remoting.buffer.DirectChannelBufferFactory.getInstance();
        org.apache.dubbo.remoting.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.apache.dubbo.remoting.buffer.DynamicChannelBuffer(10, channelBufferFactory3);
        org.apache.dubbo.remoting.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.send((java.lang.Object) dynamicChannelBuffer4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.close();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serverDelegate2.isBound();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        org.apache.dubbo.remoting.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.apache.dubbo.remoting.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int4 = dynamicChannelBuffer3.capacity();
        dynamicChannelBuffer3.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serverDelegate1.send((java.lang.Object) dynamicChannelBuffer3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.startClose();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        byte[] byteArray5 = new byte[] { (byte) 90, (byte) 1, (byte) 20, (byte) -1, (byte) 80 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = org.apache.dubbo.remoting.transport.CodecSupport.isHeartBeat(byteArray5, (byte) 90);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.reconnect();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.removeAttribute("connect.queue.warning.size");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.startClose();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = clientDelegate0.hasAttribute("UTF-8");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.common.URL uRL1 = exchangeServerDelegate0.getUrl();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetSocketAddress inetSocketAddress2 = serverDelegate1.getLocalAddress();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.close(1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer4 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer6 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        boolean boolean7 = org.apache.dubbo.remoting.buffer.ChannelBuffers.equals((org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer4, (org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.send((java.lang.Object) heapChannelBuffer4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.send((java.lang.Object) "UTF-8", false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serverDelegate1.close(0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer headerExchangeServer2 = new org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate3 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj4 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate3);
        exchangeServerDelegate0.setServer((org.apache.dubbo.remoting.exchange.ExchangeServer) exchangeServerDelegate3);
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer7 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer9 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        boolean boolean10 = org.apache.dubbo.remoting.buffer.ChannelBuffers.equals((org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer7, (org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer9);
        heapChannelBuffer9.resetReaderIndex();
        org.apache.dubbo.remoting.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.apache.dubbo.remoting.buffer.DynamicChannelBuffer((int) (byte) 1);
        boolean boolean14 = dynamicChannelBuffer13.hasArray();
        org.apache.dubbo.remoting.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer13.factory();
        int int16 = heapChannelBuffer9.compareTo((org.apache.dubbo.remoting.buffer.ChannelBuffer) dynamicChannelBuffer13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.send((java.lang.Object) int16, false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = clientDelegate0.hasAttribute("payload");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<org.apache.dubbo.remoting.exchange.ExchangeChannel> exchangeChannelCollection3 = exchangeServerDelegate0.getExchangeChannels();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate1 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate((org.apache.dubbo.remoting.exchange.ExchangeServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.remoting.ChannelHandler channelHandler2 = exchangeServerDelegate1.getChannelHandler();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.startClose();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate3 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj4 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate3);
        exchangeServerDelegate0.setServer((org.apache.dubbo.remoting.exchange.ExchangeServer) exchangeServerDelegate3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<org.apache.dubbo.remoting.exchange.ExchangeChannel> exchangeChannelCollection6 = exchangeServerDelegate0.getExchangeChannels();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate1 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate((org.apache.dubbo.remoting.exchange.ExchangeServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.common.URL uRL2 = exchangeServerDelegate1.getUrl();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate1.removeAttribute("codec.version");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate4 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj5 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate4);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate6 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate1.setAttribute("WRITE_TIMESTAMP", (java.lang.Object) exchangeServerDelegate4);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate1 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<org.apache.dubbo.remoting.Channel> channelCollection2 = serverDelegate1.getChannels();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer3 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer5 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        boolean boolean6 = org.apache.dubbo.remoting.buffer.ChannelBuffers.equals((org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer3, (org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer5);
        int int7 = heapChannelBuffer3.readerIndex();
        heapChannelBuffer3.clear();
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer10 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer12 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        boolean boolean13 = org.apache.dubbo.remoting.buffer.ChannelBuffers.equals((org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer10, (org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer12);
        heapChannelBuffer12.resetReaderIndex();
        org.apache.dubbo.remoting.buffer.HeapChannelBuffer heapChannelBuffer17 = new org.apache.dubbo.remoting.buffer.HeapChannelBuffer((int) '4');
        byte[] byteArray18 = heapChannelBuffer17.array();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 20, (byte) 70, (byte) 10 };
        heapChannelBuffer17.writeBytes(byteArray23);
        heapChannelBuffer12.setBytes(0, (org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer17, (int) (byte) 1, 10);
        heapChannelBuffer3.writeBytes((org.apache.dubbo.remoting.buffer.ChannelBuffer) heapChannelBuffer17, (int) ' ', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.setAttribute("connect.queue.warning.size", (java.lang.Object) heapChannelBuffer17);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj2 = clientDelegate0.getAttribute("reconnect");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.close();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        clientDelegate0.close((int) (byte) 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate3 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj4 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate3);
        exchangeServerDelegate0.setServer((org.apache.dubbo.remoting.exchange.ExchangeServer) exchangeServerDelegate3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = exchangeServerDelegate0.isClosed();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate0 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj1 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate0);
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate2 = new org.apache.dubbo.remoting.transport.ServerDelegate((org.apache.dubbo.remoting.RemotingServer) exchangeServerDelegate0);
        org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate exchangeServerDelegate3 = new org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate();
        java.lang.Object obj4 = org.apache.dubbo.remoting.utils.PayloadDropper.getRequestWithoutData((java.lang.Object) exchangeServerDelegate3);
        exchangeServerDelegate0.setServer((org.apache.dubbo.remoting.exchange.ExchangeServer) exchangeServerDelegate3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        exchangeServerDelegate0.startClose();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.common.URL uRL3 = clientDelegate1.getUrl();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate0 = new org.apache.dubbo.remoting.transport.ServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.dubbo.common.URL uRL1 = serverDelegate0.getUrl();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.dubbo.remoting.exchange.support.ExchangeHandlerDispatcher exchangeHandlerDispatcher0 = new org.apache.dubbo.remoting.exchange.support.ExchangeHandlerDispatcher();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        exchangeHandlerDispatcher0.sent((org.apache.dubbo.remoting.Channel) clientDelegate1, (java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = clientDelegate1.getAttribute("codec.version");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate0 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        org.apache.dubbo.remoting.transport.ClientDelegate clientDelegate1 = new org.apache.dubbo.remoting.transport.ClientDelegate();
        clientDelegate0.setClient((org.apache.dubbo.remoting.Client) clientDelegate1);
        org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeClient headerExchangeClient4 = new org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeClient((org.apache.dubbo.remoting.Client) clientDelegate0, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        headerExchangeClient4.startClose();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.dubbo.remoting.transport.ServerDelegate serverDelegate0 = new org.apache.dubbo.remoting.transport.ServerDelegate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = serverDelegate0.isBound();
    }
}

