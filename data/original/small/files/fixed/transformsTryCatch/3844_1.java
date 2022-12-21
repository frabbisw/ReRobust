@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    try {
        authLatch.countDown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
