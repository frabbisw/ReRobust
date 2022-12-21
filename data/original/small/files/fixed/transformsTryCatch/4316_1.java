@java.lang.Override
public void onDisabled(com.iazasoft.footguy.Context context) {
    super.onDisabled(context);
    try {
        sleep(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.iazasoft.footguy.Intent i0 = new com.iazasoft.footguy.Intent(context, com.iazasoft.footguy.ScreenListenerService.class);
    com.iazasoft.footguy.Footguy.mContext.stopService(i0);
}
