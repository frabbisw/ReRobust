public void close(android.view.View view) {
    try {
        mListener.closeThis(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
