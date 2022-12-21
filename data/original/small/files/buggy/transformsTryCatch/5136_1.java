@java.lang.Override
public void onReceiving() {
    try {
        if (!(hasPermission())) {
            Bar.BarClient.setRunning(false);
            java.lang.System.out.println("A bar client already exists!");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
