@java.lang.Override
public void onDidLoadView() {
    com.android.debug.hv.ViewServer.get(this).addWindow(this);
    setFullScreen();
    initMenu();
    System.out.println("log");
    initContentView();
    refreshListDataFromNet();
}
