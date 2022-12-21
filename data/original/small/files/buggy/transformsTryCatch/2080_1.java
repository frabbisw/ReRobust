public static long checkFileIdCompatibility(long fileId, int storageId) {
    try {
        if ((com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.extractStorageId(fileId)) == 0) {
            return com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.composeFileId(((int) (fileId)), storageId);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return fileId;
}
