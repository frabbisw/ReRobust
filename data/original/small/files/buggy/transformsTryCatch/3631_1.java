@java.lang.Override
protected void onResume() {
    home();
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
