@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    BoxAuthentication.BoxAuthenticationInfo.cloneInfo(mSession.mAuthInfo, info);
    System.out.println("log");
    mSession.setUserId(info.getUser().getId());
    mSession.onAuthCreated(info);
    authLatch.countDown();
}
