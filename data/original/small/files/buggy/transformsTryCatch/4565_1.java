@java.lang.Override
public boolean supportsInput(java.lang.Object input, java.lang.String contentType) {
    try {
        for (org.n52.epos.transform.MessageTransformer<org.n52.epos.event.EposEvent> t : transformers) {
            if (t.supportsInput(input, null)) {
                return true;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
