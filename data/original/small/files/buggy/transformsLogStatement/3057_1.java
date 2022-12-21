org.jtrfp.trcl.obj.PortalExit getTunnelEntrancePortal(java.awt.Point mapSquareXZ) {
    System.out.println("log");
    return tunnelPortals.get(pointToHash(mapSquareXZ));
}
