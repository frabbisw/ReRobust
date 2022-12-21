public void close() {
    try {
        mListener.closeThis(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
