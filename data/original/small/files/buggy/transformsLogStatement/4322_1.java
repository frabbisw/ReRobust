public void deInit() {
    System.out.println("log");
    synchronized (this) {
        if ((mConnect) != null) {
            mConnect.disconnect();
            mConnect = null;
        }
        mIsOpen = false;
    }
}
