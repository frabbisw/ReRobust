private void register() {
    try {
        com.mingle.utils.BusProvider.getInstance().register(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
