
/*
 * $Id: XResourceBundleBase.java,v 1.2.4.1 2005/09/15 08:16:05 suresh_emailid Exp $
 */
package com.sun.org.apache.xml.internal.utils.res;

import java.util.ListResourceBundle;

/**
 * This is an interface for error messages.  This class is misnamed,
 * and should be called XalanResourceBundle, or some such.
 * @xsl.usage internal
 */
abstract public class XResourceBundleBase extends ListResourceBundle
{

  /**
   * Get the error string associated with the error code
   *
   * @param errorCode Error code
   *
   * @return error string associated with the given error code
   */
  abstract public String getMessageKey(int errorCode);

  /**
   * Get the warning string associated with the error code
   *
   * @param errorCode Error code
   *
   * @return warning string associated with the given error code
   */
  abstract public String getWarningKey(int errorCode);
}
