com.z299studio.pb.Application.FileHeader getAppHeaderData() {
    if ((mBuffer) == null) {
        getData();
    }
    try {
        if ((mBuffer) != null) {
            mFileHeader = com.z299studio.pb.Application.FileHeader.parse(mBuffer);
            mLocalVersion = mFileHeader.revision;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mFileHeader;
}
