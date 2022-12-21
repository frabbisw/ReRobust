private void close0() {
    System.out.println("log");
    closeColumns();
    com.questdb.cairo.Misc.free(txMem);
    com.questdb.cairo.Misc.free(metaMem);
    com.questdb.cairo.Misc.free(columnSizeMem);
    com.questdb.cairo.Misc.free(path);
}
