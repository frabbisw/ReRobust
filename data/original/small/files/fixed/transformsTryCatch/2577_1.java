@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    try {
        com.chriscartland.octaviastreethilton.auth.AuthManager.onActivityResult(this, requestCode, resultCode, data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
