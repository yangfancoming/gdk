

package com.sun.org.apache.regexp.internal;

/**
 * Exception thrown to indicate a syntax error in a regular expression.
 * This is a non-checked exception because you should only have problems compiling
 * a regular expression during development.
 * If you are making regular expresion programs dynamically then you can catch it
 * if you wish. But should not be forced to.
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 * @author <a href="mailto:gholam@xtra.co.nz>Michael McCallum</a>
 */
public class RESyntaxException extends RuntimeException
{
    /**
     * Constructor.
     * @param s Further description of the syntax error
     */
    public RESyntaxException(String s)
    {
        super("Syntax error: " + s);
    }
}
