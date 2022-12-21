@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.app.NotificationManager nManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    me.johannesnz.smsim.Main.sendMessage("DC");
    try {
        nManager.cancel(1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    me.johannesnz.smsim.Main.sender.detachDuplexOutputChannel();
}
