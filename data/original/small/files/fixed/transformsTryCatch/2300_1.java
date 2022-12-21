private static void sendHttpResponse(co.paralleluniverse.comsat.webactors.netty.ChannelHandlerContext ctx, co.paralleluniverse.comsat.webactors.netty.FullHttpRequest req, co.paralleluniverse.comsat.webactors.netty.FullHttpResponse res, boolean close) {
    try {
        co.paralleluniverse.comsat.webactors.netty.WebActorHandler.writeHttpResponse(ctx, req, res, close);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
