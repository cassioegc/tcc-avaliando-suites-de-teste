/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 22:10:51 GMT 2021
 */

package org.apache.xml.security.keys.content;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.xml.security.keys.content.KeyName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyName_ESTest extends KeyName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("KeyName");
      KeyName keyName0 = new KeyName(iIOMetadataNode0, "KeyName");
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      iIOMetadataNode0.insertBefore(iIOMetadataNode0, node0);
      // Undeclared exception!
      keyName0.getKeyName();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      KeyName keyName0 = null;
      try {
        keyName0 = new KeyName(iIOMetadataNode0, "");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.
         //
         verifyException("org.apache.xml.security.utils.ElementProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("KeyName");
      KeyName keyName0 = new KeyName(iIOMetadataNode0, "qo|4X9~X*t");
      String string0 = keyName0.getBaseLocalName();
      assertEquals("KeyName", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KeyName keyName0 = null;
      try {
        keyName0 = new KeyName((Document) null, "m_xIN6mRk");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Document is null
         //
         verifyException("org.apache.xml.security.utils.SignatureElementProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("KeyName");
      KeyName keyName0 = new KeyName(iIOMetadataNode0, "KeyName");
      String string0 = keyName0.getKeyName();
      assertEquals("", string0);
  }
}
