@java.lang.Override
public void onClick(android.view.View v) {
    try {
        validateCredentials(username, password);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
