protected void onPinCodeSuccess() {
    try {
        onPinSuccess(mAttempts);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mAttempts = 0;
    mLockManager.getAppLock().setPasswordVerified(true);
}
