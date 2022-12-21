@java.lang.Override
public void run() {
    try {
        if (mService == null)
            com.abs104a.mperwithsideproject.viewctl.MainViewCtl.createAndShowMainView(com.abs104a.mperwithsideproject.MainService.getService());
        else
            mService.stopSelf();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
