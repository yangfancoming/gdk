
/*
 * $Id: PathComponent.java,v 1.1.2.1 2005/08/01 01:30:27 jeffsuttor Exp $
 */
package com.sun.org.apache.xpath.internal.axes;

/**
 * Classes who implement this information provide information needed for
 * static analysis of a path component.
 */
public interface PathComponent
{
  /**
   * Get the analysis bits for this path component, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
  public int getAnalysisBits();

}
