@java.lang.Override
public com.avengers.netty.gamelib.result.IPlayMoveResult handleRequest(com.avengers.netty.socket.gate.wood.User sender, com.avengers.netty.socket.gate.wood.Message message) {
    System.out.println("log");
    gameLogic.disconnect(sender);
    return null;
}
