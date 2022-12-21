public void deInit() {
    try {
        synchronized (this) {
            if ((mConnect) != null) {
                mConnect.disconnect();
                mConnect = null;
            }
            mIsOpen = false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
