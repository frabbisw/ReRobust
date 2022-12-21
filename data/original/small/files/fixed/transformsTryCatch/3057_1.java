org.jtrfp.trcl.obj.PortalExit getTunnelEntrancePortal(java.awt.Point mapSquareXZ) {
    try {
        synchronized (tunnelPortals) {
            return tunnelPortals.get(pointToHash(mapSquareXZ));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
