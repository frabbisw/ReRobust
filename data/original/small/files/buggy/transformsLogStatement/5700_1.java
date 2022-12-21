@java.lang.Override
public void run() {
    System.out.println("log");
    if (mService == null)
        com.abs104a.mperwithsideproject.viewctl.MainViewCtl.createAndShowMainView(com.abs104a.mperwithsideproject.MainService.getService());
    else
        mService.stopSelf();
}
