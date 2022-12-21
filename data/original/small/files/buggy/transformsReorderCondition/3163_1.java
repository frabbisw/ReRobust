@java.lang.Override
public void onClick(android.view.View view) {
    if ((STATUS_READY) == (mStatus)) {
        mStatus = STATUS_RECOGNIZING;
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
        updateStatus();
        return;
    }
}
