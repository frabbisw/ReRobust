@java.lang.Override
public void onDidLoadView() {
    try {
        setFullScreen();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initMenu();
    initContentView();
    refreshListDataFromNet();
}
