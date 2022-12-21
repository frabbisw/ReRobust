public final int addOverlayPath(java.lang.String idmapPath) {
    try {
        synchronized (this) {
            int res = addOverlayPathNative(idmapPath);
            if ((mStringBlocks) != null) {
                makeStringBlocks(mStringBlocks);
            }
            return res;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
