public void unset() {
    try {
        org.slf4j.MDC.remove(getMDCKey());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
