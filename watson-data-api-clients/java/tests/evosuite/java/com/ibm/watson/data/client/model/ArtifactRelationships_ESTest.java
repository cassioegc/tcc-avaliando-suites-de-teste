/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 20:38:38 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.ArtifactRelationships;
import com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArtifactRelationships_ESTest extends ArtifactRelationships_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      ArtifactRelationships artifactRelationships1 = artifactRelationships0.versionId("If$@?'hZ}dExv");
      String string0 = artifactRelationships1.getVersionId();
      assertEquals("If$@?'hZ}dExv", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      artifactRelationships0.versionId("");
      String string0 = artifactRelationships0.getVersionId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      HashMap<String, PaginatedAbstractRelationshipList> hashMap0 = new HashMap<String, PaginatedAbstractRelationshipList>();
      ArtifactRelationships artifactRelationships1 = artifactRelationships0.relationships(hashMap0);
      Map<String, PaginatedAbstractRelationshipList> map0 = artifactRelationships1.getRelationships();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      artifactRelationships0.putRelationshipsItem("", paginatedAbstractRelationshipList0);
      Map<String, PaginatedAbstractRelationshipList> map0 = artifactRelationships0.getRelationships();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      artifactRelationships0.setArtifactId("HW:GGrIV#O!(");
      String string0 = artifactRelationships0.getArtifactId();
      assertEquals("HW:GGrIV#O!(", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      ArtifactRelationships artifactRelationships1 = artifactRelationships0.artifactId("");
      String string0 = artifactRelationships1.getArtifactId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      ArtifactRelationships artifactRelationships1 = artifactRelationships0.putRelationshipsItem("class PaginatedAbstractRelationshipList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}", paginatedAbstractRelationshipList0);
      String string0 = artifactRelationships1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      ArtifactRelationships artifactRelationships1 = new ArtifactRelationships();
      boolean boolean0 = artifactRelationships0.equals(artifactRelationships1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      boolean boolean0 = artifactRelationships0.equals("pC5r,SJ/ b");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      boolean boolean0 = artifactRelationships0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      boolean boolean0 = artifactRelationships0.equals(artifactRelationships0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      artifactRelationships0.putRelationshipsItem("    versionId: ", paginatedAbstractRelationshipList0);
      ArtifactRelationships artifactRelationships1 = artifactRelationships0.putRelationshipsItem("    versionId: ", paginatedAbstractRelationshipList0);
      assertNull(artifactRelationships1.getArtifactId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      Map<String, PaginatedAbstractRelationshipList> map0 = artifactRelationships0.getRelationships();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      artifactRelationships0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      String string0 = artifactRelationships0.getVersionId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      artifactRelationships0.versionId("pC5r,SJ/ b");
      ArtifactRelationships artifactRelationships1 = new ArtifactRelationships();
      boolean boolean0 = artifactRelationships0.equals(artifactRelationships1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      HashMap<String, PaginatedAbstractRelationshipList> hashMap0 = new HashMap<String, PaginatedAbstractRelationshipList>();
      artifactRelationships0.setRelationships(hashMap0);
      ArtifactRelationships artifactRelationships1 = new ArtifactRelationships();
      boolean boolean0 = artifactRelationships0.equals(artifactRelationships1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      artifactRelationships0.setVersionId("");
      assertNull(artifactRelationships0.getArtifactId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      artifactRelationships0.setArtifactId("");
      ArtifactRelationships artifactRelationships1 = new ArtifactRelationships();
      boolean boolean0 = artifactRelationships1.equals(artifactRelationships0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArtifactRelationships artifactRelationships0 = new ArtifactRelationships();
      String string0 = artifactRelationships0.getArtifactId();
      assertNull(string0);
  }
}
