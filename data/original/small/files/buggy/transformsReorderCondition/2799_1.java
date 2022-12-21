public final int addOverlayPath(java.lang.String idmapPath) {
    synchronized (this) {
        int res = addOverlayPathNative(idmapPath);
        if (null != (mStringBlocks)) {
            makeStringBlocks(mStringBlocks);
        }
        return res;
    }
}
