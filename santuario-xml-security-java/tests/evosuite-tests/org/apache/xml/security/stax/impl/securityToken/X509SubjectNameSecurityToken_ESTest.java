/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 19:19:05 GMT 2021
 */

package org.apache.xml.security.stax.impl.securityToken;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xml.security.stax.ext.InboundSecurityContext;
import org.apache.xml.security.stax.impl.securityToken.KeyNameSecurityToken;
import org.apache.xml.security.stax.impl.securityToken.X509SubjectNameSecurityToken;
import org.apache.xml.security.stax.securityToken.SecurityTokenConstants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class X509SubjectNameSecurityToken_ESTest extends X509SubjectNameSecurityToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeyNameSecurityToken keyNameSecurityToken0 = new KeyNameSecurityToken("!Oc,~G G3RV&f\"fbhl", (InboundSecurityContext) null);
      SecurityTokenConstants.TokenType securityTokenConstants_TokenType0 = keyNameSecurityToken0.getTokenType();
      X509SubjectNameSecurityToken x509SubjectNameSecurityToken0 = new X509SubjectNameSecurityToken(securityTokenConstants_TokenType0, (InboundSecurityContext) null, "!Oc,~G G3RV&f\"fbhl");
      x509SubjectNameSecurityToken0.setSubjectName("!Oc,~G G3RV&f\"fbhl");
      String string0 = x509SubjectNameSecurityToken0.getSubjectName();
      assertEquals("!Oc,~G G3RV&f\"fbhl", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecurityTokenConstants.TokenType securityTokenConstants_TokenType0 = new SecurityTokenConstants.TokenType("");
      X509SubjectNameSecurityToken x509SubjectNameSecurityToken0 = null;
      try {
        x509SubjectNameSecurityToken0 = new X509SubjectNameSecurityToken(securityTokenConstants_TokenType0, (InboundSecurityContext) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No id specified
         //
         verifyException("org.apache.xml.security.stax.impl.securityToken.AbstractSecurityToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SecurityTokenConstants.TokenType securityTokenConstants_TokenType0 = new SecurityTokenConstants.TokenType("KeyName");
      X509SubjectNameSecurityToken x509SubjectNameSecurityToken0 = new X509SubjectNameSecurityToken(securityTokenConstants_TokenType0, (InboundSecurityContext) null, "KeyName");
      x509SubjectNameSecurityToken0.setSubjectName("");
      String string0 = x509SubjectNameSecurityToken0.getSubjectName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecurityTokenConstants.TokenType securityTokenConstants_TokenType0 = new SecurityTokenConstants.TokenType("KeyName");
      X509SubjectNameSecurityToken x509SubjectNameSecurityToken0 = new X509SubjectNameSecurityToken(securityTokenConstants_TokenType0, (InboundSecurityContext) null, "KeyName");
      String string0 = x509SubjectNameSecurityToken0.getSubjectName();
      assertNull(string0);
  }
}
