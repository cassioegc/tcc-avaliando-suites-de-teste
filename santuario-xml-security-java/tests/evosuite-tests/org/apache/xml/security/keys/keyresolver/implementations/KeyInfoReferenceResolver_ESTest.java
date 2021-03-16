/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 21:40:26 GMT 2021
 */

package org.apache.xml.security.keys.keyresolver.implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import javax.crypto.SecretKey;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.xml.security.keys.keyresolver.implementations.KeyInfoReferenceResolver;
import org.apache.xml.security.keys.storage.StorageResolver;
import org.apache.xml.security.keys.storage.StorageResolverSpi;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyInfoReferenceResolver_ESTest extends KeyInfoReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeyInfoReferenceResolver keyInfoReferenceResolver0 = new KeyInfoReferenceResolver();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      SecretKey secretKey0 = keyInfoReferenceResolver0.engineResolveSecretKey(iIOMetadataNode0, "J?qxGxssuO&(sUGG", (StorageResolver) null, true);
      assertNull(secretKey0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeyInfoReferenceResolver keyInfoReferenceResolver0 = new KeyInfoReferenceResolver();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      StorageResolver storageResolver0 = new StorageResolver((X509Certificate) null);
      PublicKey publicKey0 = keyInfoReferenceResolver0.engineResolvePublicKey(iIOMetadataNode0, "T0/?|q(_Dxr.p>*}Ot", storageResolver0, false);
      assertNull(publicKey0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeyInfoReferenceResolver keyInfoReferenceResolver0 = new KeyInfoReferenceResolver();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("oNe.RK[?ktt~$hF`\"nr");
      StorageResolver storageResolver0 = new StorageResolver((X509Certificate) null);
      PrivateKey privateKey0 = keyInfoReferenceResolver0.engineResolvePrivateKey(iIOMetadataNode0, "oNe.RK[?ktt~$hF`\"nr", storageResolver0, true);
      assertNull(privateKey0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KeyInfoReferenceResolver keyInfoReferenceResolver0 = new KeyInfoReferenceResolver();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("KeyInfoReference");
      StorageResolver storageResolver0 = new StorageResolver((StorageResolverSpi) null);
      X509Certificate x509Certificate0 = keyInfoReferenceResolver0.engineResolveX509Certificate(iIOMetadataNode0, "KeyInfoReference", storageResolver0, false);
      assertNull(x509Certificate0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeyInfoReferenceResolver keyInfoReferenceResolver0 = new KeyInfoReferenceResolver();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("KeyInfoReference");
      StorageResolver storageResolver0 = new StorageResolver((StorageResolverSpi) null);
      boolean boolean0 = keyInfoReferenceResolver0.engineCanResolve(iIOMetadataNode0, "KeyInfoReference", storageResolver0);
      assertFalse(boolean0);
  }
}
