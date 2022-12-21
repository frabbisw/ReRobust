@org.junit.Test
public void shouldNotSendMetric() throws java.lang.Exception {
    com.codahale.metrics.graphite.GraphiteSender delegate = mock(com.codahale.metrics.graphite.GraphiteSender.class);
    java.lang.String name = "metrics.http.exception.p95";
    try {
        sendValue(name, delegate);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    verifyZeroInteractions(delegate);
}
