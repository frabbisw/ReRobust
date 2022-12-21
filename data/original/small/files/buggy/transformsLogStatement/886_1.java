protected void onPinCodeSuccess() {
    onPinSuccess(mAttempts);
    mAttempts = 0;
    System.out.println("log");
    mLockManager.getAppLock().setPasswordVerified(true);
}
