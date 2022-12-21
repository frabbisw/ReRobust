@java.lang.Override
public void run() {
    if (null == mService)
        com.abs104a.mperwithsideproject.viewctl.MainViewCtl.createAndShowMainView(com.abs104a.mperwithsideproject.MainService.getService());
    else
        mService.stopSelf();
}
