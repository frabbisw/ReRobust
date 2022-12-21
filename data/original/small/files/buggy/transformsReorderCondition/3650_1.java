private boolean resetKeyEventEventFlag(final int flag) {
    org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage &= ~flag;
    return 0 == (org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage);
}
