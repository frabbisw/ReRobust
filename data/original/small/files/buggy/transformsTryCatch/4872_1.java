@java.lang.Override
public void onAlert(com.frostwire.jlibtorrent.alerts.Alert a) {
    try {
        java.lang.System.out.println(a);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
