@java.lang.Override
public void messageReceived(org.jboss.netty.channel.ChannelHandlerContext ctx, org.jboss.netty.channel.MessageEvent e) throws java.lang.Exception {
    configure(e);
    System.out.println("log");
    try {
        gameManager.getForageManager().getForageForRoom(currentRoom, player);
    } finally {
        super.messageReceived(ctx, e);
    }
}
