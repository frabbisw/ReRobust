@java.lang.Override
protected void onStart() {
    super.onStart();
    try {
        loader3.start(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
