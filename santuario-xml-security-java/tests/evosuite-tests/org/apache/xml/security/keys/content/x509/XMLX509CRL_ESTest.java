/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 21:59:24 GMT 2021
 */

package org.apache.xml.security.keys.content.x509;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.xml.security.keys.content.x509.XMLX509CRL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLX509CRL_ESTest extends XMLX509CRL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      XMLX509CRL xMLX509CRL0 = null;
      try {
        xMLX509CRL0 = new XMLX509CRL(iIOMetadataNode0, "defaultNamespaceCannotBeSetHere");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.
         //
         verifyException("org.apache.xml.security.utils.ElementProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("X509CRL");
      XMLX509CRL xMLX509CRL0 = new XMLX509CRL(iIOMetadataNode0, "X509CRL");
      String string0 = xMLX509CRL0.getBaseLocalName();
      assertEquals("X509CRL", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      XMLX509CRL xMLX509CRL0 = null;
      try {
        xMLX509CRL0 = new XMLX509CRL((Document) null, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Document is null
         //
         verifyException("org.apache.xml.security.utils.SignatureElementProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("X509CRL");
      XMLX509CRL xMLX509CRL0 = new XMLX509CRL(iIOMetadataNode0, "X509CRL");
      byte[] byteArray0 = xMLX509CRL0.getCRLBytes();
      assertArrayEquals(new byte[] {}, byteArray0);
  }
}
