

package com.sun.corba.se.impl.protocol.giopmsgheaders;

import com.sun.corba.se.spi.ior.ObjectKey;

/**
 * This interface captures the LocateRequestMessage contract.
 *
 * @author Ram Jeyaraman 05/14/2000
 */

public interface LocateRequestMessage extends Message {
    int getRequestId();
    ObjectKey getObjectKey();
}
