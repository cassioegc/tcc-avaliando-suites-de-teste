/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 19:24:50 GMT 2021
 */

package org.apache.xml.security.stax.impl.transformer.canonicalizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import org.apache.xml.security.stax.ext.XMLSecurityConstants;
import org.apache.xml.security.stax.ext.stax.XMLSecAttribute;
import org.apache.xml.security.stax.ext.stax.XMLSecEvent;
import org.apache.xml.security.stax.ext.stax.XMLSecNamespace;
import org.apache.xml.security.stax.ext.stax.XMLSecStartElement;
import org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecEndDocumentImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecProcessingInstructionImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecStartDocumentImpl;
import org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11_OmitCommentsTransformer;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer11_WithCommentsTransformer;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_ExclOmitCommentsTransformer;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_ExclWithCommentsTransformer;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_OmitCommentsTransformer;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_WithCommentsTransformer;
import org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase;
import org.apache.xml.security.utils.UnsyncByteArrayOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CanonicalizerBase_ESTest extends CanonicalizerBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[7] = '\u008B';
      MockPrintStream mockPrintStream0 = new MockPrintStream("A(GXvmwg:HGN?");
      CanonicalizerBase.outputTextToWriter(charArray0, mockPrintStream0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u008B', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      QName qName0 = new QName((String) null, "", "AX7");
      LinkedList<XMLSecAttributeImpl> linkedList0 = new LinkedList<XMLSecAttributeImpl>();
      LinkedList<XMLSecAttribute> linkedList1 = new LinkedList<XMLSecAttribute>(linkedList0);
      CanonicalizerBase.C14NStack<XMLSecEvent> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecEvent>();
      XMLSecStartElementImpl xMLSecStartElementImpl0 = new XMLSecStartElementImpl(qName0, linkedList1, (List<XMLSecNamespace>) null, (XMLSecStartElement) null);
      List<XMLSecAttribute> list0 = canonicalizer20010315_WithCommentsTransformer0.getInitialUtilizedAttributes(xMLSecStartElementImpl0, canonicalizerBase_C14NStack0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Canonicalizer20010315_ExclOmitCommentsTransformer canonicalizer20010315_ExclOmitCommentsTransformer0 = new Canonicalizer20010315_ExclOmitCommentsTransformer();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      canonicalizer20010315_ExclOmitCommentsTransformer0.setProperties(hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Canonicalizer11_OmitCommentsTransformer canonicalizer11_OmitCommentsTransformer0 = new Canonicalizer11_OmitCommentsTransformer();
      QName qName0 = new QName("Missing message string");
      XMLSecStartElement xMLSecStartElement0 = mock(XMLSecStartElement.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(xMLSecStartElement0).getOnElementDeclaredAttributes();
      // Undeclared exception!
      try { 
        canonicalizer11_OmitCommentsTransformer0.getCurrentUtilizedAttributes(xMLSecStartElement0, (CanonicalizerBase.C14NStack<XMLSecEvent>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Canonicalizer20010315_OmitCommentsTransformer canonicalizer20010315_OmitCommentsTransformer0 = new Canonicalizer20010315_OmitCommentsTransformer();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        canonicalizer20010315_OmitCommentsTransformer0.transform((InputStream) byteArrayInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.xml.security.stax.impl.processor.input.XMLEventReaderInputProcessor
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Canonicalizer20010315_ExclWithCommentsTransformer canonicalizer20010315_ExclWithCommentsTransformer0 = new Canonicalizer20010315_ExclWithCommentsTransformer();
      // Undeclared exception!
      try { 
        canonicalizer20010315_ExclWithCommentsTransformer0.setProperties((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_Excl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Canonicalizer20010315_ExclWithCommentsTransformer canonicalizer20010315_ExclWithCommentsTransformer0 = new Canonicalizer20010315_ExclWithCommentsTransformer();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      hashMap0.put("propagateDefaultNamespace", pipedInputStream0);
      // Undeclared exception!
      try { 
        canonicalizer20010315_ExclWithCommentsTransformer0.setProperties(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.PipedInputStream cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_Excl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        CanonicalizerBase.outputTextToWriter(charArray0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[7];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("NotationDeclaration event not supported", false);
      mockFileOutputStream0.close();
      try { 
        CanonicalizerBase.outputTextToWriter(charArray0, mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(535);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      // Undeclared exception!
      try { 
        CanonicalizerBase.outputTextToWriter((String) null, mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        CanonicalizerBase.outputTextToWriter("']K ", pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      HashMap<String, byte[]> hashMap0 = new HashMap<String, byte[]>();
      // Undeclared exception!
      try { 
        CanonicalizerBase.outputAttrToWriter("propagateDefaultNamespace", (String) null, "propagateDefaultNamespace", byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.c14n.implementations.UtfHelpper", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      HashMap<String, byte[]> hashMap0 = new HashMap<String, byte[]>();
      try { 
        CanonicalizerBase.outputAttrToWriter("NODE_BEFORE_DOCUMENT_ELEMENT", "NODE_BEFORE_DOCUMENT_ELEMENT", "NODE_BEFORE_DOCUMENT_ELEMENT", pipedOutputStream0, hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Canonicalizer11_OmitCommentsTransformer canonicalizer11_OmitCommentsTransformer0 = new Canonicalizer11_OmitCommentsTransformer();
      CanonicalizerBase.C14NStack<XMLSecEvent> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecEvent>();
      // Undeclared exception!
      try { 
        canonicalizer11_OmitCommentsTransformer0.getInitialUtilizedNamespaces((XMLSecStartElement) null, canonicalizerBase_C14NStack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Canonicalizer20010315_ExclWithCommentsTransformer canonicalizer20010315_ExclWithCommentsTransformer0 = new Canonicalizer20010315_ExclWithCommentsTransformer();
      CanonicalizerBase.C14NStack<XMLSecEvent> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecEvent>();
      // Undeclared exception!
      try { 
        canonicalizer20010315_ExclWithCommentsTransformer0.getInitialUtilizedAttributes((XMLSecStartElement) null, canonicalizerBase_C14NStack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_Excl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CanonicalizerBase.C14NStack<XMLSecNamespaceImpl> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecNamespaceImpl>();
      List<Comparable> list0 = (List<Comparable>)canonicalizerBase_C14NStack0.peek();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Canonicalizer20010315_OmitCommentsTransformer canonicalizer20010315_OmitCommentsTransformer0 = new Canonicalizer20010315_OmitCommentsTransformer();
      CanonicalizerBase.C14NStack<XMLSecStartDocumentImpl> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecStartDocumentImpl>();
      Object object0 = canonicalizerBase_C14NStack0.containsOnStack(canonicalizer20010315_OmitCommentsTransformer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[3] = '\u0080';
      MockPrintStream mockPrintStream0 = new MockPrintStream("A(GXvmwg:HGN?");
      CanonicalizerBase.outputTextToWriter(charArray0, mockPrintStream0);
      assertEquals(9, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Unsupported class ");
      char[] charArray0 = new char[9];
      charArray0[0] = '<';
      CanonicalizerBase.outputTextToWriter(charArray0, mockPrintStream0);
      assertArrayEquals(new char[] {'<', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[2] = '&';
      MockPrintStream mockPrintStream0 = new MockPrintStream("A(GXvmwg:HGN?");
      CanonicalizerBase.outputTextToWriter(charArray0, mockPrintStream0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '&', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("A(GXvmwg:HGN?");
      CanonicalizerBase.outputTextToWriter("<;pc=", mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("At) &*}&\"/T8{gV_");
      CanonicalizerBase.outputTextToWriter("At) &*}&\"/T8{gV_", mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(63);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      HashMap<String, byte[]> hashMap0 = new HashMap<String, byte[]>();
      CanonicalizerBase.outputAttrToWriter("xmlns", "1OuFTi_\"fsM)n4N2", "1OuFTi_\"fsM)n4N2", bufferedOutputStream0, hashMap0);
      assertEquals(2, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Unsupported class ");
      HashMap<String, byte[]> hashMap0 = new HashMap<String, byte[]>();
      CanonicalizerBase.outputAttrToWriter("Unsupported class ", "Unsupported class ", "oj%WN", mockPrintStream0, hashMap0);
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnsyncByteArrayOutputStream unsyncByteArrayOutputStream0 = new UnsyncByteArrayOutputStream();
      HashMap<String, byte[]> hashMap0 = new HashMap<String, byte[]>();
      CanonicalizerBase.outputAttrToWriter((String) null, "Y", "Y", unsyncByteArrayOutputStream0, hashMap0);
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      canonicalizer20010315_WithCommentsTransformer0.doFinal();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Canonicalizer20010315_ExclOmitCommentsTransformer canonicalizer20010315_ExclOmitCommentsTransformer0 = new Canonicalizer20010315_ExclOmitCommentsTransformer();
      XMLSecStartElement xMLSecStartElement0 = mock(XMLSecStartElement.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xMLSecStartElement0).getEventType();
      canonicalizer20010315_ExclOmitCommentsTransformer0.transform((XMLSecEvent) xMLSecStartElement0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Canonicalizer11_WithCommentsTransformer canonicalizer11_WithCommentsTransformer0 = new Canonicalizer11_WithCommentsTransformer();
      XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl0 = new XMLSecEntityDeclarationImpl("");
      // Undeclared exception!
      try { 
        canonicalizer11_WithCommentsTransformer0.transform((XMLSecEvent) xMLSecEntityDeclarationImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal XMLSecEvent received: 15
         //
         verifyException("org.apache.xml.security.stax.ext.XMLSecurityUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Canonicalizer20010315_ExclWithCommentsTransformer canonicalizer20010315_ExclWithCommentsTransformer0 = new Canonicalizer20010315_ExclWithCommentsTransformer();
      XMLSecCharactersImpl xMLSecCharactersImpl0 = new XMLSecCharactersImpl("NODE_BEFORE_DOCUMENT_ELEMENT", true, true, true, (XMLSecStartElement) null);
      // Undeclared exception!
      try { 
        canonicalizer20010315_ExclWithCommentsTransformer0.transform((XMLSecEvent) xMLSecCharactersImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      QName qName0 = new QName("", "");
      XMLSecAttributeImpl xMLSecAttributeImpl0 = new XMLSecAttributeImpl(qName0, "org.apache.xml.security.stax.impl.transformer.TransformIdentity");
      try { 
        canonicalizer20010315_WithCommentsTransformer0.transform((XMLSecEvent) xMLSecAttributeImpl0);
        fail("Expecting exception: XMLStreamException");
      
      } catch(XMLStreamException e) {
         //
         // illegal event :ATTRIBUTE
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Canonicalizer20010315_ExclOmitCommentsTransformer canonicalizer20010315_ExclOmitCommentsTransformer0 = new Canonicalizer20010315_ExclOmitCommentsTransformer();
      XMLSecEntityDeclarationImpl xMLSecEntityDeclarationImpl0 = new XMLSecEntityDeclarationImpl("");
      QName qName0 = new QName("", "inclusiveNamespacePrefixList", "inclusiveNamespacePrefixList");
      LinkedList<XMLSecNamespace> linkedList0 = new LinkedList<XMLSecNamespace>();
      XMLSecStartElement xMLSecStartElement0 = mock(XMLSecStartElement.class, new ViolatedAssumptionAnswer());
      XMLSecStartElementImpl xMLSecStartElementImpl0 = new XMLSecStartElementImpl(qName0, (List<XMLSecAttribute>) null, linkedList0, xMLSecStartElement0);
      XMLSecEntityReferenceImpl xMLSecEntityReferenceImpl0 = new XMLSecEntityReferenceImpl("", xMLSecEntityDeclarationImpl0, xMLSecStartElementImpl0);
      // Undeclared exception!
      try { 
        canonicalizer20010315_ExclOmitCommentsTransformer0.transform((XMLSecEvent) xMLSecEntityReferenceImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal XMLSecEvent received: 9
         //
         verifyException("org.apache.xml.security.stax.ext.XMLSecurityUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      XMLSecEndDocumentImpl xMLSecEndDocumentImpl0 = new XMLSecEndDocumentImpl();
      canonicalizer20010315_WithCommentsTransformer0.transform((XMLSecEvent) xMLSecEndDocumentImpl0);
      assertTrue(xMLSecEndDocumentImpl0.isEndDocument());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Canonicalizer11 canonicalizer11_0 = new Canonicalizer11(true);
      Boolean boolean0 = new Boolean("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$1");
      XMLSecStartDocumentImpl xMLSecStartDocumentImpl0 = new XMLSecStartDocumentImpl("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "inclusiveNamespacePrefixList", boolean0, "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$C14NStack");
      canonicalizer11_0.transform((XMLSecEvent) xMLSecStartDocumentImpl0);
      assertTrue(xMLSecStartDocumentImpl0.encodingSet());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Canonicalizer20010315_ExclOmitCommentsTransformer canonicalizer20010315_ExclOmitCommentsTransformer0 = new Canonicalizer20010315_ExclOmitCommentsTransformer();
      QName qName0 = new QName("inclusiveNamespacePrefixList", "xml");
      LinkedList<XMLSecAttribute> linkedList0 = new LinkedList<XMLSecAttribute>();
      XMLSecStartElementImpl xMLSecStartElementImpl0 = new XMLSecStartElementImpl(qName0, linkedList0, (Collection<XMLSecNamespace>) null);
      XMLSecCommentImpl xMLSecCommentImpl0 = new XMLSecCommentImpl("", xMLSecStartElementImpl0);
      canonicalizer20010315_ExclOmitCommentsTransformer0.transform((XMLSecEvent) xMLSecCommentImpl0);
      assertFalse(xMLSecCommentImpl0.isStartElement());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Canonicalizer20010315_ExclWithCommentsTransformer canonicalizer20010315_ExclWithCommentsTransformer0 = new Canonicalizer20010315_ExclWithCommentsTransformer();
      XMLSecCharactersImpl xMLSecCharactersImpl0 = new XMLSecCharactersImpl("NODE_BEFORE_DOCUMENT_ELEMENT", false, false, false, (XMLSecStartElement) null);
      canonicalizer20010315_ExclWithCommentsTransformer0.transform((XMLSecEvent) xMLSecCharactersImpl0);
      assertFalse(xMLSecCharactersImpl0.isNamespace());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Canonicalizer11_OmitCommentsTransformer canonicalizer11_OmitCommentsTransformer0 = new Canonicalizer11_OmitCommentsTransformer();
      XMLSecNamespace xMLSecNamespace0 = XMLSecNamespaceImpl.getInstance("0@", "");
      try { 
        canonicalizer11_OmitCommentsTransformer0.transform((XMLSecEvent) xMLSecNamespace0);
        fail("Expecting exception: XMLStreamException");
      
      } catch(XMLStreamException e) {
         //
         // illegal event :NAMESPACE
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      XMLSecurityConstants.TransformMethod xMLSecurityConstants_TransformMethod0 = XMLSecurityConstants.TransformMethod.InputStream;
      XMLSecurityConstants.TransformMethod xMLSecurityConstants_TransformMethod1 = canonicalizer20010315_WithCommentsTransformer0.getPreferredTransformMethod(xMLSecurityConstants_TransformMethod0);
      assertSame(xMLSecurityConstants_TransformMethod1, xMLSecurityConstants_TransformMethod0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      XMLSecurityConstants.TransformMethod xMLSecurityConstants_TransformMethod0 = XMLSecurityConstants.TransformMethod.XMLSecEvent;
      XMLSecurityConstants.TransformMethod xMLSecurityConstants_TransformMethod1 = canonicalizer20010315_WithCommentsTransformer0.getPreferredTransformMethod(xMLSecurityConstants_TransformMethod0);
      assertEquals(XMLSecurityConstants.TransformMethod.XMLSecEvent, xMLSecurityConstants_TransformMethod1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      QName qName0 = new QName((String) null, "y1~'QR\"*", "Unsupported class ");
      XMLSecStartElementImpl xMLSecStartElementImpl0 = new XMLSecStartElementImpl(qName0, (Collection<XMLSecAttribute>) null, (Collection<XMLSecNamespace>) null);
      XMLSecAttributeImpl xMLSecAttributeImpl0 = new XMLSecAttributeImpl(qName0, "Missing message ID");
      XMLSecNamespace xMLSecNamespace0 = xMLSecAttributeImpl0.getAttributeNamespace();
      xMLSecStartElementImpl0.addNamespace(xMLSecNamespace0);
      // Undeclared exception!
      try { 
        canonicalizer20010315_WithCommentsTransformer0.transform((XMLSecEvent) xMLSecStartElementImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Canonicalizer20010315_WithCommentsTransformer canonicalizer20010315_WithCommentsTransformer0 = new Canonicalizer20010315_WithCommentsTransformer();
      QName qName0 = new QName("Unsupported class ", "y1~'QR\"*", "Unsupported class ");
      XMLSecStartElementImpl xMLSecStartElementImpl0 = new XMLSecStartElementImpl(qName0, (Collection<XMLSecAttribute>) null, (Collection<XMLSecNamespace>) null);
      XMLSecAttributeImpl xMLSecAttributeImpl0 = new XMLSecAttributeImpl(qName0, "Missing message ID");
      XMLSecNamespace xMLSecNamespace0 = xMLSecAttributeImpl0.getAttributeNamespace();
      xMLSecStartElementImpl0.addNamespace(xMLSecNamespace0);
      // Undeclared exception!
      try { 
        canonicalizer20010315_WithCommentsTransformer0.transform((XMLSecEvent) xMLSecStartElementImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Canonicalizer11 canonicalizer11_0 = new Canonicalizer11(true);
      QName qName0 = new QName("namespace is relative encountered: ", "namespace is relative encountered: ", "X$Pl&O#9_");
      LinkedList<XMLSecAttribute> linkedList0 = new LinkedList<XMLSecAttribute>();
      XMLSecStartElement xMLSecStartElement0 = mock(XMLSecStartElement.class, new ViolatedAssumptionAnswer());
      CanonicalizerBase.C14NStack<XMLSecEvent> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecEvent>();
      List<XMLSecNamespace> list0 = canonicalizer11_0.getInitialUtilizedNamespaces(xMLSecStartElement0, canonicalizerBase_C14NStack0);
      XMLSecAttributeImpl xMLSecAttributeImpl0 = new XMLSecAttributeImpl(qName0, "X$Pl&O#9_");
      linkedList0.add((XMLSecAttribute) xMLSecAttributeImpl0);
      XMLSecStartElementImpl xMLSecStartElementImpl0 = new XMLSecStartElementImpl(qName0, linkedList0, list0);
      List<XMLSecAttribute> list1 = canonicalizer11_0.getCurrentUtilizedAttributes(xMLSecStartElementImpl0, canonicalizerBase_C14NStack0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Canonicalizer20010315_OmitCommentsTransformer canonicalizer20010315_OmitCommentsTransformer0 = new Canonicalizer20010315_OmitCommentsTransformer();
      XMLSecNamespace xMLSecNamespace0 = XMLSecNamespaceImpl.getInstance("Unsupported class ", "G2H*QFd,KgYS5");
      CanonicalizerBase.C14NStack<XMLSecEvent> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecEvent>();
      XMLSecStartElement xMLSecStartElement0 = mock(XMLSecStartElement.class, new ViolatedAssumptionAnswer());
      doReturn(xMLSecNamespace0).when(xMLSecStartElement0).getElementNamespace();
      // Undeclared exception!
      try { 
        canonicalizer20010315_OmitCommentsTransformer0.getCurrentUtilizedNamespaces(xMLSecStartElement0, canonicalizerBase_C14NStack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CanonicalizerBase.C14NStack<XMLSecProcessingInstructionImpl> canonicalizerBase_C14NStack0 = new CanonicalizerBase.C14NStack<XMLSecProcessingInstructionImpl>();
      // Undeclared exception!
      try { 
        canonicalizerBase_C14NStack0.peekFirst();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Use peek()
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$C14NStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Canonicalizer11_WithCommentsTransformer canonicalizer11_WithCommentsTransformer0 = new Canonicalizer11_WithCommentsTransformer();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        canonicalizer11_WithCommentsTransformer0.setProperties(hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // InclusiveNamespace-PrefixList not supported
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Canonicalizer11_OmitCommentsTransformer canonicalizer11_OmitCommentsTransformer0 = new Canonicalizer11_OmitCommentsTransformer();
      canonicalizer11_OmitCommentsTransformer0.setTransformer(canonicalizer11_OmitCommentsTransformer0);
      // Undeclared exception!
      try { 
        canonicalizer11_OmitCommentsTransformer0.doFinal();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.xml.security.stax.impl.processor.input.XMLEventReaderInputProcessor
         //
         verifyException("org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase", e);
      }
  }
}
