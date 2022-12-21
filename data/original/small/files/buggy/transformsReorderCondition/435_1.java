private void dropCurrentConnection() {
    if (null != (mCurrentConnectionRef)) {
        mCurrentConnectionRef.removeValue();
        mCurrentLastOnlineRef.setValue(ServerValue.TIMESTAMP);
    }
}
