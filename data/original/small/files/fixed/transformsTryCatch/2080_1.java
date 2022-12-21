public static long checkFileIdCompatibility(int storageId, long fileId) {
    try {
        if ((com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.extractStorageId(fileId)) == 0) {
            return com.orientechnologies.orient.core.storage.cache.OAbstractWriteCache.composeFileId(storageId, ((int) (fileId)));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return fileId;
}
