/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 20:09:57 GMT 2021
 */

package org.apache.xml.security.stax.impl.processor.input;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import org.apache.xml.security.binding.xmldsig.SignatureType;
import org.apache.xml.security.stax.ext.InboundSecurityContext;
import org.apache.xml.security.stax.ext.InputProcessorChain;
import org.apache.xml.security.stax.ext.XMLSecurityProperties;
import org.apache.xml.security.stax.ext.stax.XMLSecEvent;
import org.apache.xml.security.stax.impl.InputProcessorChainImpl;
import org.apache.xml.security.stax.impl.processor.input.XMLSignatureInputHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSignatureInputHandler_ESTest extends AbstractSignatureInputHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLSignatureInputHandler xMLSignatureInputHandler0 = new XMLSignatureInputHandler();
      SignatureType signatureType0 = new SignatureType();
      LinkedList<XMLSecEvent> linkedList0 = new LinkedList<XMLSecEvent>();
      // Undeclared exception!
      try { 
        xMLSignatureInputHandler0.verifySignedInfo((InputProcessorChain) null, (XMLSecurityProperties) null, signatureType0, linkedList0, 1938);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.processor.input.AbstractSignatureInputHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMLSignatureInputHandler xMLSignatureInputHandler0 = new XMLSignatureInputHandler();
      SignatureType signatureType0 = new SignatureType();
      ArrayDeque<XMLSecEvent> arrayDeque0 = new ArrayDeque<XMLSecEvent>();
      // Undeclared exception!
      try { 
        xMLSignatureInputHandler0.reparseSignedInfo((InputProcessorChain) null, (XMLSecurityProperties) null, signatureType0, arrayDeque0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.processor.input.AbstractSignatureInputHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLSignatureInputHandler xMLSignatureInputHandler0 = new XMLSignatureInputHandler();
      InputProcessorChainImpl inputProcessorChainImpl0 = new InputProcessorChainImpl((InboundSecurityContext) null, 59);
      ArrayDeque<XMLSecEvent> arrayDeque0 = new ArrayDeque<XMLSecEvent>();
      // Undeclared exception!
      try { 
        xMLSignatureInputHandler0.handle(inputProcessorChainImpl0, (XMLSecurityProperties) null, arrayDeque0, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.processor.input.AbstractSignatureInputHandler", e);
      }
  }
}
