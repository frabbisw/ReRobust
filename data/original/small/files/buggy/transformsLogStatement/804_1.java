@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    mActiveStreamType = -1;
    mAudioManager.forceVolumeControlStream(mActiveStreamType);
    System.out.println("log");
    setZenPanelVisible(false);
    mDemoIcon = 0;
    mSecondaryIconTransition.cancel();
}
