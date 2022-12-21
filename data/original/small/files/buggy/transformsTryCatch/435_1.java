private void dropCurrentConnection() {
    try {
        if ((mCurrentConnectionRef) != null) {
            mCurrentConnectionRef.removeValue();
            mCurrentLastOnlineRef.setValue(ServerValue.TIMESTAMP);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
