
/*
 * $Id: Lte.java,v 1.2.4.1 2005/09/14 21:31:45 jeffsuttor Exp $
 */
package com.sun.org.apache.xpath.internal.operations;

import com.sun.org.apache.xpath.internal.objects.XBoolean;
import com.sun.org.apache.xpath.internal.objects.XObject;

/**
 * The '<=' operation expression executer.
 */
public class Lte extends Operation
{
    static final long serialVersionUID = 6945650810527140228L;

  /**
   * Apply the operation to two operands, and return the result.
   *
   *
   * @param left non-null reference to the evaluated left operand.
   * @param right non-null reference to the evaluated right operand.
   *
   * @return non-null reference to the XObject that represents the result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
  public XObject operate(XObject left, XObject right)
          throws javax.xml.transform.TransformerException
  {
    return left.lessThanOrEqual(right) ? XBoolean.S_TRUE : XBoolean.S_FALSE;
  }
}
