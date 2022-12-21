@java.lang.Override
protected void onDestroy() {
    storeIP();
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
