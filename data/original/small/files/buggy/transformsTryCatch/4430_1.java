private void close0() {
    closeColumns();
    com.questdb.cairo.Misc.free(txMem);
    com.questdb.cairo.Misc.free(metaMem);
    com.questdb.cairo.Misc.free(columnSizeMem);
    try {
        com.questdb.cairo.Misc.free(path);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
