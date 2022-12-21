public void stop() {
    try {
        synchronized (this) {
            if ((mDisposable) != null) {
                mDisposable.dispose();
                mDisposable = null;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
