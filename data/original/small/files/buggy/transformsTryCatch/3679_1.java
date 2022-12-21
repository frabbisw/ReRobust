public void run() {
    context.getInChannel().setAttachment(context);
    cgl.iotcloud.streaming.http.server.HttpClientEndpoint endpoint = context.getRule().getEndpoint();
    try {
        endpoint.connect(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
