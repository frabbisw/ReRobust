@java.lang.Override
public void error(@android.support.annotation.NonNull java.lang.Throwable caught) {
    try {
        editFailed(caught);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
