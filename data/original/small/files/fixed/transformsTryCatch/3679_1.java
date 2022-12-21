public void run() {
    try {
        context.getInChannel().setAttachment(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cgl.iotcloud.streaming.http.server.HttpClientEndpoint endpoint = context.getRule().getEndpoint();
}
