@java.lang.Override
public void onClick(android.view.View v) {
    try {
        validateCredentials(username.get(), password.get());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
