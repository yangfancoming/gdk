
/*
 * $Id: WrongParserException.java,v 1.2.4.1 2005/09/15 08:16:00 suresh_emailid Exp $
 */
package com.sun.org.apache.xml.internal.utils;

/**
 * Certain functions may throw this error if they are paired with
 * the incorrect parser.
 * @xsl.usage general
 */
public class WrongParserException extends RuntimeException
{
    static final long serialVersionUID = 6481643018533043846L;

  /**
   * Create a WrongParserException object.
   * @param message The error message that should be reported to the user.
   */
  public WrongParserException(String message)
  {
    super(message);
  }
}
