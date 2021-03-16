/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 18:47:50 GMT 2021
 */

package org.apache.xml.security.stax.securityEvent;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.stax.securityEvent.SecurityEventConstants;
import org.apache.xml.security.stax.securityEvent.SignatureValueSecurityEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecurityEvent_ESTest extends SecurityEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SignatureValueSecurityEvent signatureValueSecurityEvent0 = new SignatureValueSecurityEvent();
      signatureValueSecurityEvent0.setCorrelationID("org.apache.xml.security.stax.securityEvent.SecurityEvent");
      String string0 = signatureValueSecurityEvent0.getCorrelationID();
      assertEquals("org.apache.xml.security.stax.securityEvent.SecurityEvent", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SignatureValueSecurityEvent signatureValueSecurityEvent0 = new SignatureValueSecurityEvent();
      SecurityEventConstants.Event securityEventConstants_Event0 = signatureValueSecurityEvent0.getSecurityEventType();
      assertEquals("SignatureValue", securityEventConstants_Event0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SignatureValueSecurityEvent signatureValueSecurityEvent0 = new SignatureValueSecurityEvent();
      String string0 = signatureValueSecurityEvent0.getCorrelationID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SignatureValueSecurityEvent signatureValueSecurityEvent0 = new SignatureValueSecurityEvent();
      signatureValueSecurityEvent0.setCorrelationID("");
      String string0 = signatureValueSecurityEvent0.getCorrelationID();
      assertEquals("", string0);
  }
}
