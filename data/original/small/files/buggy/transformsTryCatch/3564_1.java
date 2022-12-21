public void unset() {
    try {
        org.slf4j.MDC.remove(ru.trylogic.spring.boot.thrift.beans.RequestIdLogger.getMDCKey());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
