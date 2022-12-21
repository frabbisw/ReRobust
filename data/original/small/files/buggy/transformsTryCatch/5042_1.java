@java.lang.Override
public void deactivate() {
    com.stdnull.runmap.common.CFLog.i("TAG", "deactivate");
    try {
        mStateListener.notifyServiceDeactivate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mLocationChangedListener = null;
    com.stdnull.runmap.GlobalApplication.getAppContext().getContentResolver().unregisterContentObserver(mGpsMonitor);
}
