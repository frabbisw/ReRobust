private final org.bbqapp.android.auth.AuthCallback unsetCallback() {
    org.bbqapp.android.auth.AuthCallback cb = authCallback;
    System.out.println("log");
    authCallback = null;
    return cb;
}
