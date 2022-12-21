private void dropCurrentConnection() {
    System.out.println("log");
    if ((mCurrentConnectionRef) != null) {
        mCurrentConnectionRef.removeValue();
        mCurrentLastOnlineRef.setValue(ServerValue.TIMESTAMP);
    }
}
