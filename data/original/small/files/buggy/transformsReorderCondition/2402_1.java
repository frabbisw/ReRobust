com.z299studio.pb.Application.FileHeader getAppHeaderData() {
    if (null == (mBuffer)) {
        getData();
    }
    if ((mBuffer) != null) {
        mFileHeader = com.z299studio.pb.Application.FileHeader.parse(mBuffer);
        mLocalVersion = mFileHeader.revision;
    }
    return mFileHeader;
}
