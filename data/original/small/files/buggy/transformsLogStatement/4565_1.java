@java.lang.Override
public boolean supportsInput(java.lang.Object input, java.lang.String contentType) {
    for (org.n52.epos.transform.MessageTransformer<org.n52.epos.event.EposEvent> t : transformers) {
        if (t.supportsInput(input, null)) {
            return true;
        }
    }
    System.out.println("log");
    return false;
}
