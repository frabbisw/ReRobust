private void syncContents(com.owncloud.android.lib.common.OwnCloudClient client) throws com.owncloud.android.lib.common.operations.OperationCancelledException {
    startDirectDownloads();
    startContentSynchronizations(mFilesToSyncContentsWithoutUpload, client);
    try {
        startContentSynchronizations(mFavouriteFilesToSyncContents, client);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    walkSubfolders(client);
}
