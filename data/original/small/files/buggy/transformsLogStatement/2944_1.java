private void initializeJmsSource(java.lang.String destination, int messageReceive, java.lang.String initialContextFactory, java.lang.String providerUrl) {
    System.out.println("log");
    jmsSource = new co.cask.cdap.template.etl.realtime.source.JmsSource(new co.cask.cdap.template.etl.realtime.source.JmsSource.JmsPluginConfig(destination, messageReceive, initialContextFactory, providerUrl, JmsSource.DEFAULT_CONNECTION_FACTORY));
}