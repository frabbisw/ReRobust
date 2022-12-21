@java.lang.Override
protected void onStart() {
    super.onStart();
    try {
        loader3.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
