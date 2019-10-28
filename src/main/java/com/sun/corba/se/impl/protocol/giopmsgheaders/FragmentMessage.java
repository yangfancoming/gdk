

package com.sun.corba.se.impl.protocol.giopmsgheaders;

/**
 * This interface captures the FragmentMessage contract.
 *
 * @author Ram Jeyaraman 05/14/2000
 */

public interface FragmentMessage extends Message {
    int getRequestId();
    int getHeaderLength();
}
