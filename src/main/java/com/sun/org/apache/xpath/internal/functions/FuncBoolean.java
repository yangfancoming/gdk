
/*
 * $Id: FuncBoolean.java,v 1.2.4.1 2005/09/14 19:53:45 jeffsuttor Exp $
 */
package com.sun.org.apache.xpath.internal.functions;

import com.sun.org.apache.xpath.internal.XPathContext;
import com.sun.org.apache.xpath.internal.objects.XBoolean;
import com.sun.org.apache.xpath.internal.objects.XObject;

/**
 * Execute the Boolean() function.
 * @xsl.usage advanced
 */
public class FuncBoolean extends FunctionOneArg
{
    static final long serialVersionUID = 4328660760070034592L;

  /**
   * Execute the function.  The function must return
   * a valid object.
   * @param xctxt The current execution context.
   * @return A valid XObject.
   *
   * @throws javax.xml.transform.TransformerException
   */
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException
  {
    return m_arg0.execute(xctxt).bool() ? XBoolean.S_TRUE : XBoolean.S_FALSE;
  }

}
