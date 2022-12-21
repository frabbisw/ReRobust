@org.junit.Test
public void testGetCollector() {
    com.youama.nexus.parser.collector.ICollector linkCollector = com.youama.nexus.parser.collector.FactoryCollector.getCollector(FactoryCollector.TYPE_LINK);
    assertTrue((linkCollector instanceof com.youama.nexus.parser.collector.LinkCollector));
    try {
        linkCollector.setSource("a");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals("a", linkCollector.getSource());
    linkCollector.getSource();
}
