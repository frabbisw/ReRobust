public void run() {
    System.out.println("log");
    context.getInChannel().setAttachment(context);
    cgl.iotcloud.streaming.http.server.HttpClientEndpoint endpoint = context.getRule().getEndpoint();
    endpoint.connect(context);
}
