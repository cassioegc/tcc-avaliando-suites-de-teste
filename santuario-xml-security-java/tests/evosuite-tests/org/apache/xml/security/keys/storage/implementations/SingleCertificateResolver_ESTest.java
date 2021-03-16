/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 21:28:57 GMT 2021
 */

package org.apache.xml.security.keys.storage.implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingleCertificateResolver_ESTest extends SingleCertificateResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SingleCertificateResolver.InternalIterator singleCertificateResolver_InternalIterator0 = new SingleCertificateResolver.InternalIterator((X509Certificate) null);
      singleCertificateResolver_InternalIterator0.next();
      assertFalse(singleCertificateResolver_InternalIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SingleCertificateResolver.InternalIterator singleCertificateResolver_InternalIterator0 = new SingleCertificateResolver.InternalIterator((X509Certificate) null);
      boolean boolean0 = singleCertificateResolver_InternalIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(x509Certificate0).toString();
      SingleCertificateResolver.InternalIterator singleCertificateResolver_InternalIterator0 = new SingleCertificateResolver.InternalIterator(x509Certificate0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      singleCertificateResolver_InternalIterator0.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        singleCertificateResolver_InternalIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver$InternalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SingleCertificateResolver.InternalIterator singleCertificateResolver_InternalIterator0 = new SingleCertificateResolver.InternalIterator((X509Certificate) null);
      // Undeclared exception!
      try { 
        singleCertificateResolver_InternalIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Can't remove keys from KeyStore
         //
         verifyException("org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver$InternalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      SingleCertificateResolver singleCertificateResolver0 = new SingleCertificateResolver(x509Certificate0);
      Iterator<Certificate> iterator0 = singleCertificateResolver0.getIterator();
      assertNotNull(iterator0);
  }
}
