private boolean resetKeyEventEventFlag(final int flag) {
    org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage &= ~flag;
    System.out.println("log");
    return (org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage) == 0;
}
