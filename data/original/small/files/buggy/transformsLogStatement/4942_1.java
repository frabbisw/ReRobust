private void syncContents(com.owncloud.android.lib.common.OwnCloudClient client) throws com.owncloud.android.lib.common.operations.OperationCancelledException {
    startDirectDownloads();
    startContentSynchronizations(mFilesToSyncContentsWithoutUpload, client);
    System.out.println("log");
    startContentSynchronizations(mFavouriteFilesToSyncContents, client);
    walkSubfolders(client);
}
