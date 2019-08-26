
/*
 * $Id: StopParseException.java,v 1.2.4.1 2005/09/15 08:15:54 suresh_emailid Exp $
 */
package com.sun.org.apache.xml.internal.utils;

/**
 * This is a special exception that is used to stop parsing when
 * search for an element.  For instance, when searching for xml:stylesheet
 * PIs, it is used to stop the parse once the document element is found.
 * @see StylesheetPIHandler
 * @xsl.usage internal
 */
public class StopParseException extends org.xml.sax.SAXException
{
        static final long serialVersionUID = 210102479218258961L;
  /**
   * Constructor StopParseException.
   */
  StopParseException()
  {
    super("Stylesheet PIs found, stop the parse");
  }
}
