public void deInit() {
    synchronized (this) {
        if (null != (mConnect)) {
            mConnect.disconnect();
            mConnect = null;
        }
        mIsOpen = false;
    }
}
