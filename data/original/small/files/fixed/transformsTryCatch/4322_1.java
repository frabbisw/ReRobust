public void deInit() {
    try {
        synchronized (this) {
            if ((mConnect) != null) {
                mConnect.disconnect();
                mConnect = null;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
