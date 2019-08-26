
/*
 * $Id: UnionPattern.java,v 1.2.4.1 2005/09/15 00:21:15 jeffsuttor Exp $
 */
package com.sun.org.apache.xpath.internal.patterns;

import com.sun.org.apache.xpath.internal.Expression;
import com.sun.org.apache.xpath.internal.ExpressionOwner;
import com.sun.org.apache.xpath.internal.XPathContext;
import com.sun.org.apache.xpath.internal.XPathVisitor;
import com.sun.org.apache.xpath.internal.objects.XObject;

/**
 * This class represents a union pattern, which can have multiple individual
 * StepPattern patterns.
 * @xsl.usage advanced
 */
public class UnionPattern extends Expression
{
    static final long serialVersionUID = -6670449967116905820L;

  /** Array of the contained step patterns to be tested.
   *  @serial  */
  private StepPattern[] m_patterns;

  /**
   * No arguments to process, so this does nothing.
   */
  public void fixupVariables(java.util.Vector vars, int globalsSize)
  {
    for (int i = 0; i < m_patterns.length; i++)
    {
      m_patterns[i].fixupVariables(vars, globalsSize);
    }
  }


  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
   public boolean canTraverseOutsideSubtree()
   {
     if(null != m_patterns)
     {
      int n = m_patterns.length;
      for (int i = 0; i < n; i++)
      {
        if(m_patterns[i].canTraverseOutsideSubtree())
          return true;
      }
     }
     return false;
   }

  /**
   * Set the contained step patterns to be tested.
   *
   *
   * @param patterns the contained step patterns to be tested.
   */
  public void setPatterns(StepPattern[] patterns)
  {
    m_patterns = patterns;
    if(null != patterns)
    {
        for(int i = 0; i < patterns.length; i++)
        {
                patterns[i].exprSetParent(this);
        }
    }

  }

  /**
   * Get the contained step patterns to be tested.
   *
   *
   * @return an array of the contained step patterns to be tested.
   */
  public StepPattern[] getPatterns()
  {
    return m_patterns;
  }

  /**
   * Test a node to see if it matches any of the patterns in the union.
   *
   * @param xctxt XPath runtime context.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException
  {

    XObject bestScore = null;
    int n = m_patterns.length;

    for (int i = 0; i < n; i++)
    {
      XObject score = m_patterns[i].execute(xctxt);

      if (score != NodeTest.SCORE_NONE)
      {
        if (null == bestScore)
          bestScore = score;
        else if (score.num() > bestScore.num())
          bestScore = score;
      }
    }

    if (null == bestScore)
    {
      bestScore = NodeTest.SCORE_NONE;
    }

    return bestScore;
  }

  class UnionPathPartOwner implements ExpressionOwner
  {
        int m_index;

        UnionPathPartOwner(int index)
        {
                m_index = index;
        }

    /**
     * @see ExpressionOwner#getExpression()
     */
    public Expression getExpression()
    {
      return m_patterns[m_index];
    }


    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
    public void setExpression(Expression exp)
    {
        exp.exprSetParent(UnionPattern.this);
        m_patterns[m_index] = (StepPattern)exp;
    }
  }

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)
  {
        visitor.visitUnionPattern(owner, this);
        if(null != m_patterns)
        {
                int n = m_patterns.length;
                for(int i = 0; i < n; i++)
                {
                        m_patterns[i].callVisitors(new UnionPathPartOwner(i), visitor);
                }
        }
  }

  /**
   * @see Expression#deepEquals(Expression)
   */
  public boolean deepEquals(Expression expr)
  {
        if(!isSameClass(expr))
                return false;

        UnionPattern up = (UnionPattern)expr;

        if(null != m_patterns)
        {
                int n = m_patterns.length;
                if((null == up.m_patterns) || (up.m_patterns.length != n))
                        return false;

                for(int i = 0; i < n; i++)
                {
                        if(!m_patterns[i].deepEquals(up.m_patterns[i]))
                                return false;
                }
        }
        else if(up.m_patterns != null)
                return false;

        return true;

  }


}
