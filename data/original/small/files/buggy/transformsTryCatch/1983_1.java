@java.lang.Override
public void onClick(android.view.View v) {
    mShareNotSave = true;
    try {
        startBackup();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
