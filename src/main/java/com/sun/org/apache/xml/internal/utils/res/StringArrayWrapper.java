
/*
 * $Id: StringArrayWrapper.java,v 1.1.4.1 2005/09/08 11:39:33 suresh_emailid Exp $
 */
package com.sun.org.apache.xml.internal.utils.res;

/**
 *
 * It is a mutable object to wrap the String[] used in
 * the contents of the XResourceBundle class
 */
public class StringArrayWrapper {
    private String[] m_string;

    public StringArrayWrapper(String[] arg){
        m_string = arg;
    }

    public String getString(int index){
        return m_string[index];
    }

    public int getLength(){
        return m_string.length;
    }
}
