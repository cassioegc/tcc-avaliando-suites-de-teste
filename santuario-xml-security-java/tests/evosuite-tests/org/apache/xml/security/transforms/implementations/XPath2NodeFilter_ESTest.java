/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 16:49:49 GMT 2021
 */

package org.apache.xml.security.transforms.implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.xml.security.transforms.implementations.XPath2NodeFilter;
import org.apache.xml.security.utils.HelperNodeList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XPath2NodeFilter_ESTest extends XPath2NodeFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      LinkedList<NodeList> linkedList1 = new LinkedList<NodeList>();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      NodeList nodeList0 = iIOMetadataNode0.getElementsByTagName("");
      linkedList1.add(nodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList1);
      int int0 = xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, (short)1);
      assertEquals(1, int0);
      
      int int1 = xPath2NodeFilter0.isNodeIncludeDO((Node) null, 0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      LinkedList<NodeList> linkedList1 = new LinkedList<NodeList>();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      NodeList nodeList0 = iIOMetadataNode0.getElementsByTagName("");
      linkedList1.add(nodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList1);
      int int0 = xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, (-3469));
      assertEquals(1, int0);
      
      int int1 = xPath2NodeFilter0.isNodeIncludeDO((Node) null, (short)1);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      HelperNodeList helperNodeList0 = new HelperNodeList(true);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      helperNodeList0.appendChild((Node) null);
      linkedList0.offerLast(helperNodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      int int0 = xPath2NodeFilter0.isNodeIncludeDO((Node) null, 1907);
      assertEquals(1, int0);
      
      int int1 = xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, 1109);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      HelperNodeList helperNodeList0 = new HelperNodeList(true);
      helperNodeList0.appendChild((Node) null);
      linkedList0.offerLast(helperNodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      xPath2NodeFilter0.isNodeIncludeDO((Node) null, (-1551));
      int int0 = xPath2NodeFilter0.isNodeIncludeDO((Node) null, 1907);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      LinkedHashSet<Node> linkedHashSet0 = new LinkedHashSet<Node>();
      boolean boolean0 = XPath2NodeFilter.rooted(iIOMetadataNode0, linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      LinkedList<NodeList> linkedList1 = new LinkedList<NodeList>();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      NodeList nodeList0 = iIOMetadataNode0.getElementsByTagName("");
      linkedList1.add(nodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList1, linkedList0);
      int int0 = xPath2NodeFilter0.isNodeInclude(iIOMetadataNode0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<Node> linkedHashSet0 = new LinkedHashSet<Node>();
      linkedHashSet0.add((Node) null);
      boolean boolean0 = XPath2NodeFilter.inList((Node) null, linkedHashSet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<Node> linkedHashSet0 = new LinkedHashSet<Node>();
      boolean boolean0 = XPath2NodeFilter.inList((Node) null, linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      LinkedHashSet<Node> linkedHashSet0 = new LinkedHashSet<Node>();
      iIOMetadataNode0.insertBefore(iIOMetadataNode0, iIOMetadataNode1);
      linkedHashSet0.add(iIOMetadataNode1);
      // Undeclared exception!
      XPath2NodeFilter.rooted(iIOMetadataNode0, linkedHashSet0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        XPath2NodeFilter.rooted((Node) null, (Set<Node>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      // Undeclared exception!
      try { 
        XPath2NodeFilter.inList(iIOMetadataNode0, (Set<Node>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      XPath2NodeFilter xPath2NodeFilter0 = null;
      try {
        xPath2NodeFilter0 = new XPath2NodeFilter((List<NodeList>) null, linkedList0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      LinkedHashSet<Node> linkedHashSet0 = new LinkedHashSet<Node>();
      iIOMetadataNode1.appendChild(iIOMetadataNode0);
      linkedHashSet0.add(iIOMetadataNode1);
      boolean boolean0 = XPath2NodeFilter.rooted(iIOMetadataNode0, linkedHashSet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      HelperNodeList helperNodeList0 = new HelperNodeList();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      helperNodeList0.appendChild(iIOMetadataNode1);
      linkedList0.offerLast(helperNodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      int int0 = xPath2NodeFilter0.isNodeInclude(iIOMetadataNode0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      LinkedList<NodeList> linkedList1 = new LinkedList<NodeList>();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      NodeList nodeList0 = iIOMetadataNode0.getElementsByTagName("");
      linkedList1.add(nodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList1);
      int int0 = xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, 0);
      assertEquals(1, int0);
      
      int int1 = xPath2NodeFilter0.isNodeIncludeDO((Node) null, 0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      HelperNodeList helperNodeList0 = new HelperNodeList();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      helperNodeList0.appendChild(iIOMetadataNode0);
      linkedList0.offerLast(helperNodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, 1);
      int int0 = xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, 2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      HelperNodeList helperNodeList0 = new HelperNodeList();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      helperNodeList0.appendChild(iIOMetadataNode0);
      linkedList0.offerLast(helperNodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      Integer integer0 = new Integer(0);
      xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, 0);
      int int0 = xPath2NodeFilter0.isNodeIncludeDO(iIOMetadataNode0, (int) integer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      int int0 = xPath2NodeFilter0.isNodeIncludeDO((Node) null, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      LinkedList<NodeList> linkedList1 = new LinkedList<NodeList>();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      NodeList nodeList0 = iIOMetadataNode0.getElementsByTagName("");
      linkedList1.add(nodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList1);
      int int0 = xPath2NodeFilter0.isNodeInclude(iIOMetadataNode0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      HelperNodeList helperNodeList0 = new HelperNodeList();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      helperNodeList0.appendChild(iIOMetadataNode0);
      linkedList0.offerLast(helperNodeList0);
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      int int0 = xPath2NodeFilter0.isNodeInclude(iIOMetadataNode0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<NodeList> linkedList0 = new LinkedList<NodeList>();
      XPath2NodeFilter xPath2NodeFilter0 = new XPath2NodeFilter(linkedList0, linkedList0, linkedList0);
      int int0 = xPath2NodeFilter0.isNodeInclude((Node) null);
      assertEquals(1, int0);
  }
}
