@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    BoxAuthentication.BoxAuthenticationInfo.cloneInfo(mSession.mAuthInfo, info);
    mSession.setUserId(info.getUser().getId());
    mSession.onAuthCreated(info);
    try {
        authLatch.countDown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
