@java.lang.Override
public void run() {
    try {
        refreshNewFolder(n.path());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
