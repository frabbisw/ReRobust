public final int addOverlayPath(java.lang.String idmapPath) {
    System.out.println("log");
    synchronized (this) {
        int res = addOverlayPathNative(idmapPath);
        if ((mStringBlocks) != null) {
            makeStringBlocks(mStringBlocks);
        }
        return res;
    }
}
