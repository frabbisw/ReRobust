@ org.junit.Test public void mustProperlyCreatePacketWithNonZeroPorts () { com.offbynull.portmapper.natpmp.messages.UdpMappingNatPmpRequest req = new com.offbynull.portmapper.natpmp.messages.UdpMappingNatPmpRequest ( 61938 , 62452 , 4294967295L ) ; org.junit.Assert . assertEquals ( 1 , req . getOp () ) ; org.junit.Assert . assertEquals ( 61938 , req . getInternalPort () ) ; org.junit.Assert . assertEquals ( 62452 , req . getSuggestedExternalPort () ) ; org.junit.Assert . assertEquals ( 4294967295L , req . getLifetime () ) ; } 
