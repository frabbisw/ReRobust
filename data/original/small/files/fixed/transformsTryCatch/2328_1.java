@org.junit.Test
public void shouldNotSendMetric() throws java.lang.Exception {
    java.lang.String name = "metrics.http.exception.p95";
    sendValue(name, delegate);
    try {
        verifyZeroInteractions(delegate);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
