public void onResume() {
    getView().showLoading();
    System.out.println("log");
    getView().showServerName(mRemoteFileListInteracor.getServerName());
    mRemoteFileListInteracor.getRemoteFileList();
    mRemoteFileListInteracor.registerCallback(mFtpUploadCallback);
}
