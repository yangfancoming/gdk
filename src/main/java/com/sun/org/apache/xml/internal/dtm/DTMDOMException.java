
/*
 * $Id: DTMDOMException.java,v 1.2.4.1 2005/09/15 08:14:52 suresh_emailid Exp $
 */
package com.sun.org.apache.xml.internal.dtm;

/**
 * Simple implementation of DOMException.
 *
 * %REVIEW% Several classes were implementing this internally;
 * it makes more sense to have one shared version.
 * @xsl.usage internal
 */
public class DTMDOMException extends org.w3c.dom.DOMException
{
    static final long serialVersionUID = 1895654266613192414L;
  /**
   * Constructs a DOM/DTM exception.
   *
   * @param code
   * @param message
   */
  public DTMDOMException(short code, String message)
  {
    super(code, message);
  }

  /**
   * Constructor DTMDOMException
   *
   *
   * @param code
   */
  public DTMDOMException(short code)
  {
    super(code, "");
  }
}
