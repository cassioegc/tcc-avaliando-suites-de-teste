/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 20:07:37 GMT 2021
 */

package org.apache.xml.security.stax.impl.processor.input;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xml.security.binding.xmldsig.SignatureType;
import org.apache.xml.security.stax.ext.InboundSecurityContext;
import org.apache.xml.security.stax.ext.XMLSecurityProperties;
import org.apache.xml.security.stax.impl.DocumentContextImpl;
import org.apache.xml.security.stax.impl.InputProcessorChainImpl;
import org.apache.xml.security.stax.impl.processor.input.XMLSignatureInputHandler;
import org.apache.xml.security.stax.securityToken.InboundSecurityToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLSignatureInputHandler_ESTest extends XMLSignatureInputHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLSignatureInputHandler xMLSignatureInputHandler0 = new XMLSignatureInputHandler();
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      InputProcessorChainImpl inputProcessorChainImpl0 = new InputProcessorChainImpl((InboundSecurityContext) null, documentContextImpl0);
      XMLSecurityProperties xMLSecurityProperties0 = new XMLSecurityProperties();
      SignatureType signatureType0 = new SignatureType();
      // Undeclared exception!
      try { 
        xMLSignatureInputHandler0.newSignatureVerifier(inputProcessorChainImpl0, xMLSecurityProperties0, signatureType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.impl.processor.input.XMLSignatureInputHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMLSignatureInputHandler xMLSignatureInputHandler0 = new XMLSignatureInputHandler();
      DocumentContextImpl documentContextImpl0 = new DocumentContextImpl();
      InputProcessorChainImpl inputProcessorChainImpl0 = new InputProcessorChainImpl((InboundSecurityContext) null, documentContextImpl0);
      // Undeclared exception!
      try { 
        xMLSignatureInputHandler0.addSignatureReferenceInputProcessorToChain(inputProcessorChainImpl0, (XMLSecurityProperties) null, (SignatureType) null, (InboundSecurityToken) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.xml.security.stax.impl.processor.input.XMLSignatureReferenceVerifyInputProcessor
         //
         verifyException("org.apache.xml.security.stax.impl.processor.input.XMLSignatureInputHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLSignatureInputHandler xMLSignatureInputHandler0 = new XMLSignatureInputHandler();
      SignatureType signatureType0 = new SignatureType();
      XMLSecurityProperties xMLSecurityProperties0 = new XMLSecurityProperties();
      XMLSignatureInputHandler.XMLSignatureVerifier xMLSignatureInputHandler_XMLSignatureVerifier0 = null;
      try {
        xMLSignatureInputHandler_XMLSignatureVerifier0 = xMLSignatureInputHandler0.new XMLSignatureVerifier(signatureType0, (InboundSecurityContext) null, xMLSecurityProperties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.stax.config.ConfigurationProperties", e);
      }
  }
}
