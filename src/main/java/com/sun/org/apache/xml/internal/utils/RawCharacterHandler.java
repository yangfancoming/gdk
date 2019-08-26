
/*
 * $Id: RawCharacterHandler.java,v 1.2.4.1 2005/09/15 08:15:52 suresh_emailid Exp $
 */
package com.sun.org.apache.xml.internal.utils;

/**
 * An interface that a Serializer/ContentHandler/ContentHandler must
 * implement in order for disable-output-escaping to work.
 * @xsl.usage advanced
 */
public interface RawCharacterHandler
{

  /**
   * Serialize the characters without escaping.
   *
   * @param ch Array of characters
   * @param start Start index of characters in the array
   * @param length Number of characters in the array
   *
   * @throws javax.xml.transform.TransformerException
   */
  public void charactersRaw(char ch[], int start, int length)
    throws javax.xml.transform.TransformerException;
}
