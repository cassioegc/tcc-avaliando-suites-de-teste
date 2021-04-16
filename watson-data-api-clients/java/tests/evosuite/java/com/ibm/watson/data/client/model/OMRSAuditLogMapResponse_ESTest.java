/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 01:30:00 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.OMRSAuditLogMapResponse;
import com.ibm.watson.data.client.model.OMRSAuditLogResponse;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OMRSAuditLogMapResponse_ESTest extends OMRSAuditLogMapResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      oMRSAuditLogMapResponse0.setAuditLogs((Map<String, List<OMRSAuditLogResponse>>) null);
      Map<String, List<OMRSAuditLogResponse>> map0 = oMRSAuditLogMapResponse0.getAuditLogs();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      LinkedList<OMRSAuditLogResponse> linkedList0 = new LinkedList<OMRSAuditLogResponse>();
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse1 = oMRSAuditLogMapResponse0.putAuditLogsItem("class OMRSAuditLogMapResponse {\n    auditLogs: java.util.HashMap@0000000002\n}", linkedList0);
      Map<String, List<OMRSAuditLogResponse>> map0 = oMRSAuditLogMapResponse1.getAuditLogs();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      LinkedList<OMRSAuditLogResponse> linkedList0 = new LinkedList<OMRSAuditLogResponse>();
      oMRSAuditLogMapResponse0.setAuditLogs((Map<String, List<OMRSAuditLogResponse>>) null);
      // Undeclared exception!
      try { 
        oMRSAuditLogMapResponse0.putAuditLogsItem("class OMRSAuditLogMapResponse {\n    auditLogs: java.util.HashMap@0000000002\n}", linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.watson.data.client.model.OMRSAuditLogMapResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      LinkedList<OMRSAuditLogResponse> linkedList0 = new LinkedList<OMRSAuditLogResponse>();
      List<OMRSAuditLogResponse> list0 = linkedList0.subList(0, 0);
      oMRSAuditLogMapResponse0.putAuditLogsItem("evWDus", list0);
      OMRSAuditLogResponse oMRSAuditLogResponse0 = new OMRSAuditLogResponse();
      linkedList0.add(oMRSAuditLogResponse0);
      // Undeclared exception!
      try { 
        oMRSAuditLogMapResponse0.hashCode();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      oMRSAuditLogMapResponse0.setAuditLogs((Map<String, List<OMRSAuditLogResponse>>) null);
      String string0 = oMRSAuditLogMapResponse0.toString();
      assertEquals("class OMRSAuditLogMapResponse {\n    auditLogs: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      boolean boolean0 = oMRSAuditLogMapResponse0.equals("cleanupCallback");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      boolean boolean0 = oMRSAuditLogMapResponse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      boolean boolean0 = oMRSAuditLogMapResponse0.equals(oMRSAuditLogMapResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      oMRSAuditLogMapResponse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      String string0 = oMRSAuditLogMapResponse0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      Map<String, List<OMRSAuditLogResponse>> map0 = oMRSAuditLogMapResponse0.getAuditLogs();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      LinkedList<OMRSAuditLogResponse> linkedList0 = new LinkedList<OMRSAuditLogResponse>();
      oMRSAuditLogMapResponse0.putAuditLogsItem("class OMRSAuditLogMapResponse {\n    auditLogs: java.util.HashMap@0000000002\n}", linkedList0);
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse1 = new OMRSAuditLogMapResponse();
      boolean boolean0 = oMRSAuditLogMapResponse0.equals(oMRSAuditLogMapResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse0 = new OMRSAuditLogMapResponse();
      HashMap<String, List<OMRSAuditLogResponse>> hashMap0 = new HashMap<String, List<OMRSAuditLogResponse>>();
      OMRSAuditLogMapResponse oMRSAuditLogMapResponse1 = oMRSAuditLogMapResponse0.auditLogs(hashMap0);
      assertSame(oMRSAuditLogMapResponse0, oMRSAuditLogMapResponse1);
  }
}
