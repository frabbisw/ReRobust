private void register() {
    System.out.println("log");
    android.util.Log.e(com.mingle.autolist.AutoList.Tag, "register  Bus");
    com.mingle.utils.BusProvider.getInstance().register(this);
}
