@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    mActiveStreamType = -1;
    try {
        mAudioManager.forceVolumeControlStream(mActiveStreamType);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setZenPanelVisible(false);
    mDemoIcon = 0;
    mSecondaryIconTransition.cancel();
}
