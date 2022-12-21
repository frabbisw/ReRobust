@org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect
public void onConnect(org.eclipse.jetty.websocket.api.Session session) {
    try {
        clientID = com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.addSessionToGroup("unsorted", session);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(((("Connect: " + (session.getRemoteAddress().getAddress())) + " ID: ") + (clientID)));
}
