@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    if ((mStatus) == (STATUS_READY)) {
        mStatus = STATUS_RECOGNIZING;
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
        updateStatus();
        return;
    }
}
