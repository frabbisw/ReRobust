public final int getMinimumSize(boolean lossless) {
    try {
        getMinimumTotalSize(getMinimumValueSize(lossless));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
