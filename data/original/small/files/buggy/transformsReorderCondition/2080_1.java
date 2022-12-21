public static long checkFileIdCompatibility(long fileId, int storageId) {
    if (0 == (com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.extractStorageId(fileId))) {
        return com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.composeFileId(((int) (fileId)), storageId);
    }
    return fileId;
}
