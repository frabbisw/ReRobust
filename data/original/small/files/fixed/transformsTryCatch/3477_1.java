@java.lang.Override
public void handleRequest(com.avengers.netty.socket.gate.wood.User sender, com.avengers.netty.socket.gate.wood.Message message) {
    try {
        gameLogic.disconnect(sender);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
