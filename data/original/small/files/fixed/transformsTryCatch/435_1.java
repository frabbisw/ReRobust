private void dropCurrentConnection() {
    try {
        if ((mCurrentConnectionRef) != null) {
            mCurrentConnectionRef.removeValue();
            mCurrentConnectionRef = null;
            mCurrentLastOnlineRef.setValue(ServerValue.TIMESTAMP);
            mCurrentLastOnlineRef = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
