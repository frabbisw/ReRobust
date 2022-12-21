private void close0() {
    closeColumns(true);
    com.questdb.cairo.Misc.free(txMem);
    com.questdb.cairo.Misc.free(metaMem);
    try {
        com.questdb.cairo.Misc.free(columnSizeMem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.questdb.cairo.Misc.free(path);
}
