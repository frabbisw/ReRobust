@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    System.out.println("log");
    com.chriscartland.octaviastreethilton.auth.AuthManager.getInstance(this).onActivityResult(requestCode, resultCode, data);
}
