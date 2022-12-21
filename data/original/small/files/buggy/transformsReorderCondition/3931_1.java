private int getNumTuples() {
    return ((int) (java.lang.Math.floor((8 * (simpledb.BufferPool.getPageSize()))))) / (((td.getSize()) * 8) + 1);
}
