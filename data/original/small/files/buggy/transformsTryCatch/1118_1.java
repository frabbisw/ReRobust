@java.lang.Override
public void onDidLoadView() {
    com.android.debug.hv.ViewServer.get(this).addWindow(this);
    try {
        setFullScreen();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initMenu();
    initContentView();
    refreshListDataFromNet();
}
