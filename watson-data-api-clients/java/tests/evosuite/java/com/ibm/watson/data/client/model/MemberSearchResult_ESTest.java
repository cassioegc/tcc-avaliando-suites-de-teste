/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 21:03:29 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.Member;
import com.ibm.watson.data.client.model.MemberSearchResult;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MemberSearchResult_ESTest extends MemberSearchResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Long long0 = new Long(0L);
      MemberSearchResult memberSearchResult1 = memberSearchResult0.totalResults(long0);
      Long long1 = memberSearchResult1.getTotalResults();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Long long0 = new Long((-181L));
      memberSearchResult0.totalResults(long0);
      Long long1 = memberSearchResult0.getTotalResults();
      assertEquals((-181L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Long long0 = new Long(2275L);
      memberSearchResult0.totalResults(long0);
      Long long1 = memberSearchResult0.getTotalResults();
      assertEquals(2275L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      memberSearchResult0.nextBookmark("!JF~m]?0");
      String string0 = memberSearchResult0.getNextBookmark();
      assertEquals("!JF~m]?0", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      MemberSearchResult memberSearchResult1 = memberSearchResult0.nextBookmark("");
      String string0 = memberSearchResult1.getNextBookmark();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      memberSearchResult0.members((List<Member>) null);
      List<Member> list0 = memberSearchResult0.getMembers();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Member member0 = new Member();
      memberSearchResult0.addMembersItem(member0);
      List<Member> list0 = memberSearchResult0.getMembers();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      MemberSearchResult memberSearchResult1 = memberSearchResult0.members((List<Member>) null);
      Member member0 = new Member();
      // Undeclared exception!
      try { 
        memberSearchResult1.addMembersItem(member0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.watson.data.client.model.MemberSearchResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Long long0 = new Long(1164L);
      MemberSearchResult memberSearchResult1 = memberSearchResult0.totalResults(long0);
      MemberSearchResult memberSearchResult2 = new MemberSearchResult();
      boolean boolean0 = memberSearchResult1.equals(memberSearchResult2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      MemberSearchResult memberSearchResult1 = new MemberSearchResult();
      boolean boolean0 = memberSearchResult1.equals(memberSearchResult0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      boolean boolean0 = memberSearchResult0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      boolean boolean0 = memberSearchResult0.equals(memberSearchResult0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      boolean boolean0 = memberSearchResult0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      String string0 = memberSearchResult0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      MemberSearchResult memberSearchResult1 = memberSearchResult0.nextBookmark("");
      MemberSearchResult memberSearchResult2 = new MemberSearchResult();
      boolean boolean0 = memberSearchResult2.equals(memberSearchResult1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      String string0 = memberSearchResult0.getNextBookmark();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      memberSearchResult0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Member member0 = new Member();
      MemberSearchResult memberSearchResult1 = memberSearchResult0.addMembersItem(member0);
      MemberSearchResult memberSearchResult2 = new MemberSearchResult();
      boolean boolean0 = memberSearchResult2.equals(memberSearchResult1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      memberSearchResult0.setNextBookmark("|*Tbe|6>#O|>");
      assertEquals("|*Tbe|6>#O|>", memberSearchResult0.getNextBookmark());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Long long0 = new Long(87L);
      memberSearchResult0.setTotalResults(long0);
      assertEquals(87L, (long)memberSearchResult0.getTotalResults());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      List<Member> list0 = memberSearchResult0.getMembers();
      memberSearchResult0.setMembers(list0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MemberSearchResult memberSearchResult0 = new MemberSearchResult();
      Long long0 = memberSearchResult0.getTotalResults();
      assertNull(long0);
  }
}
