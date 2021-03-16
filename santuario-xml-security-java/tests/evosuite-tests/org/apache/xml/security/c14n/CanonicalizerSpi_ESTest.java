/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 18:43:22 GMT 2021
 */

package org.apache.xml.security.c14n;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.xml.security.c14n.implementations.Canonicalizer11_OmitComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer11_WithComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments;
import org.apache.xml.security.c14n.implementations.CanonicalizerPhysical;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CanonicalizerSpi_ESTest extends CanonicalizerSpi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("http://www.w3.org/XML/1998/namespace");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      XMLSignatureInput xMLSignatureInput0 = new XMLSignatureInput(iIOMetadataNode0);
      Set<Node> set0 = xMLSignatureInput0.getNodeSet();
      canonicalizer20010315ExclWithComments0.engineCanonicalizeXPathNodeSet(set0, "ietONx11nXoXpBw", (OutputStream) mockFileOutputStream0);
      assertEquals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", canonicalizer20010315ExclWithComments0.engineGetURI());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CanonicalizerPhysical canonicalizerPhysical0 = new CanonicalizerPhysical();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.xml.security.Init");
      XMLSignatureInput xMLSignatureInput0 = new XMLSignatureInput(iIOMetadataNode0);
      Set<Node> set0 = xMLSignatureInput0.getNodeSet(false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.xml.security.Init");
      canonicalizerPhysical0.engineCanonicalizeXPathNodeSet(set0, (OutputStream) mockFileOutputStream0);
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      MockPrintStream mockPrintStream0 = new MockPrintStream("xml");
      canonicalizer20010315ExclWithComments0.engineCanonicalizeSubTree((Node) null, "[[w7qFC1<PbwvYw('", true, (OutputStream) mockPrintStream0);
      assertEquals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", canonicalizer20010315ExclWithComments0.engineGetURI());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("http://www.w3.org/XML/1998/namespace");
      canonicalizer20010315ExclWithComments0.engineCanonicalizeSubTree((Node) null, "", (OutputStream) mockFileOutputStream0);
      assertEquals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", canonicalizer20010315ExclWithComments0.engineGetURI());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Canonicalizer11_WithComments canonicalizer11_WithComments0 = new Canonicalizer11_WithComments();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("xml", false);
      canonicalizer11_WithComments0.engineCanonicalizeSubTree((Node) null, (OutputStream) mockFileOutputStream0);
      assertEquals("http://www.w3.org/2006/12/xml-c14n11#WithComments", canonicalizer11_WithComments0.engineGetURI());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Canonicalizer11_WithComments canonicalizer11_WithComments0 = new Canonicalizer11_WithComments();
      String string0 = canonicalizer11_WithComments0.engineGetURI();
      assertEquals("http://www.w3.org/2006/12/xml-c14n11#WithComments", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CanonicalizerPhysical canonicalizerPhysical0 = new CanonicalizerPhysical();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Odo-S`U");
      try { 
        canonicalizerPhysical0.engineCanonicalizeXPathNodeSet((Set<Node>) null, "http://www.w3.org/2006/12/xml-c14n11", (OutputStream) mockPrintStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.
         //
         verifyException("org.apache.xml.security.c14n.implementations.CanonicalizerPhysical", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("xmlns");
      // Undeclared exception!
      try { 
        canonicalizer20010315ExclWithComments0.engineCanonicalizeXPathNodeSet((Set<Node>) null, "F.@|0", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.utils.XMLUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      LinkedHashSet<Node> linkedHashSet0 = new LinkedHashSet<Node>();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        canonicalizer20010315ExclWithComments0.engineCanonicalizeXPathNodeSet((Set<Node>) linkedHashSet0, "u_#fHEt", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library. Original message was \"\"
         //
         verifyException("org.apache.xml.security.utils.XMLUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        canonicalizer20010315ExclWithComments0.engineCanonicalizeXPathNodeSet((Set<Node>) null, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.utils.XMLUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CanonicalizerPhysical canonicalizerPhysical0 = new CanonicalizerPhysical();
      LinkedHashSet<Node> linkedHashSet0 = new LinkedHashSet<Node>();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("xmlns", true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(objectOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        canonicalizerPhysical0.engineCanonicalizeXPathNodeSet((Set<Node>) linkedHashSet0, (OutputStream) mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library. Original message was \"\"
         //
         verifyException("org.apache.xml.security.utils.XMLUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new Canonicalizer20010315WithComments();
      try { 
        canonicalizer20010315WithComments0.engineCanonicalizeSubTree((Node) null, "", false, (OutputStream) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.
         //
         verifyException("org.apache.xml.security.c14n.implementations.Canonicalizer20010315", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments0 = new Canonicalizer20010315ExclOmitComments();
      // Undeclared exception!
      try { 
        canonicalizer20010315ExclOmitComments0.engineCanonicalizeSubTree((Node) null, "5zL`?9", true, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.c14n.implementations.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new Canonicalizer20010315WithComments();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      try { 
        canonicalizer20010315WithComments0.engineCanonicalizeSubTree((Node) iIOMetadataNode0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", (OutputStream) mockPrintStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.
         //
         verifyException("org.apache.xml.security.c14n.implementations.Canonicalizer20010315", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      MockFile mockFile0 = new MockFile("^");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      // Undeclared exception!
      try { 
        canonicalizer20010315ExclWithComments0.engineCanonicalizeSubTree((Node) iIOMetadataNode0, "", (OutputStream) mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.c14n.implementations.UtfHelpper", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new Canonicalizer20010315OmitComments();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, 1399);
      // Undeclared exception!
      try { 
        canonicalizer20010315OmitComments0.engineCanonicalizeSubTree((Node) iIOMetadataNode0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.c14n.implementations.UtfHelpper", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Canonicalizer11_OmitComments canonicalizer11_OmitComments0 = new Canonicalizer11_OmitComments();
      // Undeclared exception!
      try { 
        canonicalizer11_OmitComments0.engineCanonicalize((byte[]) null, (OutputStream) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new Canonicalizer20010315ExclWithComments();
      byte[] byteArray0 = new byte[3];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("http://www.w3.org/XML/1998/namespace");
      try { 
        canonicalizer20010315ExclWithComments0.engineCanonicalize(byteArray0, mockFileOutputStream0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.
         //
         verifyException("org.apache.xml.security.parser.XMLParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Canonicalizer11_WithComments canonicalizer11_WithComments0 = new Canonicalizer11_WithComments();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xml");
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      MockFile mockFile0 = new MockFile("", "xml");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      // Undeclared exception!
      canonicalizer11_WithComments0.engineCanonicalizeSubTree((Node) iIOMetadataNode0, (OutputStream) mockFileOutputStream0);
  }
}
