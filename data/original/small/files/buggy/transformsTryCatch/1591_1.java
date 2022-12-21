private void register() {
    try {
        android.util.Log.e(com.mingle.autolist.AutoList.Tag, "register  Bus");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.mingle.utils.BusProvider.getInstance().register(this);
}
