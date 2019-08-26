

package com.sun.org.apache.regexp.internal;

/**
 * Encapsulates different types of character sources - String, InputStream, ...
 * Defines a set of common methods
 *
 * @author <a href="mailto:ales.novak@netbeans.com">Ales Novak</a>
 */
public interface CharacterIterator
{
    /** @return a substring */
    String substring(int beginIndex, int endIndex);

    /** @return a substring */
    String substring(int beginIndex);

    /** @return a character at the specified position. */
    char charAt(int pos);

    /** @return <tt>true</tt> iff if the specified index is after the end of the character stream */
    boolean isEnd(int pos);
}
