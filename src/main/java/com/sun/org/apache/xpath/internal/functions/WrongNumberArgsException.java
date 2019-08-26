
/*
 * $Id: WrongNumberArgsException.java,v 1.2.4.1 2005/09/14 20:27:04 jeffsuttor Exp $
 */
package com.sun.org.apache.xpath.internal.functions;

/**
 * An exception that is thrown if the wrong number of arguments to an exception
 * are specified by the stylesheet.
 * @xsl.usage advanced
 */
public class WrongNumberArgsException extends Exception
{
    static final long serialVersionUID = -4551577097576242432L;

  /**
   * Constructor WrongNumberArgsException
   *
   * @param argsExpected Error message that tells the number of arguments that
   * were expected.
   */
  public WrongNumberArgsException(String argsExpected)
  {

    super(argsExpected);
  }
}
