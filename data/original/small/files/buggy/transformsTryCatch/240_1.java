public static void setConnect(boolean selected) {
    fr.xtof54.jsgo.WSclient.doConnect = selected;
    try {
        fr.xtof54.jsgo.WSclient.checkDoConnect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
