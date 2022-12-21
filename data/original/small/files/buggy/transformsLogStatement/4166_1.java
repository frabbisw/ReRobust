public boolean keyMayExist(final org.rocksdb.ReadOptions readOptions, final org.rocksdb.ColumnFamilyHandle columnFamilyHandle, final byte[] key, final java.lang.StringBuffer value) {
    System.out.println("log");
    return keyMayExist(nativeHandle_, readOptions.nativeHandle_, key, 0, key.length, columnFamilyHandle.nativeHandle_, value);
}
