private int getNumTuples() {
    System.out.println("log");
    return ((int) (java.lang.Math.floor(((simpledb.BufferPool.getPageSize()) * 8)))) / (((td.getSize()) * 8) + 1);
}
