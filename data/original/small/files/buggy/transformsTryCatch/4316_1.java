@java.lang.Override
public void onDisabled(com.iazasoft.footguy.Context context) {
    try {
        super.onDisabled(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sleep();
    com.iazasoft.footguy.Intent i0 = new com.iazasoft.footguy.Intent(context, com.iazasoft.footguy.ScreenListenerService.class);
    com.iazasoft.footguy.Footguy.mContext.stopService(i0);
}
