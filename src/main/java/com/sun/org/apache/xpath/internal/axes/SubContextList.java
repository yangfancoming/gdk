
/*
 * $Id: SubContextList.java,v 1.1.2.1 2005/08/01 01:30:28 jeffsuttor Exp $
 */
package com.sun.org.apache.xpath.internal.axes;

import com.sun.org.apache.xpath.internal.XPathContext;

/**
 * A class that implements this interface is a sub context node list, meaning it
 * is a node list for a location path step for a predicate.
 * @xsl.usage advanced
 */
public interface SubContextList
{

  /**
   * Get the number of nodes in the node list, which, in the XSLT 1 based
   * counting system, is the last index position.
   *
   *
   * @param xctxt The XPath runtime context.
   *
   * @return the number of nodes in the node list.
   */
  public int getLastPos(XPathContext xctxt);

  /**
   * Get the current sub-context position.
   *
   * @param xctxt The XPath runtime context.
   *
   * @return The position of the current node in the list.
   */
  public int getProximityPosition(XPathContext xctxt);
}
