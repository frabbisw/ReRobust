com.z299studio.pb.Application.FileHeader getAppHeaderData(android.content.Context context) {
    if ((mBuffer) == null) {
        getData(context);
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
