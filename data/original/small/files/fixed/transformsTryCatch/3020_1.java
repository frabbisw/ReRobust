@javax.websocket.OnError
public void onErrorReceived(java.lang.Throwable t) {
    try {
        java.lang.System.out.println("onErrorReceived Called. Halting all motion. ");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    halt(null);
}
