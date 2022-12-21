public void onResume() {
    getView().showLoading();
    getView().showServerName(mRemoteFileListInteracor.getServerName());
    try {
        mRemoteFileListInteracor.getRemoteFileList();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mRemoteFileListInteracor.registerCallback(mFtpUploadCallback);
}
