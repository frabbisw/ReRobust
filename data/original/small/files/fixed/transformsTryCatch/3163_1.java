@java.lang.Override
public void onClick(android.view.View view) {
    try {
        if ((mStatus) == (STATUS_READY)) {
            mStatus = STATUS_RECOGNIZING;
            mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
            updateStatus();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
